package org.classes;

public class ForStatement extends Statement{

    ForOf forOf;
    VariableDeclaration variableDeclaration;
    Expression variableDeclarationAsExpression;
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

    public Expression getVariableDeclarationAsExpression() {
        return variableDeclarationAsExpression;
    }

    public void setVariableDeclarationAsExpression(Expression variableDeclarationAsExpression) {
        this.variableDeclarationAsExpression = variableDeclarationAsExpression;
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
                if(forOf!=null){
                    return "\nForStatement{" +
                            "\nforOf" + forOf +
                            "\nbody=" + body +
                            '}';
                }
                else{
                    if(variableDeclaration!=null){
                        return  "\nForStatement{" +
                                "\nvariableDeclaration=" + variableDeclaration +
                                "\ncondition=" + condition +
                                "\nincrement=" + increment +
                                "\nforOf" + forOf +
                                "\nbody=" + body +
                                '}';
                    }
                    else{
                   return         "\nForStatement{" +
                                "\nvariableDeclaration=" + variableDeclarationAsExpression +
                                "\ncondition=" + condition +
                                "\nincrement=" + increment +
                                "\nforOf" + forOf +
                                "\nbody=" + body +
                                '}';
                    }
                }

    }

    @Override
    public String toCode() {
        StringBuilder sb = new StringBuilder();
        sb.append("for (");

        if (forOf != null) {
            sb.append(forOf.toCode());
        } else {
            // Traditional for loop
            if (variableDeclaration != null) {
                sb.append(variableDeclaration.toCode());
            } else if (variableDeclarationAsExpression != null) {
                sb.append(variableDeclarationAsExpression.toCode());
            }
            sb.append("; ");

            if (condition != null) {
                sb.append(condition.toCode());
            }
            sb.append("; ");

            if (increment != null) {
                sb.append(increment.toCode());
            }
        }

        sb.append(") ");
        if (body != null) {
            sb.append(body.toCode());
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }
}
