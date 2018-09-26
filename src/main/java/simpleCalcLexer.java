// Generated from C:/Users/Christian/IdeaProjects/CompilerAlf1/src/main/java\simpleCalc.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class simpleCalcLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		BOOLEAN=10, OPERATORLVL1=11, OPERATORLVL2=12, NUM=13, ID=14, WHITESPACE=15, 
		COMMENT=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"BOOLEAN", "OPERATORLVL1", "OPERATORLVL2", "NUM", "ID", "WHITESPACE", 
		"COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "';'", "'while('", "')'", "'='", "'('", "'if('", "'else'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "BOOLEAN", 
		"OPERATORLVL1", "OPERATORLVL2", "NUM", "ID", "WHITESPACE", "COMMENT"
	};
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


	public simpleCalcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "simpleCalc.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22j\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\5\13I\n\13\3\f\3\f\3\r\3\r\3\16\6\16P\n\16\r\16\16\16Q\3\17\6"+
		"\17U\n\17\r\17\16\17V\3\20\6\20Z\n\20\r\20\16\20[\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\7\21d\n\21\f\21\16\21g\13\21\3\21\3\21\2\2\22\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22\3\2"+
		"\b\4\2>>@@\4\2,,\61\61\4\2--//\4\2C\\c|\5\2\13\f\17\17\"\"\3\2\f\f\2q"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2"+
		"\2\2\5%\3\2\2\2\7\'\3\2\2\2\t)\3\2\2\2\13\60\3\2\2\2\r\62\3\2\2\2\17\64"+
		"\3\2\2\2\21\66\3\2\2\2\23:\3\2\2\2\25H\3\2\2\2\27J\3\2\2\2\31L\3\2\2\2"+
		"\33O\3\2\2\2\35T\3\2\2\2\37Y\3\2\2\2!_\3\2\2\2#$\7}\2\2$\4\3\2\2\2%&\7"+
		"\177\2\2&\6\3\2\2\2\'(\7=\2\2(\b\3\2\2\2)*\7y\2\2*+\7j\2\2+,\7k\2\2,-"+
		"\7n\2\2-.\7g\2\2./\7*\2\2/\n\3\2\2\2\60\61\7+\2\2\61\f\3\2\2\2\62\63\7"+
		"?\2\2\63\16\3\2\2\2\64\65\7*\2\2\65\20\3\2\2\2\66\67\7k\2\2\678\7h\2\2"+
		"89\7*\2\29\22\3\2\2\2:;\7g\2\2;<\7n\2\2<=\7u\2\2=>\7g\2\2>\24\3\2\2\2"+
		"?@\7?\2\2@I\7?\2\2AI\t\2\2\2BC\7#\2\2CI\7?\2\2DE\7(\2\2EI\7(\2\2FG\7~"+
		"\2\2GI\7~\2\2H?\3\2\2\2HA\3\2\2\2HB\3\2\2\2HD\3\2\2\2HF\3\2\2\2I\26\3"+
		"\2\2\2JK\t\3\2\2K\30\3\2\2\2LM\t\4\2\2M\32\3\2\2\2NP\4\62;\2ON\3\2\2\2"+
		"PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\34\3\2\2\2SU\t\5\2\2TS\3\2\2\2UV\3\2\2"+
		"\2VT\3\2\2\2VW\3\2\2\2W\36\3\2\2\2XZ\t\6\2\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2"+
		"\2\2[\\\3\2\2\2\\]\3\2\2\2]^\b\20\2\2^ \3\2\2\2_`\7\61\2\2`a\7\61\2\2"+
		"ae\3\2\2\2bd\n\7\2\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2"+
		"ge\3\2\2\2hi\b\21\2\2i\"\3\2\2\2\b\2HQV[e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}