package org.symbolTable;

import org.symbolTable.ClassObject.E1_Object;

import java.util.Set;
import java.util.Stack;

public class E1_DuplicateFunctionNameSymbolTable {
    Stack<E1_Object>duplicateFunction=new Stack<E1_Object>();

    public Stack<E1_Object> getDuplicateFunction() {
        return duplicateFunction;
    }

    public void setDuplicateFunction(Stack<E1_Object> duplicateFunction) {
        this.duplicateFunction = duplicateFunction;
    }

    public boolean addSet(){
        E1_Object funcSet=new E1_Object();
       return duplicateFunction.add(funcSet);
    }
    public void delSet(){
//        getSet().print();
        duplicateFunction.pop();

    }

    public E1_Object getSet(){
        return  duplicateFunction.peek();
    }

    public void addFunName(String name){
        getSet().addVal(name);
    }

}
