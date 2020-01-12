// Generated from /media/damtev/Storage/ITMO/ITMO_MT/Task3_OwnLanguage/GoodLanguageGrammar.g4 by ANTLR 4.7.2
package gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GoodLanguageGrammarLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MAIN", "INT", "BOOL", "STRING", "FLOAT", "CHAR", "LCURLY", "RCURLY", 
			"LPAREN", "RPAREN", "SEMICOLON", "COMMA", "DOT", "DOUBLEDOT", "ASSIGN", 
			"PLUS", "MINUS", "MULT", "MOD", "EQUAL", "NOT_EQUAL", "GT", "GTE", "LT", 
			"LTE", "OR", "AND", "NOT", "TRUE", "FALSE", "IF", "ELSE", "RETURN", "FOR", 
			"WHILE", "IN", "STEP", "LITERAL", "DIGITS", "SIGN", "NUMBER", "INTEGER", 
			"NAME", "WS"
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


	public GoodLanguageGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GoodLanguageGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u0103\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#"+
		"\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\7\'\u00dd"+
		"\n\'\f\'\16\'\u00e0\13\'\3\'\3\'\3(\6(\u00e5\n(\r(\16(\u00e6\3)\3)\3*"+
		"\5*\u00ec\n*\3*\3*\3*\3*\5*\u00f2\n*\3+\5+\u00f5\n+\3+\3+\3,\3,\7,\u00fb"+
		"\n,\f,\16,\u00fe\13,\3-\3-\3-\3-\2\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O\2Q\2S)U*W+Y"+
		",\3\2\7\3\2))\4\2--//\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u0107"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\3[\3\2\2\2\5`\3\2\2\2\7d\3\2\2\2\ti\3\2\2\2\13p\3\2\2\2\rv\3"+
		"\2\2\2\17{\3\2\2\2\21}\3\2\2\2\23\177\3\2\2\2\25\u0081\3\2\2\2\27\u0083"+
		"\3\2\2\2\31\u0085\3\2\2\2\33\u0087\3\2\2\2\35\u0089\3\2\2\2\37\u008c\3"+
		"\2\2\2!\u008e\3\2\2\2#\u0090\3\2\2\2%\u0092\3\2\2\2\'\u0094\3\2\2\2)\u0096"+
		"\3\2\2\2+\u0099\3\2\2\2-\u009c\3\2\2\2/\u009e\3\2\2\2\61\u00a1\3\2\2\2"+
		"\63\u00a3\3\2\2\2\65\u00a6\3\2\2\2\67\u00a8\3\2\2\29\u00aa\3\2\2\2;\u00ac"+
		"\3\2\2\2=\u00b1\3\2\2\2?\u00b7\3\2\2\2A\u00ba\3\2\2\2C\u00bf\3\2\2\2E"+
		"\u00c6\3\2\2\2G\u00ca\3\2\2\2I\u00d0\3\2\2\2K\u00d3\3\2\2\2M\u00d8\3\2"+
		"\2\2O\u00e4\3\2\2\2Q\u00e8\3\2\2\2S\u00eb\3\2\2\2U\u00f4\3\2\2\2W\u00f8"+
		"\3\2\2\2Y\u00ff\3\2\2\2[\\\7o\2\2\\]\7c\2\2]^\7k\2\2^_\7p\2\2_\4\3\2\2"+
		"\2`a\7k\2\2ab\7p\2\2bc\7v\2\2c\6\3\2\2\2de\7d\2\2ef\7q\2\2fg\7q\2\2gh"+
		"\7n\2\2h\b\3\2\2\2ij\7u\2\2jk\7v\2\2kl\7t\2\2lm\7k\2\2mn\7p\2\2no\7i\2"+
		"\2o\n\3\2\2\2pq\7h\2\2qr\7n\2\2rs\7q\2\2st\7c\2\2tu\7v\2\2u\f\3\2\2\2"+
		"vw\7e\2\2wx\7j\2\2xy\7c\2\2yz\7t\2\2z\16\3\2\2\2{|\7}\2\2|\20\3\2\2\2"+
		"}~\7\177\2\2~\22\3\2\2\2\177\u0080\7*\2\2\u0080\24\3\2\2\2\u0081\u0082"+
		"\7+\2\2\u0082\26\3\2\2\2\u0083\u0084\7=\2\2\u0084\30\3\2\2\2\u0085\u0086"+
		"\7.\2\2\u0086\32\3\2\2\2\u0087\u0088\7\60\2\2\u0088\34\3\2\2\2\u0089\u008a"+
		"\7\60\2\2\u008a\u008b\7\60\2\2\u008b\36\3\2\2\2\u008c\u008d\7?\2\2\u008d"+
		" \3\2\2\2\u008e\u008f\7-\2\2\u008f\"\3\2\2\2\u0090\u0091\7/\2\2\u0091"+
		"$\3\2\2\2\u0092\u0093\7,\2\2\u0093&\3\2\2\2\u0094\u0095\7\'\2\2\u0095"+
		"(\3\2\2\2\u0096\u0097\7?\2\2\u0097\u0098\7?\2\2\u0098*\3\2\2\2\u0099\u009a"+
		"\7#\2\2\u009a\u009b\7?\2\2\u009b,\3\2\2\2\u009c\u009d\7@\2\2\u009d.\3"+
		"\2\2\2\u009e\u009f\7@\2\2\u009f\u00a0\7?\2\2\u00a0\60\3\2\2\2\u00a1\u00a2"+
		"\7>\2\2\u00a2\62\3\2\2\2\u00a3\u00a4\7>\2\2\u00a4\u00a5\7?\2\2\u00a5\64"+
		"\3\2\2\2\u00a6\u00a7\7~\2\2\u00a7\66\3\2\2\2\u00a8\u00a9\7(\2\2\u00a9"+
		"8\3\2\2\2\u00aa\u00ab\7#\2\2\u00ab:\3\2\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae"+
		"\7t\2\2\u00ae\u00af\7w\2\2\u00af\u00b0\7g\2\2\u00b0<\3\2\2\2\u00b1\u00b2"+
		"\7h\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7n\2\2\u00b4\u00b5\7u\2\2\u00b5"+
		"\u00b6\7g\2\2\u00b6>\3\2\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9\7h\2\2\u00b9"+
		"@\3\2\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7n\2\2\u00bc\u00bd\7u\2\2\u00bd"+
		"\u00be\7g\2\2\u00beB\3\2\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7g\2\2\u00c1"+
		"\u00c2\7v\2\2\u00c2\u00c3\7w\2\2\u00c3\u00c4\7t\2\2\u00c4\u00c5\7p\2\2"+
		"\u00c5D\3\2\2\2\u00c6\u00c7\7h\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7t\2"+
		"\2\u00c9F\3\2\2\2\u00ca\u00cb\7y\2\2\u00cb\u00cc\7j\2\2\u00cc\u00cd\7"+
		"k\2\2\u00cd\u00ce\7n\2\2\u00ce\u00cf\7g\2\2\u00cfH\3\2\2\2\u00d0\u00d1"+
		"\7k\2\2\u00d1\u00d2\7p\2\2\u00d2J\3\2\2\2\u00d3\u00d4\7u\2\2\u00d4\u00d5"+
		"\7v\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7r\2\2\u00d7L\3\2\2\2\u00d8\u00de"+
		"\7)\2\2\u00d9\u00da\7)\2\2\u00da\u00dd\7)\2\2\u00db\u00dd\n\2\2\2\u00dc"+
		"\u00d9\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2"+
		"\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1"+
		"\u00e2\7)\2\2\u00e2N\3\2\2\2\u00e3\u00e5\4\62;\2\u00e4\u00e3\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7P\3\2\2\2"+
		"\u00e8\u00e9\t\3\2\2\u00e9R\3\2\2\2\u00ea\u00ec\5Q)\2\u00eb\u00ea\3\2"+
		"\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f1\5O(\2\u00ee\u00ef"+
		"\5\33\16\2\u00ef\u00f0\5O(\2\u00f0\u00f2\3\2\2\2\u00f1\u00ee\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2T\3\2\2\2\u00f3\u00f5\5Q)\2\u00f4\u00f3\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\5O(\2\u00f7V\3\2\2\2\u00f8"+
		"\u00fc\t\4\2\2\u00f9\u00fb\t\5\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2"+
		"\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fdX\3\2\2\2\u00fe\u00fc"+
		"\3\2\2\2\u00ff\u0100\t\6\2\2\u0100\u0101\3\2\2\2\u0101\u0102\b-\2\2\u0102"+
		"Z\3\2\2\2\n\2\u00dc\u00de\u00e6\u00eb\u00f1\u00f4\u00fc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}