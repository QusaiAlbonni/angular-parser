package org.classes;
//TODO
abstract public class Expression extends Node{

    public Expression() {
        super();
        this.setNodeType("Expression");
    }

    public Expression(Node parent, int lineNumber, String nodeType) {
        super(parent, lineNumber, "Expression");
    }

    @Override
    public abstract String generate();
}
