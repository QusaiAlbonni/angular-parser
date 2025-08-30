package org.classes;

public class VariableDeclaration extends Statement{
    String type; //let ot const
    String id;
    Expression expression;

    public VariableDeclaration(String type, String id, Expression expression) {
        this.type = type;
        this.id = id;
        this.expression = expression;
    }
    public  VariableDeclaration(){}
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        return "\nVariableDeclaration{" +
                "\ntype='" + type + '\'' +
                "\nid='" + id + '\'' +
                "\nexpression=" + expression +
                '}';
    }

    @Override
    public String toCode() {
        StringBuilder sb = new StringBuilder();
        if (type != null) {
            sb.append(type).append(" ");
        }
        if (id != null) {
            sb.append(id);
        }
        if (expression != null) {
            sb.append(" = ").append(expression.toCode());
        }
        return sb.toString();
    }

}
