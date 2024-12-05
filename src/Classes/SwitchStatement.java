package src.Classes;

import java.util.ArrayList;
import java.util.List;

public class SwitchStatement extends Statement{
    Expression expression;
    List<CaseStatement> caseStatements;

    public SwitchStatement() {
        caseStatements=new ArrayList<>();
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
}
