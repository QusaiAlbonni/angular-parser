package src.Classes;

public class WhileStatement extends Statement{
    Expression condition;
    Statement body;

    public WhileStatement(){}
    public WhileStatement(Expression condition, Statement body) {
        this.condition = condition;
        this.body = body;
    }

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    public Statement getBody() {
        return body;
    }

    public void setBody(Statement body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "\nWhileStatement{" +
                "\ncondition=" + condition +
                "\nbody=" + body +
                '}';
    }
}
