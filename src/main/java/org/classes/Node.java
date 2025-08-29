package org.classes;

import java.util.ArrayList;
import java.util.List;

public abstract class Node {


    private String nodeType;
    private Node parent;
    private List<Node> children;
    private int lineNumber;


    public Node() {
        this.children = new ArrayList<>();
    }

    public Node(Node parent, int lineNumber, String nodeType) {
        this.parent = parent;
        this.children = new ArrayList<>();
        this.lineNumber = lineNumber;
        this.nodeType = nodeType;
    }

    public abstract String generate();

    public void addChild(Node child) {
        this.children.add(child);
        child.setParent(this);
    }

    public void printNode() {
        if (this.parent != null)
            System.out.println(this.lineNumber + " - Node Type: " + this.nodeType +
                    " | Parent: " + this.parent.getNodeType());
        else
            System.out.println(this.lineNumber + " - Node Type: " + this.nodeType +
                    " | Parent: null");
    }

    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public List<Node> getChildren() {
        return children;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }
}

