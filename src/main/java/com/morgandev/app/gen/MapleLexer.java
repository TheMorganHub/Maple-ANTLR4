// Generated from C:/Users/Morgan/IdeaProjects/AntlrProj/src/main/antlr/com/morgandev/maple/Maple\Maple.g4 by ANTLR 4.7.2
package com.morgandev.app.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MapleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, K_SELECT=17, 
		K_INSERT=18, K_UPDATE=19, K_JOIN=20, K_CREATE_TABLE=21, K_OPEN_SQL_STMT=22, 
		K_CLOSE_SQL_STMT=23, K_WHERE=24, K_AND=25, K_NOTBETWEEN=26, K_BETWEEN=27, 
		K_IN=28, K_INNER=29, K_INTO=30, K_IS=31, K_ISNULL=32, K_ISNOTNULL=33, 
		K_ISNOT=34, K_NOTIN=35, K_NOTLIKE=36, K_LIKE=37, K_LIMIT=38, K_NOT=39, 
		K_NOTNULL=40, K_NULL=41, K_OF=42, K_ON=43, K_OR=44, K_WHEN=45, K_WITH=46, 
		K_WITHOUT=47, NUMERIC_LITERAL=48, STRING_LITERAL=49, SINGLE_LINE_COMMENT=50, 
		MULTILINE_COMMENT=51, SPACES=52, WORD=53, DIGIT=54;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "K_SELECT", 
			"K_INSERT", "K_UPDATE", "K_JOIN", "K_CREATE_TABLE", "K_OPEN_SQL_STMT", 
			"K_CLOSE_SQL_STMT", "K_WHERE", "K_AND", "K_NOTBETWEEN", "K_BETWEEN", 
			"K_IN", "K_INNER", "K_INTO", "K_IS", "K_ISNULL", "K_ISNOTNULL", "K_ISNOT", 
			"K_NOTIN", "K_NOTLIKE", "K_LIKE", "K_LIMIT", "K_NOT", "K_NOTNULL", "K_NULL", 
			"K_OF", "K_ON", "K_OR", "K_WHEN", "K_WITH", "K_WITHOUT", "NUMERIC_LITERAL", 
			"STRING_LITERAL", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES", 
			"WORD", "DIGIT", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", 
			"L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", 
			"Z"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "'.'", "'('", "')'", "'*'", "'/'", "'%'", "'-'", 
			"'='", "'=='", "'!='", "'<='", "'>='", "'AND'", "'OR'", "'>'", "'<'", 
			"'<<'", "'<>'", "'+'", "'<?'", "'?>'", "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "K_SELECT", "K_INSERT", "K_UPDATE", "K_JOIN", 
			"K_CREATE_TABLE", "K_OPEN_SQL_STMT", "K_CLOSE_SQL_STMT", "K_WHERE", "K_AND", 
			"K_NOTBETWEEN", "K_BETWEEN", "K_IN", "K_INNER", "K_INTO", "K_IS", "K_ISNULL", 
			"K_ISNOTNULL", "K_ISNOT", "K_NOTIN", "K_NOTLIKE", "K_LIKE", "K_LIMIT", 
			"K_NOT", "K_NOTNULL", "K_NULL", "K_OF", "K_ON", "K_OR", "K_WHEN", "K_WITH", 
			"K_WITHOUT", "NUMERIC_LITERAL", "STRING_LITERAL", "SINGLE_LINE_COMMENT", 
			"MULTILINE_COMMENT", "SPACES", "WORD", "DIGIT"
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


	public MapleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Maple.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u01ff\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3"+
		"\33\6\33\u00e5\n\33\r\33\16\33\u00e6\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\6!\u0107\n!\r!\16!\u0108\3!\3!\3!\3"+
		"!\3!\3\"\3\"\3\"\3#\3#\3#\6#\u0116\n#\r#\16#\u0117\3#\3#\3#\3#\3$\3$\3"+
		"$\3$\6$\u0122\n$\r$\16$\u0123\3$\3$\3$\3%\3%\3%\3%\6%\u012d\n%\r%\16%"+
		"\u012e\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)"+
		"\3)\3)\6)\u0146\n)\r)\16)\u0147\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3"+
		"+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\61\6\61\u0170\n\61\r\61\16\61\u0171\3\61\3\61\7"+
		"\61\u0176\n\61\f\61\16\61\u0179\13\61\5\61\u017b\n\61\3\61\3\61\5\61\u017f"+
		"\n\61\3\61\6\61\u0182\n\61\r\61\16\61\u0183\5\61\u0186\n\61\3\61\3\61"+
		"\6\61\u018a\n\61\r\61\16\61\u018b\3\61\3\61\5\61\u0190\n\61\3\61\6\61"+
		"\u0193\n\61\r\61\16\61\u0194\5\61\u0197\n\61\5\61\u0199\n\61\3\62\3\62"+
		"\3\62\3\62\7\62\u019f\n\62\f\62\16\62\u01a2\13\62\3\62\3\62\3\63\3\63"+
		"\3\63\3\63\7\63\u01aa\n\63\f\63\16\63\u01ad\13\63\3\63\3\63\3\64\3\64"+
		"\3\64\3\64\7\64\u01b5\n\64\f\64\16\64\u01b8\13\64\3\64\3\64\3\64\5\64"+
		"\u01bd\n\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\6\66\u01c6\n\66\r\66\16"+
		"\66\u01c7\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3"+
		"@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3"+
		"K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3\u01b6\2R\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o\2q\2s\2u\2w\2y\2{\2}"+
		"\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b\2\u008d\2\u008f"+
		"\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099\2\u009b\2\u009d\2\u009f\2\u00a1"+
		"\2\3\2\"\4\2--//\3\2))\4\2\f\f\17\17\5\2\13\r\17\17\"\"\4\2C\\c|\3\2\62"+
		";\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2"+
		"KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4"+
		"\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\"+
		"||\2\u01fb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2"+
		"\2m\3\2\2\2\3\u00a3\3\2\2\2\5\u00a5\3\2\2\2\7\u00a7\3\2\2\2\t\u00a9\3"+
		"\2\2\2\13\u00ab\3\2\2\2\r\u00ad\3\2\2\2\17\u00af\3\2\2\2\21\u00b1\3\2"+
		"\2\2\23\u00b3\3\2\2\2\25\u00b5\3\2\2\2\27\u00b7\3\2\2\2\31\u00ba\3\2\2"+
		"\2\33\u00bd\3\2\2\2\35\u00c0\3\2\2\2\37\u00c3\3\2\2\2!\u00c7\3\2\2\2#"+
		"\u00ca\3\2\2\2%\u00cc\3\2\2\2\'\u00ce\3\2\2\2)\u00d1\3\2\2\2+\u00d4\3"+
		"\2\2\2-\u00d6\3\2\2\2/\u00d9\3\2\2\2\61\u00dc\3\2\2\2\63\u00de\3\2\2\2"+
		"\65\u00e2\3\2\2\2\67\u00ea\3\2\2\29\u00f2\3\2\2\2;\u00f5\3\2\2\2=\u00fb"+
		"\3\2\2\2?\u0100\3\2\2\2A\u0103\3\2\2\2C\u010f\3\2\2\2E\u0112\3\2\2\2G"+
		"\u011d\3\2\2\2I\u0128\3\2\2\2K\u0132\3\2\2\2M\u0137\3\2\2\2O\u013d\3\2"+
		"\2\2Q\u0141\3\2\2\2S\u014e\3\2\2\2U\u0153\3\2\2\2W\u0156\3\2\2\2Y\u0159"+
		"\3\2\2\2[\u015c\3\2\2\2]\u0161\3\2\2\2_\u0166\3\2\2\2a\u0198\3\2\2\2c"+
		"\u019a\3\2\2\2e\u01a5\3\2\2\2g\u01b0\3\2\2\2i\u01c0\3\2\2\2k\u01c5\3\2"+
		"\2\2m\u01c9\3\2\2\2o\u01cb\3\2\2\2q\u01cd\3\2\2\2s\u01cf\3\2\2\2u\u01d1"+
		"\3\2\2\2w\u01d3\3\2\2\2y\u01d5\3\2\2\2{\u01d7\3\2\2\2}\u01d9\3\2\2\2\177"+
		"\u01db\3\2\2\2\u0081\u01dd\3\2\2\2\u0083\u01df\3\2\2\2\u0085\u01e1\3\2"+
		"\2\2\u0087\u01e3\3\2\2\2\u0089\u01e5\3\2\2\2\u008b\u01e7\3\2\2\2\u008d"+
		"\u01e9\3\2\2\2\u008f\u01eb\3\2\2\2\u0091\u01ed\3\2\2\2\u0093\u01ef\3\2"+
		"\2\2\u0095\u01f1\3\2\2\2\u0097\u01f3\3\2\2\2\u0099\u01f5\3\2\2\2\u009b"+
		"\u01f7\3\2\2\2\u009d\u01f9\3\2\2\2\u009f\u01fb\3\2\2\2\u00a1\u01fd\3\2"+
		"\2\2\u00a3\u00a4\7=\2\2\u00a4\4\3\2\2\2\u00a5\u00a6\7.\2\2\u00a6\6\3\2"+
		"\2\2\u00a7\u00a8\7\60\2\2\u00a8\b\3\2\2\2\u00a9\u00aa\7*\2\2\u00aa\n\3"+
		"\2\2\2\u00ab\u00ac\7+\2\2\u00ac\f\3\2\2\2\u00ad\u00ae\7,\2\2\u00ae\16"+
		"\3\2\2\2\u00af\u00b0\7\61\2\2\u00b0\20\3\2\2\2\u00b1\u00b2\7\'\2\2\u00b2"+
		"\22\3\2\2\2\u00b3\u00b4\7/\2\2\u00b4\24\3\2\2\2\u00b5\u00b6\7?\2\2\u00b6"+
		"\26\3\2\2\2\u00b7\u00b8\7?\2\2\u00b8\u00b9\7?\2\2\u00b9\30\3\2\2\2\u00ba"+
		"\u00bb\7#\2\2\u00bb\u00bc\7?\2\2\u00bc\32\3\2\2\2\u00bd\u00be\7>\2\2\u00be"+
		"\u00bf\7?\2\2\u00bf\34\3\2\2\2\u00c0\u00c1\7@\2\2\u00c1\u00c2\7?\2\2\u00c2"+
		"\36\3\2\2\2\u00c3\u00c4\7C\2\2\u00c4\u00c5\7P\2\2\u00c5\u00c6\7F\2\2\u00c6"+
		" \3\2\2\2\u00c7\u00c8\7Q\2\2\u00c8\u00c9\7T\2\2\u00c9\"\3\2\2\2\u00ca"+
		"\u00cb\7@\2\2\u00cb$\3\2\2\2\u00cc\u00cd\7>\2\2\u00cd&\3\2\2\2\u00ce\u00cf"+
		"\7>\2\2\u00cf\u00d0\7>\2\2\u00d0(\3\2\2\2\u00d1\u00d2\7>\2\2\u00d2\u00d3"+
		"\7@\2\2\u00d3*\3\2\2\2\u00d4\u00d5\7-\2\2\u00d5,\3\2\2\2\u00d6\u00d7\7"+
		">\2\2\u00d7\u00d8\7A\2\2\u00d8.\3\2\2\2\u00d9\u00da\7A\2\2\u00da\u00db"+
		"\7@\2\2\u00db\60\3\2\2\2\u00dc\u00dd\7A\2\2\u00dd\62\3\2\2\2\u00de\u00df"+
		"\5o8\2\u00df\u00e0\5\u0089E\2\u00e0\u00e1\5u;\2\u00e1\64\3\2\2\2\u00e2"+
		"\u00e4\5O(\2\u00e3\u00e5\5i\65\2\u00e4\u00e3\3\2\2\2\u00e5\u00e6\3\2\2"+
		"\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9"+
		"\5\67\34\2\u00e9\66\3\2\2\2\u00ea\u00eb\5q9\2\u00eb\u00ec\5w<\2\u00ec"+
		"\u00ed\5\u0095K\2\u00ed\u00ee\5\u009bN\2\u00ee\u00ef\5w<\2\u00ef\u00f0"+
		"\5w<\2\u00f0\u00f1\5\u0089E\2\u00f18\3\2\2\2\u00f2\u00f3\5\177@\2\u00f3"+
		"\u00f4\5\u0089E\2\u00f4:\3\2\2\2\u00f5\u00f6\5\177@\2\u00f6\u00f7\5\u0089"+
		"E\2\u00f7\u00f8\5\u0089E\2\u00f8\u00f9\5w<\2\u00f9\u00fa\5\u0091I\2\u00fa"+
		"<\3\2\2\2\u00fb\u00fc\5\177@\2\u00fc\u00fd\5\u0089E\2\u00fd\u00fe\5\u0095"+
		"K\2\u00fe\u00ff\5\u008bF\2\u00ff>\3\2\2\2\u0100\u0101\5\177@\2\u0101\u0102"+
		"\5\u0093J\2\u0102@\3\2\2\2\u0103\u0104\5\177@\2\u0104\u0106\5\u0093J\2"+
		"\u0105\u0107\5i\65\2\u0106\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0106"+
		"\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\5\u0089E"+
		"\2\u010b\u010c\5\u0097L\2\u010c\u010d\5\u0085C\2\u010d\u010e\5\u0085C"+
		"\2\u010eB\3\2\2\2\u010f\u0110\5E#\2\u0110\u0111\5S*\2\u0111D\3\2\2\2\u0112"+
		"\u0113\5\177@\2\u0113\u0115\5\u0093J\2\u0114\u0116\5i\65\2\u0115\u0114"+
		"\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119\u011a\5\u0089E\2\u011a\u011b\5\u008bF\2\u011b\u011c"+
		"\5\u0095K\2\u011cF\3\2\2\2\u011d\u011e\5\u0089E\2\u011e\u011f\5\u008b"+
		"F\2\u011f\u0121\5\u0095K\2\u0120\u0122\5i\65\2\u0121\u0120\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2"+
		"\2\2\u0125\u0126\5\177@\2\u0126\u0127\5\u0089E\2\u0127H\3\2\2\2\u0128"+
		"\u0129\5\u0089E\2\u0129\u012a\5\u008bF\2\u012a\u012c\5\u0095K\2\u012b"+
		"\u012d\5i\65\2\u012c\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012c\3\2"+
		"\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\5K&\2\u0131J"+
		"\3\2\2\2\u0132\u0133\5\u0085C\2\u0133\u0134\5\177@\2\u0134\u0135\5\u0083"+
		"B\2\u0135\u0136\5w<\2\u0136L\3\2\2\2\u0137\u0138\5\u0085C\2\u0138\u0139"+
		"\5\177@\2\u0139\u013a\5\u0087D\2\u013a\u013b\5\177@\2\u013b\u013c\5\u0095"+
		"K\2\u013cN\3\2\2\2\u013d\u013e\5\u0089E\2\u013e\u013f\5\u008bF\2\u013f"+
		"\u0140\5\u0095K\2\u0140P\3\2\2\2\u0141\u0142\5\u0089E\2\u0142\u0143\5"+
		"\u008bF\2\u0143\u0145\5\u0095K\2\u0144\u0146\5i\65\2\u0145\u0144\3\2\2"+
		"\2\u0146\u0147\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149"+
		"\3\2\2\2\u0149\u014a\5\u0089E\2\u014a\u014b\5\u0097L\2\u014b\u014c\5\u0085"+
		"C\2\u014c\u014d\5\u0085C\2\u014dR\3\2\2\2\u014e\u014f\5\u0089E\2\u014f"+
		"\u0150\5\u0097L\2\u0150\u0151\5\u0085C\2\u0151\u0152\5\u0085C\2\u0152"+
		"T\3\2\2\2\u0153\u0154\5\u008bF\2\u0154\u0155\5y=\2\u0155V\3\2\2\2\u0156"+
		"\u0157\5\u008bF\2\u0157\u0158\5\u0089E\2\u0158X\3\2\2\2\u0159\u015a\5"+
		"\u008bF\2\u015a\u015b\5\u0091I\2\u015bZ\3\2\2\2\u015c\u015d\5\u009bN\2"+
		"\u015d\u015e\5}?\2\u015e\u015f\5w<\2\u015f\u0160\5\u0089E\2\u0160\\\3"+
		"\2\2\2\u0161\u0162\5\u009bN\2\u0162\u0163\5\177@\2\u0163\u0164\5\u0095"+
		"K\2\u0164\u0165\5}?\2\u0165^\3\2\2\2\u0166\u0167\5\u009bN\2\u0167\u0168"+
		"\5\177@\2\u0168\u0169\5\u0095K\2\u0169\u016a\5}?\2\u016a\u016b\5\u008b"+
		"F\2\u016b\u016c\5\u0097L\2\u016c\u016d\5\u0095K\2\u016d`\3\2\2\2\u016e"+
		"\u0170\5m\67\2\u016f\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u016f\3\2"+
		"\2\2\u0171\u0172\3\2\2\2\u0172\u017a\3\2\2\2\u0173\u0177\7\60\2\2\u0174"+
		"\u0176\5m\67\2\u0175\u0174\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2"+
		"\2\2\u0177\u0178\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u017a"+
		"\u0173\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u0185\3\2\2\2\u017c\u017e\5w"+
		"<\2\u017d\u017f\t\2\2\2\u017e\u017d\3\2\2\2\u017e\u017f\3\2\2\2\u017f"+
		"\u0181\3\2\2\2\u0180\u0182\5m\67\2\u0181\u0180\3\2\2\2\u0182\u0183\3\2"+
		"\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0186\3\2\2\2\u0185"+
		"\u017c\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0199\3\2\2\2\u0187\u0189\7\60"+
		"\2\2\u0188\u018a\5m\67\2\u0189\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b"+
		"\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u0196\3\2\2\2\u018d\u018f\5w"+
		"<\2\u018e\u0190\t\2\2\2\u018f\u018e\3\2\2\2\u018f\u0190\3\2\2\2\u0190"+
		"\u0192\3\2\2\2\u0191\u0193\5m\67\2\u0192\u0191\3\2\2\2\u0193\u0194\3\2"+
		"\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0197\3\2\2\2\u0196"+
		"\u018d\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0199\3\2\2\2\u0198\u016f\3\2"+
		"\2\2\u0198\u0187\3\2\2\2\u0199b\3\2\2\2\u019a\u01a0\7)\2\2\u019b\u019f"+
		"\n\3\2\2\u019c\u019d\7)\2\2\u019d\u019f\7)\2\2\u019e\u019b\3\2\2\2\u019e"+
		"\u019c\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2"+
		"\2\2\u01a1\u01a3\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3\u01a4\7)\2\2\u01a4"+
		"d\3\2\2\2\u01a5\u01a6\7/\2\2\u01a6\u01a7\7/\2\2\u01a7\u01ab\3\2\2\2\u01a8"+
		"\u01aa\n\4\2\2\u01a9\u01a8\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2"+
		"\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae"+
		"\u01af\b\63\2\2\u01aff\3\2\2\2\u01b0\u01b1\7\61\2\2\u01b1\u01b2\7,\2\2"+
		"\u01b2\u01b6\3\2\2\2\u01b3\u01b5\13\2\2\2\u01b4\u01b3\3\2\2\2\u01b5\u01b8"+
		"\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01bc\3\2\2\2\u01b8"+
		"\u01b6\3\2\2\2\u01b9\u01ba\7,\2\2\u01ba\u01bd\7\61\2\2\u01bb\u01bd\7\2"+
		"\2\3\u01bc\u01b9\3\2\2\2\u01bc\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be"+
		"\u01bf\b\64\2\2\u01bfh\3\2\2\2\u01c0\u01c1\t\5\2\2\u01c1\u01c2\3\2\2\2"+
		"\u01c2\u01c3\b\65\2\2\u01c3j\3\2\2\2\u01c4\u01c6\t\6\2\2\u01c5\u01c4\3"+
		"\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8"+
		"l\3\2\2\2\u01c9\u01ca\t\7\2\2\u01can\3\2\2\2\u01cb\u01cc\t\b\2\2\u01cc"+
		"p\3\2\2\2\u01cd\u01ce\t\t\2\2\u01cer\3\2\2\2\u01cf\u01d0\t\n\2\2\u01d0"+
		"t\3\2\2\2\u01d1\u01d2\t\13\2\2\u01d2v\3\2\2\2\u01d3\u01d4\t\f\2\2\u01d4"+
		"x\3\2\2\2\u01d5\u01d6\t\r\2\2\u01d6z\3\2\2\2\u01d7\u01d8\t\16\2\2\u01d8"+
		"|\3\2\2\2\u01d9\u01da\t\17\2\2\u01da~\3\2\2\2\u01db\u01dc\t\20\2\2\u01dc"+
		"\u0080\3\2\2\2\u01dd\u01de\t\21\2\2\u01de\u0082\3\2\2\2\u01df\u01e0\t"+
		"\22\2\2\u01e0\u0084\3\2\2\2\u01e1\u01e2\t\23\2\2\u01e2\u0086\3\2\2\2\u01e3"+
		"\u01e4\t\24\2\2\u01e4\u0088\3\2\2\2\u01e5\u01e6\t\25\2\2\u01e6\u008a\3"+
		"\2\2\2\u01e7\u01e8\t\26\2\2\u01e8\u008c\3\2\2\2\u01e9\u01ea\t\27\2\2\u01ea"+
		"\u008e\3\2\2\2\u01eb\u01ec\t\30\2\2\u01ec\u0090\3\2\2\2\u01ed\u01ee\t"+
		"\31\2\2\u01ee\u0092\3\2\2\2\u01ef\u01f0\t\32\2\2\u01f0\u0094\3\2\2\2\u01f1"+
		"\u01f2\t\33\2\2\u01f2\u0096\3\2\2\2\u01f3\u01f4\t\34\2\2\u01f4\u0098\3"+
		"\2\2\2\u01f5\u01f6\t\35\2\2\u01f6\u009a\3\2\2\2\u01f7\u01f8\t\36\2\2\u01f8"+
		"\u009c\3\2\2\2\u01f9\u01fa\t\37\2\2\u01fa\u009e\3\2\2\2\u01fb\u01fc\t"+
		" \2\2\u01fc\u00a0\3\2\2\2\u01fd\u01fe\t!\2\2\u01fe\u00a2\3\2\2\2\32\2"+
		"\u00e6\u0108\u0117\u0123\u012e\u0147\u0171\u0177\u017a\u017e\u0183\u0185"+
		"\u018b\u018f\u0194\u0196\u0198\u019e\u01a0\u01ab\u01b6\u01bc\u01c7\3\2"+
		"\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}