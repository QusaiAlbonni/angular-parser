package org.sympol_table;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

public class sympol_table {
    List<sympol> sympols = new ArrayList<>();
    java.util.Stack<scope> Stack = new Stack<>();

    public List<sympol> getSympols() {
        return sympols;
    }

    public void setSympols(List<sympol> sympols) {
        this.sympols = sympols;
    }

    public void setStack(java.util.Stack<scope> stack) {
        Stack = stack;
    }

    public java.util.Stack<scope> getStack() {
        return Stack;
    }

    public void print(){
        System.out.println("Name"+"             "+"Value"+"             "+"Type"+"               "+"Scope");
        System.out.println("______________________________________________________________________________________________________________");
        for (int i =0 ; i< sympols.size() ; i++){
            if (sympols.get(i)!= null ){
                if(!((Objects.equals(sympols.get(i).getName(), "null")||sympols.get(i).getName()==null)&&(Objects.equals(sympols.get(i).getScope(), "null")||sympols.get(i).getScope()==null))){
                    System.out.println(sympols.get(i).getName() + "      "+sympols.get(i).getValue() + "      "+sympols.get(i).getType()+ "        "+sympols.get(i).getScope());
                    System.out.println("______________________________________________________________________________________________________________");
                }
                }
        }
    }
}
