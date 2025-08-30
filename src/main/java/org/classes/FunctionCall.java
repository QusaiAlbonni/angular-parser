package org.classes;

public class FunctionCall extends Expression{
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
                "\nexpression=" + expression +
                "\nargumentList=" + argumentList +
                '}';
    }

    @Override
    public String toCode() {
        StringBuilder sb = new StringBuilder();
        if (this.expression != null) {
            sb.append(this.expression.toCode());
        }
        sb.append("(");
        if (argumentList != null) {
            sb.append(argumentList.toCode());
        }
        sb.append(")");
        return sb.toString();
    }
}
