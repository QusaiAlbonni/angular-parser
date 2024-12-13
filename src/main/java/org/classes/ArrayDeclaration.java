package org.Classes;

public class ArrayDeclaration extends Expression{
    ArgumentList argumentList;

    public ArrayDeclaration() {
    }


    public ArgumentList getArgumentList() {
        return argumentList;
    }

    public void setArgumentList(ArgumentList argumentList) {
        this.argumentList = argumentList;
    }

    @Override
    public String toString() {
        return "\nArrayDeclaration{" +
                "\nargumentList=" + argumentList +
                '}';
    }
}
