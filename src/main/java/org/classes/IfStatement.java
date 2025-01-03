package org.classes;

public class IfStatement extends Statement{
    Expression condition;
    Statement thenStatement;
    Statement elseStatement;

    public IfStatement(Expression condition, Statement thenStatement, Statement elseStatement) {
        this.condition = condition;
        this.thenStatement = thenStatement;
        this.elseStatement = elseStatement;
    }
    public  IfStatement(){}

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    public Statement getThenStatement() {
        return thenStatement;
    }

    public void setThenStatement(Statement thenStatement) {
        this.thenStatement = thenStatement;
    }

    public Statement getElseStatement() {
        return elseStatement;
    }

    public void setElseStatement(Statement elseStatement) {
        this.elseStatement = elseStatement;
    }

    @Override
    public String toString() {
        return "\nIfStatement{" +
                "\ncondition=" + condition +
                "\nthenStatement=" + thenStatement +
                "\nelseStatement=" + elseStatement +
                '}';
    }
}
