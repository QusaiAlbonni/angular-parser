// Generated from C:/Users/Lenovo/OneDrive/Desktop/proojactos/antlr/angular-project/src/main/java/org/antlr/AngularParser.g4 by ANTLR 4.13.2
package org.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngularParser}.
 */
public interface AngularParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code ProgramLable}
	 * labeled alternative in {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgramLable(AngularParser.ProgramLableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProgramLable}
	 * labeled alternative in {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgramLable(AngularParser.ProgramLableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclarationLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationLabel(AngularParser.VariableDeclarationLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclarationLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationLabel(AngularParser.VariableDeclarationLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDeclarationLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclarationLabel(AngularParser.FunctionDeclarationLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDeclarationLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclarationLabel(AngularParser.FunctionDeclarationLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassDeclarationLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclarationLabel(AngularParser.ClassDeclarationLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassDeclarationLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclarationLabel(AngularParser.ClassDeclarationLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EnumDeclarationLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclarationLabel(AngularParser.EnumDeclarationLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EnumDeclarationLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclarationLabel(AngularParser.EnumDeclarationLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComponentDeclarationLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterComponentDeclarationLabel(AngularParser.ComponentDeclarationLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComponentDeclarationLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitComponentDeclarationLabel(AngularParser.ComponentDeclarationLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ServiceDeclarationLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterServiceDeclarationLabel(AngularParser.ServiceDeclarationLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ServiceDeclarationLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitServiceDeclarationLabel(AngularParser.ServiceDeclarationLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportStmtLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterImportStmtLabel(AngularParser.ImportStmtLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportStmtLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitImportStmtLabel(AngularParser.ImportStmtLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExportStmtLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExportStmtLabel(AngularParser.ExportStmtLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExportStmtLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExportStmtLabel(AngularParser.ExportStmtLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionStmtLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStmtLabel(AngularParser.ExpressionStmtLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionStmtLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStmtLabel(AngularParser.ExpressionStmtLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockStmtLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStmtLabel(AngularParser.BlockStmtLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockStmtLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStmtLabel(AngularParser.BlockStmtLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStmtLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStmtLabel(AngularParser.IfStmtLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStmtLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStmtLabel(AngularParser.IfStmtLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStmtLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForStmtLabel(AngularParser.ForStmtLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStmtLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForStmtLabel(AngularParser.ForStmtLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStmtLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmtLabel(AngularParser.WhileStmtLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStmtLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmtLabel(AngularParser.WhileStmtLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoWhileStmtLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStmtLabel(AngularParser.DoWhileStmtLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoWhileStmtLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStmtLabel(AngularParser.DoWhileStmtLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SwitchStmtLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStmtLabel(AngularParser.SwitchStmtLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SwitchStmtLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStmtLabel(AngularParser.SwitchStmtLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TryCatchStmtLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTryCatchStmtLabel(AngularParser.TryCatchStmtLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TryCatchStmtLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTryCatchStmtLabel(AngularParser.TryCatchStmtLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStmtLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmtLabel(AngularParser.ReturnStmtLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStmtLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmtLabel(AngularParser.ReturnStmtLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BreakStmtLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmtLabel(AngularParser.BreakStmtLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BreakStmtLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmtLabel(AngularParser.BreakStmtLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContinueStmtLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStmtLabel(AngularParser.ContinueStmtLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContinueStmtLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStmtLabel(AngularParser.ContinueStmtLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThrowStmtLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStmtLabel(AngularParser.ThrowStmtLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThrowStmtLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStmtLabel(AngularParser.ThrowStmtLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecoratorApplicationLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorApplicationLabel(AngularParser.DecoratorApplicationLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecoratorApplicationLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorApplicationLabel(AngularParser.DecoratorApplicationLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InitializedVariableDeclaration}
	 * labeled alternative in {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInitializedVariableDeclaration(AngularParser.InitializedVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InitializedVariableDeclaration}
	 * labeled alternative in {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInitializedVariableDeclaration(AngularParser.InitializedVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UninitializedVariableDeclaration}
	 * labeled alternative in {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterUninitializedVariableDeclaration(AngularParser.UninitializedVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UninitializedVariableDeclaration}
	 * labeled alternative in {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitUninitializedVariableDeclaration(AngularParser.UninitializedVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDecl}
	 * labeled alternative in {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(AngularParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDecl}
	 * labeled alternative in {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(AngularParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParamListLabel}
	 * labeled alternative in {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParamListLabel(AngularParser.ParamListLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParamListLabel}
	 * labeled alternative in {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParamListLabel(AngularParser.ParamListLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionParameter}
	 * labeled alternative in {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterExpressionParameter(AngularParser.ExpressionParameterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionParameter}
	 * labeled alternative in {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitExpressionParameter(AngularParser.ExpressionParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypedParameter}
	 * labeled alternative in {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterTypedParameter(AngularParser.TypedParameterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypedParameter}
	 * labeled alternative in {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitTypedParameter(AngularParser.TypedParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnyType}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterAnyType(AngularParser.AnyTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnyType}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitAnyType(AngularParser.AnyTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberType}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterNumberType(AngularParser.NumberTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberType}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitNumberType(AngularParser.NumberTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringType}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterStringType(AngularParser.StringTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringType}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitStringType(AngularParser.StringTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterBooleanType(AngularParser.BooleanTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitBooleanType(AngularParser.BooleanTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VoidType}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterVoidType(AngularParser.VoidTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VoidType}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitVoidType(AngularParser.VoidTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnknownType}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterUnknownType(AngularParser.UnknownTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnknownType}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitUnknownType(AngularParser.UnknownTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NeverType}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterNeverType(AngularParser.NeverTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NeverType}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitNeverType(AngularParser.NeverTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CustomType}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterCustomType(AngularParser.CustomTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CustomType}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitCustomType(AngularParser.CustomTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassDecl}
	 * labeled alternative in {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDecl(AngularParser.ClassDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassDecl}
	 * labeled alternative in {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDecl(AngularParser.ClassDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassBodyLabel}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyLabel(AngularParser.ClassBodyLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassBodyLabel}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyLabel(AngularParser.ClassBodyLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyDeclarationLable}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDeclarationLable(AngularParser.PropertyDeclarationLableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyDeclarationLable}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDeclarationLable(AngularParser.PropertyDeclarationLableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstructorDeclarationLable}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclarationLable(AngularParser.ConstructorDeclarationLableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstructorDeclarationLable}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclarationLable(AngularParser.ConstructorDeclarationLableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassVariableDeclaration}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassVariableDeclaration(AngularParser.ClassVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassVariableDeclaration}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassVariableDeclaration(AngularParser.ClassVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassExpressionStatement}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassExpressionStatement(AngularParser.ClassExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassExpressionStatement}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassExpressionStatement(AngularParser.ClassExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodDeclarationLable}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarationLable(AngularParser.MethodDeclarationLableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodDeclarationLable}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarationLable(AngularParser.MethodDeclarationLableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassEnumDeclaration}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassEnumDeclaration(AngularParser.ClassEnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassEnumDeclaration}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassEnumDeclaration(AngularParser.ClassEnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassFunctionDeclaration}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassFunctionDeclaration(AngularParser.ClassFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassFunctionDeclaration}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassFunctionDeclaration(AngularParser.ClassFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjBodyLabel}
	 * labeled alternative in {@link AngularParser#objectBody}.
	 * @param ctx the parse tree
	 */
	void enterObjBodyLabel(AngularParser.ObjBodyLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjBodyLabel}
	 * labeled alternative in {@link AngularParser#objectBody}.
	 * @param ctx the parse tree
	 */
	void exitObjBodyLabel(AngularParser.ObjBodyLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateMember}
	 * labeled alternative in {@link AngularParser#objectMember}.
	 * @param ctx the parse tree
	 */
	void enterTemplateMember(AngularParser.TemplateMemberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateMember}
	 * labeled alternative in {@link AngularParser#objectMember}.
	 * @param ctx the parse tree
	 */
	void exitTemplateMember(AngularParser.TemplateMemberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyMember}
	 * labeled alternative in {@link AngularParser#objectMember}.
	 * @param ctx the parse tree
	 */
	void enterPropertyMember(AngularParser.PropertyMemberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyMember}
	 * labeled alternative in {@link AngularParser#objectMember}.
	 * @param ctx the parse tree
	 */
	void exitPropertyMember(AngularParser.PropertyMemberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateLiteral}
	 * labeled alternative in {@link AngularParser#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplateLiteral(AngularParser.TemplateLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateLiteral}
	 * labeled alternative in {@link AngularParser#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplateLiteral(AngularParser.TemplateLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlElementGroup}
	 * labeled alternative in {@link AngularParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElementGroup(AngularParser.HtmlElementGroupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlElementGroup}
	 * labeled alternative in {@link AngularParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElementGroup(AngularParser.HtmlElementGroupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlElementKnown}
	 * labeled alternative in {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElementKnown(AngularParser.HtmlElementKnownContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlElementKnown}
	 * labeled alternative in {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElementKnown(AngularParser.HtmlElementKnownContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlElementGeneric}
	 * labeled alternative in {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElementGeneric(AngularParser.HtmlElementGenericContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlElementGeneric}
	 * labeled alternative in {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElementGeneric(AngularParser.HtmlElementGenericContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#knownHtmlTag}.
	 * @param ctx the parse tree
	 */
	void enterKnownHtmlTag(AngularParser.KnownHtmlTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#knownHtmlTag}.
	 * @param ctx the parse tree
	 */
	void exitKnownHtmlTag(AngularParser.KnownHtmlTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlAttrLabel}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttrLabel(AngularParser.HtmlAttrLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlAttrLabel}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttrLabel(AngularParser.HtmlAttrLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BindingAttrLabel}
	 * labeled alternative in {@link AngularParser#angularAttribute}.
	 * @param ctx the parse tree
	 */
	void enterBindingAttrLabel(AngularParser.BindingAttrLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BindingAttrLabel}
	 * labeled alternative in {@link AngularParser#angularAttribute}.
	 * @param ctx the parse tree
	 */
	void exitBindingAttrLabel(AngularParser.BindingAttrLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EventBindingAttrLabel}
	 * labeled alternative in {@link AngularParser#angularAttribute}.
	 * @param ctx the parse tree
	 */
	void enterEventBindingAttrLabel(AngularParser.EventBindingAttrLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EventBindingAttrLabel}
	 * labeled alternative in {@link AngularParser#angularAttribute}.
	 * @param ctx the parse tree
	 */
	void exitEventBindingAttrLabel(AngularParser.EventBindingAttrLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForDirectiveLabel}
	 * labeled alternative in {@link AngularParser#angularAttribute}.
	 * @param ctx the parse tree
	 */
	void enterForDirectiveLabel(AngularParser.ForDirectiveLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForDirectiveLabel}
	 * labeled alternative in {@link AngularParser#angularAttribute}.
	 * @param ctx the parse tree
	 */
	void exitForDirectiveLabel(AngularParser.ForDirectiveLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfDirectiveLabel}
	 * labeled alternative in {@link AngularParser#angularAttribute}.
	 * @param ctx the parse tree
	 */
	void enterIfDirectiveLabel(AngularParser.IfDirectiveLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfDirectiveLabel}
	 * labeled alternative in {@link AngularParser#angularAttribute}.
	 * @param ctx the parse tree
	 */
	void exitIfDirectiveLabel(AngularParser.IfDirectiveLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TwoWayBindingAttrLabel}
	 * labeled alternative in {@link AngularParser#angularAttribute}.
	 * @param ctx the parse tree
	 */
	void enterTwoWayBindingAttrLabel(AngularParser.TwoWayBindingAttrLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TwoWayBindingAttrLabel}
	 * labeled alternative in {@link AngularParser#angularAttribute}.
	 * @param ctx the parse tree
	 */
	void exitTwoWayBindingAttrLabel(AngularParser.TwoWayBindingAttrLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyBinding}
	 * labeled alternative in {@link AngularParser#bindingAttribute}.
	 * @param ctx the parse tree
	 */
	void enterPropertyBinding(AngularParser.PropertyBindingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyBinding}
	 * labeled alternative in {@link AngularParser#bindingAttribute}.
	 * @param ctx the parse tree
	 */
	void exitPropertyBinding(AngularParser.PropertyBindingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EventBinding}
	 * labeled alternative in {@link AngularParser#eventBindingAttribute}.
	 * @param ctx the parse tree
	 */
	void enterEventBinding(AngularParser.EventBindingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EventBinding}
	 * labeled alternative in {@link AngularParser#eventBindingAttribute}.
	 * @param ctx the parse tree
	 */
	void exitEventBinding(AngularParser.EventBindingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForDirective}
	 * labeled alternative in {@link AngularParser#forAttribute}.
	 * @param ctx the parse tree
	 */
	void enterForDirective(AngularParser.ForDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForDirective}
	 * labeled alternative in {@link AngularParser#forAttribute}.
	 * @param ctx the parse tree
	 */
	void exitForDirective(AngularParser.ForDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfDirective}
	 * labeled alternative in {@link AngularParser#ifAttribute}.
	 * @param ctx the parse tree
	 */
	void enterIfDirective(AngularParser.IfDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfDirective}
	 * labeled alternative in {@link AngularParser#ifAttribute}.
	 * @param ctx the parse tree
	 */
	void exitIfDirective(AngularParser.IfDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlContentLabel}
	 * labeled alternative in {@link AngularParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContentLabel(AngularParser.HtmlContentLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlContentLabel}
	 * labeled alternative in {@link AngularParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContentLabel(AngularParser.HtmlContentLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlCommentMisc}
	 * labeled alternative in {@link AngularParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void enterHtmlCommentMisc(AngularParser.HtmlCommentMiscContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlCommentMisc}
	 * labeled alternative in {@link AngularParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void exitHtmlCommentMisc(AngularParser.HtmlCommentMiscContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlWhitespaceMisc}
	 * labeled alternative in {@link AngularParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void enterHtmlWhitespaceMisc(AngularParser.HtmlWhitespaceMiscContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlWhitespaceMisc}
	 * labeled alternative in {@link AngularParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void exitHtmlWhitespaceMisc(AngularParser.HtmlWhitespaceMiscContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlCommentLabel}
	 * labeled alternative in {@link AngularParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void enterHtmlCommentLabel(AngularParser.HtmlCommentLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlCommentLabel}
	 * labeled alternative in {@link AngularParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void exitHtmlCommentLabel(AngularParser.HtmlCommentLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlConditionalCommentLabel}
	 * labeled alternative in {@link AngularParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void enterHtmlConditionalCommentLabel(AngularParser.HtmlConditionalCommentLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlConditionalCommentLabel}
	 * labeled alternative in {@link AngularParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void exitHtmlConditionalCommentLabel(AngularParser.HtmlConditionalCommentLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AngularChardata}
	 * labeled alternative in {@link AngularParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void enterAngularChardata(AngularParser.AngularChardataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AngularChardata}
	 * labeled alternative in {@link AngularParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void exitAngularChardata(AngularParser.AngularChardataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlTextChardata}
	 * labeled alternative in {@link AngularParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTextChardata(AngularParser.HtmlTextChardataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlTextChardata}
	 * labeled alternative in {@link AngularParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTextChardata(AngularParser.HtmlTextChardataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlWhitespaceChardata}
	 * labeled alternative in {@link AngularParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void enterHtmlWhitespaceChardata(AngularParser.HtmlWhitespaceChardataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlWhitespaceChardata}
	 * labeled alternative in {@link AngularParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void exitHtmlWhitespaceChardata(AngularParser.HtmlWhitespaceChardataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Interpolation}
	 * labeled alternative in {@link AngularParser#angularCharData}.
	 * @param ctx the parse tree
	 */
	void enterInterpolation(AngularParser.InterpolationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Interpolation}
	 * labeled alternative in {@link AngularParser#angularCharData}.
	 * @param ctx the parse tree
	 */
	void exitInterpolation(AngularParser.InterpolationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstructorDecl}
	 * labeled alternative in {@link AngularParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDecl(AngularParser.ConstructorDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstructorDecl}
	 * labeled alternative in {@link AngularParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDecl(AngularParser.ConstructorDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodDecl}
	 * labeled alternative in {@link AngularParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDecl(AngularParser.MethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodDecl}
	 * labeled alternative in {@link AngularParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDecl(AngularParser.MethodDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EnumDecl}
	 * labeled alternative in {@link AngularParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDecl(AngularParser.EnumDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EnumDecl}
	 * labeled alternative in {@link AngularParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDecl(AngularParser.EnumDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EnumMemberDecl}
	 * labeled alternative in {@link AngularParser#enumMember}.
	 * @param ctx the parse tree
	 */
	void enterEnumMemberDecl(AngularParser.EnumMemberDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EnumMemberDecl}
	 * labeled alternative in {@link AngularParser#enumMember}.
	 * @param ctx the parse tree
	 */
	void exitEnumMemberDecl(AngularParser.EnumMemberDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComponentDecl}
	 * labeled alternative in {@link AngularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterComponentDecl(AngularParser.ComponentDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComponentDecl}
	 * labeled alternative in {@link AngularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitComponentDecl(AngularParser.ComponentDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ServiceDecl}
	 * labeled alternative in {@link AngularParser#serviceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterServiceDecl(AngularParser.ServiceDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ServiceDecl}
	 * labeled alternative in {@link AngularParser#serviceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitServiceDecl(AngularParser.ServiceDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyDecl}
	 * labeled alternative in {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDecl(AngularParser.PropertyDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyDecl}
	 * labeled alternative in {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDecl(AngularParser.PropertyDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportDecl}
	 * labeled alternative in {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportDecl(AngularParser.ImportDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportDecl}
	 * labeled alternative in {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportDecl(AngularParser.ImportDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExportVariable}
	 * labeled alternative in {@link AngularParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportVariable(AngularParser.ExportVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExportVariable}
	 * labeled alternative in {@link AngularParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportVariable(AngularParser.ExportVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExportFunction}
	 * labeled alternative in {@link AngularParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportFunction(AngularParser.ExportFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExportFunction}
	 * labeled alternative in {@link AngularParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportFunction(AngularParser.ExportFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExportClass}
	 * labeled alternative in {@link AngularParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportClass(AngularParser.ExportClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExportClass}
	 * labeled alternative in {@link AngularParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportClass(AngularParser.ExportClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExportIdentifier}
	 * labeled alternative in {@link AngularParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportIdentifier(AngularParser.ExportIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExportIdentifier}
	 * labeled alternative in {@link AngularParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportIdentifier(AngularParser.ExportIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionLable}
	 * labeled alternative in {@link AngularParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionLable(AngularParser.ExpressionLableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionLable}
	 * labeled alternative in {@link AngularParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionLable(AngularParser.ExpressionLableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IncrementExpressionLable}
	 * labeled alternative in {@link AngularParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterIncrementExpressionLable(AngularParser.IncrementExpressionLableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IncrementExpressionLable}
	 * labeled alternative in {@link AngularParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitIncrementExpressionLable(AngularParser.IncrementExpressionLableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionalExprLabel}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExprLabel(AngularParser.ConditionalExprLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionalExprLabel}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExprLabel(AngularParser.ConditionalExprLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link AngularParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(AngularParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link AngularParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(AngularParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalExpr}
	 * labeled alternative in {@link AngularParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpr(AngularParser.LogicalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalExpr}
	 * labeled alternative in {@link AngularParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpr(AngularParser.LogicalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in {@link AngularParser#binaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpr(AngularParser.BinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in {@link AngularParser#binaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpr(AngularParser.BinaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayLiteral}
	 * labeled alternative in {@link AngularParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(AngularParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayLiteral}
	 * labeled alternative in {@link AngularParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(AngularParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectLiteral}
	 * labeled alternative in {@link AngularParser#objectDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(AngularParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectLiteral}
	 * labeled alternative in {@link AngularParser#objectDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(AngularParser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(AngularParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(AngularParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisLiteral}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterThisLiteral(AngularParser.ThisLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisLiteral}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitThisLiteral(AngularParser.ThisLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UndefinedLiteral}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUndefinedLiteral(AngularParser.UndefinedLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UndefinedLiteral}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUndefinedLiteral(AngularParser.UndefinedLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(AngularParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(AngularParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewExpression}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterNewExpression(AngularParser.NewExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewExpression}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitNewExpression(AngularParser.NewExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisReference}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterThisReference(AngularParser.ThisReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisReference}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitThisReference(AngularParser.ThisReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(AngularParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(AngularParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(AngularParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(AngularParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberAccess}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccess(AngularParser.MemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberAccess}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccess(AngularParser.MemberAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayExpression}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpression(AngularParser.ArrayExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayExpression}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpression(AngularParser.ArrayExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NullLiteral}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(AngularParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NullLiteral}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(AngularParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectExpression}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterObjectExpression(AngularParser.ObjectExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectExpression}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitObjectExpression(AngularParser.ObjectExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberLiteral}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiteral(AngularParser.NumberLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberLiteral}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiteral(AngularParser.NumberLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Arguments}
	 * labeled alternative in {@link AngularParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArguments(AngularParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Arguments}
	 * labeled alternative in {@link AngularParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArguments(AngularParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link AngularParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(AngularParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link AngularParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(AngularParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Block}
	 * labeled alternative in {@link AngularParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlock(AngularParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Block}
	 * labeled alternative in {@link AngularParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlock(AngularParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfElseStatement}
	 * labeled alternative in {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStatement(AngularParser.IfElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfElseStatement}
	 * labeled alternative in {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStatement(AngularParser.IfElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link AngularParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(AngularParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link AngularParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(AngularParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForOfLoop}
	 * labeled alternative in {@link AngularParser#forOf}.
	 * @param ctx the parse tree
	 */
	void enterForOfLoop(AngularParser.ForOfLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForOfLoop}
	 * labeled alternative in {@link AngularParser#forOf}.
	 * @param ctx the parse tree
	 */
	void exitForOfLoop(AngularParser.ForOfLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IncrementDecrLabel}
	 * labeled alternative in {@link AngularParser#incrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterIncrementDecrLabel(AngularParser.IncrementDecrLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IncrementDecrLabel}
	 * labeled alternative in {@link AngularParser#incrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitIncrementDecrLabel(AngularParser.IncrementDecrLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link AngularParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(AngularParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link AngularParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(AngularParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoWhileLoop}
	 * labeled alternative in {@link AngularParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileLoop(AngularParser.DoWhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoWhileLoop}
	 * labeled alternative in {@link AngularParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileLoop(AngularParser.DoWhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Switch}
	 * labeled alternative in {@link AngularParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitch(AngularParser.SwitchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Switch}
	 * labeled alternative in {@link AngularParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitch(AngularParser.SwitchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Case}
	 * labeled alternative in {@link AngularParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCase(AngularParser.CaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Case}
	 * labeled alternative in {@link AngularParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCase(AngularParser.CaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DefaultCase}
	 * labeled alternative in {@link AngularParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterDefaultCase(AngularParser.DefaultCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DefaultCase}
	 * labeled alternative in {@link AngularParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitDefaultCase(AngularParser.DefaultCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TryCatchFinally}
	 * labeled alternative in {@link AngularParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryCatchFinally(AngularParser.TryCatchFinallyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TryCatchFinally}
	 * labeled alternative in {@link AngularParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryCatchFinally(AngularParser.TryCatchFinallyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Return}
	 * labeled alternative in {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturn(AngularParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturn(AngularParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Break}
	 * labeled alternative in {@link AngularParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreak(AngularParser.BreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Break}
	 * labeled alternative in {@link AngularParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreak(AngularParser.BreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Continue}
	 * labeled alternative in {@link AngularParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinue(AngularParser.ContinueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Continue}
	 * labeled alternative in {@link AngularParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinue(AngularParser.ContinueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Throw}
	 * labeled alternative in {@link AngularParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrow(AngularParser.ThrowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Throw}
	 * labeled alternative in {@link AngularParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrow(AngularParser.ThrowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReadErrorAssignment}
	 * labeled alternative in {@link AngularParser#readError}.
	 * @param ctx the parse tree
	 */
	void enterReadErrorAssignment(AngularParser.ReadErrorAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReadErrorAssignment}
	 * labeled alternative in {@link AngularParser#readError}.
	 * @param ctx the parse tree
	 */
	void exitReadErrorAssignment(AngularParser.ReadErrorAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReadErrorIdentifier}
	 * labeled alternative in {@link AngularParser#readError}.
	 * @param ctx the parse tree
	 */
	void enterReadErrorIdentifier(AngularParser.ReadErrorIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReadErrorIdentifier}
	 * labeled alternative in {@link AngularParser#readError}.
	 * @param ctx the parse tree
	 */
	void exitReadErrorIdentifier(AngularParser.ReadErrorIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Decorator}
	 * labeled alternative in {@link AngularParser#decoratorApplication}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(AngularParser.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Decorator}
	 * labeled alternative in {@link AngularParser#decoratorApplication}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(AngularParser.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TwoWayBinding}
	 * labeled alternative in {@link AngularParser#twoWayBindingAttribute}.
	 * @param ctx the parse tree
	 */
	void enterTwoWayBinding(AngularParser.TwoWayBindingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TwoWayBinding}
	 * labeled alternative in {@link AngularParser#twoWayBindingAttribute}.
	 * @param ctx the parse tree
	 */
	void exitTwoWayBinding(AngularParser.TwoWayBindingContext ctx);
}