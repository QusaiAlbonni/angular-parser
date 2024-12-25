package org.classes;

import java.util.ArrayList;
import java.util.List;

public class Template {
    private List<HtmlElement> htmlElements;
    public Template(){
        htmlElements=new ArrayList<>();
    }
    public List<HtmlElement> getHtmlElements() {
        return htmlElements;
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
}
