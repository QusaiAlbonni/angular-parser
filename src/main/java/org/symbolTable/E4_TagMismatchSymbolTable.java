package org.symbolTable;

import java.util.Stack;

public class E4_TagMismatchSymbolTable {
    Stack<String>tag=new Stack<String>();

    public Stack<String> getTag() {
        return tag;
    }
    public  void  add(String name){
        this.tag.push(name);
    }
    public void pop(){
        this.tag.pop();
    }
    public String peek(){
        return this.tag.peek();
    }
}
