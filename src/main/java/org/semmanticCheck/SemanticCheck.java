package org.semmanticCheck;

import org.Exception.ErrorKind;
import org.Exception.SemanticError;
import org.symbolTable.E1_DuplicateFunctionNameSymbolTable;
import org.symbolTable.E2_UndefinedVariableSymbolTable;
import org.symbolTable.E3_UndefinedFunctionSymbolTable;
import org.symbolTable.E4_TagMismatchSymbolTable;

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
