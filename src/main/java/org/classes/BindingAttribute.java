package org.classes;

public class BindingAttribute extends Node{
String tagName;
String attributeValue;

    public BindingAttribute() {
        super();
        this.setNodeType("BindingAttribute");
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }


    @Override
    public String toString() {
        return "BindingAttribute{" +
                "\ntagName='" + tagName + '\'' +
                "\nattributeValue='" + attributeValue + '\'' +
                '}';
    }
    @Override
    public String generate() {

        if (tagName != null && !tagName.isEmpty() && attributeValue != null && !attributeValue.isEmpty()) {
            return "[" + tagName + "]=\"" + attributeValue + "\"";
        }
        return "";
    }
}
