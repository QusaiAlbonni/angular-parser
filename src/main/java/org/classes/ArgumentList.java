package org.classes;

import java.util.ArrayList;
import java.util.List;

public class ArgumentList {
List<Expression> expressionList;

    public ArgumentList() {
        expressionList=new ArrayList<>();
    }

    public List<Expression> getExpressionList() {
        return expressionList;
    }

    public void setExpressionList(List<Expression> expressionList) {
        this.expressionList = expressionList;
    }

    @Override
    public String toString() {
        return "\nArgumentList{" +
                "\nexpressionList=" + expressionList +
                '}';
    }

    public String toCode() {
        if (expressionList == null || expressionList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < expressionList.size(); i++) {
            if (expressionList.get(i) != null) {
                sb.append(expressionList.get(i).toCode());
            }
            if (i < expressionList.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
