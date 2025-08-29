package org.classes;
//TODO
public class BreakStatement extends Statement{
    public BreakStatement() {
        super();
        this.setNodeType("BreakStatement");
    }

    @Override
    public String generate() {
        return "break;";
    }
    @Override
    public String toString() {
        return "BreakStatement";
    }
}
