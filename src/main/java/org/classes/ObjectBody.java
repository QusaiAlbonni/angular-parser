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

    public String toCode() {
        StringBuilder sb = new StringBuilder();
        if (objectMemberList != null && !objectMemberList.isEmpty()) {
            for (int i = 0; i < objectMemberList.size(); i++) {
                if (objectMemberList.get(i) != null) {
                    sb.append(objectMemberList.get(i).toCode());
                    if (i < objectMemberList.size() - 1) {
                        sb.append(", ");
                    }
                }
            }
        }
        return sb.toString();
    }
}
