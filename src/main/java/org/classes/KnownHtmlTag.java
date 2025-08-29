package org.classes;

public class KnownHtmlTag extends Html {
    private String tagName;

    public KnownHtmlTag() {
        super();
        this.setNodeType("KnownHtmlTag");
    }
    public KnownHtmlTag(String tagName) {
        this.tagName = tagName;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public String toString() {
        return "KnownHtmlTag{" +
                "tagName='" + tagName + '\'' +
                '}';
    }

    @Override
    public String generate() {
        if (tagName == null || tagName.isEmpty()) return "";
        return "<" + tagName + "></" + tagName + ">";
    }
}

