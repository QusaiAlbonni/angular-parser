package org.classes;

public class ArrayDeclaration extends Expression{
    ArgumentList argumentList;

    public ArrayDeclaration() {
        super();
        this.setNodeType("ArrayDeclaration");
    }


    public ArgumentList getArgumentList() {
        return argumentList;
    }

    public void setArgumentList(ArgumentList argumentList) {
        this.argumentList = argumentList;
        if (argumentList != null) {
            addChild(argumentList);
        }
    }
    @Override
    public String generate() {
        String argsCode = argumentList != null ? argumentList.generate() : "";
        return "[" + argsCode + "]";
    }
    @Override
    public String toString() {
        return "\nArrayDeclaration{" +
                "\nargumentList=" + argumentList +
                '}';
    }
}
