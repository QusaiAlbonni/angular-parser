package org.generator;

import org.visitors.AngularBaseVisitor;
import org.classes.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.io.File;

import org.apache.commons.io.FileUtils;

public class AngularCodeGenerator extends AngularBaseVisitor {
    private FileWriter outputFile;
    private int indentLevel = 0;
    private int elementCounter = 0;
    private String currentComponent = "";
    private String currentElement = "";
    private Map<String, String> componentMap = new HashMap<>();
    private boolean isFirstComponent = true;
    private boolean isVisitUseState = true;
    private boolean noRepeatDot = false;
    private boolean hasMap = false;
    private boolean hasSquareBracket = false;
    private String rootComponent = "";
    private boolean onlyOne = true;
    private boolean standard = false;
    private int sizeOfObject = 0;
    private int counterForObject = 0;
    private boolean haveProps = false;

    public AngularCodeGenerator(FileWriter outputFile) {
        this.outputFile = outputFile;

        try {
            File source = new File("Result\\style.css");
            File dest = new File("Result\\generate.css");
            if (source.exists()) {
                FileUtils.copyFile(source, dest);
                System.out.println("File copied successfully.");
            }
        } catch (IOException e) {
            System.err.println("Warning: Could not copy CSS file: " + e.getMessage());
        }
    }

    private String getIndent() {
        return "  ".repeat(indentLevel);
    }

    private void generate(String code) {
        try {
            outputFile.write(getIndent() + code);
        } catch (IOException e) {
            System.out.println("error" + e.getMessage());
        }
    }

    private void generate(String code, FileWriter fw) {
        try {
            fw.write(getIndent() + code);
        } catch (IOException e) {
            System.out.println("error" + e.getMessage());
        }
    }

    private void generateLn(String code) {
        try {
            outputFile.write(getIndent() + code + "\n");
        } catch (IOException e) {
            System.out.println("error" + e.getMessage());
        }
    }

    private void generateLn(String code, FileWriter fw) {
        try {
            fw.write(getIndent() + code + "\n");
        } catch (IOException e) {
            System.out.println("error" + e.getMessage());
        }
    }

    private void increaseIndent() {
        indentLevel++;
    }

    private void decreaseIndent() {
        indentLevel--;
        if (indentLevel < 0) indentLevel = 0;
    }

    public Void visitProgram(Program program) {
        generateLn("<!DOCTYPE html>");
        generateLn("<html>");
        generateLn("<head>");
        generateLn("  <title>Angular App</title>");
        generateLn("  <link rel=\"stylesheet\" href=\"generate.css\"/>");
        generateLn("</head>");
        generateLn("<body>");
        generateLn("  <div id=\"app\"></div>");
        generateLn("  <script>");

        increaseIndent();

        if (program.getStatements() != null) {
            visitSourceElements(program.getStatements(), "\t\t");
        }

        if (!currentComponent.isEmpty()) {
            generateLn(currentComponent + "();");
        }

        decreaseIndent();
        generateLn("  </script>");
        generateLn("</body>");
        generateLn("</html>");

        return null;
    }

    private void visitSourceElements(List<Statement> statements, String indent) {
        for (int i = 0; i < statements.size(); i++) {
            Statement stmt = statements.get(i);

            if (stmt instanceof VariableDeclaration && isVisitUseState) {
                visitVariableStatement((VariableDeclaration) stmt, indent);
            }
            if (stmt instanceof ExpressionStatement) {
                visitExpressionStatement((ExpressionStatement) stmt, indent);
            }
            if (stmt instanceof FunctionDeclaration) {
                visitFunctionDeclaration((FunctionDeclaration) stmt, indent);
            }
            if (stmt instanceof ImportStatement) {
                visitImportStatement((ImportStatement) stmt, indent);
            }
            if (stmt instanceof ReturnStatement) {
                visitReturnStatement((ReturnStatement) stmt, indent);
            }
        }
    }

