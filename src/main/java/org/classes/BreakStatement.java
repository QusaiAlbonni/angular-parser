package org.classes;
//TODO
public class BreakStatement extends Statement{
    @Override
    public String toString() {
        return "BreakStatement";
    }

    @Override
    public String toCode() {
        return "break;";
    }
}
