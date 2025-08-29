package org.classes;

import java.util.ArrayList;
import java.util.List;

public class SwitchStatement extends Statement{
    Expression expression;
    List<CaseStatement> caseStatements;

    public SwitchStatement() {
        super();
        this.setNodeType("SwitchStatement");
        caseStatements = new ArrayList<>();
    }

    public SwitchStatement(Expression expression, List<CaseStatement> caseStatements) {
        this.expression = expression;
        this.caseStatements = caseStatements;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
        if (expression != null) addChild(expression);
    }

    public List<CaseStatement> getCaseStatements() {
        return caseStatements;
    }

    public void setCaseStatements(List<CaseStatement> caseStatements) {
        this.caseStatements = caseStatements;
    }

    @Override
    public String toString() {
        return "SwitchStatement{" +
                "expression=" + expression +
                ", caseStatements=" + caseStatements +
                '}';
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("switch (");
        if (expression != null) {
            sb.append(expression.generate());
        }
        sb.append(") {");

        for (CaseStatement cs : caseStatements) {
            sb.append("\n").append(cs.generate());
        }

        sb.append("\n}");
        return sb.toString();
    }
}
