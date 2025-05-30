package org.symbolTable.ClassObject;

import java.util.HashSet;
import java.util.Set;

public class E1_Object {
    Set<String>set=new HashSet<String>();

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public boolean  addVal(String name){
        if(this.set.contains(name)){
            return true;
        }
        this.set.add(name);
        return  false;
    }

    public void print(){
        System.out.println(this.set);
    }


}
