package org.classes;

public class ExportStatement extends Statement{
    String id ;
    String exportType;
    ClassDeclaration classDeclaration;
    VariableDeclaration variableDeclaration;
    FunctionDeclaration functionDeclaration;
    public  ExportStatement(){

    }
    public ExportStatement(String exportType, String id) {
        this.exportType = exportType;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExportType() {
        return exportType;
    }

    public void setExportType(String exportType) {
        this.exportType = exportType;
    }

    public ClassDeclaration getClassDeclaration() {
        return classDeclaration;
    }

    public void setClassDeclaration(ClassDeclaration classDeclaration) {
        this.classDeclaration = classDeclaration;
    }

    public VariableDeclaration getVariableDeclaration() {
        return variableDeclaration;
    }

    public void setVariableDeclaration(VariableDeclaration variableDeclaration) {
        this.variableDeclaration = variableDeclaration;
    }

    public FunctionDeclaration getFunctionDeclaration() {
        return functionDeclaration;
    }

    public void setFunctionDeclaration(FunctionDeclaration functionDeclaration) {
        this.functionDeclaration = functionDeclaration;
    }

    @Override
    public String toString() {
        if(classDeclaration!=null){
            return "\nExportStatement{" +
                    "\nid='" + id + '\'' +
                    "\nexportType='" + exportType + '\'' +
                    "\nclassDeclaration='" + classDeclaration + '\'' +
                    '}';
        }else if(functionDeclaration!=null){
            return "\nExportStatement{" +
                    "\nid='" + id + '\'' +
                    "\nexportType='" + exportType + '\'' +
                    "\nfunctionDeclaration='" + functionDeclaration + '\'' +
                    '}';
        } else if(variableDeclaration!=null){
            return "\nExportStatement{" +
                    "\nid='" + id + '\'' +
                    "\nexportType='" + exportType + '\'' +
                    "\nvariableDeclaration='" + variableDeclaration + '\'' +
                    '}';
        }
        return "\nExportStatement{" +
                "\nid='" + id + '\'' +
                "\nexportType='" + exportType + '\'' +
                '}';
    }
}
