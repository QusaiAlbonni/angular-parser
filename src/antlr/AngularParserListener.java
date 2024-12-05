// Generated from C:/Users/esd67/Desktop/antlr_projects/compilerproject/src/antlr/AngularParser.g4 by ANTLR 4.13.2
package src.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngularParser}.
 */
public interface AngularParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AngularParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AngularParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(AngularParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(AngularParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(AngularParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(AngularParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(AngularParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(AngularParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterTypeAnnotation(AngularParser.TypeAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitTypeAnnotation(AngularParser.TypeAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(AngularParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(AngularParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(AngularParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(AngularParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassMember(AngularParser.ClassMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassMember(AngularParser.ClassMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(AngularParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(AngularParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(AngularParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(AngularParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(AngularParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(AngularParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#enumMember}.
	 * @param ctx the parse tree
	 */
	void enterEnumMember(AngularParser.EnumMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#enumMember}.
	 * @param ctx the parse tree
	 */
	void exitEnumMember(AngularParser.EnumMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterComponentDeclaration(AngularParser.ComponentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#serviceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterServiceDeclaration(AngularParser.ServiceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#serviceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitServiceDeclaration(AngularParser.ServiceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDeclaration(AngularParser.PropertyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDeclaration(AngularParser.PropertyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportStatement(AngularParser.ExportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportStatement(AngularParser.ExportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(AngularParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(AngularParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(AngularParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(AngularParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(AngularParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(AngularParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(AngularParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(AngularParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#binaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpression(AngularParser.BinaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#binaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpression(AngularParser.BinaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(AngularParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(AngularParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(AngularParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(AngularParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(AngularParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(AngularParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(AngularParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(AngularParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(AngularParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(AngularParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#incrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterIncrementExpression(AngularParser.IncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#incrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitIncrementExpression(AngularParser.IncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(AngularParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(AngularParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(AngularParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(AngularParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(AngularParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(AngularParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(AngularParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(AngularParser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryCatchStatement(AngularParser.TryCatchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryCatchStatement(AngularParser.TryCatchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(AngularParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(AngularParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(AngularParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(AngularParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(AngularParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(AngularParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(AngularParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(AngularParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#readError}.
	 * @param ctx the parse tree
	 */
	void enterReadError(AngularParser.ReadErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#readError}.
	 * @param ctx the parse tree
	 */
	void exitReadError(AngularParser.ReadErrorContext ctx);
}