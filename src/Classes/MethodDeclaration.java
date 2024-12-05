package src.Classes;

import java.util.ArrayList;
import java.util.List;

//TODO
public class MethodDeclaration {
    String name ;
    TypeAnnotation returnType;
    ParameterList parameters;
    BlockStatement body;

    public MethodDeclaration() {
    }

    public MethodDeclaration(TypeAnnotation returnType, String name, ParameterList parameters, BlockStatement body) {
        this.returnType = returnType;
        this.name = name;
        this.parameters = parameters;
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeAnnotation getReturnType() {
        return returnType;
    }

    public void setReturnType(TypeAnnotation returnType) {
        this.returnType = returnType;
    }

    public ParameterList getParameters() {
        return parameters;
    }

    public void setParameters(ParameterList parameters) {
        this.parameters = parameters;
    }

    public BlockStatement getBody() {
        return body;
    }

    public void setBody(BlockStatement body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "\nMethodDeclaration{" +
                "\nname='" + name + '\'' +
                "\nreturnType='" + returnType + '\'' +
                "\nparameters=" + parameters +
                "\nbody=" + body +
                '}';
    }
}
