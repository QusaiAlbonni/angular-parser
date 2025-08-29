package org.classes;

public class ReturnStatement extends Statement{
    Expression expression;

    public ReturnStatement() {
        super();
        this.setNodeType("ReturnStatement");
    }

    public ReturnStatement(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
        if (expression != null) addChild(expression);
    }

    @Override
    public String toString() {
        return "\nReturnStatement{" +
                "\nexpression=" + expression +
                '}';
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("return");
        if (expression != null) {
            sb.append(" ").append(expression.generate());
        }
        sb.append(";");
        return sb.toString();
    }
}
