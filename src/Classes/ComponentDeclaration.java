package src.Classes;

import java.util.ArrayList;
import java.util.List;

public class ComponentDeclaration extends  Statement{

    String id ;
    List<PropertyDeclaration> propertyDeclarations;

    public ComponentDeclaration() {
        propertyDeclarations=new ArrayList<>();
    }

    public ComponentDeclaration(String id, List<PropertyDeclaration> propertyDeclarations) {
        this.id = id;
        this.propertyDeclarations = propertyDeclarations;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<PropertyDeclaration> getPropertyDeclarations() {
        return propertyDeclarations;
    }

    public void setPropertyDeclarations(List<PropertyDeclaration> propertyDeclarations) {
        this.propertyDeclarations = propertyDeclarations;
    }

    @Override
    public String toString() {
        return "\nComponentDeclaration{" +
                "\nid='" + id + '\'' +
                "\npropertyDeclarations=" + propertyDeclarations +
                '}';
    }
}
