package org.classes;

public class TryCatchStatement extends Statement{
    BlockStatement tryBlock;
    String catchVariable;
    BlockStatement catchBlock;
    BlockStatement finallyBlock;

    public TryCatchStatement() {
        super();
        this.setNodeType("TryCatchStatement");
    }

    public TryCatchStatement(BlockStatement tryBlock, String catchVariable, BlockStatement catchBlock, BlockStatement finallyBlock) {
        this.tryBlock = tryBlock;
        this.catchVariable = catchVariable;
        this.catchBlock = catchBlock;
        this.finallyBlock = finallyBlock;
    }

    public BlockStatement getTryBlock() {
        return tryBlock;
    }

    public void setTryBlock(BlockStatement tryBlock) {
        this.tryBlock = tryBlock;
        if (tryBlock != null) addChild(tryBlock);
    }

    public String getCatchVariable() {
        return catchVariable;
    }

    public void setCatchVariable(String catchVariable) {
        this.catchVariable = catchVariable;
    }

    public BlockStatement getCatchBlock() {
        return catchBlock;
    }

    public void setCatchBlock(BlockStatement catchBlock) {
        this.catchBlock = catchBlock;
        if (catchBlock != null) addChild(catchBlock);
    }

    public BlockStatement getFinallyBlock() {
        return finallyBlock;
    }

    public void setFinallyBlock(BlockStatement finallyBlock) {
        this.finallyBlock = finallyBlock;
        if (finallyBlock != null) addChild(finallyBlock);
    }

    @Override
    public String toString() {
        return "\nTryCatchStatement{" +
                "\ntryBlock=" + tryBlock +
                "\ncatchVariable='" + catchVariable + '\'' +
                "\ncatchBlock=" + catchBlock +
                "\nfinallyBlock=" + finallyBlock +
                '}';
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("try ");
        if (tryBlock != null) sb.append(tryBlock.generate());
        sb.append(" catch(").append(catchVariable != null ? catchVariable : "e").append(") ");
        if (catchBlock != null) sb.append(catchBlock.generate());
        if (finallyBlock != null) {
            sb.append(" finally ");
            sb.append(finallyBlock.generate());
        }
        return sb.toString();
    }
}
