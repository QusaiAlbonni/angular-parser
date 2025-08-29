package org.classes;
//TODO
//todo
public class TypeAnnotation extends  Node{
    String type;
    public TypeAnnotation() {
        super();
        this.setNodeType("TypeAnnotation");
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String generate() {

        return "";
    }
    @Override
    public String toString() {
        return "\nTypeAnnotation{" +
                "\ntype='" + type + '\'' +
                '}';
    }
}
