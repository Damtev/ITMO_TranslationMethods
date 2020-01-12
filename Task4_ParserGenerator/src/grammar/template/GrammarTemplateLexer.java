// Generated from /media/damtev/Storage/ITMO/ITMO_MT/Task4_ParserGenerator/GrammarTemplate.g4 by ANTLR 4.7.2
package grammar.template;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarTemplateLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ARROW=1, SEMICOLON=2, PERCENT=3, DOG=4, ATTR=5, NODE=6, ATTRIBUTE_VALUE=7, 
		NODE_VALUE=8, SEMANTIC_RULE=9, TOKEN_NAME=10, RULE_NAME=11, LITERAL=12, 
		WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ARROW", "SEMICOLON", "PERCENT", "DOG", "ATTR", "NODE", "ATTRIBUTE_VALUE", 
			"NODE_VALUE", "SEMANTIC_RULE", "TOKEN_NAME", "RULE_NAME", "LITERAL", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'->'", "';'", "'%'", "'@'", "'Attr'", "'Node'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ARROW", "SEMICOLON", "PERCENT", "DOG", "ATTR", "NODE", "ATTRIBUTE_VALUE", 
			"NODE_VALUE", "SEMANTIC_RULE", "TOKEN_NAME", "RULE_NAME", "LITERAL", 
			"WS"
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


	public GrammarTemplateLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GrammarTemplate.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17m\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\7\b\65\n\b\f\b\16"+
		"\b8\13\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t@\n\t\f\t\16\tC\13\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\7\nK\n\n\f\n\16\nN\13\n\3\n\3\n\3\13\3\13\6\13T\n\13\r\13\16"+
		"\13U\3\f\3\f\7\fZ\n\f\f\f\16\f]\13\f\3\r\3\r\3\r\3\r\7\rc\n\r\f\r\16\r"+
		"f\13\r\3\r\3\r\3\16\3\16\3\16\3\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\3\2\t\3\2\'\'\3\2BB\3\2&&\5\2\62;"+
		"C\\aa\5\2\62;C\\a|\3\2))\5\2\13\f\17\17\"\"\2v\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\3\35\3\2\2\2\5 \3\2\2\2\7\"\3\2\2\2\t$\3\2\2\2\13&\3\2\2\2\r+\3\2\2"+
		"\2\17\60\3\2\2\2\21;\3\2\2\2\23F\3\2\2\2\25Q\3\2\2\2\27W\3\2\2\2\31^\3"+
		"\2\2\2\33i\3\2\2\2\35\36\7/\2\2\36\37\7@\2\2\37\4\3\2\2\2 !\7=\2\2!\6"+
		"\3\2\2\2\"#\7\'\2\2#\b\3\2\2\2$%\7B\2\2%\n\3\2\2\2&\'\7C\2\2\'(\7v\2\2"+
		"()\7v\2\2)*\7t\2\2*\f\3\2\2\2+,\7P\2\2,-\7q\2\2-.\7f\2\2./\7g\2\2/\16"+
		"\3\2\2\2\60\66\7\'\2\2\61\62\7\'\2\2\62\65\7\'\2\2\63\65\n\2\2\2\64\61"+
		"\3\2\2\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2"+
		"\2\28\66\3\2\2\29:\7\'\2\2:\20\3\2\2\2;A\7B\2\2<=\7B\2\2=@\7B\2\2>@\n"+
		"\3\2\2?<\3\2\2\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3"+
		"\2\2\2DE\7B\2\2E\22\3\2\2\2FL\7&\2\2GH\7&\2\2HK\7&\2\2IK\n\4\2\2JG\3\2"+
		"\2\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\7&"+
		"\2\2P\24\3\2\2\2QS\4C\\\2RT\t\5\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3"+
		"\2\2\2V\26\3\2\2\2W[\4c|\2XZ\t\6\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\"+
		"\3\2\2\2\\\30\3\2\2\2][\3\2\2\2^d\7)\2\2_`\7)\2\2`c\7)\2\2ac\n\7\2\2b"+
		"_\3\2\2\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2"+
		"gh\7)\2\2h\32\3\2\2\2ij\t\b\2\2jk\3\2\2\2kl\b\16\2\2l\34\3\2\2\2\r\2\64"+
		"\66?AJLU[bd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}