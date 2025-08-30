package org.classes;

public class HtmlAttribute extends Html{
    String value;
    String id;
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "HtmlAttribute{" +
                "\nvalue='" + value + '\'' +
                "}\n";
    }
    public String toCode() {
        if (value != null) {
            return value;
        }
        return "";
    }
}
