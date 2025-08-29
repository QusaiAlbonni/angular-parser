package org.classes;

import java.util.ArrayList;
import java.util.List;

public class AngularCharData extends Node {
    List<String>texts;
    ExpressionStatement expressionStatement;

    public AngularCharData() {
        super();
        this.setNodeType("AngularCharData");
        this.texts = new ArrayList<>();
    }

    public ExpressionStatement getExpressionStatement() {
        return expressionStatement;
    }

    public void setExpressionStatement(ExpressionStatement expressionStatement) {
        this.expressionStatement = expressionStatement;
        if (expressionStatement != null) {
            this.addChild(expressionStatement);
        }

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

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        // توليد النصوص كما هي
        for (String t : texts) {
            sb.append(t);
        }
        // توليد الكود الخاص بالـ expression إذا وجد
        if (expressionStatement != null) {
            sb.append(expressionStatement.generate());
        }
        return sb.toString();
    }
}