    // ComponentDeclaration - Angular components
    public Void visitComponentDeclaration(ComponentDeclaration component, String s) {
        String componentName = component.getId();
        currentComponent = componentName;

        generateLn("function " + componentName + "() {");
        increaseIndent();

        generateLn("const componentElement = document.createElement('div');");
        generateLn("componentElement.className = '" + componentName.toLowerCase() + "';");

        for (PropertyDeclaration property : component.getPropertyDeclarations()) {
            visitPropertyDeclaration(property, s);
        }

        if (isFirstComponent) {
            generateLn("const app = document.getElementById('app');");
            generateLn("app.appendChild(componentElement);");
            isFirstComponent = false;
        }

        generateLn("return componentElement;");
        decreaseIndent();
        generateLn("}");
        generateLn("");

        return null;
    }

    // FunctionDeclaration - Function definitions
    public Void visitFunctionDeclaration(FunctionDeclaration function, String s) {
        if (function.getBody().getStatements() != null) {
            List<Statement> statements = function.getBody().getStatements();
            for (int i = 0; i < statements.size(); i++) {
                if (statements.get(i).toString() != null) {
                    visitVariableStatement((VariableDeclaration) statements.get(i), s);
                    isVisitUseState = false;
                }
            }
        }

        generate("function ");
        if (function.getId() != null) {
            visitIdentifier(function.getId(), s, "", "", false);
            if (isFirstComponent) {
                rootComponent = function.getId();
            }
        }

        generate(" (");
        if (function.getParameters() != null) {
            visitFormalParameterList(function.getParameters(), s);
            haveProps = true;
        }
        generate(")");
        generateLn("{");

        if (isFirstComponent) {
            generateLn("const app = document.getElementById('app');");
            generateLn("app.innerHTML = '';");
        }

        if (function.getBody() != null) {
            visitFunctionBody(function.getBody(), s);
        }

        if (!isFirstComponent) {
            generateLn("return " + currentElement);
        }
        generateLn("}");

        if (isFirstComponent) {
            for (Map.Entry<String, String> entry : componentMap.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                generateLn("function " + key + " (parameter) {");
                generateLn(value + " = parameter;");
                generateLn(rootComponent + "();");
                generateLn("}");
            }

            if (onlyOne) {
                generateLn(rootComponent + "();");
                onlyOne = false;
            }
        }
        isFirstComponent = false;
        return null;
    }

    // HtmlElement - HTML elements
    public Void visitHtmlElement(HtmlElement htmlElement, String s) {
        String elementName = "element" + (elementCounter++);
        currentElement = elementName;

        generateLn("const " + elementName + " = document.createElement('div');");

        for (HtmlAttribute attribute : htmlElement.getHtmlAttributes()) {
            visitHtmlAttribute(attribute, s);
        }

        for (AngularAttribute angularAttribute : htmlElement.getAngularAttributes()) {
            visitAngularAttribute(angularAttribute, s);
        }

        if (htmlElement.getHtmlContent() != null) {
            visitHtmlContent(htmlElement.getHtmlContent(), s);
        }

        return null;
    }

    // HtmlAttribute - HTML attributes
    public Void visitHtmlAttribute(HtmlAttribute attribute, String indent) {
        if (attribute.getValue() != null) {
            generate(currentElement + ".setAttribute('" + attribute.getValue() + "', '");
            generate(attribute.getValue()); // Directly output the string value
            generateLn("');");
        }
        return null;
    }

    // AngularAttribute - Angular-specific attributes
    public Void visitAngularAttribute(AngularAttribute attribute, String s) {
        if (attribute.getBindingAttribute() != null) {
            visitBindingAttribute(attribute.getBindingAttribute(), s);
        } else if (attribute.getEventBindingAttribute() != null) {
            visitEventBindingAttribute(attribute.getEventBindingAttribute(), s);
        } else if (attribute.getForAttribute() != null) {
            visitForAttribute(attribute.getForAttribute(), s);
        } else if (attribute.getIfAttribute() != null) {
            visitIfAttribute(attribute.getIfAttribute(), s);
        }
        return null;
    }

