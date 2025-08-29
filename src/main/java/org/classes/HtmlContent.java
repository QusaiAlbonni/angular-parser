package org.classes;

import java.util.ArrayList;
import java.util.List;

public class HtmlContent  extends Html {
    private HtmlCharData htmlCharDataLeft;
    private HtmlCharData htmlCharDataRight;
    private List<HtmlElement> htmlElement;
    public  HtmlContent(){
        super();
        this.setNodeType("HtmlContent");
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
        if(htmlCharDataLeft!=null){
            addChild(htmlCharDataLeft);
        }
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
    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();

        if (htmlCharDataLeft != null) {
            sb.append(htmlCharDataLeft.generate());
        }

        for (HtmlElement element : htmlElement) {
            if (element != null) {
                sb.append(element.generate());
            }
        }

        if (htmlCharDataRight != null) {
            sb.append(htmlCharDataRight.generate());
        }

        return sb.toString();
    }
}
