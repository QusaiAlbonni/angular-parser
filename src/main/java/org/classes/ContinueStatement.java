package org.classes;
//TODO
public class ContinueStatement extends Statement{
    public ContinueStatement() {
        super();
        this.setNodeType("ContinueStatement");
    }

    @Override
    public String toString() {
        return "ContinueStatement{}";
    }

    public String generate() {
        return "continue;";
    }
}
