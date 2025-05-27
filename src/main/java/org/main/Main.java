package org.main;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.AngularLexer;
import org.antlr.AngularParser;
import org.classes.Program;
import org.sympol_table.html_sympol_table;
import org.sympol_table.sympol_table;
//import org.visitors.AngularBaseVisitor;
import org.visitors.AngularBaseVisitorr;

import java.io.IOException;
import java.io.InputStream;


public class Main {
    public static sympol_table sympolTable = new sympol_table();
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
            AngularBaseVisitorr visitor = new AngularBaseVisitorr();
            Program program = (Program) visitor.visitProgram(angularParser.program());
            printTreeWithJackson(program);


        } catch (Exception e) {
            System.out.println("Error using ANTLR: " + e.getMessage());
        }

    }
    private static void printTreeWithJackson(Program program) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
            objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

            String jsonOutput = objectMapper.writeValueAsString(program);

            System.out.println(jsonOutput);

        } catch (JsonProcessingException e) {
            System.out.println("Error while converting to JSON: " + e.getMessage());
        }
    }
}
