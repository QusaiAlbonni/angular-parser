    package org.classes;

    import java.util.ArrayList;
    import java.util.List;

    public class Template extends  Html {
        private List<HtmlElement> htmlElements;
        public Template(){
            super();
            this.setNodeType("Template");
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
        @Override
        public String generate() {
            StringBuilder sb = new StringBuilder();
            for (HtmlElement el : htmlElements) {
                sb.append(el.generate());
            }
            return sb.toString();
        }
    }
