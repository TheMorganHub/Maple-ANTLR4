// Generated from /home/david/IdeaProjects/Maple-ANTLR4/src/main/antlr/com/morgandev/maple/Maple/Maple.g4 by ANTLR 4.7.2
package com.morgandev.app.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MapleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		K_SELECT=18, K_INSERT=19, K_UPDATE=20, K_LEFT_JOIN=21, K_RIGHT_JOIN=22, 
		K_JOIN=23, K_OPEN_SQL_STMT=24, K_CLOSE_SQL_STMT=25, K_WHERE=26, K_PK=27, 
		K_AND=28, K_NOTBETWEEN=29, K_BETWEEN=30, K_IN=31, K_INNER=32, K_INTO=33, 
		K_IS=34, K_ISNULL=35, K_ISNOTNULL=36, K_ISNOT=37, K_NOTIN=38, K_NOTLIKE=39, 
		K_LIKE=40, K_LIMIT=41, K_NOT=42, K_NOTNULL=43, K_NULL=44, K_OF=45, K_ON=46, 
		K_OR=47, K_WHEN=48, K_WITH=49, K_WITHOUT=50, IDENTIFIER=51, NUMERIC_LITERAL=52, 
		STRING_LITERAL=53, SINGLE_LINE_COMMENT=54, MULTILINE_COMMENT=55, SPACES=56, 
		UNEXPECTED_CHAR=57;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_maple_stmt_list = 2, RULE_maple_stmt = 3, 
		RULE_create_table_stmt = 4, RULE_foreign_key_create_table = 5, RULE_update_stmt = 6, 
		RULE_delete_stmt = 7, RULE_insert_stmt = 8, RULE_insert_value_set = 9, 
		RULE_update_value_set = 10, RULE_select_stmt = 11, RULE_join_stmt = 12, 
		RULE_join_constraint = 13, RULE_conditional = 14, RULE_column_def = 15, 
		RULE_column_type = 16, RULE_default_value = 17, RULE_expr = 18, RULE_function = 19, 
		RULE_result_column = 20, RULE_column_modifier = 21, RULE_column_name = 22, 
		RULE_table_name = 23, RULE_table_alias = 24, RULE_column_alias = 25, RULE_database_name = 26, 
		RULE_function_name = 27, RULE_signed_number = 28, RULE_literal_value = 29, 
		RULE_any_name = 30, RULE_embedded_sql = 31, RULE_any_stmt = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "error", "maple_stmt_list", "maple_stmt", "create_table_stmt", 
			"foreign_key_create_table", "update_stmt", "delete_stmt", "insert_stmt", 
			"insert_value_set", "update_value_set", "select_stmt", "join_stmt", "join_constraint", 
			"conditional", "column_def", "column_type", "default_value", "expr", 
			"function", "result_column", "column_modifier", "column_name", "table_name", 
			"table_alias", "column_alias", "database_name", "function_name", "signed_number", 
			"literal_value", "any_name", "embedded_sql", "any_stmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "','", "')'", "'.'", "'*'", "'/'", "'%'", "'+'", 
			"'-'", "'='", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'->'", "'<-'", 
			"'<<-'", "'<<>'", "'<>>'", "'<>'", "'<?'", "'?>'", "'?'", "'$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "K_SELECT", "K_INSERT", "K_UPDATE", 
			"K_LEFT_JOIN", "K_RIGHT_JOIN", "K_JOIN", "K_OPEN_SQL_STMT", "K_CLOSE_SQL_STMT", 
			"K_WHERE", "K_PK", "K_AND", "K_NOTBETWEEN", "K_BETWEEN", "K_IN", "K_INNER", 
			"K_INTO", "K_IS", "K_ISNULL", "K_ISNOTNULL", "K_ISNOT", "K_NOTIN", "K_NOTLIKE", 
			"K_LIKE", "K_LIMIT", "K_NOT", "K_NOTNULL", "K_NULL", "K_OF", "K_ON", 
			"K_OR", "K_WHEN", "K_WITH", "K_WITHOUT", "IDENTIFIER", "NUMERIC_LITERAL", 
			"STRING_LITERAL", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES", 
			"UNEXPECTED_CHAR"
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
	public String getGrammarFileName() { return "Maple.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MapleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MapleParser.EOF, 0); }
		public Maple_stmt_listContext maple_stmt_list() {
			return getRuleContext(Maple_stmt_listContext.class,0);
		}
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case K_OPEN_SQL_STMT:
			case IDENTIFIER:
				{
				setState(66);
				maple_stmt_list();
				}
				break;
			case UNEXPECTED_CHAR:
				{
				setState(67);
				error();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(70);
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

	public static class ErrorContext extends ParserRuleContext {
		public Token UNEXPECTED_CHAR;
		public TerminalNode UNEXPECTED_CHAR() { return getToken(MapleParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).exitError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			((ErrorContext)_localctx).UNEXPECTED_CHAR = match(UNEXPECTED_CHAR);

			     throw new RuntimeException("UNEXPECTED_CHAR=" + (((ErrorContext)_localctx).UNEXPECTED_CHAR!=null?((ErrorContext)_localctx).UNEXPECTED_CHAR.getText():null));
			   
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

	public static class Maple_stmt_listContext extends ParserRuleContext {
		public List<Maple_stmtContext> maple_stmt() {
			return getRuleContexts(Maple_stmtContext.class);
		}
		public Maple_stmtContext maple_stmt(int i) {
			return getRuleContext(Maple_stmtContext.class,i);
		}
		public Maple_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maple_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).enterMaple_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).exitMaple_stmt_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitMaple_stmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Maple_stmt_listContext maple_stmt_list() throws RecognitionException {
		Maple_stmt_listContext _localctx = new Maple_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_maple_stmt_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			maple_stmt();
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(76);
				match(T__0);
				}
				break;
			}
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(79);
					match(T__0);
					setState(80);
					maple_stmt();
					setState(82);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(81);
						match(T__0);
						}
						break;
					}
					}
					} 
				}
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class Maple_stmtContext extends ParserRuleContext {
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public Embedded_sqlContext embedded_sql() {
			return getRuleContext(Embedded_sqlContext.class,0);
		}
		public Maple_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maple_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).enterMaple_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).exitMaple_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitMaple_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Maple_stmtContext maple_stmt() throws RecognitionException {
		Maple_stmtContext _localctx = new Maple_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_maple_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(89);
				select_stmt();
				}
				break;
			case 2:
				{
				setState(90);
				create_table_stmt();
				}
				break;
			case 3:
				{
				setState(91);
				insert_stmt();
				}
				break;
			case 4:
				{
				setState(92);
				delete_stmt();
				}
				break;
			case 5:
				{
				setState(93);
				update_stmt();
				}
				break;
			case 6:
				{
				setState(94);
				embedded_sql();
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

	public static class Create_table_stmtContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public List<Foreign_key_create_tableContext> foreign_key_create_table() {
			return getRuleContexts(Foreign_key_create_tableContext.class);
		}
		public Foreign_key_create_tableContext foreign_key_create_table(int i) {
			return getRuleContext(Foreign_key_create_tableContext.class,i);
		}
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).enterCreate_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).exitCreate_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitCreate_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_create_table_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			table_name();
			setState(98);
			match(T__1);
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(99);
					column_def();
					setState(104);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(100);
							match(T__2);
							setState(101);
							column_def();
							}
							} 
						}
						setState(106);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
					}
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(112);
			match(T__3);
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(113);
					foreign_key_create_table();
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class Foreign_key_create_tableContext extends ParserRuleContext {
		public TerminalNode K_JOIN() { return getToken(MapleParser.K_JOIN, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Foreign_key_create_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_key_create_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).enterForeign_key_create_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).exitForeign_key_create_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitForeign_key_create_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_key_create_tableContext foreign_key_create_table() throws RecognitionException {
		Foreign_key_create_tableContext _localctx = new Foreign_key_create_tableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_foreign_key_create_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(K_JOIN);
			setState(120);
			table_name();
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

	public static class Update_stmtContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode K_UPDATE() { return getToken(MapleParser.K_UPDATE, 0); }
		public Update_value_setContext update_value_set() {
			return getRuleContext(Update_value_setContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).enterUpdate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).exitUpdate_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitUpdate_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(122);
				database_name();
				setState(123);
				match(T__4);
				}
				break;
			}
			setState(127);
			table_name();
			{
			setState(128);
			match(T__1);
			setState(129);
			column_name();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(130);
				match(T__2);
				setState(131);
				column_name();
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
			match(T__3);
			}
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_UPDATE:
				{
				setState(139);
				match(K_UPDATE);
				setState(140);
				update_value_set();
				}
				break;
			case T__1:
			case IDENTIFIER:
				{
				setState(141);
				select_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(144);
				conditional();
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

	public static class Delete_stmtContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_INSERT() { return getToken(MapleParser.K_INSERT, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).enterDelete_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).exitDelete_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitDelete_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(147);
				database_name();
				setState(148);
				match(T__4);
				}
				break;
			}
			setState(152);
			table_name();
			setState(153);
			match(K_INSERT);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(154);
				conditional();
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

	public static class Insert_stmtContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_INSERT() { return getToken(MapleParser.K_INSERT, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Insert_value_setContext> insert_value_set() {
			return getRuleContexts(Insert_value_setContext.class);
		}
		public Insert_value_setContext insert_value_set(int i) {
			return getRuleContext(Insert_value_setContext.class,i);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).enterInsert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).exitInsert_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitInsert_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_insert_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(157);
				database_name();
				setState(158);
				match(T__4);
				}
				break;
			}
			setState(162);
			table_name();
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(163);
				match(T__1);
				setState(164);
				column_name();
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(165);
					match(T__2);
					setState(166);
					column_name();
					}
					}
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(172);
				match(T__3);
				}
				break;
			}
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INSERT:
				{
				setState(176);
				match(K_INSERT);
				setState(191);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(177);
					insert_value_set();
					}
					break;
				case 2:
					{
					{
					setState(178);
					match(T__1);
					setState(179);
					insert_value_set();
					setState(180);
					match(T__3);
					setState(188);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(181);
							match(T__2);
							setState(182);
							match(T__1);
							setState(183);
							insert_value_set();
							setState(184);
							match(T__3);
							}
							} 
						}
						setState(190);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
					}
					}
					}
					break;
				}
				}
				break;
			case T__1:
			case IDENTIFIER:
				{
				setState(193);
				select_stmt();
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

	public static class Insert_value_setContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Insert_value_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_value_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).enterInsert_value_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).exitInsert_value_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitInsert_value_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_value_setContext insert_value_set() throws RecognitionException {
		Insert_value_setContext _localctx = new Insert_value_setContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_insert_value_set);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			expr(0);
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(197);
					match(T__2);
					setState(198);
					expr(0);
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class Update_value_setContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Update_value_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_value_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).enterUpdate_value_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).exitUpdate_value_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitUpdate_value_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_value_setContext update_value_set() throws RecognitionException {
		Update_value_setContext _localctx = new Update_value_setContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_update_value_set);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			expr(0);
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(205);
					match(T__2);
					setState(206);
					expr(0);
					}
					} 
				}
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class Select_stmtContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode K_SELECT() { return getToken(MapleParser.K_SELECT, 0); }
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<Join_stmtContext> join_stmt() {
			return getRuleContexts(Join_stmtContext.class);
		}
		public Join_stmtContext join_stmt(int i) {
			return getRuleContext(Join_stmtContext.class,i);
		}
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_select_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			table_name();
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1 || _la==IDENTIFIER) {
				{
				setState(213);
				table_alias();
				}
			}

			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_SELECT) {
				{
				setState(216);
				match(K_SELECT);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << IDENTIFIER) | (1L << NUMERIC_LITERAL) | (1L << STRING_LITERAL))) != 0)) {
					{
					setState(217);
					result_column();
					setState(222);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(218);
							match(T__2);
							setState(219);
							result_column();
							}
							} 
						}
						setState(224);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
					}
					}
				}

				setState(230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(227);
						join_stmt();
						}
						} 
					}
					setState(232);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				}
			}

			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(235);
				conditional();
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

	public static class Join_stmtContext extends ParserRuleContext {
		public Token left;
		public Token right;
		public TerminalNode K_JOIN() { return getToken(MapleParser.K_JOIN, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_LEFT_JOIN() { return getToken(MapleParser.K_LEFT_JOIN, 0); }
		public TerminalNode K_RIGHT_JOIN() { return getToken(MapleParser.K_RIGHT_JOIN, 0); }
		public Join_constraintContext join_constraint() {
			return getRuleContext(Join_constraintContext.class,0);
		}
		public Join_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).enterJoin_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).exitJoin_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitJoin_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_stmtContext join_stmt() throws RecognitionException {
		Join_stmtContext _localctx = new Join_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_join_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_JOIN:
				{
				setState(238);
				match(K_JOIN);
				}
				break;
			case K_LEFT_JOIN:
				{
				setState(239);
				((Join_stmtContext)_localctx).left = match(K_LEFT_JOIN);
				}
				break;
			case K_RIGHT_JOIN:
				{
				setState(240);
				((Join_stmtContext)_localctx).right = match(K_RIGHT_JOIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(243);
				match(T__1);
				setState(244);
				select_stmt();
				setState(245);
				match(T__3);
				setState(246);
				table_alias();
				}
				break;
			case 2:
				{
				setState(248);
				table_name();
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==IDENTIFIER) {
					{
					setState(249);
					table_alias();
					}
				}

				}
				break;
			}
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(254);
				join_constraint();
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

	public static class Join_constraintContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(MapleParser.K_ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Join_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).enterJoin_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).exitJoin_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitJoin_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_constraintContext join_constraint() throws RecognitionException {
		Join_constraintContext _localctx = new Join_constraintContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_join_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(K_ON);
			setState(258);
			expr(0);
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

	public static class ConditionalContext extends ParserRuleContext {
		public TerminalNode K_WHERE() { return getToken(MapleParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(K_WHERE);
			setState(261);
			expr(0);
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

	public static class Column_defContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Column_typeContext column_type() {
			return getRuleContext(Column_typeContext.class,0);
		}
		public Column_modifierContext column_modifier() {
			return getRuleContext(Column_modifierContext.class,0);
		}
		public Default_valueContext default_value() {
			return getRuleContext(Default_valueContext.class,0);
		}
		public Column_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).enterColumn_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).exitColumn_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitColumn_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			column_name();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE || _la==K_PK) {
				{
				setState(264);
				column_modifier();
				}
			}

			setState(267);
			column_type();
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMERIC_LITERAL || _la==STRING_LITERAL) {
				{
				setState(268);
				default_value();
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

	public static class Column_typeContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public Column_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).enterColumn_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).exitColumn_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitColumn_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_typeContext column_type() throws RecognitionException {
		Column_typeContext _localctx = new Column_typeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_column_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(271);
			any_name();
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(272);
				match(T__1);
				setState(273);
				signed_number();
				setState(274);
				match(T__3);
				}
				break;
			case 2:
				{
				setState(276);
				match(T__1);
				setState(277);
				signed_number();
				setState(278);
				match(T__2);
				setState(279);
				signed_number();
				setState(280);
				match(T__3);
				}
				break;
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

	public static class Default_valueContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(MapleParser.STRING_LITERAL, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(MapleParser.NUMERIC_LITERAL, 0); }
		public Default_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).enterDefault_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).exitDefault_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitDefault_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_valueContext default_value() throws RecognitionException {
		Default_valueContext _localctx = new Default_valueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_default_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_la = _input.LA(1);
			if ( !(_la==NUMERIC_LITERAL || _la==STRING_LITERAL) ) {
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext left;
		public Token operator;
		public ExprContext right;
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_IS() { return getToken(MapleParser.K_IS, 0); }
		public TerminalNode K_ISNOT() { return getToken(MapleParser.K_ISNOT, 0); }
		public TerminalNode K_LIKE() { return getToken(MapleParser.K_LIKE, 0); }
		public TerminalNode K_NOTLIKE() { return getToken(MapleParser.K_NOTLIKE, 0); }
		public TerminalNode K_NOTIN() { return getToken(MapleParser.K_NOTIN, 0); }
		public TerminalNode K_IN() { return getToken(MapleParser.K_IN, 0); }
		public TerminalNode K_BETWEEN() { return getToken(MapleParser.K_BETWEEN, 0); }
		public TerminalNode K_NOTBETWEEN() { return getToken(MapleParser.K_NOTBETWEEN, 0); }
		public TerminalNode K_AND() { return getToken(MapleParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(MapleParser.K_OR, 0); }
		public TerminalNode K_ISNOTNULL() { return getToken(MapleParser.K_ISNOTNULL, 0); }
		public TerminalNode K_ISNULL() { return getToken(MapleParser.K_ISNULL, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(287);
				literal_value();
				}
				break;
			case 2:
				{
				setState(296);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(291);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						setState(288);
						database_name();
						setState(289);
						match(T__4);
						}
						break;
					}
					setState(293);
					table_name();
					setState(294);
					match(T__4);
					}
					break;
				}
				setState(298);
				column_name();
				}
				break;
			case 3:
				{
				setState(299);
				function();
				}
				break;
			case 4:
				{
				setState(300);
				match(T__1);
				setState(301);
				select_stmt();
				setState(302);
				match(T__3);
				}
				break;
			case 5:
				{
				setState(304);
				match(T__1);
				setState(305);
				expr(0);
				setState(306);
				match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(329);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(327);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(310);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(311);
						((ExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
							((ExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(312);
						((ExprContext)_localctx).right = expr(10);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(313);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(314);
						((ExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__8 || _la==T__9) ) {
							((ExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(315);
						((ExprContext)_localctx).right = expr(9);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(316);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(317);
						((ExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << K_NOTBETWEEN) | (1L << K_BETWEEN) | (1L << K_IN) | (1L << K_IS) | (1L << K_ISNOT) | (1L << K_NOTIN) | (1L << K_NOTLIKE) | (1L << K_LIKE))) != 0)) ) {
							((ExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(318);
						((ExprContext)_localctx).right = expr(8);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(319);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(320);
						((ExprContext)_localctx).operator = match(K_AND);
						setState(321);
						((ExprContext)_localctx).right = expr(6);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(322);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(323);
						((ExprContext)_localctx).operator = match(K_OR);
						setState(324);
						((ExprContext)_localctx).right = expr(5);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(325);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(326);
						((ExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==K_ISNULL || _la==K_ISNOTNULL) ) {
							((ExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(331);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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

	public static class FunctionContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			function_name();
			setState(333);
			match(T__1);
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(334);
				expr(0);
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(335);
					match(T__2);
					setState(336);
					expr(0);
					}
					}
					setState(341);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(342);
				match(T__5);
				}
				break;
			}
			setState(345);
			match(T__3);
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

	public static class Result_columnContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).enterResult_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).exitResult_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitResult_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_result_column);
		int _la;
		try {
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				expr(0);
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==IDENTIFIER) {
					{
					setState(349);
					column_alias();
					}
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

	public static class Column_modifierContext extends ParserRuleContext {
		public Token nullable_column;
		public Token primary_key;
		public TerminalNode K_WHERE() { return getToken(MapleParser.K_WHERE, 0); }
		public TerminalNode K_PK() { return getToken(MapleParser.K_PK, 0); }
		public Column_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).enterColumn_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).exitColumn_modifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitColumn_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_modifierContext column_modifier() throws RecognitionException {
		Column_modifierContext _localctx = new Column_modifierContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_column_modifier);
		try {
			setState(356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_WHERE:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				((Column_modifierContext)_localctx).nullable_column = match(K_WHERE);
				}
				break;
			case K_PK:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				((Column_modifierContext)_localctx).primary_key = match(K_PK);
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

	public static class Column_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_column_name);
		try {
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				any_name();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				match(T__5);
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

	public static class Table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			any_name();
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

	public static class Table_aliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).exitTable_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitTable_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			any_name();
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

	public static class Column_aliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).enterColumn_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).exitColumn_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitColumn_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_column_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			any_name();
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

	public static class Database_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).enterDatabase_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).exitDatabase_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitDatabase_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			any_name();
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

	public static class Function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			any_name();
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

	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(MapleParser.NUMERIC_LITERAL, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).exitSigned_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitSigned_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8 || _la==T__9) {
				{
				setState(372);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__9) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(375);
			match(NUMERIC_LITERAL);
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

	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(MapleParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(MapleParser.STRING_LITERAL, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).exitLiteral_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			_la = _input.LA(1);
			if ( !(_la==NUMERIC_LITERAL || _la==STRING_LITERAL) ) {
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

	public static class Any_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MapleParser.IDENTIFIER, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).enterAny_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).exitAny_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitAny_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_any_name);
		try {
			setState(384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				match(IDENTIFIER);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
				match(T__1);
				setState(381);
				any_name();
				setState(382);
				match(T__3);
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

	public static class Embedded_sqlContext extends ParserRuleContext {
		public TerminalNode K_OPEN_SQL_STMT() { return getToken(MapleParser.K_OPEN_SQL_STMT, 0); }
		public Any_stmtContext any_stmt() {
			return getRuleContext(Any_stmtContext.class,0);
		}
		public TerminalNode K_CLOSE_SQL_STMT() { return getToken(MapleParser.K_CLOSE_SQL_STMT, 0); }
		public Embedded_sqlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_embedded_sql; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).enterEmbedded_sql(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).exitEmbedded_sql(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitEmbedded_sql(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Embedded_sqlContext embedded_sql() throws RecognitionException {
		Embedded_sqlContext _localctx = new Embedded_sqlContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_embedded_sql);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(K_OPEN_SQL_STMT);
			setState(387);
			any_stmt();
			setState(388);
			match(K_CLOSE_SQL_STMT);
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

	public static class Any_stmtContext extends ParserRuleContext {
		public Any_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).enterAny_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).exitAny_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitAny_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_stmtContext any_stmt() throws RecognitionException {
		Any_stmtContext _localctx = new Any_stmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_any_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(390);
					matchWildcard();
					}
					} 
				}
				setState(395);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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
		case 18:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u018f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\5\2G\n\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\5\4P\n\4\3\4"+
		"\3\4\3\4\5\4U\n\4\7\4W\n\4\f\4\16\4Z\13\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"b\n\5\3\6\3\6\3\6\3\6\3\6\7\6i\n\6\f\6\16\6l\13\6\7\6n\n\6\f\6\16\6q\13"+
		"\6\3\6\3\6\7\6u\n\6\f\6\16\6x\13\6\3\7\3\7\3\7\3\b\3\b\3\b\5\b\u0080\n"+
		"\b\3\b\3\b\3\b\3\b\3\b\7\b\u0087\n\b\f\b\16\b\u008a\13\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\b\u0091\n\b\3\b\5\b\u0094\n\b\3\t\3\t\3\t\5\t\u0099\n\t\3\t\3"+
		"\t\3\t\5\t\u009e\n\t\3\n\3\n\3\n\5\n\u00a3\n\n\3\n\3\n\3\n\3\n\3\n\7\n"+
		"\u00aa\n\n\f\n\16\n\u00ad\13\n\3\n\3\n\5\n\u00b1\n\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\7\n\u00bd\n\n\f\n\16\n\u00c0\13\n\5\n\u00c2\n\n"+
		"\3\n\5\n\u00c5\n\n\3\13\3\13\3\13\7\13\u00ca\n\13\f\13\16\13\u00cd\13"+
		"\13\3\f\3\f\3\f\7\f\u00d2\n\f\f\f\16\f\u00d5\13\f\3\r\3\r\5\r\u00d9\n"+
		"\r\3\r\3\r\3\r\3\r\7\r\u00df\n\r\f\r\16\r\u00e2\13\r\5\r\u00e4\n\r\3\r"+
		"\7\r\u00e7\n\r\f\r\16\r\u00ea\13\r\5\r\u00ec\n\r\3\r\5\r\u00ef\n\r\3\16"+
		"\3\16\3\16\5\16\u00f4\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00fd"+
		"\n\16\5\16\u00ff\n\16\3\16\5\16\u0102\n\16\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\21\3\21\5\21\u010c\n\21\3\21\3\21\5\21\u0110\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u011d\n\22\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u0126\n\24\3\24\3\24\3\24\5\24\u012b\n\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0137\n\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\7\24\u014a\n\24\f\24\16\24\u014d\13\24\3\25\3\25\3\25\3\25"+
		"\3\25\7\25\u0154\n\25\f\25\16\25\u0157\13\25\3\25\5\25\u015a\n\25\3\25"+
		"\3\25\3\26\3\26\3\26\5\26\u0161\n\26\5\26\u0163\n\26\3\27\3\27\5\27\u0167"+
		"\n\27\3\30\3\30\5\30\u016b\n\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\5\36\u0178\n\36\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \5 "+
		"\u0183\n \3!\3!\3!\3!\3\"\7\"\u018a\n\"\f\"\16\"\u018d\13\"\3\"\fXjov"+
		"\u00be\u00cb\u00d3\u00e0\u00e8\u018b\3&#\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2\7\3\2\66\67\3\2\b\n\3\2\13\f\6"+
		"\2\r\23\37!$$\'*\3\2%&\2\u01ac\2F\3\2\2\2\4J\3\2\2\2\6M\3\2\2\2\ba\3\2"+
		"\2\2\nc\3\2\2\2\fy\3\2\2\2\16\177\3\2\2\2\20\u0098\3\2\2\2\22\u00a2\3"+
		"\2\2\2\24\u00c6\3\2\2\2\26\u00ce\3\2\2\2\30\u00d6\3\2\2\2\32\u00f3\3\2"+
		"\2\2\34\u0103\3\2\2\2\36\u0106\3\2\2\2 \u0109\3\2\2\2\"\u0111\3\2\2\2"+
		"$\u011e\3\2\2\2&\u0136\3\2\2\2(\u014e\3\2\2\2*\u0162\3\2\2\2,\u0166\3"+
		"\2\2\2.\u016a\3\2\2\2\60\u016c\3\2\2\2\62\u016e\3\2\2\2\64\u0170\3\2\2"+
		"\2\66\u0172\3\2\2\28\u0174\3\2\2\2:\u0177\3\2\2\2<\u017b\3\2\2\2>\u0182"+
		"\3\2\2\2@\u0184\3\2\2\2B\u018b\3\2\2\2DG\5\6\4\2EG\5\4\3\2FD\3\2\2\2F"+
		"E\3\2\2\2GH\3\2\2\2HI\7\2\2\3I\3\3\2\2\2JK\7;\2\2KL\b\3\1\2L\5\3\2\2\2"+
		"MO\5\b\5\2NP\7\3\2\2ON\3\2\2\2OP\3\2\2\2PX\3\2\2\2QR\7\3\2\2RT\5\b\5\2"+
		"SU\7\3\2\2TS\3\2\2\2TU\3\2\2\2UW\3\2\2\2VQ\3\2\2\2WZ\3\2\2\2XY\3\2\2\2"+
		"XV\3\2\2\2Y\7\3\2\2\2ZX\3\2\2\2[b\5\30\r\2\\b\5\n\6\2]b\5\22\n\2^b\5\20"+
		"\t\2_b\5\16\b\2`b\5@!\2a[\3\2\2\2a\\\3\2\2\2a]\3\2\2\2a^\3\2\2\2a_\3\2"+
		"\2\2a`\3\2\2\2b\t\3\2\2\2cd\5\60\31\2do\7\4\2\2ej\5 \21\2fg\7\5\2\2gi"+
		"\5 \21\2hf\3\2\2\2il\3\2\2\2jk\3\2\2\2jh\3\2\2\2kn\3\2\2\2lj\3\2\2\2m"+
		"e\3\2\2\2nq\3\2\2\2op\3\2\2\2om\3\2\2\2pr\3\2\2\2qo\3\2\2\2rv\7\6\2\2"+
		"su\5\f\7\2ts\3\2\2\2ux\3\2\2\2vw\3\2\2\2vt\3\2\2\2w\13\3\2\2\2xv\3\2\2"+
		"\2yz\7\31\2\2z{\5\60\31\2{\r\3\2\2\2|}\5\66\34\2}~\7\7\2\2~\u0080\3\2"+
		"\2\2\177|\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\5"+
		"\60\31\2\u0082\u0083\7\4\2\2\u0083\u0088\5.\30\2\u0084\u0085\7\5\2\2\u0085"+
		"\u0087\5.\30\2\u0086\u0084\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2"+
		"\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b"+
		"\u008c\7\6\2\2\u008c\u0090\3\2\2\2\u008d\u008e\7\26\2\2\u008e\u0091\5"+
		"\26\f\2\u008f\u0091\5\30\r\2\u0090\u008d\3\2\2\2\u0090\u008f\3\2\2\2\u0091"+
		"\u0093\3\2\2\2\u0092\u0094\5\36\20\2\u0093\u0092\3\2\2\2\u0093\u0094\3"+
		"\2\2\2\u0094\17\3\2\2\2\u0095\u0096\5\66\34\2\u0096\u0097\7\7\2\2\u0097"+
		"\u0099\3\2\2\2\u0098\u0095\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\u009b\5\60\31\2\u009b\u009d\7\25\2\2\u009c\u009e\5\36\20\2"+
		"\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\21\3\2\2\2\u009f\u00a0"+
		"\5\66\34\2\u00a0\u00a1\7\7\2\2\u00a1\u00a3\3\2\2\2\u00a2\u009f\3\2\2\2"+
		"\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00b0\5\60\31\2\u00a5\u00a6"+
		"\7\4\2\2\u00a6\u00ab\5.\30\2\u00a7\u00a8\7\5\2\2\u00a8\u00aa\5.\30\2\u00a9"+
		"\u00a7\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\7\6\2\2\u00af"+
		"\u00b1\3\2\2\2\u00b0\u00a5\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00c4\3\2"+
		"\2\2\u00b2\u00c1\7\25\2\2\u00b3\u00c2\5\24\13\2\u00b4\u00b5\7\4\2\2\u00b5"+
		"\u00b6\5\24\13\2\u00b6\u00be\7\6\2\2\u00b7\u00b8\7\5\2\2\u00b8\u00b9\7"+
		"\4\2\2\u00b9\u00ba\5\24\13\2\u00ba\u00bb\7\6\2\2\u00bb\u00bd\3\2\2\2\u00bc"+
		"\u00b7\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bf\3\2\2\2\u00be\u00bc\3\2"+
		"\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00b3\3\2\2\2\u00c1"+
		"\u00b4\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c5\5\30\r\2\u00c4\u00b2\3"+
		"\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\23\3\2\2\2\u00c6\u00cb\5&\24\2\u00c7"+
		"\u00c8\7\5\2\2\u00c8\u00ca\5&\24\2\u00c9\u00c7\3\2\2\2\u00ca\u00cd\3\2"+
		"\2\2\u00cb\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\25\3\2\2\2\u00cd\u00cb"+
		"\3\2\2\2\u00ce\u00d3\5&\24\2\u00cf\u00d0\7\5\2\2\u00d0\u00d2\5&\24\2\u00d1"+
		"\u00cf\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d3\u00d1\3\2"+
		"\2\2\u00d4\27\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d8\5\60\31\2\u00d7"+
		"\u00d9\5\62\32\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00eb\3"+
		"\2\2\2\u00da\u00e3\7\24\2\2\u00db\u00e0\5*\26\2\u00dc\u00dd\7\5\2\2\u00dd"+
		"\u00df\5*\26\2\u00de\u00dc\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00e1\3\2"+
		"\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3"+
		"\u00db\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e8\3\2\2\2\u00e5\u00e7\5\32"+
		"\16\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00da\3\2"+
		"\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00ef\5\36\20\2\u00ee"+
		"\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\31\3\2\2\2\u00f0\u00f4\7\31\2"+
		"\2\u00f1\u00f4\7\27\2\2\u00f2\u00f4\7\30\2\2\u00f3\u00f0\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00fe\3\2\2\2\u00f5\u00f6\7\4"+
		"\2\2\u00f6\u00f7\5\30\r\2\u00f7\u00f8\7\6\2\2\u00f8\u00f9\5\62\32\2\u00f9"+
		"\u00ff\3\2\2\2\u00fa\u00fc\5\60\31\2\u00fb\u00fd\5\62\32\2\u00fc\u00fb"+
		"\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00f5\3\2\2\2\u00fe"+
		"\u00fa\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u0102\5\34\17\2\u0101\u0100\3"+
		"\2\2\2\u0101\u0102\3\2\2\2\u0102\33\3\2\2\2\u0103\u0104\7\60\2\2\u0104"+
		"\u0105\5&\24\2\u0105\35\3\2\2\2\u0106\u0107\7\34\2\2\u0107\u0108\5&\24"+
		"\2\u0108\37\3\2\2\2\u0109\u010b\5.\30\2\u010a\u010c\5,\27\2\u010b\u010a"+
		"\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\5\"\22\2"+
		"\u010e\u0110\5$\23\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110!\3"+
		"\2\2\2\u0111\u011c\5> \2\u0112\u0113\7\4\2\2\u0113\u0114\5:\36\2\u0114"+
		"\u0115\7\6\2\2\u0115\u011d\3\2\2\2\u0116\u0117\7\4\2\2\u0117\u0118\5:"+
		"\36\2\u0118\u0119\7\5\2\2\u0119\u011a\5:\36\2\u011a\u011b\7\6\2\2\u011b"+
		"\u011d\3\2\2\2\u011c\u0112\3\2\2\2\u011c\u0116\3\2\2\2\u011c\u011d\3\2"+
		"\2\2\u011d#\3\2\2\2\u011e\u011f\t\2\2\2\u011f%\3\2\2\2\u0120\u0121\b\24"+
		"\1\2\u0121\u0137\5<\37\2\u0122\u0123\5\66\34\2\u0123\u0124\7\7\2\2\u0124"+
		"\u0126\3\2\2\2\u0125\u0122\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\3\2"+
		"\2\2\u0127\u0128\5\60\31\2\u0128\u0129\7\7\2\2\u0129\u012b\3\2\2\2\u012a"+
		"\u0125\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u0137\5."+
		"\30\2\u012d\u0137\5(\25\2\u012e\u012f\7\4\2\2\u012f\u0130\5\30\r\2\u0130"+
		"\u0131\7\6\2\2\u0131\u0137\3\2\2\2\u0132\u0133\7\4\2\2\u0133\u0134\5&"+
		"\24\2\u0134\u0135\7\6\2\2\u0135\u0137\3\2\2\2\u0136\u0120\3\2\2\2\u0136"+
		"\u012a\3\2\2\2\u0136\u012d\3\2\2\2\u0136\u012e\3\2\2\2\u0136\u0132\3\2"+
		"\2\2\u0137\u014b\3\2\2\2\u0138\u0139\f\13\2\2\u0139\u013a\t\3\2\2\u013a"+
		"\u014a\5&\24\f\u013b\u013c\f\n\2\2\u013c\u013d\t\4\2\2\u013d\u014a\5&"+
		"\24\13\u013e\u013f\f\t\2\2\u013f\u0140\t\5\2\2\u0140\u014a\5&\24\n\u0141"+
		"\u0142\f\7\2\2\u0142\u0143\7\36\2\2\u0143\u014a\5&\24\b\u0144\u0145\f"+
		"\6\2\2\u0145\u0146\7\61\2\2\u0146\u014a\5&\24\7\u0147\u0148\f\b\2\2\u0148"+
		"\u014a\t\6\2\2\u0149\u0138\3\2\2\2\u0149\u013b\3\2\2\2\u0149\u013e\3\2"+
		"\2\2\u0149\u0141\3\2\2\2\u0149\u0144\3\2\2\2\u0149\u0147\3\2\2\2\u014a"+
		"\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\'\3\2\2\2"+
		"\u014d\u014b\3\2\2\2\u014e\u014f\58\35\2\u014f\u0159\7\4\2\2\u0150\u0155"+
		"\5&\24\2\u0151\u0152\7\5\2\2\u0152\u0154\5&\24\2\u0153\u0151\3\2\2\2\u0154"+
		"\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u015a\3\2"+
		"\2\2\u0157\u0155\3\2\2\2\u0158\u015a\7\b\2\2\u0159\u0150\3\2\2\2\u0159"+
		"\u0158\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\7\6"+
		"\2\2\u015c)\3\2\2\2\u015d\u0163\5&\24\2\u015e\u0160\5&\24\2\u015f\u0161"+
		"\5\64\33\2\u0160\u015f\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0163\3\2\2\2"+
		"\u0162\u015d\3\2\2\2\u0162\u015e\3\2\2\2\u0163+\3\2\2\2\u0164\u0167\7"+
		"\34\2\2\u0165\u0167\7\35\2\2\u0166\u0164\3\2\2\2\u0166\u0165\3\2\2\2\u0167"+
		"-\3\2\2\2\u0168\u016b\5> \2\u0169\u016b\7\b\2\2\u016a\u0168\3\2\2\2\u016a"+
		"\u0169\3\2\2\2\u016b/\3\2\2\2\u016c\u016d\5> \2\u016d\61\3\2\2\2\u016e"+
		"\u016f\5> \2\u016f\63\3\2\2\2\u0170\u0171\5> \2\u0171\65\3\2\2\2\u0172"+
		"\u0173\5> \2\u0173\67\3\2\2\2\u0174\u0175\5> \2\u01759\3\2\2\2\u0176\u0178"+
		"\t\4\2\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179"+
		"\u017a\7\66\2\2\u017a;\3\2\2\2\u017b\u017c\t\2\2\2\u017c=\3\2\2\2\u017d"+
		"\u0183\7\65\2\2\u017e\u017f\7\4\2\2\u017f\u0180\5> \2\u0180\u0181\7\6"+
		"\2\2\u0181\u0183\3\2\2\2\u0182\u017d\3\2\2\2\u0182\u017e\3\2\2\2\u0183"+
		"?\3\2\2\2\u0184\u0185\7\32\2\2\u0185\u0186\5B\"\2\u0186\u0187\7\33\2\2"+
		"\u0187A\3\2\2\2\u0188\u018a\13\2\2\2\u0189\u0188\3\2\2\2\u018a\u018d\3"+
		"\2\2\2\u018b\u018c\3\2\2\2\u018b\u0189\3\2\2\2\u018cC\3\2\2\2\u018d\u018b"+
		"\3\2\2\2\63FOTXajov\177\u0088\u0090\u0093\u0098\u009d\u00a2\u00ab\u00b0"+
		"\u00be\u00c1\u00c4\u00cb\u00d3\u00d8\u00e0\u00e3\u00e8\u00eb\u00ee\u00f3"+
		"\u00fc\u00fe\u0101\u010b\u010f\u011c\u0125\u012a\u0136\u0149\u014b\u0155"+
		"\u0159\u0160\u0162\u0166\u016a\u0177\u0182\u018b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}