package org.classes;

public class ForOf {
    private VariableDeclaration variableDeclaration;
    private Expression expression;

    public VariableDeclaration getVariableDeclaration() {
        return variableDeclaration;
    }

    public void setVariableDeclaration(VariableDeclaration variableDeclaration) {
        this.variableDeclaration = variableDeclaration;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString(){
        return "ForOf{" +
                "\nvariable: " + variableDeclaration +
                "\nexpression: " + expression +
                "\n}";
    }

}
