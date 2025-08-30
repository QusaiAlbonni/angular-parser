package org.classes;

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
    @Override
    public String toCode() {
        StringBuilder sb = new StringBuilder();
        sb.append("do ");
        if (body != null) {
            sb.append(body.toCode());
        } else {
            sb.append("{}");
        }
        sb.append(" while (");
        if (condition != null) {
            sb.append(condition.toCode());
        }
        sb.append(")");
        return sb.toString();
    }
}
