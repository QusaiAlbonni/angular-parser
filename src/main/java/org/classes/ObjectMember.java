package org.Classes;

public class ObjectMember {
Expression expression;
String ID;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public ObjectMember(){

    }
    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "\nObjectMember{" +
                "\nexpression=" + expression +
                "\nID="+ ID+
                '}';
    }
}
