package org.main;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.AngularLexer;
import org.antlr.AngularParser;
import org.visitors.AngularBaseVisitor;

import java.io.IOException;
import java.io.InputStream;


public class Main {
    public static void main(String[] args) throws IOException {
        try {
            InputStream inputStream = Main.class.getClassLoader().getResourceAsStream("test.ts");

            if (inputStream == null) {
                System.out.println("File not found!");
                return;
            }

            CharStream input = CharStreams.fromStream(inputStream);

            AngularLexer angularLexer = new AngularLexer(input);
            CommonTokenStream tokenStream = new CommonTokenStream(angularLexer);
            AngularParser angularParser = new AngularParser(tokenStream);

            ParseTree parseTree = angularParser.program();

            System.out.println(parseTree.toStringTree());
        } catch (Exception e) {
            System.out.println("Error using ANTLR: " + e.getMessage());
        }

    }
}
