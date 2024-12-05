package org.classes;

// ConditionalExpression.java
public class ConditionalExpression extends Expression {
    private Expression condition;
    private Expression trueExpression;
    private Expression falseExpression;

    public ConditionalExpression(Expression condition, Expression trueExpression, Expression falseExpression) {
        this.condition = condition;
        this.trueExpression = trueExpression;
        this.falseExpression = falseExpression;
    }

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    public Expression getTrueExpression() {
        return trueExpression;
    }

    public void setTrueExpression(Expression trueExpression) {
        this.trueExpression = trueExpression;
    }

    public Expression getFalseExpression() {
        return falseExpression;
    }

    public void setFalseExpression(Expression falseExpression) {
        this.falseExpression = falseExpression;
    }

    @Override
    public String toString() {
        return "\nConditionalExpression{" +
                "\ncondition=" + condition +
                "\ntrueExpression=" + trueExpression +
                "\nfalseExpression=" + falseExpression +
                '}';
    }
}