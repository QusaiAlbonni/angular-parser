package org.classes;
//TODO
public class Parameter {

    TypeAnnotation type;
    String name;
    ExpressionStatement expressionStatement;
    public  Parameter(){}
    public Parameter(TypeAnnotation type, String name, ExpressionStatement expression) {
        this.type = type;
        this.name = name;
        this.expressionStatement = expression;
    }

    public TypeAnnotation getType() {
        return type;
    }

    public void setType(TypeAnnotation type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ExpressionStatement getExpressionStatement() {
        return expressionStatement;
    }

    public void setExpressionStatement(ExpressionStatement expressionStatement) {
        this.expressionStatement = expressionStatement;
    }

    @Override
    public String toString() {
        if (type != null) {
            return "\nParameter{" +
                    "\ntype='" + type + '\'' +
                    "\nname='" + name + '\'' +
                    '}';
        }
        else {
            return  expressionStatement.toString();
        }
    }

    String toCode(){
        return this.name;
    }
}
