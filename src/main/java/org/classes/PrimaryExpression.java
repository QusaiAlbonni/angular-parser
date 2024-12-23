package org.classes;

import java.util.Objects;

// PrimaryExpression.java
public class PrimaryExpression extends Expression {
    private String id; // Variable name
    private String stringValue; // String literal
    private String numberValue; // Numeric literal
    private String booleanValue; // Boolean literal
    private String nullValue; // Null literal
    private String undefinedValue; // Undefined literal

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public String getNumberValue() {
        return numberValue;
    }

    public void setNumberValue(String numberValue) {
        this.numberValue = numberValue;
    }

    public String getBooleanValue() {
        return booleanValue;
    }

    public void setBooleanValue(String booleanValue) {
        this.booleanValue = booleanValue;
    }

    public Object getNullValue() {
        return nullValue;
    }

    public void setNullValue(String nullValue) {
        this.nullValue = nullValue;
    }

    public Object getUndefinedValue() {
        return undefinedValue;
    }

    public void setUndefinedValue(String undefinedValue) {
        this.undefinedValue = undefinedValue;
    }

    @Override
    public String toString() {
        if(!Objects.equals(stringValue, null)){
        return "\nPrimaryExpression{" +
                "\nid='" + id + '\'' +
                "\nstringValue='" + stringValue + '\'' +
                '}';
    }
        if(!Objects.equals(numberValue, null)){
        return "\nPrimaryExpression{" +
                "\nnumberValue='" + numberValue + '\'' +
                '}';
    }
        if(!Objects.equals(booleanValue, null)){
        return "\nPrimaryExpression{" +
                "\nid='" + id + '\'' +
                "\nbooleanValue='" + booleanValue + '\'' +
                '}';
    }
        if(!Objects.equals(nullValue, null)){
        return "\nPrimaryExpression{" +
                "\nid='" + id + '\'' +
                "\nnullValue='" + nullValue + '\'' +
                '}';
    }
        if(!Objects.equals(undefinedValue, null)){
        return "\nPrimaryExpression{" +
                "\nid='" + id + '\'' +
                "\nundefinedValue='" + undefinedValue + '\'' +
                '}';
    }
        if(!Objects.equals(id,null)){
            return "\nPrimaryExpression{" +
                    "\nid='" + id + '\'' +
                    '}';
        }
       return "error in primary expression";

    }
}