package org.classes;

public class TypeAnnotation {
    String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "\nTypeAnnotation{" +
                "\ntype='" + type + '\'' +
                '}';
    }
}
