package org.classes;

import java.util.ArrayList;
import java.util.List;

public class EnumDeclaration extends Statement{
    String id ;
    List<EnumMember> enumMembers;

    public EnumDeclaration() {
        super();
        this.setNodeType("EnumDeclaration");
        enumMembers = new ArrayList<>();
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
        for (EnumMember member : enumMembers) {
            addChild(member);
        }
    }

    @Override
    public String toString() {
        return "\nEnumDeclaration{" +
                "\nid='" + id + '\'' +
                "\nenumMembers=" + enumMembers +
                '}';
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("enum ").append(id).append(" {\n");
        for (int i = 0; i < enumMembers.size(); i++) {
            sb.append("  ").append(enumMembers.get(i).generate());
            if (i < enumMembers.size() - 1) {
                sb.append(",");
            }
            sb.append("\n");
        }
        sb.append("}");
        return sb.toString();
    }
}
