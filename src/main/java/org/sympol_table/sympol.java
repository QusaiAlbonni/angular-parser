package org.sympol_table;

public class sympol {
 String name ;
 String value ;
 String type ;
 String scope ;

 public sympol(){
     name = null;
     value = null ;
     type = null;
     scope = null;
 }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getScope() {
        return scope;
    }
}
