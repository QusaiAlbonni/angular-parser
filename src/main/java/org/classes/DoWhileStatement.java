package org.Classes;

public class DoWhileStatement extends Statement{
    Statement body;
    Expression condition;
    public DoWhileStatement(){}
    public DoWhileStatement(Statement body, Expression condition) {
        this.body = body;
        this.condition = condition;
    }

    public Statement getBody() {
        return body;
    }

    public void setBody(Statement body) {
        this.body = body;
    }

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "\nDoWhileStatement{" +
                "\nbody=" + body +
                "\ncondition=" + condition +
                '}';
    }
}
