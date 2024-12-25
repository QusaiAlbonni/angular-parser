package org.classes;

public class HtmlAttribute extends Html{
    String value;
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
}
