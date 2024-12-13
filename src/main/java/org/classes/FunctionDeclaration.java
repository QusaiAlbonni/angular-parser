package org.Classes;

import java.util.List;

public class FunctionDeclaration extends Statement{
    String id ;
//    List<Parameter>parameters;
    ParameterList parameters;
    BlockStatement body;

    public FunctionDeclaration(String id, ParameterList parameters, BlockStatement body) {
        this.id = id;
        this.parameters = parameters;
        this.body = body;
    }
    public FunctionDeclaration(){

    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        return "\nFunctionDeclaration{" +
                "\nid='" + id + '\'' +
                "\nparameters=" + parameters +
                "\nbody=" + body +
                '}';
    }
}
