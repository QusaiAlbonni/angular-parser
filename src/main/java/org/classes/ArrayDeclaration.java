package org.classes;

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

    public String toCode() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (argumentList != null) {
            sb.append(argumentList.toCode());
        }
        sb.append("]");
        return sb.toString();
    }
}
