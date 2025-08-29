package org.classes;

import java.util.ArrayList;
import java.util.List;

public class BlockStatement extends Statement{
    List<Statement> statements;
    public BlockStatement(List<Statement> statements) {
        super();
        this.setNodeType("Block");
        this.statements = statements;
        for (Statement stmt : statements) {
            this.addChild(stmt);
        }
    }

    public BlockStatement() {
        statements=new ArrayList<>();
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        for (Statement stmt : statements) {
            sb.append(stmt.generate()).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    @Override
    public String toString() {
        return "\nBlockStatement{" +
                "\nstatements=" + statements +
                '}';
    }
}
