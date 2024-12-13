package org.Classes;

// AssignmentExpression.java
public class AssignmentExpression extends Expression {
    private String id;
    private Expression expression;

    public AssignmentExpression() {

    }

    public AssignmentExpression(String id, Expression expression) {
        this.id = id;
        this.expression = expression;
    }

    // Getters and setters

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
        return "\nAssignmentExpression{" +
                "\nid='" + id + '\'' +
                "\nexpression=" + expression +
                '}';
    }
}