package org.classes;
//TODO
public class Parameter extends Node {

    TypeAnnotation type;
    String name;
    ExpressionStatement expressionStatement;
    public  Parameter(){
        super();
        this.setNodeType("Parameter");
    }
    public Parameter(TypeAnnotation type, String name, ExpressionStatement expression) {
        super();
        this.setNodeType("Parameter");
        this.type = type;
        this.name = name;
        this.expressionStatement = expression;
        if (type != null) {
            this.addChild(type);
        }
        if (expressionStatement != null) {
            this.addChild(expressionStatement);
        }
    }

    public TypeAnnotation getType() {
        return type;
    }

    public void setType(TypeAnnotation type) {
        this.type = type;
        if (type != null) {
            this.addChild((Node) type);
        }
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
        if (expressionStatement != null) {
            this.addChild((Node) expressionStatement);
        }
    }

    @Override
    public String generate() {
        if (expressionStatement != null) {
            return expressionStatement.generate();
        } else if (type != null) {
            return name + ": " + type.generate();
        } else {
            return name != null ? name : "";
        }
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
}
