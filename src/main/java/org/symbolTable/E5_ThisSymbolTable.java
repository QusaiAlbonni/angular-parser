package org.symbolTable;

import java.util.Stack;

public class E5_ThisSymbolTable {
    private Stack<Boolean> classScopeStack = new Stack<>();

    public void enterClass() {
        classScopeStack.push(true);
    }

    public void exitClass() {
        if (!classScopeStack.isEmpty()) {
            classScopeStack.pop();
        }
    }

    public boolean isThisAllowed() {
        return !classScopeStack.isEmpty(); // مسموح استخدام this فقط إذا كنا داخل كلاس
    }

    // للعرض والتصحيح (اختياري)
    public void printScopeStatus() {
        System.out.println("Current class scope depth: " + classScopeStack.size());
    }
}
