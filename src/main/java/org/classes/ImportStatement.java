package org.classes;

import java.util.ArrayList;
import java.util.List;

public class ImportStatement extends Statement{
    String source;
    List<String> imports;

    public ImportStatement(String source, List<String> imports) {
        this.source = source;
        this.imports = imports;
    }

    public ImportStatement() {
        imports=new ArrayList<>();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public List<String> getImports() {
        return imports;
    }

    public void setImports(List<String> imports) {
        this.imports = imports;
    }

    @Override
    public String toString() {
        if (source!=null&&imports!=null){
        return "\nImportStatement{" +
                "\nsource='" + source + '\'' +
                "\nimports=" + imports +
                '}';
    }
        return "";
  }
}
