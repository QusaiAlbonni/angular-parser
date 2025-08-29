package org.classes;

public class ForOf extends Statement {
    private VariableDeclaration variableDeclaration;
    private Expression expression;

    public ForOf() {
        super();
        this.setNodeType("ForOf");
    }
    public VariableDeclaration getVariableDeclaration() {
        return variableDeclaration;
    }

    public void setVariableDeclaration(VariableDeclaration variableDeclaration) {
        this.variableDeclaration = variableDeclaration;
        if (variableDeclaration != null) addChild(variableDeclaration);
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString(){
        return "ForOf{" +
                "\nvariable: " + variableDeclaration +
                "\nexpression: " + expression +
                "\n}";
    }

    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("for (let ");
        if (variableDeclaration != null) sb.append(variableDeclaration.getId());
        sb.append(" of ");
        if (expression != null) sb.append(expression.toString());
        sb.append(")");
        return sb.toString();
    }

}
