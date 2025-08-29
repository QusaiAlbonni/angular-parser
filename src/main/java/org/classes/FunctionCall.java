package org.classes;

public class FunctionCall extends Statement {
    Expression expression;
    ArgumentList argumentList;
    public FunctionCall() {
        super();
        this.setNodeType("FunctionCall");
    }
    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
        if (expression != null) addChild(expression);
    }

    public ArgumentList getArgumentList() {
        return argumentList;

    }

    public void setArgumentList(ArgumentList argumentList) {
        this.argumentList = argumentList;
        if (argumentList != null) addChild(argumentList);
    }

    @Override
    public String toString() {
        return "FunctionCall{" +
                "\nexpression=" + expression +
                "\nargumentList=" + argumentList +
                '}';
    }

    public String generate() {
        StringBuilder sb = new StringBuilder();
        if (expression != null) sb.append(expression.toString());
        sb.append("(");
        if (argumentList != null && argumentList.getExpressionList() != null) {
            for (int i = 0; i < argumentList.getExpressionList().size(); i++) {
                sb.append(argumentList.getExpressionList().get(i).toString());
                if (i < argumentList.getExpressionList().size() - 1) sb.append(", ");
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
