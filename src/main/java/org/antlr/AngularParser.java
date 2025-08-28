// Generated from C:/Users/Lenovo/OneDrive/Desktop/proojactos/antlr/angular-project/src/main/java/org/antlr/AngularParser.g4 by ANTLR 4.13.2
package org.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AngularParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, FOR=3, WHILE=4, FUNCTION=5, RETURN=6, LET=7, CONST=8, CLASS=9, 
		INTERFACE=10, ENUM=11, EXTENDS=12, IMPLEMENTS=13, SUPER=14, IMPORT=15, 
		EXPORT=16, AS=17, FROM=18, NEW=19, THIS=20, PUBLIC=21, PRIVATE=22, PROTECTED=23, 
		STATIC=24, VOID=25, TYPE=26, TRY=27, CATCH=28, FINALLY=29, THROW=30, SWITCH=31, 
		CASE=32, DEFAULT=33, BREAK=34, CONTINUE=35, DO=36, EVENT=37, DECORATOR=38, 
		OF=39, IN=40, INSTANCEOF=41, AWAIT=42, ASYNC=43, YIELD=44, CONSTRUCTOR=45, 
		COMPONENT=46, SERVICE=47, PROPERTY=48, TEMPLATE=49, ID=50, STRING=51, 
		DQOUTE_STRING=52, NUMBER=53, HEX_NUMBER=54, OCTAL_NUMBER=55, BINARY_NUMBER=56, 
		BOOLEAN=57, NULL=58, UNDEFINED=59, ASSIGN=60, PLUS=61, MINUS=62, MULTIPLY=63, 
		DIVIDE=64, MODULO=65, POWER=66, EQUAL=67, STRICT_EQUAL=68, NOT_EQUAL=69, 
		STRICT_NOT_EQUAL=70, LESS=71, GREATER=72, LESS_EQUAL=73, GREATER_EQUAL=74, 
		AND=75, OR=76, NOT=77, BITWISE_AND=78, BITWISE_OR=79, BITWISE_XOR=80, 
		BITWISE_NOT=81, SHIFT_LEFT=82, SHIFT_RIGHT=83, UNSIGNED_SHIFT_RIGHT=84, 
		ARROW=85, OPTIONAL_CHAINING=86, NULLISH_COALESCING=87, NULLISH_ASSIGN=88, 
		INCRES=89, DECRES=90, SEMICOLON=91, COMMA=92, DOT=93, ELLIPSIS=94, LPAREN=95, 
		RPAREN=96, LBRACE=97, RBRACE=98, LBRACKET=99, RBRACKET=100, COLON=101, 
		QUESTION=102, PIPE=103, BACKTICK=104, ANY=105, NUMBER_TYPE=106, STRING_TYPE=107, 
		BOOLEAN_TYPE=108, VOID_TYPE=109, UNKNOWN=110, NEVER=111, HANDLEBAR_CLOSE=112, 
		REGEX=113, WS=114, NEWLINE=115, COMMENT=116, BLOCK_COMMENT=117, ERROR=118, 
		ESCAPE=119, HTML_COMMENT=120, HTML_CONDITIONAL_COMMENT=121, XML=122, CDATA=123, 
		DTD=124, SCRIPTLET=125, SEA_WS=126, SCRIPT_OPEN=127, STYLE_OPEN=128, TAG_OPEN=129, 
		HANDLEBAR_OPEN=130, HTML_TEXT=131, TAG_CLOSE=132, TAG_SLASH_CLOSE=133, 
		TAG_SLASH=134, TAG_WHITESPACE=135, TAG_LBRACKET=136, TAG_RBRACKET=137, 
		TAG_LPAREN=138, TAG_RPAREN=139, ANG_FOR=140, ANG_IF=141, ANG_NGMODEL_TWOWAY=142, 
		TAG_EQUALS=143, A_TAG=144, BUTTON_TAG=145, DIV_TAG=146, FORM_TAG=147, 
		H1_TAG=148, H2_TAG=149, H3_TAG=150, IMG_TAG=151, INPUT_TAG=152, NAV_TAG=153, 
		P_TAG=154, STRONG_TAG=155, TEMPLATE_TAG=156, ROUTER_OUTLET_TAGE=157, TAG_NAME=158, 
		ATTVALUE_VALUE=159, ATTRIBUTE=160, STAR=161;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_variableDeclaration = 2, RULE_functionDeclaration = 3, 
		RULE_parameterList = 4, RULE_parameter = 5, RULE_typeAnnotation = 6, RULE_classDeclaration = 7, 
		RULE_classBody = 8, RULE_classMember = 9, RULE_objectBody = 10, RULE_objectMember = 11, 
		RULE_template = 12, RULE_htmlElements = 13, RULE_htmlElement = 14, RULE_knownHtmlTag = 15, 
		RULE_htmlAttribute = 16, RULE_angularAttribute = 17, RULE_bindingAttribute = 18, 
		RULE_eventBindingAttribute = 19, RULE_forAttribute = 20, RULE_ifAttribute = 21, 
		RULE_htmlContent = 22, RULE_htmlMisc = 23, RULE_htmlComment = 24, RULE_htmlChardata = 25, 
		RULE_angularCharData = 26, RULE_constructorDeclaration = 27, RULE_methodDeclaration = 28, 
		RULE_enumDeclaration = 29, RULE_enumMember = 30, RULE_componentDeclaration = 31, 
		RULE_serviceDeclaration = 32, RULE_propertyDeclaration = 33, RULE_importStatement = 34, 
		RULE_exportStatement = 35, RULE_expressionStatement = 36, RULE_expression = 37, 
		RULE_conditionalExpression = 38, RULE_logicalExpression = 39, RULE_binaryExpression = 40, 
		RULE_arrayDeclaration = 41, RULE_objectDeclaration = 42, RULE_primaryExpression = 43, 
		RULE_argumentList = 44, RULE_assignmentExpression = 45, RULE_blockStatement = 46, 
		RULE_ifStatement = 47, RULE_forStatement = 48, RULE_forOf = 49, RULE_incrementExpression = 50, 
		RULE_whileStatement = 51, RULE_doWhileStatement = 52, RULE_switchStatement = 53, 
		RULE_caseStatement = 54, RULE_tryCatchStatement = 55, RULE_returnStatement = 56, 
		RULE_breakStatement = 57, RULE_continueStatement = 58, RULE_throwStatement = 59, 
		RULE_readError = 60, RULE_decoratorApplication = 61, RULE_twoWayBindingAttribute = 62;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "variableDeclaration", "functionDeclaration", 
			"parameterList", "parameter", "typeAnnotation", "classDeclaration", "classBody", 
			"classMember", "objectBody", "objectMember", "template", "htmlElements", 
			"htmlElement", "knownHtmlTag", "htmlAttribute", "angularAttribute", "bindingAttribute", 
			"eventBindingAttribute", "forAttribute", "ifAttribute", "htmlContent", 
			"htmlMisc", "htmlComment", "htmlChardata", "angularCharData", "constructorDeclaration", 
			"methodDeclaration", "enumDeclaration", "enumMember", "componentDeclaration", 
			"serviceDeclaration", "propertyDeclaration", "importStatement", "exportStatement", 
			"expressionStatement", "expression", "conditionalExpression", "logicalExpression", 
			"binaryExpression", "arrayDeclaration", "objectDeclaration", "primaryExpression", 
			"argumentList", "assignmentExpression", "blockStatement", "ifStatement", 
			"forStatement", "forOf", "incrementExpression", "whileStatement", "doWhileStatement", 
			"switchStatement", "caseStatement", "tryCatchStatement", "returnStatement", 
			"breakStatement", "continueStatement", "throwStatement", "readError", 
			"decoratorApplication", "twoWayBindingAttribute"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'for'", "'while'", "'function'", "'return'", 
			"'let'", "'const'", "'class'", "'interface'", "'enum'", "'extends'", 
			"'implements'", "'super'", "'import'", "'export'", "'as'", "'from'", 
			"'new'", "'this'", "'public'", "'private'", "'protected'", "'static'", 
			null, "'type'", "'try'", "'catch'", "'finally'", "'throw'", "'switch'", 
			"'case'", "'default'", "'break'", "'continue'", "'do'", "'event'", "'@'", 
			"'of'", "'in'", "'instanceof'", "'await'", "'async'", "'yield'", "'constructor'", 
			"'component'", "'service'", "'property'", null, null, null, null, null, 
			null, null, null, null, "'null'", "'undefined'", null, "'+'", "'-'", 
			"'*'", null, "'%'", "'**'", "'=='", "'==='", "'!='", "'!=='", null, null, 
			"'<='", "'>='", "'&&'", "'||'", "'!'", "'&'", null, "'^'", "'~'", "'<<'", 
			"'>>'", "'>>>'", "'=>'", "'?.'", "'??'", "'??='", "'++'", "'--'", "';'", 
			"','", "'.'", "'...'", null, null, "'{'", "'}'", null, null, "':'", "'?'", 
			null, null, "'any'", "'number'", "'string'", "'boolean'", null, "'unknown'", 
			"'never'", null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "'/>'", 
			null, null, null, null, null, null, "'*ngFor'", "'*ngIf'", "'[(ngModel)]'", 
			null, "'a'", "'button'", "'div'", "'form'", "'h1'", "'h2'", "'h3'", "'img'", 
			"'input'", "'nav'", "'p'", "'strong'", "'ng-template'", "'router-outlet'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "FOR", "WHILE", "FUNCTION", "RETURN", "LET", "CONST", 
			"CLASS", "INTERFACE", "ENUM", "EXTENDS", "IMPLEMENTS", "SUPER", "IMPORT", 
			"EXPORT", "AS", "FROM", "NEW", "THIS", "PUBLIC", "PRIVATE", "PROTECTED", 
			"STATIC", "VOID", "TYPE", "TRY", "CATCH", "FINALLY", "THROW", "SWITCH", 
			"CASE", "DEFAULT", "BREAK", "CONTINUE", "DO", "EVENT", "DECORATOR", "OF", 
			"IN", "INSTANCEOF", "AWAIT", "ASYNC", "YIELD", "CONSTRUCTOR", "COMPONENT", 
			"SERVICE", "PROPERTY", "TEMPLATE", "ID", "STRING", "DQOUTE_STRING", "NUMBER", 
			"HEX_NUMBER", "OCTAL_NUMBER", "BINARY_NUMBER", "BOOLEAN", "NULL", "UNDEFINED", 
			"ASSIGN", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "MODULO", "POWER", "EQUAL", 
			"STRICT_EQUAL", "NOT_EQUAL", "STRICT_NOT_EQUAL", "LESS", "GREATER", "LESS_EQUAL", 
			"GREATER_EQUAL", "AND", "OR", "NOT", "BITWISE_AND", "BITWISE_OR", "BITWISE_XOR", 
			"BITWISE_NOT", "SHIFT_LEFT", "SHIFT_RIGHT", "UNSIGNED_SHIFT_RIGHT", "ARROW", 
			"OPTIONAL_CHAINING", "NULLISH_COALESCING", "NULLISH_ASSIGN", "INCRES", 
			"DECRES", "SEMICOLON", "COMMA", "DOT", "ELLIPSIS", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "COLON", "QUESTION", "PIPE", 
			"BACKTICK", "ANY", "NUMBER_TYPE", "STRING_TYPE", "BOOLEAN_TYPE", "VOID_TYPE", 
			"UNKNOWN", "NEVER", "HANDLEBAR_CLOSE", "REGEX", "WS", "NEWLINE", "COMMENT", 
			"BLOCK_COMMENT", "ERROR", "ESCAPE", "HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", 
			"XML", "CDATA", "DTD", "SCRIPTLET", "SEA_WS", "SCRIPT_OPEN", "STYLE_OPEN", 
			"TAG_OPEN", "HANDLEBAR_OPEN", "HTML_TEXT", "TAG_CLOSE", "TAG_SLASH_CLOSE", 
			"TAG_SLASH", "TAG_WHITESPACE", "TAG_LBRACKET", "TAG_RBRACKET", "TAG_LPAREN", 
			"TAG_RPAREN", "ANG_FOR", "ANG_IF", "ANG_NGMODEL_TWOWAY", "TAG_EQUALS", 
			"A_TAG", "BUTTON_TAG", "DIV_TAG", "FORM_TAG", "H1_TAG", "H2_TAG", "H3_TAG", 
			"IMG_TAG", "INPUT_TAG", "NAV_TAG", "P_TAG", "STRONG_TAG", "TEMPLATE_TAG", 
			"ROUTER_OUTLET_TAGE", "TAG_NAME", "ATTVALUE_VALUE", "ATTRIBUTE", "STAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "AngularParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AngularParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1021402720232901626L) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 21L) != 0)) {
				{
				{
				setState(126);
				statement();
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ComponentDeclarationContext componentDeclaration() {
			return getRuleContext(ComponentDeclarationContext.class,0);
		}
		public ServiceDeclarationContext serviceDeclaration() {
			return getRuleContext(ServiceDeclarationContext.class,0);
		}
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public ExportStatementContext exportStatement() {
			return getRuleContext(ExportStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public TryCatchStatementContext tryCatchStatement() {
			return getRuleContext(TryCatchStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public DecoratorApplicationContext decoratorApplication() {
			return getRuleContext(DecoratorApplicationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				functionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				enumDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(136);
				componentDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(137);
				serviceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(138);
				importStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(139);
				exportStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(140);
				expressionStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(141);
				blockStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(142);
				ifStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(143);
				forStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(144);
				whileStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(145);
				doWhileStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(146);
				switchStatement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(147);
				tryCatchStatement();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(148);
				returnStatement();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(149);
				breakStatement();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(150);
				continueStatement();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(151);
				throwStatement();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(152);
				decoratorApplication();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LET() { return getToken(AngularParser.LET, 0); }
		public TerminalNode CONST() { return getToken(AngularParser.CONST, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variableDeclaration);
		int _la;
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				_la = _input.LA(1);
				if ( !(_la==LET || _la==CONST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(156);
				match(ID);
				setState(157);
				match(ASSIGN);
				setState(158);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				_la = _input.LA(1);
				if ( !(_la==LET || _la==CONST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(160);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(AngularParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(FUNCTION);
			setState(164);
			match(ID);
			setState(165);
			match(LPAREN);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1021191215507832832L) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 21L) != 0)) {
				{
				setState(166);
				parameterList();
				}
			}

			setState(169);
			match(RPAREN);
			setState(170);
			blockStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			parameter();
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(173);
				match(COMMA);
				setState(174);
				parameter();
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameter);
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				expressionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(ID);
				setState(182);
				match(COLON);
				setState(183);
				typeAnnotation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeAnnotationContext extends ParserRuleContext {
		public TerminalNode ANY() { return getToken(AngularParser.ANY, 0); }
		public TerminalNode NUMBER_TYPE() { return getToken(AngularParser.NUMBER_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(AngularParser.STRING_TYPE, 0); }
		public TerminalNode BOOLEAN_TYPE() { return getToken(AngularParser.BOOLEAN_TYPE, 0); }
		public TerminalNode VOID_TYPE() { return getToken(AngularParser.VOID_TYPE, 0); }
		public TerminalNode UNKNOWN() { return getToken(AngularParser.UNKNOWN, 0); }
		public TerminalNode NEVER() { return getToken(AngularParser.NEVER, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TypeAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTypeAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTypeAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTypeAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAnnotationContext typeAnnotation() throws RecognitionException {
		TypeAnnotationContext _localctx = new TypeAnnotationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_typeAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_la = _input.LA(1);
			if ( !(((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & 4575657221408423937L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(AngularParser.CLASS, 0); }
		public List<TerminalNode> ID() { return getTokens(AngularParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngularParser.ID, i);
		}
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public TerminalNode EXTENDS() { return getToken(AngularParser.EXTENDS, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(AngularParser.IMPLEMENTS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(CLASS);
			setState(189);
			match(ID);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(190);
				match(EXTENDS);
				setState(191);
				match(ID);
				}
			}

			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(194);
				match(IMPLEMENTS);
				setState(195);
				match(ID);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(196);
					match(COMMA);
					setState(197);
					match(ID);
					}
					}
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(205);
			match(LBRACE);
			setState(206);
			classBody();
			setState(207);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public List<ClassMemberContext> classMember() {
			return getRuleContexts(ClassMemberContext.class);
		}
		public ClassMemberContext classMember(int i) {
			return getRuleContext(ClassMemberContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(AngularParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(AngularParser.SEMICOLON, i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1021226399911381408L) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 21L) != 0)) {
				{
				{
				setState(209);
				classMember();
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(210);
					match(SEMICOLON);
					}
				}

				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassMemberContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(AngularParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(AngularParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(AngularParser.PROTECTED, 0); }
		public TerminalNode STATIC() { return getToken(AngularParser.STATIC, 0); }
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ClassMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberContext classMember() throws RecognitionException {
		ClassMemberContext _localctx = new ClassMemberContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classMember);
		int _la;
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUBLIC) {
					{
					setState(218);
					match(PUBLIC);
					}
				}

				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRIVATE) {
					{
					setState(221);
					match(PRIVATE);
					}
				}

				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PROTECTED) {
					{
					setState(224);
					match(PROTECTED);
					}
				}

				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(227);
					match(STATIC);
					}
				}

				setState(230);
				match(ID);
				setState(231);
				match(COLON);
				setState(232);
				typeAnnotation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				constructorDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				variableDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
				expressionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(236);
				methodDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(237);
				enumDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(238);
				functionDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectBodyContext extends ParserRuleContext {
		public List<ObjectMemberContext> objectMember() {
			return getRuleContexts(ObjectMemberContext.class);
		}
		public ObjectMemberContext objectMember(int i) {
			return getRuleContext(ObjectMemberContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ObjectBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectBodyContext objectBody() throws RecognitionException {
		ObjectBodyContext _localctx = new ObjectBodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_objectBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPLATE || _la==ID) {
				{
				setState(241);
				objectMember();
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(242);
						match(COMMA);
						setState(243);
						objectMember();
						}
						} 
					}
					setState(248);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(249);
					match(COMMA);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectMemberContext extends ParserRuleContext {
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ObjectMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectMemberContext objectMember() throws RecognitionException {
		ObjectMemberContext _localctx = new ObjectMemberContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_objectMember);
		try {
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEMPLATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				template();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				match(ID);
				setState(256);
				match(COLON);
				setState(257);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateContext extends ParserRuleContext {
		public TerminalNode TEMPLATE() { return getToken(AngularParser.TEMPLATE, 0); }
		public TerminalNode ESCAPE() { return getToken(AngularParser.ESCAPE, 0); }
		public List<TerminalNode> SEA_WS() { return getTokens(AngularParser.SEA_WS); }
		public TerminalNode SEA_WS(int i) {
			return getToken(AngularParser.SEA_WS, i);
		}
		public List<HtmlElementsContext> htmlElements() {
			return getRuleContexts(HtmlElementsContext.class);
		}
		public HtmlElementsContext htmlElements(int i) {
			return getRuleContext(HtmlElementsContext.class,i);
		}
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_template);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(TEMPLATE);
			setState(264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(261);
					match(SEA_WS);
					}
					} 
				}
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(270);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(267);
					htmlElements();
					}
					} 
				}
				setState(272);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEA_WS) {
				{
				{
				setState(273);
				match(SEA_WS);
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(279);
			match(ESCAPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementsContext extends ParserRuleContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public List<HtmlMiscContext> htmlMisc() {
			return getRuleContexts(HtmlMiscContext.class);
		}
		public HtmlMiscContext htmlMisc(int i) {
			return getRuleContext(HtmlMiscContext.class,i);
		}
		public HtmlElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementsContext htmlElements() throws RecognitionException {
		HtmlElementsContext _localctx = new HtmlElementsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_htmlElements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & 67L) != 0)) {
				{
				{
				setState(281);
				htmlMisc();
				}
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(287);
			htmlElement();
			setState(291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(288);
					htmlMisc();
					}
					} 
				}
				setState(293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementContext extends ParserRuleContext {
		public List<TerminalNode> TAG_OPEN() { return getTokens(AngularParser.TAG_OPEN); }
		public TerminalNode TAG_OPEN(int i) {
			return getToken(AngularParser.TAG_OPEN, i);
		}
		public List<KnownHtmlTagContext> knownHtmlTag() {
			return getRuleContexts(KnownHtmlTagContext.class);
		}
		public KnownHtmlTagContext knownHtmlTag(int i) {
			return getRuleContext(KnownHtmlTagContext.class,i);
		}
		public TerminalNode TAG_SLASH_CLOSE() { return getToken(AngularParser.TAG_SLASH_CLOSE, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public List<AngularAttributeContext> angularAttribute() {
			return getRuleContexts(AngularAttributeContext.class);
		}
		public AngularAttributeContext angularAttribute(int i) {
			return getRuleContext(AngularAttributeContext.class,i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(AngularParser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(AngularParser.TAG_CLOSE, i);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public TerminalNode TAG_SLASH() { return getToken(AngularParser.TAG_SLASH, 0); }
		public List<TerminalNode> TAG_NAME() { return getTokens(AngularParser.TAG_NAME); }
		public TerminalNode TAG_NAME(int i) {
			return getToken(AngularParser.TAG_NAME, i);
		}
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_htmlElement);
		int _la;
		try {
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				match(TAG_OPEN);
				setState(295);
				knownHtmlTag();
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & 4194421L) != 0)) {
					{
					setState(298);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TAG_NAME:
						{
						setState(296);
						htmlAttribute();
						}
						break;
					case TAG_LBRACKET:
					case TAG_LPAREN:
					case ANG_FOR:
					case ANG_IF:
					case ANG_NGMODEL_TWOWAY:
						{
						setState(297);
						angularAttribute();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(302);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(311);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TAG_CLOSE:
					{
					{
					setState(303);
					match(TAG_CLOSE);
					setState(304);
					htmlContent();
					setState(305);
					match(TAG_OPEN);
					setState(306);
					match(TAG_SLASH);
					setState(307);
					knownHtmlTag();
					setState(308);
					match(TAG_CLOSE);
					}
					}
					break;
				case TAG_SLASH_CLOSE:
					{
					setState(310);
					match(TAG_SLASH_CLOSE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				match(TAG_OPEN);
				setState(314);
				match(TAG_NAME);
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & 4194421L) != 0)) {
					{
					setState(317);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TAG_NAME:
						{
						setState(315);
						htmlAttribute();
						}
						break;
					case TAG_LBRACKET:
					case TAG_LPAREN:
					case ANG_FOR:
					case ANG_IF:
					case ANG_NGMODEL_TWOWAY:
						{
						setState(316);
						angularAttribute();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(321);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(330);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TAG_CLOSE:
					{
					{
					setState(322);
					match(TAG_CLOSE);
					setState(323);
					htmlContent();
					setState(324);
					match(TAG_OPEN);
					setState(325);
					match(TAG_SLASH);
					setState(326);
					match(TAG_NAME);
					setState(327);
					match(TAG_CLOSE);
					}
					}
					break;
				case TAG_SLASH_CLOSE:
					{
					setState(329);
					match(TAG_SLASH_CLOSE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KnownHtmlTagContext extends ParserRuleContext {
		public TerminalNode A_TAG() { return getToken(AngularParser.A_TAG, 0); }
		public TerminalNode BUTTON_TAG() { return getToken(AngularParser.BUTTON_TAG, 0); }
		public TerminalNode DIV_TAG() { return getToken(AngularParser.DIV_TAG, 0); }
		public TerminalNode FORM_TAG() { return getToken(AngularParser.FORM_TAG, 0); }
		public TerminalNode H1_TAG() { return getToken(AngularParser.H1_TAG, 0); }
		public TerminalNode H2_TAG() { return getToken(AngularParser.H2_TAG, 0); }
		public TerminalNode H3_TAG() { return getToken(AngularParser.H3_TAG, 0); }
		public TerminalNode IMG_TAG() { return getToken(AngularParser.IMG_TAG, 0); }
		public TerminalNode INPUT_TAG() { return getToken(AngularParser.INPUT_TAG, 0); }
		public TerminalNode NAV_TAG() { return getToken(AngularParser.NAV_TAG, 0); }
		public TerminalNode P_TAG() { return getToken(AngularParser.P_TAG, 0); }
		public TerminalNode STRONG_TAG() { return getToken(AngularParser.STRONG_TAG, 0); }
		public TerminalNode TEMPLATE_TAG() { return getToken(AngularParser.TEMPLATE_TAG, 0); }
		public TerminalNode ROUTER_OUTLET_TAGE() { return getToken(AngularParser.ROUTER_OUTLET_TAGE, 0); }
		public KnownHtmlTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_knownHtmlTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterKnownHtmlTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitKnownHtmlTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitKnownHtmlTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KnownHtmlTagContext knownHtmlTag() throws RecognitionException {
		KnownHtmlTagContext _localctx = new KnownHtmlTagContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_knownHtmlTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			_la = _input.LA(1);
			if ( !(((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & 16383L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributeContext extends ParserRuleContext {
		public TerminalNode TAG_NAME() { return getToken(AngularParser.TAG_NAME, 0); }
		public TerminalNode TAG_EQUALS() { return getToken(AngularParser.TAG_EQUALS, 0); }
		public TerminalNode ATTVALUE_VALUE() { return getToken(AngularParser.ATTVALUE_VALUE, 0); }
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_htmlAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(336);
			match(TAG_NAME);
			}
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAG_EQUALS) {
				{
				setState(337);
				match(TAG_EQUALS);
				setState(338);
				match(ATTVALUE_VALUE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AngularAttributeContext extends ParserRuleContext {
		public BindingAttributeContext bindingAttribute() {
			return getRuleContext(BindingAttributeContext.class,0);
		}
		public EventBindingAttributeContext eventBindingAttribute() {
			return getRuleContext(EventBindingAttributeContext.class,0);
		}
		public ForAttributeContext forAttribute() {
			return getRuleContext(ForAttributeContext.class,0);
		}
		public IfAttributeContext ifAttribute() {
			return getRuleContext(IfAttributeContext.class,0);
		}
		public TwoWayBindingAttributeContext twoWayBindingAttribute() {
			return getRuleContext(TwoWayBindingAttributeContext.class,0);
		}
		public AngularAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angularAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAngularAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAngularAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAngularAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AngularAttributeContext angularAttribute() throws RecognitionException {
		AngularAttributeContext _localctx = new AngularAttributeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_angularAttribute);
		try {
			setState(346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				bindingAttribute();
				}
				break;
			case TAG_LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				eventBindingAttribute();
				}
				break;
			case ANG_FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(343);
				forAttribute();
				}
				break;
			case ANG_IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(344);
				ifAttribute();
				}
				break;
			case ANG_NGMODEL_TWOWAY:
				enterOuterAlt(_localctx, 5);
				{
				setState(345);
				twoWayBindingAttribute();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BindingAttributeContext extends ParserRuleContext {
		public TerminalNode TAG_LBRACKET() { return getToken(AngularParser.TAG_LBRACKET, 0); }
		public TerminalNode TAG_NAME() { return getToken(AngularParser.TAG_NAME, 0); }
		public TerminalNode TAG_RBRACKET() { return getToken(AngularParser.TAG_RBRACKET, 0); }
		public TerminalNode TAG_EQUALS() { return getToken(AngularParser.TAG_EQUALS, 0); }
		public TerminalNode ATTVALUE_VALUE() { return getToken(AngularParser.ATTVALUE_VALUE, 0); }
		public BindingAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindingAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBindingAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBindingAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBindingAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindingAttributeContext bindingAttribute() throws RecognitionException {
		BindingAttributeContext _localctx = new BindingAttributeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_bindingAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(TAG_LBRACKET);
			setState(349);
			match(TAG_NAME);
			setState(350);
			match(TAG_RBRACKET);
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAG_EQUALS) {
				{
				setState(351);
				match(TAG_EQUALS);
				setState(352);
				match(ATTVALUE_VALUE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EventBindingAttributeContext extends ParserRuleContext {
		public TerminalNode TAG_LPAREN() { return getToken(AngularParser.TAG_LPAREN, 0); }
		public TerminalNode TAG_NAME() { return getToken(AngularParser.TAG_NAME, 0); }
		public TerminalNode TAG_RPAREN() { return getToken(AngularParser.TAG_RPAREN, 0); }
		public TerminalNode TAG_EQUALS() { return getToken(AngularParser.TAG_EQUALS, 0); }
		public TerminalNode ATTVALUE_VALUE() { return getToken(AngularParser.ATTVALUE_VALUE, 0); }
		public EventBindingAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventBindingAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEventBindingAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEventBindingAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEventBindingAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventBindingAttributeContext eventBindingAttribute() throws RecognitionException {
		EventBindingAttributeContext _localctx = new EventBindingAttributeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_eventBindingAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(TAG_LPAREN);
			setState(356);
			match(TAG_NAME);
			setState(357);
			match(TAG_RPAREN);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAG_EQUALS) {
				{
				setState(358);
				match(TAG_EQUALS);
				setState(359);
				match(ATTVALUE_VALUE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForAttributeContext extends ParserRuleContext {
		public TerminalNode ANG_FOR() { return getToken(AngularParser.ANG_FOR, 0); }
		public TerminalNode TAG_EQUALS() { return getToken(AngularParser.TAG_EQUALS, 0); }
		public TerminalNode ATTVALUE_VALUE() { return getToken(AngularParser.ATTVALUE_VALUE, 0); }
		public ForAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterForAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitForAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitForAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForAttributeContext forAttribute() throws RecognitionException {
		ForAttributeContext _localctx = new ForAttributeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_forAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(ANG_FOR);
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAG_EQUALS) {
				{
				setState(363);
				match(TAG_EQUALS);
				setState(364);
				match(ATTVALUE_VALUE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfAttributeContext extends ParserRuleContext {
		public TerminalNode ANG_IF() { return getToken(AngularParser.ANG_IF, 0); }
		public TerminalNode TAG_EQUALS() { return getToken(AngularParser.TAG_EQUALS, 0); }
		public TerminalNode ATTVALUE_VALUE() { return getToken(AngularParser.ATTVALUE_VALUE, 0); }
		public IfAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIfAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIfAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIfAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfAttributeContext ifAttribute() throws RecognitionException {
		IfAttributeContext _localctx = new IfAttributeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ifAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(ANG_IF);
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAG_EQUALS) {
				{
				setState(368);
				match(TAG_EQUALS);
				setState(369);
				match(ATTVALUE_VALUE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentContext extends ParserRuleContext {
		public List<HtmlChardataContext> htmlChardata() {
			return getRuleContexts(HtmlChardataContext.class);
		}
		public HtmlChardataContext htmlChardata(int i) {
			return getRuleContext(HtmlChardataContext.class,i);
		}
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<TerminalNode> CDATA() { return getTokens(AngularParser.CDATA); }
		public TerminalNode CDATA(int i) {
			return getToken(AngularParser.CDATA, i);
		}
		public List<HtmlCommentContext> htmlComment() {
			return getRuleContexts(HtmlCommentContext.class);
		}
		public HtmlCommentContext htmlComment(int i) {
			return getRuleContext(HtmlCommentContext.class,i);
		}
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_htmlContent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & 49L) != 0)) {
				{
				setState(372);
				htmlChardata();
				}
			}

			setState(385);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(378);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TAG_OPEN:
						{
						setState(375);
						htmlElement();
						}
						break;
					case CDATA:
						{
						setState(376);
						match(CDATA);
						}
						break;
					case HTML_COMMENT:
					case HTML_CONDITIONAL_COMMENT:
						{
						setState(377);
						htmlComment();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(381);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & 49L) != 0)) {
						{
						setState(380);
						htmlChardata();
						}
					}

					}
					} 
				}
				setState(387);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlMiscContext extends ParserRuleContext {
		public HtmlCommentContext htmlComment() {
			return getRuleContext(HtmlCommentContext.class,0);
		}
		public TerminalNode SEA_WS() { return getToken(AngularParser.SEA_WS, 0); }
		public HtmlMiscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlMisc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlMisc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlMisc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlMisc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlMiscContext htmlMisc() throws RecognitionException {
		HtmlMiscContext _localctx = new HtmlMiscContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_htmlMisc);
		try {
			setState(390);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_COMMENT:
			case HTML_CONDITIONAL_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				htmlComment();
				}
				break;
			case SEA_WS:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				match(SEA_WS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlCommentContext extends ParserRuleContext {
		public TerminalNode HTML_COMMENT() { return getToken(AngularParser.HTML_COMMENT, 0); }
		public TerminalNode HTML_CONDITIONAL_COMMENT() { return getToken(AngularParser.HTML_CONDITIONAL_COMMENT, 0); }
		public HtmlCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlCommentContext htmlComment() throws RecognitionException {
		HtmlCommentContext _localctx = new HtmlCommentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_htmlComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			_la = _input.LA(1);
			if ( !(_la==HTML_COMMENT || _la==HTML_CONDITIONAL_COMMENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlChardataContext extends ParserRuleContext {
		public AngularCharDataContext angularCharData() {
			return getRuleContext(AngularCharDataContext.class,0);
		}
		public TerminalNode HTML_TEXT() { return getToken(AngularParser.HTML_TEXT, 0); }
		public TerminalNode SEA_WS() { return getToken(AngularParser.SEA_WS, 0); }
		public HtmlChardataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlChardata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlChardata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlChardata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlChardata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlChardataContext htmlChardata() throws RecognitionException {
		HtmlChardataContext _localctx = new HtmlChardataContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_htmlChardata);
		try {
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				angularCharData();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				match(HTML_TEXT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(396);
				match(SEA_WS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AngularCharDataContext extends ParserRuleContext {
		public TerminalNode HANDLEBAR_OPEN() { return getToken(AngularParser.HANDLEBAR_OPEN, 0); }
		public TerminalNode HANDLEBAR_CLOSE() { return getToken(AngularParser.HANDLEBAR_CLOSE, 0); }
		public List<TerminalNode> HTML_TEXT() { return getTokens(AngularParser.HTML_TEXT); }
		public TerminalNode HTML_TEXT(int i) {
			return getToken(AngularParser.HTML_TEXT, i);
		}
		public List<TerminalNode> SEA_WS() { return getTokens(AngularParser.SEA_WS); }
		public TerminalNode SEA_WS(int i) {
			return getToken(AngularParser.SEA_WS, i);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public AngularCharDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angularCharData; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAngularCharData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAngularCharData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAngularCharData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AngularCharDataContext angularCharData() throws RecognitionException {
		AngularCharDataContext _localctx = new AngularCharDataContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_angularCharData);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HTML_TEXT) {
				{
				setState(399);
				match(HTML_TEXT);
				}
			}

			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEA_WS) {
				{
				setState(402);
				match(SEA_WS);
				}
			}

			setState(405);
			match(HANDLEBAR_OPEN);
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1021191215507832832L) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 21L) != 0)) {
				{
				setState(406);
				expressionStatement();
				}
			}

			setState(409);
			match(HANDLEBAR_CLOSE);
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEA_WS) {
				{
				setState(410);
				match(SEA_WS);
				}
			}

			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HTML_TEXT) {
				{
				setState(413);
				match(HTML_TEXT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(AngularParser.CONSTRUCTOR, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(CONSTRUCTOR);
			setState(417);
			match(LPAREN);
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1021191215507832832L) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 21L) != 0)) {
				{
				setState(418);
				parameterList();
				}
			}

			setState(421);
			match(RPAREN);
			setState(422);
			blockStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(ID);
			setState(425);
			match(LPAREN);
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1021191215507832832L) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 21L) != 0)) {
				{
				setState(426);
				parameterList();
				}
			}

			setState(429);
			match(RPAREN);
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & 4575657221408423937L) != 0)) {
				{
				setState(430);
				typeAnnotation();
				}
			}

			setState(433);
			blockStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(AngularParser.ENUM, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public List<EnumMemberContext> enumMember() {
			return getRuleContexts(EnumMemberContext.class);
		}
		public EnumMemberContext enumMember(int i) {
			return getRuleContext(EnumMemberContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(ENUM);
			setState(436);
			match(ID);
			setState(437);
			match(LBRACE);
			setState(438);
			enumMember();
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(439);
				match(COMMA);
				setState(440);
				enumMember();
				}
				}
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(446);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumMemberContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnumMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEnumMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEnumMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEnumMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumMemberContext enumMember() throws RecognitionException {
		EnumMemberContext _localctx = new EnumMemberContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_enumMember);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(ID);
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(449);
				match(ASSIGN);
				setState(450);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentDeclarationContext extends ParserRuleContext {
		public TerminalNode COMPONENT() { return getToken(AngularParser.COMPONENT, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public List<PropertyDeclarationContext> propertyDeclaration() {
			return getRuleContexts(PropertyDeclarationContext.class);
		}
		public PropertyDeclarationContext propertyDeclaration(int i) {
			return getRuleContext(PropertyDeclarationContext.class,i);
		}
		public ComponentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDeclarationContext componentDeclaration() throws RecognitionException {
		ComponentDeclarationContext _localctx = new ComponentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_componentDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(COMPONENT);
			setState(454);
			match(ID);
			setState(455);
			match(LBRACE);
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PROPERTY) {
				{
				{
				setState(456);
				propertyDeclaration();
				}
				}
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(462);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ServiceDeclarationContext extends ParserRuleContext {
		public TerminalNode SERVICE() { return getToken(AngularParser.SERVICE, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public ServiceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serviceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterServiceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitServiceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitServiceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ServiceDeclarationContext serviceDeclaration() throws RecognitionException {
		ServiceDeclarationContext _localctx = new ServiceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_serviceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(SERVICE);
			setState(465);
			match(ID);
			setState(466);
			match(LBRACE);
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(467);
				methodDeclaration();
				}
				}
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(473);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyDeclarationContext extends ParserRuleContext {
		public TerminalNode PROPERTY() { return getToken(AngularParser.PROPERTY, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public PropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropertyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
		PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_propertyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(PROPERTY);
			setState(476);
			match(ID);
			setState(477);
			match(COLON);
			setState(478);
			typeAnnotation();
			setState(479);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(AngularParser.IMPORT, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public List<TerminalNode> ID() { return getTokens(AngularParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngularParser.ID, i);
		}
		public TerminalNode FROM() { return getToken(AngularParser.FROM, 0); }
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode STAR() { return getToken(AngularParser.STAR, 0); }
		public List<TerminalNode> AS() { return getTokens(AngularParser.AS); }
		public TerminalNode AS(int i) {
			return getToken(AngularParser.AS, i);
		}
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(IMPORT);
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(482);
				match(LBRACE);
				}
			}

			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STAR) {
				{
				setState(485);
				match(STAR);
				}
			}

			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(488);
				match(AS);
				}
			}

			setState(513);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(491);
				match(STRING);
				}
				break;
			case ID:
				{
				setState(492);
				match(ID);
				setState(495);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(493);
					match(AS);
					setState(494);
					match(ID);
					}
					break;
				}
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(497);
					match(COMMA);
					setState(498);
					match(ID);
					}
					}
					setState(503);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(506);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(504);
					match(AS);
					setState(505);
					match(ID);
					}
				}

				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RBRACE) {
					{
					setState(508);
					match(RBRACE);
					}
				}

				setState(511);
				match(FROM);
				setState(512);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(515);
				match(SEMICOLON);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExportStatementContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(AngularParser.EXPORT, 0); }
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public ExportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportStatementContext exportStatement() throws RecognitionException {
		ExportStatementContext _localctx = new ExportStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_exportStatement);
		try {
			setState(538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				match(EXPORT);
				setState(519);
				variableDeclaration();
				setState(521);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(520);
					match(SEMICOLON);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(523);
				match(EXPORT);
				setState(524);
				functionDeclaration();
				setState(526);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(525);
					match(SEMICOLON);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(528);
				match(EXPORT);
				setState(529);
				classDeclaration();
				setState(531);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(530);
					match(SEMICOLON);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(533);
				match(EXPORT);
				setState(534);
				match(ID);
				setState(536);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(535);
					match(SEMICOLON);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IncrementExpressionContext incrementExpression() {
			return getRuleContext(IncrementExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_expressionStatement);
		try {
			setState(542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(540);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(541);
				incrementExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			conditionalExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalExpressionContext extends ParserRuleContext {
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(AngularParser.QUESTION, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_conditionalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			logicalExpression();
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUESTION) {
				{
				setState(547);
				match(QUESTION);
				setState(548);
				expression();
				setState(549);
				match(COLON);
				setState(550);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalExpressionContext extends ParserRuleContext {
		public List<BinaryExpressionContext> binaryExpression() {
			return getRuleContexts(BinaryExpressionContext.class);
		}
		public BinaryExpressionContext binaryExpression(int i) {
			return getRuleContext(BinaryExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(AngularParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(AngularParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(AngularParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(AngularParser.OR, i);
		}
		public List<TerminalNode> BITWISE_AND() { return getTokens(AngularParser.BITWISE_AND); }
		public TerminalNode BITWISE_AND(int i) {
			return getToken(AngularParser.BITWISE_AND, i);
		}
		public List<TerminalNode> BITWISE_OR() { return getTokens(AngularParser.BITWISE_OR); }
		public TerminalNode BITWISE_OR(int i) {
			return getToken(AngularParser.BITWISE_OR, i);
		}
		public List<TerminalNode> BITWISE_XOR() { return getTokens(AngularParser.BITWISE_XOR); }
		public TerminalNode BITWISE_XOR(int i) {
			return getToken(AngularParser.BITWISE_XOR, i);
		}
		public List<TerminalNode> BITWISE_NOT() { return getTokens(AngularParser.BITWISE_NOT); }
		public TerminalNode BITWISE_NOT(int i) {
			return getToken(AngularParser.BITWISE_NOT, i);
		}
		public LogicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLogicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLogicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_logicalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			binaryExpression();
			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 123L) != 0)) {
				{
				{
				setState(555);
				_la = _input.LA(1);
				if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 123L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(556);
				binaryExpression();
				}
				}
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BinaryExpressionContext extends ParserRuleContext {
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(AngularParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(AngularParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(AngularParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(AngularParser.MINUS, i);
		}
		public List<TerminalNode> MULTIPLY() { return getTokens(AngularParser.MULTIPLY); }
		public TerminalNode MULTIPLY(int i) {
			return getToken(AngularParser.MULTIPLY, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(AngularParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(AngularParser.DIVIDE, i);
		}
		public List<TerminalNode> MODULO() { return getTokens(AngularParser.MODULO); }
		public TerminalNode MODULO(int i) {
			return getToken(AngularParser.MODULO, i);
		}
		public List<TerminalNode> POWER() { return getTokens(AngularParser.POWER); }
		public TerminalNode POWER(int i) {
			return getToken(AngularParser.POWER, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(AngularParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(AngularParser.ASSIGN, i);
		}
		public List<TerminalNode> NOT_EQUAL() { return getTokens(AngularParser.NOT_EQUAL); }
		public TerminalNode NOT_EQUAL(int i) {
			return getToken(AngularParser.NOT_EQUAL, i);
		}
		public List<TerminalNode> LESS() { return getTokens(AngularParser.LESS); }
		public TerminalNode LESS(int i) {
			return getToken(AngularParser.LESS, i);
		}
		public List<TerminalNode> GREATER() { return getTokens(AngularParser.GREATER); }
		public TerminalNode GREATER(int i) {
			return getToken(AngularParser.GREATER, i);
		}
		public List<TerminalNode> LESS_EQUAL() { return getTokens(AngularParser.LESS_EQUAL); }
		public TerminalNode LESS_EQUAL(int i) {
			return getToken(AngularParser.LESS_EQUAL, i);
		}
		public List<TerminalNode> GREATER_EQUAL() { return getTokens(AngularParser.GREATER_EQUAL); }
		public TerminalNode GREATER_EQUAL(int i) {
			return getToken(AngularParser.GREATER_EQUAL, i);
		}
		public List<TerminalNode> STRICT_NOT_EQUAL() { return getTokens(AngularParser.STRICT_NOT_EQUAL); }
		public TerminalNode STRICT_NOT_EQUAL(int i) {
			return getToken(AngularParser.STRICT_NOT_EQUAL, i);
		}
		public List<TerminalNode> STRICT_EQUAL() { return getTokens(AngularParser.STRICT_EQUAL); }
		public TerminalNode STRICT_EQUAL(int i) {
			return getToken(AngularParser.STRICT_EQUAL, i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(AngularParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(AngularParser.EQUAL, i);
		}
		public List<TerminalNode> INCRES() { return getTokens(AngularParser.INCRES); }
		public TerminalNode INCRES(int i) {
			return getToken(AngularParser.INCRES, i);
		}
		public List<TerminalNode> DECRES() { return getTokens(AngularParser.DECRES); }
		public TerminalNode DECRES(int i) {
			return getToken(AngularParser.DECRES, i);
		}
		public BinaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBinaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBinaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBinaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryExpressionContext binaryExpression() throws RecognitionException {
		BinaryExpressionContext _localctx = new BinaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_binaryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			primaryExpression(0);
			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 1610645503L) != 0)) {
				{
				{
				setState(563);
				_la = _input.LA(1);
				if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 1610645503L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(564);
				primaryExpression(0);
				}
				}
				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayDeclarationContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(AngularParser.LBRACKET, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(AngularParser.RBRACKET, 0); }
		public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_arrayDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			match(LBRACKET);
			setState(571);
			argumentList();
			setState(572);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectDeclarationContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public ObjectBodyContext objectBody() {
			return getRuleContext(ObjectBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public ObjectDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectDeclarationContext objectDeclaration() throws RecognitionException {
		ObjectDeclarationContext _localctx = new ObjectDeclarationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_objectDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			match(LBRACE);
			setState(575);
			objectBody();
			setState(576);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public TerminalNode NUMBER() { return getToken(AngularParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(AngularParser.BOOLEAN, 0); }
		public TerminalNode NULL() { return getToken(AngularParser.NULL, 0); }
		public TerminalNode UNDEFINED() { return getToken(AngularParser.UNDEFINED, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public ObjectDeclarationContext objectDeclaration() {
			return getRuleContext(ObjectDeclarationContext.class,0);
		}
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public TerminalNode NEW() { return getToken(AngularParser.NEW, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_primaryExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(579);
				match(ID);
				}
				break;
			case 2:
				{
				setState(580);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(581);
				match(THIS);
				}
				break;
			case 4:
				{
				setState(582);
				match(NUMBER);
				}
				break;
			case 5:
				{
				setState(583);
				match(BOOLEAN);
				}
				break;
			case 6:
				{
				setState(584);
				match(NULL);
				}
				break;
			case 7:
				{
				setState(585);
				match(UNDEFINED);
				}
				break;
			case 8:
				{
				setState(586);
				match(THIS);
				}
				break;
			case 9:
				{
				setState(587);
				match(LPAREN);
				setState(588);
				expression();
				setState(589);
				match(RPAREN);
				}
				break;
			case 10:
				{
				setState(591);
				objectDeclaration();
				}
				break;
			case 11:
				{
				setState(592);
				arrayDeclaration();
				}
				break;
			case 12:
				{
				setState(593);
				match(NEW);
				setState(594);
				match(ID);
				setState(595);
				match(LPAREN);
				setState(597);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(596);
					argumentList();
					}
					break;
				}
				setState(599);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(613);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(611);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
					case 1:
						{
						_localctx = new PrimaryExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(602);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(603);
						match(DOT);
						setState(604);
						primaryExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new PrimaryExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(605);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(606);
						match(LPAREN);
						setState(608);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
						case 1:
							{
							setState(607);
							argumentList();
							}
							break;
						}
						setState(610);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(615);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_argumentList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1021191215507832832L) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 21L) != 0)) {
				{
				setState(616);
				expression();
				setState(621);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(617);
						match(COMMA);
						setState(618);
						expression();
						}
						} 
					}
					setState(623);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				}
				setState(625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(624);
					match(COMMA);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentExpressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_assignmentExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			match(ID);
			setState(630);
			match(ASSIGN);
			setState(631);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockStatementContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			match(LBRACE);
			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1021402720232901626L) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 21L) != 0)) {
				{
				{
				setState(634);
				statement();
				}
				}
				setState(639);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(640);
				match(SEMICOLON);
				}
			}

			setState(643);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(AngularParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(AngularParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			match(IF);
			setState(646);
			match(LPAREN);
			setState(647);
			expression();
			setState(648);
			match(RPAREN);
			setState(649);
			statement();
			setState(652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(650);
				match(ELSE);
				setState(651);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(AngularParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public ForOfContext forOf() {
			return getRuleContext(ForOfContext.class,0);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(AngularParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(AngularParser.SEMICOLON, i);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IncrementExpressionContext incrementExpression() {
			return getRuleContext(IncrementExpressionContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			match(FOR);
			setState(655);
			match(LPAREN);
			setState(672);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(656);
				forOf();
				}
				break;
			case 2:
				{
				{
				setState(660);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(657);
					variableDeclaration();
					}
					break;
				case 2:
					{
					setState(658);
					assignmentExpression();
					}
					break;
				case 3:
					{
					setState(659);
					expression();
					}
					break;
				}
				setState(662);
				match(SEMICOLON);
				setState(664);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1021191215507832832L) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 21L) != 0)) {
					{
					setState(663);
					expression();
					}
				}

				setState(666);
				match(SEMICOLON);
				setState(670);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(667);
					incrementExpression();
					}
					break;
				case 2:
					{
					setState(668);
					assignmentExpression();
					}
					break;
				case 3:
					{
					setState(669);
					expression();
					}
					break;
				}
				}
				}
				break;
			}
			setState(674);
			match(RPAREN);
			setState(677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(675);
				blockStatement();
				}
				break;
			case 2:
				{
				setState(676);
				expressionStatement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForOfContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode OF() { return getToken(AngularParser.OF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterForOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitForOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitForOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForOfContext forOf() throws RecognitionException {
		ForOfContext _localctx = new ForOfContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_forOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			variableDeclaration();
			setState(680);
			match(OF);
			setState(681);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IncrementExpressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode INCRES() { return getToken(AngularParser.INCRES, 0); }
		public TerminalNode DECRES() { return getToken(AngularParser.DECRES, 0); }
		public IncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementExpressionContext incrementExpression() throws RecognitionException {
		IncrementExpressionContext _localctx = new IncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_incrementExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			match(ID);
			setState(684);
			_la = _input.LA(1);
			if ( !(_la==INCRES || _la==DECRES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(AngularParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(WHILE);
			setState(687);
			match(LPAREN);
			setState(688);
			expression();
			setState(689);
			match(RPAREN);
			setState(690);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileStatementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(AngularParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(AngularParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			match(DO);
			setState(693);
			statement();
			setState(694);
			match(WHILE);
			setState(695);
			match(LPAREN);
			setState(696);
			expression();
			setState(697);
			match(RPAREN);
			setState(699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(698);
				match(SEMICOLON);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(AngularParser.SWITCH, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public List<CaseStatementContext> caseStatement() {
			return getRuleContexts(CaseStatementContext.class);
		}
		public CaseStatementContext caseStatement(int i) {
			return getRuleContext(CaseStatementContext.class,i);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			match(SWITCH);
			setState(702);
			match(LPAREN);
			setState(703);
			expression();
			setState(704);
			match(RPAREN);
			setState(705);
			match(LBRACE);
			setState(709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(706);
				caseStatement();
				}
				}
				setState(711);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(712);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaseStatementContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(AngularParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode DEFAULT() { return getToken(AngularParser.DEFAULT, 0); }
		public CaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCaseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCaseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCaseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseStatementContext caseStatement() throws RecognitionException {
		CaseStatementContext _localctx = new CaseStatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_caseStatement);
		int _la;
		try {
			setState(731);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(714);
				match(CASE);
				setState(715);
				expression();
				setState(716);
				match(COLON);
				setState(720);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1021402720232901626L) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 21L) != 0)) {
					{
					{
					setState(717);
					statement();
					}
					}
					setState(722);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(723);
				match(DEFAULT);
				setState(724);
				match(COLON);
				setState(728);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1021402720232901626L) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 21L) != 0)) {
					{
					{
					setState(725);
					statement();
					}
					}
					setState(730);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TryCatchStatementContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(AngularParser.TRY, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public TerminalNode CATCH() { return getToken(AngularParser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode FINALLY() { return getToken(AngularParser.FINALLY, 0); }
		public TryCatchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryCatchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTryCatchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTryCatchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTryCatchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryCatchStatementContext tryCatchStatement() throws RecognitionException {
		TryCatchStatementContext _localctx = new TryCatchStatementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_tryCatchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			match(TRY);
			setState(734);
			blockStatement();
			setState(735);
			match(CATCH);
			setState(736);
			match(LPAREN);
			setState(737);
			match(ID);
			setState(738);
			match(RPAREN);
			setState(739);
			blockStatement();
			setState(742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(740);
				match(FINALLY);
				setState(741);
				blockStatement();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(AngularParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			match(RETURN);
			setState(746);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(745);
				expression();
				}
				break;
			}
			setState(749);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(748);
				match(SEMICOLON);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(AngularParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			match(BREAK);
			setState(753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(752);
				match(SEMICOLON);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(AngularParser.CONTINUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			match(CONTINUE);
			setState(756);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode THROW() { return getToken(AngularParser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			match(THROW);
			setState(759);
			expression();
			setState(760);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReadErrorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public ReadErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readError; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReadError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReadError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReadError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadErrorContext readError() throws RecognitionException {
		ReadErrorContext _localctx = new ReadErrorContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_readError);
		try {
			setState(769);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(762);
				match(ID);
				setState(763);
				match(ASSIGN);
				setState(764);
				expression();
				setState(765);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(767);
				match(ID);
				setState(768);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorApplicationContext extends ParserRuleContext {
		public TerminalNode DECORATOR() { return getToken(AngularParser.DECORATOR, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public DecoratorApplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decoratorApplication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDecoratorApplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDecoratorApplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDecoratorApplication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorApplicationContext decoratorApplication() throws RecognitionException {
		DecoratorApplicationContext _localctx = new DecoratorApplicationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_decoratorApplication);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			match(DECORATOR);
			setState(772);
			match(ID);
			setState(778);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(773);
				match(LPAREN);
				setState(775);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1021191215507832832L) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 21L) != 0)) {
					{
					setState(774);
					parameterList();
					}
				}

				setState(777);
				match(RPAREN);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TwoWayBindingAttributeContext extends ParserRuleContext {
		public TerminalNode ANG_NGMODEL_TWOWAY() { return getToken(AngularParser.ANG_NGMODEL_TWOWAY, 0); }
		public TerminalNode TAG_EQUALS() { return getToken(AngularParser.TAG_EQUALS, 0); }
		public TerminalNode ATTVALUE_VALUE() { return getToken(AngularParser.ATTVALUE_VALUE, 0); }
		public TwoWayBindingAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_twoWayBindingAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTwoWayBindingAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTwoWayBindingAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTwoWayBindingAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TwoWayBindingAttributeContext twoWayBindingAttribute() throws RecognitionException {
		TwoWayBindingAttributeContext _localctx = new TwoWayBindingAttributeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_twoWayBindingAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			match(ANG_NGMODEL_TWOWAY);
			setState(783);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAG_EQUALS) {
				{
				setState(781);
				match(TAG_EQUALS);
				setState(782);
				match(ATTVALUE_VALUE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 43:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00a1\u0312\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0001\u0000\u0005\u0000\u0080"+
		"\b\u0000\n\u0000\f\u0000\u0083\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u009a\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u00a2\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u00a8\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00b0\b\u0004"+
		"\n\u0004\f\u0004\u00b3\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u00b9\b\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00c1\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00c7\b\u0007\n\u0007\f\u0007"+
		"\u00ca\t\u0007\u0003\u0007\u00cc\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0003\b\u00d4\b\b\u0005\b\u00d6\b\b"+
		"\n\b\f\b\u00d9\t\b\u0001\t\u0003\t\u00dc\b\t\u0001\t\u0003\t\u00df\b\t"+
		"\u0001\t\u0003\t\u00e2\b\t\u0001\t\u0003\t\u00e5\b\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00f0\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u00f5\b\n\n\n\f\n\u00f8\t\n\u0001\n\u0003\n"+
		"\u00fb\b\n\u0003\n\u00fd\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u0103\b\u000b\u0001\f\u0001\f\u0005\f\u0107\b\f\n\f"+
		"\f\f\u010a\t\f\u0001\f\u0005\f\u010d\b\f\n\f\f\f\u0110\t\f\u0001\f\u0005"+
		"\f\u0113\b\f\n\f\f\f\u0116\t\f\u0001\f\u0001\f\u0001\r\u0005\r\u011b\b"+
		"\r\n\r\f\r\u011e\t\r\u0001\r\u0001\r\u0005\r\u0122\b\r\n\r\f\r\u0125\t"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u012b\b"+
		"\u000e\n\u000e\f\u000e\u012e\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u0138\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u013e\b\u000e\n\u000e\f\u000e\u0141\t\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u014b\b\u000e\u0003\u000e\u014d\b\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0154\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u015b\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u0162\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u0169\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u016e\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0173\b"+
		"\u0015\u0001\u0016\u0003\u0016\u0176\b\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u017b\b\u0016\u0001\u0016\u0003\u0016\u017e\b\u0016"+
		"\u0005\u0016\u0180\b\u0016\n\u0016\f\u0016\u0183\t\u0016\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u0187\b\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u018e\b\u0019\u0001\u001a\u0003\u001a\u0191"+
		"\b\u001a\u0001\u001a\u0003\u001a\u0194\b\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u0198\b\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u019c\b"+
		"\u001a\u0001\u001a\u0003\u001a\u019f\b\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0003\u001b\u01a4\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01ac\b\u001c\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u01b0\b\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u01ba"+
		"\b\u001d\n\u001d\f\u001d\u01bd\t\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u01c4\b\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0005\u001f\u01ca\b\u001f\n\u001f\f\u001f\u01cd"+
		"\t\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0005 \u01d5"+
		"\b \n \f \u01d8\t \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001\"\u0001\"\u0003\"\u01e4\b\"\u0001\"\u0003\"\u01e7\b\"\u0001\""+
		"\u0003\"\u01ea\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u01f0\b\"\u0001"+
		"\"\u0001\"\u0005\"\u01f4\b\"\n\"\f\"\u01f7\t\"\u0001\"\u0001\"\u0003\""+
		"\u01fb\b\"\u0001\"\u0003\"\u01fe\b\"\u0001\"\u0001\"\u0003\"\u0202\b\""+
		"\u0001\"\u0003\"\u0205\b\"\u0001#\u0001#\u0001#\u0003#\u020a\b#\u0001"+
		"#\u0001#\u0001#\u0003#\u020f\b#\u0001#\u0001#\u0001#\u0003#\u0214\b#\u0001"+
		"#\u0001#\u0001#\u0003#\u0219\b#\u0003#\u021b\b#\u0001$\u0001$\u0003$\u021f"+
		"\b$\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u0229"+
		"\b&\u0001\'\u0001\'\u0001\'\u0005\'\u022e\b\'\n\'\f\'\u0231\t\'\u0001"+
		"(\u0001(\u0001(\u0005(\u0236\b(\n(\f(\u0239\t(\u0001)\u0001)\u0001)\u0001"+
		")\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0003+\u0256\b+\u0001+\u0003+\u0259\b+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0003+\u0261\b+\u0001+\u0005+\u0264\b+\n"+
		"+\f+\u0267\t+\u0001,\u0001,\u0001,\u0005,\u026c\b,\n,\f,\u026f\t,\u0001"+
		",\u0003,\u0272\b,\u0003,\u0274\b,\u0001-\u0001-\u0001-\u0001-\u0001.\u0001"+
		".\u0005.\u027c\b.\n.\f.\u027f\t.\u0001.\u0003.\u0282\b.\u0001.\u0001."+
		"\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0003/\u028d\b/\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00030\u0295\b0\u00010\u00010\u0003"+
		"0\u0299\b0\u00010\u00010\u00010\u00010\u00030\u029f\b0\u00030\u02a1\b"+
		"0\u00010\u00010\u00010\u00030\u02a6\b0\u00011\u00011\u00011\u00011\u0001"+
		"2\u00012\u00012\u00013\u00013\u00013\u00013\u00013\u00013\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00034\u02bc\b4\u00015\u00015\u0001"+
		"5\u00015\u00015\u00015\u00055\u02c4\b5\n5\f5\u02c7\t5\u00015\u00015\u0001"+
		"6\u00016\u00016\u00016\u00056\u02cf\b6\n6\f6\u02d2\t6\u00016\u00016\u0001"+
		"6\u00056\u02d7\b6\n6\f6\u02da\t6\u00036\u02dc\b6\u00017\u00017\u00017"+
		"\u00017\u00017\u00017\u00017\u00017\u00017\u00037\u02e7\b7\u00018\u0001"+
		"8\u00038\u02eb\b8\u00018\u00038\u02ee\b8\u00019\u00019\u00039\u02f2\b"+
		"9\u0001:\u0001:\u0001:\u0001;\u0001;\u0001;\u0001;\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0003<\u0302\b<\u0001=\u0001=\u0001=\u0001"+
		"=\u0003=\u0308\b=\u0001=\u0003=\u030b\b=\u0001>\u0001>\u0001>\u0003>\u0310"+
		"\b>\u0001>\u0000\u0001V?\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|\u0000\u0007\u0001\u0000\u0007\b\u0002\u000022io\u0001"+
		"\u0000\u0090\u009d\u0001\u0000xy\u0002\u0000KLNQ\u0002\u0000<JYZ\u0001"+
		"\u0000YZ\u0366\u0000\u0081\u0001\u0000\u0000\u0000\u0002\u0099\u0001\u0000"+
		"\u0000\u0000\u0004\u00a1\u0001\u0000\u0000\u0000\u0006\u00a3\u0001\u0000"+
		"\u0000\u0000\b\u00ac\u0001\u0000\u0000\u0000\n\u00b8\u0001\u0000\u0000"+
		"\u0000\f\u00ba\u0001\u0000\u0000\u0000\u000e\u00bc\u0001\u0000\u0000\u0000"+
		"\u0010\u00d7\u0001\u0000\u0000\u0000\u0012\u00ef\u0001\u0000\u0000\u0000"+
		"\u0014\u00fc\u0001\u0000\u0000\u0000\u0016\u0102\u0001\u0000\u0000\u0000"+
		"\u0018\u0104\u0001\u0000\u0000\u0000\u001a\u011c\u0001\u0000\u0000\u0000"+
		"\u001c\u014c\u0001\u0000\u0000\u0000\u001e\u014e\u0001\u0000\u0000\u0000"+
		" \u0150\u0001\u0000\u0000\u0000\"\u015a\u0001\u0000\u0000\u0000$\u015c"+
		"\u0001\u0000\u0000\u0000&\u0163\u0001\u0000\u0000\u0000(\u016a\u0001\u0000"+
		"\u0000\u0000*\u016f\u0001\u0000\u0000\u0000,\u0175\u0001\u0000\u0000\u0000"+
		".\u0186\u0001\u0000\u0000\u00000\u0188\u0001\u0000\u0000\u00002\u018d"+
		"\u0001\u0000\u0000\u00004\u0190\u0001\u0000\u0000\u00006\u01a0\u0001\u0000"+
		"\u0000\u00008\u01a8\u0001\u0000\u0000\u0000:\u01b3\u0001\u0000\u0000\u0000"+
		"<\u01c0\u0001\u0000\u0000\u0000>\u01c5\u0001\u0000\u0000\u0000@\u01d0"+
		"\u0001\u0000\u0000\u0000B\u01db\u0001\u0000\u0000\u0000D\u01e1\u0001\u0000"+
		"\u0000\u0000F\u021a\u0001\u0000\u0000\u0000H\u021e\u0001\u0000\u0000\u0000"+
		"J\u0220\u0001\u0000\u0000\u0000L\u0222\u0001\u0000\u0000\u0000N\u022a"+
		"\u0001\u0000\u0000\u0000P\u0232\u0001\u0000\u0000\u0000R\u023a\u0001\u0000"+
		"\u0000\u0000T\u023e\u0001\u0000\u0000\u0000V\u0258\u0001\u0000\u0000\u0000"+
		"X\u0273\u0001\u0000\u0000\u0000Z\u0275\u0001\u0000\u0000\u0000\\\u0279"+
		"\u0001\u0000\u0000\u0000^\u0285\u0001\u0000\u0000\u0000`\u028e\u0001\u0000"+
		"\u0000\u0000b\u02a7\u0001\u0000\u0000\u0000d\u02ab\u0001\u0000\u0000\u0000"+
		"f\u02ae\u0001\u0000\u0000\u0000h\u02b4\u0001\u0000\u0000\u0000j\u02bd"+
		"\u0001\u0000\u0000\u0000l\u02db\u0001\u0000\u0000\u0000n\u02dd\u0001\u0000"+
		"\u0000\u0000p\u02e8\u0001\u0000\u0000\u0000r\u02ef\u0001\u0000\u0000\u0000"+
		"t\u02f3\u0001\u0000\u0000\u0000v\u02f6\u0001\u0000\u0000\u0000x\u0301"+
		"\u0001\u0000\u0000\u0000z\u0303\u0001\u0000\u0000\u0000|\u030c\u0001\u0000"+
		"\u0000\u0000~\u0080\u0003\u0002\u0001\u0000\u007f~\u0001\u0000\u0000\u0000"+
		"\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0001\u0001\u0000\u0000\u0000"+
		"\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u009a\u0003\u0004\u0002\u0000"+
		"\u0085\u009a\u0003\u0006\u0003\u0000\u0086\u009a\u0003\u000e\u0007\u0000"+
		"\u0087\u009a\u0003:\u001d\u0000\u0088\u009a\u0003>\u001f\u0000\u0089\u009a"+
		"\u0003@ \u0000\u008a\u009a\u0003D\"\u0000\u008b\u009a\u0003F#\u0000\u008c"+
		"\u009a\u0003H$\u0000\u008d\u009a\u0003\\.\u0000\u008e\u009a\u0003^/\u0000"+
		"\u008f\u009a\u0003`0\u0000\u0090\u009a\u0003f3\u0000\u0091\u009a\u0003"+
		"h4\u0000\u0092\u009a\u0003j5\u0000\u0093\u009a\u0003n7\u0000\u0094\u009a"+
		"\u0003p8\u0000\u0095\u009a\u0003r9\u0000\u0096\u009a\u0003t:\u0000\u0097"+
		"\u009a\u0003v;\u0000\u0098\u009a\u0003z=\u0000\u0099\u0084\u0001\u0000"+
		"\u0000\u0000\u0099\u0085\u0001\u0000\u0000\u0000\u0099\u0086\u0001\u0000"+
		"\u0000\u0000\u0099\u0087\u0001\u0000\u0000\u0000\u0099\u0088\u0001\u0000"+
		"\u0000\u0000\u0099\u0089\u0001\u0000\u0000\u0000\u0099\u008a\u0001\u0000"+
		"\u0000\u0000\u0099\u008b\u0001\u0000\u0000\u0000\u0099\u008c\u0001\u0000"+
		"\u0000\u0000\u0099\u008d\u0001\u0000\u0000\u0000\u0099\u008e\u0001\u0000"+
		"\u0000\u0000\u0099\u008f\u0001\u0000\u0000\u0000\u0099\u0090\u0001\u0000"+
		"\u0000\u0000\u0099\u0091\u0001\u0000\u0000\u0000\u0099\u0092\u0001\u0000"+
		"\u0000\u0000\u0099\u0093\u0001\u0000\u0000\u0000\u0099\u0094\u0001\u0000"+
		"\u0000\u0000\u0099\u0095\u0001\u0000\u0000\u0000\u0099\u0096\u0001\u0000"+
		"\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u0098\u0001\u0000"+
		"\u0000\u0000\u009a\u0003\u0001\u0000\u0000\u0000\u009b\u009c\u0007\u0000"+
		"\u0000\u0000\u009c\u009d\u00052\u0000\u0000\u009d\u009e\u0005<\u0000\u0000"+
		"\u009e\u00a2\u0003J%\u0000\u009f\u00a0\u0007\u0000\u0000\u0000\u00a0\u00a2"+
		"\u00052\u0000\u0000\u00a1\u009b\u0001\u0000\u0000\u0000\u00a1\u009f\u0001"+
		"\u0000\u0000\u0000\u00a2\u0005\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005"+
		"\u0005\u0000\u0000\u00a4\u00a5\u00052\u0000\u0000\u00a5\u00a7\u0005_\u0000"+
		"\u0000\u00a6\u00a8\u0003\b\u0004\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000"+
		"\u00a9\u00aa\u0005`\u0000\u0000\u00aa\u00ab\u0003\\.\u0000\u00ab\u0007"+
		"\u0001\u0000\u0000\u0000\u00ac\u00b1\u0003\n\u0005\u0000\u00ad\u00ae\u0005"+
		"\\\u0000\u0000\u00ae\u00b0\u0003\n\u0005\u0000\u00af\u00ad\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\t\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b9\u0003H$\u0000\u00b5"+
		"\u00b6\u00052\u0000\u0000\u00b6\u00b7\u0005e\u0000\u0000\u00b7\u00b9\u0003"+
		"\f\u0006\u0000\u00b8\u00b4\u0001\u0000\u0000\u0000\u00b8\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b9\u000b\u0001\u0000\u0000\u0000\u00ba\u00bb\u0007\u0001"+
		"\u0000\u0000\u00bb\r\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005\t\u0000"+
		"\u0000\u00bd\u00c0\u00052\u0000\u0000\u00be\u00bf\u0005\f\u0000\u0000"+
		"\u00bf\u00c1\u00052\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c1\u00cb\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c3\u0005\r\u0000\u0000\u00c3\u00c8\u00052\u0000\u0000\u00c4\u00c5"+
		"\u0005\\\u0000\u0000\u00c5\u00c7\u00052\u0000\u0000\u00c6\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001"+
		"\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb\u00c2\u0001"+
		"\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u0005a\u0000\u0000\u00ce\u00cf\u0003\u0010"+
		"\b\u0000\u00cf\u00d0\u0005b\u0000\u0000\u00d0\u000f\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d3\u0003\u0012\t\u0000\u00d2\u00d4\u0005[\u0000\u0000"+
		"\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d6\u0001\u0000\u0000\u0000\u00d5\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d9\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u0011\u0001\u0000\u0000\u0000"+
		"\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u00dc\u0005\u0015\u0000\u0000"+
		"\u00db\u00da\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000"+
		"\u00dc\u00de\u0001\u0000\u0000\u0000\u00dd\u00df\u0005\u0016\u0000\u0000"+
		"\u00de\u00dd\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000"+
		"\u00df\u00e1\u0001\u0000\u0000\u0000\u00e0\u00e2\u0005\u0017\u0000\u0000"+
		"\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e4\u0001\u0000\u0000\u0000\u00e3\u00e5\u0005\u0018\u0000\u0000"+
		"\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e7\u00052\u0000\u0000\u00e7"+
		"\u00e8\u0005e\u0000\u0000\u00e8\u00f0\u0003\f\u0006\u0000\u00e9\u00f0"+
		"\u00036\u001b\u0000\u00ea\u00f0\u0003\u0004\u0002\u0000\u00eb\u00f0\u0003"+
		"H$\u0000\u00ec\u00f0\u00038\u001c\u0000\u00ed\u00f0\u0003:\u001d\u0000"+
		"\u00ee\u00f0\u0003\u0006\u0003\u0000\u00ef\u00db\u0001\u0000\u0000\u0000"+
		"\u00ef\u00e9\u0001\u0000\u0000\u0000\u00ef\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ef\u00eb\u0001\u0000\u0000\u0000\u00ef\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f0\u0013\u0001\u0000\u0000\u0000\u00f1\u00f6\u0003\u0016\u000b\u0000"+
		"\u00f2\u00f3\u0005\\\u0000\u0000\u00f3\u00f5\u0003\u0016\u000b\u0000\u00f4"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f8\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7"+
		"\u00fa\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fb\u0005\\\u0000\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fa\u00fb"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fd\u0001\u0000\u0000\u0000\u00fc\u00f1"+
		"\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u0015"+
		"\u0001\u0000\u0000\u0000\u00fe\u0103\u0003\u0018\f\u0000\u00ff\u0100\u0005"+
		"2\u0000\u0000\u0100\u0101\u0005e\u0000\u0000\u0101\u0103\u0003J%\u0000"+
		"\u0102\u00fe\u0001\u0000\u0000\u0000\u0102\u00ff\u0001\u0000\u0000\u0000"+
		"\u0103\u0017\u0001\u0000\u0000\u0000\u0104\u0108\u00051\u0000\u0000\u0105"+
		"\u0107\u0005~\u0000\u0000\u0106\u0105\u0001\u0000\u0000\u0000\u0107\u010a"+
		"\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0108\u0109"+
		"\u0001\u0000\u0000\u0000\u0109\u010e\u0001\u0000\u0000\u0000\u010a\u0108"+
		"\u0001\u0000\u0000\u0000\u010b\u010d\u0003\u001a\r\u0000\u010c\u010b\u0001"+
		"\u0000\u0000\u0000\u010d\u0110\u0001\u0000\u0000\u0000\u010e\u010c\u0001"+
		"\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u0114\u0001"+
		"\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0111\u0113\u0005"+
		"~\u0000\u0000\u0112\u0111\u0001\u0000\u0000\u0000\u0113\u0116\u0001\u0000"+
		"\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000"+
		"\u0000\u0000\u0115\u0117\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000"+
		"\u0000\u0000\u0117\u0118\u0005w\u0000\u0000\u0118\u0019\u0001\u0000\u0000"+
		"\u0000\u0119\u011b\u0003.\u0017\u0000\u011a\u0119\u0001\u0000\u0000\u0000"+
		"\u011b\u011e\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000"+
		"\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011f\u0001\u0000\u0000\u0000"+
		"\u011e\u011c\u0001\u0000\u0000\u0000\u011f\u0123\u0003\u001c\u000e\u0000"+
		"\u0120\u0122\u0003.\u0017\u0000\u0121\u0120\u0001\u0000\u0000\u0000\u0122"+
		"\u0125\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0123"+
		"\u0124\u0001\u0000\u0000\u0000\u0124\u001b\u0001\u0000\u0000\u0000\u0125"+
		"\u0123\u0001\u0000\u0000\u0000\u0126\u0127\u0005\u0081\u0000\u0000\u0127"+
		"\u012c\u0003\u001e\u000f\u0000\u0128\u012b\u0003 \u0010\u0000\u0129\u012b"+
		"\u0003\"\u0011\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012a\u0129\u0001"+
		"\u0000\u0000\u0000\u012b\u012e\u0001\u0000\u0000\u0000\u012c\u012a\u0001"+
		"\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u0137\u0001"+
		"\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012f\u0130\u0005"+
		"\u0084\u0000\u0000\u0130\u0131\u0003,\u0016\u0000\u0131\u0132\u0005\u0081"+
		"\u0000\u0000\u0132\u0133\u0005\u0086\u0000\u0000\u0133\u0134\u0003\u001e"+
		"\u000f\u0000\u0134\u0135\u0005\u0084\u0000\u0000\u0135\u0138\u0001\u0000"+
		"\u0000\u0000\u0136\u0138\u0005\u0085\u0000\u0000\u0137\u012f\u0001\u0000"+
		"\u0000\u0000\u0137\u0136\u0001\u0000\u0000\u0000\u0138\u014d\u0001\u0000"+
		"\u0000\u0000\u0139\u013a\u0005\u0081\u0000\u0000\u013a\u013f\u0005\u009e"+
		"\u0000\u0000\u013b\u013e\u0003 \u0010\u0000\u013c\u013e\u0003\"\u0011"+
		"\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013d\u013c\u0001\u0000\u0000"+
		"\u0000\u013e\u0141\u0001\u0000\u0000\u0000\u013f\u013d\u0001\u0000\u0000"+
		"\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u014a\u0001\u0000\u0000"+
		"\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0142\u0143\u0005\u0084\u0000"+
		"\u0000\u0143\u0144\u0003,\u0016\u0000\u0144\u0145\u0005\u0081\u0000\u0000"+
		"\u0145\u0146\u0005\u0086\u0000\u0000\u0146\u0147\u0005\u009e\u0000\u0000"+
		"\u0147\u0148\u0005\u0084\u0000\u0000\u0148\u014b\u0001\u0000\u0000\u0000"+
		"\u0149\u014b\u0005\u0085\u0000\u0000\u014a\u0142\u0001\u0000\u0000\u0000"+
		"\u014a\u0149\u0001\u0000\u0000\u0000\u014b\u014d\u0001\u0000\u0000\u0000"+
		"\u014c\u0126\u0001\u0000\u0000\u0000\u014c\u0139\u0001\u0000\u0000\u0000"+
		"\u014d\u001d\u0001\u0000\u0000\u0000\u014e\u014f\u0007\u0002\u0000\u0000"+
		"\u014f\u001f\u0001\u0000\u0000\u0000\u0150\u0153\u0005\u009e\u0000\u0000"+
		"\u0151\u0152\u0005\u008f\u0000\u0000\u0152\u0154\u0005\u009f\u0000\u0000"+
		"\u0153\u0151\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000"+
		"\u0154!\u0001\u0000\u0000\u0000\u0155\u015b\u0003$\u0012\u0000\u0156\u015b"+
		"\u0003&\u0013\u0000\u0157\u015b\u0003(\u0014\u0000\u0158\u015b\u0003*"+
		"\u0015\u0000\u0159\u015b\u0003|>\u0000\u015a\u0155\u0001\u0000\u0000\u0000"+
		"\u015a\u0156\u0001\u0000\u0000\u0000\u015a\u0157\u0001\u0000\u0000\u0000"+
		"\u015a\u0158\u0001\u0000\u0000\u0000\u015a\u0159\u0001\u0000\u0000\u0000"+
		"\u015b#\u0001\u0000\u0000\u0000\u015c\u015d\u0005\u0088\u0000\u0000\u015d"+
		"\u015e\u0005\u009e\u0000\u0000\u015e\u0161\u0005\u0089\u0000\u0000\u015f"+
		"\u0160\u0005\u008f\u0000\u0000\u0160\u0162\u0005\u009f\u0000\u0000\u0161"+
		"\u015f\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162"+
		"%\u0001\u0000\u0000\u0000\u0163\u0164\u0005\u008a\u0000\u0000\u0164\u0165"+
		"\u0005\u009e\u0000\u0000\u0165\u0168\u0005\u008b\u0000\u0000\u0166\u0167"+
		"\u0005\u008f\u0000\u0000\u0167\u0169\u0005\u009f\u0000\u0000\u0168\u0166"+
		"\u0001\u0000\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169\'\u0001"+
		"\u0000\u0000\u0000\u016a\u016d\u0005\u008c\u0000\u0000\u016b\u016c\u0005"+
		"\u008f\u0000\u0000\u016c\u016e\u0005\u009f\u0000\u0000\u016d\u016b\u0001"+
		"\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000\u016e)\u0001\u0000"+
		"\u0000\u0000\u016f\u0172\u0005\u008d\u0000\u0000\u0170\u0171\u0005\u008f"+
		"\u0000\u0000\u0171\u0173\u0005\u009f\u0000\u0000\u0172\u0170\u0001\u0000"+
		"\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173+\u0001\u0000\u0000"+
		"\u0000\u0174\u0176\u00032\u0019\u0000\u0175\u0174\u0001\u0000\u0000\u0000"+
		"\u0175\u0176\u0001\u0000\u0000\u0000\u0176\u0181\u0001\u0000\u0000\u0000"+
		"\u0177\u017b\u0003\u001c\u000e\u0000\u0178\u017b\u0005{\u0000\u0000\u0179"+
		"\u017b\u00030\u0018\u0000\u017a\u0177\u0001\u0000\u0000\u0000\u017a\u0178"+
		"\u0001\u0000\u0000\u0000\u017a\u0179\u0001\u0000\u0000\u0000\u017b\u017d"+
		"\u0001\u0000\u0000\u0000\u017c\u017e\u00032\u0019\u0000\u017d\u017c\u0001"+
		"\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e\u0180\u0001"+
		"\u0000\u0000\u0000\u017f\u017a\u0001\u0000\u0000\u0000\u0180\u0183\u0001"+
		"\u0000\u0000\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0181\u0182\u0001"+
		"\u0000\u0000\u0000\u0182-\u0001\u0000\u0000\u0000\u0183\u0181\u0001\u0000"+
		"\u0000\u0000\u0184\u0187\u00030\u0018\u0000\u0185\u0187\u0005~\u0000\u0000"+
		"\u0186\u0184\u0001\u0000\u0000\u0000\u0186\u0185\u0001\u0000\u0000\u0000"+
		"\u0187/\u0001\u0000\u0000\u0000\u0188\u0189\u0007\u0003\u0000\u0000\u0189"+
		"1\u0001\u0000\u0000\u0000\u018a\u018e\u00034\u001a\u0000\u018b\u018e\u0005"+
		"\u0083\u0000\u0000\u018c\u018e\u0005~\u0000\u0000\u018d\u018a\u0001\u0000"+
		"\u0000\u0000\u018d\u018b\u0001\u0000\u0000\u0000\u018d\u018c\u0001\u0000"+
		"\u0000\u0000\u018e3\u0001\u0000\u0000\u0000\u018f\u0191\u0005\u0083\u0000"+
		"\u0000\u0190\u018f\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000\u0000"+
		"\u0000\u0191\u0193\u0001\u0000\u0000\u0000\u0192\u0194\u0005~\u0000\u0000"+
		"\u0193\u0192\u0001\u0000\u0000\u0000\u0193\u0194\u0001\u0000\u0000\u0000"+
		"\u0194\u0195\u0001\u0000\u0000\u0000\u0195\u0197\u0005\u0082\u0000\u0000"+
		"\u0196\u0198\u0003H$\u0000\u0197\u0196\u0001\u0000\u0000\u0000\u0197\u0198"+
		"\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u019b"+
		"\u0005p\u0000\u0000\u019a\u019c\u0005~\u0000\u0000\u019b\u019a\u0001\u0000"+
		"\u0000\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c\u019e\u0001\u0000"+
		"\u0000\u0000\u019d\u019f\u0005\u0083\u0000\u0000\u019e\u019d\u0001\u0000"+
		"\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f5\u0001\u0000\u0000"+
		"\u0000\u01a0\u01a1\u0005-\u0000\u0000\u01a1\u01a3\u0005_\u0000\u0000\u01a2"+
		"\u01a4\u0003\b\u0004\u0000\u01a3\u01a2\u0001\u0000\u0000\u0000\u01a3\u01a4"+
		"\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5\u01a6"+
		"\u0005`\u0000\u0000\u01a6\u01a7\u0003\\.\u0000\u01a77\u0001\u0000\u0000"+
		"\u0000\u01a8\u01a9\u00052\u0000\u0000\u01a9\u01ab\u0005_\u0000\u0000\u01aa"+
		"\u01ac\u0003\b\u0004\u0000\u01ab\u01aa\u0001\u0000\u0000\u0000\u01ab\u01ac"+
		"\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad\u01af"+
		"\u0005`\u0000\u0000\u01ae\u01b0\u0003\f\u0006\u0000\u01af\u01ae\u0001"+
		"\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001"+
		"\u0000\u0000\u0000\u01b1\u01b2\u0003\\.\u0000\u01b29\u0001\u0000\u0000"+
		"\u0000\u01b3\u01b4\u0005\u000b\u0000\u0000\u01b4\u01b5\u00052\u0000\u0000"+
		"\u01b5\u01b6\u0005a\u0000\u0000\u01b6\u01bb\u0003<\u001e\u0000\u01b7\u01b8"+
		"\u0005\\\u0000\u0000\u01b8\u01ba\u0003<\u001e\u0000\u01b9\u01b7\u0001"+
		"\u0000\u0000\u0000\u01ba\u01bd\u0001\u0000\u0000\u0000\u01bb\u01b9\u0001"+
		"\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bc\u01be\u0001"+
		"\u0000\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01be\u01bf\u0005"+
		"b\u0000\u0000\u01bf;\u0001\u0000\u0000\u0000\u01c0\u01c3\u00052\u0000"+
		"\u0000\u01c1\u01c2\u0005<\u0000\u0000\u01c2\u01c4\u0003J%\u0000\u01c3"+
		"\u01c1\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000\u01c4"+
		"=\u0001\u0000\u0000\u0000\u01c5\u01c6\u0005.\u0000\u0000\u01c6\u01c7\u0005"+
		"2\u0000\u0000\u01c7\u01cb\u0005a\u0000\u0000\u01c8\u01ca\u0003B!\u0000"+
		"\u01c9\u01c8\u0001\u0000\u0000\u0000\u01ca\u01cd\u0001\u0000\u0000\u0000"+
		"\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000"+
		"\u01cc\u01ce\u0001\u0000\u0000\u0000\u01cd\u01cb\u0001\u0000\u0000\u0000"+
		"\u01ce\u01cf\u0005b\u0000\u0000\u01cf?\u0001\u0000\u0000\u0000\u01d0\u01d1"+
		"\u0005/\u0000\u0000\u01d1\u01d2\u00052\u0000\u0000\u01d2\u01d6\u0005a"+
		"\u0000\u0000\u01d3\u01d5\u00038\u001c\u0000\u01d4\u01d3\u0001\u0000\u0000"+
		"\u0000\u01d5\u01d8\u0001\u0000\u0000\u0000\u01d6\u01d4\u0001\u0000\u0000"+
		"\u0000\u01d6\u01d7\u0001\u0000\u0000\u0000\u01d7\u01d9\u0001\u0000\u0000"+
		"\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d9\u01da\u0005b\u0000\u0000"+
		"\u01daA\u0001\u0000\u0000\u0000\u01db\u01dc\u00050\u0000\u0000\u01dc\u01dd"+
		"\u00052\u0000\u0000\u01dd\u01de\u0005e\u0000\u0000\u01de\u01df\u0003\f"+
		"\u0006\u0000\u01df\u01e0\u0005[\u0000\u0000\u01e0C\u0001\u0000\u0000\u0000"+
		"\u01e1\u01e3\u0005\u000f\u0000\u0000\u01e2\u01e4\u0005a\u0000\u0000\u01e3"+
		"\u01e2\u0001\u0000\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e4"+
		"\u01e6\u0001\u0000\u0000\u0000\u01e5\u01e7\u0005\u00a1\u0000\u0000\u01e6"+
		"\u01e5\u0001\u0000\u0000\u0000\u01e6\u01e7\u0001\u0000\u0000\u0000\u01e7"+
		"\u01e9\u0001\u0000\u0000\u0000\u01e8\u01ea\u0005\u0011\u0000\u0000\u01e9"+
		"\u01e8\u0001\u0000\u0000\u0000\u01e9\u01ea\u0001\u0000\u0000\u0000\u01ea"+
		"\u0201\u0001\u0000\u0000\u0000\u01eb\u0202\u00053\u0000\u0000\u01ec\u01ef"+
		"\u00052\u0000\u0000\u01ed\u01ee\u0005\u0011\u0000\u0000\u01ee\u01f0\u0005"+
		"2\u0000\u0000\u01ef\u01ed\u0001\u0000\u0000\u0000\u01ef\u01f0\u0001\u0000"+
		"\u0000\u0000\u01f0\u01f5\u0001\u0000\u0000\u0000\u01f1\u01f2\u0005\\\u0000"+
		"\u0000\u01f2\u01f4\u00052\u0000\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000"+
		"\u01f4\u01f7\u0001\u0000\u0000\u0000\u01f5\u01f3\u0001\u0000\u0000\u0000"+
		"\u01f5\u01f6\u0001\u0000\u0000\u0000\u01f6\u01fa\u0001\u0000\u0000\u0000"+
		"\u01f7\u01f5\u0001\u0000\u0000\u0000\u01f8\u01f9\u0005\u0011\u0000\u0000"+
		"\u01f9\u01fb\u00052\u0000\u0000\u01fa\u01f8\u0001\u0000\u0000\u0000\u01fa"+
		"\u01fb\u0001\u0000\u0000\u0000\u01fb\u01fd\u0001\u0000\u0000\u0000\u01fc"+
		"\u01fe\u0005b\u0000\u0000\u01fd\u01fc\u0001\u0000\u0000\u0000\u01fd\u01fe"+
		"\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000\u0000\u0000\u01ff\u0200"+
		"\u0005\u0012\u0000\u0000\u0200\u0202\u00053\u0000\u0000\u0201\u01eb\u0001"+
		"\u0000\u0000\u0000\u0201\u01ec\u0001\u0000\u0000\u0000\u0202\u0204\u0001"+
		"\u0000\u0000\u0000\u0203\u0205\u0005[\u0000\u0000\u0204\u0203\u0001\u0000"+
		"\u0000\u0000\u0204\u0205\u0001\u0000\u0000\u0000\u0205E\u0001\u0000\u0000"+
		"\u0000\u0206\u0207\u0005\u0010\u0000\u0000\u0207\u0209\u0003\u0004\u0002"+
		"\u0000\u0208\u020a\u0005[\u0000\u0000\u0209\u0208\u0001\u0000\u0000\u0000"+
		"\u0209\u020a\u0001\u0000\u0000\u0000\u020a\u021b\u0001\u0000\u0000\u0000"+
		"\u020b\u020c\u0005\u0010\u0000\u0000\u020c\u020e\u0003\u0006\u0003\u0000"+
		"\u020d\u020f\u0005[\u0000\u0000\u020e\u020d\u0001\u0000\u0000\u0000\u020e"+
		"\u020f\u0001\u0000\u0000\u0000\u020f\u021b\u0001\u0000\u0000\u0000\u0210"+
		"\u0211\u0005\u0010\u0000\u0000\u0211\u0213\u0003\u000e\u0007\u0000\u0212"+
		"\u0214\u0005[\u0000\u0000\u0213\u0212\u0001\u0000\u0000\u0000\u0213\u0214"+
		"\u0001\u0000\u0000\u0000\u0214\u021b\u0001\u0000\u0000\u0000\u0215\u0216"+
		"\u0005\u0010\u0000\u0000\u0216\u0218\u00052\u0000\u0000\u0217\u0219\u0005"+
		"[\u0000\u0000\u0218\u0217\u0001\u0000\u0000\u0000\u0218\u0219\u0001\u0000"+
		"\u0000\u0000\u0219\u021b\u0001\u0000\u0000\u0000\u021a\u0206\u0001\u0000"+
		"\u0000\u0000\u021a\u020b\u0001\u0000\u0000\u0000\u021a\u0210\u0001\u0000"+
		"\u0000\u0000\u021a\u0215\u0001\u0000\u0000\u0000\u021bG\u0001\u0000\u0000"+
		"\u0000\u021c\u021f\u0003J%\u0000\u021d\u021f\u0003d2\u0000\u021e\u021c"+
		"\u0001\u0000\u0000\u0000\u021e\u021d\u0001\u0000\u0000\u0000\u021fI\u0001"+
		"\u0000\u0000\u0000\u0220\u0221\u0003L&\u0000\u0221K\u0001\u0000\u0000"+
		"\u0000\u0222\u0228\u0003N\'\u0000\u0223\u0224\u0005f\u0000\u0000\u0224"+
		"\u0225\u0003J%\u0000\u0225\u0226\u0005e\u0000\u0000\u0226\u0227\u0003"+
		"J%\u0000\u0227\u0229\u0001\u0000\u0000\u0000\u0228\u0223\u0001\u0000\u0000"+
		"\u0000\u0228\u0229\u0001\u0000\u0000\u0000\u0229M\u0001\u0000\u0000\u0000"+
		"\u022a\u022f\u0003P(\u0000\u022b\u022c\u0007\u0004\u0000\u0000\u022c\u022e"+
		"\u0003P(\u0000\u022d\u022b\u0001\u0000\u0000\u0000\u022e\u0231\u0001\u0000"+
		"\u0000\u0000\u022f\u022d\u0001\u0000\u0000\u0000\u022f\u0230\u0001\u0000"+
		"\u0000\u0000\u0230O\u0001\u0000\u0000\u0000\u0231\u022f\u0001\u0000\u0000"+
		"\u0000\u0232\u0237\u0003V+\u0000\u0233\u0234\u0007\u0005\u0000\u0000\u0234"+
		"\u0236\u0003V+\u0000\u0235\u0233\u0001\u0000\u0000\u0000\u0236\u0239\u0001"+
		"\u0000\u0000\u0000\u0237\u0235\u0001\u0000\u0000\u0000\u0237\u0238\u0001"+
		"\u0000\u0000\u0000\u0238Q\u0001\u0000\u0000\u0000\u0239\u0237\u0001\u0000"+
		"\u0000\u0000\u023a\u023b\u0005c\u0000\u0000\u023b\u023c\u0003X,\u0000"+
		"\u023c\u023d\u0005d\u0000\u0000\u023dS\u0001\u0000\u0000\u0000\u023e\u023f"+
		"\u0005a\u0000\u0000\u023f\u0240\u0003\u0014\n\u0000\u0240\u0241\u0005"+
		"b\u0000\u0000\u0241U\u0001\u0000\u0000\u0000\u0242\u0243\u0006+\uffff"+
		"\uffff\u0000\u0243\u0259\u00052\u0000\u0000\u0244\u0259\u00053\u0000\u0000"+
		"\u0245\u0259\u0005\u0014\u0000\u0000\u0246\u0259\u00055\u0000\u0000\u0247"+
		"\u0259\u00059\u0000\u0000\u0248\u0259\u0005:\u0000\u0000\u0249\u0259\u0005"+
		";\u0000\u0000\u024a\u0259\u0005\u0014\u0000\u0000\u024b\u024c\u0005_\u0000"+
		"\u0000\u024c\u024d\u0003J%\u0000\u024d\u024e\u0005`\u0000\u0000\u024e"+
		"\u0259\u0001\u0000\u0000\u0000\u024f\u0259\u0003T*\u0000\u0250\u0259\u0003"+
		"R)\u0000\u0251\u0252\u0005\u0013\u0000\u0000\u0252\u0253\u00052\u0000"+
		"\u0000\u0253\u0255\u0005_\u0000\u0000\u0254\u0256\u0003X,\u0000\u0255"+
		"\u0254\u0001\u0000\u0000\u0000\u0255\u0256\u0001\u0000\u0000\u0000\u0256"+
		"\u0257\u0001\u0000\u0000\u0000\u0257\u0259\u0005`\u0000\u0000\u0258\u0242"+
		"\u0001\u0000\u0000\u0000\u0258\u0244\u0001\u0000\u0000\u0000\u0258\u0245"+
		"\u0001\u0000\u0000\u0000\u0258\u0246\u0001\u0000\u0000\u0000\u0258\u0247"+
		"\u0001\u0000\u0000\u0000\u0258\u0248\u0001\u0000\u0000\u0000\u0258\u0249"+
		"\u0001\u0000\u0000\u0000\u0258\u024a\u0001\u0000\u0000\u0000\u0258\u024b"+
		"\u0001\u0000\u0000\u0000\u0258\u024f\u0001\u0000\u0000\u0000\u0258\u0250"+
		"\u0001\u0000\u0000\u0000\u0258\u0251\u0001\u0000\u0000\u0000\u0259\u0265"+
		"\u0001\u0000\u0000\u0000\u025a\u025b\n\u0002\u0000\u0000\u025b\u025c\u0005"+
		"]\u0000\u0000\u025c\u0264\u0003V+\u0003\u025d\u025e\n\u0003\u0000\u0000"+
		"\u025e\u0260\u0005_\u0000\u0000\u025f\u0261\u0003X,\u0000\u0260\u025f"+
		"\u0001\u0000\u0000\u0000\u0260\u0261\u0001\u0000\u0000\u0000\u0261\u0262"+
		"\u0001\u0000\u0000\u0000\u0262\u0264\u0005`\u0000\u0000\u0263\u025a\u0001"+
		"\u0000\u0000\u0000\u0263\u025d\u0001\u0000\u0000\u0000\u0264\u0267\u0001"+
		"\u0000\u0000\u0000\u0265\u0263\u0001\u0000\u0000\u0000\u0265\u0266\u0001"+
		"\u0000\u0000\u0000\u0266W\u0001\u0000\u0000\u0000\u0267\u0265\u0001\u0000"+
		"\u0000\u0000\u0268\u026d\u0003J%\u0000\u0269\u026a\u0005\\\u0000\u0000"+
		"\u026a\u026c\u0003J%\u0000\u026b\u0269\u0001\u0000\u0000\u0000\u026c\u026f"+
		"\u0001\u0000\u0000\u0000\u026d\u026b\u0001\u0000\u0000\u0000\u026d\u026e"+
		"\u0001\u0000\u0000\u0000\u026e\u0271\u0001\u0000\u0000\u0000\u026f\u026d"+
		"\u0001\u0000\u0000\u0000\u0270\u0272\u0005\\\u0000\u0000\u0271\u0270\u0001"+
		"\u0000\u0000\u0000\u0271\u0272\u0001\u0000\u0000\u0000\u0272\u0274\u0001"+
		"\u0000\u0000\u0000\u0273\u0268\u0001\u0000\u0000\u0000\u0273\u0274\u0001"+
		"\u0000\u0000\u0000\u0274Y\u0001\u0000\u0000\u0000\u0275\u0276\u00052\u0000"+
		"\u0000\u0276\u0277\u0005<\u0000\u0000\u0277\u0278\u0003J%\u0000\u0278"+
		"[\u0001\u0000\u0000\u0000\u0279\u027d\u0005a\u0000\u0000\u027a\u027c\u0003"+
		"\u0002\u0001\u0000\u027b\u027a\u0001\u0000\u0000\u0000\u027c\u027f\u0001"+
		"\u0000\u0000\u0000\u027d\u027b\u0001\u0000\u0000\u0000\u027d\u027e\u0001"+
		"\u0000\u0000\u0000\u027e\u0281\u0001\u0000\u0000\u0000\u027f\u027d\u0001"+
		"\u0000\u0000\u0000\u0280\u0282\u0005[\u0000\u0000\u0281\u0280\u0001\u0000"+
		"\u0000\u0000\u0281\u0282\u0001\u0000\u0000\u0000\u0282\u0283\u0001\u0000"+
		"\u0000\u0000\u0283\u0284\u0005b\u0000\u0000\u0284]\u0001\u0000\u0000\u0000"+
		"\u0285\u0286\u0005\u0001\u0000\u0000\u0286\u0287\u0005_\u0000\u0000\u0287"+
		"\u0288\u0003J%\u0000\u0288\u0289\u0005`\u0000\u0000\u0289\u028c\u0003"+
		"\u0002\u0001\u0000\u028a\u028b\u0005\u0002\u0000\u0000\u028b\u028d\u0003"+
		"\u0002\u0001\u0000\u028c\u028a\u0001\u0000\u0000\u0000\u028c\u028d\u0001"+
		"\u0000\u0000\u0000\u028d_\u0001\u0000\u0000\u0000\u028e\u028f\u0005\u0003"+
		"\u0000\u0000\u028f\u02a0\u0005_\u0000\u0000\u0290\u02a1\u0003b1\u0000"+
		"\u0291\u0295\u0003\u0004\u0002\u0000\u0292\u0295\u0003Z-\u0000\u0293\u0295"+
		"\u0003J%\u0000\u0294\u0291\u0001\u0000\u0000\u0000\u0294\u0292\u0001\u0000"+
		"\u0000\u0000\u0294\u0293\u0001\u0000\u0000\u0000\u0294\u0295\u0001\u0000"+
		"\u0000\u0000\u0295\u0296\u0001\u0000\u0000\u0000\u0296\u0298\u0005[\u0000"+
		"\u0000\u0297\u0299\u0003J%\u0000\u0298\u0297\u0001\u0000\u0000\u0000\u0298"+
		"\u0299\u0001\u0000\u0000\u0000\u0299\u029a\u0001\u0000\u0000\u0000\u029a"+
		"\u029e\u0005[\u0000\u0000\u029b\u029f\u0003d2\u0000\u029c\u029f\u0003"+
		"Z-\u0000\u029d\u029f\u0003J%\u0000\u029e\u029b\u0001\u0000\u0000\u0000"+
		"\u029e\u029c\u0001\u0000\u0000\u0000\u029e\u029d\u0001\u0000\u0000\u0000"+
		"\u029e\u029f\u0001\u0000\u0000\u0000\u029f\u02a1\u0001\u0000\u0000\u0000"+
		"\u02a0\u0290\u0001\u0000\u0000\u0000\u02a0\u0294\u0001\u0000\u0000\u0000"+
		"\u02a1\u02a2\u0001\u0000\u0000\u0000\u02a2\u02a5\u0005`\u0000\u0000\u02a3"+
		"\u02a6\u0003\\.\u0000\u02a4\u02a6\u0003H$\u0000\u02a5\u02a3\u0001\u0000"+
		"\u0000\u0000\u02a5\u02a4\u0001\u0000\u0000\u0000\u02a6a\u0001\u0000\u0000"+
		"\u0000\u02a7\u02a8\u0003\u0004\u0002\u0000\u02a8\u02a9\u0005\'\u0000\u0000"+
		"\u02a9\u02aa\u0003J%\u0000\u02aac\u0001\u0000\u0000\u0000\u02ab\u02ac"+
		"\u00052\u0000\u0000\u02ac\u02ad\u0007\u0006\u0000\u0000\u02ade\u0001\u0000"+
		"\u0000\u0000\u02ae\u02af\u0005\u0004\u0000\u0000\u02af\u02b0\u0005_\u0000"+
		"\u0000\u02b0\u02b1\u0003J%\u0000\u02b1\u02b2\u0005`\u0000\u0000\u02b2"+
		"\u02b3\u0003\u0002\u0001\u0000\u02b3g\u0001\u0000\u0000\u0000\u02b4\u02b5"+
		"\u0005$\u0000\u0000\u02b5\u02b6\u0003\u0002\u0001\u0000\u02b6\u02b7\u0005"+
		"\u0004\u0000\u0000\u02b7\u02b8\u0005_\u0000\u0000\u02b8\u02b9\u0003J%"+
		"\u0000\u02b9\u02bb\u0005`\u0000\u0000\u02ba\u02bc\u0005[\u0000\u0000\u02bb"+
		"\u02ba\u0001\u0000\u0000\u0000\u02bb\u02bc\u0001\u0000\u0000\u0000\u02bc"+
		"i\u0001\u0000\u0000\u0000\u02bd\u02be\u0005\u001f\u0000\u0000\u02be\u02bf"+
		"\u0005_\u0000\u0000\u02bf\u02c0\u0003J%\u0000\u02c0\u02c1\u0005`\u0000"+
		"\u0000\u02c1\u02c5\u0005a\u0000\u0000\u02c2\u02c4\u0003l6\u0000\u02c3"+
		"\u02c2\u0001\u0000\u0000\u0000\u02c4\u02c7\u0001\u0000\u0000\u0000\u02c5"+
		"\u02c3\u0001\u0000\u0000\u0000\u02c5\u02c6\u0001\u0000\u0000\u0000\u02c6"+
		"\u02c8\u0001\u0000\u0000\u0000\u02c7\u02c5\u0001\u0000\u0000\u0000\u02c8"+
		"\u02c9\u0005b\u0000\u0000\u02c9k\u0001\u0000\u0000\u0000\u02ca\u02cb\u0005"+
		" \u0000\u0000\u02cb\u02cc\u0003J%\u0000\u02cc\u02d0\u0005e\u0000\u0000"+
		"\u02cd\u02cf\u0003\u0002\u0001\u0000\u02ce\u02cd\u0001\u0000\u0000\u0000"+
		"\u02cf\u02d2\u0001\u0000\u0000\u0000\u02d0\u02ce\u0001\u0000\u0000\u0000"+
		"\u02d0\u02d1\u0001\u0000\u0000\u0000\u02d1\u02dc\u0001\u0000\u0000\u0000"+
		"\u02d2\u02d0\u0001\u0000\u0000\u0000\u02d3\u02d4\u0005!\u0000\u0000\u02d4"+
		"\u02d8\u0005e\u0000\u0000\u02d5\u02d7\u0003\u0002\u0001\u0000\u02d6\u02d5"+
		"\u0001\u0000\u0000\u0000\u02d7\u02da\u0001\u0000\u0000\u0000\u02d8\u02d6"+
		"\u0001\u0000\u0000\u0000\u02d8\u02d9\u0001\u0000\u0000\u0000\u02d9\u02dc"+
		"\u0001\u0000\u0000\u0000\u02da\u02d8\u0001\u0000\u0000\u0000\u02db\u02ca"+
		"\u0001\u0000\u0000\u0000\u02db\u02d3\u0001\u0000\u0000\u0000\u02dcm\u0001"+
		"\u0000\u0000\u0000\u02dd\u02de\u0005\u001b\u0000\u0000\u02de\u02df\u0003"+
		"\\.\u0000\u02df\u02e0\u0005\u001c\u0000\u0000\u02e0\u02e1\u0005_\u0000"+
		"\u0000\u02e1\u02e2\u00052\u0000\u0000\u02e2\u02e3\u0005`\u0000\u0000\u02e3"+
		"\u02e6\u0003\\.\u0000\u02e4\u02e5\u0005\u001d\u0000\u0000\u02e5\u02e7"+
		"\u0003\\.\u0000\u02e6\u02e4\u0001\u0000\u0000\u0000\u02e6\u02e7\u0001"+
		"\u0000\u0000\u0000\u02e7o\u0001\u0000\u0000\u0000\u02e8\u02ea\u0005\u0006"+
		"\u0000\u0000\u02e9\u02eb\u0003J%\u0000\u02ea\u02e9\u0001\u0000\u0000\u0000"+
		"\u02ea\u02eb\u0001\u0000\u0000\u0000\u02eb\u02ed\u0001\u0000\u0000\u0000"+
		"\u02ec\u02ee\u0005[\u0000\u0000\u02ed\u02ec\u0001\u0000\u0000\u0000\u02ed"+
		"\u02ee\u0001\u0000\u0000\u0000\u02eeq\u0001\u0000\u0000\u0000\u02ef\u02f1"+
		"\u0005\"\u0000\u0000\u02f0\u02f2\u0005[\u0000\u0000\u02f1\u02f0\u0001"+
		"\u0000\u0000\u0000\u02f1\u02f2\u0001\u0000\u0000\u0000\u02f2s\u0001\u0000"+
		"\u0000\u0000\u02f3\u02f4\u0005#\u0000\u0000\u02f4\u02f5\u0005[\u0000\u0000"+
		"\u02f5u\u0001\u0000\u0000\u0000\u02f6\u02f7\u0005\u001e\u0000\u0000\u02f7"+
		"\u02f8\u0003J%\u0000\u02f8\u02f9\u0005[\u0000\u0000\u02f9w\u0001\u0000"+
		"\u0000\u0000\u02fa\u02fb\u00052\u0000\u0000\u02fb\u02fc\u0005<\u0000\u0000"+
		"\u02fc\u02fd\u0003J%\u0000\u02fd\u02fe\u0005[\u0000\u0000\u02fe\u0302"+
		"\u0001\u0000\u0000\u0000\u02ff\u0300\u00052\u0000\u0000\u0300\u0302\u0005"+
		"[\u0000\u0000\u0301\u02fa\u0001\u0000\u0000\u0000\u0301\u02ff\u0001\u0000"+
		"\u0000\u0000\u0302y\u0001\u0000\u0000\u0000\u0303\u0304\u0005&\u0000\u0000"+
		"\u0304\u030a\u00052\u0000\u0000\u0305\u0307\u0005_\u0000\u0000\u0306\u0308"+
		"\u0003\b\u0004\u0000\u0307\u0306\u0001\u0000\u0000\u0000\u0307\u0308\u0001"+
		"\u0000\u0000\u0000\u0308\u0309\u0001\u0000\u0000\u0000\u0309\u030b\u0005"+
		"`\u0000\u0000\u030a\u0305\u0001\u0000\u0000\u0000\u030a\u030b\u0001\u0000"+
		"\u0000\u0000\u030b{\u0001\u0000\u0000\u0000\u030c\u030f\u0005\u008e\u0000"+
		"\u0000\u030d\u030e\u0005\u008f\u0000\u0000\u030e\u0310\u0005\u009f\u0000"+
		"\u0000\u030f\u030d\u0001\u0000\u0000\u0000\u030f\u0310\u0001\u0000\u0000"+
		"\u0000\u0310}\u0001\u0000\u0000\u0000g\u0081\u0099\u00a1\u00a7\u00b1\u00b8"+
		"\u00c0\u00c8\u00cb\u00d3\u00d7\u00db\u00de\u00e1\u00e4\u00ef\u00f6\u00fa"+
		"\u00fc\u0102\u0108\u010e\u0114\u011c\u0123\u012a\u012c\u0137\u013d\u013f"+
		"\u014a\u014c\u0153\u015a\u0161\u0168\u016d\u0172\u0175\u017a\u017d\u0181"+
		"\u0186\u018d\u0190\u0193\u0197\u019b\u019e\u01a3\u01ab\u01af\u01bb\u01c3"+
		"\u01cb\u01d6\u01e3\u01e6\u01e9\u01ef\u01f5\u01fa\u01fd\u0201\u0204\u0209"+
		"\u020e\u0213\u0218\u021a\u021e\u0228\u022f\u0237\u0255\u0258\u0260\u0263"+
		"\u0265\u026d\u0271\u0273\u027d\u0281\u028c\u0294\u0298\u029e\u02a0\u02a5"+
		"\u02bb\u02c5\u02d0\u02d8\u02db\u02e6\u02ea\u02ed\u02f1\u0301\u0307\u030a"+
		"\u030f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}