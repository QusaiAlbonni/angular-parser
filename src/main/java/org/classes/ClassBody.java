package org.Classes;

import java.util.ArrayList;
import java.util.List;

//TODO
public class ClassBody {
List<ClassMember>members;
//List<ConstructorDeclaration>constructorDeclarationList;
    public  ClassBody(){
    members=new ArrayList<>();
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
    }

    @Override
    public String toString() {
        return "\nClassBody{" +
                "\nmembers=" + members +
                '}';
    }
}
