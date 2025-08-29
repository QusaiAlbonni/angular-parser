package org.classes;

public class ConstructorDeclaration extends  Statement{
    ParameterList parameterList;
    BlockStatement blockStatement;

    public ConstructorDeclaration() {
        super();
        this.setNodeType("ConstructorDeclaration");
    }
    public ParameterList getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
        if (parameterList != null) addChild(parameterList);
    }

    public BlockStatement getBlockStatement() {
        return blockStatement;
    }

    public void setBlockStatement(BlockStatement blockStatement) {
        this.blockStatement = blockStatement;
        if (blockStatement != null) addChild(blockStatement);
    }

    @Override
    public String toString() {
        return "\nConstructorDeclaration{" +
                "\nparameterList=" + parameterList +
                "\nblockStatement=" + blockStatement +
                '}';
    }

    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("constructor(");
        if (parameterList != null && parameterList.getParameters() != null) {
            for (int i = 0; i < parameterList.getParameters().size(); i++) {
                sb.append(parameterList.getParameters().get(i).getName());
                if (i < parameterList.getParameters().size() - 1) {
                    sb.append(", ");
                }
            }
        }
        sb.append(") ");
        if (blockStatement != null) {
            sb.append(blockStatement.generate());
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }
}
