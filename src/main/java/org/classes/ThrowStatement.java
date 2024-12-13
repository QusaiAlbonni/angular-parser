package org.Classes;

public class ThrowStatement extends Statement{
    Expression expression;

    public ThrowStatement() {
    }

    public ThrowStatement(Expression expression) {
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
        return "\nThrowStatement{" +
                "\nexpression=" + expression +
                '}';
    }
}
