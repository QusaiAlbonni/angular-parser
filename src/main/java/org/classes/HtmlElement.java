package org.classes;

import java.util.ArrayList;
import java.util.List;

public class HtmlElement extends Html{

    public boolean earlyTermination = false;
    private String tagName;
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

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
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

    public String toCode() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(tagName);

        if (htmlAttributes != null && !htmlAttributes.isEmpty()) {
            for (HtmlAttribute attr : htmlAttributes) {
                sb.append(" ").append(attr.toCode());
            }
        }

        // Add Angular attributes
        if (angularAttributes != null && !angularAttributes.isEmpty()) {
            for (AngularAttribute attr : angularAttributes) {
                String attrCode = attr.toCode();
                if (!attrCode.isEmpty()) {
                    sb.append(" ").append(attrCode);
                }
            }
        }

        if (earlyTermination){
            sb.append("/>");
            return sb.toString();
        }

        sb.append(">");

        // Add content
        if (htmlContent != null) {
            sb.append(htmlContent.toCode());
            sb.append("\n");
        }

        // Close tag
        sb.append("</");
        sb.append(tagName);
        sb.append(">");

        return sb.toString();
    }
}
