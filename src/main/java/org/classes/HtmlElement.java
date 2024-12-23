package org.classes;

import java.util.List;

public class HtmlElement {

    private List<HtmlAttribute> htmlAttributes;

    public List<HtmlAttribute> getHtmlAttributes() {
        return htmlAttributes;
    }

    public void setHtmlAttributes(List<HtmlAttribute> htmlAttributes) {
        this.htmlAttributes = htmlAttributes;
    }

    @Override
    public String toString() {
        return "HtmlElement{" +
                "\nhtmlAttributes=" + htmlAttributes +
                "}\n";
    }
}
