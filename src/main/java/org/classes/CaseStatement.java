package org.classes;

import java.util.ArrayList;
import java.util.List;

public class CaseStatement extends Statement{
    Expression caseExpression;
    List<Statement> statements;

    public CaseStatement() {
        super();
        this.setNodeType("CaseStatement");
        statements=new ArrayList<>();
    }

    public CaseStatement(Expression caseExpression, List<Statement> statements) {
        super();
        this.setNodeType("CaseStatement");
        this.caseExpression = caseExpression;
        this.statements = statements;
        if (caseExpression != null) this.addChild(caseExpression);
        for (Statement stmt : statements) {
            this.addChild(stmt);
        }
    }

    public Expression getCaseExpression() {
        return caseExpression;
    }

    public void setCaseExpression(Expression caseExpression) {
        this.caseExpression = caseExpression;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("case ").append(caseExpression.generate()).append(":\n");
        for (Statement stmt : statements) {
            sb.append("  ").append(stmt.generate()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "\nCaseStatement{" +
                "\ncaseExpression=" + caseExpression +
                "\n, statements=" + statements +
                '}';
    }
}
