package org.classes;

public class DoWhileStatement extends Statement{
    Statement body;
    Expression condition;
    public DoWhileStatement(){
        super();
        this.setNodeType("DoWhileStatement");
    }
    public DoWhileStatement(Statement body, Expression condition) {
        this.body = body;
        this.condition = condition;
    }

    public Statement getBody() {
        return body;
    }

    public void setBody(Statement body) {
        this.body = body;
        if (body != null) addChild(body);
    }

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
        if (condition != null) addChild(condition);
    }

    @Override
    public String toString() {
        return "\nDoWhileStatement{" +
                "\nbody=" + body +
                "\ncondition=" + condition +
                '}';
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("do ");
        if (body != null) {
            sb.append(body.generate());
        } else {
            sb.append("{}");
        }
        sb.append(" while (");
        if (condition != null) {
            sb.append(condition.generate());
        } else {
            sb.append("true"); // شرط افتراضي إذا لم يكن موجود
        }
        sb.append(");");
        return sb.toString();
    }
}
