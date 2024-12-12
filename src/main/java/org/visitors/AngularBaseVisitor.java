package org.visitors;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.classes.*;
import org.antlr.AngularParser;
import org.antlr.AngularParserBaseVisitor;

import java.util.ArrayList;
import java.util.List;

public class AngularBaseVisitor extends AngularParserBaseVisitor {
    @Override
    public Object visitProgram(AngularParser.ProgramContext ctx) {

        Program program=new Program();
        for (int i = 0; i <ctx.statement().size(); i++) {
            if(ctx.statement(i)!=null){
                program.addChild(visitStatement(ctx.statement(i)));
            }
        }
        return  program;
    }

    @Override
    public Statement visitStatement(AngularParser.StatementContext ctx) {
        if(ctx.variableDeclaration()!=null){
            return  visitVariableDeclaration(ctx.variableDeclaration());
        }
        else if(ctx.functionDeclaration()!=null){
            return visitFunctionDeclaration(ctx.functionDeclaration());
        }   else if(ctx.classDeclaration()!=null){
            return visitClassDeclaration(ctx.classDeclaration());
        }   else if(ctx.enumDeclaration()!=null){
            return visitEnumDeclaration(ctx.enumDeclaration());
        }   else if(ctx.componentDeclaration()!=null){
            return visitComponentDeclaration(ctx.componentDeclaration());
        } else if (ctx.serviceDeclaration()!=null) {
            return visitServiceDeclaration(ctx.serviceDeclaration());
        }
        else if(ctx.importStatement()!=null){
            return visitImportStatement(ctx.importStatement());
        }else if(ctx.exportStatement()!=null){
            return visitExportStatement(ctx.exportStatement());
        }
        else if(ctx.expressionStatement()!=null){
            return visitExpressionStatement(ctx.expressionStatement());
        }else if(ctx.blockStatement()!=null){
            return visitBlockStatement(ctx.blockStatement());
        }else if(ctx.ifStatement()!=null){
            return visitIfStatement(ctx.ifStatement());
        }else if(ctx.forStatement()!=null){
            return visitForStatement(ctx.forStatement());
        }else if(ctx.whileStatement()!=null){
            return visitWhileStatement(ctx.whileStatement());
        }
        else if(ctx.doWhileStatement()!=null){
            return visitDoWhileStatement(ctx.doWhileStatement());
        }else if(ctx.switchStatement()!=null){
            return visitSwitchStatement(ctx.switchStatement());
        }else if(ctx.tryCatchStatement()!=null){
            return visitTryCatchStatement(ctx.tryCatchStatement());
        }else if(ctx.returnStatement()!=null){
            return visitReturnStatement(ctx.returnStatement());
        }else if(ctx.continueStatement()!=null){
            return visitContinueStatement(ctx.continueStatement());
        }else if(ctx.continueStatement()!=null){
            return visitThrowStatement(ctx.throwStatement());
        }
        else{
            System.out.println("cannot handle this statement in visitStatement function in AngularBaseVisitor");
            return  null;
        }
    }