    public Void visitForAttribute(ForAttribute attribute, String s) {
        // implementation
        // TODO: Implement *ngFor attribute handling
        // Example: *ngFor="let item of items"
        return null;
    }

    public Void visitIfAttribute(IfAttribute attribute, String s) {
        // TODO: Implement *ngIf attribute handling
        // Example: *ngIf="condition"
        return null;
    }

    // BindingAttribute - Property binding
    public Void visitBindingAttribute(BindingAttribute attribute, String s) {
        generate(currentElement + "." + attribute.getAttributeValue() + " = ");
        if (attribute.getAttributeValue() != null) {
            // Create a PrimaryExpression from the string value
            PrimaryExpression primaryExpr = new PrimaryExpression();
            primaryExpr.setId(attribute.getAttributeValue()); // Or use appropriate setter
            visitExpression(primaryExpr, s);
        }
        generateLn(";");
        return null;
    }

    // EventBindingAttribute - Event binding
    public Void visitEventBindingAttribute(EventBindingAttribute attribute, String s) {
        generate(currentElement + ".addEventListener('" + attribute.getAttributeValue().substring(2) + "', ");
        if (attribute.getAttributeValue() != null) {
            PrimaryExpression primaryExpr = new PrimaryExpression();
            primaryExpr.setId(attribute.getAttributeValue()); // Or use appropriate setter
            visitExpression(primaryExpr, s);
        }
        generateLn(");");
        return null;
    }

    // HtmlContent - HTML content
    public Void visitHtmlContent(HtmlContent content, String s) {
        for (Object item : content.getHtmlElement()) {
            if (item instanceof HtmlCharData) {
                visitHtmlCharData((HtmlCharData) item, s);
            } else if (item instanceof HtmlElement) {
                visitHtmlElement((HtmlElement) item, s);
            } else if (item instanceof AngularCharData) {
                visitAngularCharData((AngularCharData) item, s);
            }
        }
        return null;
    }

    // HtmlCharData - HTML text content
    public Void visitHtmlCharData(HtmlCharData charData, String s) {
        generateLn(currentElement + ".textContent += '" + charData.getAngularCharData() + "';");
        return null;
    }

    // AngularCharData - Angular interpolation
    public Void visitAngularCharData(AngularCharData charData, String s) {
        generate(currentElement + ".textContent += ");
        visitExpression(charData.getExpressionStatement().getExpression(), s);
        generateLn(";");
        return null;
    }

    // VariableStatement - Variable declarations
    public Void visitVariableStatement(VariableDeclaration variableStatement, String s) {
        visitVariableDeclaration(variableStatement, s);
        return null;
    }

    // VariableDeclaration - Variable declaration
    public Void visitVariableDeclaration(VariableDeclaration declaration, String s) {
        // Use the type (let/const) and output the variable name
        generate(declaration.getType() + " " + declaration.getId());

        // Check if there's an initializer expression
        if (declaration.getExpression() != null) {
            generate(" = ");
            visitExpression(declaration.getExpression(), s);
        }

        generateLn(";");
        return null;
    }

    // ExpressionStatement - Expression statements
    public Void visitExpressionStatement(ExpressionStatement expressionStatement, String s) {
        visitExpression(expressionStatement.getExpression(), s);
        generateLn(";");
        return null;
    }

    // Expression - Expressions
    public Void visitExpression(Expression expression, String s) {
        if (expression instanceof AssignmentExpression) {
            visitAssignmentExpression((AssignmentExpression) expression, s);
        } else if (expression instanceof BinaryExpression) {
            visitBinaryExpression((BinaryExpression) expression, s);
        } else if (expression instanceof PrimaryExpression) {
            visitPrimaryExpression((PrimaryExpression) expression, s);
        } else if (expression instanceof FunctionCall) {
            visitFunctionCall((FunctionCall) expression, s);
        }
        return null;
    }

