package org.classes;

public class KnownHtmlTag {
    private String tagName;

    public KnownHtmlTag() {
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
}

