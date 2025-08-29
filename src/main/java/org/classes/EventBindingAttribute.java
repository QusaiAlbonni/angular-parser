package org.classes;

public class EventBindingAttribute  extends  Node{
    String tagName;
    String attributeValue;

    public EventBindingAttribute() {
        super();
        this.setNodeType("EventBindingAttribute");
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
    public String generate() {
        if (tagName != null && !tagName.isEmpty() && attributeValue != null && !attributeValue.isEmpty()) {
            return "(" + tagName + ")=\"" + attributeValue + "\"";
        }
        return "";
    }

    @Override
    public String toString() {
        return "EventBindingAttribute{" +
                "\ntagName='" + tagName + '\'' +
                "\nattributeValue='" + attributeValue + '\'' +
                '}';
    }
}
