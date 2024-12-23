package org.classes;

public class EnumMember {
    String id;
    Expression expression;

    public EnumMember() {
    }

    public EnumMember(String id, Expression expression) {
        this.id = id;
        this.expression = expression;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "\nEnumMember{" +
                "\nid='" + id + '\'' +
                "\nexpression=" + expression +
                '}';
    }
}
