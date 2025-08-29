package org.classes;

import java.util.ArrayList;
import java.util.List;

public class ClassDeclaration extends Statement{
    String id;
    String extendsClass;
    List<String> implementsInterfaces;
//    List<ClassMember> classMembers;
    ClassBody classBody;
    public  ClassDeclaration(){
        super();
    implementsInterfaces=new ArrayList<>();
        this.setNodeType("ClassDeclaration");
    }
    public ClassDeclaration(String id, String extendsClass, List<String> implementsInterfaces, ClassBody classBody) {
        this.id = id;
        this.extendsClass = extendsClass;
        this.implementsInterfaces = implementsInterfaces;
        this.classBody =classBody;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExtendsClass() {
        return extendsClass;
    }

    public void setExtendsClass(String extendsClass) {
        this.extendsClass = extendsClass;
    }

    public List<String> getImplementsInterfaces() {
        return implementsInterfaces;
    }

    public void setImplementsInterfaces(List<String> implementsInterfaces) {
        this.implementsInterfaces = implementsInterfaces;
    }

    public ClassBody getClassBody() {
        return classBody;
    }

    public void setClassBody(ClassBody classBody) {
        this.classBody = classBody;
        if (classBody != null) {
            for (ClassMember member : classBody.getMembers()) {
                this.addChild(member);
            }
        }
    }


    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ").append(id);
        if (extendsClass != null && !extendsClass.isEmpty()) {
            sb.append(" extends ").append(extendsClass);
        }
        if (!implementsInterfaces.isEmpty()) {
            sb.append(" implements ").append(String.join(", ", implementsInterfaces));
        }
        sb.append(" {\n");
        if (classBody != null) {
            for (ClassMember member : classBody.getMembers()) {
                sb.append(member.generate()).append("\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    @Override
    public String toString() {
        return "\nClassDeclaration{" +
                "\nid='" + id + '\'' +
                "\nextendsClass='" + extendsClass + '\'' +
                "\nimplementsInterfaces=" + implementsInterfaces +
                "\nclassBody=" + classBody +
                '}';
    }
}
