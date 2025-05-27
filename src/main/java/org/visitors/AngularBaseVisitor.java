//package org.visitors;
//
//import org.antlr.v4.runtime.tree.ErrorNode;
//import org.antlr.v4.runtime.tree.ParseTree;
//import org.antlr.v4.runtime.tree.RuleNode;
//import org.antlr.v4.runtime.tree.TerminalNode;
//import org.classes.*;
//import org.antlr.AngularParser;
//import org.antlr.AngularParserBaseVisitor;
//import org.antlr.AngularParserVisitor;
//import org.main.Main;
//import org.sympol_table.html_scope;
//import org.sympol_table.html_sympol;
//import org.sympol_table.scope;
//import org.sympol_table.sympol;
//
//import java.util.*;
//
//public class AngularBaseVisitor extends AngularParserBaseVisitor {
//    @Override
//    public Object visitProgram(AngularParser.ProgramContext ctx) {
//        scope.create_scope("Program");
//        Program program=new Program();
//        for (int i = 0; i <ctx.statement().size(); i++) {
//            if(ctx.statement(i)!=null){
//                program.addChild(visitStatement(ctx.statement(i)));
//            }
//        }
//        Main.htmlSympolTable.print();
//        System.out.println("\n\n\n______________________________________________________________________________________________\n\n\n\n");
//        Main.sympolTable.print();
//        scope.remove_scope();
//        return  program;
//    }
//
//    @Override
//    public Statement visitStatement(AngularParser.StatementContext ctx) {
//        if(ctx.variableDeclaration()!=null){
//            return  visitVariableDeclaration(ctx.variableDeclaration());
//        }
//        else if(ctx.functionDeclaration()!=null){
//            return visitFunctionDeclaration(ctx.functionDeclaration());
//        }   else if(ctx.classDeclaration()!=null){
//            return visitClassDeclaration(ctx.classDeclaration());
//        }   else if(ctx.enumDeclaration()!=null){
//            return visitEnumDeclaration(ctx.enumDeclaration());
//        }   else if(ctx.componentDeclaration()!=null){
//            return visitComponentDeclaration(ctx.componentDeclaration());
//        } else if (ctx.serviceDeclaration()!=null) {
//            return visitServiceDeclaration(ctx.serviceDeclaration());
//        }
//        else if(ctx.importStatement()!=null){
//            return visitImportStatement(ctx.importStatement());
//        }else if(ctx.exportStatement()!=null){
//            return visitExportStatement(ctx.exportStatement());
//        }
//        else if(ctx.expressionStatement()!=null){
//            return visitExpressionStatement(ctx.expressionStatement());
//        }else if(ctx.blockStatement()!=null){
//            return visitBlockStatement(ctx.blockStatement());
//        }else if(ctx.ifStatement()!=null){
//            return visitIfStatement(ctx.ifStatement());
//        }else if(ctx.forStatement()!=null){
//            return visitForStatement(ctx.forStatement());
//        }else if(ctx.whileStatement()!=null){
//            return visitWhileStatement(ctx.whileStatement());
//        }
//        else if(ctx.doWhileStatement()!=null){
//            return visitDoWhileStatement(ctx.doWhileStatement());
//        }else if(ctx.switchStatement()!=null){
//            return visitSwitchStatement(ctx.switchStatement());
//        }else if(ctx.tryCatchStatement()!=null){
//            return visitTryCatchStatement(ctx.tryCatchStatement());
//        }else if(ctx.returnStatement()!=null){
//            return visitReturnStatement(ctx.returnStatement());
//        }else if(ctx.continueStatement()!=null){
//            return visitContinueStatement(ctx.continueStatement());
//        }else if(ctx.throwStatement()!=null){
//            return visitThrowStatement(ctx.throwStatement());
//        }else if(ctx.breakStatement()!=null){
//            return visitBreakStatement(ctx.breakStatement());
//        }
//        else if (ctx.componentDeclaration()!=null){
//            return  visitComponentDeclaration(ctx.componentDeclaration());
//        }
//        else if (ctx.serviceDeclaration()!=null){
//            return  visitServiceDeclaration(ctx.serviceDeclaration());
//        }
//        else if(ctx.decoratorApplication()!=null){
//            return visitDecoratorApplication(ctx.decoratorApplication());
//        }
//
//        else{
//            System.out.println("cannot handle this statement in visitStatement function in AngularBaseVisitor");
//            return  null;
//        }
//    }
//
//    @Override
//    public VariableDeclaration visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx) {
//        VariableDeclaration variableDeclaration=new VariableDeclaration();
//        variableDeclaration.setId(ctx.ID().getText());
//        if(ctx.CONST()!=null){
//            variableDeclaration.setType(ctx.CONST().getText());
//        }else{
//            variableDeclaration.setType(ctx.LET().getText());
//        }
//        if(ctx.expression()!=null){
//            variableDeclaration.setExpression(visitExpression(ctx.expression()));
//
//        }
//        return  variableDeclaration;
//    }
//
//    @Override
//    public FunctionDeclaration visitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx) {
//        FunctionDeclaration functionDeclaration=new FunctionDeclaration();
//        functionDeclaration.setId(ctx.ID().getText());
//        if(ctx.blockStatement()!=null){
//            functionDeclaration.setBody(visitBlockStatement(ctx.blockStatement()));
//        }
//        if(ctx.parameterList()!=null){
//            functionDeclaration.setParameters(visitParameterList(ctx.parameterList()));
//        }
//        return  functionDeclaration;
//    }
//
//    @Override
//    public ParameterList visitParameterList(AngularParser.ParameterListContext ctx) {
//        ParameterList parameterList=new ParameterList();
//        if(ctx.parameter()!=null){
//            for (int i = 0; i < ctx.parameter().size(); i++) {
//                parameterList.getParameters().add(visitParameter(ctx.parameter(i)));
//            }
//        }
//        return  parameterList;
//    }
//
//    @Override
//    public Parameter visitParameter(AngularParser.ParameterContext ctx) {
//        Parameter parameter=new Parameter();
//        if (ctx.expressionStatement() != null){
//            parameter.setExpressionStatement(visitExpressionStatement(ctx.expressionStatement()));
//            return parameter;
//        }
//        parameter.setName(ctx.ID().getText());
//        if(ctx.typeAnnotation()!=null){
//            parameter.setType(visitTypeAnnotation(ctx.typeAnnotation()));
//        }
//        return  parameter;
//    }
//
//    @Override
//    public TypeAnnotation visitTypeAnnotation(AngularParser.TypeAnnotationContext ctx) {
//        TypeAnnotation typeAnnotation=new TypeAnnotation();
//        if(ctx.ANY()!=null){
//            typeAnnotation.setType(ctx.ANY().getText());
//        }else if(ctx.NUMBER_TYPE()!=null){
//            typeAnnotation.setType(ctx.NUMBER_TYPE().getText());
//        }else if(ctx.STRING_TYPE()!=null){
//            typeAnnotation.setType(ctx.STRING_TYPE().getText());
//        }else if(ctx.BOOLEAN_TYPE()!=null){
//            typeAnnotation.setType(ctx.BOOLEAN_TYPE().getText());
//        }else if(ctx.VOID_TYPE()!=null){
//            typeAnnotation.setType(ctx.VOID_TYPE().getText());
//        }else if(ctx.UNKNOWN()!=null){
//            typeAnnotation.setType(ctx.UNKNOWN().getText());
//        }else if(ctx.NEVER()!=null){
//            typeAnnotation.setType(ctx.NEVER().getText());
//        }else if(ctx.ID()!=null){
//            typeAnnotation.setType(ctx.ID().getText());
//        }
//        else{
//            System.out.println("error when handle type annotation in visitTypeAnnotation in AngularBaseVisitor");
//            return null;
//        }
//        return typeAnnotation;
//    }
//
//    @Override
//    public ClassDeclaration visitClassDeclaration(AngularParser.ClassDeclarationContext ctx) {
//        ClassDeclaration classDeclaration=new ClassDeclaration();
//        classDeclaration.setId(ctx.ID(0).getText());
//        scope.create_scope(ctx.ID(0).getText());
//        if(ctx.EXTENDS()!=null){
//            classDeclaration.setExtendsClass(ctx.ID(1).getText());
//        }
//        else{
//            classDeclaration.setExtendsClass(null);
//        }
//        if(ctx.IMPLEMENTS()!=null){
//            for (int i = 2; i < ctx.ID().size(); i++) {
//                classDeclaration.getImplementsInterfaces().add(ctx.ID().get(i).getText());
//            }
//        }
//        classDeclaration.setClassMembers(visitClassBody(ctx.classBody()));
//        scope.remove_scope();
//        return  classDeclaration;
//    }
//
//
//    @Override
//    public ClassBody visitClassBody(AngularParser.ClassBodyContext ctx) {
//        ClassBody classBody=new ClassBody();
//        if(ctx.classMember()!=null){
//            for (int i = 0; i <ctx.classMember().size() ; i++) {
//                classBody.getMembers().add(visitClassMember(ctx.classMember(i)));
//            }
//        }
//        return  classBody;
//    }
//
//    @Override
//    public ClassMember visitClassMember(AngularParser.ClassMemberContext ctx) {
//        ClassMember classMember=new ClassMember();
//        if(ctx.PRIVATE()!=null){
//            classMember.setVisibility(ctx.PRIVATE().getText());
//        }
//        else if(ctx.PROTECTED()!=null){
//            classMember.setVisibility(ctx.PROTECTED().getText());
//        }
//        else if(ctx.PUBLIC()!=null){
//            classMember.setVisibility(ctx.PUBLIC().getText());
//        }
//        classMember.setStatic(ctx.STATIC()!=null);
//        if(ctx.ID()!=null){
//            classMember.setName(ctx.ID().getText());
//        }
//        if(ctx.constructorDeclaration()!=null){
//            classMember.setConstructorDeclaration(visitConstructorDeclaration(ctx.constructorDeclaration()));
//            classMember.setConstructor(true);
//        }
//        if(ctx.methodDeclaration()!=null){
//            classMember.setMethod(visitMethodDeclaration(ctx.methodDeclaration()));
//            classMember.setIsMethod(true);
//        }
//        if (ctx.variableDeclaration() != null) {
//            classMember.setProperty(true);
//            classMember.setVariable(visitVariableDeclaration(ctx.variableDeclaration()));
//        }
//        if(ctx.enumDeclaration()!=null){
//            classMember.setEnumDeclaration(visitEnumDeclaration(ctx.enumDeclaration()));
//            classMember.setIsEnum(true);
//        }
//        if(ctx.typeAnnotation()!=null){
//            classMember.setTypeAnnotation(visitTypeAnnotation(ctx.typeAnnotation()));
//        }
//        if (ctx.expressionStatement()!=null){
//            classMember.setExpressionStatement(visitExpressionStatement(ctx.expressionStatement()));
//            classMember.setIsExpression(true);
//        }
//        return classMember;
//
//    }
//    //todo
//    @Override
//    public ObjectBody visitObjectBody(AngularParser.ObjectBodyContext ctx) {
//        ObjectBody objectBody=new ObjectBody();
//        if(ctx.objectMember()!=null){
//            for (int i = 0; i < ctx.objectMember().size(); i++) {
//                objectBody.getObjectMemberList().add(visitObjectMember(ctx.objectMember(i)));
//            }
//        }
//        return objectBody;
//    }
//    //todo
//    @Override
//    public ObjectMember visitObjectMember(AngularParser.ObjectMemberContext ctx) {
//        ObjectMember objectMember=new ObjectMember();
//        if(ctx.expression()!=null){
//            objectMember.setExpression(visitExpression(ctx.expression()));
//        }
//        sympol sympol ;
//        boolean add = true ;
//        if(Main.sympolTable.getSympols().get(Main.sympolTable.getSympols().size()-1).getName()==null){
//            sympol =Main.sympolTable.getSympols().get(Main.sympolTable.getSympols().size()-1);
//            add = false ;
//        }else{
//             sympol = new sympol();
//        }
//        if(ctx.ID()!=null){
//            objectMember.setID(ctx.ID().getText());
//            sympol.setName(ctx.ID().getText());
//        }
//        if(ctx.template()!=null){
//            objectMember.setTemplate(visitTemplate(ctx.template()));
//        }
//       if(add) {
//           sympol.setScope(Main.sympolTable.getStack().peek().getTitle());
//           Main.sympolTable.getSympols().add(sympol);}
//        return objectMember;
//    }
//
//    @Override
//    public Template visitTemplate(AngularParser.TemplateContext ctx) {
//        Template template=new Template();
//        if(ctx.htmlElements()!=null){
//            for (int i = 0; i < ctx.htmlElements().size(); i++) {
//                template.getHtmlElements().add(visitHtmlElements(ctx.htmlElements(i)));
//            }
//        }
//        return  template;
//    }
//
//    @Override
//    public HtmlElement visitHtmlElements(AngularParser.HtmlElementsContext ctx) {
//        if(ctx.htmlElement()!=null) {
//            return visitHtmlElement(ctx.htmlElement());
//        }
//        System.out.println("error in visitHtmlElements visitor function ");
//        return null;
//    }
//    @Override
//    public HtmlElement visitHtmlElement(AngularParser.HtmlElementContext ctx) {
//        HtmlElement htmlElement=new HtmlElement();
//        html_sympol hsympol ;
//        boolean add = true ;
//        html_scope.create_scope();
//        scope.create_scope("["+Main.htmlSympolTable.getStack().peek().getId()+"]"+ctx.TAG_NAME().toString());
//        if(ctx.htmlContent()!=null){
//            htmlElement.setHtmlContent(visitHtmlContent(ctx.htmlContent()));
//        }
//        if(!Main.htmlSympolTable.getSympols().isEmpty() && Main.htmlSympolTable.getSympols().get(Main.htmlSympolTable.getSympols().size()-1).getTag()==null){
//            hsympol = Main.htmlSympolTable.getSympols().get(Main.htmlSympolTable.getSympols().size()-1);
//            add = false ;
//        }else{
//            hsympol = new html_sympol();
//        }
//        hsympol.setTag(ctx.TAG_NAME().toString());
//        html_scope hscope = Main.htmlSympolTable.getStack().peek() ;
//        hsympol.setLevel(hscope.getId());
//        if(ctx.htmlAttribute()!=null){
//            String att ="" ;
//            for (int i = 0; i <ctx.htmlAttribute().size() ; i++) {
//                htmlElement.getHtmlAttributes().add(visitHtmlAttribute(ctx.htmlAttribute(i)));
//                att += ctx.htmlAttribute(i).TAG_NAME().getText()+ ctx.htmlAttribute(i).TAG_EQUALS().getText()+ctx.htmlAttribute(i).ATTVALUE_VALUE().getText() ;
//            }
//            if(att.isEmpty()) att=null;
//            hsympol.setAttributes(att);
//        }
//
//        if(ctx.angularAttribute()!=null){
//            String att ="";
//            for (int i = 0; i <ctx.angularAttribute().size() ; i++) {
//                htmlElement.getAngularAttributes().add(visitAngularAttribute(ctx.angularAttribute(i)));
//                if(ctx.angularAttribute(i).bindingAttribute()!= null){
//                    att+=ctx.angularAttribute(i).bindingAttribute().getText();
//                }
//                if(ctx.angularAttribute(i).eventBindingAttribute()!= null){
//                    att+=ctx.angularAttribute(i).eventBindingAttribute().getText();
//                }
//                if(ctx.angularAttribute(i).forAttribute()!= null){
//                    att+=ctx.angularAttribute(i).forAttribute().getText();
//                }
//                if(ctx.angularAttribute(i).ifAttribute()!=null){
//                    att+=ctx.angularAttribute(i).ifAttribute().getText();
//                }
//
//            }
//            if(att.isEmpty()) att=null;
//            hsympol.setAngularAttributes(att);
//        }
//        if(add) Main.htmlSympolTable.getSympols().add(hsympol);
//        scope.remove_scope();
//        html_scope.remove_scope();
//        return htmlElement;
//    }
//
//    @Override
//    public HtmlAttribute visitHtmlAttribute(AngularParser.HtmlAttributeContext ctx) {
//        HtmlAttribute htmlAttribute=new HtmlAttribute();
//        htmlAttribute.setValue(ctx.TAG_EQUALS().getText()+" "+ctx.TAG_NAME().getText()+" "+ctx.ATTVALUE_VALUE().getText());
//        sympol sympol = new sympol();
//        sympol.setName(ctx.TAG_NAME().getText());
//        sympol.setValue(ctx.ATTVALUE_VALUE().getText());
//        sympol.setType("Html Attribute");
//        sympol.setScope(Main.sympolTable.getStack().peek().getTitle());
//        Main.sympolTable.getSympols().add(sympol);
//        return htmlAttribute;
//    }
//
//    @Override
//    public AngularAttribute visitAngularAttribute(AngularParser.AngularAttributeContext ctx) {
//        AngularAttribute angularAttribute=new AngularAttribute();
//        if(ctx.bindingAttribute()!=null){
//            angularAttribute.setBindingAttribute(visitBindingAttribute(ctx.bindingAttribute()));
//        }
//        if(ctx.eventBindingAttribute()!=null){
//            angularAttribute.setEventBindingAttribute(visitEventBindingAttribute(ctx.eventBindingAttribute()));
//        }
//        if(ctx.forAttribute()!=null){
//            angularAttribute.setForAttribute(visitForAttribute(ctx.forAttribute()));
//        }
//        if(ctx.ifAttribute()!=null){
//            angularAttribute.setIfAttribute(visitIfAttribute(ctx.ifAttribute()));
//        }
//        return angularAttribute;
//    }
//
//    @Override
//    public BindingAttribute visitBindingAttribute(AngularParser.BindingAttributeContext ctx) {
//        BindingAttribute bindingAttribute=new BindingAttribute();
//        sympol sympol = new sympol();
//        if(ctx.TAG_NAME()!=null){
//            bindingAttribute.setTagName(ctx.TAG_NAME().getText());
//            sympol.setName(ctx.TAG_NAME().getText());
//        }
//        sympol.setType("BindingAttribute");
//        if(ctx.ATTVALUE_VALUE()!=null){
//            bindingAttribute.setAttributeValue(ctx.ATTVALUE_VALUE().getText());
//            sympol.setValue(ctx.ATTVALUE_VALUE().getText());
//        }
//        sympol.setScope(Main.sympolTable.getStack().peek().getTitle());
//        Main.sympolTable.getSympols().add(sympol);
//        return bindingAttribute;
//    }
//
//    @Override
//    public EventBindingAttribute visitEventBindingAttribute(AngularParser.EventBindingAttributeContext ctx) {
//        EventBindingAttribute eventBindingAttribute=new EventBindingAttribute();
//        sympol sympol = new sympol() ;
//        if (ctx.TAG_NAME()!=null){
//            eventBindingAttribute.setTagName(ctx.TAG_NAME().getText());
//            sympol.setName(ctx.TAG_NAME().getText());
//            sympol.setType("EventBindingAttribute");
//        }
//        if(ctx.ATTVALUE_VALUE()!=null){
//            eventBindingAttribute.setAttributeValue(ctx.ATTVALUE_VALUE().getText());
//            sympol.setValue(ctx.ATTVALUE_VALUE().getText());
//        }
//        if(ctx.ATTVALUE_VALUE()!=null){
//            sympol.setScope(Main.sympolTable.getStack().peek().getTitle());
//            Main.sympolTable.getSympols().add(sympol);
//        }
//        return eventBindingAttribute;
//    }
//
//    @Override
//    public ForAttribute visitForAttribute(AngularParser.ForAttributeContext ctx) {
//        scope.create_scope("ngfor");
//        ForAttribute forAttribute=new ForAttribute();
//        sympol sympol = new sympol();
//        sympol.setName(ctx.ANG_FOR().getText());
//        sympol.setType("AngularAttribute");
//        if(ctx.ATTVALUE_VALUE()!=null){
//            forAttribute.setAttributeValue(ctx.ATTVALUE_VALUE().getText());
//            sympol.setValue(ctx.ATTVALUE_VALUE().getText());
//        }
//        sympol.setScope(Main.sympolTable.getStack().peek().getTitle());
//        Main.sympolTable.getSympols().add(sympol);
//        scope.remove_scope();
//        return forAttribute;
//    }
//
//    @Override
//    public IfAttribute visitIfAttribute(AngularParser.IfAttributeContext ctx) {
//        IfAttribute ifAttribute=new IfAttribute();
//        sympol sympol = new sympol();
//        scope.create_scope(ctx.ANG_IF().getText());
//        sympol.setName(ctx.ANG_IF().getText());
//        sympol.setType("AngularAttribute");
//        if(ctx.ATTVALUE_VALUE()!=null){
//            ifAttribute.setAttributeValue(ctx.ATTVALUE_VALUE().getText());
//            sympol.setValue(ctx.ATTVALUE_VALUE().getText());
//        }
//        sympol.setScope(Main.sympolTable.getStack().peek().getTitle());
//        Main.sympolTable.getSympols().add(sympol);
//        scope.remove_scope();
//        return ifAttribute;
//    }
//
//    @Override
//    public HtmlContent visitHtmlContent(AngularParser.HtmlContentContext ctx) {
//        HtmlContent htmlContent=new HtmlContent();
//        if(ctx.htmlElement(0)!=null){
//            for (int i = 0; i < ctx.htmlElement().size(); i++) {
//            htmlContent.getHtmlElement().add(visitHtmlElement(ctx.htmlElement(i)));
//            }
//        }
//        if(ctx.htmlChardata()!=null){
//            if(ctx.htmlChardata(0)!=null){
//                htmlContent.setHtmlCharDataLeft(visitHtmlChardata(ctx.htmlChardata(0)));
//            }
//            if(ctx.htmlChardata(1)!=null){
//                htmlContent.setHtmlCharDataLeft(visitHtmlChardata(ctx.htmlChardata(1)));
//            }
//
//        }
//
//        return htmlContent;
//    }
//
//    @Override
//    public Object visitHtmlMisc(AngularParser.HtmlMiscContext ctx) {
//        return null;
//    }
//
//    @Override
//    public Object visitHtmlComment(AngularParser.HtmlCommentContext ctx) {
//        return null;
//    }
//
//    @Override
//    public HtmlCharData visitHtmlChardata(AngularParser.HtmlChardataContext ctx) {
//        HtmlCharData htmlCharData=new HtmlCharData();
//        html_sympol hsympol = new html_sympol();
//        if(ctx.angularCharData()!=null){
//            htmlCharData.setAngularCharData(visitAngularCharData(ctx.angularCharData()));
//        }
//        if(ctx.HTML_TEXT()!=null){
//            htmlCharData.setText(ctx.HTML_TEXT().getText());
//            hsympol.setInner(ctx.HTML_TEXT().getText());
//            Main.htmlSympolTable.getSympols().add(hsympol);
//        }
//        if(ctx.SEA_WS()!=null){
//            htmlCharData.setText(ctx.SEA_WS().getText().trim());
//        }
//        if(ctx.getText()!=null){
//            htmlCharData.setText(ctx.getText().substring(2,ctx.getText().length()-2));
//        }
//        return  htmlCharData;
//    }
//
//    @Override
//    public AngularCharData visitAngularCharData(AngularParser.AngularCharDataContext ctx) {
//        AngularCharData angularCharData=new AngularCharData();
//        if(ctx.expressionStatement()!=null){
//            angularCharData.setExpressionStatement(visitExpressionStatement(ctx.expressionStatement()));
//        }
//        if (ctx.HTML_TEXT()!=null){
//            for (int i = 0; i <ctx.HTML_TEXT().size() ; i++) {
//            angularCharData.getTexts().add(ctx.HTML_TEXT(i).getText());
//            }
//        }
//        if(ctx.getText()!=null){
//            angularCharData.getTexts().add(ctx.getText().substring(2,ctx.getText().length()-2));
//        }
//        if(ctx.SEA_WS()!=null){
//            for (int i = 0; i <ctx.SEA_WS().size() ; i++) {
//                angularCharData.getTexts().add(ctx.SEA_WS(i).getText().trim());
//            }
//        }
//        return angularCharData;
//    }
//
//    //*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/Dont forget to check it again/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*
//    @Override
//    public ConstructorDeclaration visitConstructorDeclaration(AngularParser.ConstructorDeclarationContext ctx) {
//        ConstructorDeclaration constructorDeclaration=new ConstructorDeclaration();
//        if(ctx.blockStatement()!=null){
//            constructorDeclaration.setBlockStatement(visitBlockStatement(ctx.blockStatement()));
//        }
//        if(ctx.parameterList()!=null){
//            constructorDeclaration.setParameterList(visitParameterList(ctx.parameterList()));
//        }
//        return  constructorDeclaration;
//    }
//
//    @Override
//    public MethodDeclaration visitMethodDeclaration(AngularParser.MethodDeclarationContext ctx) {
//        MethodDeclaration methodDeclaration=new MethodDeclaration();
//        methodDeclaration.setName(ctx.ID().getText());
//        scope.create_scope("method("+ctx.ID().getText()+")");
//        sympol sympol = new sympol();
//        sympol.setName(ctx.ID().getText());
//        sympol.setType("method");
//        if(ctx.typeAnnotation()!=null){
//            methodDeclaration.setReturnType(visitTypeAnnotation(ctx.typeAnnotation()));
//        }
//        if(ctx.blockStatement()!=null){
//            methodDeclaration.setBody(visitBlockStatement(ctx.blockStatement()));
//            sympol.setValue(ctx.blockStatement().getText());
//        }
//        if(ctx.parameterList()!=null){
//            methodDeclaration.setParameters(visitParameterList(ctx.parameterList()));
//        }
//        Main.sympolTable.getSympols().add(sympol);
//        scope.remove_scope();
//        return methodDeclaration;
//    }
//
//    @Override
//    public EnumDeclaration visitEnumDeclaration(AngularParser.EnumDeclarationContext ctx) {
//        EnumDeclaration enumDeclaration=new EnumDeclaration();
//        enumDeclaration.setId(ctx.ID().getText());
//        if(ctx.enumMember()!=null){
//            for (int i = 0; i < ctx.enumMember().size(); i++) {
//                enumDeclaration.getEnumMembers().add(visitEnumMember(ctx.enumMember(i)));
//            }
//        }
//        return enumDeclaration;
//    }
//
//    @Override
//    public EnumMember visitEnumMember(AngularParser.EnumMemberContext ctx) {
//        EnumMember enumMember=new EnumMember();
//        enumMember.setId(ctx.ID().getText());
//        if(ctx.expression()!=null){
//            enumMember.setExpression(visitExpression(ctx.expression()));
//        }
//        return enumMember;
//    }
//
//    @Override
//    public Statement visitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx) {
//        ComponentDeclaration componentDeclaration=new ComponentDeclaration();
//        if(ctx.ID()!=null){
//            componentDeclaration.setId(ctx.ID().getText());
//        }
//        if(ctx.propertyDeclaration()!=null){
//            for (int i = 0; i <ctx.propertyDeclaration().size() ; i++) {
//                componentDeclaration.getPropertyDeclarations().add(visitPropertyDeclaration(ctx.propertyDeclaration(i)));
//
//            }
//        }
//        return componentDeclaration;
//
//    }
//
//    @Override
//    public Statement visitServiceDeclaration(AngularParser.ServiceDeclarationContext ctx) {
//        ServiceDeclaration serviceDeclaration=new ServiceDeclaration();
//        if(ctx.ID()!=null){
//            serviceDeclaration.setId(ctx.ID().getText());
//        }
//        if(ctx.methodDeclaration()!=null){
//            for (int i = 0; i <ctx.methodDeclaration().size() ; i++) {
//                serviceDeclaration.getMethodDeclarations().add(visitMethodDeclaration(ctx.methodDeclaration(i)));
//            }
//        }
//        return  serviceDeclaration;
//    }
//
//    @Override
//    public PropertyDeclaration visitPropertyDeclaration(AngularParser.PropertyDeclarationContext ctx) {
//        PropertyDeclaration propertyDeclaration=new PropertyDeclaration();
//        if(ctx.ID()!=null){
//            propertyDeclaration.setId(ctx.ID().getText());
//        }
//        if(ctx.typeAnnotation()!=null){
//            propertyDeclaration.setTypeAnnotation(visitTypeAnnotation(ctx.typeAnnotation()));
//        }
//        return propertyDeclaration;
//    }
//
//    @Override
//    public Statement visitImportStatement(AngularParser.ImportStatementContext ctx) {
//        ImportStatement importStatement=new ImportStatement();
//        scope.create_scope("IMPORT");
//        sympol sympol = new sympol();
//        if (ctx.ID()!=null){
//            for (int i = 0; i < ctx.ID().size(); i++) {
//                importStatement.setSource(ctx.ID().get(i).getText());
//                sympol.setName(ctx.ID().get(i).getText());
//            }
//
//        }
//        if(ctx.STRING()!=null){
//            importStatement.getImports().add(ctx.STRING().getText());
//            sympol.setValue(ctx.STRING().getText());
//            sympol.setType("STRING");
//        }
//        scope.remove_scope();
//        Main.sympolTable.getSympols().add(sympol);
//        return importStatement;
//    }
//
//    @Override
//    public Statement visitExportStatement(AngularParser.ExportStatementContext ctx) {
//        ExportStatement exportStatement=new ExportStatement();
//        if(ctx.ID()!=null){
//            exportStatement.setId(ctx.ID().getText());
//        }
//        if(ctx.variableDeclaration()!=null){
//            exportStatement.setId(ctx.variableDeclaration().ID().getText());
//            exportStatement.setVariableDeclaration(visitVariableDeclaration(ctx.variableDeclaration()));
//            exportStatement.setExportType("variable");
//        }
//        if(ctx.classDeclaration()!=null){
//            exportStatement.setId(ctx.classDeclaration().ID(0).getText());
//            exportStatement.setClassDeclaration(visitClassDeclaration(ctx.classDeclaration()));
//            exportStatement.setExportType("class ");
//        }
//        if(ctx.functionDeclaration()!=null){
//            exportStatement.setId(ctx.functionDeclaration().ID().getText());
//            exportStatement.setFunctionDeclaration(visitFunctionDeclaration(ctx.functionDeclaration()));
//            exportStatement.setExportType("function");
//
//        }
//        return exportStatement;
//    }
//
//    @Override
//    public ExpressionStatement visitExpressionStatement(AngularParser.ExpressionStatementContext ctx) {
//        ExpressionStatement expressionStatement=new ExpressionStatement();
//        if(ctx.incrementExpression()!=null){
//            expressionStatement.setExpression(visitIncrementExpression(ctx.incrementExpression()));
//        }
//        if(ctx.expression()!=null){
//            expressionStatement.setExpression(visitExpression(ctx.expression()));
//        }
//        return  expressionStatement;
//    }
//
//    @Override
//    public Expression visitExpression(AngularParser.ExpressionContext ctx) {
//        if(ctx.conditionalExpression()!=null){
//            return visitConditionalExpression(ctx.conditionalExpression());
//        }
//        System.out.println("error when handle conditional expression in visitor");
//        return  null;
//    }
//
//    @Override
//    public Expression visitConditionalExpression(AngularParser.ConditionalExpressionContext ctx) {
//        ConditionalExpression conditionalExpression=new ConditionalExpression();
//        if(ctx.logicalExpression()!=null){
//            conditionalExpression.setCondition(visitLogicalExpression(ctx.logicalExpression()));
//        }
//        if(ctx.expression(0)!=null){
//            conditionalExpression.setTrueExpression(visitExpression(ctx.expression(0)));
//        }
//        if(ctx.expression(1)!=null){
//            conditionalExpression.setFalseExpression(visitExpression(ctx.expression(1)));
//        }
//        return conditionalExpression;
//    }
//
//    @Override
//    public Expression visitLogicalExpression(AngularParser.LogicalExpressionContext ctx) {
//        LogicalExpression logicalExpression=new LogicalExpression();
//        if (ctx.binaryExpression(0)!=null){
//            logicalExpression.setLeft(visitBinaryExpression(ctx.binaryExpression(0)));
//        }
//        if(ctx.binaryExpression(1)!=null){
//            logicalExpression.setRight(visitBinaryExpression(ctx.binaryExpression(1)));
//        }
//        if(ctx.BITWISE_AND(0)!=null){
//            logicalExpression.setOperator(ctx.BITWISE_AND().get(0).getText());
//        }if(ctx.BITWISE_OR(0)!=null){
//            logicalExpression.setOperator(ctx.BITWISE_OR().get(0).getText());
//        }if(ctx.BITWISE_NOT(0)!=null){
//            logicalExpression.setOperator(ctx.BITWISE_NOT().get(0).getText());
//        }if(ctx.BITWISE_XOR(0)!=null){
//            logicalExpression.setOperator(ctx.BITWISE_XOR().get(0).getText());
//        }if(ctx.AND(0)!=null){
//            logicalExpression.setOperator(ctx.AND().get(0).getText());
//        }if(ctx.OR(0)!=null){
//            logicalExpression.setOperator(ctx.OR().get(0).getText());
//        }
//        return  logicalExpression;
//    }
//
//    @Override
//    public Expression visitBinaryExpression(AngularParser.BinaryExpressionContext ctx) {
//        BinaryExpression binaryExpression=new BinaryExpression();
//        if(ctx.primaryExpression(0)!=null){
//            binaryExpression.setLeft(visitPrimaryExpression(ctx.primaryExpression(0)));
//        }if(ctx.ASSIGN(0)!=null){
//            binaryExpression.setOperator(ctx.ASSIGN(0).getText());
//        }
//        if(ctx.primaryExpression(1)!=null){
//            binaryExpression.setRight(visitPrimaryExpression(ctx.primaryExpression(1)));
//        }
//        if(ctx.PLUS(0)!=null){
//            binaryExpression.setOperator(ctx.PLUS(0).getText());
//        }if(ctx.MINUS(0)!=null){
//            binaryExpression.setOperator(ctx.MINUS(0).getText());
//        }if(ctx.MULTIPLY(0)!=null){
//            binaryExpression.setOperator(ctx.MULTIPLY(0).getText());
//        }if(ctx.DIVIDE(0)!=null){
//            binaryExpression.setOperator(ctx.DIVIDE(0).getText());
//        }if(ctx.MODULO(0)!=null){
//            binaryExpression.setOperator(ctx.MODULO(0).getText());
//        }if(ctx.POWER(0)!=null){
//            binaryExpression.setOperator(ctx.POWER(0).getText());
//        }if(ctx.NOT_EQUAL(0)!=null){
//            binaryExpression.setOperator(ctx.NOT_EQUAL(0).getText());
//        }if(ctx.LESS(0)!=null){
//            binaryExpression.setOperator(ctx.LESS(0).getText());
//        }if(ctx.GREATER(0)!=null){
//            binaryExpression.setOperator(ctx.GREATER(0).getText());
//        }if(ctx.LESS_EQUAL(0)!=null){
//            binaryExpression.setOperator(ctx.LESS_EQUAL(0).getText());
//        }if(ctx.GREATER_EQUAL(0)!=null){
//            binaryExpression.setOperator(ctx.GREATER_EQUAL(0).getText());
//        }if(ctx.STRICT_NOT_EQUAL(0)!=null){
//            binaryExpression.setOperator(ctx.STRICT_NOT_EQUAL(0).getText());
//        }if(ctx.STRICT_EQUAL(0)!=null){
//            binaryExpression.setOperator(ctx.STRICT_EQUAL(0).getText());
//        }if(ctx.EQUAL(0)!=null){
//            binaryExpression.setOperator(ctx.EQUAL(0).getText());
//        }if(ctx.INCRES(0)!=null){
//            binaryExpression.setOperator(ctx.INCRES(0).getText());
//        }if(ctx.DECRES(0)!=null){
//            binaryExpression.setOperator(ctx.DECRES(0).getText());
//        }
//
//        return binaryExpression;
//    }
//    //todo
//    @Override
//    public Expression visitArrayDeclaration(AngularParser.ArrayDeclarationContext ctx) {
//        ArrayDeclaration arrayDeclaration=new ArrayDeclaration();
//        sympol sympol ;
//        if(ctx.argumentList()!=null){
//            if(Main.sympolTable.getSympols().get(Main.sympolTable.getSympols().size()-1).getName()==null){
//                sympol = Main.sympolTable.getSympols().get(Main.sympolTable.getSympols().size()-1);
//                sympol.setName(sympol.getValue());
//                sympol.setValue("List of object");
////                Main.sympolTable.getSympols().add(sympol);
//            }
//            arrayDeclaration.setArgumentList(visitArgumentList(ctx.argumentList()));
//        }
//        return arrayDeclaration;
//    }
//    //todo
//    @Override
//    public Expression visitObjectDeclaration(AngularParser.ObjectDeclarationContext ctx) {
//        ObjectDeclaration objectDeclaration=new ObjectDeclaration();
//        if(ctx.objectBody()!=null){
//            objectDeclaration.setObjectBody(visitObjectBody(ctx.objectBody()));
//        }
//        return objectDeclaration;
//    }
//
//    @Override
//    public Expression visitPrimaryExpression(AngularParser.PrimaryExpressionContext ctx) {
//        PrimaryExpression primaryExpression=new PrimaryExpression();
//        sympol sympol = new sympol();
//        int primaryExpressionTempCount=0;
//        if(ctx.ID()!=null){
//            primaryExpression.setId(ctx.ID().getText());
//            sympol.setValue(ctx.ID().getText());
//            sympol.setType("var");
//        }
//        if(ctx.STRING()!=null){
//            primaryExpression.setStringValue(ctx.STRING().getText());
//            sympol.setValue(ctx.STRING().getText());
//            sympol.setType("String");
//        }if(ctx.NUMBER()!=null){
//            primaryExpression.setNumberValue(ctx.NUMBER().getText());
//            sympol.setValue(ctx.NUMBER().getText());
//            sympol.setType("Number");
//        }if(ctx.BOOLEAN()!=null){
//            primaryExpression.setBooleanValue(ctx.BOOLEAN().getText());
//            sympol.setValue(ctx.BOOLEAN().getText());
//            sympol.setType("boolean");
//        }if(ctx.NULL()!=null){
//            primaryExpression.setNullValue(ctx.NULL().getText());
//        }if(ctx.UNDEFINED()!=null){
//            primaryExpression.setUndefinedValue(ctx.UNDEFINED().getText());
//        }
//        if(ctx.THIS()!=null){
//            primaryExpression.setThisValue(ctx.THIS().getText());
//        }
//        if(ctx.expression()!=null){
//            return    visitExpression(ctx.expression());
//        }
//        if(ctx.objectDeclaration()!=null){
//            return visitObjectDeclaration(ctx.objectDeclaration());
//        }
//        if(ctx.arrayDeclaration()!=null){
//            return  visitArrayDeclaration(ctx.arrayDeclaration());
//        }
//        //handle function call
//        if(ctx.primaryExpression(primaryExpressionTempCount)!=null&&ctx.argumentList()!=null){
//        System.out.println("function call");
//        FunctionCall functionCall=new FunctionCall();
//        functionCall.setExpression(visitPrimaryExpression(ctx.primaryExpression(primaryExpressionTempCount)));
//        functionCall.setArgumentList(visitArgumentList(ctx.argumentList()));
//        primaryExpression.setFunctionCall(functionCall);
//        }
//        //handle dot notation
//        if(ctx.DOT()!=null && ctx.primaryExpression().size()>=2){
//            DotNotation dotNotation=new DotNotation();
//            dotNotation.setLeft(visitPrimaryExpression(ctx.primaryExpression(primaryExpressionTempCount)));
//            primaryExpressionTempCount++;
//            dotNotation.setRight(visitPrimaryExpression(ctx.primaryExpression(primaryExpressionTempCount)));
//            primaryExpressionTempCount++;
//            primaryExpression.setDotNotation(dotNotation);
//            sympol.setName("HtmlContent");
//            sympol.setType("AngularChatData");
//            String s = "";
//            for (int i =2 ; i>=1 ; i--){
//               s += Main.sympolTable.getSympols().get( Main.sympolTable.getSympols().size()-i).getValue();
//               if(i==2){s+=".";}
//            }
//            sympol.setValue(s);
//        }
//        //handle object instantiation
//        if(ctx.NEW()!=null){
//            ObjectInstantiation objectInstantiation=new ObjectInstantiation();
//            objectInstantiation.setId(ctx.ID().getText());
//            objectInstantiation.setArgumentList(visitArgumentList(ctx.argumentList()));
//            primaryExpression.setObjectInstantiation(objectInstantiation);
//        }
//        if(sympol.getValue()!=null){
//            sympol.setScope(Main.sympolTable.getStack().peek().getTitle());
//            Main.sympolTable.getSympols().add(sympol);
//        }
//        return  primaryExpression;
//    }
//    //todo
//    @Override
//    public ArgumentList visitArgumentList(AngularParser.ArgumentListContext ctx) {
//        ArgumentList argumentList=new ArgumentList();
//        if(ctx.expression()!=null){
//            for (int i = 0; i <ctx.expression().size() ; i++) {
//                argumentList.getExpressionList().add(visitExpression(ctx.expression(i)));
//            }
//        }
//        return argumentList;
//    }
//
//    @Override
//    public Expression visitAssignmentExpression(AngularParser.AssignmentExpressionContext ctx) {
//        AssignmentExpression assignmentExpression=new AssignmentExpression();
//        if(ctx.expression()!=null){
//            assignmentExpression.setExpression(visitExpression(ctx.expression()));
//        }
//        if(ctx.ID()!=null){
//            assignmentExpression.setId(ctx.ID().getText());
//        }
//        return  assignmentExpression;
//    }
//
//    @Override
//    public BlockStatement visitBlockStatement(AngularParser.BlockStatementContext ctx) {
//        BlockStatement blockStatement=new BlockStatement();
//        if(ctx.statement()!=null){
//            for (int i = 0; i <ctx.statement().size() ; i++) {
//                blockStatement.getStatements().add(visitStatement(ctx.statement(i)));
//            }
//        }
//        return  blockStatement;
//    }
//
//    @Override
//    public Statement visitIfStatement(AngularParser.IfStatementContext ctx) {
//        IfStatement ifStatement = new IfStatement();
//        if (ctx.expression() != null) {
//            ifStatement.setCondition(visitExpression(ctx.expression()));
//        }
//        if (ctx.statement(0) != null) {
//            ifStatement.setThenStatement(visitStatement(ctx.statement(0)));
//        }
//        if (ctx.statement(1) != null) {
//            ifStatement.setElseStatement(visitStatement(ctx.statement(1)));
//        }
//        return  ifStatement;
//    }
//
//    @Override
//    public Statement visitForStatement(AngularParser.ForStatementContext ctx) {
//        ForStatement forStatement = new ForStatement();
//        int expressionTempCount=0;
//        int assignmentExpressionTempCount=0;
//        // Check for "for-of"
//        if (ctx.forOf() != null) {
//            forStatement.setForOf(visitForOf(ctx.forOf()));
//        }
//
//        // Handle variable declaration or assignment
//        if (ctx.variableDeclaration() != null) {
//            forStatement.setVariableDeclaration(visitVariableDeclaration(ctx.variableDeclaration()));
//            System.out.println("Variable Declaration: " + ctx.variableDeclaration().getText());
//        } else if (ctx.assignmentExpression(assignmentExpressionTempCount) != null) {
//            forStatement.setVariableDeclarationAsExpression(visitAssignmentExpression(ctx.assignmentExpression(assignmentExpressionTempCount)));
//            System.out.println("Assignment Expression: " + ctx.assignmentExpression(assignmentExpressionTempCount).getText());
//            assignmentExpressionTempCount++;
//
//        } else if (ctx.expression(expressionTempCount) != null) {
//            forStatement.setVariableDeclarationAsExpression(visitExpression(ctx.expression(expressionTempCount)));
//            System.out.println("Expression (Variable Declaration): " + ctx.expression(expressionTempCount).getText());
//            expressionTempCount++;
//        }
//
//        // Handle condition
//        if (ctx.expression(expressionTempCount) != null) {
//            forStatement.setCondition(visitExpression(ctx.expression(expressionTempCount)));
//            System.out.println("Condition: " + ctx.expression(expressionTempCount).getText());
//            expressionTempCount++;
//        }
//
//        // Handle increment
//        if (ctx.incrementExpression() != null) {
//            forStatement.setIncrement(visitIncrementExpression(ctx.incrementExpression()));
//            System.out.println("Increment: " + ctx.incrementExpression().getText());
//        } else if (ctx.assignmentExpression(assignmentExpressionTempCount) != null) {
//            forStatement.setIncrement(visitAssignmentExpression(ctx.assignmentExpression(assignmentExpressionTempCount)));
//            System.out.println("Increment (Assignment): " + ctx.assignmentExpression(assignmentExpressionTempCount).getText());
//            assignmentExpressionTempCount++;
//        } else if (ctx.expression(expressionTempCount) != null) {
//            forStatement.setIncrement(visitExpression(ctx.expression(expressionTempCount)));
//            System.out.println("Increment (Expression): " + ctx.expression(expressionTempCount).getText());
//            expressionTempCount++;
//        }
//
//        // Handle body
//        if (ctx.blockStatement() != null) {
//            forStatement.setBody(visitBlockStatement(ctx.blockStatement()));
//        } else if (ctx.expressionStatement() != null) {
//            forStatement.setBody(visitExpressionStatement(ctx.expressionStatement()));
//        }
//
//        return forStatement;
//    }
//
//
//    @Override
//    public ForOf visitForOf(AngularParser.ForOfContext ctx) {
//        ForOf forOf=new ForOf();
//        if(ctx.variableDeclaration()!=null){
//            forOf.setVariableDeclaration(visitVariableDeclaration(ctx.variableDeclaration()));
//        }
//        if(ctx.expression()!=null){
//            forOf.setExpression(visitExpression(ctx.expression()));
//        }
//        return forOf;
//    }
//
//    @Override
//    public Expression visitIncrementExpression(AngularParser.IncrementExpressionContext ctx) {
//        IncreamentExpression increamentExpression=new IncreamentExpression();
//        if (ctx.ID()!=null){
//            increamentExpression.setId(ctx.ID().getText());
//        }
//        increamentExpression.setIncreament(ctx.INCRES()!=null);
//
//        return increamentExpression;
//    }
//
//
//    @Override
//    public Statement visitWhileStatement(AngularParser.WhileStatementContext ctx) {
//        WhileStatement whileStatement=new WhileStatement();
//        if(ctx.expression()!=null){
//            whileStatement.setCondition(visitExpression(ctx.expression()));
//        }
//        if(ctx.statement()!=null){
//            whileStatement.setBody(visitStatement(ctx.statement()));
//        }
//        return whileStatement;
//    }
//
//    @Override
//    public Statement visitDoWhileStatement(AngularParser.DoWhileStatementContext ctx) {
//        DoWhileStatement doWhileStatement=new DoWhileStatement();
//        if(ctx.statement()!=null){
//            doWhileStatement.setBody(visitStatement(ctx.statement()));
//        }
//        if(ctx.expression()!=null){
//            doWhileStatement.setCondition(visitExpression(ctx.expression()));
//        }
//        return doWhileStatement;
//    }
//
//    @Override
//    public Statement visitSwitchStatement(AngularParser.SwitchStatementContext ctx) {
//        SwitchStatement switchStatement=new SwitchStatement();
//        if (ctx.expression()!=null){
//            switchStatement.setExpression(visitExpression(ctx.expression()));
//        }
//        if (ctx.caseStatement()!=null){
//            for (int i = 0; i < ctx.caseStatement().size(); i++) {
//                switchStatement.getCaseStatements().add(visitCaseStatement(ctx.caseStatement(i)));
//            }
//        }
//        return switchStatement;
//    }
//
//    @Override
//    public CaseStatement visitCaseStatement(AngularParser.CaseStatementContext ctx) {
//        CaseStatement caseStatement=new CaseStatement();
//        if (ctx.statement()!=null){
//            for (int i = 0; i < ctx.statement().size(); i++) {
//                caseStatement.getStatements().add(visitStatement(ctx.statement(i)));
//            }
//        }
//        if(ctx.expression()!=null){
//            caseStatement.setCaseExpression(visitExpression(ctx.expression()));
//        }
//        return caseStatement;
//    }
//
//    @Override
//    public Statement visitTryCatchStatement(AngularParser.TryCatchStatementContext ctx) {
//        TryCatchStatement tryCatchStatement=new TryCatchStatement();
//        if (ctx.blockStatement()!=null){
//            if (ctx.blockStatement(0)!=null){
//                tryCatchStatement.setTryBlock(visitBlockStatement(ctx.blockStatement(0)));
//            }
//            if (ctx.blockStatement(1)!=null){
//                tryCatchStatement.setCatchBlock(visitBlockStatement(ctx.blockStatement(1)));
//            }
//            if (ctx.blockStatement(2)!=null){
//                tryCatchStatement.setFinallyBlock(visitBlockStatement(ctx.blockStatement(2)));
//            }
//        }
//        if (ctx.ID()!=null){
//            tryCatchStatement.setCatchVariable(ctx.ID().getText());
//        }
//        return tryCatchStatement;
//    }
//
//    @Override
//    public Statement visitReturnStatement(AngularParser.ReturnStatementContext ctx) {
//        ReturnStatement returnStatement=new ReturnStatement();
//        if(ctx.expression()!=null){
//            returnStatement.setExpression(visitExpression(ctx.expression()));
//        }
//        return returnStatement;
//    }
//
//    @Override
//    public Statement visitBreakStatement(AngularParser.BreakStatementContext ctx) {
//        return  new BreakStatement();
//    }
//
//    @Override
//    public Statement visitContinueStatement(AngularParser.ContinueStatementContext ctx) {
//        return  new ContinueStatement();
//    }
//
//    @Override
//    public Statement visitThrowStatement(AngularParser.ThrowStatementContext ctx) {
//        ThrowStatement throwStatement=new ThrowStatement();
//        if(ctx.expression()!=null){
//            throwStatement.setExpression(visitExpression(ctx.expression()));
//        }
//        return throwStatement;
//    }
//
//    @Override
//    public Object visitReadError(AngularParser.ReadErrorContext ctx) {
//        return null;
//    }
//
//    @Override
//    public Statement visitDecoratorApplication(AngularParser.DecoratorApplicationContext ctx) {
//        DecoratorApplication decoratorApplication=new DecoratorApplication();
//        scope.create_scope(ctx.ID().getText());
//        if(ctx.ID()!=null){
//        decoratorApplication.setName(ctx.ID().getText());
//        }
//        if(ctx.parameterList()!=null){
//            decoratorApplication.setParameterList(visitParameterList(ctx.parameterList()));
//        }
//        scope.remove_scope();
//        return decoratorApplication;
//    }
//
//    @Override
//    public Object visitErrorNode(ErrorNode errorNode) {
//        return null;
//    }
//}
