package org.classes;

import java.util.ArrayList;
import java.util.List;

public class BlockStatement extends Statement{
    List<Statement> statements;
    public BlockStatement(List<Statement> statements) {
        this.statements = statements;
    }

    public BlockStatement() {
        statements=new ArrayList<>();
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
