package org.classes;

import java.util.ArrayList;
import java.util.List;

public class HtmlContent  extends Html {
    public String literalChars;
    private HtmlCharData htmlCharDataLeft;
    private HtmlCharData htmlCharDataRight;
    private List<HtmlElement> htmlElement;
    public  HtmlContent(){
        htmlElement=new ArrayList<>();
    }
    public List<HtmlElement> getHtmlElement() {
        return htmlElement;
    }

    public void setHtmlElement(List<HtmlElement> htmlElement) {
        this.htmlElement = htmlElement;
    }

    public HtmlCharData getHtmlCharDataLeft() {
        return htmlCharDataLeft;
    }

    public void setHtmlCharDataLeft(HtmlCharData htmlCharDataLeft) {
        this.htmlCharDataLeft = htmlCharDataLeft;
    }

    public HtmlCharData getHtmlCharDataRight() {
        return htmlCharDataRight;
    }

    public void setHtmlCharDataRight(HtmlCharData htmlCharDataRight) {
        this.htmlCharDataRight = htmlCharDataRight;
    }

    @Override
    public String toString() {
        return "HtmlContent{" +
                "htmlCharDataLeft=" + htmlCharDataLeft +
                "\nhtmlCharDataRight=" + htmlCharDataRight +
                "\nhtmlElement=" + htmlElement +
                "}\n";
    }

    public String toCode() {
        StringBuilder sb = new StringBuilder();
        if (literalChars != null) {
            sb.append(literalChars);
        }
        if (htmlElement != null && !htmlElement.isEmpty()) {
            for (HtmlElement element : htmlElement) {
                sb.append("\n");
                sb.append(element.toCode());
            }
        }
        sb.append("\n");
        return sb.toString();
    }
}
