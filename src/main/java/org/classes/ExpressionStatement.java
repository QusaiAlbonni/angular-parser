package org.classes;

public class ExpressionStatement extends Statement{
    Expression expression;
    public ExpressionStatement(){}
    public ExpressionStatement(Expression expression) {
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
        return "\nExpressionStatement{" +
                "\nexpression=" + expression +
                '}';
    }
    @Override
    public String toCode() {
        if (expression != null) {
            return expression.toCode();
        }
        return "";
    }
}
