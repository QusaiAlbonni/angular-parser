package org.classes;

// AssignmentExpression.java
public class AssignmentExpression extends Expression {
    private String id;
    private Expression expression;

    public AssignmentExpression() {
        super();
        this.setNodeType("AssignmentExpression");
    }

    public AssignmentExpression(String id, Expression expression) {
        super();
        this.setNodeType("AssignmentExpression");
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
        if (expression != null) {
            addChild(expression);
        }
    }

    @Override
    public String generate() {
        String exprCode = expression != null ? expression.generate() : "";
        return id + " = " + exprCode + ";";
    }

    @Override
    public String toString() {
        return "\nAssignmentExpression{" +
                "\nid='" + id + '\'' +
                "\nexpression=" + expression +
                '}';
    }
}