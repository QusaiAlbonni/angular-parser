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

    public String toCode() {
        StringBuilder sb = new StringBuilder();
        sb.append("*ngFor=");
        if (attributeValue != null) {
            sb.append(attributeValue);
        }
        return sb.toString();
    }
}
