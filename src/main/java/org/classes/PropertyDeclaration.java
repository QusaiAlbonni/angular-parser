package org.classes;

public class PropertyDeclaration {
    String id;
    TypeAnnotation typeAnnotation;
    Expression expression;

    public PropertyDeclaration() {

    }

    public PropertyDeclaration(String id, TypeAnnotation typeAnnotation) {
        this.id = id;
        this.typeAnnotation = typeAnnotation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TypeAnnotation getTypeAnnotation() {
        return typeAnnotation;
    }

    public void setTypeAnnotation(TypeAnnotation typeAnnotation) {
        this.typeAnnotation = typeAnnotation;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "\nPropertyDeclaration{" +
                "\nid='" + id + '\'' +
                "\ntypeAnnotation='" + typeAnnotation + '\'' +
                "\nexpression=" + expression +
                '}';
    }

    public String toCode() {
        StringBuilder sb = new StringBuilder();
        if (id != null) {
            sb.append(id);
        }
        if (expression != null) {
            sb.append(" = ").append(expression.toCode());
        }
        return sb.toString();
    }
}
