package org.sympol_table;

public class html_sympol {
    String Inner ;
    String Attributes ;
    String AngularAttributes ;
    String Tag ;
    int level ;


    public  html_sympol(){
        Inner = "null";
        Attributes = "null";
        AngularAttributes = "null" ;
        Tag = "null" ;
        level = 0 ;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public String getInner() {
        return Inner;
    }

    public void setInner(String inner) {
        Inner = inner;
    }

    public String getAttributes() {
        return Attributes;
    }

    public void setAttributes(String attributes) {
        Attributes = attributes;
    }

    public String getTag() {
        return Tag;
    }

    public void setTag(String tag) {
        Tag = tag;
    }

    public void setAngularAttributes(String angularAttributes) {
        AngularAttributes = angularAttributes;
    }

    public String getAngularAttributes() {
        return AngularAttributes;
    }
}
