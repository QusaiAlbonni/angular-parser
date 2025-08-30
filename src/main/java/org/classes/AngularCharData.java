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

    public String toCode() {
        StringBuilder sb = new StringBuilder();
        if (texts != null && !texts.isEmpty()) {
            for (int i = 0; i < texts.size(); i++) {
                sb.append(texts.get(i));
                if (i < texts.size() - 1 && expressionStatement != null) {
                    sb.append("{{").append(expressionStatement.toCode()).append("}}");
                }
            }
        } else if (expressionStatement != null) {
            sb.append("{{").append(expressionStatement.toCode()).append("}}");
        }
        return sb.toString();
    }
}
