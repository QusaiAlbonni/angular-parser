package org.Classes;

import java.util.ArrayList;
import java.util.List;

public class EnumDeclaration extends Statement{
    String id ;
    List<EnumMember> enumMembers;

    public EnumDeclaration() {
        enumMembers=new ArrayList<>();
    }

    public EnumDeclaration(String id, List<EnumMember> enumMembers) {
        this.id = id;
        this.enumMembers = enumMembers;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<EnumMember> getEnumMembers() {
        return enumMembers;
    }

    public void setEnumMembers(List<EnumMember> enumMembers) {
        this.enumMembers = enumMembers;
    }

    @Override
    public String toString() {
        return "\nEnumDeclaration{" +
                "\nid='" + id + '\'' +
                "\nenumMembers=" + enumMembers +
                '}';
    }
}
