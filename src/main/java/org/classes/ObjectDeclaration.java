package org.Classes;

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
}
