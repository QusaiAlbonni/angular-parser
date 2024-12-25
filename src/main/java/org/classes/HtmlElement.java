package org.classes;

import java.util.ArrayList;
import java.util.List;

public class HtmlElement extends Html{

    private List<HtmlAttribute> htmlAttributes;
    private  HtmlContent htmlContent;
    public HtmlElement(){
        htmlAttributes=new ArrayList<>();
    }
    public List<HtmlAttribute> getHtmlAttributes() {
        return htmlAttributes;
    }

    public void setHtmlAttributes(List<HtmlAttribute> htmlAttributes) {
        this.htmlAttributes = htmlAttributes;
    }

    public HtmlContent getHtmlContent() {
        return htmlContent;
    }

    public void setHtmlContent(HtmlContent htmlContent) {
        this.htmlContent = htmlContent;
    }

    @Override
    public String toString() {
        return "HtmlElement{" +
                "\nhtmlAttributes=" + htmlAttributes +
                "\nhtmlContent=" + htmlContent +
                "}\n";
    }
}
