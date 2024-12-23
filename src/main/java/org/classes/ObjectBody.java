package org.classes;

import java.util.*;

public class ObjectBody {
List<ObjectMember> objectMemberList;

    public ObjectBody() {
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
}
