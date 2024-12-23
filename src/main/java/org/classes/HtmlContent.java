package org.classes;

public class HtmlContent {
    private HtmlCharData htmlCharDataLeft;
    private HtmlCharData htmlCharDataRight;
    private HtmlElement htmlElement;

    public HtmlElement getHtmlElement() {
        return htmlElement;
    }

    public void setHtmlElement(HtmlElement htmlElement) {
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
                "\n, htmlCharDataRight=" + htmlCharDataRight +
                "\n, htmlElement=" + htmlElement +
                "}\n";
    }
}
