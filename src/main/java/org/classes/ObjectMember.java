package org.classes;

public class ObjectMember {
Expression expression;
String ID;
Template template;

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

    public Template getTemplate() {
        return template;
    }

    public void setTemplate(Template template) {
        this.template = template;
    }

    @Override
    public String toString() {
        if(template!=null){
            return "\nObjectMember{" +
                    "\ntemplate=" + template +
                    '}';
        }
        return "\nObjectMember{" +
                "\nexpression=" + expression +
                "\nID="+ ID+
                '}';
    }
}
