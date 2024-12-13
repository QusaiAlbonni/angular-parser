package org.Classes;

public class BinaryExpression extends Expression {
    private Expression left;
    private String operator; // e.g., "+", "-", "*", etc.
    private Expression right;

    public BinaryExpression() {
    }

    public BinaryExpression(Expression left, String operator, Expression right) {
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    // Getters and setters

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    @Override
    public String toString() {
        if(left!=null&&right!=null){
        return "\nBinaryExpression{" +
                "\nleft=" + left +
                "\noperator='" + operator + '\'' +
                "\nright=" + right +
                '}';

        }if(left!=null){
        return "\nBinaryExpression{" +
                "\nleft=" + left +
                '}';

        }if(right!=null){
        return "\nBinaryExpression{" +
                "\nright=" + right +
                '}';

        }
        return  "ERROR IN BINARY EXPRESSION WHEN CALL TO STRING ";
    }
}