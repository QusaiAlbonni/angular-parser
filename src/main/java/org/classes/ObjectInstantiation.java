package org.classes;

public class ObjectInstantiation extends Expression {
    String id;
    ArgumentList argumentList;
    public ObjectInstantiation() {
        super();
        this.setNodeType("ObjectInstantiation");
    }
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
        if (argumentList != null) addChild(argumentList);
    }

    @Override
    public String toString() {
        return "ObjectInstantiation{" +
                "\nid='" + id + '\'' +
                "\nargumentList=" + argumentList +
                '}';
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append(id).append("(");
        if (argumentList != null) {
            sb.append(argumentList.generate());
        }
        sb.append(")");
        return sb.toString();
    }
}
