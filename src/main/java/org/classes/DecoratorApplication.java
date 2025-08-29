package org.classes;

public class DecoratorApplication extends Statement{
    String name;
    ParameterList parameterList;

    public DecoratorApplication() {
        super();
        this.setNodeType("DecoratorApplication");
    }
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

    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("@").append(name);
        if (parameterList != null && parameterList.getParameters().size() > 0) {
            sb.append("(");
            for (int i = 0; i < parameterList.getParameters().size(); i++) {
                Parameter param = parameterList.getParameters().get(i);
                sb.append(param.toString());
                if (i < parameterList.getParameters().size() - 1) {
                    sb.append(", ");
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }
}
