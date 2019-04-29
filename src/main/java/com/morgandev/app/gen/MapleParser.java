// Generated from C:/Users/Morgan/IdeaProjects/MapleAntlr/src/main/antlr/com/morgandev/maple/Maple\Maple.g4 by ANTLR 4.7.2
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
		T__17=18, K_SELECT=19, K_INSERT=20, K_UPDATE=21, K_LEFT_JOIN=22, K_RIGHT_JOIN=23, 
		K_JOIN=24, K_CREATE_TABLE=25, K_OPEN_SQL_STMT=26, K_CLOSE_SQL_STMT=27, 
		K_WHERE=28, K_AND=29, K_NOTBETWEEN=30, K_BETWEEN=31, K_IN=32, K_INNER=33, 
		K_INTO=34, K_IS=35, K_ISNULL=36, K_ISNOTNULL=37, K_ISNOT=38, K_NOTIN=39, 
		K_NOTLIKE=40, K_LIKE=41, K_LIMIT=42, K_NOT=43, K_NOTNULL=44, K_NULL=45, 
		K_OF=46, K_ON=47, K_OR=48, K_WHEN=49, K_WITH=50, K_WITHOUT=51, NUMERIC_LITERAL=52, 
		STRING_LITERAL=53, SINGLE_LINE_COMMENT=54, MULTILINE_COMMENT=55, SPACES=56, 
		WORD=57, UNEXPECTED_CHAR=58;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_maple_stmt_list = 2, RULE_maple_stmt = 3, 
		RULE_create_table_stmt = 4, RULE_update_stmt = 5, RULE_insert_stmt = 6, 
		RULE_select_stmt = 7, RULE_join_stmt = 8, RULE_conditional = 9, RULE_expr = 10, 
		RULE_function = 11, RULE_result_column = 12, RULE_any_column_definition = 13, 
		RULE_null_column_name = 14, RULE_column_name = 15, RULE_table_name = 16, 
		RULE_table_alias = 17, RULE_database_name = 18, RULE_function_name = 19, 
		RULE_literal_value = 20, RULE_any_name = 21, RULE_embedded_sql = 22, RULE_any_stmt = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "error", "maple_stmt_list", "maple_stmt", "create_table_stmt", 
			"update_stmt", "insert_stmt", "select_stmt", "join_stmt", "conditional", 
			"expr", "function", "result_column", "any_column_definition", "null_column_name", 
			"column_name", "table_name", "table_alias", "database_name", "function_name", 
			"literal_value", "any_name", "embedded_sql", "any_stmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "'.'", "'('", "')'", "'*'", "'/'", "'%'", "'-'", 
			"'='", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'AND'", "'OR'", 
			"'->'", "'<-'", "'<<-'", "'<<>'", "'<>>'", "'<>'", "'+'", "'<?'", "'?>'", 
			"'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "K_SELECT", "K_INSERT", "K_UPDATE", 
			"K_LEFT_JOIN", "K_RIGHT_JOIN", "K_JOIN", "K_CREATE_TABLE", "K_OPEN_SQL_STMT", 
			"K_CLOSE_SQL_STMT", "K_WHERE", "K_AND", "K_NOTBETWEEN", "K_BETWEEN", 
			"K_IN", "K_INNER", "K_INTO", "K_IS", "K_ISNULL", "K_ISNOTNULL", "K_ISNOT", 
			"K_NOTIN", "K_NOTLIKE", "K_LIKE", "K_LIMIT", "K_NOT", "K_NOTNULL", "K_NULL", 
			"K_OF", "K_ON", "K_OR", "K_WHEN", "K_WITH", "K_WITHOUT", "NUMERIC_LITERAL", 
			"STRING_LITERAL", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES", 
			"WORD", "UNEXPECTED_CHAR"
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
		public List<Maple_stmt_listContext> maple_stmt_list() {
			return getRuleContexts(Maple_stmt_listContext.class);
		}
		public Maple_stmt_listContext maple_stmt_list(int i) {
			return getRuleContext(Maple_stmt_listContext.class,i);
		}
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << K_OPEN_SQL_STMT) | (1L << WORD) | (1L << UNEXPECTED_CHAR))) != 0)) {
				{
				setState(50);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case K_OPEN_SQL_STMT:
				case WORD:
					{
					setState(48);
					maple_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(49);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
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
			setState(57);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(60);
				match(T__0);
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			maple_stmt();
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(68); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(67);
						match(T__0);
						}
						}
						setState(70); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__0 );
					setState(72);
					maple_stmt();
					}
					} 
				}
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(78);
					match(T__0);
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
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
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(84);
				create_table_stmt();
				}
				break;
			case 2:
				{
				setState(85);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(86);
				insert_stmt();
				}
				break;
			case 4:
				{
				setState(87);
				update_stmt();
				}
				break;
			case 5:
				{
				setState(88);
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
		public TerminalNode K_CREATE_TABLE() { return getToken(MapleParser.K_CREATE_TABLE, 0); }
		public List<Any_column_definitionContext> any_column_definition() {
			return getRuleContexts(Any_column_definitionContext.class);
		}
		public Any_column_definitionContext any_column_definition(int i) {
			return getRuleContext(Any_column_definitionContext.class,i);
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
			setState(91);
			table_name();
			setState(92);
			match(K_CREATE_TABLE);
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(93);
					any_column_definition();
					setState(98);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(94);
							match(T__1);
							setState(95);
							any_column_definition();
							}
							} 
						}
						setState(100);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					}
					}
					} 
				}
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class Update_stmtContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_UPDATE() { return getToken(MapleParser.K_UPDATE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
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
		enterRule(_localctx, 10, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(106);
				database_name();
				setState(107);
				match(T__2);
				}
				break;
			}
			setState(111);
			table_name();
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(112);
				match(T__3);
				setState(113);
				column_name();
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(114);
					match(T__1);
					setState(115);
					column_name();
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(121);
				match(T__4);
				}
			}

			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_UPDATE:
				{
				setState(125);
				match(K_UPDATE);
				setState(126);
				match(T__3);
				setState(127);
				expr(0);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(128);
					match(T__1);
					setState(129);
					expr(0);
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(135);
				match(T__4);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(136);
					match(T__1);
					setState(137);
					match(T__3);
					setState(138);
					expr(0);
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(139);
						match(T__1);
						setState(140);
						expr(0);
						}
						}
						setState(145);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(146);
					match(T__4);
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case WORD:
				{
				setState(153);
				select_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(156);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
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
		enterRule(_localctx, 12, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(159);
				database_name();
				setState(160);
				match(T__2);
				}
				break;
			}
			setState(164);
			table_name();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(165);
				match(T__3);
				setState(166);
				column_name();
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(167);
					match(T__1);
					setState(168);
					column_name();
					}
					}
					setState(173);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(174);
				match(T__4);
				}
			}

			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INSERT:
				{
				setState(178);
				match(K_INSERT);
				setState(179);
				match(T__3);
				setState(180);
				expr(0);
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(181);
					match(T__1);
					setState(182);
					expr(0);
					}
					}
					setState(187);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(188);
				match(T__4);
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(189);
					match(T__1);
					setState(190);
					match(T__3);
					setState(191);
					expr(0);
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(192);
						match(T__1);
						setState(193);
						expr(0);
						}
						}
						setState(198);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(199);
					match(T__4);
					}
					}
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case WORD:
				{
				setState(206);
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

	public static class Select_stmtContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode K_SELECT() { return getToken(MapleParser.K_SELECT, 0); }
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
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
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
		enterRule(_localctx, 14, RULE_select_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			table_name();
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(210);
				table_alias();
				}
				break;
			}
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_SELECT) {
				{
				setState(213);
				match(K_SELECT);
				setState(214);
				result_column();
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(215);
						match(T__1);
						setState(216);
						result_column();
						}
						} 
					}
					setState(221);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				}
			}

			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(224);
					join_stmt();
					}
					} 
				}
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(230);
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
		enterRule(_localctx, 16, RULE_join_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(K_JOIN);
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				setState(234);
				match(T__3);
				setState(235);
				select_stmt();
				setState(236);
				match(T__4);
				setState(237);
				table_alias();
				}
				break;
			case WORD:
				{
				setState(239);
				table_name();
				setState(241);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(240);
					table_alias();
					}
					break;
				}
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
		enterRule(_localctx, 18, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(K_WHERE);
			setState(246);
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
		public TerminalNode K_CREATE_TABLE() { return getToken(MapleParser.K_CREATE_TABLE, 0); }
		public TerminalNode K_IS() { return getToken(MapleParser.K_IS, 0); }
		public TerminalNode K_ISNOT() { return getToken(MapleParser.K_ISNOT, 0); }
		public TerminalNode K_LIKE() { return getToken(MapleParser.K_LIKE, 0); }
		public TerminalNode K_ISNOTNULL() { return getToken(MapleParser.K_ISNOTNULL, 0); }
		public TerminalNode K_ISNULL() { return getToken(MapleParser.K_ISNULL, 0); }
		public TerminalNode K_NOTLIKE() { return getToken(MapleParser.K_NOTLIKE, 0); }
		public TerminalNode K_NOTIN() { return getToken(MapleParser.K_NOTIN, 0); }
		public TerminalNode K_IN() { return getToken(MapleParser.K_IN, 0); }
		public TerminalNode K_BETWEEN() { return getToken(MapleParser.K_BETWEEN, 0); }
		public TerminalNode K_NOTBETWEEN() { return getToken(MapleParser.K_NOTBETWEEN, 0); }
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(249);
				literal_value();
				}
				break;
			case 2:
				{
				setState(258);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(253);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						setState(250);
						database_name();
						setState(251);
						match(T__2);
						}
						break;
					}
					setState(255);
					table_name();
					setState(256);
					match(T__2);
					}
					break;
				}
				setState(260);
				column_name();
				}
				break;
			case 3:
				{
				setState(261);
				function();
				}
				break;
			case 4:
				{
				setState(262);
				match(T__3);
				setState(263);
				select_stmt();
				setState(264);
				match(T__4);
				}
				break;
			case 5:
				{
				setState(266);
				match(T__3);
				setState(267);
				expr(0);
				setState(268);
				match(T__4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(289);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(287);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(272);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(273);
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
						setState(274);
						((ExprContext)_localctx).right = expr(9);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(275);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(276);
						((ExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__8 || _la==K_CREATE_TABLE) ) {
							((ExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(277);
						((ExprContext)_localctx).right = expr(8);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(278);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(279);
						((ExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << K_NOTBETWEEN) | (1L << K_BETWEEN) | (1L << K_IN) | (1L << K_IS) | (1L << K_ISNULL) | (1L << K_ISNOTNULL) | (1L << K_ISNOT) | (1L << K_NOTIN) | (1L << K_NOTLIKE) | (1L << K_LIKE))) != 0)) ) {
							((ExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(280);
						((ExprContext)_localctx).right = expr(7);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(281);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(282);
						((ExprContext)_localctx).operator = match(T__16);
						setState(283);
						((ExprContext)_localctx).right = expr(6);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(284);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(285);
						((ExprContext)_localctx).operator = match(T__17);
						setState(286);
						((ExprContext)_localctx).right = expr(5);
						}
						break;
					}
					} 
				}
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
		enterRule(_localctx, 22, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			function_name();
			setState(293);
			match(T__3);
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(294);
				expr(0);
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(295);
					match(T__1);
					setState(296);
					expr(0);
					}
					}
					setState(301);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(302);
				match(T__5);
				}
				break;
			}
			setState(305);
			match(T__4);
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
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		enterRule(_localctx, 24, RULE_result_column);
		try {
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				table_name();
				setState(309);
				match(T__2);
				setState(310);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(312);
				expr(0);
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

	public static class Any_column_definitionContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Null_column_nameContext null_column_name() {
			return getRuleContext(Null_column_nameContext.class,0);
		}
		public Any_stmtContext any_stmt() {
			return getRuleContext(Any_stmtContext.class,0);
		}
		public Any_column_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_column_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).enterAny_column_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).exitAny_column_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitAny_column_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_column_definitionContext any_column_definition() throws RecognitionException {
		Any_column_definitionContext _localctx = new Any_column_definitionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_any_column_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(315);
				column_name();
				}
				break;
			case 2:
				{
				setState(316);
				null_column_name();
				}
				break;
			}
			{
			setState(319);
			match(T__3);
			setState(320);
			any_stmt();
			setState(321);
			match(T__4);
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

	public static class Null_column_nameContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(MapleParser.K_WHERE, 0); }
		public Null_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).enterNull_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).exitNull_column_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitNull_column_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Null_column_nameContext null_column_name() throws RecognitionException {
		Null_column_nameContext _localctx = new Null_column_nameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_null_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			column_name();
			setState(324);
			match(K_WHERE);
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
		enterRule(_localctx, 30, RULE_column_name);
		try {
			setState(328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				any_name();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
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
		enterRule(_localctx, 32, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
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
		enterRule(_localctx, 34, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
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
		enterRule(_localctx, 36, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
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
		enterRule(_localctx, 38, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
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
		enterRule(_localctx, 40, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
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
		public TerminalNode WORD() { return getToken(MapleParser.WORD, 0); }
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
		enterRule(_localctx, 42, RULE_any_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(WORD);
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
		enterRule(_localctx, 44, RULE_embedded_sql);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(K_OPEN_SQL_STMT);
			setState(343);
			any_stmt();
			setState(344);
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
		enterRule(_localctx, 46, RULE_any_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(346);
					matchWildcard();
					}
					} 
				}
				setState(351);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u0163\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\7\2\65\n\2\f\2\16\28\13\2\3\2\3\2\3\3\3\3\3\3\3\4\7\4@\n\4\f"+
		"\4\16\4C\13\4\3\4\3\4\6\4G\n\4\r\4\16\4H\3\4\7\4L\n\4\f\4\16\4O\13\4\3"+
		"\4\7\4R\n\4\f\4\16\4U\13\4\3\5\3\5\3\5\3\5\3\5\5\5\\\n\5\3\6\3\6\3\6\3"+
		"\6\3\6\7\6c\n\6\f\6\16\6f\13\6\7\6h\n\6\f\6\16\6k\13\6\3\7\3\7\3\7\5\7"+
		"p\n\7\3\7\3\7\3\7\3\7\3\7\7\7w\n\7\f\7\16\7z\13\7\3\7\3\7\5\7~\n\7\3\7"+
		"\3\7\3\7\3\7\3\7\7\7\u0085\n\7\f\7\16\7\u0088\13\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\7\7\u0090\n\7\f\7\16\7\u0093\13\7\3\7\3\7\7\7\u0097\n\7\f\7\16\7"+
		"\u009a\13\7\3\7\5\7\u009d\n\7\3\7\5\7\u00a0\n\7\3\b\3\b\3\b\5\b\u00a5"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\7\b\u00ac\n\b\f\b\16\b\u00af\13\b\3\b\3\b\5\b"+
		"\u00b3\n\b\3\b\3\b\3\b\3\b\3\b\7\b\u00ba\n\b\f\b\16\b\u00bd\13\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\7\b\u00c5\n\b\f\b\16\b\u00c8\13\b\3\b\3\b\7\b\u00cc"+
		"\n\b\f\b\16\b\u00cf\13\b\3\b\5\b\u00d2\n\b\3\t\3\t\5\t\u00d6\n\t\3\t\3"+
		"\t\3\t\3\t\7\t\u00dc\n\t\f\t\16\t\u00df\13\t\5\t\u00e1\n\t\3\t\7\t\u00e4"+
		"\n\t\f\t\16\t\u00e7\13\t\3\t\5\t\u00ea\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u00f4\n\n\5\n\u00f6\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u0100\n\f\3\f\3\f\3\f\5\f\u0105\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\5\f\u0111\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\7\f\u0122\n\f\f\f\16\f\u0125\13\f\3\r\3\r\3\r\3\r\3\r\7\r"+
		"\u012c\n\r\f\r\16\r\u012f\13\r\3\r\5\r\u0132\n\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u013c\n\16\3\17\3\17\5\17\u0140\n\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\21\3\21\5\21\u014b\n\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\31\7\31"+
		"\u015e\n\31\f\31\16\31\u0161\13\31\3\31\7di\u00dd\u00e5\u015f\3\26\32"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\6\3\2\b\n\4\2\13"+
		"\13\33\33\5\2\f\22 \"%+\3\2\66\67\2\u017f\2\66\3\2\2\2\4;\3\2\2\2\6A\3"+
		"\2\2\2\b[\3\2\2\2\n]\3\2\2\2\fo\3\2\2\2\16\u00a4\3\2\2\2\20\u00d3\3\2"+
		"\2\2\22\u00eb\3\2\2\2\24\u00f7\3\2\2\2\26\u0110\3\2\2\2\30\u0126\3\2\2"+
		"\2\32\u013b\3\2\2\2\34\u013f\3\2\2\2\36\u0145\3\2\2\2 \u014a\3\2\2\2\""+
		"\u014c\3\2\2\2$\u014e\3\2\2\2&\u0150\3\2\2\2(\u0152\3\2\2\2*\u0154\3\2"+
		"\2\2,\u0156\3\2\2\2.\u0158\3\2\2\2\60\u015f\3\2\2\2\62\65\5\6\4\2\63\65"+
		"\5\4\3\2\64\62\3\2\2\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3"+
		"\2\2\2\679\3\2\2\28\66\3\2\2\29:\7\2\2\3:\3\3\2\2\2;<\7<\2\2<=\b\3\1\2"+
		"=\5\3\2\2\2>@\7\3\2\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2"+
		"\2CA\3\2\2\2DM\5\b\5\2EG\7\3\2\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2"+
		"\2IJ\3\2\2\2JL\5\b\5\2KF\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NS\3\2\2"+
		"\2OM\3\2\2\2PR\7\3\2\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\7\3\2"+
		"\2\2US\3\2\2\2V\\\5\n\6\2W\\\5\20\t\2X\\\5\16\b\2Y\\\5\f\7\2Z\\\5.\30"+
		"\2[V\3\2\2\2[W\3\2\2\2[X\3\2\2\2[Y\3\2\2\2[Z\3\2\2\2\\\t\3\2\2\2]^\5\""+
		"\22\2^i\7\33\2\2_d\5\34\17\2`a\7\4\2\2ac\5\34\17\2b`\3\2\2\2cf\3\2\2\2"+
		"de\3\2\2\2db\3\2\2\2eh\3\2\2\2fd\3\2\2\2g_\3\2\2\2hk\3\2\2\2ij\3\2\2\2"+
		"ig\3\2\2\2j\13\3\2\2\2ki\3\2\2\2lm\5&\24\2mn\7\5\2\2np\3\2\2\2ol\3\2\2"+
		"\2op\3\2\2\2pq\3\2\2\2q}\5\"\22\2rs\7\6\2\2sx\5 \21\2tu\7\4\2\2uw\5 \21"+
		"\2vt\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\7\7\2"+
		"\2|~\3\2\2\2}r\3\2\2\2}~\3\2\2\2~\u009c\3\2\2\2\177\u0080\7\27\2\2\u0080"+
		"\u0081\7\6\2\2\u0081\u0086\5\26\f\2\u0082\u0083\7\4\2\2\u0083\u0085\5"+
		"\26\f\2\u0084\u0082\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u0098\7\7"+
		"\2\2\u008a\u008b\7\4\2\2\u008b\u008c\7\6\2\2\u008c\u0091\5\26\f\2\u008d"+
		"\u008e\7\4\2\2\u008e\u0090\5\26\f\2\u008f\u008d\3\2\2\2\u0090\u0093\3"+
		"\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0094\u0095\7\7\2\2\u0095\u0097\3\2\2\2\u0096\u008a\3\2"+
		"\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009d\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009d\5\20\t\2\u009c\177\3\2"+
		"\2\2\u009c\u009b\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u00a0\5\24\13\2\u009f"+
		"\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\r\3\2\2\2\u00a1\u00a2\5&\24\2"+
		"\u00a2\u00a3\7\5\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a4\u00a5"+
		"\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00b2\5\"\22\2\u00a7\u00a8\7\6\2\2"+
		"\u00a8\u00ad\5 \21\2\u00a9\u00aa\7\4\2\2\u00aa\u00ac\5 \21\2\u00ab\u00a9"+
		"\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\7\7\2\2\u00b1\u00b3\3\2"+
		"\2\2\u00b2\u00a7\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00d1\3\2\2\2\u00b4"+
		"\u00b5\7\26\2\2\u00b5\u00b6\7\6\2\2\u00b6\u00bb\5\26\f\2\u00b7\u00b8\7"+
		"\4\2\2\u00b8\u00ba\5\26\f\2\u00b9\u00b7\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bb\3\2"+
		"\2\2\u00be\u00cd\7\7\2\2\u00bf\u00c0\7\4\2\2\u00c0\u00c1\7\6\2\2\u00c1"+
		"\u00c6\5\26\f\2\u00c2\u00c3\7\4\2\2\u00c3\u00c5\5\26\f\2\u00c4\u00c2\3"+
		"\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\7\7\2\2\u00ca\u00cc\3\2"+
		"\2\2\u00cb\u00bf\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00d2\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d2\5\20"+
		"\t\2\u00d1\u00b4\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\17\3\2\2\2\u00d3\u00d5"+
		"\5\"\22\2\u00d4\u00d6\5$\23\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2"+
		"\u00d6\u00e0\3\2\2\2\u00d7\u00d8\7\25\2\2\u00d8\u00dd\5\32\16\2\u00d9"+
		"\u00da\7\4\2\2\u00da\u00dc\5\32\16\2\u00db\u00d9\3\2\2\2\u00dc\u00df\3"+
		"\2\2\2\u00dd\u00de\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e1\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00e0\u00d7\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e5\3\2"+
		"\2\2\u00e2\u00e4\5\22\n\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2"+
		"\2\2\u00e8\u00ea\5\24\13\2\u00e9\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\21\3\2\2\2\u00eb\u00f5\7\32\2\2\u00ec\u00ed\7\6\2\2\u00ed\u00ee\5\20"+
		"\t\2\u00ee\u00ef\7\7\2\2\u00ef\u00f0\5$\23\2\u00f0\u00f6\3\2\2\2\u00f1"+
		"\u00f3\5\"\22\2\u00f2\u00f4\5$\23\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3"+
		"\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00ec\3\2\2\2\u00f5\u00f1\3\2\2\2\u00f6"+
		"\23\3\2\2\2\u00f7\u00f8\7\36\2\2\u00f8\u00f9\5\26\f\2\u00f9\25\3\2\2\2"+
		"\u00fa\u00fb\b\f\1\2\u00fb\u0111\5*\26\2\u00fc\u00fd\5&\24\2\u00fd\u00fe"+
		"\7\5\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fc\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\u0102\5\"\22\2\u0102\u0103\7\5\2\2\u0103\u0105\3"+
		"\2\2\2\u0104\u00ff\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\u0111\5 \21\2\u0107\u0111\5\30\r\2\u0108\u0109\7\6\2\2\u0109\u010a\5"+
		"\20\t\2\u010a\u010b\7\7\2\2\u010b\u0111\3\2\2\2\u010c\u010d\7\6\2\2\u010d"+
		"\u010e\5\26\f\2\u010e\u010f\7\7\2\2\u010f\u0111\3\2\2\2\u0110\u00fa\3"+
		"\2\2\2\u0110\u0104\3\2\2\2\u0110\u0107\3\2\2\2\u0110\u0108\3\2\2\2\u0110"+
		"\u010c\3\2\2\2\u0111\u0123\3\2\2\2\u0112\u0113\f\n\2\2\u0113\u0114\t\2"+
		"\2\2\u0114\u0122\5\26\f\13\u0115\u0116\f\t\2\2\u0116\u0117\t\3\2\2\u0117"+
		"\u0122\5\26\f\n\u0118\u0119\f\b\2\2\u0119\u011a\t\4\2\2\u011a\u0122\5"+
		"\26\f\t\u011b\u011c\f\7\2\2\u011c\u011d\7\23\2\2\u011d\u0122\5\26\f\b"+
		"\u011e\u011f\f\6\2\2\u011f\u0120\7\24\2\2\u0120\u0122\5\26\f\7\u0121\u0112"+
		"\3\2\2\2\u0121\u0115\3\2\2\2\u0121\u0118\3\2\2\2\u0121\u011b\3\2\2\2\u0121"+
		"\u011e\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2"+
		"\2\2\u0124\27\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0127\5(\25\2\u0127\u0131"+
		"\7\6\2\2\u0128\u012d\5\26\f\2\u0129\u012a\7\4\2\2\u012a\u012c\5\26\f\2"+
		"\u012b\u0129\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e"+
		"\3\2\2\2\u012e\u0132\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0132\7\b\2\2\u0131"+
		"\u0128\3\2\2\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2"+
		"\2\2\u0133\u0134\7\7\2\2\u0134\31\3\2\2\2\u0135\u013c\7\b\2\2\u0136\u0137"+
		"\5\"\22\2\u0137\u0138\7\5\2\2\u0138\u0139\7\b\2\2\u0139\u013c\3\2\2\2"+
		"\u013a\u013c\5\26\f\2\u013b\u0135\3\2\2\2\u013b\u0136\3\2\2\2\u013b\u013a"+
		"\3\2\2\2\u013c\33\3\2\2\2\u013d\u0140\5 \21\2\u013e\u0140\5\36\20\2\u013f"+
		"\u013d\3\2\2\2\u013f\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\7\6"+
		"\2\2\u0142\u0143\5\60\31\2\u0143\u0144\7\7\2\2\u0144\35\3\2\2\2\u0145"+
		"\u0146\5 \21\2\u0146\u0147\7\36\2\2\u0147\37\3\2\2\2\u0148\u014b\5,\27"+
		"\2\u0149\u014b\7\b\2\2\u014a\u0148\3\2\2\2\u014a\u0149\3\2\2\2\u014b!"+
		"\3\2\2\2\u014c\u014d\5,\27\2\u014d#\3\2\2\2\u014e\u014f\5,\27\2\u014f"+
		"%\3\2\2\2\u0150\u0151\5,\27\2\u0151\'\3\2\2\2\u0152\u0153\5,\27\2\u0153"+
		")\3\2\2\2\u0154\u0155\t\5\2\2\u0155+\3\2\2\2\u0156\u0157\7;\2\2\u0157"+
		"-\3\2\2\2\u0158\u0159\7\34\2\2\u0159\u015a\5\60\31\2\u015a\u015b\7\35"+
		"\2\2\u015b/\3\2\2\2\u015c\u015e\13\2\2\2\u015d\u015c\3\2\2\2\u015e\u0161"+
		"\3\2\2\2\u015f\u0160\3\2\2\2\u015f\u015d\3\2\2\2\u0160\61\3\2\2\2\u0161"+
		"\u015f\3\2\2\2,\64\66AHMS[diox}\u0086\u0091\u0098\u009c\u009f\u00a4\u00ad"+
		"\u00b2\u00bb\u00c6\u00cd\u00d1\u00d5\u00dd\u00e0\u00e5\u00e9\u00f3\u00f5"+
		"\u00ff\u0104\u0110\u0121\u0123\u012d\u0131\u013b\u013f\u014a\u015f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}