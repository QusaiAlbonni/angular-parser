package org.classes;

import java.util.ArrayList;
import java.util.List;

public class HtmlElement extends Html{

    private List<HtmlAttribute> htmlAttributes;
    private  HtmlContent htmlContent;
    private AngularAttribute angularAttributel;
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

    public AngularAttribute getAngularAttributel() {
        return angularAttributel;
    }

    public void setAngularAttributel(AngularAttribute angularAttributel) {
        this.angularAttributel = angularAttributel;
    }

    @Override
    public String toString() {
        if(angularAttributel!=null && htmlAttributes!=null){
        return "HtmlElement{" +
                "\nhtmlAttributes=" + htmlAttributes +
                "\nangularAttributes=" + angularAttributel +
                "\nhtmlContent=" + htmlContent +
                "}\n";
        }
        if(angularAttributel!=null){
            return "HtmlElement{" +
                    "\nangularAttributes=" + angularAttributel +
                    "\nhtmlContent=" + htmlContent +
                    "}\n";
        }
        return "HtmlElement{" +
                "\nhtmlAttributes=" + htmlAttributes +
                "\nhtmlContent=" + htmlContent +
                "}\n";
    }
}
