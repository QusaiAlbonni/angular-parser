package org.classes;

import java.util.ArrayList;
import java.util.List;

//TODO
public class ClassBody extends Node {
List<ClassMember>members;
//List<ConstructorDeclaration>constructorDeclarationList;
    public  ClassBody(){
        super();
    members=new ArrayList<>();
        this.setNodeType("ClassBody");
//    constructorDeclarationList=new ArrayList<>();
    }

//    public List<ConstructorDeclaration> getConstructorDeclarationList() {
//        return constructorDeclarationList;
//    }
//
//    public void setConstructorDeclarationList(List<ConstructorDeclaration> constructorDeclarationList) {
//        this.constructorDeclarationList = constructorDeclarationList;
//    }

    public ClassBody(List<ClassMember> members) {
        this.members = members;
    }

    public List<ClassMember> getMembers() {
        return members;
    }

    public void setMembers(List<ClassMember> members) {
        this.members = members;
        for (ClassMember member : this.members) {
            this.addChild(member);
        }
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        for (ClassMember member : members) {
            sb.append(member.generate()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "\nClassBody{" +
                "\nmembers=" + members +
                '}';
    }
}
