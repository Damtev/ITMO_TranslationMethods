// Generated from /media/damtev/Storage/ITMO/ITMO_MT/Task3_OwnLanguage/GoodLanguageGrammar.g4 by ANTLR 4.7.2
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GoodLanguageGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAIN=1, INT=2, BOOL=3, STRING=4, FLOAT=5, CHAR=6, LCURLY=7, RCURLY=8, 
		LPAREN=9, RPAREN=10, SEMICOLON=11, COMMA=12, DOT=13, DOUBLEDOT=14, ASSIGN=15, 
		PLUS=16, MINUS=17, MULT=18, MOD=19, EQUAL=20, NOT_EQUAL=21, GT=22, GTE=23, 
		LT=24, LTE=25, OR=26, AND=27, NOT=28, TRUE=29, FALSE=30, IF=31, ELSE=32, 
		RETURN=33, FOR=34, WHILE=35, IN=36, STEP=37, LITERAL=38, NUMBER=39, INTEGER=40, 
		NAME=41, WS=42;
	public static final int
		RULE_program = 0, RULE_blocks = 1, RULE_functionDeclaration = 2, RULE_functionBlock = 3, 
		RULE_args = 4, RULE_returnStatement = 5, RULE_variableDeclaration = 6, 
		RULE_mainBlock = 7, RULE_codeBlock = 8, RULE_statements = 9, RULE_simpleStatement = 10, 
		RULE_assignmentStatement = 11, RULE_functionCall = 12, RULE_parameters = 13, 
		RULE_variableDeclarationInsideCodeBlock = 14, RULE_expression = 15, RULE_simpleExpression = 16, 
		RULE_term = 17, RULE_signedFactor = 18, RULE_factor = 19, RULE_value = 20, 
		RULE_varName = 21, RULE_complexStatement = 22, RULE_ifStatement = 23, 
		RULE_loopStatement = 24, RULE_whileStatement = 25, RULE_forStatement = 26, 
		RULE_maximumPriorityOperator = 27, RULE_middlePriorityOperator = 28, RULE_minimalPriorityOperator = 29, 
		RULE_type = 30, RULE_bool = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "blocks", "functionDeclaration", "functionBlock", "args", 
			"returnStatement", "variableDeclaration", "mainBlock", "codeBlock", "statements", 
			"simpleStatement", "assignmentStatement", "functionCall", "parameters", 
			"variableDeclarationInsideCodeBlock", "expression", "simpleExpression", 
			"term", "signedFactor", "factor", "value", "varName", "complexStatement", 
			"ifStatement", "loopStatement", "whileStatement", "forStatement", "maximumPriorityOperator", 
			"middlePriorityOperator", "minimalPriorityOperator", "type", "bool"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'int'", "'bool'", "'string'", "'float'", "'char'", "'{'", 
			"'}'", "'('", "')'", "';'", "','", "'.'", "'..'", "'='", "'+'", "'-'", 
			"'*'", "'%'", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'|'", "'&'", 
			"'!'", "'true'", "'false'", "'if'", "'else'", "'return'", "'for'", "'while'", 
			"'in'", "'step'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MAIN", "INT", "BOOL", "STRING", "FLOAT", "CHAR", "LCURLY", "RCURLY", 
			"LPAREN", "RPAREN", "SEMICOLON", "COMMA", "DOT", "DOUBLEDOT", "ASSIGN", 
			"PLUS", "MINUS", "MULT", "MOD", "EQUAL", "NOT_EQUAL", "GT", "GTE", "LT", 
			"LTE", "OR", "AND", "NOT", "TRUE", "FALSE", "IF", "ELSE", "RETURN", "FOR", 
			"WHILE", "IN", "STEP", "LITERAL", "NUMBER", "INTEGER", "NAME", "WS"
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
	public String getGrammarFileName() { return "GoodLanguageGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GoodLanguageGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public BlocksContext blocks() {
			return getRuleContext(BlocksContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GoodLanguageGrammarParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLanguageGrammarVisitor ) return ((GoodLanguageGrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			blocks();
			setState(65);
			match(EOF);
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

	public static class BlocksContext extends ParserRuleContext {
		public MainBlockContext mainBlock() {
			return getRuleContext(MainBlockContext.class,0);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public BlocksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).enterBlocks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).exitBlocks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLanguageGrammarVisitor ) return ((GoodLanguageGrammarVisitor<? extends T>)visitor).visitBlocks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocksContext blocks() throws RecognitionException {
		BlocksContext _localctx = new BlocksContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_blocks);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << FLOAT) | (1L << CHAR))) != 0)) {
				{
				setState(69);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(67);
					variableDeclaration();
					}
					break;
				case 2:
					{
					setState(68);
					functionDeclaration();
					}
					break;
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			mainBlock();
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode NAME() { return getToken(GoodLanguageGrammarParser.NAME, 0); }
		public TerminalNode LPAREN() { return getToken(GoodLanguageGrammarParser.LPAREN, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GoodLanguageGrammarParser.RPAREN, 0); }
		public FunctionBlockContext functionBlock() {
			return getRuleContext(FunctionBlockContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLanguageGrammarVisitor ) return ((GoodLanguageGrammarVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			type();
			setState(77);
			match(NAME);
			setState(78);
			match(LPAREN);
			setState(79);
			args();
			setState(80);
			match(RPAREN);
			setState(81);
			functionBlock();
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

	public static class FunctionBlockContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(GoodLanguageGrammarParser.LCURLY, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(GoodLanguageGrammarParser.RCURLY, 0); }
		public FunctionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).enterFunctionBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).exitFunctionBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLanguageGrammarVisitor ) return ((GoodLanguageGrammarVisitor<? extends T>)visitor).visitFunctionBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBlockContext functionBlock() throws RecognitionException {
		FunctionBlockContext _localctx = new FunctionBlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(LCURLY);
			setState(84);
			statements();
			setState(85);
			returnStatement();
			setState(86);
			match(RCURLY);
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

	public static class ArgsContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> NAME() { return getTokens(GoodLanguageGrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GoodLanguageGrammarParser.NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GoodLanguageGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GoodLanguageGrammarParser.COMMA, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLanguageGrammarVisitor ) return ((GoodLanguageGrammarVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << FLOAT) | (1L << CHAR))) != 0)) {
				{
				setState(88);
				type();
				setState(89);
				match(NAME);
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(90);
					match(COMMA);
					setState(91);
					type();
					setState(92);
					match(NAME);
					}
					}
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(GoodLanguageGrammarParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GoodLanguageGrammarParser.SEMICOLON, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLanguageGrammarVisitor ) return ((GoodLanguageGrammarVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(RETURN);
			setState(102);
			expression();
			setState(103);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode NAME() { return getToken(GoodLanguageGrammarParser.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(GoodLanguageGrammarParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GoodLanguageGrammarParser.SEMICOLON, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLanguageGrammarVisitor ) return ((GoodLanguageGrammarVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			type();
			setState(106);
			match(NAME);
			setState(107);
			match(ASSIGN);
			setState(108);
			expression();
			setState(109);
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

	public static class MainBlockContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(GoodLanguageGrammarParser.MAIN, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public MainBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).enterMainBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).exitMainBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLanguageGrammarVisitor ) return ((GoodLanguageGrammarVisitor<? extends T>)visitor).visitMainBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainBlockContext mainBlock() throws RecognitionException {
		MainBlockContext _localctx = new MainBlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mainBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(MAIN);
			setState(112);
			codeBlock();
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

	public static class CodeBlockContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(GoodLanguageGrammarParser.LCURLY, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(GoodLanguageGrammarParser.RCURLY, 0); }
		public CodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).enterCodeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).exitCodeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLanguageGrammarVisitor ) return ((GoodLanguageGrammarVisitor<? extends T>)visitor).visitCodeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeBlockContext codeBlock() throws RecognitionException {
		CodeBlockContext _localctx = new CodeBlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_codeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(LCURLY);
			setState(115);
			statements();
			setState(116);
			match(RCURLY);
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

	public static class StatementsContext extends ParserRuleContext {
		public List<SimpleStatementContext> simpleStatement() {
			return getRuleContexts(SimpleStatementContext.class);
		}
		public SimpleStatementContext simpleStatement(int i) {
			return getRuleContext(SimpleStatementContext.class,i);
		}
		public List<ComplexStatementContext> complexStatement() {
			return getRuleContexts(ComplexStatementContext.class);
		}
		public ComplexStatementContext complexStatement(int i) {
			return getRuleContext(ComplexStatementContext.class,i);
		}
		public List<VariableDeclarationInsideCodeBlockContext> variableDeclarationInsideCodeBlock() {
			return getRuleContexts(VariableDeclarationInsideCodeBlockContext.class);
		}
		public VariableDeclarationInsideCodeBlockContext variableDeclarationInsideCodeBlock(int i) {
			return getRuleContext(VariableDeclarationInsideCodeBlockContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLanguageGrammarVisitor ) return ((GoodLanguageGrammarVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << FLOAT) | (1L << CHAR) | (1L << LCURLY) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << NAME))) != 0)) {
				{
				setState(121);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NAME:
					{
					setState(118);
					simpleStatement();
					}
					break;
				case LCURLY:
				case IF:
				case FOR:
				case WHILE:
					{
					setState(119);
					complexStatement();
					}
					break;
				case INT:
				case BOOL:
				case STRING:
				case FLOAT:
				case CHAR:
					{
					setState(120);
					variableDeclarationInsideCodeBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(125);
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

	public static class SimpleStatementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(GoodLanguageGrammarParser.SEMICOLON, 0); }
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).enterSimpleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).exitSimpleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLanguageGrammarVisitor ) return ((GoodLanguageGrammarVisitor<? extends T>)visitor).visitSimpleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_simpleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(126);
				assignmentStatement();
				}
				break;
			case 2:
				{
				setState(127);
				functionCall();
				}
				break;
			}
			setState(130);
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

	public static class AssignmentStatementContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GoodLanguageGrammarParser.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(GoodLanguageGrammarParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLanguageGrammarVisitor ) return ((GoodLanguageGrammarVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(NAME);
			setState(133);
			match(ASSIGN);
			setState(134);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GoodLanguageGrammarParser.NAME, 0); }
		public TerminalNode LPAREN() { return getToken(GoodLanguageGrammarParser.LPAREN, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GoodLanguageGrammarParser.RPAREN, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLanguageGrammarVisitor ) return ((GoodLanguageGrammarVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(NAME);
			setState(137);
			match(LPAREN);
			setState(138);
			parameters();
			setState(139);
			match(RPAREN);
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

	public static class ParametersContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GoodLanguageGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GoodLanguageGrammarParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLanguageGrammarVisitor ) return ((GoodLanguageGrammarVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << PLUS) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << LITERAL) | (1L << NUMBER) | (1L << NAME))) != 0)) {
				{
				setState(141);
				expression();
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(142);
					match(COMMA);
					setState(143);
					expression();
					}
					}
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class VariableDeclarationInsideCodeBlockContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableDeclarationInsideCodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationInsideCodeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).enterVariableDeclarationInsideCodeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).exitVariableDeclarationInsideCodeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLanguageGrammarVisitor ) return ((GoodLanguageGrammarVisitor<? extends T>)visitor).visitVariableDeclarationInsideCodeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationInsideCodeBlockContext variableDeclarationInsideCodeBlock() throws RecognitionException {
		VariableDeclarationInsideCodeBlockContext _localctx = new VariableDeclarationInsideCodeBlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variableDeclarationInsideCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			variableDeclaration();
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

	public static class ExpressionContext extends ParserRuleContext {
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public MinimalPriorityOperatorContext minimalPriorityOperator() {
			return getRuleContext(MinimalPriorityOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLanguageGrammarVisitor ) return ((GoodLanguageGrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			simpleExpression();
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOT_EQUAL) | (1L << GT) | (1L << GTE) | (1L << LT) | (1L << LTE))) != 0)) {
				{
				setState(154);
				minimalPriorityOperator();
				setState(155);
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

	public static class SimpleExpressionContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public MiddlePriorityOperatorContext middlePriorityOperator() {
			return getRuleContext(MiddlePriorityOperatorContext.class,0);
		}
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).enterSimpleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).exitSimpleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLanguageGrammarVisitor ) return ((GoodLanguageGrammarVisitor<? extends T>)visitor).visitSimpleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_simpleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			term();
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << OR))) != 0)) {
				{
				setState(160);
				middlePriorityOperator();
				setState(161);
				simpleExpression();
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

	public static class TermContext extends ParserRuleContext {
		public SignedFactorContext signedFactor() {
			return getRuleContext(SignedFactorContext.class,0);
		}
		public MaximumPriorityOperatorContext maximumPriorityOperator() {
			return getRuleContext(MaximumPriorityOperatorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLanguageGrammarVisitor ) return ((GoodLanguageGrammarVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			signedFactor();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << MOD) | (1L << AND))) != 0)) {
				{
				setState(166);
				maximumPriorityOperator();
				setState(167);
				term();
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

	public static class SignedFactorContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(GoodLanguageGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GoodLanguageGrammarParser.MINUS, 0); }
		public SignedFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).enterSignedFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).exitSignedFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLanguageGrammarVisitor ) return ((GoodLanguageGrammarVisitor<? extends T>)visitor).visitSignedFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignedFactorContext signedFactor() throws RecognitionException {
		SignedFactorContext _localctx = new SignedFactorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_signedFactor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(171);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(174);
			factor();
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

	public static class FactorContext extends ParserRuleContext {
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(GoodLanguageGrammarParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GoodLanguageGrammarParser.RPAREN, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode NOT() { return getToken(GoodLanguageGrammarParser.NOT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLanguageGrammarVisitor ) return ((GoodLanguageGrammarVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_factor);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				varName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(LPAREN);
				setState(178);
				expression();
				setState(179);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				functionCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				match(NOT);
				setState(183);
				factor();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(184);
				bool();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(185);
				value();
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

	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumberConstContext extends ValueContext {
		public TerminalNode NUMBER() { return getToken(GoodLanguageGrammarParser.NUMBER, 0); }
		public NumberConstContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).enterNumberConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).exitNumberConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLanguageGrammarVisitor ) return ((GoodLanguageGrammarVisitor<? extends T>)visitor).visitNumberConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralConstContext extends ValueContext {
		public TerminalNode LITERAL() { return getToken(GoodLanguageGrammarParser.LITERAL, 0); }
		public LiteralConstContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).enterLiteralConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).exitLiteralConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLanguageGrammarVisitor ) return ((GoodLanguageGrammarVisitor<? extends T>)visitor).visitLiteralConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_value);
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new NumberConstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(NUMBER);
				}
				break;
			case LITERAL:
				_localctx = new LiteralConstContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(LITERAL);
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

	public static class VarNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GoodLanguageGrammarParser.NAME, 0); }
		public VarNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).enterVarName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).exitVarName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLanguageGrammarVisitor ) return ((GoodLanguageGrammarVisitor<? extends T>)visitor).visitVarName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarNameContext varName() throws RecognitionException {
		VarNameContext _localctx = new VarNameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_varName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(NAME);
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

	public static class ComplexStatementContext extends ParserRuleContext {
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public ComplexStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).enterComplexStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).exitComplexStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLanguageGrammarVisitor ) return ((GoodLanguageGrammarVisitor<? extends T>)visitor).visitComplexStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexStatementContext complexStatement() throws RecognitionException {
		ComplexStatementContext _localctx = new ComplexStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_complexStatement);
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				codeBlock();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				ifStatement();
				}
				break;
			case FOR:
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				loopStatement();
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GoodLanguageGrammarParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(GoodLanguageGrammarParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GoodLanguageGrammarParser.RPAREN, 0); }
		public List<CodeBlockContext> codeBlock() {
			return getRuleContexts(CodeBlockContext.class);
		}
		public CodeBlockContext codeBlock(int i) {
			return getRuleContext(CodeBlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(GoodLanguageGrammarParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLanguageGrammarVisitor ) return ((GoodLanguageGrammarVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(IF);
			setState(200);
			match(LPAREN);
			setState(201);
			expression();
			setState(202);
			match(RPAREN);
			setState(203);
			codeBlock();
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(204);
				match(ELSE);
				setState(205);
				codeBlock();
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

	public static class LoopStatementContext extends ParserRuleContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).exitLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLanguageGrammarVisitor ) return ((GoodLanguageGrammarVisitor<? extends T>)visitor).visitLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_loopStatement);
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				whileStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				forStatement();
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(GoodLanguageGrammarParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(GoodLanguageGrammarParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GoodLanguageGrammarParser.RPAREN, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLanguageGrammarVisitor ) return ((GoodLanguageGrammarVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(WHILE);
			setState(213);
			match(LPAREN);
			setState(214);
			expression();
			setState(215);
			match(RPAREN);
			setState(216);
			codeBlock();
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

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(GoodLanguageGrammarParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(GoodLanguageGrammarParser.LPAREN, 0); }
		public List<TerminalNode> NAME() { return getTokens(GoodLanguageGrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GoodLanguageGrammarParser.NAME, i);
		}
		public TerminalNode IN() { return getToken(GoodLanguageGrammarParser.IN, 0); }
		public TerminalNode DOUBLEDOT() { return getToken(GoodLanguageGrammarParser.DOUBLEDOT, 0); }
		public TerminalNode RPAREN() { return getToken(GoodLanguageGrammarParser.RPAREN, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public List<TerminalNode> NUMBER() { return getTokens(GoodLanguageGrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(GoodLanguageGrammarParser.NUMBER, i);
		}
		public TerminalNode STEP() { return getToken(GoodLanguageGrammarParser.STEP, 0); }
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLanguageGrammarVisitor ) return ((GoodLanguageGrammarVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(FOR);
			setState(219);
			match(LPAREN);
			setState(220);
			match(NAME);
			setState(221);
			match(IN);
			setState(222);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(223);
			match(DOUBLEDOT);
			setState(224);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STEP) {
				{
				setState(225);
				match(STEP);
				setState(226);
				_la = _input.LA(1);
				if ( !(_la==NUMBER || _la==NAME) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(229);
			match(RPAREN);
			setState(230);
			codeBlock();
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

	public static class MaximumPriorityOperatorContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(GoodLanguageGrammarParser.MULT, 0); }
		public TerminalNode MOD() { return getToken(GoodLanguageGrammarParser.MOD, 0); }
		public TerminalNode AND() { return getToken(GoodLanguageGrammarParser.AND, 0); }
		public MaximumPriorityOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maximumPriorityOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).enterMaximumPriorityOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).exitMaximumPriorityOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLanguageGrammarVisitor ) return ((GoodLanguageGrammarVisitor<? extends T>)visitor).visitMaximumPriorityOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaximumPriorityOperatorContext maximumPriorityOperator() throws RecognitionException {
		MaximumPriorityOperatorContext _localctx = new MaximumPriorityOperatorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_maximumPriorityOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << MOD) | (1L << AND))) != 0)) ) {
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

	public static class MiddlePriorityOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(GoodLanguageGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GoodLanguageGrammarParser.MINUS, 0); }
		public TerminalNode OR() { return getToken(GoodLanguageGrammarParser.OR, 0); }
		public MiddlePriorityOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_middlePriorityOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).enterMiddlePriorityOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).exitMiddlePriorityOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLanguageGrammarVisitor ) return ((GoodLanguageGrammarVisitor<? extends T>)visitor).visitMiddlePriorityOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MiddlePriorityOperatorContext middlePriorityOperator() throws RecognitionException {
		MiddlePriorityOperatorContext _localctx = new MiddlePriorityOperatorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_middlePriorityOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << OR))) != 0)) ) {
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

	public static class MinimalPriorityOperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(GoodLanguageGrammarParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(GoodLanguageGrammarParser.NOT_EQUAL, 0); }
		public TerminalNode LT() { return getToken(GoodLanguageGrammarParser.LT, 0); }
		public TerminalNode LTE() { return getToken(GoodLanguageGrammarParser.LTE, 0); }
		public TerminalNode GTE() { return getToken(GoodLanguageGrammarParser.GTE, 0); }
		public TerminalNode GT() { return getToken(GoodLanguageGrammarParser.GT, 0); }
		public MinimalPriorityOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minimalPriorityOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).enterMinimalPriorityOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).exitMinimalPriorityOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLanguageGrammarVisitor ) return ((GoodLanguageGrammarVisitor<? extends T>)visitor).visitMinimalPriorityOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinimalPriorityOperatorContext minimalPriorityOperator() throws RecognitionException {
		MinimalPriorityOperatorContext _localctx = new MinimalPriorityOperatorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_minimalPriorityOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOT_EQUAL) | (1L << GT) | (1L << GTE) | (1L << LT) | (1L << LTE))) != 0)) ) {
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GoodLanguageGrammarParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(GoodLanguageGrammarParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(GoodLanguageGrammarParser.STRING, 0); }
		public TerminalNode FLOAT() { return getToken(GoodLanguageGrammarParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(GoodLanguageGrammarParser.CHAR, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLanguageGrammarVisitor ) return ((GoodLanguageGrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << FLOAT) | (1L << CHAR))) != 0)) ) {
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

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(GoodLanguageGrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(GoodLanguageGrammarParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLanguageGrammarListener ) ((GoodLanguageGrammarListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLanguageGrammarVisitor ) return ((GoodLanguageGrammarVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u00f5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\3\3\3\7\3H\n\3\f\3\16\3K\13\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6a\n\6\f"+
		"\6\16\6d\13\6\5\6f\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13|\n\13\f\13\16\13\177\13\13\3"+
		"\f\3\f\5\f\u0083\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\7\17\u0093\n\17\f\17\16\17\u0096\13\17\5\17\u0098\n\17"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00a0\n\21\3\22\3\22\3\22\3\22\5\22"+
		"\u00a6\n\22\3\23\3\23\3\23\3\23\5\23\u00ac\n\23\3\24\5\24\u00af\n\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00bd"+
		"\n\25\3\26\3\26\5\26\u00c1\n\26\3\27\3\27\3\30\3\30\3\30\5\30\u00c8\n"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00d1\n\31\3\32\3\32\5\32"+
		"\u00d5\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u00e6\n\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3!\3!\3!\2\2\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\62\64\668:<>@\2\t\3\2\22\23\4\2))++\4\2\24\25\35\35\4\2\22\23"+
		"\34\34\3\2\26\33\3\2\4\b\3\2\37 \2\u00ed\2B\3\2\2\2\4I\3\2\2\2\6N\3\2"+
		"\2\2\bU\3\2\2\2\ne\3\2\2\2\fg\3\2\2\2\16k\3\2\2\2\20q\3\2\2\2\22t\3\2"+
		"\2\2\24}\3\2\2\2\26\u0082\3\2\2\2\30\u0086\3\2\2\2\32\u008a\3\2\2\2\34"+
		"\u0097\3\2\2\2\36\u0099\3\2\2\2 \u009b\3\2\2\2\"\u00a1\3\2\2\2$\u00a7"+
		"\3\2\2\2&\u00ae\3\2\2\2(\u00bc\3\2\2\2*\u00c0\3\2\2\2,\u00c2\3\2\2\2."+
		"\u00c7\3\2\2\2\60\u00c9\3\2\2\2\62\u00d4\3\2\2\2\64\u00d6\3\2\2\2\66\u00dc"+
		"\3\2\2\28\u00ea\3\2\2\2:\u00ec\3\2\2\2<\u00ee\3\2\2\2>\u00f0\3\2\2\2@"+
		"\u00f2\3\2\2\2BC\5\4\3\2CD\7\2\2\3D\3\3\2\2\2EH\5\16\b\2FH\5\6\4\2GE\3"+
		"\2\2\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\5"+
		"\20\t\2M\5\3\2\2\2NO\5> \2OP\7+\2\2PQ\7\13\2\2QR\5\n\6\2RS\7\f\2\2ST\5"+
		"\b\5\2T\7\3\2\2\2UV\7\t\2\2VW\5\24\13\2WX\5\f\7\2XY\7\n\2\2Y\t\3\2\2\2"+
		"Z[\5> \2[b\7+\2\2\\]\7\16\2\2]^\5> \2^_\7+\2\2_a\3\2\2\2`\\\3\2\2\2ad"+
		"\3\2\2\2b`\3\2\2\2bc\3\2\2\2cf\3\2\2\2db\3\2\2\2eZ\3\2\2\2ef\3\2\2\2f"+
		"\13\3\2\2\2gh\7#\2\2hi\5 \21\2ij\7\r\2\2j\r\3\2\2\2kl\5> \2lm\7+\2\2m"+
		"n\7\21\2\2no\5 \21\2op\7\r\2\2p\17\3\2\2\2qr\7\3\2\2rs\5\22\n\2s\21\3"+
		"\2\2\2tu\7\t\2\2uv\5\24\13\2vw\7\n\2\2w\23\3\2\2\2x|\5\26\f\2y|\5.\30"+
		"\2z|\5\36\20\2{x\3\2\2\2{y\3\2\2\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~"+
		"\3\2\2\2~\25\3\2\2\2\177}\3\2\2\2\u0080\u0083\5\30\r\2\u0081\u0083\5\32"+
		"\16\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0085\7\r\2\2\u0085\27\3\2\2\2\u0086\u0087\7+\2\2\u0087\u0088\7\21\2"+
		"\2\u0088\u0089\5 \21\2\u0089\31\3\2\2\2\u008a\u008b\7+\2\2\u008b\u008c"+
		"\7\13\2\2\u008c\u008d\5\34\17\2\u008d\u008e\7\f\2\2\u008e\33\3\2\2\2\u008f"+
		"\u0094\5 \21\2\u0090\u0091\7\16\2\2\u0091\u0093\5 \21\2\u0092\u0090\3"+
		"\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u008f\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\35\3\2\2\2\u0099\u009a\5\16\b\2\u009a\37\3\2\2\2\u009b\u009f"+
		"\5\"\22\2\u009c\u009d\5<\37\2\u009d\u009e\5 \21\2\u009e\u00a0\3\2\2\2"+
		"\u009f\u009c\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0!\3\2\2\2\u00a1\u00a5\5"+
		"$\23\2\u00a2\u00a3\5:\36\2\u00a3\u00a4\5\"\22\2\u00a4\u00a6\3\2\2\2\u00a5"+
		"\u00a2\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6#\3\2\2\2\u00a7\u00ab\5&\24\2"+
		"\u00a8\u00a9\58\35\2\u00a9\u00aa\5$\23\2\u00aa\u00ac\3\2\2\2\u00ab\u00a8"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac%\3\2\2\2\u00ad\u00af\t\2\2\2\u00ae"+
		"\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\5("+
		"\25\2\u00b1\'\3\2\2\2\u00b2\u00bd\5,\27\2\u00b3\u00b4\7\13\2\2\u00b4\u00b5"+
		"\5 \21\2\u00b5\u00b6\7\f\2\2\u00b6\u00bd\3\2\2\2\u00b7\u00bd\5\32\16\2"+
		"\u00b8\u00b9\7\36\2\2\u00b9\u00bd\5(\25\2\u00ba\u00bd\5@!\2\u00bb\u00bd"+
		"\5*\26\2\u00bc\u00b2\3\2\2\2\u00bc\u00b3\3\2\2\2\u00bc\u00b7\3\2\2\2\u00bc"+
		"\u00b8\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd)\3\2\2\2"+
		"\u00be\u00c1\7)\2\2\u00bf\u00c1\7(\2\2\u00c0\u00be\3\2\2\2\u00c0\u00bf"+
		"\3\2\2\2\u00c1+\3\2\2\2\u00c2\u00c3\7+\2\2\u00c3-\3\2\2\2\u00c4\u00c8"+
		"\5\22\n\2\u00c5\u00c8\5\60\31\2\u00c6\u00c8\5\62\32\2\u00c7\u00c4\3\2"+
		"\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8/\3\2\2\2\u00c9\u00ca"+
		"\7!\2\2\u00ca\u00cb\7\13\2\2\u00cb\u00cc\5 \21\2\u00cc\u00cd\7\f\2\2\u00cd"+
		"\u00d0\5\22\n\2\u00ce\u00cf\7\"\2\2\u00cf\u00d1\5\22\n\2\u00d0\u00ce\3"+
		"\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\61\3\2\2\2\u00d2\u00d5\5\64\33\2\u00d3"+
		"\u00d5\5\66\34\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\63\3\2"+
		"\2\2\u00d6\u00d7\7%\2\2\u00d7\u00d8\7\13\2\2\u00d8\u00d9\5 \21\2\u00d9"+
		"\u00da\7\f\2\2\u00da\u00db\5\22\n\2\u00db\65\3\2\2\2\u00dc\u00dd\7$\2"+
		"\2\u00dd\u00de\7\13\2\2\u00de\u00df\7+\2\2\u00df\u00e0\7&\2\2\u00e0\u00e1"+
		"\t\3\2\2\u00e1\u00e2\7\20\2\2\u00e2\u00e5\t\3\2\2\u00e3\u00e4\7\'\2\2"+
		"\u00e4\u00e6\t\3\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7"+
		"\3\2\2\2\u00e7\u00e8\7\f\2\2\u00e8\u00e9\5\22\n\2\u00e9\67\3\2\2\2\u00ea"+
		"\u00eb\t\4\2\2\u00eb9\3\2\2\2\u00ec\u00ed\t\5\2\2\u00ed;\3\2\2\2\u00ee"+
		"\u00ef\t\6\2\2\u00ef=\3\2\2\2\u00f0\u00f1\t\7\2\2\u00f1?\3\2\2\2\u00f2"+
		"\u00f3\t\b\2\2\u00f3A\3\2\2\2\25GIbe{}\u0082\u0094\u0097\u009f\u00a5\u00ab"+
		"\u00ae\u00bc\u00c0\u00c7\u00d0\u00d4\u00e5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}