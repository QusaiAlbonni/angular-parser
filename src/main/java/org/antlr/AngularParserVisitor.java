// Generated from C:/Users/Lenovo/OneDrive/Desktop/proojactos/antlr/angular-project/src/main/java/org/antlr/AngularParser.g4 by ANTLR 4.13.2
package org.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AngularParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AngularParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AngularParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(AngularParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(AngularParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(AngularParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAnnotation(AngularParser.TypeAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(AngularParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(AngularParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMember(AngularParser.ClassMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#objectBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectBody(AngularParser.ObjectBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#objectMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectMember(AngularParser.ObjectMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate(AngularParser.TemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElements(AngularParser.HtmlElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(AngularParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttribute(AngularParser.HtmlAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#angularAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAngularAttribute(AngularParser.AngularAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#bindingAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBindingAttribute(AngularParser.BindingAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#eventBindingAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventBindingAttribute(AngularParser.EventBindingAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#forAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForAttribute(AngularParser.ForAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ifAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfAttribute(AngularParser.IfAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(AngularParser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlMisc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlMisc(AngularParser.HtmlMiscContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlComment(AngularParser.HtmlCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlChardata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlChardata(AngularParser.HtmlChardataContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#angularCharData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAngularCharData(AngularParser.AngularCharDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(AngularParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(AngularParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(AngularParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#enumMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumMember(AngularParser.EnumMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#serviceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServiceDeclaration(AngularParser.ServiceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDeclaration(AngularParser.PropertyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#exportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportStatement(AngularParser.ExportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(AngularParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(AngularParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(AngularParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(AngularParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#binaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpression(AngularParser.BinaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclaration(AngularParser.ArrayDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#objectDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectDeclaration(AngularParser.ObjectDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(AngularParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(AngularParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(AngularParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(AngularParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(AngularParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#forOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForOf(AngularParser.ForOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#incrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementExpression(AngularParser.IncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(AngularParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(AngularParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(AngularParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#caseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStatement(AngularParser.CaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryCatchStatement(AngularParser.TryCatchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(AngularParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(AngularParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(AngularParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(AngularParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#readError}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadError(AngularParser.ReadErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#decoratorApplication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratorApplication(AngularParser.DecoratorApplicationContext ctx);
}