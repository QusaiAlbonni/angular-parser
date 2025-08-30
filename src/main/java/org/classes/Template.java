package org.classes;

import java.util.ArrayList;
import java.util.List;

public class Template {
    private List<HtmlElement> htmlElements;
    private String literal;

    public Template(){
        htmlElements=new ArrayList<>();
    }
    public List<HtmlElement> getHtmlElements() {
        return htmlElements;
    }

    public void setLiteral(String literal) {
        this.literal = literal;
    }

    public String getLiteral(){
        return this.literal;
    }

    public void setHtmlElements(List<HtmlElement> htmlElements) {
        this.htmlElements = htmlElements;
    }

    @Override
    public String toString() {
        return "Template{" +
                "\nhtmlElements=" + htmlElements +
                "}\n";
    }

    public String toCode(){
        StringBuilder sb = new StringBuilder();
        for (HtmlElement element: this.htmlElements){
            sb.append(element.toCode()).append("\n");
        }
        return sb.toString();
    }
}
