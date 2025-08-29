package org.classes;

import org.antlr.AngularParser;

public class ClassMember extends Node{
    private String visibility; // public, private, protected
    private boolean isStatic;
    private String name;
    private boolean isConstructor;
    private boolean isProperty;
    private boolean isMethod;
    private boolean isEnum;
    private boolean isExpression;
    private MethodDeclaration method;
    private VariableDeclaration variable;
    private ConstructorDeclaration constructorDeclaration;
    private TypeAnnotation typeAnnotation;
    private EnumDeclaration enumDeclaration;
    private Statement expressionStatement;


    public ClassMember() {
        super();
        this.setNodeType("ClassMember");
    }
    public ConstructorDeclaration getConstructorDeclaration() {
        return constructorDeclaration;
    }

    public void setConstructorDeclaration(ConstructorDeclaration constructorDeclaration) {
        this.constructorDeclaration = constructorDeclaration;
        if (constructorDeclaration != null) addChild(constructorDeclaration);
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public boolean isStatic() {
        return isStatic;
    }

    public void setStatic(boolean aStatic) {
        isStatic = aStatic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isConstructor() {
        return isConstructor;
    }

    public void setConstructor(boolean constructor) {
        isConstructor = constructor;
    }

    public boolean isProperty() {
        return isProperty;
    }

    public void setProperty(boolean property) {
        isProperty = property;
    }

    public MethodDeclaration getMethod() {
        return method;
    }

    public void setMethod(MethodDeclaration method) {
        this.method = method;
        if (method != null) addChild(method);
    }


    public VariableDeclaration getVariable() {
        return variable;
    }

    public void setVariable(VariableDeclaration variable) {
        this.variable = variable;
        if (variable != null) addChild(variable);
    }
    public EnumDeclaration getEnumDeclaration() {
        return enumDeclaration;
    }

    public void setEnumDeclaration(EnumDeclaration enumDeclaration) {
        this.enumDeclaration = enumDeclaration;
        if (enumDeclaration != null) addChild(enumDeclaration);
    }

    public TypeAnnotation getTypeAnnotation() {
        return typeAnnotation;
    }

    public void setTypeAnnotation(TypeAnnotation typeAnnotation) {
        this.typeAnnotation = typeAnnotation;
        if (typeAnnotation != null) addChild(typeAnnotation);
    }
    public void setIsMethod(boolean isMethod){
        this.isMethod=isMethod;
    }
    public void setIsEnum(boolean isEnum){
        this.isEnum=isEnum;
    }
    public void setIsExpression(boolean isExpression){
        this.isExpression=isExpression;
    }

    public Statement getExpressionStatement() {
        return expressionStatement;
    }

    public void setExpressionStatement(Statement expressionStatement) {
        this.expressionStatement = expressionStatement;
        if (expressionStatement != null) addChild(expressionStatement);
    }


    @Override
    public String generate() {
        if (isConstructor && constructorDeclaration != null) return constructorDeclaration.generate();
        if (isProperty && variable != null) return variable.generate();
        if (isMethod && method != null) return method.generate();
        if (isEnum && enumDeclaration != null) return enumDeclaration.generate();
        if (isExpression && expressionStatement != null) return expressionStatement.toString();
        return "";
    }
    @Override
    public String toString() {
        if (isConstructor) {
            return "\nClassMember{" +
                    "\nconstructoDeclaration=" + constructorDeclaration +
                    "\nvisibility='" + visibility + '\'' +
                    "\nisStatic=" + isStatic +
                    '}';
        } else if (isProperty) {
            return "\nClassMember{" +
                    "\nvisibility='" + visibility + '\'' +
                    "\nisStatic=" + isStatic +
                    "\nname='" + name + '\'' +
                    "\nvariable=" + variable +
                    '}';
        } else if (isMethod) {
            return "\nClassMember{" +
                    "\n"+method+
                    '}';
        }else if (isEnum) {
            return "\nClassMember{" +
                    enumDeclaration+
                    '}';
        }else if (isExpression) {
            return "\nClassMember{" +
                    expressionStatement+
                    '}';
        }
        else {
            return "\nClassMember{" +
                    "\nvisibility='" + visibility + '\'' +
                    "\nisStatic=" + isStatic +
                    "\nname='" + name + '\'' +
                    "\ntype=" + typeAnnotation +
                    '}';

        }
    }
}
