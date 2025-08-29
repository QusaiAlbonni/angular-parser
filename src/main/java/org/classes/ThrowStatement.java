package org.classes;

public class ThrowStatement extends Statement{
    Expression expression;

    public ThrowStatement() {
        super();
        this.setNodeType("ThrowStatement");
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

    @Override
    public String generate() {
        if (expression != null) {
            return "throw " + expression.generate() + ";";
        }
        return "throw;";
    }
}
