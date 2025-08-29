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
        super();
        this.setNodeType("ImportStatement");
        this.imports = new ArrayList<>();
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

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder("import ");
        if (imports != null && !imports.isEmpty()) {
            for (int i = 0; i < imports.size(); i++) {
                sb.append(imports.get(i));
                if (i < imports.size() - 1) sb.append(", ");
            }
        }
        sb.append(" from '").append(source != null ? source : "").append("';");
        return sb.toString();
    }
}
