package org.classes;

public class DecoratorApplication extends Statement{
    String name;
    ParameterList parameterList;

    public ParameterList getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return  "Decorator{" +
                "\nid: " + this.name +
                "\n parameterList: " + this.parameterList +
                "}";
    }
}
