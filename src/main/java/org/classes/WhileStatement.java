package org.classes;

public class WhileStatement extends Statement{
    Expression condition;
    Statement body;

    public WhileStatement() {
        super();
        this.setNodeType("WhileStatement");
    }
    public WhileStatement(Expression condition, Statement body) {
        this.condition = condition;
        this.body = body;
    }

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
        if (condition != null) addChild(condition);
    }

    public Statement getBody() {
        return body;
    }

    public void setBody(Statement body) {
        this.body = body;
        if (body != null) addChild(body);
    }

    @Override
    public String toString() {
        return "\nWhileStatement{" +
                "\ncondition=" + condition +
                "\nbody=" + body +
                '}';
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("while (");
        if (condition != null) {
            sb.append(condition.generate());
        }
        sb.append(") ");
        if (body != null) {
            sb.append(body.generate());
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }
}
