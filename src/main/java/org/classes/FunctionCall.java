package org.classes;

public class FunctionCall {
    Expression expression;
    ArgumentList argumentList;

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public ArgumentList getArgumentList() {
        return argumentList;
    }

    public void setArgumentList(ArgumentList argumentList) {
        this.argumentList = argumentList;
    }

    @Override
    public String toString() {
        return "FunctionCall{" +
                "expression=" + expression +
                ", argumentList=" + argumentList +
                '}';
    }
}
