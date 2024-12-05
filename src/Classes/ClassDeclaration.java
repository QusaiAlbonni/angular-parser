package src.Classes;

import java.util.ArrayList;
import java.util.List;

public class ClassDeclaration extends Statement{
    String id;
    String extendsClass;
    List<String> implementsInterfaces;
//    List<ClassMember> classMembers;
    ClassBody classBody;
    public  ClassDeclaration(){
    implementsInterfaces=new ArrayList<>();
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

    public ClassBody getClassMembers() {
        return classBody;
    }

    public void setClassMembers(ClassBody classBody) {
        this.classBody = classBody;
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
