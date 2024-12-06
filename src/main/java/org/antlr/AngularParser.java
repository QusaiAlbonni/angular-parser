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
		COMPONENT=46, SERVICE=47, PROPERTY=48, ID=49, STRING=50, TEMPLATE_STRING=51, 
		NUMBER=52, HEX_NUMBER=53, OCTAL_NUMBER=54, BINARY_NUMBER=55, BOOLEAN=56, 
		NULL=57, UNDEFINED=58, ASSIGN=59, PLUS=60, MINUS=61, MULTIPLY=62, DIVIDE=63, 
		MODULO=64, POWER=65, EQUAL=66, STRICT_EQUAL=67, NOT_EQUAL=68, STRICT_NOT_EQUAL=69, 
		LESS=70, GREATER=71, LESS_EQUAL=72, GREATER_EQUAL=73, AND=74, OR=75, NOT=76, 
		BITWISE_AND=77, BITWISE_OR=78, BITWISE_XOR=79, BITWISE_NOT=80, SHIFT_LEFT=81, 
		SHIFT_RIGHT=82, UNSIGNED_SHIFT_RIGHT=83, ARROW=84, OPTIONAL_CHAINING=85, 
		NULLISH_COALESCING=86, NULLISH_ASSIGN=87, INCRES=88, DECRES=89, SEMICOLON=90, 
		COMMA=91, DOT=92, ELLIPSIS=93, LPAREN=94, RPAREN=95, LBRACE=96, RBRACE=97, 
		LBRACKET=98, RBRACKET=99, COLON=100, QUESTION=101, PIPE=102, BACKTICK=103, 
		ANY=104, NUMBER_TYPE=105, STRING_TYPE=106, BOOLEAN_TYPE=107, VOID_TYPE=108, 
		UNKNOWN=109, NEVER=110, REGEX=111, WS=112, NEWLINE=113, COMMENT=114, BLOCK_COMMENT=115, 
		ERROR=116, STAR=117;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_variableDeclaration = 2, RULE_functionDeclaration = 3, 
		RULE_parameterList = 4, RULE_parameter = 5, RULE_typeAnnotation = 6, RULE_classDeclaration = 7, 
		RULE_classBody = 8, RULE_classMember = 9, RULE_objectBody = 10, RULE_objectMember = 11, 
		RULE_constructorDeclaration = 12, RULE_methodDeclaration = 13, RULE_enumDeclaration = 14, 
		RULE_enumMember = 15, RULE_componentDeclaration = 16, RULE_serviceDeclaration = 17, 
		RULE_propertyDeclaration = 18, RULE_importStatement = 19, RULE_exportStatement = 20, 
		RULE_expressionStatement = 21, RULE_expression = 22, RULE_conditionalExpression = 23, 
		RULE_logicalExpression = 24, RULE_binaryExpression = 25, RULE_primaryExpression = 26, 
		RULE_argumentList = 27, RULE_assignmentExpression = 28, RULE_blockStatement = 29, 
		RULE_ifStatement = 30, RULE_forStatement = 31, RULE_incrementExpression = 32, 
		RULE_whileStatement = 33, RULE_doWhileStatement = 34, RULE_switchStatement = 35, 
		RULE_caseStatement = 36, RULE_tryCatchStatement = 37, RULE_returnStatement = 38, 
		RULE_breakStatement = 39, RULE_continueStatement = 40, RULE_throwStatement = 41, 
		RULE_readError = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "variableDeclaration", "functionDeclaration", 
			"parameterList", "parameter", "typeAnnotation", "classDeclaration", "classBody", 
			"classMember", "objectBody", "objectMember", "constructorDeclaration", 
			"methodDeclaration", "enumDeclaration", "enumMember", "componentDeclaration", 
			"serviceDeclaration", "propertyDeclaration", "importStatement", "exportStatement", 
			"expressionStatement", "expression", "conditionalExpression", "logicalExpression", 
			"binaryExpression", "primaryExpression", "argumentList", "assignmentExpression", 
			"blockStatement", "ifStatement", "forStatement", "incrementExpression", 
			"whileStatement", "doWhileStatement", "switchStatement", "caseStatement", 
			"tryCatchStatement", "returnStatement", "breakStatement", "continueStatement", 
			"throwStatement", "readError"
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
			null, null, null, "'null'", "'undefined'", "'='", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'**'", "'=='", "'==='", "'!='", "'!=='", "'<'", "'>'", 
			"'<='", "'>='", "'&&'", "'||'", "'!'", "'&'", null, "'^'", "'~'", "'<<'", 
			"'>>'", "'>>>'", "'=>'", "'?.'", "'??'", "'??='", "'++'", "'--'", "';'", 
			"','", "'.'", "'...'", "'('", "')'", "'{'", "'}'", "'['", "']'", "':'", 
			"'?'", null, "'`'", "'any'", "'number'", "'string'", "'boolean'", null, 
			"'unknown'", "'never'"
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
			"SERVICE", "PROPERTY", "ID", "STRING", "TEMPLATE_STRING", "NUMBER", "HEX_NUMBER", 
			"OCTAL_NUMBER", "BINARY_NUMBER", "BOOLEAN", "NULL", "UNDEFINED", "ASSIGN", 
			"PLUS", "MINUS", "MULTIPLY", "DIVIDE", "MODULO", "POWER", "EQUAL", "STRICT_EQUAL", 
			"NOT_EQUAL", "STRICT_NOT_EQUAL", "LESS", "GREATER", "LESS_EQUAL", "GREATER_EQUAL", 
			"AND", "OR", "NOT", "BITWISE_AND", "BITWISE_OR", "BITWISE_XOR", "BITWISE_NOT", 
			"SHIFT_LEFT", "SHIFT_RIGHT", "UNSIGNED_SHIFT_RIGHT", "ARROW", "OPTIONAL_CHAINING", 
			"NULLISH_COALESCING", "NULLISH_ASSIGN", "INCRES", "DECRES", "SEMICOLON", 
			"COMMA", "DOT", "ELLIPSIS", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACKET", 
			"RBRACKET", "COLON", "QUESTION", "PIPE", "BACKTICK", "ANY", "NUMBER_TYPE", 
			"STRING_TYPE", "BOOLEAN_TYPE", "VOID_TYPE", "UNKNOWN", "NEVER", "REGEX", 
			"WS", "NEWLINE", "COMMENT", "BLOCK_COMMENT", "ERROR", "STAR"
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
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 510806837601864698L) != 0) || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & 21L) != 0)) {
				{
				{
				setState(86);
				statement();
				}
				}
				setState(91);
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
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				functionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				enumDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(96);
				componentDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(97);
				serviceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(98);
				importStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(99);
				exportStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(100);
				expressionStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(101);
				blockStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(102);
				ifStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(103);
				forStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(104);
				whileStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(105);
				doWhileStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(106);
				switchStatement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(107);
				tryCatchStatement();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(108);
				returnStatement();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(109);
				breakStatement();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(110);
				continueStatement();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(111);
				throwStatement();
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
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				_la = _input.LA(1);
				if ( !(_la==LET || _la==CONST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(115);
				match(ID);
				setState(116);
				match(ASSIGN);
				setState(117);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				_la = _input.LA(1);
				if ( !(_la==LET || _la==CONST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(119);
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
			setState(122);
			match(FUNCTION);
			setState(123);
			match(ID);
			setState(124);
			match(LPAREN);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(125);
				parameterList();
				}
			}

			setState(128);
			match(RPAREN);
			setState(129);
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
			setState(131);
			parameter();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(132);
				match(COMMA);
				setState(133);
				parameter();
				}
				}
				setState(138);
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
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(ID);
				setState(141);
				match(COLON);
				setState(142);
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
			setState(145);
			_la = _input.LA(1);
			if ( !(((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & 4575657221408423937L) != 0)) ) {
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
			setState(147);
			match(CLASS);
			setState(148);
			match(ID);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(149);
				match(EXTENDS);
				setState(150);
				match(ID);
				}
			}

			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(153);
				match(IMPLEMENTS);
				setState(154);
				match(ID);
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(155);
					match(COMMA);
					setState(156);
					match(ID);
					}
					}
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(164);
			match(LBRACE);
			setState(165);
			classBody();
			setState(166);
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
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 510630792158251392L) != 0) || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & 21L) != 0)) {
				{
				{
				setState(168);
				classMember();
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(169);
					match(SEMICOLON);
					}
				}

				}
				}
				setState(176);
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
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUBLIC) {
					{
					setState(177);
					match(PUBLIC);
					}
				}

				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRIVATE) {
					{
					setState(180);
					match(PRIVATE);
					}
				}

				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PROTECTED) {
					{
					setState(183);
					match(PROTECTED);
					}
				}

				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(186);
					match(STATIC);
					}
				}

				setState(189);
				match(ID);
				setState(190);
				match(COLON);
				setState(191);
				typeAnnotation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				constructorDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				variableDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(194);
				expressionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(195);
				methodDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(196);
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
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(199);
				objectMember();
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(200);
						match(COMMA);
						setState(201);
						objectMember();
						}
						} 
					}
					setState(206);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(207);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(ID);
			setState(213);
			match(COLON);
			setState(214);
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
		enterRule(_localctx, 24, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(CONSTRUCTOR);
			setState(217);
			match(LPAREN);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(218);
				parameterList();
				}
			}

			setState(221);
			match(RPAREN);
			setState(222);
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
		enterRule(_localctx, 26, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(ID);
			setState(225);
			match(LPAREN);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(226);
				parameterList();
				}
			}

			setState(229);
			match(RPAREN);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & 4575657221408423937L) != 0)) {
				{
				setState(230);
				typeAnnotation();
				}
			}

			setState(233);
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
		enterRule(_localctx, 28, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(ENUM);
			setState(236);
			match(ID);
			setState(237);
			match(LBRACE);
			setState(238);
			enumMember();
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(239);
				match(COMMA);
				setState(240);
				enumMember();
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(246);
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
		enterRule(_localctx, 30, RULE_enumMember);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(ID);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(249);
				match(ASSIGN);
				setState(250);
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
		enterRule(_localctx, 32, RULE_componentDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(COMPONENT);
			setState(254);
			match(ID);
			setState(255);
			match(LBRACE);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PROPERTY) {
				{
				{
				setState(256);
				propertyDeclaration();
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(262);
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
		enterRule(_localctx, 34, RULE_serviceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(SERVICE);
			setState(265);
			match(ID);
			setState(266);
			match(LBRACE);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(267);
				methodDeclaration();
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(273);
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
		enterRule(_localctx, 36, RULE_propertyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(PROPERTY);
			setState(276);
			match(ID);
			setState(277);
			match(COLON);
			setState(278);
			typeAnnotation();
			setState(279);
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
		enterRule(_localctx, 38, RULE_importStatement);
		int _la;
		try {
			setState(318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				match(IMPORT);
				setState(283);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(282);
					match(LBRACE);
					}
					break;
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAR) {
					{
					setState(285);
					match(STAR);
					}
				}

				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(288);
					match(AS);
					}
				}

				}
				break;
			case ID:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(291);
					match(STRING);
					}
					break;
				case ID:
					{
					setState(292);
					match(ID);
					setState(295);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						setState(293);
						match(AS);
						setState(294);
						match(ID);
						}
						break;
					}
					setState(301);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(297);
						match(COMMA);
						setState(298);
						match(ID);
						}
						}
						setState(303);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(306);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(304);
						match(AS);
						setState(305);
						match(ID);
						}
					}

					setState(309);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==RBRACE) {
						{
						setState(308);
						match(RBRACE);
						}
					}

					setState(311);
					match(FROM);
					setState(312);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(316);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(315);
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
		enterRule(_localctx, 40, RULE_exportStatement);
		try {
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				match(EXPORT);
				setState(321);
				variableDeclaration();
				setState(323);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(322);
					match(SEMICOLON);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				match(EXPORT);
				setState(326);
				functionDeclaration();
				setState(328);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(327);
					match(SEMICOLON);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(330);
				match(EXPORT);
				setState(331);
				classDeclaration();
				setState(333);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(332);
					match(SEMICOLON);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(335);
				match(EXPORT);
				setState(336);
				match(ID);
				setState(338);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(337);
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
		enterRule(_localctx, 42, RULE_expressionStatement);
		try {
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
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
		enterRule(_localctx, 44, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
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
		enterRule(_localctx, 46, RULE_conditionalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			logicalExpression();
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUESTION) {
				{
				setState(349);
				match(QUESTION);
				setState(350);
				expression();
				setState(351);
				match(COLON);
				setState(352);
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
		enterRule(_localctx, 48, RULE_logicalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			binaryExpression();
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 123L) != 0)) {
				{
				{
				setState(357);
				_la = _input.LA(1);
				if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 123L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(358);
				binaryExpression();
				}
				}
				setState(363);
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
		enterRule(_localctx, 50, RULE_binaryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			primaryExpression(0);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 1610645503L) != 0)) {
				{
				{
				setState(365);
				_la = _input.LA(1);
				if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 1610645503L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(366);
				primaryExpression(0);
				}
				}
				setState(371);
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
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public ObjectBodyContext objectBody() {
			return getRuleContext(ObjectBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public TerminalNode LBRACKET() { return getToken(AngularParser.LBRACKET, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(AngularParser.RBRACKET, 0); }
		public TerminalNode NEW() { return getToken(AngularParser.NEW, 0); }
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
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
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_primaryExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(373);
				match(ID);
				}
				break;
			case STRING:
				{
				setState(374);
				match(STRING);
				}
				break;
			case THIS:
				{
				setState(375);
				match(THIS);
				}
				break;
			case NUMBER:
				{
				setState(376);
				match(NUMBER);
				}
				break;
			case BOOLEAN:
				{
				setState(377);
				match(BOOLEAN);
				}
				break;
			case NULL:
				{
				setState(378);
				match(NULL);
				}
				break;
			case UNDEFINED:
				{
				setState(379);
				match(UNDEFINED);
				}
				break;
			case LPAREN:
				{
				setState(380);
				match(LPAREN);
				setState(381);
				expression();
				setState(382);
				match(RPAREN);
				}
				break;
			case LBRACE:
				{
				setState(384);
				match(LBRACE);
				setState(385);
				objectBody();
				setState(386);
				match(RBRACE);
				}
				break;
			case LBRACKET:
				{
				setState(388);
				match(LBRACKET);
				setState(389);
				argumentList();
				setState(390);
				match(RBRACKET);
				}
				break;
			case NEW:
				{
				setState(392);
				match(NEW);
				setState(393);
				match(ID);
				setState(394);
				match(LPAREN);
				setState(396);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(395);
					argumentList();
					}
					break;
				}
				setState(398);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(412);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(410);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						_localctx = new PrimaryExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(401);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(402);
						match(LPAREN);
						setState(404);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
						case 1:
							{
							setState(403);
							argumentList();
							}
							break;
						}
						setState(406);
						match(RPAREN);
						}
						break;
					case 2:
						{
						_localctx = new PrimaryExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(407);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(408);
						match(DOT);
						setState(409);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(414);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
		enterRule(_localctx, 54, RULE_argumentList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 510595607754702848L) != 0) || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & 21L) != 0)) {
				{
				setState(415);
				expression();
				setState(420);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(416);
						match(COMMA);
						setState(417);
						expression();
						}
						} 
					}
					setState(422);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				}
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(423);
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
		enterRule(_localctx, 56, RULE_assignmentExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(ID);
			setState(429);
			match(ASSIGN);
			setState(430);
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
		enterRule(_localctx, 58, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(LBRACE);
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 510806837601864698L) != 0) || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & 21L) != 0)) {
				{
				{
				setState(433);
				statement();
				}
				}
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(439);
				match(SEMICOLON);
				}
			}

			setState(442);
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
		enterRule(_localctx, 60, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(IF);
			setState(445);
			match(LPAREN);
			setState(446);
			expression();
			setState(447);
			match(RPAREN);
			setState(448);
			statement();
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(449);
				match(ELSE);
				setState(450);
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
		public List<TerminalNode> SEMICOLON() { return getTokens(AngularParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(AngularParser.SEMICOLON, i);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
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
		enterRule(_localctx, 62, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(FOR);
			setState(454);
			match(LPAREN);
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(455);
				variableDeclaration();
				}
				break;
			case 2:
				{
				setState(456);
				assignmentExpression();
				}
				break;
			case 3:
				{
				setState(457);
				expression();
				}
				break;
			}
			setState(460);
			match(SEMICOLON);
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 510595607754702848L) != 0) || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & 21L) != 0)) {
				{
				setState(461);
				expression();
				}
			}

			setState(464);
			match(SEMICOLON);
			setState(468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(465);
				incrementExpression();
				}
				break;
			case 2:
				{
				setState(466);
				assignmentExpression();
				}
				break;
			case 3:
				{
				setState(467);
				expression();
				}
				break;
			}
			setState(470);
			match(RPAREN);
			setState(471);
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
		enterRule(_localctx, 64, RULE_incrementExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(ID);
			setState(474);
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
		enterRule(_localctx, 66, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(WHILE);
			setState(477);
			match(LPAREN);
			setState(478);
			expression();
			setState(479);
			match(RPAREN);
			setState(480);
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
		enterRule(_localctx, 68, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(DO);
			setState(483);
			statement();
			setState(484);
			match(WHILE);
			setState(485);
			match(LPAREN);
			setState(486);
			expression();
			setState(487);
			match(RPAREN);
			setState(489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(488);
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
		enterRule(_localctx, 70, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			match(SWITCH);
			setState(492);
			match(LPAREN);
			setState(493);
			expression();
			setState(494);
			match(RPAREN);
			setState(495);
			match(LBRACE);
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(496);
				caseStatement();
				}
				}
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(502);
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
		enterRule(_localctx, 72, RULE_caseStatement);
		int _la;
		try {
			setState(521);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				match(CASE);
				setState(505);
				expression();
				setState(506);
				match(COLON);
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 510806837601864698L) != 0) || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & 21L) != 0)) {
					{
					{
					setState(507);
					statement();
					}
					}
					setState(512);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(513);
				match(DEFAULT);
				setState(514);
				match(COLON);
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 510806837601864698L) != 0) || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & 21L) != 0)) {
					{
					{
					setState(515);
					statement();
					}
					}
					setState(520);
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
		enterRule(_localctx, 74, RULE_tryCatchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(TRY);
			setState(524);
			blockStatement();
			setState(525);
			match(CATCH);
			setState(526);
			match(LPAREN);
			setState(527);
			match(ID);
			setState(528);
			match(RPAREN);
			setState(529);
			blockStatement();
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(530);
				match(FINALLY);
				setState(531);
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
		enterRule(_localctx, 76, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(RETURN);
			setState(536);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(535);
				expression();
				}
				break;
			}
			setState(539);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(538);
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
		enterRule(_localctx, 78, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(BREAK);
			setState(543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(542);
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
		enterRule(_localctx, 80, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(CONTINUE);
			setState(546);
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
		enterRule(_localctx, 82, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(THROW);
			setState(549);
			expression();
			setState(550);
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
		enterRule(_localctx, 84, RULE_readError);
		try {
			setState(559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(552);
				match(ID);
				setState(553);
				match(ASSIGN);
				setState(554);
				expression();
				setState(555);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(557);
				match(ID);
				setState(558);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 26:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001u\u0232\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0001\u0000\u0005\u0000X\b\u0000"+
		"\n\u0000\f\u0000[\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001q\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002y\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u007f\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004\u0087\b\u0004\n\u0004\f\u0004\u008a"+
		"\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0090"+
		"\b\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u0098\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u009e\b\u0007\n\u0007\f\u0007\u00a1\t\u0007\u0003\u0007"+
		"\u00a3\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b"+
		"\u0001\b\u0003\b\u00ab\b\b\u0005\b\u00ad\b\b\n\b\f\b\u00b0\t\b\u0001\t"+
		"\u0003\t\u00b3\b\t\u0001\t\u0003\t\u00b6\b\t\u0001\t\u0003\t\u00b9\b\t"+
		"\u0001\t\u0003\t\u00bc\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u00c6\b\t\u0001\n\u0001\n\u0001\n\u0005\n\u00cb"+
		"\b\n\n\n\f\n\u00ce\t\n\u0001\n\u0003\n\u00d1\b\n\u0003\n\u00d3\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00dc\b\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0003\r\u00e4"+
		"\b\r\u0001\r\u0001\r\u0003\r\u00e8\b\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00f2"+
		"\b\u000e\n\u000e\f\u000e\u00f5\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u00fc\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0005\u0010\u0102\b\u0010\n\u0010\f\u0010\u0105"+
		"\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u010d\b\u0011\n\u0011\f\u0011\u0110\t\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u011c\b\u0013\u0001\u0013"+
		"\u0003\u0013\u011f\b\u0013\u0001\u0013\u0003\u0013\u0122\b\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0128\b\u0013\u0001"+
		"\u0013\u0001\u0013\u0005\u0013\u012c\b\u0013\n\u0013\f\u0013\u012f\t\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u0133\b\u0013\u0001\u0013\u0003\u0013"+
		"\u0136\b\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u013a\b\u0013\u0001"+
		"\u0013\u0003\u0013\u013d\b\u0013\u0003\u0013\u013f\b\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u0144\b\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u0149\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u014e\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u0153\b\u0014\u0003\u0014\u0155\b\u0014\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u0159\b\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0163\b\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0168\b\u0018\n\u0018\f\u0018"+
		"\u016b\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0170\b"+
		"\u0019\n\u0019\f\u0019\u0173\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u018d\b\u001a\u0001\u001a"+
		"\u0003\u001a\u0190\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u0195\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a"+
		"\u019b\b\u001a\n\u001a\f\u001a\u019e\t\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0005\u001b\u01a3\b\u001b\n\u001b\f\u001b\u01a6\t\u001b\u0001\u001b"+
		"\u0003\u001b\u01a9\b\u001b\u0003\u001b\u01ab\b\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0005\u001d\u01b3"+
		"\b\u001d\n\u001d\f\u001d\u01b6\t\u001d\u0001\u001d\u0003\u001d\u01b9\b"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01c4\b\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01cb"+
		"\b\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01cf\b\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01d5\b\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0003\"\u01ea\b\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0005#"+
		"\u01f2\b#\n#\f#\u01f5\t#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0005"+
		"$\u01fd\b$\n$\f$\u0200\t$\u0001$\u0001$\u0001$\u0005$\u0205\b$\n$\f$\u0208"+
		"\t$\u0003$\u020a\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0003%\u0215\b%\u0001&\u0001&\u0003&\u0219\b&\u0001&\u0003&\u021c"+
		"\b&\u0001\'\u0001\'\u0003\'\u0220\b\'\u0001(\u0001(\u0001(\u0001)\u0001"+
		")\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003"+
		"*\u0230\b*\u0001*\u0000\u00014+\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"T\u0000\u0005\u0001\u0000\u0007\b\u0002\u000011hn\u0002\u0000JKMP\u0002"+
		"\u0000;IXY\u0001\u0000XY\u0270\u0000Y\u0001\u0000\u0000\u0000\u0002p\u0001"+
		"\u0000\u0000\u0000\u0004x\u0001\u0000\u0000\u0000\u0006z\u0001\u0000\u0000"+
		"\u0000\b\u0083\u0001\u0000\u0000\u0000\n\u008f\u0001\u0000\u0000\u0000"+
		"\f\u0091\u0001\u0000\u0000\u0000\u000e\u0093\u0001\u0000\u0000\u0000\u0010"+
		"\u00ae\u0001\u0000\u0000\u0000\u0012\u00c5\u0001\u0000\u0000\u0000\u0014"+
		"\u00d2\u0001\u0000\u0000\u0000\u0016\u00d4\u0001\u0000\u0000\u0000\u0018"+
		"\u00d8\u0001\u0000\u0000\u0000\u001a\u00e0\u0001\u0000\u0000\u0000\u001c"+
		"\u00eb\u0001\u0000\u0000\u0000\u001e\u00f8\u0001\u0000\u0000\u0000 \u00fd"+
		"\u0001\u0000\u0000\u0000\"\u0108\u0001\u0000\u0000\u0000$\u0113\u0001"+
		"\u0000\u0000\u0000&\u013e\u0001\u0000\u0000\u0000(\u0154\u0001\u0000\u0000"+
		"\u0000*\u0158\u0001\u0000\u0000\u0000,\u015a\u0001\u0000\u0000\u0000."+
		"\u015c\u0001\u0000\u0000\u00000\u0164\u0001\u0000\u0000\u00002\u016c\u0001"+
		"\u0000\u0000\u00004\u018f\u0001\u0000\u0000\u00006\u01aa\u0001\u0000\u0000"+
		"\u00008\u01ac\u0001\u0000\u0000\u0000:\u01b0\u0001\u0000\u0000\u0000<"+
		"\u01bc\u0001\u0000\u0000\u0000>\u01c5\u0001\u0000\u0000\u0000@\u01d9\u0001"+
		"\u0000\u0000\u0000B\u01dc\u0001\u0000\u0000\u0000D\u01e2\u0001\u0000\u0000"+
		"\u0000F\u01eb\u0001\u0000\u0000\u0000H\u0209\u0001\u0000\u0000\u0000J"+
		"\u020b\u0001\u0000\u0000\u0000L\u0216\u0001\u0000\u0000\u0000N\u021d\u0001"+
		"\u0000\u0000\u0000P\u0221\u0001\u0000\u0000\u0000R\u0224\u0001\u0000\u0000"+
		"\u0000T\u022f\u0001\u0000\u0000\u0000VX\u0003\u0002\u0001\u0000WV\u0001"+
		"\u0000\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000"+
		"YZ\u0001\u0000\u0000\u0000Z\u0001\u0001\u0000\u0000\u0000[Y\u0001\u0000"+
		"\u0000\u0000\\q\u0003\u0004\u0002\u0000]q\u0003\u0006\u0003\u0000^q\u0003"+
		"\u000e\u0007\u0000_q\u0003\u001c\u000e\u0000`q\u0003 \u0010\u0000aq\u0003"+
		"\"\u0011\u0000bq\u0003&\u0013\u0000cq\u0003(\u0014\u0000dq\u0003*\u0015"+
		"\u0000eq\u0003:\u001d\u0000fq\u0003<\u001e\u0000gq\u0003>\u001f\u0000"+
		"hq\u0003B!\u0000iq\u0003D\"\u0000jq\u0003F#\u0000kq\u0003J%\u0000lq\u0003"+
		"L&\u0000mq\u0003N\'\u0000nq\u0003P(\u0000oq\u0003R)\u0000p\\\u0001\u0000"+
		"\u0000\u0000p]\u0001\u0000\u0000\u0000p^\u0001\u0000\u0000\u0000p_\u0001"+
		"\u0000\u0000\u0000p`\u0001\u0000\u0000\u0000pa\u0001\u0000\u0000\u0000"+
		"pb\u0001\u0000\u0000\u0000pc\u0001\u0000\u0000\u0000pd\u0001\u0000\u0000"+
		"\u0000pe\u0001\u0000\u0000\u0000pf\u0001\u0000\u0000\u0000pg\u0001\u0000"+
		"\u0000\u0000ph\u0001\u0000\u0000\u0000pi\u0001\u0000\u0000\u0000pj\u0001"+
		"\u0000\u0000\u0000pk\u0001\u0000\u0000\u0000pl\u0001\u0000\u0000\u0000"+
		"pm\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000po\u0001\u0000\u0000"+
		"\u0000q\u0003\u0001\u0000\u0000\u0000rs\u0007\u0000\u0000\u0000st\u0005"+
		"1\u0000\u0000tu\u0005;\u0000\u0000uy\u0003,\u0016\u0000vw\u0007\u0000"+
		"\u0000\u0000wy\u00051\u0000\u0000xr\u0001\u0000\u0000\u0000xv\u0001\u0000"+
		"\u0000\u0000y\u0005\u0001\u0000\u0000\u0000z{\u0005\u0005\u0000\u0000"+
		"{|\u00051\u0000\u0000|~\u0005^\u0000\u0000}\u007f\u0003\b\u0004\u0000"+
		"~}\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0001\u0000\u0000\u0000\u0080\u0081\u0005_\u0000\u0000\u0081\u0082\u0003"+
		":\u001d\u0000\u0082\u0007\u0001\u0000\u0000\u0000\u0083\u0088\u0003\n"+
		"\u0005\u0000\u0084\u0085\u0005[\u0000\u0000\u0085\u0087\u0003\n\u0005"+
		"\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000"+
		"\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000"+
		"\u0000\u0089\t\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000"+
		"\u008b\u0090\u00051\u0000\u0000\u008c\u008d\u00051\u0000\u0000\u008d\u008e"+
		"\u0005d\u0000\u0000\u008e\u0090\u0003\f\u0006\u0000\u008f\u008b\u0001"+
		"\u0000\u0000\u0000\u008f\u008c\u0001\u0000\u0000\u0000\u0090\u000b\u0001"+
		"\u0000\u0000\u0000\u0091\u0092\u0007\u0001\u0000\u0000\u0092\r\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0005\t\u0000\u0000\u0094\u0097\u00051\u0000"+
		"\u0000\u0095\u0096\u0005\f\u0000\u0000\u0096\u0098\u00051\u0000\u0000"+
		"\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000"+
		"\u0098\u00a2\u0001\u0000\u0000\u0000\u0099\u009a\u0005\r\u0000\u0000\u009a"+
		"\u009f\u00051\u0000\u0000\u009b\u009c\u0005[\u0000\u0000\u009c\u009e\u0005"+
		"1\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000"+
		"\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000"+
		"\u0000\u0000\u00a2\u0099\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005`\u0000"+
		"\u0000\u00a5\u00a6\u0003\u0010\b\u0000\u00a6\u00a7\u0005a\u0000\u0000"+
		"\u00a7\u000f\u0001\u0000\u0000\u0000\u00a8\u00aa\u0003\u0012\t\u0000\u00a9"+
		"\u00ab\u0005Z\u0000\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00aa\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ad\u0001\u0000\u0000\u0000\u00ac\u00a8"+
		"\u0001\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u0011"+
		"\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b3"+
		"\u0005\u0015\u0000\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b2\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b5\u0001\u0000\u0000\u0000\u00b4\u00b6"+
		"\u0005\u0016\u0000\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b5\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b8\u0001\u0000\u0000\u0000\u00b7\u00b9"+
		"\u0005\u0017\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b8\u00b9"+
		"\u0001\u0000\u0000\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba\u00bc"+
		"\u0005\u0018\u0000\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bb\u00bc"+
		"\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00be"+
		"\u00051\u0000\u0000\u00be\u00bf\u0005d\u0000\u0000\u00bf\u00c6\u0003\f"+
		"\u0006\u0000\u00c0\u00c6\u0003\u0018\f\u0000\u00c1\u00c6\u0003\u0004\u0002"+
		"\u0000\u00c2\u00c6\u0003*\u0015\u0000\u00c3\u00c6\u0003\u001a\r\u0000"+
		"\u00c4\u00c6\u0003\u001c\u000e\u0000\u00c5\u00b2\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c0\u0001\u0000\u0000\u0000\u00c5\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c6\u0013\u0001\u0000\u0000\u0000"+
		"\u00c7\u00cc\u0003\u0016\u000b\u0000\u00c8\u00c9\u0005[\u0000\u0000\u00c9"+
		"\u00cb\u0003\u0016\u000b\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb"+
		"\u00ce\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cd\u00d0\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d1\u0005[\u0000\u0000\u00d0\u00cf"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d2\u00c7\u0001\u0000\u0000\u0000\u00d2\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d3\u0015\u0001\u0000\u0000\u0000\u00d4\u00d5"+
		"\u00051\u0000\u0000\u00d5\u00d6\u0005d\u0000\u0000\u00d6\u00d7\u0003,"+
		"\u0016\u0000\u00d7\u0017\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005-\u0000"+
		"\u0000\u00d9\u00db\u0005^\u0000\u0000\u00da\u00dc\u0003\b\u0004\u0000"+
		"\u00db\u00da\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000"+
		"\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00de\u0005_\u0000\u0000\u00de"+
		"\u00df\u0003:\u001d\u0000\u00df\u0019\u0001\u0000\u0000\u0000\u00e0\u00e1"+
		"\u00051\u0000\u0000\u00e1\u00e3\u0005^\u0000\u0000\u00e2\u00e4\u0003\b"+
		"\u0004\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e7\u0005_\u0000"+
		"\u0000\u00e6\u00e8\u0003\f\u0006\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000"+
		"\u00e9\u00ea\u0003:\u001d\u0000\u00ea\u001b\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ec\u0005\u000b\u0000\u0000\u00ec\u00ed\u00051\u0000\u0000\u00ed\u00ee"+
		"\u0005`\u0000\u0000\u00ee\u00f3\u0003\u001e\u000f\u0000\u00ef\u00f0\u0005"+
		"[\u0000\u0000\u00f0\u00f2\u0003\u001e\u000f\u0000\u00f1\u00ef\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f5\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005a\u0000"+
		"\u0000\u00f7\u001d\u0001\u0000\u0000\u0000\u00f8\u00fb\u00051\u0000\u0000"+
		"\u00f9\u00fa\u0005;\u0000\u0000\u00fa\u00fc\u0003,\u0016\u0000\u00fb\u00f9"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u001f"+
		"\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005.\u0000\u0000\u00fe\u00ff\u0005"+
		"1\u0000\u0000\u00ff\u0103\u0005`\u0000\u0000\u0100\u0102\u0003$\u0012"+
		"\u0000\u0101\u0100\u0001\u0000\u0000\u0000\u0102\u0105\u0001\u0000\u0000"+
		"\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000"+
		"\u0000\u0104\u0106\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000"+
		"\u0000\u0106\u0107\u0005a\u0000\u0000\u0107!\u0001\u0000\u0000\u0000\u0108"+
		"\u0109\u0005/\u0000\u0000\u0109\u010a\u00051\u0000\u0000\u010a\u010e\u0005"+
		"`\u0000\u0000\u010b\u010d\u0003\u001a\r\u0000\u010c\u010b\u0001\u0000"+
		"\u0000\u0000\u010d\u0110\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000"+
		"\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u0111\u0001\u0000"+
		"\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0111\u0112\u0005a\u0000"+
		"\u0000\u0112#\u0001\u0000\u0000\u0000\u0113\u0114\u00050\u0000\u0000\u0114"+
		"\u0115\u00051\u0000\u0000\u0115\u0116\u0005d\u0000\u0000\u0116\u0117\u0003"+
		"\f\u0006\u0000\u0117\u0118\u0005Z\u0000\u0000\u0118%\u0001\u0000\u0000"+
		"\u0000\u0119\u011b\u0005\u000f\u0000\u0000\u011a\u011c\u0005`\u0000\u0000"+
		"\u011b\u011a\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000"+
		"\u011c\u011e\u0001\u0000\u0000\u0000\u011d\u011f\u0005u\u0000\u0000\u011e"+
		"\u011d\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f"+
		"\u0121\u0001\u0000\u0000\u0000\u0120\u0122\u0005\u0011\u0000\u0000\u0121"+
		"\u0120\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122"+
		"\u013f\u0001\u0000\u0000\u0000\u0123\u013a\u00052\u0000\u0000\u0124\u0127"+
		"\u00051\u0000\u0000\u0125\u0126\u0005\u0011\u0000\u0000\u0126\u0128\u0005"+
		"1\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000"+
		"\u0000\u0000\u0128\u012d\u0001\u0000\u0000\u0000\u0129\u012a\u0005[\u0000"+
		"\u0000\u012a\u012c\u00051\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000"+
		"\u012c\u012f\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000"+
		"\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u0132\u0001\u0000\u0000\u0000"+
		"\u012f\u012d\u0001\u0000\u0000\u0000\u0130\u0131\u0005\u0011\u0000\u0000"+
		"\u0131\u0133\u00051\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0132"+
		"\u0133\u0001\u0000\u0000\u0000\u0133\u0135\u0001\u0000\u0000\u0000\u0134"+
		"\u0136\u0005a\u0000\u0000\u0135\u0134\u0001\u0000\u0000\u0000\u0135\u0136"+
		"\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0138"+
		"\u0005\u0012\u0000\u0000\u0138\u013a\u00052\u0000\u0000\u0139\u0123\u0001"+
		"\u0000\u0000\u0000\u0139\u0124\u0001\u0000\u0000\u0000\u013a\u013c\u0001"+
		"\u0000\u0000\u0000\u013b\u013d\u0005Z\u0000\u0000\u013c\u013b\u0001\u0000"+
		"\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u013f\u0001\u0000"+
		"\u0000\u0000\u013e\u0119\u0001\u0000\u0000\u0000\u013e\u0139\u0001\u0000"+
		"\u0000\u0000\u013f\'\u0001\u0000\u0000\u0000\u0140\u0141\u0005\u0010\u0000"+
		"\u0000\u0141\u0143\u0003\u0004\u0002\u0000\u0142\u0144\u0005Z\u0000\u0000"+
		"\u0143\u0142\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000"+
		"\u0144\u0155\u0001\u0000\u0000\u0000\u0145\u0146\u0005\u0010\u0000\u0000"+
		"\u0146\u0148\u0003\u0006\u0003\u0000\u0147\u0149\u0005Z\u0000\u0000\u0148"+
		"\u0147\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149"+
		"\u0155\u0001\u0000\u0000\u0000\u014a\u014b\u0005\u0010\u0000\u0000\u014b"+
		"\u014d\u0003\u000e\u0007\u0000\u014c\u014e\u0005Z\u0000\u0000\u014d\u014c"+
		"\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u0155"+
		"\u0001\u0000\u0000\u0000\u014f\u0150\u0005\u0010\u0000\u0000\u0150\u0152"+
		"\u00051\u0000\u0000\u0151\u0153\u0005Z\u0000\u0000\u0152\u0151\u0001\u0000"+
		"\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0155\u0001\u0000"+
		"\u0000\u0000\u0154\u0140\u0001\u0000\u0000\u0000\u0154\u0145\u0001\u0000"+
		"\u0000\u0000\u0154\u014a\u0001\u0000\u0000\u0000\u0154\u014f\u0001\u0000"+
		"\u0000\u0000\u0155)\u0001\u0000\u0000\u0000\u0156\u0159\u0003,\u0016\u0000"+
		"\u0157\u0159\u0003@ \u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0158\u0157"+
		"\u0001\u0000\u0000\u0000\u0159+\u0001\u0000\u0000\u0000\u015a\u015b\u0003"+
		".\u0017\u0000\u015b-\u0001\u0000\u0000\u0000\u015c\u0162\u00030\u0018"+
		"\u0000\u015d\u015e\u0005e\u0000\u0000\u015e\u015f\u0003,\u0016\u0000\u015f"+
		"\u0160\u0005d\u0000\u0000\u0160\u0161\u0003,\u0016\u0000\u0161\u0163\u0001"+
		"\u0000\u0000\u0000\u0162\u015d\u0001\u0000\u0000\u0000\u0162\u0163\u0001"+
		"\u0000\u0000\u0000\u0163/\u0001\u0000\u0000\u0000\u0164\u0169\u00032\u0019"+
		"\u0000\u0165\u0166\u0007\u0002\u0000\u0000\u0166\u0168\u00032\u0019\u0000"+
		"\u0167\u0165\u0001\u0000\u0000\u0000\u0168\u016b\u0001\u0000\u0000\u0000"+
		"\u0169\u0167\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000"+
		"\u016a1\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016c"+
		"\u0171\u00034\u001a\u0000\u016d\u016e\u0007\u0003\u0000\u0000\u016e\u0170"+
		"\u00034\u001a\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u0170\u0173\u0001"+
		"\u0000\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0171\u0172\u0001"+
		"\u0000\u0000\u0000\u01723\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000"+
		"\u0000\u0000\u0174\u0175\u0006\u001a\uffff\uffff\u0000\u0175\u0190\u0005"+
		"1\u0000\u0000\u0176\u0190\u00052\u0000\u0000\u0177\u0190\u0005\u0014\u0000"+
		"\u0000\u0178\u0190\u00054\u0000\u0000\u0179\u0190\u00058\u0000\u0000\u017a"+
		"\u0190\u00059\u0000\u0000\u017b\u0190\u0005:\u0000\u0000\u017c\u017d\u0005"+
		"^\u0000\u0000\u017d\u017e\u0003,\u0016\u0000\u017e\u017f\u0005_\u0000"+
		"\u0000\u017f\u0190\u0001\u0000\u0000\u0000\u0180\u0181\u0005`\u0000\u0000"+
		"\u0181\u0182\u0003\u0014\n\u0000\u0182\u0183\u0005a\u0000\u0000\u0183"+
		"\u0190\u0001\u0000\u0000\u0000\u0184\u0185\u0005b\u0000\u0000\u0185\u0186"+
		"\u00036\u001b\u0000\u0186\u0187\u0005c\u0000\u0000\u0187\u0190\u0001\u0000"+
		"\u0000\u0000\u0188\u0189\u0005\u0013\u0000\u0000\u0189\u018a\u00051\u0000"+
		"\u0000\u018a\u018c\u0005^\u0000\u0000\u018b\u018d\u00036\u001b\u0000\u018c"+
		"\u018b\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d"+
		"\u018e\u0001\u0000\u0000\u0000\u018e\u0190\u0005_\u0000\u0000\u018f\u0174"+
		"\u0001\u0000\u0000\u0000\u018f\u0176\u0001\u0000\u0000\u0000\u018f\u0177"+
		"\u0001\u0000\u0000\u0000\u018f\u0178\u0001\u0000\u0000\u0000\u018f\u0179"+
		"\u0001\u0000\u0000\u0000\u018f\u017a\u0001\u0000\u0000\u0000\u018f\u017b"+
		"\u0001\u0000\u0000\u0000\u018f\u017c\u0001\u0000\u0000\u0000\u018f\u0180"+
		"\u0001\u0000\u0000\u0000\u018f\u0184\u0001\u0000\u0000\u0000\u018f\u0188"+
		"\u0001\u0000\u0000\u0000\u0190\u019c\u0001\u0000\u0000\u0000\u0191\u0192"+
		"\n\u0003\u0000\u0000\u0192\u0194\u0005^\u0000\u0000\u0193\u0195\u0003"+
		"6\u001b\u0000\u0194\u0193\u0001\u0000\u0000\u0000\u0194\u0195\u0001\u0000"+
		"\u0000\u0000\u0195\u0196\u0001\u0000\u0000\u0000\u0196\u019b\u0005_\u0000"+
		"\u0000\u0197\u0198\n\u0002\u0000\u0000\u0198\u0199\u0005\\\u0000\u0000"+
		"\u0199\u019b\u00051\u0000\u0000\u019a\u0191\u0001\u0000\u0000\u0000\u019a"+
		"\u0197\u0001\u0000\u0000\u0000\u019b\u019e\u0001\u0000\u0000\u0000\u019c"+
		"\u019a\u0001\u0000\u0000\u0000\u019c\u019d\u0001\u0000\u0000\u0000\u019d"+
		"5\u0001\u0000\u0000\u0000\u019e\u019c\u0001\u0000\u0000\u0000\u019f\u01a4"+
		"\u0003,\u0016\u0000\u01a0\u01a1\u0005[\u0000\u0000\u01a1\u01a3\u0003,"+
		"\u0016\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a3\u01a6\u0001\u0000"+
		"\u0000\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000"+
		"\u0000\u0000\u01a5\u01a8\u0001\u0000\u0000\u0000\u01a6\u01a4\u0001\u0000"+
		"\u0000\u0000\u01a7\u01a9\u0005[\u0000\u0000\u01a8\u01a7\u0001\u0000\u0000"+
		"\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9\u01ab\u0001\u0000\u0000"+
		"\u0000\u01aa\u019f\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000"+
		"\u0000\u01ab7\u0001\u0000\u0000\u0000\u01ac\u01ad\u00051\u0000\u0000\u01ad"+
		"\u01ae\u0005;\u0000\u0000\u01ae\u01af\u0003,\u0016\u0000\u01af9\u0001"+
		"\u0000\u0000\u0000\u01b0\u01b4\u0005`\u0000\u0000\u01b1\u01b3\u0003\u0002"+
		"\u0001\u0000\u01b2\u01b1\u0001\u0000\u0000\u0000\u01b3\u01b6\u0001\u0000"+
		"\u0000\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000"+
		"\u0000\u0000\u01b5\u01b8\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001\u0000"+
		"\u0000\u0000\u01b7\u01b9\u0005Z\u0000\u0000\u01b8\u01b7\u0001\u0000\u0000"+
		"\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000"+
		"\u0000\u01ba\u01bb\u0005a\u0000\u0000\u01bb;\u0001\u0000\u0000\u0000\u01bc"+
		"\u01bd\u0005\u0001\u0000\u0000\u01bd\u01be\u0005^\u0000\u0000\u01be\u01bf"+
		"\u0003,\u0016\u0000\u01bf\u01c0\u0005_\u0000\u0000\u01c0\u01c3\u0003\u0002"+
		"\u0001\u0000\u01c1\u01c2\u0005\u0002\u0000\u0000\u01c2\u01c4\u0003\u0002"+
		"\u0001\u0000\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000"+
		"\u0000\u0000\u01c4=\u0001\u0000\u0000\u0000\u01c5\u01c6\u0005\u0003\u0000"+
		"\u0000\u01c6\u01ca\u0005^\u0000\u0000\u01c7\u01cb\u0003\u0004\u0002\u0000"+
		"\u01c8\u01cb\u00038\u001c\u0000\u01c9\u01cb\u0003,\u0016\u0000\u01ca\u01c7"+
		"\u0001\u0000\u0000\u0000\u01ca\u01c8\u0001\u0000\u0000\u0000\u01ca\u01c9"+
		"\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cb\u01cc"+
		"\u0001\u0000\u0000\u0000\u01cc\u01ce\u0005Z\u0000\u0000\u01cd\u01cf\u0003"+
		",\u0016\u0000\u01ce\u01cd\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000"+
		"\u0000\u0000\u01cf\u01d0\u0001\u0000\u0000\u0000\u01d0\u01d4\u0005Z\u0000"+
		"\u0000\u01d1\u01d5\u0003@ \u0000\u01d2\u01d5\u00038\u001c\u0000\u01d3"+
		"\u01d5\u0003,\u0016\u0000\u01d4\u01d1\u0001\u0000\u0000\u0000\u01d4\u01d2"+
		"\u0001\u0000\u0000\u0000\u01d4\u01d3\u0001\u0000\u0000\u0000\u01d4\u01d5"+
		"\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d6\u01d7"+
		"\u0005_\u0000\u0000\u01d7\u01d8\u0003\u0002\u0001\u0000\u01d8?\u0001\u0000"+
		"\u0000\u0000\u01d9\u01da\u00051\u0000\u0000\u01da\u01db\u0007\u0004\u0000"+
		"\u0000\u01dbA\u0001\u0000\u0000\u0000\u01dc\u01dd\u0005\u0004\u0000\u0000"+
		"\u01dd\u01de\u0005^\u0000\u0000\u01de\u01df\u0003,\u0016\u0000\u01df\u01e0"+
		"\u0005_\u0000\u0000\u01e0\u01e1\u0003\u0002\u0001\u0000\u01e1C\u0001\u0000"+
		"\u0000\u0000\u01e2\u01e3\u0005$\u0000\u0000\u01e3\u01e4\u0003\u0002\u0001"+
		"\u0000\u01e4\u01e5\u0005\u0004\u0000\u0000\u01e5\u01e6\u0005^\u0000\u0000"+
		"\u01e6\u01e7\u0003,\u0016\u0000\u01e7\u01e9\u0005_\u0000\u0000\u01e8\u01ea"+
		"\u0005Z\u0000\u0000\u01e9\u01e8\u0001\u0000\u0000\u0000\u01e9\u01ea\u0001"+
		"\u0000\u0000\u0000\u01eaE\u0001\u0000\u0000\u0000\u01eb\u01ec\u0005\u001f"+
		"\u0000\u0000\u01ec\u01ed\u0005^\u0000\u0000\u01ed\u01ee\u0003,\u0016\u0000"+
		"\u01ee\u01ef\u0005_\u0000\u0000\u01ef\u01f3\u0005`\u0000\u0000\u01f0\u01f2"+
		"\u0003H$\u0000\u01f1\u01f0\u0001\u0000\u0000\u0000\u01f2\u01f5\u0001\u0000"+
		"\u0000\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000"+
		"\u0000\u0000\u01f4\u01f6\u0001\u0000\u0000\u0000\u01f5\u01f3\u0001\u0000"+
		"\u0000\u0000\u01f6\u01f7\u0005a\u0000\u0000\u01f7G\u0001\u0000\u0000\u0000"+
		"\u01f8\u01f9\u0005 \u0000\u0000\u01f9\u01fa\u0003,\u0016\u0000\u01fa\u01fe"+
		"\u0005d\u0000\u0000\u01fb\u01fd\u0003\u0002\u0001\u0000\u01fc\u01fb\u0001"+
		"\u0000\u0000\u0000\u01fd\u0200\u0001\u0000\u0000\u0000\u01fe\u01fc\u0001"+
		"\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000\u0000\u0000\u01ff\u020a\u0001"+
		"\u0000\u0000\u0000\u0200\u01fe\u0001\u0000\u0000\u0000\u0201\u0202\u0005"+
		"!\u0000\u0000\u0202\u0206\u0005d\u0000\u0000\u0203\u0205\u0003\u0002\u0001"+
		"\u0000\u0204\u0203\u0001\u0000\u0000\u0000\u0205\u0208\u0001\u0000\u0000"+
		"\u0000\u0206\u0204\u0001\u0000\u0000\u0000\u0206\u0207\u0001\u0000\u0000"+
		"\u0000\u0207\u020a\u0001\u0000\u0000\u0000\u0208\u0206\u0001\u0000\u0000"+
		"\u0000\u0209\u01f8\u0001\u0000\u0000\u0000\u0209\u0201\u0001\u0000\u0000"+
		"\u0000\u020aI\u0001\u0000\u0000\u0000\u020b\u020c\u0005\u001b\u0000\u0000"+
		"\u020c\u020d\u0003:\u001d\u0000\u020d\u020e\u0005\u001c\u0000\u0000\u020e"+
		"\u020f\u0005^\u0000\u0000\u020f\u0210\u00051\u0000\u0000\u0210\u0211\u0005"+
		"_\u0000\u0000\u0211\u0214\u0003:\u001d\u0000\u0212\u0213\u0005\u001d\u0000"+
		"\u0000\u0213\u0215\u0003:\u001d\u0000\u0214\u0212\u0001\u0000\u0000\u0000"+
		"\u0214\u0215\u0001\u0000\u0000\u0000\u0215K\u0001\u0000\u0000\u0000\u0216"+
		"\u0218\u0005\u0006\u0000\u0000\u0217\u0219\u0003,\u0016\u0000\u0218\u0217"+
		"\u0001\u0000\u0000\u0000\u0218\u0219\u0001\u0000\u0000\u0000\u0219\u021b"+
		"\u0001\u0000\u0000\u0000\u021a\u021c\u0005Z\u0000\u0000\u021b\u021a\u0001"+
		"\u0000\u0000\u0000\u021b\u021c\u0001\u0000\u0000\u0000\u021cM\u0001\u0000"+
		"\u0000\u0000\u021d\u021f\u0005\"\u0000\u0000\u021e\u0220\u0005Z\u0000"+
		"\u0000\u021f\u021e\u0001\u0000\u0000\u0000\u021f\u0220\u0001\u0000\u0000"+
		"\u0000\u0220O\u0001\u0000\u0000\u0000\u0221\u0222\u0005#\u0000\u0000\u0222"+
		"\u0223\u0005Z\u0000\u0000\u0223Q\u0001\u0000\u0000\u0000\u0224\u0225\u0005"+
		"\u001e\u0000\u0000\u0225\u0226\u0003,\u0016\u0000\u0226\u0227\u0005Z\u0000"+
		"\u0000\u0227S\u0001\u0000\u0000\u0000\u0228\u0229\u00051\u0000\u0000\u0229"+
		"\u022a\u0005;\u0000\u0000\u022a\u022b\u0003,\u0016\u0000\u022b\u022c\u0005"+
		"Z\u0000\u0000\u022c\u0230\u0001\u0000\u0000\u0000\u022d\u022e\u00051\u0000"+
		"\u0000\u022e\u0230\u0005Z\u0000\u0000\u022f\u0228\u0001\u0000\u0000\u0000"+
		"\u022f\u022d\u0001\u0000\u0000\u0000\u0230U\u0001\u0000\u0000\u0000EY"+
		"px~\u0088\u008f\u0097\u009f\u00a2\u00aa\u00ae\u00b2\u00b5\u00b8\u00bb"+
		"\u00c5\u00cc\u00d0\u00d2\u00db\u00e3\u00e7\u00f3\u00fb\u0103\u010e\u011b"+
		"\u011e\u0121\u0127\u012d\u0132\u0135\u0139\u013c\u013e\u0143\u0148\u014d"+
		"\u0152\u0154\u0158\u0162\u0169\u0171\u018c\u018f\u0194\u019a\u019c\u01a4"+
		"\u01a8\u01aa\u01b4\u01b8\u01c3\u01ca\u01ce\u01d4\u01e9\u01f3\u01fe\u0206"+
		"\u0209\u0214\u0218\u021b\u021f\u022f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}