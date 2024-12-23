package org.classes;

public class DotNotation {
    Expression left;
    Expression right;

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "DotNotation{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}
