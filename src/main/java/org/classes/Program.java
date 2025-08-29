package org.classes;

import java.util.ArrayList;
import java.util.List;

public class Program extends Node {
    List<Statement> statements;
    public  Program(){
        super();
        this.setNodeType("Program");
        statements=new ArrayList<>();
    }
    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }
    public void addChild(Statement statement){
        this.statements.add(statement);
    }
    @Override
    public String toString() {
        return "\nProgram{" +
                "\nstatements=" + statements +
                '}';
    }
    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        for (Statement stmt : statements) {
            if (stmt != null) {
                sb.append(stmt.generate());

                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
