package org.classes;

public class BindingAttribute {
String tagName;
String attributeValue;

    public BindingAttribute() {
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
}
