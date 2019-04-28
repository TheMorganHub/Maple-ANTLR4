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
		K_CLOSE_SQL_STMT=23, K_WHERE=24, K_AND=25, K_BETWEEN=26, K_IN=27, K_INNER=28, 
		K_INTO=29, K_IS=30, K_ISNULL=31, K_LIKE=32, K_LIMIT=33, K_MATCH=34, K_NATURAL=35, 
		K_NO=36, K_NOT=37, K_NOTNULL=38, K_NULL=39, K_OF=40, K_ON=41, K_OR=42, 
		K_VIRTUAL=43, K_WHEN=44, K_WITH=45, K_WITHOUT=46, NUMERIC_LITERAL=47, 
		STRING_LITERAL=48, SINGLE_LINE_COMMENT=49, MULTILINE_COMMENT=50, SPACES=51, 
		WORD=52, DIGIT=53;
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
			"K_CLOSE_SQL_STMT", "K_WHERE", "K_AND", "K_BETWEEN", "K_IN", "K_INNER", 
			"K_INTO", "K_IS", "K_ISNULL", "K_LIKE", "K_LIMIT", "K_MATCH", "K_NATURAL", 
			"K_NO", "K_NOT", "K_NOTNULL", "K_NULL", "K_OF", "K_ON", "K_OR", "K_VIRTUAL", 
			"K_WHEN", "K_WITH", "K_WITHOUT", "NUMERIC_LITERAL", "STRING_LITERAL", 
			"SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES", "WORD", "DIGIT", 
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
			"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
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
			"K_BETWEEN", "K_IN", "K_INNER", "K_INTO", "K_IS", "K_ISNULL", "K_LIKE", 
			"K_LIMIT", "K_MATCH", "K_NATURAL", "K_NO", "K_NOT", "K_NOTNULL", "K_NULL", 
			"K_OF", "K_ON", "K_OR", "K_VIRTUAL", "K_WHEN", "K_WITH", "K_WITHOUT", 
			"NUMERIC_LITERAL", "STRING_LITERAL", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", 
			"SPACES", "WORD", "DIGIT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u01e1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3"+
		"!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3("+
		"\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-"+
		"\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3\60\6\60\u0152\n\60\r\60\16"+
		"\60\u0153\3\60\3\60\7\60\u0158\n\60\f\60\16\60\u015b\13\60\5\60\u015d"+
		"\n\60\3\60\3\60\5\60\u0161\n\60\3\60\6\60\u0164\n\60\r\60\16\60\u0165"+
		"\5\60\u0168\n\60\3\60\3\60\6\60\u016c\n\60\r\60\16\60\u016d\3\60\3\60"+
		"\5\60\u0172\n\60\3\60\6\60\u0175\n\60\r\60\16\60\u0176\5\60\u0179\n\60"+
		"\5\60\u017b\n\60\3\61\3\61\3\61\3\61\7\61\u0181\n\61\f\61\16\61\u0184"+
		"\13\61\3\61\3\61\3\62\3\62\3\62\3\62\7\62\u018c\n\62\f\62\16\62\u018f"+
		"\13\62\3\62\3\62\3\63\3\63\3\63\3\63\7\63\u0197\n\63\f\63\16\63\u019a"+
		"\13\63\3\63\3\63\3\63\5\63\u019f\n\63\3\63\3\63\3\64\3\64\3\64\3\64\3"+
		"\65\6\65\u01a8\n\65\r\65\16\65\u01a9\3\66\3\66\3\67\3\67\38\38\39\39\3"+
		":\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3"+
		"E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3"+
		"\u0198\2Q\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65"+
		"i\66k\67m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087"+
		"\2\u0089\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099"+
		"\2\u009b\2\u009d\2\u009f\2\3\2\"\4\2--//\3\2))\4\2\f\f\17\17\5\2\13\r"+
		"\17\17\"\"\4\2C\\c|\3\2\62;\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4"+
		"\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPp"+
		"p\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2"+
		"YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u01d7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3"+
		"\2\2\2\2i\3\2\2\2\2k\3\2\2\2\3\u00a1\3\2\2\2\5\u00a3\3\2\2\2\7\u00a5\3"+
		"\2\2\2\t\u00a7\3\2\2\2\13\u00a9\3\2\2\2\r\u00ab\3\2\2\2\17\u00ad\3\2\2"+
		"\2\21\u00af\3\2\2\2\23\u00b1\3\2\2\2\25\u00b3\3\2\2\2\27\u00b5\3\2\2\2"+
		"\31\u00b8\3\2\2\2\33\u00bb\3\2\2\2\35\u00be\3\2\2\2\37\u00c1\3\2\2\2!"+
		"\u00c5\3\2\2\2#\u00c8\3\2\2\2%\u00ca\3\2\2\2\'\u00cc\3\2\2\2)\u00cf\3"+
		"\2\2\2+\u00d2\3\2\2\2-\u00d4\3\2\2\2/\u00d7\3\2\2\2\61\u00da\3\2\2\2\63"+
		"\u00dc\3\2\2\2\65\u00e0\3\2\2\2\67\u00e8\3\2\2\29\u00eb\3\2\2\2;\u00f1"+
		"\3\2\2\2=\u00f6\3\2\2\2?\u00f9\3\2\2\2A\u0100\3\2\2\2C\u0105\3\2\2\2E"+
		"\u010b\3\2\2\2G\u0111\3\2\2\2I\u0119\3\2\2\2K\u011c\3\2\2\2M\u0120\3\2"+
		"\2\2O\u0128\3\2\2\2Q\u012d\3\2\2\2S\u0130\3\2\2\2U\u0133\3\2\2\2W\u0136"+
		"\3\2\2\2Y\u013e\3\2\2\2[\u0143\3\2\2\2]\u0148\3\2\2\2_\u017a\3\2\2\2a"+
		"\u017c\3\2\2\2c\u0187\3\2\2\2e\u0192\3\2\2\2g\u01a2\3\2\2\2i\u01a7\3\2"+
		"\2\2k\u01ab\3\2\2\2m\u01ad\3\2\2\2o\u01af\3\2\2\2q\u01b1\3\2\2\2s\u01b3"+
		"\3\2\2\2u\u01b5\3\2\2\2w\u01b7\3\2\2\2y\u01b9\3\2\2\2{\u01bb\3\2\2\2}"+
		"\u01bd\3\2\2\2\177\u01bf\3\2\2\2\u0081\u01c1\3\2\2\2\u0083\u01c3\3\2\2"+
		"\2\u0085\u01c5\3\2\2\2\u0087\u01c7\3\2\2\2\u0089\u01c9\3\2\2\2\u008b\u01cb"+
		"\3\2\2\2\u008d\u01cd\3\2\2\2\u008f\u01cf\3\2\2\2\u0091\u01d1\3\2\2\2\u0093"+
		"\u01d3\3\2\2\2\u0095\u01d5\3\2\2\2\u0097\u01d7\3\2\2\2\u0099\u01d9\3\2"+
		"\2\2\u009b\u01db\3\2\2\2\u009d\u01dd\3\2\2\2\u009f\u01df\3\2\2\2\u00a1"+
		"\u00a2\7=\2\2\u00a2\4\3\2\2\2\u00a3\u00a4\7.\2\2\u00a4\6\3\2\2\2\u00a5"+
		"\u00a6\7\60\2\2\u00a6\b\3\2\2\2\u00a7\u00a8\7*\2\2\u00a8\n\3\2\2\2\u00a9"+
		"\u00aa\7+\2\2\u00aa\f\3\2\2\2\u00ab\u00ac\7,\2\2\u00ac\16\3\2\2\2\u00ad"+
		"\u00ae\7\61\2\2\u00ae\20\3\2\2\2\u00af\u00b0\7\'\2\2\u00b0\22\3\2\2\2"+
		"\u00b1\u00b2\7/\2\2\u00b2\24\3\2\2\2\u00b3\u00b4\7?\2\2\u00b4\26\3\2\2"+
		"\2\u00b5\u00b6\7?\2\2\u00b6\u00b7\7?\2\2\u00b7\30\3\2\2\2\u00b8\u00b9"+
		"\7#\2\2\u00b9\u00ba\7?\2\2\u00ba\32\3\2\2\2\u00bb\u00bc\7>\2\2\u00bc\u00bd"+
		"\7?\2\2\u00bd\34\3\2\2\2\u00be\u00bf\7@\2\2\u00bf\u00c0\7?\2\2\u00c0\36"+
		"\3\2\2\2\u00c1\u00c2\7C\2\2\u00c2\u00c3\7P\2\2\u00c3\u00c4\7F\2\2\u00c4"+
		" \3\2\2\2\u00c5\u00c6\7Q\2\2\u00c6\u00c7\7T\2\2\u00c7\"\3\2\2\2\u00c8"+
		"\u00c9\7@\2\2\u00c9$\3\2\2\2\u00ca\u00cb\7>\2\2\u00cb&\3\2\2\2\u00cc\u00cd"+
		"\7>\2\2\u00cd\u00ce\7>\2\2\u00ce(\3\2\2\2\u00cf\u00d0\7>\2\2\u00d0\u00d1"+
		"\7@\2\2\u00d1*\3\2\2\2\u00d2\u00d3\7-\2\2\u00d3,\3\2\2\2\u00d4\u00d5\7"+
		">\2\2\u00d5\u00d6\7A\2\2\u00d6.\3\2\2\2\u00d7\u00d8\7A\2\2\u00d8\u00d9"+
		"\7@\2\2\u00d9\60\3\2\2\2\u00da\u00db\7A\2\2\u00db\62\3\2\2\2\u00dc\u00dd"+
		"\5m\67\2\u00dd\u00de\5\u0087D\2\u00de\u00df\5s:\2\u00df\64\3\2\2\2\u00e0"+
		"\u00e1\5o8\2\u00e1\u00e2\5u;\2\u00e2\u00e3\5\u0093J\2\u00e3\u00e4\5\u0099"+
		"M\2\u00e4\u00e5\5u;\2\u00e5\u00e6\5u;\2\u00e6\u00e7\5\u0087D\2\u00e7\66"+
		"\3\2\2\2\u00e8\u00e9\5}?\2\u00e9\u00ea\5\u0087D\2\u00ea8\3\2\2\2\u00eb"+
		"\u00ec\5}?\2\u00ec\u00ed\5\u0087D\2\u00ed\u00ee\5\u0087D\2\u00ee\u00ef"+
		"\5u;\2\u00ef\u00f0\5\u008fH\2\u00f0:\3\2\2\2\u00f1\u00f2\5}?\2\u00f2\u00f3"+
		"\5\u0087D\2\u00f3\u00f4\5\u0093J\2\u00f4\u00f5\5\u0089E\2\u00f5<\3\2\2"+
		"\2\u00f6\u00f7\5}?\2\u00f7\u00f8\5\u0091I\2\u00f8>\3\2\2\2\u00f9\u00fa"+
		"\5}?\2\u00fa\u00fb\5\u0091I\2\u00fb\u00fc\5\u0087D\2\u00fc\u00fd\5\u0095"+
		"K\2\u00fd\u00fe\5\u0083B\2\u00fe\u00ff\5\u0083B\2\u00ff@\3\2\2\2\u0100"+
		"\u0101\5\u0083B\2\u0101\u0102\5}?\2\u0102\u0103\5\u0081A\2\u0103\u0104"+
		"\5u;\2\u0104B\3\2\2\2\u0105\u0106\5\u0083B\2\u0106\u0107\5}?\2\u0107\u0108"+
		"\5\u0085C\2\u0108\u0109\5}?\2\u0109\u010a\5\u0093J\2\u010aD\3\2\2\2\u010b"+
		"\u010c\5\u0085C\2\u010c\u010d\5m\67\2\u010d\u010e\5\u0093J\2\u010e\u010f"+
		"\5q9\2\u010f\u0110\5{>\2\u0110F\3\2\2\2\u0111\u0112\5\u0087D\2\u0112\u0113"+
		"\5m\67\2\u0113\u0114\5\u0093J\2\u0114\u0115\5\u0095K\2\u0115\u0116\5\u008f"+
		"H\2\u0116\u0117\5m\67\2\u0117\u0118\5\u0083B\2\u0118H\3\2\2\2\u0119\u011a"+
		"\5\u0087D\2\u011a\u011b\5\u0089E\2\u011bJ\3\2\2\2\u011c\u011d\5\u0087"+
		"D\2\u011d\u011e\5\u0089E\2\u011e\u011f\5\u0093J\2\u011fL\3\2\2\2\u0120"+
		"\u0121\5\u0087D\2\u0121\u0122\5\u0089E\2\u0122\u0123\5\u0093J\2\u0123"+
		"\u0124\5\u0087D\2\u0124\u0125\5\u0095K\2\u0125\u0126\5\u0083B\2\u0126"+
		"\u0127\5\u0083B\2\u0127N\3\2\2\2\u0128\u0129\5\u0087D\2\u0129\u012a\5"+
		"\u0095K\2\u012a\u012b\5\u0083B\2\u012b\u012c\5\u0083B\2\u012cP\3\2\2\2"+
		"\u012d\u012e\5\u0089E\2\u012e\u012f\5w<\2\u012fR\3\2\2\2\u0130\u0131\5"+
		"\u0089E\2\u0131\u0132\5\u0087D\2\u0132T\3\2\2\2\u0133\u0134\5\u0089E\2"+
		"\u0134\u0135\5\u008fH\2\u0135V\3\2\2\2\u0136\u0137\5\u0097L\2\u0137\u0138"+
		"\5}?\2\u0138\u0139\5\u008fH\2\u0139\u013a\5\u0093J\2\u013a\u013b\5\u0095"+
		"K\2\u013b\u013c\5m\67\2\u013c\u013d\5\u0083B\2\u013dX\3\2\2\2\u013e\u013f"+
		"\5\u0099M\2\u013f\u0140\5{>\2\u0140\u0141\5u;\2\u0141\u0142\5\u0087D\2"+
		"\u0142Z\3\2\2\2\u0143\u0144\5\u0099M\2\u0144\u0145\5}?\2\u0145\u0146\5"+
		"\u0093J\2\u0146\u0147\5{>\2\u0147\\\3\2\2\2\u0148\u0149\5\u0099M\2\u0149"+
		"\u014a\5}?\2\u014a\u014b\5\u0093J\2\u014b\u014c\5{>\2\u014c\u014d\5\u0089"+
		"E\2\u014d\u014e\5\u0095K\2\u014e\u014f\5\u0093J\2\u014f^\3\2\2\2\u0150"+
		"\u0152\5k\66\2\u0151\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0151\3\2"+
		"\2\2\u0153\u0154\3\2\2\2\u0154\u015c\3\2\2\2\u0155\u0159\7\60\2\2\u0156"+
		"\u0158\5k\66\2\u0157\u0156\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2"+
		"\2\2\u0159\u015a\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015c"+
		"\u0155\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u0167\3\2\2\2\u015e\u0160\5u"+
		";\2\u015f\u0161\t\2\2\2\u0160\u015f\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\u0163\3\2\2\2\u0162\u0164\5k\66\2\u0163\u0162\3\2\2\2\u0164\u0165\3\2"+
		"\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0168\3\2\2\2\u0167"+
		"\u015e\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u017b\3\2\2\2\u0169\u016b\7\60"+
		"\2\2\u016a\u016c\5k\66\2\u016b\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d"+
		"\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0178\3\2\2\2\u016f\u0171\5u"+
		";\2\u0170\u0172\t\2\2\2\u0171\u0170\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
		"\u0174\3\2\2\2\u0173\u0175\5k\66\2\u0174\u0173\3\2\2\2\u0175\u0176\3\2"+
		"\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0179\3\2\2\2\u0178"+
		"\u016f\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017b\3\2\2\2\u017a\u0151\3\2"+
		"\2\2\u017a\u0169\3\2\2\2\u017b`\3\2\2\2\u017c\u0182\7)\2\2\u017d\u0181"+
		"\n\3\2\2\u017e\u017f\7)\2\2\u017f\u0181\7)\2\2\u0180\u017d\3\2\2\2\u0180"+
		"\u017e\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2"+
		"\2\2\u0183\u0185\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0186\7)\2\2\u0186"+
		"b\3\2\2\2\u0187\u0188\7/\2\2\u0188\u0189\7/\2\2\u0189\u018d\3\2\2\2\u018a"+
		"\u018c\n\4\2\2\u018b\u018a\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2"+
		"\2\2\u018d\u018e\3\2\2\2\u018e\u0190\3\2\2\2\u018f\u018d\3\2\2\2\u0190"+
		"\u0191\b\62\2\2\u0191d\3\2\2\2\u0192\u0193\7\61\2\2\u0193\u0194\7,\2\2"+
		"\u0194\u0198\3\2\2\2\u0195\u0197\13\2\2\2\u0196\u0195\3\2\2\2\u0197\u019a"+
		"\3\2\2\2\u0198\u0199\3\2\2\2\u0198\u0196\3\2\2\2\u0199\u019e\3\2\2\2\u019a"+
		"\u0198\3\2\2\2\u019b\u019c\7,\2\2\u019c\u019f\7\61\2\2\u019d\u019f\7\2"+
		"\2\3\u019e\u019b\3\2\2\2\u019e\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0"+
		"\u01a1\b\63\2\2\u01a1f\3\2\2\2\u01a2\u01a3\t\5\2\2\u01a3\u01a4\3\2\2\2"+
		"\u01a4\u01a5\b\64\2\2\u01a5h\3\2\2\2\u01a6\u01a8\t\6\2\2\u01a7\u01a6\3"+
		"\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa"+
		"j\3\2\2\2\u01ab\u01ac\t\7\2\2\u01acl\3\2\2\2\u01ad\u01ae\t\b\2\2\u01ae"+
		"n\3\2\2\2\u01af\u01b0\t\t\2\2\u01b0p\3\2\2\2\u01b1\u01b2\t\n\2\2\u01b2"+
		"r\3\2\2\2\u01b3\u01b4\t\13\2\2\u01b4t\3\2\2\2\u01b5\u01b6\t\f\2\2\u01b6"+
		"v\3\2\2\2\u01b7\u01b8\t\r\2\2\u01b8x\3\2\2\2\u01b9\u01ba\t\16\2\2\u01ba"+
		"z\3\2\2\2\u01bb\u01bc\t\17\2\2\u01bc|\3\2\2\2\u01bd\u01be\t\20\2\2\u01be"+
		"~\3\2\2\2\u01bf\u01c0\t\21\2\2\u01c0\u0080\3\2\2\2\u01c1\u01c2\t\22\2"+
		"\2\u01c2\u0082\3\2\2\2\u01c3\u01c4\t\23\2\2\u01c4\u0084\3\2\2\2\u01c5"+
		"\u01c6\t\24\2\2\u01c6\u0086\3\2\2\2\u01c7\u01c8\t\25\2\2\u01c8\u0088\3"+
		"\2\2\2\u01c9\u01ca\t\26\2\2\u01ca\u008a\3\2\2\2\u01cb\u01cc\t\27\2\2\u01cc"+
		"\u008c\3\2\2\2\u01cd\u01ce\t\30\2\2\u01ce\u008e\3\2\2\2\u01cf\u01d0\t"+
		"\31\2\2\u01d0\u0090\3\2\2\2\u01d1\u01d2\t\32\2\2\u01d2\u0092\3\2\2\2\u01d3"+
		"\u01d4\t\33\2\2\u01d4\u0094\3\2\2\2\u01d5\u01d6\t\34\2\2\u01d6\u0096\3"+
		"\2\2\2\u01d7\u01d8\t\35\2\2\u01d8\u0098\3\2\2\2\u01d9\u01da\t\36\2\2\u01da"+
		"\u009a\3\2\2\2\u01db\u01dc\t\37\2\2\u01dc\u009c\3\2\2\2\u01dd\u01de\t"+
		" \2\2\u01de\u009e\3\2\2\2\u01df\u01e0\t!\2\2\u01e0\u00a0\3\2\2\2\24\2"+
		"\u0153\u0159\u015c\u0160\u0165\u0167\u016d\u0171\u0176\u0178\u017a\u0180"+
		"\u0182\u018d\u0198\u019e\u01a9\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}