package org.classes;
//TODO
public class ContinueStatement extends Statement{
    @Override
    public String toString() {
        return "ContinueStatement{}";
    }

    @Override
    public String toCode() {
        return "continue;";
    }
}
