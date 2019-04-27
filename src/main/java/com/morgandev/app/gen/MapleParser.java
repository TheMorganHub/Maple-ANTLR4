// Generated from C:/Users/Morgan/IdeaProjects/AntlrProj/src/main/antlr/com/morgandev/maple/Maple\Maple.g4 by ANTLR 4.7.2
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
		T__17=18, T__18=19, T__19=20, K_SELECT=21, K_INSERT=22, K_UPDATE=23, K_JOIN=24, 
		K_CREATE_TABLE=25, K_OPEN_SQL_STMT=26, K_CLOSE_SQL_STMT=27, K_AND=28, 
		K_IN=29, K_INNER=30, K_INTO=31, K_IS=32, K_ISNULL=33, K_LIKE=34, K_LIMIT=35, 
		K_MATCH=36, K_NATURAL=37, K_NO=38, K_NOT=39, K_NOTNULL=40, K_NULL=41, 
		K_OF=42, K_ON=43, K_OR=44, K_VIRTUAL=45, K_WHEN=46, K_WHERE=47, K_WITH=48, 
		K_WITHOUT=49, NUMERIC_LITERAL=50, STRING_LITERAL=51, SINGLE_LINE_COMMENT=52, 
		MULTILINE_COMMENT=53, SPACES=54, WORD=55, DIGIT=56, K_REGEXP=57, K_BETWEEN=58, 
		K_GLOB=59, K_ESCAPE=60;
	public static final int
		RULE_maple_stmt_list = 0, RULE_maple_stmt = 1, RULE_create_table_stmt = 2, 
		RULE_update_stmt = 3, RULE_insert_stmt = 4, RULE_select_stmt = 5, RULE_join_stmt = 6, 
		RULE_conditional = 7, RULE_expr = 8, RULE_result_column = 9, RULE_any_column_definition = 10, 
		RULE_null_column_name = 11, RULE_column_name = 12, RULE_table_name = 13, 
		RULE_table_alias = 14, RULE_database_name = 15, RULE_function_name = 16, 
		RULE_literal_value = 17, RULE_any_name = 18, RULE_embedded_sql = 19, RULE_any_stmt = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"maple_stmt_list", "maple_stmt", "create_table_stmt", "update_stmt", 
			"insert_stmt", "select_stmt", "join_stmt", "conditional", "expr", "result_column", 
			"any_column_definition", "null_column_name", "column_name", "table_name", 
			"table_alias", "database_name", "function_name", "literal_value", "any_name", 
			"embedded_sql", "any_stmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "'.'", "'('", "')'", "'||'", "'*'", "'/'", "'%'", 
			"'-'", "'>>'", "'&'", "'|'", "'<='", "'>='", "'='", "'=='", "'!='", "'AND'", 
			"'OR'", "'>'", "'<'", "'<<'", "'<>'", "'+'", "'<?'", "'?>'", null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "K_SELECT", "K_INSERT", 
			"K_UPDATE", "K_JOIN", "K_CREATE_TABLE", "K_OPEN_SQL_STMT", "K_CLOSE_SQL_STMT", 
			"K_AND", "K_IN", "K_INNER", "K_INTO", "K_IS", "K_ISNULL", "K_LIKE", "K_LIMIT", 
			"K_MATCH", "K_NATURAL", "K_NO", "K_NOT", "K_NOTNULL", "K_NULL", "K_OF", 
			"K_ON", "K_OR", "K_VIRTUAL", "K_WHEN", "K_WHERE", "K_WITH", "K_WITHOUT", 
			"NUMERIC_LITERAL", "STRING_LITERAL", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", 
			"SPACES", "WORD", "DIGIT", "K_REGEXP", "K_BETWEEN", "K_GLOB", "K_ESCAPE"
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
		enterRule(_localctx, 0, RULE_maple_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(42);
				match(T__0);
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			maple_stmt();
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(50); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(49);
						match(T__0);
						}
						}
						setState(52); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__0 );
					setState(54);
					maple_stmt();
					}
					} 
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
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
		enterRule(_localctx, 2, RULE_maple_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(66);
				create_table_stmt();
				}
				break;
			case 2:
				{
				setState(67);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(68);
				insert_stmt();
				}
				break;
			case 4:
				{
				setState(69);
				update_stmt();
				}
				break;
			case 5:
				{
				setState(70);
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
		enterRule(_localctx, 4, RULE_create_table_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			table_name();
			setState(74);
			match(K_CREATE_TABLE);
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(75);
					any_column_definition();
					setState(80);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(76);
							match(T__1);
							setState(77);
							any_column_definition();
							}
							} 
						}
						setState(82);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
					}
					}
					} 
				}
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		enterRule(_localctx, 6, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(88);
				database_name();
				setState(89);
				match(T__2);
				}
				break;
			}
			setState(93);
			table_name();
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(94);
				match(T__3);
				setState(95);
				column_name();
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(96);
					match(T__1);
					setState(97);
					column_name();
					}
					}
					setState(102);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(103);
				match(T__4);
				}
			}

			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_UPDATE:
				{
				setState(107);
				match(K_UPDATE);
				setState(108);
				match(T__3);
				setState(109);
				expr(0);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(110);
					match(T__1);
					setState(111);
					expr(0);
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(117);
				match(T__4);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(118);
					match(T__1);
					setState(119);
					match(T__3);
					setState(120);
					expr(0);
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(121);
						match(T__1);
						setState(122);
						expr(0);
						}
						}
						setState(127);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(128);
					match(T__4);
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case WORD:
				{
				setState(135);
				select_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(138);
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
		enterRule(_localctx, 8, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(141);
				database_name();
				setState(142);
				match(T__2);
				}
				break;
			}
			setState(146);
			table_name();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(147);
				match(T__3);
				setState(148);
				column_name();
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(149);
					match(T__1);
					setState(150);
					column_name();
					}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(156);
				match(T__4);
				}
			}

			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INSERT:
				{
				setState(160);
				match(K_INSERT);
				setState(161);
				match(T__3);
				setState(162);
				expr(0);
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(163);
					match(T__1);
					setState(164);
					expr(0);
					}
					}
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(170);
				match(T__4);
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(171);
					match(T__1);
					setState(172);
					match(T__3);
					setState(173);
					expr(0);
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(174);
						match(T__1);
						setState(175);
						expr(0);
						}
						}
						setState(180);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(181);
					match(T__4);
					}
					}
					setState(187);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case WORD:
				{
				setState(188);
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
		enterRule(_localctx, 10, RULE_select_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			table_name();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WORD) {
				{
				setState(192);
				table_alias();
				}
			}

			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_SELECT) {
				{
				setState(195);
				match(K_SELECT);
				setState(196);
				result_column();
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(197);
						match(T__1);
						setState(198);
						result_column();
						}
						} 
					}
					setState(203);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				}
			}

			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(206);
					join_stmt();
					}
					} 
				}
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(212);
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
		enterRule(_localctx, 12, RULE_join_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(K_JOIN);
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				setState(216);
				match(T__3);
				setState(217);
				select_stmt();
				setState(218);
				match(T__4);
				setState(219);
				table_alias();
				}
				break;
			case WORD:
				{
				setState(221);
				table_name();
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WORD) {
					{
					setState(222);
					table_alias();
					}
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
		enterRule(_localctx, 14, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(K_WHERE);
			setState(228);
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
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_CREATE_TABLE() { return getToken(MapleParser.K_CREATE_TABLE, 0); }
		public TerminalNode K_UPDATE() { return getToken(MapleParser.K_UPDATE, 0); }
		public TerminalNode K_INSERT() { return getToken(MapleParser.K_INSERT, 0); }
		public TerminalNode K_SELECT() { return getToken(MapleParser.K_SELECT, 0); }
		public TerminalNode K_IS() { return getToken(MapleParser.K_IS, 0); }
		public TerminalNode K_NOT() { return getToken(MapleParser.K_NOT, 0); }
		public TerminalNode K_IN() { return getToken(MapleParser.K_IN, 0); }
		public TerminalNode K_LIKE() { return getToken(MapleParser.K_LIKE, 0); }
		public TerminalNode K_MATCH() { return getToken(MapleParser.K_MATCH, 0); }
		public TerminalNode K_REGEXP() { return getToken(MapleParser.K_REGEXP, 0); }
		public TerminalNode K_BETWEEN() { return getToken(MapleParser.K_BETWEEN, 0); }
		public TerminalNode K_AND() { return getToken(MapleParser.K_AND, 0); }
		public TerminalNode K_GLOB() { return getToken(MapleParser.K_GLOB, 0); }
		public TerminalNode K_ESCAPE() { return getToken(MapleParser.K_ESCAPE, 0); }
		public TerminalNode K_ISNULL() { return getToken(MapleParser.K_ISNULL, 0); }
		public TerminalNode K_NOTNULL() { return getToken(MapleParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(MapleParser.K_NULL, 0); }
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(231);
				literal_value();
				}
				break;
			case 2:
				{
				setState(240);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(235);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						setState(232);
						database_name();
						setState(233);
						match(T__2);
						}
						break;
					}
					setState(237);
					table_name();
					setState(238);
					match(T__2);
					}
					break;
				}
				setState(242);
				column_name();
				}
				break;
			case 3:
				{
				setState(243);
				function_name();
				setState(244);
				match(T__3);
				setState(254);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
				case NUMERIC_LITERAL:
				case STRING_LITERAL:
				case WORD:
					{
					setState(245);
					expr(0);
					setState(250);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(246);
						match(T__1);
						setState(247);
						expr(0);
						}
						}
						setState(252);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case T__6:
					{
					setState(253);
					match(T__6);
					}
					break;
				case T__4:
					break;
				default:
					break;
				}
				setState(256);
				match(T__4);
				}
				break;
			case 4:
				{
				setState(258);
				match(T__3);
				setState(259);
				select_stmt();
				setState(260);
				match(T__4);
				}
				break;
			case 5:
				{
				setState(262);
				match(T__3);
				setState(263);
				expr(0);
				setState(264);
				match(T__4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(363);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(361);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(268);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(269);
						match(T__5);
						setState(270);
						expr(17);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(271);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(272);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(273);
						expr(16);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(274);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(275);
						_la = _input.LA(1);
						if ( !(_la==T__9 || _la==K_CREATE_TABLE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(276);
						expr(15);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(277);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(278);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << K_UPDATE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(279);
						expr(14);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(280);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(281);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << K_SELECT) | (1L << K_INSERT))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(282);
						expr(13);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(283);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(294);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
						case 1:
							{
							setState(284);
							match(T__15);
							}
							break;
						case 2:
							{
							setState(285);
							match(T__16);
							}
							break;
						case 3:
							{
							setState(286);
							match(T__17);
							}
							break;
						case 4:
							{
							setState(287);
							match(K_IS);
							}
							break;
						case 5:
							{
							setState(288);
							match(K_IS);
							setState(289);
							match(K_NOT);
							}
							break;
						case 6:
							{
							setState(290);
							match(K_IN);
							}
							break;
						case 7:
							{
							setState(291);
							match(K_LIKE);
							}
							break;
						case 8:
							{
							setState(292);
							match(K_MATCH);
							}
							break;
						case 9:
							{
							setState(293);
							match(K_REGEXP);
							}
							break;
						}
						setState(296);
						expr(12);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(297);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(298);
						match(T__18);
						setState(299);
						expr(11);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(300);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(301);
						match(T__19);
						setState(302);
						expr(10);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(303);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(304);
						match(K_IS);
						setState(306);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(305);
							match(K_NOT);
							}
						}

						setState(308);
						expr(4);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(309);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(311);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(310);
							match(K_NOT);
							}
						}

						setState(313);
						match(K_BETWEEN);
						setState(314);
						expr(0);
						setState(315);
						match(K_AND);
						setState(316);
						expr(3);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(318);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(320);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(319);
							match(K_NOT);
							}
						}

						setState(322);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_LIKE) | (1L << K_MATCH) | (1L << K_REGEXP) | (1L << K_GLOB))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(323);
						expr(0);
						setState(326);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
						case 1:
							{
							setState(324);
							match(K_ESCAPE);
							setState(325);
							expr(0);
							}
							break;
						}
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(328);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(333);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(329);
							match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(330);
							match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(331);
							match(K_NOT);
							setState(332);
							match(K_NULL);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(335);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(337);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(336);
							match(K_NOT);
							}
						}

						setState(339);
						match(K_IN);
						setState(359);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__3:
							{
							setState(340);
							match(T__3);
							setState(350);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
							case 1:
								{
								setState(341);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(342);
								expr(0);
								setState(347);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==T__1) {
									{
									{
									setState(343);
									match(T__1);
									setState(344);
									expr(0);
									}
									}
									setState(349);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(352);
							match(T__4);
							}
							break;
						case WORD:
							{
							setState(356);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
							case 1:
								{
								setState(353);
								database_name();
								setState(354);
								match(T__2);
								}
								break;
							}
							setState(358);
							table_name();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					}
					} 
				}
				setState(365);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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
		enterRule(_localctx, 18, RULE_result_column);
		try {
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				table_name();
				setState(368);
				match(T__2);
				setState(369);
				match(T__6);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(371);
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
		enterRule(_localctx, 20, RULE_any_column_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(374);
				column_name();
				}
				break;
			case 2:
				{
				setState(375);
				null_column_name();
				}
				break;
			}
			{
			setState(378);
			match(T__3);
			setState(379);
			any_stmt();
			setState(380);
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
		enterRule(_localctx, 22, RULE_null_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			column_name();
			setState(383);
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
		enterRule(_localctx, 24, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
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
		enterRule(_localctx, 26, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
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
		enterRule(_localctx, 28, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
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
		enterRule(_localctx, 30, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
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
		enterRule(_localctx, 32, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
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
		enterRule(_localctx, 34, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
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
		enterRule(_localctx, 36, RULE_any_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
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
		enterRule(_localctx, 38, RULE_embedded_sql);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(K_OPEN_SQL_STMT);
			setState(400);
			any_stmt();
			setState(401);
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
		enterRule(_localctx, 40, RULE_any_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(403);
					matchWildcard();
					}
					} 
				}
				setState(408);
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
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3>\u019c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\7\2.\n\2\f\2\16\2\61\13\2"+
		"\3\2\3\2\6\2\65\n\2\r\2\16\2\66\3\2\7\2:\n\2\f\2\16\2=\13\2\3\2\7\2@\n"+
		"\2\f\2\16\2C\13\2\3\3\3\3\3\3\3\3\3\3\5\3J\n\3\3\4\3\4\3\4\3\4\3\4\7\4"+
		"Q\n\4\f\4\16\4T\13\4\7\4V\n\4\f\4\16\4Y\13\4\3\5\3\5\3\5\5\5^\n\5\3\5"+
		"\3\5\3\5\3\5\3\5\7\5e\n\5\f\5\16\5h\13\5\3\5\3\5\5\5l\n\5\3\5\3\5\3\5"+
		"\3\5\3\5\7\5s\n\5\f\5\16\5v\13\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5~\n\5\f\5"+
		"\16\5\u0081\13\5\3\5\3\5\7\5\u0085\n\5\f\5\16\5\u0088\13\5\3\5\5\5\u008b"+
		"\n\5\3\5\5\5\u008e\n\5\3\6\3\6\3\6\5\6\u0093\n\6\3\6\3\6\3\6\3\6\3\6\7"+
		"\6\u009a\n\6\f\6\16\6\u009d\13\6\3\6\3\6\5\6\u00a1\n\6\3\6\3\6\3\6\3\6"+
		"\3\6\7\6\u00a8\n\6\f\6\16\6\u00ab\13\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00b3"+
		"\n\6\f\6\16\6\u00b6\13\6\3\6\3\6\7\6\u00ba\n\6\f\6\16\6\u00bd\13\6\3\6"+
		"\5\6\u00c0\n\6\3\7\3\7\5\7\u00c4\n\7\3\7\3\7\3\7\3\7\7\7\u00ca\n\7\f\7"+
		"\16\7\u00cd\13\7\5\7\u00cf\n\7\3\7\7\7\u00d2\n\7\f\7\16\7\u00d5\13\7\3"+
		"\7\5\7\u00d8\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00e2\n\b\5\b\u00e4"+
		"\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u00ee\n\n\3\n\3\n\3\n\5\n\u00f3"+
		"\n\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00fb\n\n\f\n\16\n\u00fe\13\n\3\n\5\n"+
		"\u0101\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u010d\n\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0129\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u0135\n\n\3\n\3\n\3\n\5\n\u013a\n\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u0143\n\n\3\n\3\n\3\n\3\n\5\n\u0149\n\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u0150\n\n\3\n\3\n\5\n\u0154\n\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u015c"+
		"\n\n\f\n\16\n\u015f\13\n\5\n\u0161\n\n\3\n\3\n\3\n\3\n\5\n\u0167\n\n\3"+
		"\n\5\n\u016a\n\n\7\n\u016c\n\n\f\n\16\n\u016f\13\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u0177\n\13\3\f\3\f\5\f\u017b\n\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\26\7\26\u0197\n\26\f\26\16\26\u019a\13\26"+
		"\3\26\7RW\u00cb\u00d3\u0198\3\22\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*\2\b\3\2\t\13\4\2\f\f\33\33\4\2\r\17\31\31\4\2\20\21\27\30\6"+
		"\2$$&&;;==\3\2\64\65\2\u01d4\2/\3\2\2\2\4I\3\2\2\2\6K\3\2\2\2\b]\3\2\2"+
		"\2\n\u0092\3\2\2\2\f\u00c1\3\2\2\2\16\u00d9\3\2\2\2\20\u00e5\3\2\2\2\22"+
		"\u010c\3\2\2\2\24\u0176\3\2\2\2\26\u017a\3\2\2\2\30\u0180\3\2\2\2\32\u0183"+
		"\3\2\2\2\34\u0185\3\2\2\2\36\u0187\3\2\2\2 \u0189\3\2\2\2\"\u018b\3\2"+
		"\2\2$\u018d\3\2\2\2&\u018f\3\2\2\2(\u0191\3\2\2\2*\u0198\3\2\2\2,.\7\3"+
		"\2\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61/\3\2"+
		"\2\2\62;\5\4\3\2\63\65\7\3\2\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2"+
		"\2\66\67\3\2\2\2\678\3\2\2\28:\5\4\3\29\64\3\2\2\2:=\3\2\2\2;9\3\2\2\2"+
		";<\3\2\2\2<A\3\2\2\2=;\3\2\2\2>@\7\3\2\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2"+
		"AB\3\2\2\2B\3\3\2\2\2CA\3\2\2\2DJ\5\6\4\2EJ\5\f\7\2FJ\5\n\6\2GJ\5\b\5"+
		"\2HJ\5(\25\2ID\3\2\2\2IE\3\2\2\2IF\3\2\2\2IG\3\2\2\2IH\3\2\2\2J\5\3\2"+
		"\2\2KL\5\34\17\2LW\7\33\2\2MR\5\26\f\2NO\7\4\2\2OQ\5\26\f\2PN\3\2\2\2"+
		"QT\3\2\2\2RS\3\2\2\2RP\3\2\2\2SV\3\2\2\2TR\3\2\2\2UM\3\2\2\2VY\3\2\2\2"+
		"WX\3\2\2\2WU\3\2\2\2X\7\3\2\2\2YW\3\2\2\2Z[\5 \21\2[\\\7\5\2\2\\^\3\2"+
		"\2\2]Z\3\2\2\2]^\3\2\2\2^_\3\2\2\2_k\5\34\17\2`a\7\6\2\2af\5\32\16\2b"+
		"c\7\4\2\2ce\5\32\16\2db\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2"+
		"\2hf\3\2\2\2ij\7\7\2\2jl\3\2\2\2k`\3\2\2\2kl\3\2\2\2l\u008a\3\2\2\2mn"+
		"\7\31\2\2no\7\6\2\2ot\5\22\n\2pq\7\4\2\2qs\5\22\n\2rp\3\2\2\2sv\3\2\2"+
		"\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2w\u0086\7\7\2\2xy\7\4\2\2yz"+
		"\7\6\2\2z\177\5\22\n\2{|\7\4\2\2|~\5\22\n\2}{\3\2\2\2~\u0081\3\2\2\2\177"+
		"}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082"+
		"\u0083\7\7\2\2\u0083\u0085\3\2\2\2\u0084x\3\2\2\2\u0085\u0088\3\2\2\2"+
		"\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u008b\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0089\u008b\5\f\7\2\u008am\3\2\2\2\u008a\u0089\3\2\2\2\u008b"+
		"\u008d\3\2\2\2\u008c\u008e\5\20\t\2\u008d\u008c\3\2\2\2\u008d\u008e\3"+
		"\2\2\2\u008e\t\3\2\2\2\u008f\u0090\5 \21\2\u0090\u0091\7\5\2\2\u0091\u0093"+
		"\3\2\2\2\u0092\u008f\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u00a0\5\34\17\2\u0095\u0096\7\6\2\2\u0096\u009b\5\32\16\2\u0097\u0098"+
		"\7\4\2\2\u0098\u009a\5\32\16\2\u0099\u0097\3\2\2\2\u009a\u009d\3\2\2\2"+
		"\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009b"+
		"\3\2\2\2\u009e\u009f\7\7\2\2\u009f\u00a1\3\2\2\2\u00a0\u0095\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u00bf\3\2\2\2\u00a2\u00a3\7\30\2\2\u00a3\u00a4\7"+
		"\6\2\2\u00a4\u00a9\5\22\n\2\u00a5\u00a6\7\4\2\2\u00a6\u00a8\5\22\n\2\u00a7"+
		"\u00a5\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00bb\7\7\2\2\u00ad"+
		"\u00ae\7\4\2\2\u00ae\u00af\7\6\2\2\u00af\u00b4\5\22\n\2\u00b0\u00b1\7"+
		"\4\2\2\u00b1\u00b3\5\22\n\2\u00b2\u00b0\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2"+
		"\2\2\u00b7\u00b8\7\7\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00ad\3\2\2\2\u00ba"+
		"\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00c0\3\2"+
		"\2\2\u00bd\u00bb\3\2\2\2\u00be\u00c0\5\f\7\2\u00bf\u00a2\3\2\2\2\u00bf"+
		"\u00be\3\2\2\2\u00c0\13\3\2\2\2\u00c1\u00c3\5\34\17\2\u00c2\u00c4\5\36"+
		"\20\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00ce\3\2\2\2\u00c5"+
		"\u00c6\7\27\2\2\u00c6\u00cb\5\24\13\2\u00c7\u00c8\7\4\2\2\u00c8\u00ca"+
		"\5\24\13\2\u00c9\u00c7\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00cc\3\2\2\2"+
		"\u00cb\u00c9\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00c5"+
		"\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d3\3\2\2\2\u00d0\u00d2\5\16\b\2"+
		"\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d3\u00d1"+
		"\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d8\5\20\t\2"+
		"\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\r\3\2\2\2\u00d9\u00e3\7"+
		"\32\2\2\u00da\u00db\7\6\2\2\u00db\u00dc\5\f\7\2\u00dc\u00dd\7\7\2\2\u00dd"+
		"\u00de\5\36\20\2\u00de\u00e4\3\2\2\2\u00df\u00e1\5\34\17\2\u00e0\u00e2"+
		"\5\36\20\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3\2\2\2"+
		"\u00e3\u00da\3\2\2\2\u00e3\u00df\3\2\2\2\u00e4\17\3\2\2\2\u00e5\u00e6"+
		"\7\61\2\2\u00e6\u00e7\5\22\n\2\u00e7\21\3\2\2\2\u00e8\u00e9\b\n\1\2\u00e9"+
		"\u010d\5$\23\2\u00ea\u00eb\5 \21\2\u00eb\u00ec\7\5\2\2\u00ec\u00ee\3\2"+
		"\2\2\u00ed\u00ea\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\u00f0\5\34\17\2\u00f0\u00f1\7\5\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00ed\3"+
		"\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u010d\5\32\16\2\u00f5"+
		"\u00f6\5\"\22\2\u00f6\u0100\7\6\2\2\u00f7\u00fc\5\22\n\2\u00f8\u00f9\7"+
		"\4\2\2\u00f9\u00fb\5\22\n\2\u00fa\u00f8\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0101\3\2\2\2\u00fe\u00fc\3\2"+
		"\2\2\u00ff\u0101\7\t\2\2\u0100\u00f7\3\2\2\2\u0100\u00ff\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\7\7\2\2\u0103\u010d\3\2"+
		"\2\2\u0104\u0105\7\6\2\2\u0105\u0106\5\f\7\2\u0106\u0107\7\7\2\2\u0107"+
		"\u010d\3\2\2\2\u0108\u0109\7\6\2\2\u0109\u010a\5\22\n\2\u010a\u010b\7"+
		"\7\2\2\u010b\u010d\3\2\2\2\u010c\u00e8\3\2\2\2\u010c\u00f2\3\2\2\2\u010c"+
		"\u00f5\3\2\2\2\u010c\u0104\3\2\2\2\u010c\u0108\3\2\2\2\u010d\u016d\3\2"+
		"\2\2\u010e\u010f\f\22\2\2\u010f\u0110\7\b\2\2\u0110\u016c\5\22\n\23\u0111"+
		"\u0112\f\21\2\2\u0112\u0113\t\2\2\2\u0113\u016c\5\22\n\22\u0114\u0115"+
		"\f\20\2\2\u0115\u0116\t\3\2\2\u0116\u016c\5\22\n\21\u0117\u0118\f\17\2"+
		"\2\u0118\u0119\t\4\2\2\u0119\u016c\5\22\n\20\u011a\u011b\f\16\2\2\u011b"+
		"\u011c\t\5\2\2\u011c\u016c\5\22\n\17\u011d\u0128\f\r\2\2\u011e\u0129\7"+
		"\22\2\2\u011f\u0129\7\23\2\2\u0120\u0129\7\24\2\2\u0121\u0129\7\"\2\2"+
		"\u0122\u0123\7\"\2\2\u0123\u0129\7)\2\2\u0124\u0129\7\37\2\2\u0125\u0129"+
		"\7$\2\2\u0126\u0129\7&\2\2\u0127\u0129\7;\2\2\u0128\u011e\3\2\2\2\u0128"+
		"\u011f\3\2\2\2\u0128\u0120\3\2\2\2\u0128\u0121\3\2\2\2\u0128\u0122\3\2"+
		"\2\2\u0128\u0124\3\2\2\2\u0128\u0125\3\2\2\2\u0128\u0126\3\2\2\2\u0128"+
		"\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u016c\5\22\n\16\u012b\u012c\f"+
		"\f\2\2\u012c\u012d\7\25\2\2\u012d\u016c\5\22\n\r\u012e\u012f\f\13\2\2"+
		"\u012f\u0130\7\26\2\2\u0130\u016c\5\22\n\f\u0131\u0132\f\5\2\2\u0132\u0134"+
		"\7\"\2\2\u0133\u0135\7)\2\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\u016c\5\22\n\6\u0137\u0139\f\4\2\2\u0138\u013a\7"+
		")\2\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013c\7<\2\2\u013c\u013d\5\22\n\2\u013d\u013e\7\36\2\2\u013e\u013f\5"+
		"\22\n\5\u013f\u016c\3\2\2\2\u0140\u0142\f\7\2\2\u0141\u0143\7)\2\2\u0142"+
		"\u0141\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\t\6"+
		"\2\2\u0145\u0148\5\22\n\2\u0146\u0147\7>\2\2\u0147\u0149\5\22\n\2\u0148"+
		"\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u016c\3\2\2\2\u014a\u014f\f\6"+
		"\2\2\u014b\u0150\7#\2\2\u014c\u0150\7*\2\2\u014d\u014e\7)\2\2\u014e\u0150"+
		"\7+\2\2\u014f\u014b\3\2\2\2\u014f\u014c\3\2\2\2\u014f\u014d\3\2\2\2\u0150"+
		"\u016c\3\2\2\2\u0151\u0153\f\3\2\2\u0152\u0154\7)\2\2\u0153\u0152\3\2"+
		"\2\2\u0153\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0169\7\37\2\2\u0156"+
		"\u0160\7\6\2\2\u0157\u0161\5\f\7\2\u0158\u015d\5\22\n\2\u0159\u015a\7"+
		"\4\2\2\u015a\u015c\5\22\n\2\u015b\u0159\3\2\2\2\u015c\u015f\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2"+
		"\2\2\u0160\u0157\3\2\2\2\u0160\u0158\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\u0162\3\2\2\2\u0162\u016a\7\7\2\2\u0163\u0164\5 \21\2\u0164\u0165\7\5"+
		"\2\2\u0165\u0167\3\2\2\2\u0166\u0163\3\2\2\2\u0166\u0167\3\2\2\2\u0167"+
		"\u0168\3\2\2\2\u0168\u016a\5\34\17\2\u0169\u0156\3\2\2\2\u0169\u0166\3"+
		"\2\2\2\u016a\u016c\3\2\2\2\u016b\u010e\3\2\2\2\u016b\u0111\3\2\2\2\u016b"+
		"\u0114\3\2\2\2\u016b\u0117\3\2\2\2\u016b\u011a\3\2\2\2\u016b\u011d\3\2"+
		"\2\2\u016b\u012b\3\2\2\2\u016b\u012e\3\2\2\2\u016b\u0131\3\2\2\2\u016b"+
		"\u0137\3\2\2\2\u016b\u0140\3\2\2\2\u016b\u014a\3\2\2\2\u016b\u0151\3\2"+
		"\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e"+
		"\23\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0177\7\t\2\2\u0171\u0172\5\34\17"+
		"\2\u0172\u0173\7\5\2\2\u0173\u0174\7\t\2\2\u0174\u0177\3\2\2\2\u0175\u0177"+
		"\5\22\n\2\u0176\u0170\3\2\2\2\u0176\u0171\3\2\2\2\u0176\u0175\3\2\2\2"+
		"\u0177\25\3\2\2\2\u0178\u017b\5\32\16\2\u0179\u017b\5\30\r\2\u017a\u0178"+
		"\3\2\2\2\u017a\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\7\6\2\2\u017d"+
		"\u017e\5*\26\2\u017e\u017f\7\7\2\2\u017f\27\3\2\2\2\u0180\u0181\5\32\16"+
		"\2\u0181\u0182\7\61\2\2\u0182\31\3\2\2\2\u0183\u0184\5&\24\2\u0184\33"+
		"\3\2\2\2\u0185\u0186\5&\24\2\u0186\35\3\2\2\2\u0187\u0188\5&\24\2\u0188"+
		"\37\3\2\2\2\u0189\u018a\5&\24\2\u018a!\3\2\2\2\u018b\u018c\5&\24\2\u018c"+
		"#\3\2\2\2\u018d\u018e\t\7\2\2\u018e%\3\2\2\2\u018f\u0190\79\2\2\u0190"+
		"\'\3\2\2\2\u0191\u0192\7\34\2\2\u0192\u0193\5*\26\2\u0193\u0194\7\35\2"+
		"\2\u0194)\3\2\2\2\u0195\u0197\13\2\2\2\u0196\u0195\3\2\2\2\u0197\u019a"+
		"\3\2\2\2\u0198\u0199\3\2\2\2\u0198\u0196\3\2\2\2\u0199+\3\2\2\2\u019a"+
		"\u0198\3\2\2\2\64/\66;AIRW]fkt\177\u0086\u008a\u008d\u0092\u009b\u00a0"+
		"\u00a9\u00b4\u00bb\u00bf\u00c3\u00cb\u00ce\u00d3\u00d7\u00e1\u00e3\u00ed"+
		"\u00f2\u00fc\u0100\u010c\u0128\u0134\u0139\u0142\u0148\u014f\u0153\u015d"+
		"\u0160\u0166\u0169\u016b\u016d\u0176\u017a\u0198";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}