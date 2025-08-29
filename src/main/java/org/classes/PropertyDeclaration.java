package org.classes;

public class PropertyDeclaration extends Node {
    String id ;
    TypeAnnotation typeAnnotation;
    public  PropertyDeclaration(){
        super();
        this.setNodeType("PropertyDeclaration");
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

    @Override
    public String toString() {
        return "\nPropertyDeclaration{" +
                "\nid='" + id + '\'' +
                "\ntypeAnnotation='" + typeAnnotation + '\'' +
                '}';
    }

    @Override
    public String generate() {

        return "PROPERTY " + id + " : " + (typeAnnotation != null ? typeAnnotation.getType() : "any") + ";";
    }
}
