package org.classes;

public class ObjectInstantiation {
    String id;
    ArgumentList argumentList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArgumentList getArgumentList() {
        return argumentList;
    }

    public void setArgumentList(ArgumentList argumentList) {
        this.argumentList = argumentList;
    }

    @Override
    public String toString() {
        return "ObjectInstantiation{" +
                "\nid='" + id + '\'' +
                "\nargumentList=" + argumentList +
                '}';
    }

    public String toCode() {
        StringBuilder sb = new StringBuilder();
        sb.append("new ");
        if (id != null) {
            sb.append(id);
        }
        sb.append("(");
        if (argumentList != null) {
            sb.append(argumentList.toCode());
        }
        sb.append(")");
        return sb.toString();
    }
}
