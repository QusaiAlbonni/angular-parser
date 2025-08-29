package org.classes;

import java.util.List;

public class FunctionDeclaration extends Statement{
    String id ;
    ParameterList parameters;
    BlockStatement body;

    public FunctionDeclaration(String id, ParameterList parameters, BlockStatement body) {
        this.id = id;
        this.parameters = parameters;
        this.body = body;
    }
    public FunctionDeclaration() {
        super();
        this.setNodeType("FunctionDeclaration");
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
        if (parameters != null) addChild(parameters);
    }

    public BlockStatement getBody() {
        return body;
    }

    public void setBody(BlockStatement body) {
        this.body = body;
        if (body != null) addChild(body);
    }

    @Override
    public String toString() {
        return "\nFunctionDeclaration{" +
                "\nid='" + id + '\'' +
                "\nparameters=" + parameters +
                "\nbody=" + body +
                '}';
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("function ").append(id != null ? id : "").append("(");
        if (parameters != null && parameters.getParameters() != null) {
            for (int i = 0; i < parameters.getParameters().size(); i++) {
                sb.append(parameters.getParameters().get(i).getName());
                if (i < parameters.getParameters().size() - 1) {
                    sb.append(", ");
                }
            }
        }
        sb.append(") ");
        if (body != null) {
            sb.append(body.generate());
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }
}
