package org.classes;

public class ForStatement extends Statement{

    ForOf forOf;
    VariableDeclaration variableDeclaration;
    Expression variableDeclarationAsExpression;
    Expression condition;
    Expression increment;
    Statement body;

    public ForStatement() {
        super();
        this.setNodeType("ForStatement");
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
        if(variableDeclaration != null) addChild(variableDeclaration);
    }

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
        if(condition != null) addChild(condition);
    }

    public Expression getVariableDeclarationAsExpression() {
        return variableDeclarationAsExpression;
    }

    public void setVariableDeclarationAsExpression(Expression variableDeclarationAsExpression) {
        this.variableDeclarationAsExpression = variableDeclarationAsExpression;
        if(variableDeclarationAsExpression != null) addChild(variableDeclarationAsExpression);
    }

    public Expression getIncrement() {
        return increment;
    }

    public void setIncrement(Expression increment) {
        this.increment = increment;
        if(increment != null) addChild(increment);
    }

    public Statement getBody() {
        return body;
    }

    public void setBody(Statement body) {
        this.body = body;
        if(body != null) addChild(body);
    }

    public ForOf getForOf() {
        return forOf;
    }

    public void setForOf(ForOf forOf) {
        this.forOf = forOf;
        if(forOf != null) addChild(forOf);
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
    public String generate() {
        StringBuilder sb = new StringBuilder();
        if(forOf != null) {
            sb.append("for (").append(forOf.generate()).append(") ");
        } else if(variableDeclaration != null) {
            sb.append("for (").append(variableDeclaration.generate()).append("; ");
            sb.append(condition != null ? condition.generate() : "").append("; ");
            sb.append(increment != null ? increment.generate() : "").append(") ");
        } else if(variableDeclarationAsExpression != null) {
            sb.append("for (").append(variableDeclarationAsExpression.generate()).append("; ");
            sb.append(condition != null ? condition.generate() : "").append("; ");
            sb.append(increment != null ? increment.generate() : "").append(") ");
        }
        if(body != null) {
            sb.append(body.generate());
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }
}
