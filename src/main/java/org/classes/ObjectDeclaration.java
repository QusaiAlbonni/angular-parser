package org.classes;

public class ObjectDeclaration extends Expression{
ObjectBody objectBody;

    public ObjectDeclaration() {
        super();
        this.setNodeType("ObjectDeclaration");
    }

    public ObjectBody getObjectBody() {
        return objectBody;
    }

    public void setObjectBody(ObjectBody objectBody) {
        this.objectBody = objectBody;
        if (objectBody != null) {
            addChild(objectBody);
        }
    }

    @Override
    public String toString() {
        return "\nObjectDeclaration{" +
                "\nobjectBody=" + objectBody +
                '}';
    }

    @Override
    public String generate() {
        if (objectBody != null) {
            return "{" + objectBody.generate() + "}";
        }
        return "{}";
    }
}
