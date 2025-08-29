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
    public IfStatement() {
        super();
        this.setNodeType("IfStatement");
    }

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
        if (condition != null) addChild(condition);
    }

    public Statement getThenStatement() {
        return thenStatement;
    }

    public void setThenStatement(Statement thenStatement) {
        this.thenStatement = thenStatement;
        if (thenStatement != null) addChild(thenStatement);
    }

    public Statement getElseStatement() {
        return elseStatement;
    }

    public void setElseStatement(Statement elseStatement) {
        this.elseStatement = elseStatement;
        if (elseStatement != null) addChild(elseStatement);
    }

    @Override
    public String toString() {
        return "\nIfStatement{" +
                "\ncondition=" + condition +
                "\nthenStatement=" + thenStatement +
                "\nelseStatement=" + elseStatement +
                '}';
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("if (").append(condition != null ? condition.generate() : "").append(") ");
        sb.append(thenStatement != null ? thenStatement.generate() : "{}");
        if (elseStatement != null) {
            sb.append(" else ").append(elseStatement.generate());
        }
        return sb.toString();
    }
}