    @Override
    public VariableDeclaration visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx) {
        VariableDeclaration variableDeclaration=new VariableDeclaration();
        variableDeclaration.setId(ctx.ID().getText());
        if(ctx.CONST()!=null){
            variableDeclaration.setType(ctx.CONST().getText());
        }else{
            variableDeclaration.setType(ctx.LET().getText());
        }
        if(ctx.expression()!=null){
        variableDeclaration.setExpression(visitExpression(ctx.expression()));

        }
        return  variableDeclaration;
    }

    @Override
    public Statement visitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx) {
        FunctionDeclaration functionDeclaration=new FunctionDeclaration();
        functionDeclaration.setId(ctx.ID().getText());
        if(ctx.blockStatement()!=null){
        functionDeclaration.setBody(visitBlockStatement(ctx.blockStatement()));
        }
        if(ctx.parameterList()!=null){
        functionDeclaration.setParameters(visitParameterList(ctx.parameterList()));
        }
        return  functionDeclaration;
    }

    @Override
    public ParameterList visitParameterList(AngularParser.ParameterListContext ctx) {
        ParameterList parameterList=new ParameterList();
        System.out.println("***********************");
        if(ctx.parameter()!=null){
        for (int i = 0; i < ctx.parameter().size(); i++) {
            parameterList.getParameters().add(visitParameter(ctx.parameter(i)));
        }
        }
        return  parameterList;
    }

    @Override
    public Parameter visitParameter(AngularParser.ParameterContext ctx) {
        Parameter parameter=new Parameter();
        parameter.setName(ctx.ID().getText());
        if(ctx.typeAnnotation()!=null){
        parameter.setType(visitTypeAnnotation(ctx.typeAnnotation()));
        }
        return  parameter;
    }

    @Override
    public TypeAnnotation visitTypeAnnotation(AngularParser.TypeAnnotationContext ctx) {
        TypeAnnotation typeAnnotation=new TypeAnnotation();
        if(ctx.ANY()!=null){
            typeAnnotation.setType(ctx.ANY().getText());
        }else if(ctx.NUMBER_TYPE()!=null){
            typeAnnotation.setType(ctx.NUMBER_TYPE().getText());
        }else if(ctx.STRING_TYPE()!=null){
            typeAnnotation.setType(ctx.STRING_TYPE().getText());
        }else if(ctx.BOOLEAN_TYPE()!=null){
            typeAnnotation.setType(ctx.BOOLEAN_TYPE().getText());
        }else if(ctx.VOID_TYPE()!=null){
            typeAnnotation.setType(ctx.VOID_TYPE().getText());
        }else if(ctx.UNKNOWN()!=null){
            typeAnnotation.setType(ctx.UNKNOWN().getText());
        }else if(ctx.NEVER()!=null){
            typeAnnotation.setType(ctx.NEVER().getText());
        }else if(ctx.ID()!=null){
            typeAnnotation.setType(ctx.ID().getText());
        }
        else{
            System.out.println("error when handle type annotation in visitTypeAnnotation in AngularBaseVisitor");
            return null;
        }
        return typeAnnotation;
    }

    @Override
    public Statement visitClassDeclaration(AngularParser.ClassDeclarationContext ctx) {
        ClassDeclaration classDeclaration=new ClassDeclaration();
        classDeclaration.setId(ctx.ID(0).getText());
        if(ctx.EXTENDS()!=null){
            classDeclaration.setExtendsClass(ctx.ID(1).getText());
        }
        else{
            classDeclaration.setExtendsClass(null);
        }
        if(ctx.IMPLEMENTS()!=null){
            for (int i = 2; i < ctx.ID().size(); i++) {
                classDeclaration.getImplementsInterfaces().add(ctx.ID().get(i).getText());
            }
        }
        classDeclaration.setClassMembers(visitClassBody(ctx.classBody()));
    return  classDeclaration;
    }


    @Override
    public ClassBody visitClassBody(AngularParser.ClassBodyContext ctx) {
        ClassBody classBody=new ClassBody();
        if(ctx.classMember()!=null){
        for (int i = 0; i <ctx.classMember().size() ; i++) {
            classBody.getMembers().add(visitClassMember(ctx.classMember(i)));
        }
        }
        return  classBody;
    }

    @Override
    public ClassMember visitClassMember(AngularParser.ClassMemberContext ctx) {
        ClassMember classMember=new ClassMember();
        if(ctx.PRIVATE()!=null){
            classMember.setVisibility(ctx.PRIVATE().getText());
        }
        else if(ctx.PROTECTED()!=null){
            classMember.setVisibility(ctx.PROTECTED().getText());
        }
        else if(ctx.PUBLIC()!=null){
            classMember.setVisibility(ctx.PUBLIC().getText());
        }
        classMember.setStatic(ctx.STATIC()!=null);
        if(ctx.ID()!=null){
        classMember.setName(ctx.ID().getText());
        }
        if(ctx.constructorDeclaration()!=null){
            classMember.setConstructorDeclaration(visitConstructorDeclaration(ctx.constructorDeclaration()));
        classMember.setConstructor(true);
        }
        if(ctx.methodDeclaration()!=null){
            classMember.setMethod(visitMethodDeclaration(ctx.methodDeclaration()));
            classMember.setIsMethod(true);
        }
        if (ctx.variableDeclaration() != null) {
            classMember.setProperty(true);
            classMember.setVariable(visitVariableDeclaration(ctx.variableDeclaration()));
        }
        if(ctx.enumDeclaration()!=null){
            classMember.setEnumDeclaration(visitEnumDeclaration(ctx.enumDeclaration()));
            classMember.setIsEnum(true);
        }
        if(ctx.typeAnnotation()!=null){
        classMember.setTypeAnnotation(visitTypeAnnotation(ctx.typeAnnotation()));
        }
        return classMember;

    }

    //*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/don't forget to check it again/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*
    @Override
    public ConstructorDeclaration visitConstructorDeclaration(AngularParser.ConstructorDeclarationContext ctx) {
        ConstructorDeclaration constructorDeclaration=new ConstructorDeclaration();
        if(ctx.blockStatement()!=null){
        constructorDeclaration.setBlockStatement(visitBlockStatement(ctx.blockStatement()));
        }
        if(ctx.parameterList()!=null){
        constructorDeclaration.setParameterList(visitParameterList(ctx.parameterList()));
        }
        return  constructorDeclaration;
    }

    @Override
    public MethodDeclaration visitMethodDeclaration(AngularParser.MethodDeclarationContext ctx) {
        MethodDeclaration methodDeclaration=new MethodDeclaration();
        methodDeclaration.setName(ctx.ID().getText());
        if(ctx.typeAnnotation()!=null){
        methodDeclaration.setReturnType(visitTypeAnnotation(ctx.typeAnnotation()));
        }
        if(ctx.blockStatement()!=null){
        methodDeclaration.setBody(visitBlockStatement(ctx.blockStatement()));
        }
        if(ctx.parameterList()!=null){
        methodDeclaration.setParameters(visitParameterList(ctx.parameterList()));
        }
        return methodDeclaration;

    }

    @Override
    public EnumDeclaration visitEnumDeclaration(AngularParser.EnumDeclarationContext ctx) {
        EnumDeclaration enumDeclaration=new EnumDeclaration();
        enumDeclaration.setId(ctx.ID().getText());
        if(ctx.enumMember()!=null){
            for (int i = 0; i < ctx.enumMember().size(); i++) {
                enumDeclaration.getEnumMembers().add(visitEnumMember(ctx.enumMember(i)));
            }
        }
        return enumDeclaration;
    }

    @Override
    public EnumMember visitEnumMember(AngularParser.EnumMemberContext ctx) {
        EnumMember enumMember=new EnumMember();
        enumMember.setId(ctx.ID().getText());
        if(ctx.expression()!=null){
            enumMember.setExpression(visitExpression(ctx.expression()));
        }
        return enumMember;
    }
