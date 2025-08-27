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
	 * Visit a parse tree produced by the {@code ProgramLable}
	 * labeled alternative in {@link AngularParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramLable(AngularParser.ProgramLableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclarationLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationLabel(AngularParser.VariableDeclarationLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDeclarationLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclarationLabel(AngularParser.FunctionDeclarationLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassDeclarationLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclarationLabel(AngularParser.ClassDeclarationLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EnumDeclarationLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclarationLabel(AngularParser.EnumDeclarationLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComponentDeclarationLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDeclarationLabel(AngularParser.ComponentDeclarationLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ServiceDeclarationLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServiceDeclarationLabel(AngularParser.ServiceDeclarationLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportStmtLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStmtLabel(AngularParser.ImportStmtLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExportStmtLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportStmtLabel(AngularParser.ExportStmtLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionStmtLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStmtLabel(AngularParser.ExpressionStmtLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockStmtLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStmtLabel(AngularParser.BlockStmtLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStmtLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmtLabel(AngularParser.IfStmtLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStmtLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmtLabel(AngularParser.ForStmtLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStmtLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmtLabel(AngularParser.WhileStmtLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoWhileStmtLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStmtLabel(AngularParser.DoWhileStmtLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SwitchStmtLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStmtLabel(AngularParser.SwitchStmtLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TryCatchStmtLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryCatchStmtLabel(AngularParser.TryCatchStmtLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStmtLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmtLabel(AngularParser.ReturnStmtLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BreakStmtLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmtLabel(AngularParser.BreakStmtLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContinueStmtLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStmtLabel(AngularParser.ContinueStmtLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThrowStmtLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStmtLabel(AngularParser.ThrowStmtLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecoratorApplicationLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratorApplicationLabel(AngularParser.DecoratorApplicationLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InitializedVariableDeclaration}
	 * labeled alternative in {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializedVariableDeclaration(AngularParser.InitializedVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UninitializedVariableDeclaration}
	 * labeled alternative in {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUninitializedVariableDeclaration(AngularParser.UninitializedVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDecl}
	 * labeled alternative in {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(AngularParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParamListLabel}
	 * labeled alternative in {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamListLabel(AngularParser.ParamListLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionParameter}
	 * labeled alternative in {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionParameter(AngularParser.ExpressionParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypedParameter}
	 * labeled alternative in {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedParameter(AngularParser.TypedParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnyType}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyType(AngularParser.AnyTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberType}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberType(AngularParser.NumberTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringType}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringType(AngularParser.StringTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanType(AngularParser.BooleanTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VoidType}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidType(AngularParser.VoidTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnknownType}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnknownType(AngularParser.UnknownTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NeverType}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeverType(AngularParser.NeverTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CustomType}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomType(AngularParser.CustomTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassDecl}
	 * labeled alternative in {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDecl(AngularParser.ClassDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassBodyLabel}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyLabel(AngularParser.ClassBodyLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyDeclarationLable}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDeclarationLable(AngularParser.PropertyDeclarationLableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstructorDeclarationLable}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclarationLable(AngularParser.ConstructorDeclarationLableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassVariableDeclaration}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassVariableDeclaration(AngularParser.ClassVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassExpressionStatement}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassExpressionStatement(AngularParser.ClassExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodDeclarationLable}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclarationLable(AngularParser.MethodDeclarationLableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassEnumDeclaration}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassEnumDeclaration(AngularParser.ClassEnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassFunctionDeclaration}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassFunctionDeclaration(AngularParser.ClassFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjBodyLabel}
	 * labeled alternative in {@link AngularParser#objectBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjBodyLabel(AngularParser.ObjBodyLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateMember}
	 * labeled alternative in {@link AngularParser#objectMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateMember(AngularParser.TemplateMemberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyMember}
	 * labeled alternative in {@link AngularParser#objectMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyMember(AngularParser.PropertyMemberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateLiteral}
	 * labeled alternative in {@link AngularParser#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateLiteral(AngularParser.TemplateLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlElementGroup}
	 * labeled alternative in {@link AngularParser#htmlElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElementGroup(AngularParser.HtmlElementGroupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlElementKnown}
	 * labeled alternative in {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElementKnown(AngularParser.HtmlElementKnownContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlElementGeneric}
	 * labeled alternative in {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElementGeneric(AngularParser.HtmlElementGenericContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#knownHtmlTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKnownHtmlTag(AngularParser.KnownHtmlTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlAttrLabel}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttrLabel(AngularParser.HtmlAttrLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BindingAttrLabel}
	 * labeled alternative in {@link AngularParser#angularAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBindingAttrLabel(AngularParser.BindingAttrLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EventBindingAttrLabel}
	 * labeled alternative in {@link AngularParser#angularAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventBindingAttrLabel(AngularParser.EventBindingAttrLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForDirectiveLabel}
	 * labeled alternative in {@link AngularParser#angularAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForDirectiveLabel(AngularParser.ForDirectiveLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfDirectiveLabel}
	 * labeled alternative in {@link AngularParser#angularAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfDirectiveLabel(AngularParser.IfDirectiveLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TwoWayBindingAttrLabel}
	 * labeled alternative in {@link AngularParser#angularAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwoWayBindingAttrLabel(AngularParser.TwoWayBindingAttrLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyBinding}
	 * labeled alternative in {@link AngularParser#bindingAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyBinding(AngularParser.PropertyBindingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EventBinding}
	 * labeled alternative in {@link AngularParser#eventBindingAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventBinding(AngularParser.EventBindingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForDirective}
	 * labeled alternative in {@link AngularParser#forAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForDirective(AngularParser.ForDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfDirective}
	 * labeled alternative in {@link AngularParser#ifAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfDirective(AngularParser.IfDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlContentLabel}
	 * labeled alternative in {@link AngularParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContentLabel(AngularParser.HtmlContentLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlCommentMisc}
	 * labeled alternative in {@link AngularParser#htmlMisc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlCommentMisc(AngularParser.HtmlCommentMiscContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlWhitespaceMisc}
	 * labeled alternative in {@link AngularParser#htmlMisc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlWhitespaceMisc(AngularParser.HtmlWhitespaceMiscContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlCommentLabel}
	 * labeled alternative in {@link AngularParser#htmlComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlCommentLabel(AngularParser.HtmlCommentLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlConditionalCommentLabel}
	 * labeled alternative in {@link AngularParser#htmlComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlConditionalCommentLabel(AngularParser.HtmlConditionalCommentLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AngularChardata}
	 * labeled alternative in {@link AngularParser#htmlChardata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAngularChardata(AngularParser.AngularChardataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlTextChardata}
	 * labeled alternative in {@link AngularParser#htmlChardata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTextChardata(AngularParser.HtmlTextChardataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlWhitespaceChardata}
	 * labeled alternative in {@link AngularParser#htmlChardata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlWhitespaceChardata(AngularParser.HtmlWhitespaceChardataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Interpolation}
	 * labeled alternative in {@link AngularParser#angularCharData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolation(AngularParser.InterpolationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstructorDecl}
	 * labeled alternative in {@link AngularParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDecl(AngularParser.ConstructorDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodDecl}
	 * labeled alternative in {@link AngularParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDecl(AngularParser.MethodDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EnumDecl}
	 * labeled alternative in {@link AngularParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDecl(AngularParser.EnumDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EnumMemberDecl}
	 * labeled alternative in {@link AngularParser#enumMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumMemberDecl(AngularParser.EnumMemberDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComponentDecl}
	 * labeled alternative in {@link AngularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDecl(AngularParser.ComponentDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ServiceDecl}
	 * labeled alternative in {@link AngularParser#serviceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServiceDecl(AngularParser.ServiceDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyDecl}
	 * labeled alternative in {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDecl(AngularParser.PropertyDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportDecl}
	 * labeled alternative in {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDecl(AngularParser.ImportDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExportVariable}
	 * labeled alternative in {@link AngularParser#exportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportVariable(AngularParser.ExportVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExportFunction}
	 * labeled alternative in {@link AngularParser#exportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportFunction(AngularParser.ExportFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExportClass}
	 * labeled alternative in {@link AngularParser#exportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportClass(AngularParser.ExportClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExportIdentifier}
	 * labeled alternative in {@link AngularParser#exportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportIdentifier(AngularParser.ExportIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionLable}
	 * labeled alternative in {@link AngularParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionLable(AngularParser.ExpressionLableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IncrementExpressionLable}
	 * labeled alternative in {@link AngularParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementExpressionLable(AngularParser.IncrementExpressionLableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionalExprLabel}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExprLabel(AngularParser.ConditionalExprLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link AngularParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpression(AngularParser.TernaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalExpr}
	 * labeled alternative in {@link AngularParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpr(AngularParser.LogicalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in {@link AngularParser#binaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpr(AngularParser.BinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayLiteral}
	 * labeled alternative in {@link AngularParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(AngularParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectLiteral}
	 * labeled alternative in {@link AngularParser#objectDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(AngularParser.ObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(AngularParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThisLiteral}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisLiteral(AngularParser.ThisLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UndefinedLiteral}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUndefinedLiteral(AngularParser.UndefinedLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(AngularParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NewExpression}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpression(AngularParser.NewExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThisReference}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisReference(AngularParser.ThisReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(AngularParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(AngularParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberAccess}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccess(AngularParser.MemberAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayExpression}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpression(AngularParser.ArrayExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NullLiteral}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(AngularParser.NullLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectExpression}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectExpression(AngularParser.ObjectExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberLiteral}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiteral(AngularParser.NumberLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Arguments}
	 * labeled alternative in {@link AngularParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(AngularParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link AngularParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(AngularParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Block}
	 * labeled alternative in {@link AngularParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(AngularParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfElseStatement}
	 * labeled alternative in {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStatement(AngularParser.IfElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link AngularParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(AngularParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForOfLoop}
	 * labeled alternative in {@link AngularParser#forOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForOfLoop(AngularParser.ForOfLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IncrementDecrLabel}
	 * labeled alternative in {@link AngularParser#incrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementDecrLabel(AngularParser.IncrementDecrLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link AngularParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(AngularParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoWhileLoop}
	 * labeled alternative in {@link AngularParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileLoop(AngularParser.DoWhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Switch}
	 * labeled alternative in {@link AngularParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch(AngularParser.SwitchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Case}
	 * labeled alternative in {@link AngularParser#caseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase(AngularParser.CaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DefaultCase}
	 * labeled alternative in {@link AngularParser#caseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultCase(AngularParser.DefaultCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TryCatchFinally}
	 * labeled alternative in {@link AngularParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryCatchFinally(AngularParser.TryCatchFinallyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(AngularParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Break}
	 * labeled alternative in {@link AngularParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak(AngularParser.BreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Continue}
	 * labeled alternative in {@link AngularParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue(AngularParser.ContinueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Throw}
	 * labeled alternative in {@link AngularParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrow(AngularParser.ThrowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReadErrorAssignment}
	 * labeled alternative in {@link AngularParser#readError}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadErrorAssignment(AngularParser.ReadErrorAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReadErrorIdentifier}
	 * labeled alternative in {@link AngularParser#readError}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadErrorIdentifier(AngularParser.ReadErrorIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Decorator}
	 * labeled alternative in {@link AngularParser#decoratorApplication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator(AngularParser.DecoratorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TwoWayBinding}
	 * labeled alternative in {@link AngularParser#twoWayBindingAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwoWayBinding(AngularParser.TwoWayBindingContext ctx);
}