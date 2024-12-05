package src.Classes;

import java.util.ArrayList;
import java.util.List;

public class ServiceDeclaration extends Statement{
    String id;
    List<MethodDeclaration> methodDeclarations;

    public ServiceDeclaration() {
        methodDeclarations=new ArrayList<>();
    }

    public ServiceDeclaration(String id, List<MethodDeclaration> methodDeclarations) {
        this.id = id;
        this.methodDeclarations = methodDeclarations;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<MethodDeclaration> getMethodDeclarations() {
        return methodDeclarations;
    }

    public void setMethodDeclarations(List<MethodDeclaration> methodDeclarations) {
        this.methodDeclarations = methodDeclarations;
    }

    @Override
    public String toString() {
        return "\nServiceDeclaration{" +
                "\nid='" + id + '\'' +
                "\nmethodDeclarations=" + methodDeclarations +
                '}';
    }
}