    // AssignmentExpression - Assignment expressions
    public Void visitAssignmentExpression(AssignmentExpression assignment, String s) {
        // Output the left side (identifier)
        if (assignment.getId() != null) {
            generate(assignment.getId());
        }

        // Generate assignment operator (assuming it's always "=")
        generate(" = ");

        // Visit the right side (expression)
        if (assignment.getExpression() != null) {
            visitExpression(assignment.getExpression(), s);
        }

        return null;
    }

    // BinaryExpression - Binary expressions
    public Void visitBinaryExpression(BinaryExpression binary, String s) {
        visitExpression(binary.getLeft(), s);
        generate(" " + binary.getOperator() + " ");
        visitExpression(binary.getRight(), s);
        return null;
    }

    public Void visitDotNotation(DotNotation dotNotation, String s) {
        // Visit the left expression
        if (dotNotation.getLeft() != null) {
            visitExpression(dotNotation.getLeft(), s);
        }

        generate(".");

        // Handle the right expression based on its type
        if (dotNotation.getRight() != null) {
            if (dotNotation.getRight() instanceof PrimaryExpression) {
                PrimaryExpression primary = (PrimaryExpression) dotNotation.getRight();
                if (primary.getId() != null) {
                    generate(primary.getId()); // Directly output identifier name
                } else {
                    visitExpression(dotNotation.getRight(), s); // Fallback
                }
            } else {
                visitExpression(dotNotation.getRight(), s); // Handle other expression types
            }
        }

        return null;
    }

    // PrimaryExpression - Primary expressions
    public Void visitPrimaryExpression(PrimaryExpression primary, String s) {
        if (primary.getId() != null) {
            visitIdentifier(primary.getId(), s, "", "", false);
        } else if (primary.getStringValue() != null) {
            generate(primary.getStringValue());
        } else if (primary.getNumberValue() != null) {
            generate(primary.getNumberValue());
        } else if (primary.getBooleanValue() != null) {
            generate(primary.getBooleanValue());
        } else if (primary.getNullValue() != null) {
            generate(primary.getNullValue().toString());
        } else if (primary.getUndefinedValue() != null) {
            generate(primary.getUndefinedValue().toString());
        } else if (primary.getThisValue() != null) {
            generate(primary.getThisValue());
        } else if (primary.getFunctionCall() != null) {
            visitFunctionCall(primary.getFunctionCall(), s);
        } else if (primary.getDotNotation() != null) {
            visitDotNotation(primary.getDotNotation(), s);
        } else if (primary.getObjectInstantiation() != null) {
            visitObjectInstantiation(primary.getObjectInstantiation(), s);
        } else if (primary.getArrayDeclaration() != null) {
            visitArrayDeclaration(primary.getArrayDeclaration(), s);
        } else if (primary.getObjectDeclaration() != null) {
            visitObjectDeclaration(primary.getObjectDeclaration(), s);
        }
        return null;
    }

    // FunctionCall - Function calls
    public Void visitFunctionCall(FunctionCall functionCall, String s) {
        visitExpression(functionCall.getExpression(), s); // Changed from getFunction() to getExpression()
        generate("(");
        if (functionCall.getArgumentList() != null) {
            visitArgumentList(functionCall.getArgumentList(), s);
        }
        generate(")");
        return null;
    }

    // ArgumentList - Function argument lists
    public Void visitArgumentList(ArgumentList arguments, String s) {
        List<Expression> args = arguments.getExpressionList();
        for (int i = 0; i < args.size(); i++) {
            visitExpression(args.get(i), s);
            if (i < args.size() - 1) {
                generate(", ");
            }
        }
        return null;
    }

    // ArrayDeclaration - Array declarations
    public Void visitArrayDeclaration(ArrayDeclaration array, String s) {
        generate("[");
        List<Expression> elements = array.getArgumentList().getExpressionList();
        for (int i = 0; i < elements.size(); i++) {
            visitExpression(elements.get(i), s);
            if (i < elements.size() - 1) {
                generate(", ");
            }
        }
        generate("]");
        return null;
    }

