package src.Classes;

import java.util.ArrayList;
import java.util.List;

//TODO
public class ParameterList {

    List<Parameter> parameters;
    public  ParameterList(){parameters=new ArrayList<>();}
    public ParameterList(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        return "\nParameterList{" +
                "\nparameters=" + parameters +
                '}';
    }

}
