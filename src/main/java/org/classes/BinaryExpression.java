package org.classes;

public class BinaryExpression extends Expression {
    private Expression left;
    private String operator; // e.g., "+", "-", "*", etc.
    private Expression right;

    public BinaryExpression() {
    }

    public BinaryExpression(Expression left, String operator, Expression right) {
        super();
        this.setNodeType("BinaryExpression");
        this.left = left;
        this.operator = operator;
        this.right = right;
        if (left != null) addChild(left);
        if (right != null) addChild(right);
    }

    // Getters and setters

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
        if (left != null) addChild(left);
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
        if (right != null) addChild(right);
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

    @Override
    public String generate() {
        System.out.println("Generate called for ObjectMember with ID=");
        String leftCode = left != null ? left.generate() : "";
        String rightCode = right != null ? right.generate() : "";
        String op = operator != null ? operator : "";
        return leftCode + " " + op + " " + rightCode;
    }
}