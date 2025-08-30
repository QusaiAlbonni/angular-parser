package org.classes;

public class TryCatchStatement extends Statement{
    BlockStatement tryBlock;
    String catchVariable;
    BlockStatement catchBlock;
    BlockStatement finallyBlock;

    public TryCatchStatement() {
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
    }

    public BlockStatement getFinallyBlock() {
        return finallyBlock;
    }

    public void setFinallyBlock(BlockStatement finallyBlock) {
        this.finallyBlock = finallyBlock;
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
    public String toCode() {
        StringBuilder sb = new StringBuilder();
        sb.append("try ");
        if (tryBlock != null) {
            sb.append(tryBlock.toCode());
        } else {
            sb.append("{}");
        }

        if (catchBlock != null) {
            sb.append(" catch (");
            if (catchVariable != null) {
                sb.append(catchVariable);
            } else {
                sb.append("e");
            }
            sb.append(") ");
            sb.append(catchBlock.toCode());
        }

        if (finallyBlock != null) {
            sb.append(" finally ");
            sb.append(finallyBlock.toCode());
        }

        return sb.toString();
    }
}
