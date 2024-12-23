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
		TAG_LPAREN=138, TAG_RPAREN=139, ANG_FOR=140, ANG_IF=141, TAG_EQUALS=142, 
		TAG_NAME=143, ATTVALUE_VALUE=144, ATTRIBUTE=145, STAR=146;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_variableDeclaration = 2, RULE_functionDeclaration = 3, 
		RULE_parameterList = 4, RULE_parameter = 5, RULE_typeAnnotation = 6, RULE_classDeclaration = 7, 
		RULE_classBody = 8, RULE_classMember = 9, RULE_objectBody = 10, RULE_objectMember = 11, 
		RULE_template = 12, RULE_htmlElements = 13, RULE_htmlElement = 14, RULE_htmlAttribute = 15, 
		RULE_angularAttribute = 16, RULE_bindingAttribute = 17, RULE_eventBindingAttribute = 18, 
		RULE_forAttribute = 19, RULE_ifAttribute = 20, RULE_htmlContent = 21, 
		RULE_htmlMisc = 22, RULE_htmlComment = 23, RULE_htmlChardata = 24, RULE_angularCharData = 25, 
		RULE_constructorDeclaration = 26, RULE_methodDeclaration = 27, RULE_enumDeclaration = 28, 
		RULE_enumMember = 29, RULE_componentDeclaration = 30, RULE_serviceDeclaration = 31, 
		RULE_propertyDeclaration = 32, RULE_importStatement = 33, RULE_exportStatement = 34, 
		RULE_expressionStatement = 35, RULE_expression = 36, RULE_conditionalExpression = 37, 
		RULE_logicalExpression = 38, RULE_binaryExpression = 39, RULE_arrayDeclaration = 40, 
		RULE_objectDeclaration = 41, RULE_primaryExpression = 42, RULE_argumentList = 43, 
		RULE_assignmentExpression = 44, RULE_blockStatement = 45, RULE_ifStatement = 46, 
		RULE_forStatement = 47, RULE_forOf = 48, RULE_incrementExpression = 49, 
		RULE_whileStatement = 50, RULE_doWhileStatement = 51, RULE_switchStatement = 52, 
		RULE_caseStatement = 53, RULE_tryCatchStatement = 54, RULE_returnStatement = 55, 
		RULE_breakStatement = 56, RULE_continueStatement = 57, RULE_throwStatement = 58, 
		RULE_readError = 59, RULE_decoratorApplication = 60;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "variableDeclaration", "functionDeclaration", 
			"parameterList", "parameter", "typeAnnotation", "classDeclaration", "classBody", 
			"classMember", "objectBody", "objectMember", "template", "htmlElements", 
			"htmlElement", "htmlAttribute", "angularAttribute", "bindingAttribute", 
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
			"decoratorApplication"
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
			null, null, null, null, null, null, "'*ngFor'", "'*ngIf'"
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
			"TAG_RPAREN", "ANG_FOR", "ANG_IF", "TAG_EQUALS", "TAG_NAME", "ATTVALUE_VALUE", 
			"ATTRIBUTE", "STAR"
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
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1021402720232901626L) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 21L) != 0)) {
				{
				{
				setState(122);
				statement();
				}
				}
				setState(127);
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
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				functionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				enumDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(132);
				componentDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(133);
				serviceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(134);
				importStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(135);
				exportStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(136);
				expressionStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(137);
				blockStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(138);
				ifStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(139);
				forStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(140);
				whileStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(141);
				doWhileStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(142);
				switchStatement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(143);
				tryCatchStatement();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(144);
				returnStatement();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(145);
				breakStatement();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(146);
				continueStatement();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(147);
				throwStatement();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(148);
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
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				_la = _input.LA(1);
				if ( !(_la==LET || _la==CONST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(152);
				match(ID);
				setState(153);
				match(ASSIGN);
				setState(154);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
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
			setState(159);
			match(FUNCTION);
			setState(160);
			match(ID);
			setState(161);
			match(LPAREN);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1021191215507832832L) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 21L) != 0)) {
				{
				setState(162);
				parameterList();
				}
			}

			setState(165);
			match(RPAREN);
			setState(166);
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
			setState(168);
			parameter();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(169);
				match(COMMA);
				setState(170);
				parameter();
				}
				}
				setState(175);
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
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				expressionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(ID);
				setState(178);
				match(COLON);
				setState(179);
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
			setState(182);
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
			setState(184);
			match(CLASS);
			setState(185);
			match(ID);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(186);
				match(EXTENDS);
				setState(187);
				match(ID);
				}
			}

			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(190);
				match(IMPLEMENTS);
				setState(191);
				match(ID);
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(192);
					match(COMMA);
					setState(193);
					match(ID);
					}
					}
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(201);
			match(LBRACE);
			setState(202);
			classBody();
			setState(203);
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
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1021226399911381376L) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 21L) != 0)) {
				{
				{
				setState(205);
				classMember();
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(206);
					match(SEMICOLON);
					}
				}

				}
				}
				setState(213);
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
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUBLIC) {
					{
					setState(214);
					match(PUBLIC);
					}
				}

				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRIVATE) {
					{
					setState(217);
					match(PRIVATE);
					}
				}

				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PROTECTED) {
					{
					setState(220);
					match(PROTECTED);
					}
				}

				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(223);
					match(STATIC);
					}
				}

				setState(226);
				match(ID);
				setState(227);
				match(COLON);
				setState(228);
				typeAnnotation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				constructorDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				variableDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(231);
				expressionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(232);
				methodDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(233);
				enumDeclaration();
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
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPLATE || _la==ID) {
				{
				setState(236);
				objectMember();
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(237);
						match(COMMA);
						setState(238);
						objectMember();
						}
						} 
					}
					setState(243);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(244);
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
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEMPLATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				template();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(ID);
				setState(251);
				match(COLON);
				setState(252);
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
			setState(255);
			match(TEMPLATE);
			setState(259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(256);
					match(SEA_WS);
					}
					} 
				}
				setState(261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(265);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(262);
					htmlElements();
					}
					} 
				}
				setState(267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEA_WS) {
				{
				{
				setState(268);
				match(SEA_WS);
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(274);
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
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & 67L) != 0)) {
				{
				{
				setState(276);
				htmlMisc();
				}
				}
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(282);
			htmlElement();
			setState(286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(283);
					htmlMisc();
					}
					} 
				}
				setState(288);
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
		public List<TerminalNode> TAG_NAME() { return getTokens(AngularParser.TAG_NAME); }
		public TerminalNode TAG_NAME(int i) {
			return getToken(AngularParser.TAG_NAME, i);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(TAG_OPEN);
			setState(290);
			match(TAG_NAME);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & 181L) != 0)) {
				{
				setState(293);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TAG_NAME:
					{
					setState(291);
					htmlAttribute();
					}
					break;
				case TAG_LBRACKET:
				case TAG_LPAREN:
				case ANG_FOR:
				case ANG_IF:
					{
					setState(292);
					angularAttribute();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_CLOSE:
				{
				{
				setState(298);
				match(TAG_CLOSE);
				{
				setState(299);
				htmlContent();
				setState(300);
				match(TAG_OPEN);
				setState(301);
				match(TAG_SLASH);
				setState(302);
				match(TAG_NAME);
				setState(303);
				match(TAG_CLOSE);
				}
				}
				}
				break;
			case TAG_SLASH_CLOSE:
				{
				setState(305);
				match(TAG_SLASH_CLOSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 30, RULE_htmlAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(308);
			match(TAG_NAME);
			}
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAG_EQUALS) {
				{
				setState(309);
				match(TAG_EQUALS);
				setState(310);
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
		enterRule(_localctx, 32, RULE_angularAttribute);
		try {
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				bindingAttribute();
				}
				break;
			case TAG_LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				eventBindingAttribute();
				}
				break;
			case ANG_FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(315);
				forAttribute();
				}
				break;
			case ANG_IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(316);
				ifAttribute();
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
		enterRule(_localctx, 34, RULE_bindingAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(TAG_LBRACKET);
			setState(320);
			match(TAG_NAME);
			setState(321);
			match(TAG_RBRACKET);
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAG_EQUALS) {
				{
				setState(322);
				match(TAG_EQUALS);
				setState(323);
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
		enterRule(_localctx, 36, RULE_eventBindingAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(TAG_LPAREN);
			setState(327);
			match(TAG_NAME);
			setState(328);
			match(TAG_RPAREN);
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAG_EQUALS) {
				{
				setState(329);
				match(TAG_EQUALS);
				setState(330);
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
		enterRule(_localctx, 38, RULE_forAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(ANG_FOR);
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAG_EQUALS) {
				{
				setState(334);
				match(TAG_EQUALS);
				setState(335);
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
		enterRule(_localctx, 40, RULE_ifAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(ANG_IF);
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAG_EQUALS) {
				{
				setState(339);
				match(TAG_EQUALS);
				setState(340);
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
		enterRule(_localctx, 42, RULE_htmlContent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & 49L) != 0)) {
				{
				setState(343);
				htmlChardata();
				}
			}

			setState(356);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(349);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TAG_OPEN:
						{
						setState(346);
						htmlElement();
						}
						break;
					case CDATA:
						{
						setState(347);
						match(CDATA);
						}
						break;
					case HTML_COMMENT:
					case HTML_CONDITIONAL_COMMENT:
						{
						setState(348);
						htmlComment();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(352);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & 49L) != 0)) {
						{
						setState(351);
						htmlChardata();
						}
					}

					}
					} 
				}
				setState(358);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
		enterRule(_localctx, 44, RULE_htmlMisc);
		try {
			setState(361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_COMMENT:
			case HTML_CONDITIONAL_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				htmlComment();
				}
				break;
			case SEA_WS:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
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
		enterRule(_localctx, 46, RULE_htmlComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
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
		enterRule(_localctx, 48, RULE_htmlChardata);
		try {
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				angularCharData();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				match(HTML_TEXT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(367);
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
		enterRule(_localctx, 50, RULE_angularCharData);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HTML_TEXT) {
				{
				setState(370);
				match(HTML_TEXT);
				}
			}

			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEA_WS) {
				{
				setState(373);
				match(SEA_WS);
				}
			}

			setState(376);
			match(HANDLEBAR_OPEN);
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1021191215507832832L) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 21L) != 0)) {
				{
				setState(377);
				expressionStatement();
				}
			}

			setState(380);
			match(HANDLEBAR_CLOSE);
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEA_WS) {
				{
				setState(381);
				match(SEA_WS);
				}
			}

			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HTML_TEXT) {
				{
				setState(384);
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
		enterRule(_localctx, 52, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(CONSTRUCTOR);
			setState(388);
			match(LPAREN);
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1021191215507832832L) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 21L) != 0)) {
				{
				setState(389);
				parameterList();
				}
			}

			setState(392);
			match(RPAREN);
			setState(393);
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
		enterRule(_localctx, 54, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(ID);
			setState(396);
			match(LPAREN);
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1021191215507832832L) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 21L) != 0)) {
				{
				setState(397);
				parameterList();
				}
			}

			setState(400);
			match(RPAREN);
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & 4575657221408423937L) != 0)) {
				{
				setState(401);
				typeAnnotation();
				}
			}

			setState(404);
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
		enterRule(_localctx, 56, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(ENUM);
			setState(407);
			match(ID);
			setState(408);
			match(LBRACE);
			setState(409);
			enumMember();
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(410);
				match(COMMA);
				setState(411);
				enumMember();
				}
				}
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(417);
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
		enterRule(_localctx, 58, RULE_enumMember);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(ID);
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(420);
				match(ASSIGN);
				setState(421);
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
		enterRule(_localctx, 60, RULE_componentDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(COMPONENT);
			setState(425);
			match(ID);
			setState(426);
			match(LBRACE);
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PROPERTY) {
				{
				{
				setState(427);
				propertyDeclaration();
				}
				}
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(433);
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
		enterRule(_localctx, 62, RULE_serviceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(SERVICE);
			setState(436);
			match(ID);
			setState(437);
			match(LBRACE);
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(438);
				methodDeclaration();
				}
				}
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(444);
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
		enterRule(_localctx, 64, RULE_propertyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(PROPERTY);
			setState(447);
			match(ID);
			setState(448);
			match(COLON);
			setState(449);
			typeAnnotation();
			setState(450);
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
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode STAR() { return getToken(AngularParser.STAR, 0); }
		public List<TerminalNode> AS() { return getTokens(AngularParser.AS); }
		public TerminalNode AS(int i) {
			return getToken(AngularParser.AS, i);
		}
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public List<TerminalNode> ID() { return getTokens(AngularParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngularParser.ID, i);
		}
		public TerminalNode FROM() { return getToken(AngularParser.FROM, 0); }
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
		enterRule(_localctx, 66, RULE_importStatement);
		int _la;
		try {
			setState(489);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				match(IMPORT);
				setState(454);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(453);
					match(LBRACE);
					}
					break;
				}
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAR) {
					{
					setState(456);
					match(STAR);
					}
				}

				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(459);
					match(AS);
					}
				}

				}
				break;
			case ID:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(484);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(462);
					match(STRING);
					}
					break;
				case ID:
					{
					setState(463);
					match(ID);
					setState(466);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						setState(464);
						match(AS);
						setState(465);
						match(ID);
						}
						break;
					}
					setState(472);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(468);
						match(COMMA);
						setState(469);
						match(ID);
						}
						}
						setState(474);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(477);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(475);
						match(AS);
						setState(476);
						match(ID);
						}
					}

					setState(480);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==RBRACE) {
						{
						setState(479);
						match(RBRACE);
						}
					}

					setState(482);
					match(FROM);
					setState(483);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(487);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(486);
					match(SEMICOLON);
					}
					break;
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
		enterRule(_localctx, 68, RULE_exportStatement);
		try {
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(491);
				match(EXPORT);
				setState(492);
				variableDeclaration();
				setState(494);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(493);
					match(SEMICOLON);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
				match(EXPORT);
				setState(497);
				functionDeclaration();
				setState(499);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(498);
					match(SEMICOLON);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(501);
				match(EXPORT);
				setState(502);
				classDeclaration();
				setState(504);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(503);
					match(SEMICOLON);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(506);
				match(EXPORT);
				setState(507);
				match(ID);
				setState(509);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(508);
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
		enterRule(_localctx, 70, RULE_expressionStatement);
		try {
			setState(515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(514);
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
		enterRule(_localctx, 72, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
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
		enterRule(_localctx, 74, RULE_conditionalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			logicalExpression();
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUESTION) {
				{
				setState(520);
				match(QUESTION);
				setState(521);
				expression();
				setState(522);
				match(COLON);
				setState(523);
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
		enterRule(_localctx, 76, RULE_logicalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			binaryExpression();
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 123L) != 0)) {
				{
				{
				setState(528);
				_la = _input.LA(1);
				if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 123L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(529);
				binaryExpression();
				}
				}
				setState(534);
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
		enterRule(_localctx, 78, RULE_binaryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			primaryExpression(0);
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 1610645503L) != 0)) {
				{
				{
				setState(536);
				_la = _input.LA(1);
				if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 1610645503L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(537);
				primaryExpression(0);
				}
				}
				setState(542);
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
		enterRule(_localctx, 80, RULE_arrayDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			match(LBRACKET);
			setState(544);
			argumentList();
			setState(545);
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
		enterRule(_localctx, 82, RULE_objectDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			match(LBRACE);
			setState(548);
			objectBody();
			setState(549);
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
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_primaryExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(552);
				match(ID);
				}
				break;
			case STRING:
				{
				setState(553);
				match(STRING);
				}
				break;
			case THIS:
				{
				setState(554);
				match(THIS);
				}
				break;
			case NUMBER:
				{
				setState(555);
				match(NUMBER);
				}
				break;
			case BOOLEAN:
				{
				setState(556);
				match(BOOLEAN);
				}
				break;
			case NULL:
				{
				setState(557);
				match(NULL);
				}
				break;
			case UNDEFINED:
				{
				setState(558);
				match(UNDEFINED);
				}
				break;
			case LPAREN:
				{
				setState(559);
				match(LPAREN);
				setState(560);
				expression();
				setState(561);
				match(RPAREN);
				}
				break;
			case LBRACE:
				{
				setState(563);
				objectDeclaration();
				}
				break;
			case LBRACKET:
				{
				setState(564);
				arrayDeclaration();
				}
				break;
			case NEW:
				{
				setState(565);
				match(NEW);
				setState(566);
				match(ID);
				setState(567);
				match(LPAREN);
				setState(569);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(568);
					argumentList();
					}
					break;
				}
				setState(571);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(585);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(583);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
					case 1:
						{
						_localctx = new PrimaryExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(574);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(575);
						match(DOT);
						setState(576);
						primaryExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new PrimaryExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(577);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(578);
						match(LPAREN);
						setState(580);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
						case 1:
							{
							setState(579);
							argumentList();
							}
							break;
						}
						setState(582);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(587);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
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
		enterRule(_localctx, 86, RULE_argumentList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1021191215507832832L) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 21L) != 0)) {
				{
				setState(588);
				expression();
				setState(593);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(589);
						match(COMMA);
						setState(590);
						expression();
						}
						} 
					}
					setState(595);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				}
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(596);
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
		enterRule(_localctx, 88, RULE_assignmentExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			match(ID);
			setState(602);
			match(ASSIGN);
			setState(603);
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
		enterRule(_localctx, 90, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			match(LBRACE);
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1021402720232901626L) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 21L) != 0)) {
				{
				{
				setState(606);
				statement();
				}
				}
				setState(611);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(612);
				match(SEMICOLON);
				}
			}

			setState(615);
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
		enterRule(_localctx, 92, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			match(IF);
			setState(618);
			match(LPAREN);
			setState(619);
			expression();
			setState(620);
			match(RPAREN);
			setState(621);
			statement();
			setState(624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(622);
				match(ELSE);
				setState(623);
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
		enterRule(_localctx, 94, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			match(FOR);
			setState(627);
			match(LPAREN);
			setState(644);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(628);
				forOf();
				}
				break;
			case 2:
				{
				{
				setState(632);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(629);
					variableDeclaration();
					}
					break;
				case 2:
					{
					setState(630);
					assignmentExpression();
					}
					break;
				case 3:
					{
					setState(631);
					expression();
					}
					break;
				}
				setState(634);
				match(SEMICOLON);
				setState(636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1021191215507832832L) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 21L) != 0)) {
					{
					setState(635);
					expression();
					}
				}

				setState(638);
				match(SEMICOLON);
				setState(642);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(639);
					incrementExpression();
					}
					break;
				case 2:
					{
					setState(640);
					assignmentExpression();
					}
					break;
				case 3:
					{
					setState(641);
					expression();
					}
					break;
				}
				}
				}
				break;
			}
			setState(646);
			match(RPAREN);
			setState(649);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(647);
				blockStatement();
				}
				break;
			case 2:
				{
				setState(648);
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
		enterRule(_localctx, 96, RULE_forOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			variableDeclaration();
			setState(652);
			match(OF);
			setState(653);
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
		enterRule(_localctx, 98, RULE_incrementExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			match(ID);
			setState(656);
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
		enterRule(_localctx, 100, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			match(WHILE);
			setState(659);
			match(LPAREN);
			setState(660);
			expression();
			setState(661);
			match(RPAREN);
			setState(662);
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
		enterRule(_localctx, 102, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			match(DO);
			setState(665);
			statement();
			setState(666);
			match(WHILE);
			setState(667);
			match(LPAREN);
			setState(668);
			expression();
			setState(669);
			match(RPAREN);
			setState(671);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(670);
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
		enterRule(_localctx, 104, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			match(SWITCH);
			setState(674);
			match(LPAREN);
			setState(675);
			expression();
			setState(676);
			match(RPAREN);
			setState(677);
			match(LBRACE);
			setState(681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(678);
				caseStatement();
				}
				}
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(684);
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
		enterRule(_localctx, 106, RULE_caseStatement);
		int _la;
		try {
			setState(703);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(686);
				match(CASE);
				setState(687);
				expression();
				setState(688);
				match(COLON);
				setState(692);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1021402720232901626L) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 21L) != 0)) {
					{
					{
					setState(689);
					statement();
					}
					}
					setState(694);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(695);
				match(DEFAULT);
				setState(696);
				match(COLON);
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1021402720232901626L) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 21L) != 0)) {
					{
					{
					setState(697);
					statement();
					}
					}
					setState(702);
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
		enterRule(_localctx, 108, RULE_tryCatchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			match(TRY);
			setState(706);
			blockStatement();
			setState(707);
			match(CATCH);
			setState(708);
			match(LPAREN);
			setState(709);
			match(ID);
			setState(710);
			match(RPAREN);
			setState(711);
			blockStatement();
			setState(714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(712);
				match(FINALLY);
				setState(713);
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
		enterRule(_localctx, 110, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			match(RETURN);
			setState(718);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(717);
				expression();
				}
				break;
			}
			setState(721);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(720);
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
		enterRule(_localctx, 112, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			match(BREAK);
			setState(725);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(724);
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
		enterRule(_localctx, 114, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			match(CONTINUE);
			setState(728);
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
		enterRule(_localctx, 116, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			match(THROW);
			setState(731);
			expression();
			setState(732);
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
		enterRule(_localctx, 118, RULE_readError);
		try {
			setState(741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(734);
				match(ID);
				setState(735);
				match(ASSIGN);
				setState(736);
				expression();
				setState(737);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(739);
				match(ID);
				setState(740);
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
		enterRule(_localctx, 120, RULE_decoratorApplication);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			match(DECORATOR);
			setState(744);
			match(ID);
			setState(750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(745);
				match(LPAREN);
				setState(747);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1021191215507832832L) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 21L) != 0)) {
					{
					setState(746);
					parameterList();
					}
				}

				setState(749);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 42:
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
		"\u0004\u0001\u0092\u02f1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		";\u0002<\u0007<\u0001\u0000\u0005\u0000|\b\u0000\n\u0000\f\u0000\u007f"+
		"\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0096\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u009e\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u00a4\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004\u00ac\b\u0004\n\u0004\f\u0004\u00af\t\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00b5\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00bd\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u00c3\b\u0007\n\u0007\f\u0007\u00c6\t\u0007\u0003\u0007\u00c8"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0003\b\u00d0\b\b\u0005\b\u00d2\b\b\n\b\f\b\u00d5\t\b\u0001\t\u0003"+
		"\t\u00d8\b\t\u0001\t\u0003\t\u00db\b\t\u0001\t\u0003\t\u00de\b\t\u0001"+
		"\t\u0003\t\u00e1\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u00eb\b\t\u0001\n\u0001\n\u0001\n\u0005\n\u00f0\b\n"+
		"\n\n\f\n\u00f3\t\n\u0001\n\u0003\n\u00f6\b\n\u0003\n\u00f8\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00fe\b\u000b\u0001\f"+
		"\u0001\f\u0005\f\u0102\b\f\n\f\f\f\u0105\t\f\u0001\f\u0005\f\u0108\b\f"+
		"\n\f\f\f\u010b\t\f\u0001\f\u0005\f\u010e\b\f\n\f\f\f\u0111\t\f\u0001\f"+
		"\u0001\f\u0001\r\u0005\r\u0116\b\r\n\r\f\r\u0119\t\r\u0001\r\u0001\r\u0005"+
		"\r\u011d\b\r\n\r\f\r\u0120\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u0126\b\u000e\n\u000e\f\u000e\u0129\t\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u0133\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u0138\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u013e\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u0145\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u014c\b\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u0151\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u0156\b\u0014\u0001\u0015\u0003\u0015\u0159\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u015e\b\u0015\u0001\u0015\u0003"+
		"\u0015\u0161\b\u0015\u0005\u0015\u0163\b\u0015\n\u0015\f\u0015\u0166\t"+
		"\u0015\u0001\u0016\u0001\u0016\u0003\u0016\u016a\b\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0171\b\u0018\u0001"+
		"\u0019\u0003\u0019\u0174\b\u0019\u0001\u0019\u0003\u0019\u0177\b\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u017b\b\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u017f\b\u0019\u0001\u0019\u0003\u0019\u0182\b\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0187\b\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u018f"+
		"\b\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0193\b\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0005\u001c\u019d\b\u001c\n\u001c\f\u001c\u01a0\t\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01a7"+
		"\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u01ad"+
		"\b\u001e\n\u001e\f\u001e\u01b0\t\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u01b8\b\u001f\n\u001f"+
		"\f\u001f\u01bb\t\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001!\u0001!\u0003!\u01c7\b!\u0001!\u0003!\u01ca\b!\u0001"+
		"!\u0003!\u01cd\b!\u0001!\u0001!\u0001!\u0001!\u0003!\u01d3\b!\u0001!\u0001"+
		"!\u0005!\u01d7\b!\n!\f!\u01da\t!\u0001!\u0001!\u0003!\u01de\b!\u0001!"+
		"\u0003!\u01e1\b!\u0001!\u0001!\u0003!\u01e5\b!\u0001!\u0003!\u01e8\b!"+
		"\u0003!\u01ea\b!\u0001\"\u0001\"\u0001\"\u0003\"\u01ef\b\"\u0001\"\u0001"+
		"\"\u0001\"\u0003\"\u01f4\b\"\u0001\"\u0001\"\u0001\"\u0003\"\u01f9\b\""+
		"\u0001\"\u0001\"\u0001\"\u0003\"\u01fe\b\"\u0003\"\u0200\b\"\u0001#\u0001"+
		"#\u0003#\u0204\b#\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0003%\u020e\b%\u0001&\u0001&\u0001&\u0005&\u0213\b&\n&\f&\u0216\t&"+
		"\u0001\'\u0001\'\u0001\'\u0005\'\u021b\b\'\n\'\f\'\u021e\t\'\u0001(\u0001"+
		"(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0003*\u023a\b*\u0001*\u0003*\u023d\b*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u0245\b*\u0001*\u0005*\u0248"+
		"\b*\n*\f*\u024b\t*\u0001+\u0001+\u0001+\u0005+\u0250\b+\n+\f+\u0253\t"+
		"+\u0001+\u0003+\u0256\b+\u0003+\u0258\b+\u0001,\u0001,\u0001,\u0001,\u0001"+
		"-\u0001-\u0005-\u0260\b-\n-\f-\u0263\t-\u0001-\u0003-\u0266\b-\u0001-"+
		"\u0001-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u0271"+
		"\b.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0003/\u0279\b/\u0001/\u0001"+
		"/\u0003/\u027d\b/\u0001/\u0001/\u0001/\u0001/\u0003/\u0283\b/\u0003/\u0285"+
		"\b/\u0001/\u0001/\u0001/\u0003/\u028a\b/\u00010\u00010\u00010\u00010\u0001"+
		"1\u00011\u00011\u00012\u00012\u00012\u00012\u00012\u00012\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00033\u02a0\b3\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00054\u02a8\b4\n4\f4\u02ab\t4\u00014\u00014\u0001"+
		"5\u00015\u00015\u00015\u00055\u02b3\b5\n5\f5\u02b6\t5\u00015\u00015\u0001"+
		"5\u00055\u02bb\b5\n5\f5\u02be\t5\u00035\u02c0\b5\u00016\u00016\u00016"+
		"\u00016\u00016\u00016\u00016\u00016\u00016\u00036\u02cb\b6\u00017\u0001"+
		"7\u00037\u02cf\b7\u00017\u00037\u02d2\b7\u00018\u00018\u00038\u02d6\b"+
		"8\u00019\u00019\u00019\u0001:\u0001:\u0001:\u0001:\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0003;\u02e6\b;\u0001<\u0001<\u0001<\u0001"+
		"<\u0003<\u02ec\b<\u0001<\u0003<\u02ef\b<\u0001<\u0000\u0001T=\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvx\u0000\u0006\u0001\u0000"+
		"\u0007\b\u0002\u000022io\u0001\u0000xy\u0002\u0000KLNQ\u0002\u0000<JY"+
		"Z\u0001\u0000YZ\u0340\u0000}\u0001\u0000\u0000\u0000\u0002\u0095\u0001"+
		"\u0000\u0000\u0000\u0004\u009d\u0001\u0000\u0000\u0000\u0006\u009f\u0001"+
		"\u0000\u0000\u0000\b\u00a8\u0001\u0000\u0000\u0000\n\u00b4\u0001\u0000"+
		"\u0000\u0000\f\u00b6\u0001\u0000\u0000\u0000\u000e\u00b8\u0001\u0000\u0000"+
		"\u0000\u0010\u00d3\u0001\u0000\u0000\u0000\u0012\u00ea\u0001\u0000\u0000"+
		"\u0000\u0014\u00f7\u0001\u0000\u0000\u0000\u0016\u00fd\u0001\u0000\u0000"+
		"\u0000\u0018\u00ff\u0001\u0000\u0000\u0000\u001a\u0117\u0001\u0000\u0000"+
		"\u0000\u001c\u0121\u0001\u0000\u0000\u0000\u001e\u0134\u0001\u0000\u0000"+
		"\u0000 \u013d\u0001\u0000\u0000\u0000\"\u013f\u0001\u0000\u0000\u0000"+
		"$\u0146\u0001\u0000\u0000\u0000&\u014d\u0001\u0000\u0000\u0000(\u0152"+
		"\u0001\u0000\u0000\u0000*\u0158\u0001\u0000\u0000\u0000,\u0169\u0001\u0000"+
		"\u0000\u0000.\u016b\u0001\u0000\u0000\u00000\u0170\u0001\u0000\u0000\u0000"+
		"2\u0173\u0001\u0000\u0000\u00004\u0183\u0001\u0000\u0000\u00006\u018b"+
		"\u0001\u0000\u0000\u00008\u0196\u0001\u0000\u0000\u0000:\u01a3\u0001\u0000"+
		"\u0000\u0000<\u01a8\u0001\u0000\u0000\u0000>\u01b3\u0001\u0000\u0000\u0000"+
		"@\u01be\u0001\u0000\u0000\u0000B\u01e9\u0001\u0000\u0000\u0000D\u01ff"+
		"\u0001\u0000\u0000\u0000F\u0203\u0001\u0000\u0000\u0000H\u0205\u0001\u0000"+
		"\u0000\u0000J\u0207\u0001\u0000\u0000\u0000L\u020f\u0001\u0000\u0000\u0000"+
		"N\u0217\u0001\u0000\u0000\u0000P\u021f\u0001\u0000\u0000\u0000R\u0223"+
		"\u0001\u0000\u0000\u0000T\u023c\u0001\u0000\u0000\u0000V\u0257\u0001\u0000"+
		"\u0000\u0000X\u0259\u0001\u0000\u0000\u0000Z\u025d\u0001\u0000\u0000\u0000"+
		"\\\u0269\u0001\u0000\u0000\u0000^\u0272\u0001\u0000\u0000\u0000`\u028b"+
		"\u0001\u0000\u0000\u0000b\u028f\u0001\u0000\u0000\u0000d\u0292\u0001\u0000"+
		"\u0000\u0000f\u0298\u0001\u0000\u0000\u0000h\u02a1\u0001\u0000\u0000\u0000"+
		"j\u02bf\u0001\u0000\u0000\u0000l\u02c1\u0001\u0000\u0000\u0000n\u02cc"+
		"\u0001\u0000\u0000\u0000p\u02d3\u0001\u0000\u0000\u0000r\u02d7\u0001\u0000"+
		"\u0000\u0000t\u02da\u0001\u0000\u0000\u0000v\u02e5\u0001\u0000\u0000\u0000"+
		"x\u02e7\u0001\u0000\u0000\u0000z|\u0003\u0002\u0001\u0000{z\u0001\u0000"+
		"\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000"+
		"}~\u0001\u0000\u0000\u0000~\u0001\u0001\u0000\u0000\u0000\u007f}\u0001"+
		"\u0000\u0000\u0000\u0080\u0096\u0003\u0004\u0002\u0000\u0081\u0096\u0003"+
		"\u0006\u0003\u0000\u0082\u0096\u0003\u000e\u0007\u0000\u0083\u0096\u0003"+
		"8\u001c\u0000\u0084\u0096\u0003<\u001e\u0000\u0085\u0096\u0003>\u001f"+
		"\u0000\u0086\u0096\u0003B!\u0000\u0087\u0096\u0003D\"\u0000\u0088\u0096"+
		"\u0003F#\u0000\u0089\u0096\u0003Z-\u0000\u008a\u0096\u0003\\.\u0000\u008b"+
		"\u0096\u0003^/\u0000\u008c\u0096\u0003d2\u0000\u008d\u0096\u0003f3\u0000"+
		"\u008e\u0096\u0003h4\u0000\u008f\u0096\u0003l6\u0000\u0090\u0096\u0003"+
		"n7\u0000\u0091\u0096\u0003p8\u0000\u0092\u0096\u0003r9\u0000\u0093\u0096"+
		"\u0003t:\u0000\u0094\u0096\u0003x<\u0000\u0095\u0080\u0001\u0000\u0000"+
		"\u0000\u0095\u0081\u0001\u0000\u0000\u0000\u0095\u0082\u0001\u0000\u0000"+
		"\u0000\u0095\u0083\u0001\u0000\u0000\u0000\u0095\u0084\u0001\u0000\u0000"+
		"\u0000\u0095\u0085\u0001\u0000\u0000\u0000\u0095\u0086\u0001\u0000\u0000"+
		"\u0000\u0095\u0087\u0001\u0000\u0000\u0000\u0095\u0088\u0001\u0000\u0000"+
		"\u0000\u0095\u0089\u0001\u0000\u0000\u0000\u0095\u008a\u0001\u0000\u0000"+
		"\u0000\u0095\u008b\u0001\u0000\u0000\u0000\u0095\u008c\u0001\u0000\u0000"+
		"\u0000\u0095\u008d\u0001\u0000\u0000\u0000\u0095\u008e\u0001\u0000\u0000"+
		"\u0000\u0095\u008f\u0001\u0000\u0000\u0000\u0095\u0090\u0001\u0000\u0000"+
		"\u0000\u0095\u0091\u0001\u0000\u0000\u0000\u0095\u0092\u0001\u0000\u0000"+
		"\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0094\u0001\u0000\u0000"+
		"\u0000\u0096\u0003\u0001\u0000\u0000\u0000\u0097\u0098\u0007\u0000\u0000"+
		"\u0000\u0098\u0099\u00052\u0000\u0000\u0099\u009a\u0005<\u0000\u0000\u009a"+
		"\u009e\u0003H$\u0000\u009b\u009c\u0007\u0000\u0000\u0000\u009c\u009e\u0005"+
		"2\u0000\u0000\u009d\u0097\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000"+
		"\u0000\u0000\u009e\u0005\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u0005"+
		"\u0000\u0000\u00a0\u00a1\u00052\u0000\u0000\u00a1\u00a3\u0005_\u0000\u0000"+
		"\u00a2\u00a4\u0003\b\u0004\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0005`\u0000\u0000\u00a6\u00a7\u0003Z-\u0000\u00a7\u0007\u0001"+
		"\u0000\u0000\u0000\u00a8\u00ad\u0003\n\u0005\u0000\u00a9\u00aa\u0005\\"+
		"\u0000\u0000\u00aa\u00ac\u0003\n\u0005\u0000\u00ab\u00a9\u0001\u0000\u0000"+
		"\u0000\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\t\u0001\u0000\u0000\u0000"+
		"\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0\u00b5\u0003F#\u0000\u00b1\u00b2"+
		"\u00052\u0000\u0000\u00b2\u00b3\u0005e\u0000\u0000\u00b3\u00b5\u0003\f"+
		"\u0006\u0000\u00b4\u00b0\u0001\u0000\u0000\u0000\u00b4\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b5\u000b\u0001\u0000\u0000\u0000\u00b6\u00b7\u0007\u0001"+
		"\u0000\u0000\u00b7\r\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005\t\u0000"+
		"\u0000\u00b9\u00bc\u00052\u0000\u0000\u00ba\u00bb\u0005\f\u0000\u0000"+
		"\u00bb\u00bd\u00052\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bd\u00c7\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0005\r\u0000\u0000\u00bf\u00c4\u00052\u0000\u0000\u00c0\u00c1"+
		"\u0005\\\u0000\u0000\u00c1\u00c3\u00052\u0000\u0000\u00c2\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u00be\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001"+
		"\u0000\u0000\u0000\u00c9\u00ca\u0005a\u0000\u0000\u00ca\u00cb\u0003\u0010"+
		"\b\u0000\u00cb\u00cc\u0005b\u0000\u0000\u00cc\u000f\u0001\u0000\u0000"+
		"\u0000\u00cd\u00cf\u0003\u0012\t\u0000\u00ce\u00d0\u0005[\u0000\u0000"+
		"\u00cf\u00ce\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000"+
		"\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1\u00cd\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u0011\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d8\u0005\u0015\u0000\u0000"+
		"\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000"+
		"\u00d8\u00da\u0001\u0000\u0000\u0000\u00d9\u00db\u0005\u0016\u0000\u0000"+
		"\u00da\u00d9\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000"+
		"\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc\u00de\u0005\u0017\u0000\u0000"+
		"\u00dd\u00dc\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000"+
		"\u00de\u00e0\u0001\u0000\u0000\u0000\u00df\u00e1\u0005\u0018\u0000\u0000"+
		"\u00e0\u00df\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e3\u00052\u0000\u0000\u00e3"+
		"\u00e4\u0005e\u0000\u0000\u00e4\u00eb\u0003\f\u0006\u0000\u00e5\u00eb"+
		"\u00034\u001a\u0000\u00e6\u00eb\u0003\u0004\u0002\u0000\u00e7\u00eb\u0003"+
		"F#\u0000\u00e8\u00eb\u00036\u001b\u0000\u00e9\u00eb\u00038\u001c\u0000"+
		"\u00ea\u00d7\u0001\u0000\u0000\u0000\u00ea\u00e5\u0001\u0000\u0000\u0000"+
		"\u00ea\u00e6\u0001\u0000\u0000\u0000\u00ea\u00e7\u0001\u0000\u0000\u0000"+
		"\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000"+
		"\u00eb\u0013\u0001\u0000\u0000\u0000\u00ec\u00f1\u0003\u0016\u000b\u0000"+
		"\u00ed\u00ee\u0005\\\u0000\u0000\u00ee\u00f0\u0003\u0016\u000b\u0000\u00ef"+
		"\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f3\u0001\u0000\u0000\u0000\u00f1"+
		"\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f6\u0005\\\u0000\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f5\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f6\u00f8\u0001\u0000\u0000\u0000\u00f7\u00ec"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u0015"+
		"\u0001\u0000\u0000\u0000\u00f9\u00fe\u0003\u0018\f\u0000\u00fa\u00fb\u0005"+
		"2\u0000\u0000\u00fb\u00fc\u0005e\u0000\u0000\u00fc\u00fe\u0003H$\u0000"+
		"\u00fd\u00f9\u0001\u0000\u0000\u0000\u00fd\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fe\u0017\u0001\u0000\u0000\u0000\u00ff\u0103\u00051\u0000\u0000\u0100"+
		"\u0102\u0005~\u0000\u0000\u0101\u0100\u0001\u0000\u0000\u0000\u0102\u0105"+
		"\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0104"+
		"\u0001\u0000\u0000\u0000\u0104\u0109\u0001\u0000\u0000\u0000\u0105\u0103"+
		"\u0001\u0000\u0000\u0000\u0106\u0108\u0003\u001a\r\u0000\u0107\u0106\u0001"+
		"\u0000\u0000\u0000\u0108\u010b\u0001\u0000\u0000\u0000\u0109\u0107\u0001"+
		"\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u010f\u0001"+
		"\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010c\u010e\u0005"+
		"~\u0000\u0000\u010d\u010c\u0001\u0000\u0000\u0000\u010e\u0111\u0001\u0000"+
		"\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000"+
		"\u0000\u0000\u0110\u0112\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000"+
		"\u0000\u0000\u0112\u0113\u0005w\u0000\u0000\u0113\u0019\u0001\u0000\u0000"+
		"\u0000\u0114\u0116\u0003,\u0016\u0000\u0115\u0114\u0001\u0000\u0000\u0000"+
		"\u0116\u0119\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000"+
		"\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u011a\u0001\u0000\u0000\u0000"+
		"\u0119\u0117\u0001\u0000\u0000\u0000\u011a\u011e\u0003\u001c\u000e\u0000"+
		"\u011b\u011d\u0003,\u0016\u0000\u011c\u011b\u0001\u0000\u0000\u0000\u011d"+
		"\u0120\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011e"+
		"\u011f\u0001\u0000\u0000\u0000\u011f\u001b\u0001\u0000\u0000\u0000\u0120"+
		"\u011e\u0001\u0000\u0000\u0000\u0121\u0122\u0005\u0081\u0000\u0000\u0122"+
		"\u0127\u0005\u008f\u0000\u0000\u0123\u0126\u0003\u001e\u000f\u0000\u0124"+
		"\u0126\u0003 \u0010\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0125\u0124"+
		"\u0001\u0000\u0000\u0000\u0126\u0129\u0001\u0000\u0000\u0000\u0127\u0125"+
		"\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u0132"+
		"\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u012a\u012b"+
		"\u0005\u0084\u0000\u0000\u012b\u012c\u0003*\u0015\u0000\u012c\u012d\u0005"+
		"\u0081\u0000\u0000\u012d\u012e\u0005\u0086\u0000\u0000\u012e\u012f\u0005"+
		"\u008f\u0000\u0000\u012f\u0130\u0005\u0084\u0000\u0000\u0130\u0133\u0001"+
		"\u0000\u0000\u0000\u0131\u0133\u0005\u0085\u0000\u0000\u0132\u012a\u0001"+
		"\u0000\u0000\u0000\u0132\u0131\u0001\u0000\u0000\u0000\u0133\u001d\u0001"+
		"\u0000\u0000\u0000\u0134\u0137\u0005\u008f\u0000\u0000\u0135\u0136\u0005"+
		"\u008e\u0000\u0000\u0136\u0138\u0005\u0090\u0000\u0000\u0137\u0135\u0001"+
		"\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u001f\u0001"+
		"\u0000\u0000\u0000\u0139\u013e\u0003\"\u0011\u0000\u013a\u013e\u0003$"+
		"\u0012\u0000\u013b\u013e\u0003&\u0013\u0000\u013c\u013e\u0003(\u0014\u0000"+
		"\u013d\u0139\u0001\u0000\u0000\u0000\u013d\u013a\u0001\u0000\u0000\u0000"+
		"\u013d\u013b\u0001\u0000\u0000\u0000\u013d\u013c\u0001\u0000\u0000\u0000"+
		"\u013e!\u0001\u0000\u0000\u0000\u013f\u0140\u0005\u0088\u0000\u0000\u0140"+
		"\u0141\u0005\u008f\u0000\u0000\u0141\u0144\u0005\u0089\u0000\u0000\u0142"+
		"\u0143\u0005\u008e\u0000\u0000\u0143\u0145\u0005\u0090\u0000\u0000\u0144"+
		"\u0142\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145"+
		"#\u0001\u0000\u0000\u0000\u0146\u0147\u0005\u008a\u0000\u0000\u0147\u0148"+
		"\u0005\u008f\u0000\u0000\u0148\u014b\u0005\u008b\u0000\u0000\u0149\u014a"+
		"\u0005\u008e\u0000\u0000\u014a\u014c\u0005\u0090\u0000\u0000\u014b\u0149"+
		"\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c%\u0001"+
		"\u0000\u0000\u0000\u014d\u0150\u0005\u008c\u0000\u0000\u014e\u014f\u0005"+
		"\u008e\u0000\u0000\u014f\u0151\u0005\u0090\u0000\u0000\u0150\u014e\u0001"+
		"\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\'\u0001\u0000"+
		"\u0000\u0000\u0152\u0155\u0005\u008d\u0000\u0000\u0153\u0154\u0005\u008e"+
		"\u0000\u0000\u0154\u0156\u0005\u0090\u0000\u0000\u0155\u0153\u0001\u0000"+
		"\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156)\u0001\u0000\u0000"+
		"\u0000\u0157\u0159\u00030\u0018\u0000\u0158\u0157\u0001\u0000\u0000\u0000"+
		"\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u0164\u0001\u0000\u0000\u0000"+
		"\u015a\u015e\u0003\u001c\u000e\u0000\u015b\u015e\u0005{\u0000\u0000\u015c"+
		"\u015e\u0003.\u0017\u0000\u015d\u015a\u0001\u0000\u0000\u0000\u015d\u015b"+
		"\u0001\u0000\u0000\u0000\u015d\u015c\u0001\u0000\u0000\u0000\u015e\u0160"+
		"\u0001\u0000\u0000\u0000\u015f\u0161\u00030\u0018\u0000\u0160\u015f\u0001"+
		"\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u0163\u0001"+
		"\u0000\u0000\u0000\u0162\u015d\u0001\u0000\u0000\u0000\u0163\u0166\u0001"+
		"\u0000\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0164\u0165\u0001"+
		"\u0000\u0000\u0000\u0165+\u0001\u0000\u0000\u0000\u0166\u0164\u0001\u0000"+
		"\u0000\u0000\u0167\u016a\u0003.\u0017\u0000\u0168\u016a\u0005~\u0000\u0000"+
		"\u0169\u0167\u0001\u0000\u0000\u0000\u0169\u0168\u0001\u0000\u0000\u0000"+
		"\u016a-\u0001\u0000\u0000\u0000\u016b\u016c\u0007\u0002\u0000\u0000\u016c"+
		"/\u0001\u0000\u0000\u0000\u016d\u0171\u00032\u0019\u0000\u016e\u0171\u0005"+
		"\u0083\u0000\u0000\u016f\u0171\u0005~\u0000\u0000\u0170\u016d\u0001\u0000"+
		"\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0170\u016f\u0001\u0000"+
		"\u0000\u0000\u01711\u0001\u0000\u0000\u0000\u0172\u0174\u0005\u0083\u0000"+
		"\u0000\u0173\u0172\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000"+
		"\u0000\u0174\u0176\u0001\u0000\u0000\u0000\u0175\u0177\u0005~\u0000\u0000"+
		"\u0176\u0175\u0001\u0000\u0000\u0000\u0176\u0177\u0001\u0000\u0000\u0000"+
		"\u0177\u0178\u0001\u0000\u0000\u0000\u0178\u017a\u0005\u0082\u0000\u0000"+
		"\u0179\u017b\u0003F#\u0000\u017a\u0179\u0001\u0000\u0000\u0000\u017a\u017b"+
		"\u0001\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c\u017e"+
		"\u0005p\u0000\u0000\u017d\u017f\u0005~\u0000\u0000\u017e\u017d\u0001\u0000"+
		"\u0000\u0000\u017e\u017f\u0001\u0000\u0000\u0000\u017f\u0181\u0001\u0000"+
		"\u0000\u0000\u0180\u0182\u0005\u0083\u0000\u0000\u0181\u0180\u0001\u0000"+
		"\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u01823\u0001\u0000\u0000"+
		"\u0000\u0183\u0184\u0005-\u0000\u0000\u0184\u0186\u0005_\u0000\u0000\u0185"+
		"\u0187\u0003\b\u0004\u0000\u0186\u0185\u0001\u0000\u0000\u0000\u0186\u0187"+
		"\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188\u0189"+
		"\u0005`\u0000\u0000\u0189\u018a\u0003Z-\u0000\u018a5\u0001\u0000\u0000"+
		"\u0000\u018b\u018c\u00052\u0000\u0000\u018c\u018e\u0005_\u0000\u0000\u018d"+
		"\u018f\u0003\b\u0004\u0000\u018e\u018d\u0001\u0000\u0000\u0000\u018e\u018f"+
		"\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190\u0192"+
		"\u0005`\u0000\u0000\u0191\u0193\u0003\f\u0006\u0000\u0192\u0191\u0001"+
		"\u0000\u0000\u0000\u0192\u0193\u0001\u0000\u0000\u0000\u0193\u0194\u0001"+
		"\u0000\u0000\u0000\u0194\u0195\u0003Z-\u0000\u01957\u0001\u0000\u0000"+
		"\u0000\u0196\u0197\u0005\u000b\u0000\u0000\u0197\u0198\u00052\u0000\u0000"+
		"\u0198\u0199\u0005a\u0000\u0000\u0199\u019e\u0003:\u001d\u0000\u019a\u019b"+
		"\u0005\\\u0000\u0000\u019b\u019d\u0003:\u001d\u0000\u019c\u019a\u0001"+
		"\u0000\u0000\u0000\u019d\u01a0\u0001\u0000\u0000\u0000\u019e\u019c\u0001"+
		"\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a1\u0001"+
		"\u0000\u0000\u0000\u01a0\u019e\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005"+
		"b\u0000\u0000\u01a29\u0001\u0000\u0000\u0000\u01a3\u01a6\u00052\u0000"+
		"\u0000\u01a4\u01a5\u0005<\u0000\u0000\u01a5\u01a7\u0003H$\u0000\u01a6"+
		"\u01a4\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7"+
		";\u0001\u0000\u0000\u0000\u01a8\u01a9\u0005.\u0000\u0000\u01a9\u01aa\u0005"+
		"2\u0000\u0000\u01aa\u01ae\u0005a\u0000\u0000\u01ab\u01ad\u0003@ \u0000"+
		"\u01ac\u01ab\u0001\u0000\u0000\u0000\u01ad\u01b0\u0001\u0000\u0000\u0000"+
		"\u01ae\u01ac\u0001\u0000\u0000\u0000\u01ae\u01af\u0001\u0000\u0000\u0000"+
		"\u01af\u01b1\u0001\u0000\u0000\u0000\u01b0\u01ae\u0001\u0000\u0000\u0000"+
		"\u01b1\u01b2\u0005b\u0000\u0000\u01b2=\u0001\u0000\u0000\u0000\u01b3\u01b4"+
		"\u0005/\u0000\u0000\u01b4\u01b5\u00052\u0000\u0000\u01b5\u01b9\u0005a"+
		"\u0000\u0000\u01b6\u01b8\u00036\u001b\u0000\u01b7\u01b6\u0001\u0000\u0000"+
		"\u0000\u01b8\u01bb\u0001\u0000\u0000\u0000\u01b9\u01b7\u0001\u0000\u0000"+
		"\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bc\u0001\u0000\u0000"+
		"\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bc\u01bd\u0005b\u0000\u0000"+
		"\u01bd?\u0001\u0000\u0000\u0000\u01be\u01bf\u00050\u0000\u0000\u01bf\u01c0"+
		"\u00052\u0000\u0000\u01c0\u01c1\u0005e\u0000\u0000\u01c1\u01c2\u0003\f"+
		"\u0006\u0000\u01c2\u01c3\u0005[\u0000\u0000\u01c3A\u0001\u0000\u0000\u0000"+
		"\u01c4\u01c6\u0005\u000f\u0000\u0000\u01c5\u01c7\u0005a\u0000\u0000\u01c6"+
		"\u01c5\u0001\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7"+
		"\u01c9\u0001\u0000\u0000\u0000\u01c8\u01ca\u0005\u0092\u0000\u0000\u01c9"+
		"\u01c8\u0001\u0000\u0000\u0000\u01c9\u01ca\u0001\u0000\u0000\u0000\u01ca"+
		"\u01cc\u0001\u0000\u0000\u0000\u01cb\u01cd\u0005\u0011\u0000\u0000\u01cc"+
		"\u01cb\u0001\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000\u0000\u01cd"+
		"\u01ea\u0001\u0000\u0000\u0000\u01ce\u01e5\u00053\u0000\u0000\u01cf\u01d2"+
		"\u00052\u0000\u0000\u01d0\u01d1\u0005\u0011\u0000\u0000\u01d1\u01d3\u0005"+
		"2\u0000\u0000\u01d2\u01d0\u0001\u0000\u0000\u0000\u01d2\u01d3\u0001\u0000"+
		"\u0000\u0000\u01d3\u01d8\u0001\u0000\u0000\u0000\u01d4\u01d5\u0005\\\u0000"+
		"\u0000\u01d5\u01d7\u00052\u0000\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000"+
		"\u01d7\u01da\u0001\u0000\u0000\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000"+
		"\u01d8\u01d9\u0001\u0000\u0000\u0000\u01d9\u01dd\u0001\u0000\u0000\u0000"+
		"\u01da\u01d8\u0001\u0000\u0000\u0000\u01db\u01dc\u0005\u0011\u0000\u0000"+
		"\u01dc\u01de\u00052\u0000\u0000\u01dd\u01db\u0001\u0000\u0000\u0000\u01dd"+
		"\u01de\u0001\u0000\u0000\u0000\u01de\u01e0\u0001\u0000\u0000\u0000\u01df"+
		"\u01e1\u0005b\u0000\u0000\u01e0\u01df\u0001\u0000\u0000\u0000\u01e0\u01e1"+
		"\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2\u01e3"+
		"\u0005\u0012\u0000\u0000\u01e3\u01e5\u00053\u0000\u0000\u01e4\u01ce\u0001"+
		"\u0000\u0000\u0000\u01e4\u01cf\u0001\u0000\u0000\u0000\u01e5\u01e7\u0001"+
		"\u0000\u0000\u0000\u01e6\u01e8\u0005[\u0000\u0000\u01e7\u01e6\u0001\u0000"+
		"\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8\u01ea\u0001\u0000"+
		"\u0000\u0000\u01e9\u01c4\u0001\u0000\u0000\u0000\u01e9\u01e4\u0001\u0000"+
		"\u0000\u0000\u01eaC\u0001\u0000\u0000\u0000\u01eb\u01ec\u0005\u0010\u0000"+
		"\u0000\u01ec\u01ee\u0003\u0004\u0002\u0000\u01ed\u01ef\u0005[\u0000\u0000"+
		"\u01ee\u01ed\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001\u0000\u0000\u0000"+
		"\u01ef\u0200\u0001\u0000\u0000\u0000\u01f0\u01f1\u0005\u0010\u0000\u0000"+
		"\u01f1\u01f3\u0003\u0006\u0003\u0000\u01f2\u01f4\u0005[\u0000\u0000\u01f3"+
		"\u01f2\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4"+
		"\u0200\u0001\u0000\u0000\u0000\u01f5\u01f6\u0005\u0010\u0000\u0000\u01f6"+
		"\u01f8\u0003\u000e\u0007\u0000\u01f7\u01f9\u0005[\u0000\u0000\u01f8\u01f7"+
		"\u0001\u0000\u0000\u0000\u01f8\u01f9\u0001\u0000\u0000\u0000\u01f9\u0200"+
		"\u0001\u0000\u0000\u0000\u01fa\u01fb\u0005\u0010\u0000\u0000\u01fb\u01fd"+
		"\u00052\u0000\u0000\u01fc\u01fe\u0005[\u0000\u0000\u01fd\u01fc\u0001\u0000"+
		"\u0000\u0000\u01fd\u01fe\u0001\u0000\u0000\u0000\u01fe\u0200\u0001\u0000"+
		"\u0000\u0000\u01ff\u01eb\u0001\u0000\u0000\u0000\u01ff\u01f0\u0001\u0000"+
		"\u0000\u0000\u01ff\u01f5\u0001\u0000\u0000\u0000\u01ff\u01fa\u0001\u0000"+
		"\u0000\u0000\u0200E\u0001\u0000\u0000\u0000\u0201\u0204\u0003H$\u0000"+
		"\u0202\u0204\u0003b1\u0000\u0203\u0201\u0001\u0000\u0000\u0000\u0203\u0202"+
		"\u0001\u0000\u0000\u0000\u0204G\u0001\u0000\u0000\u0000\u0205\u0206\u0003"+
		"J%\u0000\u0206I\u0001\u0000\u0000\u0000\u0207\u020d\u0003L&\u0000\u0208"+
		"\u0209\u0005f\u0000\u0000\u0209\u020a\u0003H$\u0000\u020a\u020b\u0005"+
		"e\u0000\u0000\u020b\u020c\u0003H$\u0000\u020c\u020e\u0001\u0000\u0000"+
		"\u0000\u020d\u0208\u0001\u0000\u0000\u0000\u020d\u020e\u0001\u0000\u0000"+
		"\u0000\u020eK\u0001\u0000\u0000\u0000\u020f\u0214\u0003N\'\u0000\u0210"+
		"\u0211\u0007\u0003\u0000\u0000\u0211\u0213\u0003N\'\u0000\u0212\u0210"+
		"\u0001\u0000\u0000\u0000\u0213\u0216\u0001\u0000\u0000\u0000\u0214\u0212"+
		"\u0001\u0000\u0000\u0000\u0214\u0215\u0001\u0000\u0000\u0000\u0215M\u0001"+
		"\u0000\u0000\u0000\u0216\u0214\u0001\u0000\u0000\u0000\u0217\u021c\u0003"+
		"T*\u0000\u0218\u0219\u0007\u0004\u0000\u0000\u0219\u021b\u0003T*\u0000"+
		"\u021a\u0218\u0001\u0000\u0000\u0000\u021b\u021e\u0001\u0000\u0000\u0000"+
		"\u021c\u021a\u0001\u0000\u0000\u0000\u021c\u021d\u0001\u0000\u0000\u0000"+
		"\u021dO\u0001\u0000\u0000\u0000\u021e\u021c\u0001\u0000\u0000\u0000\u021f"+
		"\u0220\u0005c\u0000\u0000\u0220\u0221\u0003V+\u0000\u0221\u0222\u0005"+
		"d\u0000\u0000\u0222Q\u0001\u0000\u0000\u0000\u0223\u0224\u0005a\u0000"+
		"\u0000\u0224\u0225\u0003\u0014\n\u0000\u0225\u0226\u0005b\u0000\u0000"+
		"\u0226S\u0001\u0000\u0000\u0000\u0227\u0228\u0006*\uffff\uffff\u0000\u0228"+
		"\u023d\u00052\u0000\u0000\u0229\u023d\u00053\u0000\u0000\u022a\u023d\u0005"+
		"\u0014\u0000\u0000\u022b\u023d\u00055\u0000\u0000\u022c\u023d\u00059\u0000"+
		"\u0000\u022d\u023d\u0005:\u0000\u0000\u022e\u023d\u0005;\u0000\u0000\u022f"+
		"\u0230\u0005_\u0000\u0000\u0230\u0231\u0003H$\u0000\u0231\u0232\u0005"+
		"`\u0000\u0000\u0232\u023d\u0001\u0000\u0000\u0000\u0233\u023d\u0003R)"+
		"\u0000\u0234\u023d\u0003P(\u0000\u0235\u0236\u0005\u0013\u0000\u0000\u0236"+
		"\u0237\u00052\u0000\u0000\u0237\u0239\u0005_\u0000\u0000\u0238\u023a\u0003"+
		"V+\u0000\u0239\u0238\u0001\u0000\u0000\u0000\u0239\u023a\u0001\u0000\u0000"+
		"\u0000\u023a\u023b\u0001\u0000\u0000\u0000\u023b\u023d\u0005`\u0000\u0000"+
		"\u023c\u0227\u0001\u0000\u0000\u0000\u023c\u0229\u0001\u0000\u0000\u0000"+
		"\u023c\u022a\u0001\u0000\u0000\u0000\u023c\u022b\u0001\u0000\u0000\u0000"+
		"\u023c\u022c\u0001\u0000\u0000\u0000\u023c\u022d\u0001\u0000\u0000\u0000"+
		"\u023c\u022e\u0001\u0000\u0000\u0000\u023c\u022f\u0001\u0000\u0000\u0000"+
		"\u023c\u0233\u0001\u0000\u0000\u0000\u023c\u0234\u0001\u0000\u0000\u0000"+
		"\u023c\u0235\u0001\u0000\u0000\u0000\u023d\u0249\u0001\u0000\u0000\u0000"+
		"\u023e\u023f\n\u0002\u0000\u0000\u023f\u0240\u0005]\u0000\u0000\u0240"+
		"\u0248\u0003T*\u0003\u0241\u0242\n\u0003\u0000\u0000\u0242\u0244\u0005"+
		"_\u0000\u0000\u0243\u0245\u0003V+\u0000\u0244\u0243\u0001\u0000\u0000"+
		"\u0000\u0244\u0245\u0001\u0000\u0000\u0000\u0245\u0246\u0001\u0000\u0000"+
		"\u0000\u0246\u0248\u0005`\u0000\u0000\u0247\u023e\u0001\u0000\u0000\u0000"+
		"\u0247\u0241\u0001\u0000\u0000\u0000\u0248\u024b\u0001\u0000\u0000\u0000"+
		"\u0249\u0247\u0001\u0000\u0000\u0000\u0249\u024a\u0001\u0000\u0000\u0000"+
		"\u024aU\u0001\u0000\u0000\u0000\u024b\u0249\u0001\u0000\u0000\u0000\u024c"+
		"\u0251\u0003H$\u0000\u024d\u024e\u0005\\\u0000\u0000\u024e\u0250\u0003"+
		"H$\u0000\u024f\u024d\u0001\u0000\u0000\u0000\u0250\u0253\u0001\u0000\u0000"+
		"\u0000\u0251\u024f\u0001\u0000\u0000\u0000\u0251\u0252\u0001\u0000\u0000"+
		"\u0000\u0252\u0255\u0001\u0000\u0000\u0000\u0253\u0251\u0001\u0000\u0000"+
		"\u0000\u0254\u0256\u0005\\\u0000\u0000\u0255\u0254\u0001\u0000\u0000\u0000"+
		"\u0255\u0256\u0001\u0000\u0000\u0000\u0256\u0258\u0001\u0000\u0000\u0000"+
		"\u0257\u024c\u0001\u0000\u0000\u0000\u0257\u0258\u0001\u0000\u0000\u0000"+
		"\u0258W\u0001\u0000\u0000\u0000\u0259\u025a\u00052\u0000\u0000\u025a\u025b"+
		"\u0005<\u0000\u0000\u025b\u025c\u0003H$\u0000\u025cY\u0001\u0000\u0000"+
		"\u0000\u025d\u0261\u0005a\u0000\u0000\u025e\u0260\u0003\u0002\u0001\u0000"+
		"\u025f\u025e\u0001\u0000\u0000\u0000\u0260\u0263\u0001\u0000\u0000\u0000"+
		"\u0261\u025f\u0001\u0000\u0000\u0000\u0261\u0262\u0001\u0000\u0000\u0000"+
		"\u0262\u0265\u0001\u0000\u0000\u0000\u0263\u0261\u0001\u0000\u0000\u0000"+
		"\u0264\u0266\u0005[\u0000\u0000\u0265\u0264\u0001\u0000\u0000\u0000\u0265"+
		"\u0266\u0001\u0000\u0000\u0000\u0266\u0267\u0001\u0000\u0000\u0000\u0267"+
		"\u0268\u0005b\u0000\u0000\u0268[\u0001\u0000\u0000\u0000\u0269\u026a\u0005"+
		"\u0001\u0000\u0000\u026a\u026b\u0005_\u0000\u0000\u026b\u026c\u0003H$"+
		"\u0000\u026c\u026d\u0005`\u0000\u0000\u026d\u0270\u0003\u0002\u0001\u0000"+
		"\u026e\u026f\u0005\u0002\u0000\u0000\u026f\u0271\u0003\u0002\u0001\u0000"+
		"\u0270\u026e\u0001\u0000\u0000\u0000\u0270\u0271\u0001\u0000\u0000\u0000"+
		"\u0271]\u0001\u0000\u0000\u0000\u0272\u0273\u0005\u0003\u0000\u0000\u0273"+
		"\u0284\u0005_\u0000\u0000\u0274\u0285\u0003`0\u0000\u0275\u0279\u0003"+
		"\u0004\u0002\u0000\u0276\u0279\u0003X,\u0000\u0277\u0279\u0003H$\u0000"+
		"\u0278\u0275\u0001\u0000\u0000\u0000\u0278\u0276\u0001\u0000\u0000\u0000"+
		"\u0278\u0277\u0001\u0000\u0000\u0000\u0278\u0279\u0001\u0000\u0000\u0000"+
		"\u0279\u027a\u0001\u0000\u0000\u0000\u027a\u027c\u0005[\u0000\u0000\u027b"+
		"\u027d\u0003H$\u0000\u027c\u027b\u0001\u0000\u0000\u0000\u027c\u027d\u0001"+
		"\u0000\u0000\u0000\u027d\u027e\u0001\u0000\u0000\u0000\u027e\u0282\u0005"+
		"[\u0000\u0000\u027f\u0283\u0003b1\u0000\u0280\u0283\u0003X,\u0000\u0281"+
		"\u0283\u0003H$\u0000\u0282\u027f\u0001\u0000\u0000\u0000\u0282\u0280\u0001"+
		"\u0000\u0000\u0000\u0282\u0281\u0001\u0000\u0000\u0000\u0282\u0283\u0001"+
		"\u0000\u0000\u0000\u0283\u0285\u0001\u0000\u0000\u0000\u0284\u0274\u0001"+
		"\u0000\u0000\u0000\u0284\u0278\u0001\u0000\u0000\u0000\u0285\u0286\u0001"+
		"\u0000\u0000\u0000\u0286\u0289\u0005`\u0000\u0000\u0287\u028a\u0003Z-"+
		"\u0000\u0288\u028a\u0003F#\u0000\u0289\u0287\u0001\u0000\u0000\u0000\u0289"+
		"\u0288\u0001\u0000\u0000\u0000\u028a_\u0001\u0000\u0000\u0000\u028b\u028c"+
		"\u0003\u0004\u0002\u0000\u028c\u028d\u0005\'\u0000\u0000\u028d\u028e\u0003"+
		"H$\u0000\u028ea\u0001\u0000\u0000\u0000\u028f\u0290\u00052\u0000\u0000"+
		"\u0290\u0291\u0007\u0005\u0000\u0000\u0291c\u0001\u0000\u0000\u0000\u0292"+
		"\u0293\u0005\u0004\u0000\u0000\u0293\u0294\u0005_\u0000\u0000\u0294\u0295"+
		"\u0003H$\u0000\u0295\u0296\u0005`\u0000\u0000\u0296\u0297\u0003\u0002"+
		"\u0001\u0000\u0297e\u0001\u0000\u0000\u0000\u0298\u0299\u0005$\u0000\u0000"+
		"\u0299\u029a\u0003\u0002\u0001\u0000\u029a\u029b\u0005\u0004\u0000\u0000"+
		"\u029b\u029c\u0005_\u0000\u0000\u029c\u029d\u0003H$\u0000\u029d\u029f"+
		"\u0005`\u0000\u0000\u029e\u02a0\u0005[\u0000\u0000\u029f\u029e\u0001\u0000"+
		"\u0000\u0000\u029f\u02a0\u0001\u0000\u0000\u0000\u02a0g\u0001\u0000\u0000"+
		"\u0000\u02a1\u02a2\u0005\u001f\u0000\u0000\u02a2\u02a3\u0005_\u0000\u0000"+
		"\u02a3\u02a4\u0003H$\u0000\u02a4\u02a5\u0005`\u0000\u0000\u02a5\u02a9"+
		"\u0005a\u0000\u0000\u02a6\u02a8\u0003j5\u0000\u02a7\u02a6\u0001\u0000"+
		"\u0000\u0000\u02a8\u02ab\u0001\u0000\u0000\u0000\u02a9\u02a7\u0001\u0000"+
		"\u0000\u0000\u02a9\u02aa\u0001\u0000\u0000\u0000\u02aa\u02ac\u0001\u0000"+
		"\u0000\u0000\u02ab\u02a9\u0001\u0000\u0000\u0000\u02ac\u02ad\u0005b\u0000"+
		"\u0000\u02adi\u0001\u0000\u0000\u0000\u02ae\u02af\u0005 \u0000\u0000\u02af"+
		"\u02b0\u0003H$\u0000\u02b0\u02b4\u0005e\u0000\u0000\u02b1\u02b3\u0003"+
		"\u0002\u0001\u0000\u02b2\u02b1\u0001\u0000\u0000\u0000\u02b3\u02b6\u0001"+
		"\u0000\u0000\u0000\u02b4\u02b2\u0001\u0000\u0000\u0000\u02b4\u02b5\u0001"+
		"\u0000\u0000\u0000\u02b5\u02c0\u0001\u0000\u0000\u0000\u02b6\u02b4\u0001"+
		"\u0000\u0000\u0000\u02b7\u02b8\u0005!\u0000\u0000\u02b8\u02bc\u0005e\u0000"+
		"\u0000\u02b9\u02bb\u0003\u0002\u0001\u0000\u02ba\u02b9\u0001\u0000\u0000"+
		"\u0000\u02bb\u02be\u0001\u0000\u0000\u0000\u02bc\u02ba\u0001\u0000\u0000"+
		"\u0000\u02bc\u02bd\u0001\u0000\u0000\u0000\u02bd\u02c0\u0001\u0000\u0000"+
		"\u0000\u02be\u02bc\u0001\u0000\u0000\u0000\u02bf\u02ae\u0001\u0000\u0000"+
		"\u0000\u02bf\u02b7\u0001\u0000\u0000\u0000\u02c0k\u0001\u0000\u0000\u0000"+
		"\u02c1\u02c2\u0005\u001b\u0000\u0000\u02c2\u02c3\u0003Z-\u0000\u02c3\u02c4"+
		"\u0005\u001c\u0000\u0000\u02c4\u02c5\u0005_\u0000\u0000\u02c5\u02c6\u0005"+
		"2\u0000\u0000\u02c6\u02c7\u0005`\u0000\u0000\u02c7\u02ca\u0003Z-\u0000"+
		"\u02c8\u02c9\u0005\u001d\u0000\u0000\u02c9\u02cb\u0003Z-\u0000\u02ca\u02c8"+
		"\u0001\u0000\u0000\u0000\u02ca\u02cb\u0001\u0000\u0000\u0000\u02cbm\u0001"+
		"\u0000\u0000\u0000\u02cc\u02ce\u0005\u0006\u0000\u0000\u02cd\u02cf\u0003"+
		"H$\u0000\u02ce\u02cd\u0001\u0000\u0000\u0000\u02ce\u02cf\u0001\u0000\u0000"+
		"\u0000\u02cf\u02d1\u0001\u0000\u0000\u0000\u02d0\u02d2\u0005[\u0000\u0000"+
		"\u02d1\u02d0\u0001\u0000\u0000\u0000\u02d1\u02d2\u0001\u0000\u0000\u0000"+
		"\u02d2o\u0001\u0000\u0000\u0000\u02d3\u02d5\u0005\"\u0000\u0000\u02d4"+
		"\u02d6\u0005[\u0000\u0000\u02d5\u02d4\u0001\u0000\u0000\u0000\u02d5\u02d6"+
		"\u0001\u0000\u0000\u0000\u02d6q\u0001\u0000\u0000\u0000\u02d7\u02d8\u0005"+
		"#\u0000\u0000\u02d8\u02d9\u0005[\u0000\u0000\u02d9s\u0001\u0000\u0000"+
		"\u0000\u02da\u02db\u0005\u001e\u0000\u0000\u02db\u02dc\u0003H$\u0000\u02dc"+
		"\u02dd\u0005[\u0000\u0000\u02ddu\u0001\u0000\u0000\u0000\u02de\u02df\u0005"+
		"2\u0000\u0000\u02df\u02e0\u0005<\u0000\u0000\u02e0\u02e1\u0003H$\u0000"+
		"\u02e1\u02e2\u0005[\u0000\u0000\u02e2\u02e6\u0001\u0000\u0000\u0000\u02e3"+
		"\u02e4\u00052\u0000\u0000\u02e4\u02e6\u0005[\u0000\u0000\u02e5\u02de\u0001"+
		"\u0000\u0000\u0000\u02e5\u02e3\u0001\u0000\u0000\u0000\u02e6w\u0001\u0000"+
		"\u0000\u0000\u02e7\u02e8\u0005&\u0000\u0000\u02e8\u02ee\u00052\u0000\u0000"+
		"\u02e9\u02eb\u0005_\u0000\u0000\u02ea\u02ec\u0003\b\u0004\u0000\u02eb"+
		"\u02ea\u0001\u0000\u0000\u0000\u02eb\u02ec\u0001\u0000\u0000\u0000\u02ec"+
		"\u02ed\u0001\u0000\u0000\u0000\u02ed\u02ef\u0005`\u0000\u0000\u02ee\u02e9"+
		"\u0001\u0000\u0000\u0000\u02ee\u02ef\u0001\u0000\u0000\u0000\u02efy\u0001"+
		"\u0000\u0000\u0000c}\u0095\u009d\u00a3\u00ad\u00b4\u00bc\u00c4\u00c7\u00cf"+
		"\u00d3\u00d7\u00da\u00dd\u00e0\u00ea\u00f1\u00f5\u00f7\u00fd\u0103\u0109"+
		"\u010f\u0117\u011e\u0125\u0127\u0132\u0137\u013d\u0144\u014b\u0150\u0155"+
		"\u0158\u015d\u0160\u0164\u0169\u0170\u0173\u0176\u017a\u017e\u0181\u0186"+
		"\u018e\u0192\u019e\u01a6\u01ae\u01b9\u01c6\u01c9\u01cc\u01d2\u01d8\u01dd"+
		"\u01e0\u01e4\u01e7\u01e9\u01ee\u01f3\u01f8\u01fd\u01ff\u0203\u020d\u0214"+
		"\u021c\u0239\u023c\u0244\u0247\u0249\u0251\u0255\u0257\u0261\u0265\u0270"+
		"\u0278\u027c\u0282\u0284\u0289\u029f\u02a9\u02b4\u02bc\u02bf\u02ca\u02ce"+
		"\u02d1\u02d5\u02e5\u02eb\u02ee";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}