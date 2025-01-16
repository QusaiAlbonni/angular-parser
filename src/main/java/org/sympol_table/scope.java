package org.sympol_table;

import org.main.Main;

public class scope {
   static int idcount = 1 ; ;
    int id ;
    String title ;
    scope parent ;
    public scope(scope scope , String title){
        this.title = title ;
        this.id = scope.id+1 ;
        this.parent = scope ;
    }

    public scope(String title){
        this.title = title ;
        this.id = 1 ;
        this.parent = null ;
    }
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public static int getIdcount() {
        return idcount;
    }

    public static void create_scope(String title){
        idcount+=1 ;
        scope scope ;
        if(Main.sympolTable.Stack.isEmpty()){
            scope = new scope(title);
        }else{
            scope parent = Main.sympolTable.getStack().peek();
            scope = new scope(parent , title);
        }
        Main.sympolTable.getStack().push(scope);
    }

    public  static  void remove_scope(){
        Main.sympolTable.getStack().pop();
    }

}
