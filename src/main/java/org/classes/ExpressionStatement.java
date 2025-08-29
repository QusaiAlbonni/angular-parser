package org.classes;

public class ExpressionStatement extends Statement{
    Expression expression;
    public ExpressionStatement(){
        this.setNodeType("ExpressionStatement");
    }
    public ExpressionStatement(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
        if (expression != null) {
            this.addChild((Node) expression);
        }
    }

    public String generate() {
        if (expression != null) {
            return expression.generate() + ";";
        } else {
            return ";";
        }
    }

    @Override
    public String toString() {
        return "\nExpressionStatement{" +
                "\nexpression=" + expression +
                '}';
    }
}
