package org.classes;

public class HtmlCharData {
    String text;
    AngularCharData angularCharData;

    public AngularCharData getAngularCharData() {
        return angularCharData;
    }

    public void setAngularCharData(AngularCharData angularCharData) {
        this.angularCharData = angularCharData;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "HtmlCharData{" +
                "\ntext='" + text + '\'' +
                "\n, angularCharData=" + angularCharData +
                "}\n";
    }
}
