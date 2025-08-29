package org.classes;

import java.util.ArrayList;
import java.util.List;

//TODO
public class ParameterList extends Node {

    List<Parameter> parameters;
    public  ParameterList(){
        super();
        this.setNodeType("ParameterList");
        parameters=new ArrayList<>();
    }
    public ParameterList(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
        for (Parameter param : this.parameters) {
            if (param instanceof Node) {
                this.addChild((Node) param);
            }
        }
    }


    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < parameters.size(); i++) {
            sb.append(parameters.get(i).generate());
            if (i < parameters.size() - 1) sb.append(", ");
        }
        return sb.toString();
    }
    @Override
    public String toString() {
        return "\nParameterList{" +
                "\nparameters=" + parameters +
                '}';
    }

}
