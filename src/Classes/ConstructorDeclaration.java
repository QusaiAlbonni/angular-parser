package src.Classes;

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
}
