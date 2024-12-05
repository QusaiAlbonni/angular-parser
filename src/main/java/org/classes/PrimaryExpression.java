package org.classes;
// PrimaryExpression.java
public class PrimaryExpression extends Expression {
    private String id; // Variable name
    private String stringValue; // String literal
    private Number numberValue; // Numeric literal
    private Boolean booleanValue; // Boolean literal
    private Object nullValue; // Null literal
    private Object undefinedValue; // Undefined literal

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

    public Number getNumberValue() {
        return numberValue;
    }

    public void setNumberValue(Number numberValue) {
        this.numberValue = numberValue;
    }

    public Boolean getBooleanValue() {
        return booleanValue;
    }

    public void setBooleanValue(Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    public Object getNullValue() {
        return nullValue;
    }

    public void setNullValue(Object nullValue) {
        this.nullValue = nullValue;
    }

    public Object getUndefinedValue() {
        return undefinedValue;
    }

    public void setUndefinedValue(Object undefinedValue) {
        this.undefinedValue = undefinedValue;
    }

    @Override
    public String toString() {
        return "\nPrimaryExpression{" +
                "\nid='" + id + '\'' +
                "\nstringValue='" + stringValue + '\'' +
                "\nnumberValue=" + numberValue +
                "\nbooleanValue=" + booleanValue +
                "\nnullValue=" + nullValue +
                "\nundefinedValue=" + undefinedValue +
                '}';
    }
}