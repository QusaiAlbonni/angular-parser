package org.classes;

import java.util.ArrayList;
import java.util.List;

public class HtmlElement extends Html{

    private List<HtmlAttribute> htmlAttributes;
    private  HtmlContent htmlContent;
    private List<AngularAttribute> angularAttributes;
    public HtmlElement(){
        htmlAttributes=new ArrayList<>();
        angularAttributes=new ArrayList<>();
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

    public List<AngularAttribute> getAngularAttributes() {
        return angularAttributes;
    }

    public void setAngularAttributes(List<AngularAttribute> angularAttributes) {
        this.angularAttributes = angularAttributes;
    }

    @Override
    public String toString() {
        if(angularAttributes!=null && htmlAttributes!=null){
        return "HtmlElement{" +
                "\nhtmlAttributes=" + htmlAttributes +
                "\nangularAttributes=" + angularAttributes +
                "\nhtmlContent=" + htmlContent +
                "}\n";
        }
        if(angularAttributes!=null){
            return "HtmlElement{" +
                    "\nangularAttributes=" + angularAttributes +
                    "\nhtmlContent=" + htmlContent +
                    "}\n";
        }
        return "HtmlElement{" +
                "\nhtmlAttributes=" + htmlAttributes +
                "\nhtmlContent=" + htmlContent +
                "}\n";
    }
}
