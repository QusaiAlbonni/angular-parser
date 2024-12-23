package org.classes;

public class ForStatement extends Statement{

    ForOf forOf;
    VariableDeclaration variableDeclaration;
    Expression condition;
    Expression increment;
    Statement body;

    public ForStatement() {
    }

    public ForStatement(VariableDeclaration variableDeclaration, Expression condition, Expression increment, Statement body) {
        this.variableDeclaration = variableDeclaration;
        this.condition = condition;
        this.increment = increment;
        this.body = body;
    }

    public VariableDeclaration getVariableDeclaration() {
        return variableDeclaration;
    }

    public void setVariableDeclaration(VariableDeclaration variableDeclaration) {
        this.variableDeclaration = variableDeclaration;
    }

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    public Expression getIncrement() {
        return increment;
    }

    public void setIncrement(Expression increment) {
        this.increment = increment;
    }

    public Statement getBody() {
        return body;
    }

    public void setBody(Statement body) {
        this.body = body;
    }

    public ForOf getForOf() {
        return forOf;
    }

    public void setForOf(ForOf forOf) {
        this.forOf = forOf;
    }

    @Override
    public String toString() {
        return "\nForStatement{" +
                "\nvariableDeclaration=" + variableDeclaration +
                "\ncondition=" + condition +
                "\nincrement=" + increment +
                "\nforOf" + forOf +
                "\nbody=" + body +
                '}';
    }
}
