package org.classes;

public abstract class Html extends Node{
    public Html() {
        super();
        this.setNodeType("Html");
    }

    public Html(Node parent, int lineNumber, String nodeType) {
        super(parent, lineNumber, "Html");
    }
    @Override
    public abstract String generate();
}
