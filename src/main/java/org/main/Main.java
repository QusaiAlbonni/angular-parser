package org.main;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.AngularLexer;
import org.antlr.AngularParser;
import org.classes.Program;
import org.sympol_table.html_sympol_table;
import org.visitors.AngularBaseVisitor;

import java.io.IOException;
import java.io.InputStream;


public class Main {
    public static html_sympol_table htmlSympolTable = new html_sympol_table();
    public static void main(String[] args) throws IOException {
        try {
            InputStream inputStream = Main.class.getClassLoader().getResourceAsStream("test.txt");

            if (inputStream == null) {
                System.out.println("File not found!");
                return;
            }

            CharStream input = CharStreams.fromStream(inputStream);

            AngularLexer angularLexer = new AngularLexer(input);
            CommonTokenStream tokenStream = new CommonTokenStream(angularLexer);
            AngularParser angularParser = new AngularParser(tokenStream);
            AngularBaseVisitor visitor = new AngularBaseVisitor();
            Object program = visitor.visitProgram(angularParser.program());
            System.out.println(program);

        } catch (Exception e) {
            System.out.println("Error using ANTLR: " + e.getMessage());
        }

    }
}
