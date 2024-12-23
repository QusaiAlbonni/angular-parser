package org.classes;

public class ReturnStatement extends Statement{
    Expression expression;

    public ReturnStatement() {
    }

    public ReturnStatement(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "\nReturnStatement{" +
                "\nexpression=" + expression +
                '}';
    }
}
