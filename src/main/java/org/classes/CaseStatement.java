package org.classes;

import java.util.ArrayList;
import java.util.List;

public class CaseStatement extends Statement{
    Expression caseExpression;
    List<Statement> statements;

    public CaseStatement() {
        statements=new ArrayList<>();
    }

    public CaseStatement(Expression caseExpression, List<Statement> statements) {
        this.caseExpression = caseExpression;
        this.statements = statements;
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
    public String toString() {
        return "\nCaseStatement{" +
                "\ncaseExpression=" + caseExpression +
                "\n, statements=" + statements +
                '}';
    }

    @Override
    public String toCode() {
        StringBuilder sb = new StringBuilder();
        if (caseExpression != null) {
            sb.append("case ").append(caseExpression.toCode()).append(":\n");
        } else {
            sb.append("default:\n");
        }
        if (statements != null) {
            for (Statement stmt : statements) {
                if (stmt != null) {
                    sb.append("  ").append(stmt.toCode());
                    if (!stmt.toCode().endsWith(";")) {
                        sb.append(";");
                    }
                    sb.append("\n");
                }
            }
        }
        return sb.toString();
    }
}
