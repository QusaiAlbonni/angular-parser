package org.symbolTable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class E3_UndefinedFunctionSymbolTable {
    Map<String,String>checkMap=new HashMap<String,String>();
    Set<String>saveSet=new HashSet<String>();
    public Map<String,String> getCheckMap(){
        return  checkMap;
    };
    public void addVal(String name,int line){
        String funName =name.replaceAll("\"", "").replaceAll("\\(.*\\)", "");
        this.checkMap.put(funName,String.valueOf(line));
    }
    public void print(){
        this.checkMap.forEach((key,value)->{
            System.out.println("key:"+key+"value:"+value);
        });;
    }

    public Set<String> getSaveSet() {
        return saveSet;
    }
    public void  addValue(String name){
        this.saveSet.add(name);
    }
    public void  printSet(){
        System.out.println(this.saveSet);
    }
}
