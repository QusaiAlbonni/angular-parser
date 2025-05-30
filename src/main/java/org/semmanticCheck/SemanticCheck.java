package org.semmanticCheck;

import org.Exception.ErrorKind;
import org.Exception.SemanticError;
import org.symbolTable.*;
import org.symbolTable.E5_ThisSymbolTable;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SemanticCheck {
    E1_DuplicateFunctionNameSymbolTable se1=new E1_DuplicateFunctionNameSymbolTable();
    E2_UndefinedVariableSymbolTable  se2=new E2_UndefinedVariableSymbolTable();
    E3_UndefinedFunctionSymbolTable se3=new E3_UndefinedFunctionSymbolTable();
    E4_TagMismatchSymbolTable se4=new E4_TagMismatchSymbolTable();
    List<SemanticError>semanticErrors=new ArrayList<>();

    public E1_DuplicateFunctionNameSymbolTable getSe1() {
        return se1;
    }

    public E2_UndefinedVariableSymbolTable getSe2(){
        return  se2;
    }
    public  E3_UndefinedFunctionSymbolTable getSe3(){
        return  se3;
    }
    public  E4_TagMismatchSymbolTable getSe4(){
        return  se4;
    }

    public void checkE1(String name,int line){
        if(
        se1.getSet().addVal(name)){
            SemanticError e1=new SemanticError(ErrorKind.DUPLICATE_FUNCTION,line,"Error: duplicate function name"+name);
            semanticErrors.add(e1);
        }

    }
    public void checkE3(){

        for (String key : se3.getCheckMap().keySet()) {
            if (!se3.getSaveSet().contains(key)) {
                SemanticError e3=new SemanticError(ErrorKind.UNDEFINED_FUNCTION,Integer.valueOf(se3.getCheckMap().get(key)),"Error:undefined "+key+" function");
                semanticErrors.add(e3);
            }
        }
    }

    public void  checkE4(String closeTag,int line){


            if(Objects.equals(closeTag, se4.peek())){
                se4.pop();
            }
            else {
                SemanticError e4=new SemanticError(ErrorKind.TAG_MISMATCH,line,"Error:missing close the tage "+closeTag);
                semanticErrors.add(e4);
            }

    }

    E5_ThisSymbolTable se5 = new E5_ThisSymbolTable();

    public E5_ThisSymbolTable getSe5() {
        return se5;
    }

    public void checkE5(int line) {
        if (!se5.isThisAllowed()) {
            SemanticError e5 = new SemanticError(ErrorKind.THIS_OUTSIDE_CLASS, line, "Error: 'this' used outside of a class.");
            semanticErrors.add(e5);
        }
    }
    E6_FunctionParameterCountSymbolTable se6 = new E6_FunctionParameterCountSymbolTable();

    public E6_FunctionParameterCountSymbolTable getSe6() {
        return se6;
    }

    public void checkE6(String functionName, int passedArgsCount, int line) {
        Integer expected = se6.getParameterCount(functionName);
        if (expected != null && expected != passedArgsCount) {
            SemanticError e6 = new SemanticError(ErrorKind.ARGUMENT_COUNT_MISMATCH, line,
                    "Error: function '" + functionName + "' expects " + expected + " arguments but got " + passedArgsCount);
            semanticErrors.add(e6);
        }
    }

    public void checkErrors(){
        try {
            checkE3();
            FileWriter fileWriter=new FileWriter("Result\\log.txt");
            if(!semanticErrors.isEmpty()){
                fileWriter.append("Semantic Error is:");
                for(SemanticError e:semanticErrors){
                    fileWriter.append(e.toString());
                }
            }
            else {
                fileWriter.append("No Semantic Error Found");
            }
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
