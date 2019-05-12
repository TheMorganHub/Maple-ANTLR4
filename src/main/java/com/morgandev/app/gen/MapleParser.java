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
		T__17=18, T__18=19, T__19=20, T__20=21, K_SELECT=22, K_INSERT=23, K_UPDATE=24, 
		K_LEFT_JOIN=25, K_RIGHT_JOIN=26, K_JOIN=27, K_WHERE=28, K_PK=29, K_AND=30, 
		K_NOTBETWEEN=31, K_BETWEEN=32, K_IN=33, K_INNER=34, K_INTO=35, K_IS=36, 
		K_ISNULL=37, K_ISNOTNULL=38, K_ISNOT=39, K_NOTIN=40, K_NOTLIKE=41, K_LIKE=42, 
		K_LIMIT=43, K_NOT=44, K_NOTNULL=45, K_NULL=46, K_OF=47, K_ON=48, K_OR=49, 
		K_WHEN=50, K_WITH=51, K_WITHOUT=52, IDENTIFIER=53, NUMERIC_LITERAL=54, 
		STRING_LITERAL=55, SINGLE_LINE_COMMENT=56, MULTILINE_COMMENT=57, SPACES=58, 
		UNEXPECTED_CHAR=59;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_maple_stmt_list = 2, RULE_maple_stmt = 3, 
		RULE_maple_block = 4, RULE_create_table_stmt = 5, RULE_update_stmt = 6, 
		RULE_delete_stmt = 7, RULE_insert_stmt = 8, RULE_insert_value_set = 9, 
		RULE_update_value_set = 10, RULE_select_stmt = 11, RULE_join_stmt = 12, 
		RULE_join_constraint = 13, RULE_conditional = 14, RULE_column_def = 15, 
		RULE_fk_column_def = 16, RULE_fk_constraint = 17, RULE_standard_column_def = 18, 
		RULE_column_type = 19, RULE_default_value = 20, RULE_expr = 21, RULE_function = 22, 
		RULE_result_column = 23, RULE_column_modifier = 24, RULE_block_action_name = 25, 
		RULE_column_name = 26, RULE_table_name = 27, RULE_table_alias = 28, RULE_column_alias = 29, 
		RULE_database_name = 30, RULE_function_name = 31, RULE_signed_number = 32, 
		RULE_literal_value = 33, RULE_any_name = 34, RULE_embedded_sql = 35, RULE_any_stmt = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "error", "maple_stmt_list", "maple_stmt", "maple_block", "create_table_stmt", 
			"update_stmt", "delete_stmt", "insert_stmt", "insert_value_set", "update_value_set", 
			"select_stmt", "join_stmt", "join_constraint", "conditional", "column_def", 
			"fk_column_def", "fk_constraint", "standard_column_def", "column_type", 
			"default_value", "expr", "function", "result_column", "column_modifier", 
			"block_action_name", "column_name", "table_name", "table_alias", "column_alias", 
			"database_name", "function_name", "signed_number", "literal_value", "any_name", 
			"embedded_sql", "any_stmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'{'", "'}'", "'('", "','", "')'", "'.'", "'*'", "'/'", 
			"'%'", "'+'", "'-'", "'='", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", 
			"'<?'", "'?>'", "'->'", "'<-'", "'<<-'", "'<<>'", "'<>>'", "'<>'", "'?'", 
			"'$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "K_SELECT", 
			"K_INSERT", "K_UPDATE", "K_LEFT_JOIN", "K_RIGHT_JOIN", "K_JOIN", "K_WHERE", 
			"K_PK", "K_AND", "K_NOTBETWEEN", "K_BETWEEN", "K_IN", "K_INNER", "K_INTO", 
			"K_IS", "K_ISNULL", "K_ISNOTNULL", "K_ISNOT", "K_NOTIN", "K_NOTLIKE", 
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
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
			case IDENTIFIER:
				{
				setState(74);
				maple_stmt_list();
				}
				break;
			case UNEXPECTED_CHAR:
				{
				setState(75);
				error();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(78);
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
			setState(80);
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
			setState(83);
			maple_stmt();
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(84);
				match(T__0);
				}
				break;
			}
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(87);
					match(T__0);
					setState(88);
					maple_stmt();
					setState(90);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(89);
						match(T__0);
						}
						break;
					}
					}
					} 
				}
				setState(96);
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
		public Maple_blockContext maple_block() {
			return getRuleContext(Maple_blockContext.class,0);
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
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(97);
				select_stmt();
				}
				break;
			case 2:
				{
				setState(98);
				create_table_stmt();
				}
				break;
			case 3:
				{
				setState(99);
				insert_stmt();
				}
				break;
			case 4:
				{
				setState(100);
				delete_stmt();
				}
				break;
			case 5:
				{
				setState(101);
				update_stmt();
				}
				break;
			case 6:
				{
				setState(102);
				embedded_sql();
				}
				break;
			case 7:
				{
				setState(103);
				maple_block();
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

	public static class Maple_blockContext extends ParserRuleContext {
		public Block_action_nameContext block_action_name() {
			return getRuleContext(Block_action_nameContext.class,0);
		}
		public Maple_stmt_listContext maple_stmt_list() {
			return getRuleContext(Maple_stmt_listContext.class,0);
		}
		public Maple_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maple_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).enterMaple_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).exitMaple_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitMaple_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Maple_blockContext maple_block() throws RecognitionException {
		Maple_blockContext _localctx = new Maple_blockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_maple_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			block_action_name();
			setState(107);
			match(T__1);
			setState(108);
			maple_stmt_list();
			setState(109);
			match(T__2);
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
		enterRule(_localctx, 10, RULE_create_table_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			table_name();
			setState(112);
			match(T__3);
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(113);
					column_def();
					setState(118);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(114);
							match(T__4);
							setState(115);
							column_def();
							}
							} 
						}
						setState(120);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
					}
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(126);
			match(T__5);
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
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(128);
				database_name();
				setState(129);
				match(T__6);
				}
				break;
			}
			setState(133);
			table_name();
			{
			setState(134);
			match(T__3);
			setState(135);
			column_name();
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(136);
				match(T__4);
				setState(137);
				column_name();
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			match(T__5);
			}
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_UPDATE:
				{
				setState(145);
				match(K_UPDATE);
				setState(146);
				update_value_set();
				}
				break;
			case IDENTIFIER:
				{
				setState(147);
				select_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(150);
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
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(153);
				database_name();
				setState(154);
				match(T__6);
				}
				break;
			}
			setState(158);
			table_name();
			setState(159);
			match(K_INSERT);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(160);
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
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(163);
				database_name();
				setState(164);
				match(T__6);
				}
				break;
			}
			setState(168);
			table_name();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(169);
				match(T__3);
				setState(170);
				column_name();
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(171);
					match(T__4);
					setState(172);
					column_name();
					}
					}
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(178);
				match(T__5);
				}
			}

			setState(182);
			match(K_INSERT);
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(183);
					match(T__3);
					}
				}

				setState(186);
				select_stmt();
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(187);
					match(T__5);
					}
				}

				}
				break;
			case 2:
				{
				{
				{
				setState(190);
				insert_value_set();
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(191);
						match(T__4);
						setState(192);
						insert_value_set();
						}
						} 
					}
					setState(197);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				}
				}
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
			setState(200);
			match(T__3);
			setState(201);
			expr(0);
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(202);
					match(T__4);
					setState(203);
					expr(0);
					}
					} 
				}
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(209);
			match(T__5);
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
			setState(211);
			expr(0);
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(212);
					match(T__4);
					setState(213);
					expr(0);
					}
					} 
				}
				setState(218);
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
			setState(219);
			table_name();
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(220);
				table_alias();
				}
			}

			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_SELECT) {
				{
				setState(223);
				match(K_SELECT);
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__7) | (1L << IDENTIFIER) | (1L << NUMERIC_LITERAL) | (1L << STRING_LITERAL))) != 0)) {
					{
					setState(224);
					result_column();
					setState(229);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(225);
							match(T__4);
							setState(226);
							result_column();
							}
							} 
						}
						setState(231);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
					}
					}
				}

				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(234);
						join_stmt();
						}
						} 
					}
					setState(239);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				}
			}

			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(242);
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
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_JOIN:
				{
				setState(245);
				match(K_JOIN);
				}
				break;
			case K_LEFT_JOIN:
				{
				setState(246);
				((Join_stmtContext)_localctx).left = match(K_LEFT_JOIN);
				}
				break;
			case K_RIGHT_JOIN:
				{
				setState(247);
				((Join_stmtContext)_localctx).right = match(K_RIGHT_JOIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				setState(250);
				match(T__3);
				setState(251);
				select_stmt();
				setState(252);
				match(T__5);
				setState(253);
				table_alias();
				}
				break;
			case IDENTIFIER:
				{
				setState(255);
				table_name();
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(256);
					table_alias();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(261);
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
			setState(264);
			match(K_ON);
			setState(265);
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
			setState(267);
			match(K_WHERE);
			setState(268);
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
		public Standard_column_defContext standard_column_def() {
			return getRuleContext(Standard_column_defContext.class,0);
		}
		public Fk_column_defContext fk_column_def() {
			return getRuleContext(Fk_column_defContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(270);
				standard_column_def();
				}
				break;
			case 2:
				{
				setState(271);
				fk_column_def();
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

	public static class Fk_column_defContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Fk_constraintContext fk_constraint() {
			return getRuleContext(Fk_constraintContext.class,0);
		}
		public Default_valueContext default_value() {
			return getRuleContext(Default_valueContext.class,0);
		}
		public Fk_column_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fk_column_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).enterFk_column_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).exitFk_column_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitFk_column_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fk_column_defContext fk_column_def() throws RecognitionException {
		Fk_column_defContext _localctx = new Fk_column_defContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_fk_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			column_name();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(275);
				fk_constraint();
				}
			}

			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMERIC_LITERAL || _la==STRING_LITERAL) {
				{
				setState(278);
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

	public static class Fk_constraintContext extends ParserRuleContext {
		public Any_stmtContext any_stmt() {
			return getRuleContext(Any_stmtContext.class,0);
		}
		public Fk_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fk_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).enterFk_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).exitFk_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitFk_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fk_constraintContext fk_constraint() throws RecognitionException {
		Fk_constraintContext _localctx = new Fk_constraintContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_fk_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(T__3);
			setState(282);
			any_stmt();
			setState(283);
			match(T__5);
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

	public static class Standard_column_defContext extends ParserRuleContext {
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
		public Standard_column_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standard_column_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).enterStandard_column_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).exitStandard_column_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitStandard_column_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Standard_column_defContext standard_column_def() throws RecognitionException {
		Standard_column_defContext _localctx = new Standard_column_defContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_standard_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE || _la==K_PK) {
				{
				setState(285);
				column_modifier();
				}
			}

			setState(288);
			column_name();
			setState(289);
			column_type();
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMERIC_LITERAL || _la==STRING_LITERAL) {
				{
				setState(290);
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
		enterRule(_localctx, 38, RULE_column_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(293);
			any_name();
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(294);
				match(T__3);
				setState(295);
				signed_number();
				setState(296);
				match(T__5);
				}
				break;
			case 2:
				{
				setState(298);
				match(T__3);
				setState(299);
				signed_number();
				setState(300);
				match(T__4);
				setState(301);
				signed_number();
				setState(302);
				match(T__5);
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
		enterRule(_localctx, 40, RULE_default_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(309);
				literal_value();
				}
				break;
			case 2:
				{
				setState(318);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(313);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						setState(310);
						database_name();
						setState(311);
						match(T__6);
						}
						break;
					}
					setState(315);
					table_name();
					setState(316);
					match(T__6);
					}
					break;
				}
				setState(320);
				column_name();
				}
				break;
			case 3:
				{
				setState(321);
				function();
				}
				break;
			case 4:
				{
				setState(322);
				match(T__3);
				setState(323);
				select_stmt();
				setState(324);
				match(T__5);
				}
				break;
			case 5:
				{
				setState(326);
				match(T__3);
				setState(327);
				expr(0);
				setState(328);
				match(T__5);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(351);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(349);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(332);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(333);
						((ExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
							((ExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(334);
						((ExprContext)_localctx).right = expr(10);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(335);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(336);
						((ExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__10 || _la==T__11) ) {
							((ExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(337);
						((ExprContext)_localctx).right = expr(9);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(338);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(339);
						((ExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << K_NOTBETWEEN) | (1L << K_BETWEEN) | (1L << K_IN) | (1L << K_IS) | (1L << K_ISNOT) | (1L << K_NOTIN) | (1L << K_NOTLIKE) | (1L << K_LIKE))) != 0)) ) {
							((ExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(340);
						((ExprContext)_localctx).right = expr(8);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(341);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(342);
						((ExprContext)_localctx).operator = match(K_AND);
						setState(343);
						((ExprContext)_localctx).right = expr(6);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(344);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(345);
						((ExprContext)_localctx).operator = match(K_OR);
						setState(346);
						((ExprContext)_localctx).right = expr(5);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(347);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(348);
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
				setState(353);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
		enterRule(_localctx, 44, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			function_name();
			setState(355);
			match(T__3);
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(356);
				expr(0);
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(357);
					match(T__4);
					setState(358);
					expr(0);
					}
					}
					setState(363);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(364);
				match(T__7);
				}
				break;
			}
			setState(367);
			match(T__5);
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
		enterRule(_localctx, 46, RULE_result_column);
		int _la;
		try {
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				expr(0);
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(371);
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
		enterRule(_localctx, 48, RULE_column_modifier);
		try {
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_WHERE:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				((Column_modifierContext)_localctx).nullable_column = match(K_WHERE);
				}
				break;
			case K_PK:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
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

	public static class Block_action_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Block_action_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_action_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).enterBlock_action_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapleListener ) ((MapleListener)listener).exitBlock_action_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitBlock_action_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_action_nameContext block_action_name() throws RecognitionException {
		Block_action_nameContext _localctx = new Block_action_nameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_block_action_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
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
		enterRule(_localctx, 52, RULE_column_name);
		try {
			setState(384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				any_name();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				match(T__7);
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
		enterRule(_localctx, 54, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
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
		enterRule(_localctx, 56, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
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
		enterRule(_localctx, 58, RULE_column_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
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
		enterRule(_localctx, 60, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
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
		enterRule(_localctx, 62, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
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
		enterRule(_localctx, 64, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10 || _la==T__11) {
				{
				setState(396);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==T__11) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(399);
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
		enterRule(_localctx, 66, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
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
		enterRule(_localctx, 68, RULE_any_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(IDENTIFIER);
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
		public Any_stmtContext any_stmt() {
			return getRuleContext(Any_stmtContext.class,0);
		}
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
		enterRule(_localctx, 70, RULE_embedded_sql);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(T__19);
			setState(406);
			any_stmt();
			setState(407);
			match(T__20);
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
		enterRule(_localctx, 72, RULE_any_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(409);
					matchWildcard();
					}
					} 
				}
				setState(414);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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
		case 21:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u01a2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\5\2O\n\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\4\3\4\5\4X\n\4\3\4\3\4\3\4\5\4]\n\4\7\4_\n\4\f\4\16\4b\13\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5k\n\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\7\7w\n\7\f\7\16\7z\13\7\7\7|\n\7\f\7\16\7\177\13\7\3\7\3\7\3\b\3\b"+
		"\3\b\5\b\u0086\n\b\3\b\3\b\3\b\3\b\3\b\7\b\u008d\n\b\f\b\16\b\u0090\13"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b\u0097\n\b\3\b\5\b\u009a\n\b\3\t\3\t\3\t\5\t"+
		"\u009f\n\t\3\t\3\t\3\t\5\t\u00a4\n\t\3\n\3\n\3\n\5\n\u00a9\n\n\3\n\3\n"+
		"\3\n\3\n\3\n\7\n\u00b0\n\n\f\n\16\n\u00b3\13\n\3\n\3\n\5\n\u00b7\n\n\3"+
		"\n\3\n\5\n\u00bb\n\n\3\n\3\n\5\n\u00bf\n\n\3\n\3\n\3\n\7\n\u00c4\n\n\f"+
		"\n\16\n\u00c7\13\n\5\n\u00c9\n\n\3\13\3\13\3\13\3\13\7\13\u00cf\n\13\f"+
		"\13\16\13\u00d2\13\13\3\13\3\13\3\f\3\f\3\f\7\f\u00d9\n\f\f\f\16\f\u00dc"+
		"\13\f\3\r\3\r\5\r\u00e0\n\r\3\r\3\r\3\r\3\r\7\r\u00e6\n\r\f\r\16\r\u00e9"+
		"\13\r\5\r\u00eb\n\r\3\r\7\r\u00ee\n\r\f\r\16\r\u00f1\13\r\5\r\u00f3\n"+
		"\r\3\r\5\r\u00f6\n\r\3\16\3\16\3\16\5\16\u00fb\n\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u0104\n\16\5\16\u0106\n\16\3\16\5\16\u0109\n\16\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\5\21\u0113\n\21\3\22\3\22\5\22"+
		"\u0117\n\22\3\22\5\22\u011a\n\22\3\23\3\23\3\23\3\23\3\24\5\24\u0121\n"+
		"\24\3\24\3\24\3\24\5\24\u0126\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u0133\n\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u013c\n\27\3\27\3\27\3\27\5\27\u0141\n\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\5\27\u014d\n\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0160"+
		"\n\27\f\27\16\27\u0163\13\27\3\30\3\30\3\30\3\30\3\30\7\30\u016a\n\30"+
		"\f\30\16\30\u016d\13\30\3\30\5\30\u0170\n\30\3\30\3\30\3\31\3\31\3\31"+
		"\5\31\u0177\n\31\5\31\u0179\n\31\3\32\3\32\5\32\u017d\n\32\3\33\3\33\3"+
		"\34\3\34\5\34\u0183\n\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\""+
		"\5\"\u0190\n\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3%\3&\7&\u019d\n&\f&\16&\u01a0"+
		"\13&\3&\13`x}\u00c5\u00d0\u00da\u00e7\u00ef\u019e\3,\'\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\7\3\289\3\2"+
		"\n\f\3\2\r\16\6\2\17\25!#&&),\3\2\'(\2\u01be\2N\3\2\2\2\4R\3\2\2\2\6U"+
		"\3\2\2\2\bj\3\2\2\2\nl\3\2\2\2\fq\3\2\2\2\16\u0085\3\2\2\2\20\u009e\3"+
		"\2\2\2\22\u00a8\3\2\2\2\24\u00ca\3\2\2\2\26\u00d5\3\2\2\2\30\u00dd\3\2"+
		"\2\2\32\u00fa\3\2\2\2\34\u010a\3\2\2\2\36\u010d\3\2\2\2 \u0112\3\2\2\2"+
		"\"\u0114\3\2\2\2$\u011b\3\2\2\2&\u0120\3\2\2\2(\u0127\3\2\2\2*\u0134\3"+
		"\2\2\2,\u014c\3\2\2\2.\u0164\3\2\2\2\60\u0178\3\2\2\2\62\u017c\3\2\2\2"+
		"\64\u017e\3\2\2\2\66\u0182\3\2\2\28\u0184\3\2\2\2:\u0186\3\2\2\2<\u0188"+
		"\3\2\2\2>\u018a\3\2\2\2@\u018c\3\2\2\2B\u018f\3\2\2\2D\u0193\3\2\2\2F"+
		"\u0195\3\2\2\2H\u0197\3\2\2\2J\u019e\3\2\2\2LO\5\6\4\2MO\5\4\3\2NL\3\2"+
		"\2\2NM\3\2\2\2OP\3\2\2\2PQ\7\2\2\3Q\3\3\2\2\2RS\7=\2\2ST\b\3\1\2T\5\3"+
		"\2\2\2UW\5\b\5\2VX\7\3\2\2WV\3\2\2\2WX\3\2\2\2X`\3\2\2\2YZ\7\3\2\2Z\\"+
		"\5\b\5\2[]\7\3\2\2\\[\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^Y\3\2\2\2_b\3\2\2\2"+
		"`a\3\2\2\2`^\3\2\2\2a\7\3\2\2\2b`\3\2\2\2ck\5\30\r\2dk\5\f\7\2ek\5\22"+
		"\n\2fk\5\20\t\2gk\5\16\b\2hk\5H%\2ik\5\n\6\2jc\3\2\2\2jd\3\2\2\2je\3\2"+
		"\2\2jf\3\2\2\2jg\3\2\2\2jh\3\2\2\2ji\3\2\2\2k\t\3\2\2\2lm\5\64\33\2mn"+
		"\7\4\2\2no\5\6\4\2op\7\5\2\2p\13\3\2\2\2qr\58\35\2r}\7\6\2\2sx\5 \21\2"+
		"tu\7\7\2\2uw\5 \21\2vt\3\2\2\2wz\3\2\2\2xy\3\2\2\2xv\3\2\2\2y|\3\2\2\2"+
		"zx\3\2\2\2{s\3\2\2\2|\177\3\2\2\2}~\3\2\2\2}{\3\2\2\2~\u0080\3\2\2\2\177"+
		"}\3\2\2\2\u0080\u0081\7\b\2\2\u0081\r\3\2\2\2\u0082\u0083\5> \2\u0083"+
		"\u0084\7\t\2\2\u0084\u0086\3\2\2\2\u0085\u0082\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\u0087\3\2\2\2\u0087\u0088\58\35\2\u0088\u0089\7\6\2\2\u0089"+
		"\u008e\5\66\34\2\u008a\u008b\7\7\2\2\u008b\u008d\5\66\34\2\u008c\u008a"+
		"\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7\b\2\2\u0092\u0096\3\2"+
		"\2\2\u0093\u0094\7\32\2\2\u0094\u0097\5\26\f\2\u0095\u0097\5\30\r\2\u0096"+
		"\u0093\3\2\2\2\u0096\u0095\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u009a\5\36"+
		"\20\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\17\3\2\2\2\u009b\u009c"+
		"\5> \2\u009c\u009d\7\t\2\2\u009d\u009f\3\2\2\2\u009e\u009b\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\58\35\2\u00a1\u00a3\7\31"+
		"\2\2\u00a2\u00a4\5\36\20\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\21\3\2\2\2\u00a5\u00a6\5> \2\u00a6\u00a7\7\t\2\2\u00a7\u00a9\3\2\2\2"+
		"\u00a8\u00a5\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00b6"+
		"\58\35\2\u00ab\u00ac\7\6\2\2\u00ac\u00b1\5\66\34\2\u00ad\u00ae\7\7\2\2"+
		"\u00ae\u00b0\5\66\34\2\u00af\u00ad\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af"+
		"\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4"+
		"\u00b5\7\b\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00ab\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00c8\7\31\2\2\u00b9\u00bb\7\6\2\2\u00ba"+
		"\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\5\30"+
		"\r\2\u00bd\u00bf\7\b\2\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00c9\3\2\2\2\u00c0\u00c5\5\24\13\2\u00c1\u00c2\7\7\2\2\u00c2\u00c4\5"+
		"\24\13\2\u00c3\u00c1\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00ba\3\2"+
		"\2\2\u00c8\u00c0\3\2\2\2\u00c9\23\3\2\2\2\u00ca\u00cb\7\6\2\2\u00cb\u00d0"+
		"\5,\27\2\u00cc\u00cd\7\7\2\2\u00cd\u00cf\5,\27\2\u00ce\u00cc\3\2\2\2\u00cf"+
		"\u00d2\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d3\3\2"+
		"\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\7\b\2\2\u00d4\25\3\2\2\2\u00d5\u00da"+
		"\5,\27\2\u00d6\u00d7\7\7\2\2\u00d7\u00d9\5,\27\2\u00d8\u00d6\3\2\2\2\u00d9"+
		"\u00dc\3\2\2\2\u00da\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\27\3\2\2"+
		"\2\u00dc\u00da\3\2\2\2\u00dd\u00df\58\35\2\u00de\u00e0\5:\36\2\u00df\u00de"+
		"\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00f2\3\2\2\2\u00e1\u00ea\7\30\2\2"+
		"\u00e2\u00e7\5\60\31\2\u00e3\u00e4\7\7\2\2\u00e4\u00e6\5\60\31\2\u00e5"+
		"\u00e3\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e7\u00e5\3\2"+
		"\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00e2\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00ef\3\2\2\2\u00ec\u00ee\5\32\16\2\u00ed\u00ec\3"+
		"\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0"+
		"\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00e1\3\2\2\2\u00f2\u00f3\3\2"+
		"\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f6\5\36\20\2\u00f5\u00f4\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\31\3\2\2\2\u00f7\u00fb\7\35\2\2\u00f8\u00fb\7\33"+
		"\2\2\u00f9\u00fb\7\34\2\2\u00fa\u00f7\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa"+
		"\u00f9\3\2\2\2\u00fb\u0105\3\2\2\2\u00fc\u00fd\7\6\2\2\u00fd\u00fe\5\30"+
		"\r\2\u00fe\u00ff\7\b\2\2\u00ff\u0100\5:\36\2\u0100\u0106\3\2\2\2\u0101"+
		"\u0103\58\35\2\u0102\u0104\5:\36\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\u0106\3\2\2\2\u0105\u00fc\3\2\2\2\u0105\u0101\3\2\2\2\u0106"+
		"\u0108\3\2\2\2\u0107\u0109\5\34\17\2\u0108\u0107\3\2\2\2\u0108\u0109\3"+
		"\2\2\2\u0109\33\3\2\2\2\u010a\u010b\7\62\2\2\u010b\u010c\5,\27\2\u010c"+
		"\35\3\2\2\2\u010d\u010e\7\36\2\2\u010e\u010f\5,\27\2\u010f\37\3\2\2\2"+
		"\u0110\u0113\5&\24\2\u0111\u0113\5\"\22\2\u0112\u0110\3\2\2\2\u0112\u0111"+
		"\3\2\2\2\u0113!\3\2\2\2\u0114\u0116\5\66\34\2\u0115\u0117\5$\23\2\u0116"+
		"\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u011a\5*"+
		"\26\2\u0119\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a#\3\2\2\2\u011b\u011c"+
		"\7\6\2\2\u011c\u011d\5J&\2\u011d\u011e\7\b\2\2\u011e%\3\2\2\2\u011f\u0121"+
		"\5\62\32\2\u0120\u011f\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\3\2\2\2"+
		"\u0122\u0123\5\66\34\2\u0123\u0125\5(\25\2\u0124\u0126\5*\26\2\u0125\u0124"+
		"\3\2\2\2\u0125\u0126\3\2\2\2\u0126\'\3\2\2\2\u0127\u0132\5F$\2\u0128\u0129"+
		"\7\6\2\2\u0129\u012a\5B\"\2\u012a\u012b\7\b\2\2\u012b\u0133\3\2\2\2\u012c"+
		"\u012d\7\6\2\2\u012d\u012e\5B\"\2\u012e\u012f\7\7\2\2\u012f\u0130\5B\""+
		"\2\u0130\u0131\7\b\2\2\u0131\u0133\3\2\2\2\u0132\u0128\3\2\2\2\u0132\u012c"+
		"\3\2\2\2\u0132\u0133\3\2\2\2\u0133)\3\2\2\2\u0134\u0135\t\2\2\2\u0135"+
		"+\3\2\2\2\u0136\u0137\b\27\1\2\u0137\u014d\5D#\2\u0138\u0139\5> \2\u0139"+
		"\u013a\7\t\2\2\u013a\u013c\3\2\2\2\u013b\u0138\3\2\2\2\u013b\u013c\3\2"+
		"\2\2\u013c\u013d\3\2\2\2\u013d\u013e\58\35\2\u013e\u013f\7\t\2\2\u013f"+
		"\u0141\3\2\2\2\u0140\u013b\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\3\2"+
		"\2\2\u0142\u014d\5\66\34\2\u0143\u014d\5.\30\2\u0144\u0145\7\6\2\2\u0145"+
		"\u0146\5\30\r\2\u0146\u0147\7\b\2\2\u0147\u014d\3\2\2\2\u0148\u0149\7"+
		"\6\2\2\u0149\u014a\5,\27\2\u014a\u014b\7\b\2\2\u014b\u014d\3\2\2\2\u014c"+
		"\u0136\3\2\2\2\u014c\u0140\3\2\2\2\u014c\u0143\3\2\2\2\u014c\u0144\3\2"+
		"\2\2\u014c\u0148\3\2\2\2\u014d\u0161\3\2\2\2\u014e\u014f\f\13\2\2\u014f"+
		"\u0150\t\3\2\2\u0150\u0160\5,\27\f\u0151\u0152\f\n\2\2\u0152\u0153\t\4"+
		"\2\2\u0153\u0160\5,\27\13\u0154\u0155\f\t\2\2\u0155\u0156\t\5\2\2\u0156"+
		"\u0160\5,\27\n\u0157\u0158\f\7\2\2\u0158\u0159\7 \2\2\u0159\u0160\5,\27"+
		"\b\u015a\u015b\f\6\2\2\u015b\u015c\7\63\2\2\u015c\u0160\5,\27\7\u015d"+
		"\u015e\f\b\2\2\u015e\u0160\t\6\2\2\u015f\u014e\3\2\2\2\u015f\u0151\3\2"+
		"\2\2\u015f\u0154\3\2\2\2\u015f\u0157\3\2\2\2\u015f\u015a\3\2\2\2\u015f"+
		"\u015d\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2"+
		"\2\2\u0162-\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0165\5@!\2\u0165\u016f"+
		"\7\6\2\2\u0166\u016b\5,\27\2\u0167\u0168\7\7\2\2\u0168\u016a\5,\27\2\u0169"+
		"\u0167\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2"+
		"\2\2\u016c\u0170\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u0170\7\n\2\2\u016f"+
		"\u0166\3\2\2\2\u016f\u016e\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\3\2"+
		"\2\2\u0171\u0172\7\b\2\2\u0172/\3\2\2\2\u0173\u0179\5,\27\2\u0174\u0176"+
		"\5,\27\2\u0175\u0177\5<\37\2\u0176\u0175\3\2\2\2\u0176\u0177\3\2\2\2\u0177"+
		"\u0179\3\2\2\2\u0178\u0173\3\2\2\2\u0178\u0174\3\2\2\2\u0179\61\3\2\2"+
		"\2\u017a\u017d\7\36\2\2\u017b\u017d\7\37\2\2\u017c\u017a\3\2\2\2\u017c"+
		"\u017b\3\2\2\2\u017d\63\3\2\2\2\u017e\u017f\5F$\2\u017f\65\3\2\2\2\u0180"+
		"\u0183\5F$\2\u0181\u0183\7\n\2\2\u0182\u0180\3\2\2\2\u0182\u0181\3\2\2"+
		"\2\u0183\67\3\2\2\2\u0184\u0185\5F$\2\u01859\3\2\2\2\u0186\u0187\5F$\2"+
		"\u0187;\3\2\2\2\u0188\u0189\5F$\2\u0189=\3\2\2\2\u018a\u018b\5F$\2\u018b"+
		"?\3\2\2\2\u018c\u018d\5F$\2\u018dA\3\2\2\2\u018e\u0190\t\4\2\2\u018f\u018e"+
		"\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\78\2\2\u0192"+
		"C\3\2\2\2\u0193\u0194\t\2\2\2\u0194E\3\2\2\2\u0195\u0196\7\67\2\2\u0196"+
		"G\3\2\2\2\u0197\u0198\7\26\2\2\u0198\u0199\5J&\2\u0199\u019a\7\27\2\2"+
		"\u019aI\3\2\2\2\u019b\u019d\13\2\2\2\u019c\u019b\3\2\2\2\u019d\u01a0\3"+
		"\2\2\2\u019e\u019f\3\2\2\2\u019e\u019c\3\2\2\2\u019fK\3\2\2\2\u01a0\u019e"+
		"\3\2\2\2\65NW\\`jx}\u0085\u008e\u0096\u0099\u009e\u00a3\u00a8\u00b1\u00b6"+
		"\u00ba\u00be\u00c5\u00c8\u00d0\u00da\u00df\u00e7\u00ea\u00ef\u00f2\u00f5"+
		"\u00fa\u0103\u0105\u0108\u0112\u0116\u0119\u0120\u0125\u0132\u013b\u0140"+
		"\u014c\u015f\u0161\u016b\u016f\u0176\u0178\u017c\u0182\u018f\u019e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}