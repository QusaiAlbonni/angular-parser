package org.classes;

public class ConstructorDeclaration extends  Statement{
    ParameterList parameterList;
    BlockStatement blockStatement;

    public ParameterList getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
    }

    public BlockStatement getBlockStatement() {
        return blockStatement;
    }

    public void setBlockStatement(BlockStatement blockStatement) {
        this.blockStatement = blockStatement;
    }

    @Override
    public String toString() {
        return "\nConstructorDeclaration{" +
                "\nparameterList=" + parameterList +
                "\nblockStatement=" + blockStatement +
                '}';
    }

    @Override
    public String toCode() {
        StringBuilder sb = new StringBuilder();
        sb.append("constructor(");
        if (parameterList != null && parameterList.getParameters() != null) {
            sb.append(this.parameterList.toCode());
        }
        sb.append(") ");
        if (blockStatement != null) {
            sb.append(blockStatement.toCode());
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }
}
