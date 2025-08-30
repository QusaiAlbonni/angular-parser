package org.classes;

public class HtmlCharData extends Html{
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
        if(text!=null&&angularCharData!=null){
        return "HtmlCharData{" +
                "\ntext='" + text + '\'' +
                "\nangularCharData=" + angularCharData +
                "}\n";

        }else if(text!=null){
        return "HtmlCharData{" +
                "\ntext='" + text + '\'' +
                "}\n";

        }else if(angularCharData!=null){
        return "HtmlCharData{" +
                "\nangularCharData=" + angularCharData +
                "}\n";

        }
        return"\nHtmlCharData\n";

    }

    public String toCode() {
        StringBuilder sb = new StringBuilder();
        if (text != null) {
            sb.append(text);
        }
        if (angularCharData != null) {
            sb.append(angularCharData.toCode());
        }
        return sb.toString();
    }
}
