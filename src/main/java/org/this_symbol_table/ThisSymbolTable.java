package org.this_symbol_table;

public class ThisSymbolTable {
    private boolean insideClass = false;

    public void enterClass() {
        insideClass = true;
    }

    public void exitClass() {
        insideClass = false;
    }

    public boolean isThisAllowed() {
        return insideClass;
    }
}
