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
}
