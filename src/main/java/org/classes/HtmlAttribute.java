package org.classes;

public class HtmlAttribute extends Html{
    String value;
    public HtmlAttribute() {
        super();
        this.setNodeType("HtmlAttribute");
    }
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "HtmlAttribute{" +
                "\nvalue='" + value + '\'' +
                "}\n";
    }

    @Override
    public String generate() {
        return value != null ? value : "";
    }
}
