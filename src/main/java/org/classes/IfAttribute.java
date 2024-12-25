package org.classes;

public class IfAttribute {
    String attributeValue;

    public IfAttribute() {
    }

    public String getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    @Override
    public String toString() {
        return "IfAttribute{\nngIf = " +
                "\nattributeValue='" + attributeValue + '\'' +
                '}';
    }
}
