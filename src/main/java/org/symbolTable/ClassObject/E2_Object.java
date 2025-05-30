package org.symbolTable.ClassObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class E2_Object {
    Stack<String> attributes=new Stack<>();

    public void  addAtt(String name){
        if(!this.attributes.contains(name)){

            this.attributes.push(name);
        }
    }

    public String print(){
        String test = "";
        for (int i =0 ;i<attributes.size(); i++){
            test+= attributes.peek()+" ";
        }
        return test ;
    }

    public void clear() {
        this.attributes.clear();
    }

    public int size(){
        return attributes.size();
    }
    public String getByI(int i) {
        return attributes.pop();
    }
}
