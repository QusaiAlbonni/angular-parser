package org.Exception;

public class SemanticError {
    public  final  ErrorKind kind;

    private final int line;
    private final String message;

    public SemanticError(ErrorKind kind, int line, String message) {
        this.kind=kind;
        this.line = line;
        this.message = message;
    }

    public ErrorKind getKind()       { return kind; }
    public int getLine()         { return line; }
    public String getMessage()   { return message; }

    @Override
    public String toString() {
        return "\n Error: "+this.kind + "\n Error Name: "+getKind()+"\n Line: "+getLine()+"\n Error Message: "+getMessage();
    }

}
