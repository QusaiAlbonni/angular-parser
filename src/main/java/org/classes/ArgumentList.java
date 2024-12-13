package org.Classes;

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
}
