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
		T__9=10, T__10=11, BOOLEANLVL1=12, BOOLEANLVL2=13, OPERATORLVL1=14, OPERATORLVL2=15, 
		NUM=16, ID=17, WHITESPACE=18, COMMENT=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "BOOLEANLVL1", "BOOLEANLVL2", "OPERATORLVL1", "OPERATORLVL2", 
		"NUM", "ID", "WHITESPACE", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'='", "';'", "'if('", "')'", "'else'", "'while('", 
		"'('", "'&&'", "'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"BOOLEANLVL1", "BOOLEANLVL2", "OPERATORLVL1", "OPERATORLVL2", "NUM", "ID", 
		"WHITESPACE", "COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25s\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\5\16R\n\16\3\17\3\17"+
		"\3\20\3\20\3\21\6\21Y\n\21\r\21\16\21Z\3\22\6\22^\n\22\r\22\16\22_\3\23"+
		"\6\23c\n\23\r\23\16\23d\3\23\3\23\3\24\3\24\3\24\3\24\7\24m\n\24\f\24"+
		"\16\24p\13\24\3\24\3\24\2\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25\3\2\b\4\2>>@@\4\2"+
		",,\61\61\4\2--//\4\2C\\c|\5\2\13\f\17\17\"\"\3\2\f\f\2w\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\3)\3\2\2\2\5+\3\2\2\2\7-\3\2\2\2\t/\3\2\2\2\13\61\3\2\2\2"+
		"\r\65\3\2\2\2\17\67\3\2\2\2\21<\3\2\2\2\23C\3\2\2\2\25E\3\2\2\2\27H\3"+
		"\2\2\2\31K\3\2\2\2\33Q\3\2\2\2\35S\3\2\2\2\37U\3\2\2\2!X\3\2\2\2#]\3\2"+
		"\2\2%b\3\2\2\2\'h\3\2\2\2)*\7}\2\2*\4\3\2\2\2+,\7\177\2\2,\6\3\2\2\2-"+
		".\7?\2\2.\b\3\2\2\2/\60\7=\2\2\60\n\3\2\2\2\61\62\7k\2\2\62\63\7h\2\2"+
		"\63\64\7*\2\2\64\f\3\2\2\2\65\66\7+\2\2\66\16\3\2\2\2\678\7g\2\289\7n"+
		"\2\29:\7u\2\2:;\7g\2\2;\20\3\2\2\2<=\7y\2\2=>\7j\2\2>?\7k\2\2?@\7n\2\2"+
		"@A\7g\2\2AB\7*\2\2B\22\3\2\2\2CD\7*\2\2D\24\3\2\2\2EF\7(\2\2FG\7(\2\2"+
		"G\26\3\2\2\2HI\7~\2\2IJ\7~\2\2J\30\3\2\2\2KL\t\2\2\2L\32\3\2\2\2MN\7?"+
		"\2\2NR\7?\2\2OP\7#\2\2PR\7?\2\2QM\3\2\2\2QO\3\2\2\2R\34\3\2\2\2ST\t\3"+
		"\2\2T\36\3\2\2\2UV\t\4\2\2V \3\2\2\2WY\4\62;\2XW\3\2\2\2YZ\3\2\2\2ZX\3"+
		"\2\2\2Z[\3\2\2\2[\"\3\2\2\2\\^\t\5\2\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2"+
		"_`\3\2\2\2`$\3\2\2\2ac\t\6\2\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2"+
		"ef\3\2\2\2fg\b\23\2\2g&\3\2\2\2hi\7\61\2\2ij\7\61\2\2jn\3\2\2\2km\n\7"+
		"\2\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\b\24"+
		"\2\2r(\3\2\2\2\b\2QZ_dn\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}