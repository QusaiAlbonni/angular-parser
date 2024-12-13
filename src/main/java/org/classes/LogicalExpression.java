package org.Classes;

// LogicalExpression.java
public class LogicalExpression extends Expression {
    private Expression left;
    private String operator; // e.g., "&&", "||"
    private Expression right;
    public  LogicalExpression(){}
    public LogicalExpression(Expression left, String operator, Expression right) {
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
        return "\nLogicalExpression{" +
                "\nleft=" + left +
                "\noperator='" + operator + '\'' +
                "\nright=" + right +
                '}';

        }if(left==null){
        return "\nLogicalExpression{" +
                "\nright=" + right +
                '}';

        }
        return "\nLogicalExpression{" +
                "\nleft=" + left +
                '}';

    }
}