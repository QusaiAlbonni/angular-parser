package org.classes;

public class IfAttribute extends  Node {
    String attributeValue;

    public IfAttribute() {
        super();
        this.setNodeType("IfAttribute");
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
            return "*ngIf=\"" + attributeValue + "\"";
        }
        return "";
    }

    @Override
    public String toString() {
        return "IfAttribute{\nngIf = " +
                "\nattributeValue='" + attributeValue + '\'' +
                '}';
    }
}
