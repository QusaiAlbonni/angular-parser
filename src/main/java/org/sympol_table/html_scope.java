package org.sympol_table;

import org.main.Main;

public class html_scope {
    int id ;
    html_scope parent ;

    public html_scope(html_scope scope){
        this.id = scope.id+1 ;
        this.parent = scope ;
    }

    public html_scope(){
        this.id = 1 ;
        this.parent = null ;
    }

    public int getId() {
        return id;
    }

    public static void create_scope(){
        html_scope scope ;
        if(Main.htmlSympolTable.Stack.isEmpty()){
            scope = new html_scope();
        }else{
            html_scope parent = Main.htmlSympolTable.getStack().peek();
            scope = new html_scope(parent);
        }
        Main.htmlSympolTable.getStack().push(scope);
    }

    public  static  void remove_scope(){
        Main.htmlSympolTable.getStack().pop();
    }
}
