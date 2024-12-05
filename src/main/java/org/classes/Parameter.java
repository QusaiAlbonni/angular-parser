package org.classes;

public class Parameter {

TypeAnnotation type;
String name;
public  Parameter(){}
    public Parameter(TypeAnnotation type, String name) {
        this.type = type;
        this.name = name;
    }

    public TypeAnnotation getType() {
        return type;
    }

    public void setType(TypeAnnotation type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nParameter{" +
                "\ntype='" + type + '\'' +
                "\nname='" + name + '\'' +
                '}';
    }
}
