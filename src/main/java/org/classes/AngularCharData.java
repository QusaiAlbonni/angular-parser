package org.classes;

import java.util.ArrayList;
import java.util.List;

public class AngularCharData {
   List<String>texts;
    ExpressionStatement expressionStatement;

    public AngularCharData() {
        this.texts = new ArrayList<>();
    }

    public ExpressionStatement getExpressionStatement() {
        return expressionStatement;
    }

    public void setExpressionStatement(ExpressionStatement expressionStatement) {
        this.expressionStatement = expressionStatement;
    }

    public List<String> getTexts() {
        return texts;
    }

    public void setTexts(List<String> texts) {
        this.texts = texts;
    }

    @Override
    public String toString() {
        return "AngularCharData: {" +
                "\ntexts: " + texts+
                "\nexpression: " + expressionStatement +
                "\n";
    }
}
