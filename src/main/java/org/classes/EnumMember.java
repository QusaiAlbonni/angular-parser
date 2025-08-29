package org.classes;

public class EnumMember extends Statement {
    String id;
    Expression expression;

    public EnumMember() {
        super();
        this.setNodeType("EnumMember");
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
        if (expression != null) {
            addChild(expression);
        }
    }

    @Override
    public String toString() {
        return "\nEnumMember{" +
                "\nid='" + id + '\'' +
                "\nexpression=" + expression +
                '}';
    }

    @Override
    public String generate() {
        if (expression != null) {
            return id + " = " + expression.generate();
        } else {
            return id;
        }
    }
}
