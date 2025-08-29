package org.classes;

public class DotNotation extends Expression{
    Expression left;
    Expression right;

    public DotNotation() {
        super();
        this.setNodeType("DotNotation");
    }
    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
        if (left != null) addChild(left);
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
        return "DotNotation{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }

    public String generate() {
        StringBuilder sb = new StringBuilder();
        if (left != null) {
            sb.append(left.generate());
        }
        sb.append(".");
        if (right != null) {
            sb.append(right.generate());
        }
        return sb.toString();
    }
}