    // ObjectDeclaration - Object declarations
    public Void visitObjectDeclaration(ObjectDeclaration object, String s) {
        generate("{");
        List<ObjectMember> members = object.getObjectBody().getObjectMemberList();
        for (int i = 0; i < members.size(); i++) {
            visitObjectMember(members.get(i), s);
            if (i < members.size() - 1) {
                generate(", ");
            }
        }
        generate("}");
        return null;
    }

    // ObjectMember - Object members
    public Void visitObjectMember(ObjectMember member, String s) {
        generate(member.getID() + ": ");
        visitExpression(member.getExpression(), s);
        return null;
    }

    // ObjectInstantiation - Object instantiation
    public Void visitObjectInstantiation(ObjectInstantiation instantiation, String s) {
        generate("new ");

        // Output the constructor name (id)
        if (instantiation.getId() != null) {
            generate(instantiation.getId());
        }

        generate("(");

        // Visit the argument list
        if (instantiation.getArgumentList() != null) {
            visitArgumentList(instantiation.getArgumentList(), s);
        }

        generate(")");
        return null;
    }

    // ImportStatement - Import statements
    public Void visitImportStatement(ImportStatement importStatement, String s) {
        // Skip imports in vanilla JS conversion
        return null;
    }

    // ReturnStatement - Return statements
    public Void visitReturnStatement(ReturnStatement returnStatement, String s) {
        generate("return ");
        if (returnStatement.getExpression() != null) {
            visitExpression(returnStatement.getExpression(), s);
        }
        generateLn(";");
        return null;
    }

    // PropertyDeclaration - Property declarations
    public Void visitPropertyDeclaration(PropertyDeclaration property, String s) {
        generate("let " + property.getId());
        if (property.getExpression() != null) {
            generate(" = ");
            visitExpression(property.getExpression(), s);
        }
        generateLn(";");
        return null;
    }

    // Identifier - Identifiers
    public Void visitIdentifier(String identifier, String s, String prefix, String suffix, boolean isDotNotation) {
        generate(prefix + identifier + suffix);
        return null;
    }

    // FormalParameterList - Formal parameter lists
    public Void visitFormalParameterList(ParameterList parameters, String s) {
        List<Parameter> params = parameters.getParameters();
        for (int i = 0; i < params.size(); i++) {
            visitParameter(params.get(i), s);
            if (i < params.size() - 1) {
                generate(", ");
            }
        }
        return null;
    }

    // Parameter - Function parameters
    public Void visitParameter(Parameter parameter, String s) {
        generate(parameter.getName());
        return null;
    }

    // FunctionBody - Function bodies
    public Void visitFunctionBody(BlockStatement body, String s) {
        if (body.getStatements() != null) {
            visitSourceElements(body.getStatements(), s);
        }
        return null;
    }

    // IfStatement - If statements
    public Void visitIfStatement(IfStatement ifStatement, String s) {
        generate("if (");
        visitExpression(ifStatement.getCondition(), s);
        generateLn(") {");
        increaseIndent();
        visitStatement(ifStatement.getThenStatement(), s);
        decreaseIndent();
        generateLn("}");

        if (ifStatement.getElseStatement() != null) {
            generateLn("else {");
            increaseIndent();
            visitStatement(ifStatement.getElseStatement(), s);
            decreaseIndent();
            generateLn("}");
        }
        return null;
    }

    // ForStatement - For loops
    public Void visitForStatement(ForStatement forStatement, String s) {
        generate("for (");
        if (forStatement.getBody() != null) {
            visitExpression(forStatement.getVariableDeclarationAsExpression(), s);
        }
        generate("; ");
        if (forStatement.getCondition() != null) {
            visitExpression(forStatement.getCondition(), s);
        }
        generate("; ");
        if (forStatement.getIncrement() != null) {
            visitExpression(forStatement.getIncrement(), s);
        }
        generateLn(") {");
        increaseIndent();
        visitStatement(forStatement.getBody(), s);
        decreaseIndent();
        generateLn("}");
        return null;
    }

