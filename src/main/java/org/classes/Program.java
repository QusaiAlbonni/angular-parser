package org.classes;

import java.util.ArrayList;
import java.util.List;

public class Program {
    List<Statement> statements;
    public  Program(){
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
}
