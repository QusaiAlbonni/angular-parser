package org.classes;

import java.util.ArrayList;
import java.util.List;

public class HtmlElement extends Html{

    private List<HtmlAttribute> htmlAttributes;
    private  HtmlContent htmlContent;
    private List<AngularAttribute> angularAttributes;
    public HtmlElement(){
        super();
        this.setNodeType("HtmlElement");
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
        if(htmlContent!=null){
            addChild(htmlContent);
        }
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

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");


        sb.append("div");


        if (htmlAttributes != null) {
            for (HtmlAttribute attr : htmlAttributes) {
                if (attr != null && attr.getValue() != null) {
                    sb.append(" ").append(attr.getValue());
                }
            }
        }


        if (angularAttributes != null) {
            for (AngularAttribute attr : angularAttributes) {
                if (attr != null) {
                    if (attr.getBindingAttribute() != null)
                        sb.append(" [").append(attr.getBindingAttribute().getTagName())
                                .append("]='").append(attr.getBindingAttribute().getAttributeValue()).append("'");
                    if (attr.getEventBindingAttribute() != null)
                        sb.append(" (").append(attr.getEventBindingAttribute().getTagName())
                                .append(")='").append(attr.getEventBindingAttribute().getAttributeValue()).append("'");
                    if (attr.getForAttribute() != null)
                        sb.append(" *ngFor='").append(attr.getForAttribute().getAttributeValue()).append("'");
                    if (attr.getIfAttribute() != null)
                        sb.append(" *ngIf='").append(attr.getIfAttribute().getAttributeValue()).append("'");
                }
            }
        }

        sb.append(">");


        if (htmlContent != null) {
            sb.append(htmlContent.generate());
        }

        sb.append("</div>");
        return sb.toString();
    }
}
