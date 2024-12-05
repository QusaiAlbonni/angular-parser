package app;


import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import src.antlr.AngularLexer;
import src.antlr.AngularParser;
import src.visitors.AngularBaseVisitor;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) throws IOException {
        String source = "src/test.txt";

        CharStream charStream = fromFileName(source);

        AngularLexer lexer = new AngularLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        AngularParser parser = new AngularParser(tokenStream);
        ParseTree parseTree = parser.program(); // تحليل القاعدة "program"

        // زيارة الشجرة باستخدام الزائر الخاص
        AngularBaseVisitor visitor = new AngularBaseVisitor();
        var result =  visitor.visit(parseTree);

            System.out.println(result);

    }
}
