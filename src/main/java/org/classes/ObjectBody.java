package org.classes;

import java.util.*;

public class ObjectBody extends Expression{
List<ObjectMember> objectMemberList;

    public ObjectBody() {
        super();
        this.setNodeType("ObjectBody");
        objectMemberList=new ArrayList<>();
    }

    public List<ObjectMember> getObjectMemberList() {
        return objectMemberList;
    }

    public void setObjectMemberList(List<ObjectMember> objectMemberList) {
        this.objectMemberList = objectMemberList;
    }

    @Override
    public String toString() {
        return "\nObjectBody{" +
                "\nobjectMemberList=" + objectMemberList +
                '}';
    }


    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < objectMemberList.size(); i++) {
            sb.append(objectMemberList.get(i).generate());
            if (i < objectMemberList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
