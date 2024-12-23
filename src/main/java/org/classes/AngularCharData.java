package org.classes;

public class AngularCharData {
    String textLeft;
    String textRight;

    ExpressionStatement expressionStatement;

    public ExpressionStatement getExpressionStatement() {
        return expressionStatement;
    }

    public void setExpressionStatement(ExpressionStatement expressionStatement) {
        this.expressionStatement = expressionStatement;
    }

    public String getTextRight() {
        return textRight;
    }

    public void setTextRight(String textRight) {
        this.textRight = textRight;
    }

    public String getTextLeft() {
        return textLeft;
    }

    public void setTextLeft(String textLeft) {
        this.textLeft = textLeft;
    }

    @Override
    public String toString() {
        return "AngularCharData: {" +
                "\ntext left: " + textLeft +
                "\nexpression: " + expressionStatement +
                "\ntext right: " + textRight +
                "\n";
    }
}
