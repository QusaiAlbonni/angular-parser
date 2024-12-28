package org.sympol_table;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class html_sympol_table {

    List<html_sympol> sympols = new ArrayList<>();

    java.util.Stack<html_scope> Stack = new Stack<>();

    public List<html_sympol> getSympols() {
        return sympols;
    }

    public void setSympols(List<html_sympol> sympols) {
        this.sympols = sympols;
    }

    public java.util.Stack<html_scope> getStack() {
        return Stack;
    }

    public void setStack(java.util.Stack<html_scope> stack) {
        Stack = stack;
    }

    public void print(){
        System.out.println("Tag"+"             "+"level"+"             "+"attribute"+"               "+"Angular_attribute"+"               "+"InnerText");
        System.out.println("______________________________________________________________________________________________________________");
        for (int i =0 ; i< sympols.size() ; i++){
            if (sympols.get(i)!= null ){
                System.out.println(sympols.get(i).getTag() + "      "+sympols.get(i).getLevel() + "      "+sympols.get(i).getAttributes()+ "        "+sympols.get(i).getAngularAttributes()+ "        "+sympols.get(i).getInner());
                System.out.println("______________________________________________________________________________________________________________");
            }
        }
    }
}
