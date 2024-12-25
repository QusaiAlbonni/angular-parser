package org.classes;

public class ForAttribute {
    String attributeValue;

    public ForAttribute() {
    }

    public String getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    @Override
    public String toString() {
        return "ForAttribute{\nngFor = " +
                "\nattributeValue='" + attributeValue + '\'' +
                '}';
    }
}
