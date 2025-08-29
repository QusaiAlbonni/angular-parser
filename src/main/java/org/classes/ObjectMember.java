package org.classes;

public class ObjectMember extends Expression {
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
        super();
        this.setNodeType("ObjectMember");
    }
    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
        if (expression != null) addChild(expression);
    }

    public Template getTemplate() {
        return template;
    }

    public void setTemplate(Template template) {
        this.template = template;
        if(template!=null)addChild(template);
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

    public String generate() {
        StringBuilder sb = new StringBuilder();
        if (ID != null) {
            sb.append(ID).append(": ");
        }
        if (expression != null) {
            sb.append(expression.generate());
        } else if (template != null) {
            sb.append(template.generate());
        } else {
            sb.append("null");
        }
        return sb.toString();
    }
}
