package org.classes;

public class ForAttribute extends Node{
    String attributeValue;

    public ForAttribute() {
        super();
        this.setNodeType("ForAttribute");
    }

    public String getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    @Override
    public String generate() {
        if (attributeValue != null && !attributeValue.isEmpty()) {
            return "*ngFor=\"" + attributeValue + "\"";
        }
        return "";
    }


    @Override
    public String toString() {
        return "ForAttribute{\nngFor = " +
                "\nattributeValue='" + attributeValue + '\'' +
                '}';
    }
}
