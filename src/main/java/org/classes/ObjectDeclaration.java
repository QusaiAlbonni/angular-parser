package org.classes;

public class ObjectDeclaration extends Expression{
ObjectBody objectBody;

    public ObjectDeclaration() {
    }

    public ObjectBody getObjectBody() {
        return objectBody;
    }

    public void setObjectBody(ObjectBody objectBody) {
        this.objectBody = objectBody;
    }

    @Override
    public String toString() {
        return "\nObjectDeclaration{" +
                "\nobjectBody=" + objectBody +
                '}';
    }

    @Override
    public String toCode() {
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        if (objectBody != null) {
            sb.append(objectBody.toCode());
        }
        sb.append(" }");
        return sb.toString();
    }
}
