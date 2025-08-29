package org.classes;

import java.util.ArrayList;
import java.util.List;

public class ArgumentList extends Expression {
List<Expression> expressionList;

    public ArgumentList() {
        super();
        this.setNodeType("ArgumentList");
        expressionList=new ArrayList<>();
    }

    public List<Expression> getExpressionList() {
        return expressionList;
    }

    public void setExpressionList(List<Expression> expressionList) {
        this.expressionList = expressionList;
        if (expressionList != null) {
            for (Expression expr : expressionList) {
                addExpression(expr);
            }
        }
    }

    public void addExpression(Expression expr) {
        if (expr != null) {
            expressionList.add(expr);
            addChild(expr);
        }
    }
    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < expressionList.size(); i++) {
            sb.append(expressionList.get(i).generate());
            if (i < expressionList.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
    @Override
    public String toString() {
        return "\nArgumentList{" +
                "\nexpressionList=" + expressionList +
                '}';
    }
}