    // WhileStatement - While loops
    public Void visitWhileStatement(WhileStatement whileStatement, String s) {
        generate("while (");
        visitExpression(whileStatement.getCondition(), s);
        generateLn(") {");
        increaseIndent();
        visitStatement(whileStatement.getBody(), s);
        decreaseIndent();
        generateLn("}");
        return null;
    }

    // DoWhileStatement - Do-while loops
    public Void visitDoWhileStatement(DoWhileStatement doWhileStatement, String s) {
        generateLn("do {");
        increaseIndent();
        visitStatement(doWhileStatement.getBody(), s);
        decreaseIndent();
        generate("} while (");
        visitExpression(doWhileStatement.getCondition(), s);
        generateLn(");");
        return null;
    }

    // SwitchStatement - Switch statements
    public Void visitSwitchStatement(SwitchStatement switchStatement, String s) {
        generate("switch (");
        visitExpression(switchStatement.getExpression(), s);
        generateLn(") {");
        increaseIndent();

        for (CaseStatement caseStatement : switchStatement.getCaseStatements()) {
            visitCaseStatement(caseStatement, s);
        }

        decreaseIndent();
        generateLn("}");
        return null;
    }

    // CaseStatement - Case statements
    public Void visitCaseStatement(CaseStatement caseStatement, String s) {
        if (caseStatement.getCaseExpression() != null) {
            generate("case ");
            visitExpression(caseStatement.getCaseExpression(), s);
            generateLn(":");
        } else {
            generateLn("default:");
        }

        increaseIndent();
        for (Statement statement : caseStatement.getStatements()) {
            visitStatement(statement, s);
        }
        decreaseIndent();
        return null;
    }

    // TryCatchStatement - Try-catch statements
    public Void visitTryCatchStatement(TryCatchStatement tryCatchStatement, String s) {
        generateLn("try {");
        increaseIndent();
        visitBlockStatement(tryCatchStatement.getTryBlock(), s);
        decreaseIndent();

        generateLn("} catch (" + tryCatchStatement.getCatchVariable() + ") {");
        increaseIndent();
        visitBlockStatement(tryCatchStatement.getCatchBlock(), s);
        decreaseIndent();
        generateLn("}");
        return null;
    }

    // BlockStatement - Block statements
    public Void visitBlockStatement(BlockStatement block, String s) {
        if (block.getStatements() != null) {
            visitSourceElements(block.getStatements(), s);
        }
        return null;
    }

    // Statement - Generic statement handling
    public Void visitStatement(Statement statement, String s) {
        if (statement instanceof VariableDeclaration) {
            visitVariableStatement((VariableDeclaration) statement, s);
        } else if (statement instanceof ExpressionStatement) {
            visitExpressionStatement((ExpressionStatement) statement, s);
        } else if (statement instanceof IfStatement) {
            visitIfStatement((IfStatement) statement, s);
        } else if (statement instanceof ForStatement) {
            visitForStatement((ForStatement) statement, s);
        } else if (statement instanceof WhileStatement) {
            visitWhileStatement((WhileStatement) statement, s);
        } else if (statement instanceof DoWhileStatement) {
            visitDoWhileStatement((DoWhileStatement) statement, s);
        } else if (statement instanceof SwitchStatement) {
            visitSwitchStatement((SwitchStatement) statement, s);
        } else if (statement instanceof BlockStatement) {
            visitBlockStatement((BlockStatement) statement, s);
        } else if (statement instanceof ReturnStatement) {
            visitReturnStatement((ReturnStatement) statement, s);
        }
        return null;
    }

//    public static void main(String[] args) {
//        try {
//            FileWriter fw = new FileWriter("Result\\GeneratedCode.html");
//            AngularCodeGenerator generator = new AngularCodeGenerator(fw);
//
//            // Here you would parse the Angular code and call visitProgram
//            // Program program = parseAngularCode(inputCode);
//            // generator.visitProgram(program);
//
//            fw.flush();
//            fw.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}

