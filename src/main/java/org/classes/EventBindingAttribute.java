package org.classes;

public class EventBindingAttribute {
    String tagName;
    String attributeValue;

    public EventBindingAttribute() {
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
        return "EventBindingAttribute{" +
                "\ntagName='" + tagName + '\'' +
                "\nattributeValue='" + attributeValue + '\'' +
                '}';
    }
}
