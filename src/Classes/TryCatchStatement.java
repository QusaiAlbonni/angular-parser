package src.Classes;

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
}
