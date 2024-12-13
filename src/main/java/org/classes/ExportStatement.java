package org.Classes;

public class ExportStatement extends Statement{
    String id ;
    String exportType;
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

    @Override
    public String toString() {
        return "\nExportStatement{" +
                "\nid='" + id + '\'' +
                "\nexportType='" + exportType + '\'' +
                '}';
    }
}