//todo visitComponentDeclaration
    @Override
    public Statement visitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx) {
        return null;
    }
//todo visitServiceDeclaration
    @Override
    public Statement visitServiceDeclaration(AngularParser.ServiceDeclarationContext ctx) {
        return null;
    }
//todo visitPropertyDeclaration
    @Override
    public Object visitPropertyDeclaration(AngularParser.PropertyDeclarationContext ctx) {
        return null;
    }
//todo visitImportStatement
    @Override
    public Statement visitImportStatement(AngularParser.ImportStatementContext ctx) {
        return null;
    }
 //todo visitExportStatement
    @Override
    public Statement visitExportStatement(AngularParser.ExportStatementContext ctx) {
        return null;
    }
//todo visitExpressionStatement
    @Override
    public Statement visitExpressionStatement(AngularParser.ExpressionStatementContext ctx) {
        return null;
    }
// todo visitExpression
    @Override
    public Expression visitExpression(AngularParser.ExpressionContext ctx) {
        return null;
    }
//todo visitConditionalExpression
    @Override
    public Object visitConditionalExpression(AngularParser.ConditionalExpressionContext ctx) {
        return null;
    }
//todo visitLogicalExpression
    @Override
    public Object visitLogicalExpression(AngularParser.LogicalExpressionContext ctx) {
        return null;
    }
//todo visitBinaryExpression
    @Override
    public Object visitBinaryExpression(AngularParser.BinaryExpressionContext ctx) {
        return null;
    }
//todo visitPrimaryExpression
    @Override
    public Object visitPrimaryExpression(AngularParser.PrimaryExpressionContext ctx) {
        return null;
    }
//todo visitArgumentList
    @Override
    public Object visitArgumentList(AngularParser.ArgumentListContext ctx) {
        return null;
    }
//todo visitAssignmentExpression
    @Override
    public Object visitAssignmentExpression(AngularParser.AssignmentExpressionContext ctx) {
        return null;
    }
//todo visitBlockStatement
    @Override
    public BlockStatement visitBlockStatement(AngularParser.BlockStatementContext ctx) {
        return null;
    }
//todo visitIfStatement
    @Override
    public Statement visitIfStatement(AngularParser.IfStatementContext ctx) {
        return null;
    }
//todo visitForStatement
    @Override
    public Statement visitForStatement(AngularParser.ForStatementContext ctx) {
        return null;
    }
//todo visitIncrementExpression
    @Override
    public Object visitIncrementExpression(AngularParser.IncrementExpressionContext ctx) {
        return null;
    }
//todo visitWhileStatement
    @Override
    public Statement visitWhileStatement(AngularParser.WhileStatementContext ctx) {
        return null;
    }
//todo visitDoWhileStatement
    @Override
    public Statement visitDoWhileStatement(AngularParser.DoWhileStatementContext ctx) {
        return null;
    }
//todo visitSwitchStatement
    @Override
    public Statement visitSwitchStatement(AngularParser.SwitchStatementContext ctx) {
        return null;
    }
//todo visitCaseStatement
    @Override
    public Statement visitCaseStatement(AngularParser.CaseStatementContext ctx) {
        return null;
    }
//todo visitTryCatchStatement
    @Override
    public Statement visitTryCatchStatement(AngularParser.TryCatchStatementContext ctx) {
        return null;
    }
//todo visitReturnStatement
    @Override
    public Statement visitReturnStatement(AngularParser.ReturnStatementContext ctx) {
        return null;
    }
//todo visitBreakStatement
    @Override
    public Statement visitBreakStatement(AngularParser.BreakStatementContext ctx) {
        return null;
    }
//todo visitContinueStatement
    @Override
    public Statement visitContinueStatement(AngularParser.ContinueStatementContext ctx) {
        return null;
    }
//todo visitThrowStatement
    @Override
    public Statement visitThrowStatement(AngularParser.ThrowStatementContext ctx) {
        return null;
    }
//todo visitReadError
    @Override
    public Object visitReadError(AngularParser.ReadErrorContext ctx) {
        return null;
    }
}
