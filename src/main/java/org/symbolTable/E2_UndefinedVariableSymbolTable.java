package org.symbolTable;

import org.main.Main;
import org.symbolTable.ClassObject.E2_Object;

import java.util.*;

public class E2_UndefinedVariableSymbolTable {
    String parent;
    Map<String, E2_Object> save=new HashMap<String,E2_Object>();
    boolean isE2=false;





    public  void  addSymbol(String name) {
        Main.e2.clear();
        this.parent =name;
    }

    public void addAtrr(){
        E2_Object test = new E2_Object();

        for (int i = 0 ; i<Main.e2.size();i++){
            test.addAtt(Main.e2.getByI(i));
        }
        this.save.put(this.parent,test);
//        Main.e2.clear();
    }

    public Map<String,E2_Object> getSave(){
        return  this.save;
    }

    public void setIsE2(boolean e2) {
        isE2 = e2;
    }
    public boolean getIsE2(){
        return  isE2;
    }

}
