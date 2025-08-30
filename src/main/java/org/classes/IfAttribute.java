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

    public String toCode() {
        StringBuilder sb = new StringBuilder();
        sb.append("*ngIf=");
        if (attributeValue != null) {
            sb.append(attributeValue);
        }
        return sb.toString();
    }
}
