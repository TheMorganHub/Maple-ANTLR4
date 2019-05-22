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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, K_SELECT=27, K_INSERT=28, K_UPDATE=29, K_LEFT_JOIN=30, 
		K_RIGHT_JOIN=31, K_JOIN=32, K_WHERE=33, K_PK=34, K_AND=35, K_NOTBETWEEN=36, 
		K_BETWEEN=37, K_IF=38, K_ELSEIF=39, K_ELSE=40, K_IN=41, K_INNER=42, K_INTO=43, 
		K_IS=44, K_ISNULL=45, K_ISNOTNULL=46, K_ISNOT=47, K_NOTIN=48, K_NOTLIKE=49, 
		K_LIKE=50, K_LIMIT=51, K_NOT=52, K_NOTNULL=53, K_NULL=54, K_OF=55, K_ON=56, 
		K_OR=57, K_PRINT=58, K_WHEN=59, K_WITH=60, K_WITHOUT=61, IDENTIFIER=62, 
		NUMERIC_LITERAL=63, STRING_LITERAL=64, SINGLE_LINE_COMMENT=65, MULTILINE_COMMENT=66, 
		SPACES=67, UNEXPECTED_CHAR=68;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_maple_stmt_list = 2, RULE_maple_stmt = 3, 
		RULE_complex_block = 4, RULE_maple_block = 5, RULE_if_block = 6, RULE_elseif_block = 7, 
		RULE_else_block = 8, RULE_block_params = 9, RULE_block_params_declaration = 10, 
		RULE_block_datatype_param = 11, RULE_block_params_expr_declaration = 12, 
		RULE_block_statement = 13, RULE_variable_declaration_stmt = 14, RULE_variable_assignment_stmt = 15, 
		RULE_variable_inc_dec_stmt = 16, RULE_variable_stmt = 17, RULE_create_table_stmt = 18, 
		RULE_column_def = 19, RULE_fk_column_def = 20, RULE_fk_constraint = 21, 
		RULE_standard_column_def = 22, RULE_column_type = 23, RULE_update_stmt = 24, 
		RULE_update_value_set = 25, RULE_delete_stmt = 26, RULE_insert_stmt = 27, 
		RULE_insert_value_set = 28, RULE_select_stmt = 29, RULE_join_stmt = 30, 
		RULE_utility_stmt = 31, RULE_parameter_type = 32, RULE_data_type = 33, 
		RULE_variable_type = 34, RULE_default_value = 35, RULE_join_constraint = 36, 
		RULE_conditional = 37, RULE_print_stmt = 38, RULE_function = 39, RULE_result_column = 40, 
		RULE_expr = 41, RULE_column_modifier = 42, RULE_block_name = 43, RULE_block_action_name = 44, 
		RULE_column_name = 45, RULE_table_name = 46, RULE_database_name = 47, 
		RULE_function_name = 48, RULE_table_alias = 49, RULE_column_alias = 50, 
		RULE_signed_number = 51, RULE_prepared_literal_value = 52, RULE_literal_value = 53, 
		RULE_any_name = 54, RULE_embedded_sql = 55, RULE_any_stmt = 56;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "error", "maple_stmt_list", "maple_stmt", "complex_block", "maple_block", 
			"if_block", "elseif_block", "else_block", "block_params", "block_params_declaration", 
			"block_datatype_param", "block_params_expr_declaration", "block_statement", 
			"variable_declaration_stmt", "variable_assignment_stmt", "variable_inc_dec_stmt", 
			"variable_stmt", "create_table_stmt", "column_def", "fk_column_def", 
			"fk_constraint", "standard_column_def", "column_type", "update_stmt", 
			"update_value_set", "delete_stmt", "insert_stmt", "insert_value_set", 
			"select_stmt", "join_stmt", "utility_stmt", "parameter_type", "data_type", 
			"variable_type", "default_value", "join_constraint", "conditional", "print_stmt", 
			"function", "result_column", "expr", "column_modifier", "block_name", 
			"block_action_name", "column_name", "table_name", "database_name", "function_name", 
			"table_alias", "column_alias", "signed_number", "prepared_literal_value", 
			"literal_value", "any_name", "embedded_sql", "any_stmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'{'", "'}'", "'('", "','", "')'", "'='", "'++'", "'--'", 
			"'+='", "'-='", "'.'", "'*'", "'/'", "'%'", "'+'", "'-'", "'=='", "'!='", 
			"'<'", "'<='", "'>'", "'>='", "':?'", "'<?'", "'?>'", "'->'", "'<-'", 
			"'<<-'", "'<<>'", "'<>>'", "'<>'", "'?'", "'$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "K_SELECT", "K_INSERT", "K_UPDATE", "K_LEFT_JOIN", 
			"K_RIGHT_JOIN", "K_JOIN", "K_WHERE", "K_PK", "K_AND", "K_NOTBETWEEN", 
			"K_BETWEEN", "K_IF", "K_ELSEIF", "K_ELSE", "K_IN", "K_INNER", "K_INTO", 
			"K_IS", "K_ISNULL", "K_ISNOTNULL", "K_ISNOT", "K_NOTIN", "K_NOTLIKE", 
			"K_LIKE", "K_LIMIT", "K_NOT", "K_NOTNULL", "K_NULL", "K_OF", "K_ON", 
			"K_OR", "K_PRINT", "K_WHEN", "K_WITH", "K_WITHOUT", "IDENTIFIER", "NUMERIC_LITERAL", 
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
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__24:
			case K_IF:
			case IDENTIFIER:
				{
				setState(114);
				maple_stmt_list();
				}
				break;
			case UNEXPECTED_CHAR:
				{
				setState(115);
				error();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(118);
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
		public TerminalNode UNEXPECTED_CHAR() { return getToken(MapleParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
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
			setState(120);
			match(UNEXPECTED_CHAR);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << K_IF) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(122);
				maple_stmt();
				}
				}
				setState(127);
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
		public Maple_blockContext maple_block() {
			return getRuleContext(Maple_blockContext.class,0);
		}
		public Complex_blockContext complex_block() {
			return getRuleContext(Complex_blockContext.class,0);
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
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Maple_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maple_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitMaple_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Maple_stmtContext maple_stmt() throws RecognitionException {
		Maple_stmtContext _localctx = new Maple_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_maple_stmt);
		int _la;
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				maple_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				complex_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(136);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(130);
					create_table_stmt();
					}
					break;
				case 2:
					{
					setState(131);
					insert_stmt();
					}
					break;
				case 3:
					{
					setState(132);
					delete_stmt();
					}
					break;
				case 4:
					{
					setState(133);
					update_stmt();
					}
					break;
				case 5:
					{
					setState(134);
					embedded_sql();
					}
					break;
				case 6:
					{
					setState(135);
					select_stmt();
					}
					break;
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(138);
					match(T__0);
					}
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

	public static class Complex_blockContext extends ParserRuleContext {
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public Complex_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitComplex_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Complex_blockContext complex_block() throws RecognitionException {
		Complex_blockContext _localctx = new Complex_blockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_complex_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			if_block();
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
		public Block_nameContext block_name() {
			return getRuleContext(Block_nameContext.class,0);
		}
		public Block_paramsContext block_params() {
			return getRuleContext(Block_paramsContext.class,0);
		}
		public List<Block_statementContext> block_statement() {
			return getRuleContexts(Block_statementContext.class);
		}
		public Block_statementContext block_statement(int i) {
			return getRuleContext(Block_statementContext.class,i);
		}
		public Maple_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maple_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitMaple_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Maple_blockContext maple_block() throws RecognitionException {
		Maple_blockContext _localctx = new Maple_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_maple_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			block_action_name();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(146);
				block_name();
				}
			}

			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(149);
				block_params();
				}
			}

			setState(152);
			match(T__1);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << K_IF) | (1L << K_PRINT) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(153);
				block_statement();
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159);
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

	public static class If_blockContext extends ParserRuleContext {
		public TerminalNode K_IF() { return getToken(MapleParser.K_IF, 0); }
		public Block_params_expr_declarationContext block_params_expr_declaration() {
			return getRuleContext(Block_params_expr_declarationContext.class,0);
		}
		public List<Block_statementContext> block_statement() {
			return getRuleContexts(Block_statementContext.class);
		}
		public Block_statementContext block_statement(int i) {
			return getRuleContext(Block_statementContext.class,i);
		}
		public List<Elseif_blockContext> elseif_block() {
			return getRuleContexts(Elseif_blockContext.class);
		}
		public Elseif_blockContext elseif_block(int i) {
			return getRuleContext(Elseif_blockContext.class,i);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public If_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitIf_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_blockContext if_block() throws RecognitionException {
		If_blockContext _localctx = new If_blockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(K_IF);
			setState(162);
			block_params_expr_declaration();
			setState(163);
			match(T__1);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << K_IF) | (1L << K_PRINT) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(164);
				block_statement();
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
			match(T__2);
			setState(174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(171);
					elseif_block();
					}
					} 
				}
				setState(176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ELSE) {
				{
				setState(177);
				else_block();
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

	public static class Elseif_blockContext extends ParserRuleContext {
		public TerminalNode K_ELSEIF() { return getToken(MapleParser.K_ELSEIF, 0); }
		public Block_params_expr_declarationContext block_params_expr_declaration() {
			return getRuleContext(Block_params_expr_declarationContext.class,0);
		}
		public List<Block_statementContext> block_statement() {
			return getRuleContexts(Block_statementContext.class);
		}
		public Block_statementContext block_statement(int i) {
			return getRuleContext(Block_statementContext.class,i);
		}
		public Elseif_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitElseif_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elseif_blockContext elseif_block() throws RecognitionException {
		Elseif_blockContext _localctx = new Elseif_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elseif_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(K_ELSEIF);
			setState(181);
			block_params_expr_declaration();
			setState(182);
			match(T__1);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << K_IF) | (1L << K_PRINT) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(183);
				block_statement();
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
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

	public static class Else_blockContext extends ParserRuleContext {
		public TerminalNode K_ELSE() { return getToken(MapleParser.K_ELSE, 0); }
		public List<Block_statementContext> block_statement() {
			return getRuleContexts(Block_statementContext.class);
		}
		public Block_statementContext block_statement(int i) {
			return getRuleContext(Block_statementContext.class,i);
		}
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitElse_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_else_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(K_ELSE);
			setState(192);
			match(T__1);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << K_IF) | (1L << K_PRINT) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(193);
				block_statement();
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
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

	public static class Block_paramsContext extends ParserRuleContext {
		public Block_params_declarationContext block_params_declaration() {
			return getRuleContext(Block_params_declarationContext.class,0);
		}
		public Block_params_expr_declarationContext block_params_expr_declaration() {
			return getRuleContext(Block_params_expr_declarationContext.class,0);
		}
		public Block_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_params; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitBlock_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_paramsContext block_params() throws RecognitionException {
		Block_paramsContext _localctx = new Block_paramsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block_params);
		try {
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				block_params_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				block_params_expr_declaration();
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

	public static class Block_params_declarationContext extends ParserRuleContext {
		public List<Block_datatype_paramContext> block_datatype_param() {
			return getRuleContexts(Block_datatype_paramContext.class);
		}
		public Block_datatype_paramContext block_datatype_param(int i) {
			return getRuleContext(Block_datatype_paramContext.class,i);
		}
		public Block_params_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_params_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitBlock_params_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_params_declarationContext block_params_declaration() throws RecognitionException {
		Block_params_declarationContext _localctx = new Block_params_declarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_block_params_declaration);
		try {
			int _alt;
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(T__3);
				{
				setState(206);
				block_datatype_param();
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(207);
						match(T__4);
						setState(208);
						block_datatype_param();
						}
						} 
					}
					setState(213);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				}
				setState(214);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(T__3);
				setState(217);
				match(T__5);
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

	public static class Block_datatype_paramContext extends ParserRuleContext {
		public Parameter_typeContext parameter_type() {
			return getRuleContext(Parameter_typeContext.class,0);
		}
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Block_datatype_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_datatype_param; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitBlock_datatype_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_datatype_paramContext block_datatype_param() throws RecognitionException {
		Block_datatype_paramContext _localctx = new Block_datatype_paramContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_block_datatype_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			parameter_type();
			setState(221);
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

	public static class Block_params_expr_declarationContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Block_params_expr_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_params_expr_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitBlock_params_expr_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_params_expr_declarationContext block_params_expr_declaration() throws RecognitionException {
		Block_params_expr_declarationContext _localctx = new Block_params_expr_declarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_block_params_expr_declaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(T__3);
			setState(224);
			expr(0);
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(225);
					match(T__4);
					setState(226);
					expr(0);
					}
					} 
				}
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(232);
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

	public static class Block_statementContext extends ParserRuleContext {
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
		public Complex_blockContext complex_block() {
			return getRuleContext(Complex_blockContext.class,0);
		}
		public Variable_stmtContext variable_stmt() {
			return getRuleContext(Variable_stmtContext.class,0);
		}
		public Utility_stmtContext utility_stmt() {
			return getRuleContext(Utility_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Block_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitBlock_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_statementContext block_statement() throws RecognitionException {
		Block_statementContext _localctx = new Block_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_block_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(234);
				insert_stmt();
				}
				break;
			case 2:
				{
				setState(235);
				delete_stmt();
				}
				break;
			case 3:
				{
				setState(236);
				update_stmt();
				}
				break;
			case 4:
				{
				setState(237);
				embedded_sql();
				}
				break;
			case 5:
				{
				setState(238);
				maple_block();
				}
				break;
			case 6:
				{
				setState(239);
				complex_block();
				}
				break;
			case 7:
				{
				setState(240);
				variable_stmt();
				}
				break;
			case 8:
				{
				setState(241);
				utility_stmt();
				}
				break;
			case 9:
				{
				setState(242);
				select_stmt();
				}
				break;
			}
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(245);
				match(T__0);
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

	public static class Variable_declaration_stmtContext extends ParserRuleContext {
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Variable_declaration_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitVariable_declaration_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declaration_stmtContext variable_declaration_stmt() throws RecognitionException {
		Variable_declaration_stmtContext _localctx = new Variable_declaration_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variable_declaration_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			variable_type();
			setState(249);
			any_name();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(250);
				match(T__6);
				setState(251);
				expr(0);
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

	public static class Variable_assignment_stmtContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Variable_assignment_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_assignment_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitVariable_assignment_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_assignment_stmtContext variable_assignment_stmt() throws RecognitionException {
		Variable_assignment_stmtContext _localctx = new Variable_assignment_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variable_assignment_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			any_name();
			setState(255);
			match(T__6);
			setState(256);
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

	public static class Variable_inc_dec_stmtContext extends ParserRuleContext {
		public Token op;
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Variable_inc_dec_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_inc_dec_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitVariable_inc_dec_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_inc_dec_stmtContext variable_inc_dec_stmt() throws RecognitionException {
		Variable_inc_dec_stmtContext _localctx = new Variable_inc_dec_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variable_inc_dec_stmt);
		try {
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				any_name();
				setState(259);
				((Variable_inc_dec_stmtContext)_localctx).op = match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				any_name();
				setState(262);
				((Variable_inc_dec_stmtContext)_localctx).op = match(T__8);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				any_name();
				setState(265);
				((Variable_inc_dec_stmtContext)_localctx).op = match(T__9);
				setState(266);
				literal_value();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(268);
				any_name();
				setState(269);
				((Variable_inc_dec_stmtContext)_localctx).op = match(T__10);
				setState(270);
				literal_value();
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

	public static class Variable_stmtContext extends ParserRuleContext {
		public Variable_assignment_stmtContext variable_assignment_stmt() {
			return getRuleContext(Variable_assignment_stmtContext.class,0);
		}
		public Variable_declaration_stmtContext variable_declaration_stmt() {
			return getRuleContext(Variable_declaration_stmtContext.class,0);
		}
		public Variable_inc_dec_stmtContext variable_inc_dec_stmt() {
			return getRuleContext(Variable_inc_dec_stmtContext.class,0);
		}
		public Variable_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitVariable_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_stmtContext variable_stmt() throws RecognitionException {
		Variable_stmtContext _localctx = new Variable_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_variable_stmt);
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				variable_assignment_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				variable_declaration_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
				variable_inc_dec_stmt();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitCreate_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_create_table_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			table_name();
			setState(280);
			match(T__3);
			setState(291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(281);
					column_def();
					setState(286);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(282);
							match(T__4);
							setState(283);
							column_def();
							}
							} 
						}
						setState(288);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
					}
					}
					} 
				}
				setState(293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(294);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitColumn_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_column_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(296);
				standard_column_def();
				}
				break;
			case 2:
				{
				setState(297);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitFk_column_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fk_column_defContext fk_column_def() throws RecognitionException {
		Fk_column_defContext _localctx = new Fk_column_defContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_fk_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			column_name();
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(301);
				fk_constraint();
				}
			}

			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMERIC_LITERAL || _la==STRING_LITERAL) {
				{
				setState(304);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitFk_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fk_constraintContext fk_constraint() throws RecognitionException {
		Fk_constraintContext _localctx = new Fk_constraintContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_fk_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(T__3);
			setState(308);
			any_stmt();
			setState(309);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitStandard_column_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Standard_column_defContext standard_column_def() throws RecognitionException {
		Standard_column_defContext _localctx = new Standard_column_defContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_standard_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE || _la==K_PK) {
				{
				setState(311);
				column_modifier();
				}
			}

			setState(314);
			column_name();
			setState(315);
			column_type();
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMERIC_LITERAL || _la==STRING_LITERAL) {
				{
				setState(316);
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
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Column_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitColumn_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_typeContext column_type() throws RecognitionException {
		Column_typeContext _localctx = new Column_typeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_column_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			data_type();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitUpdate_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(321);
				database_name();
				setState(322);
				match(T__11);
				}
				break;
			}
			setState(326);
			table_name();
			{
			setState(327);
			match(T__3);
			setState(328);
			column_name();
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(329);
				match(T__4);
				setState(330);
				column_name();
				}
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(336);
			match(T__5);
			}
			setState(341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_UPDATE:
				{
				setState(338);
				match(K_UPDATE);
				setState(339);
				update_value_set();
				}
				break;
			case IDENTIFIER:
				{
				setState(340);
				select_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(343);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitUpdate_value_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_value_setContext update_value_set() throws RecognitionException {
		Update_value_setContext _localctx = new Update_value_setContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_update_value_set);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			expr(0);
			setState(351);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(347);
					match(T__4);
					setState(348);
					expr(0);
					}
					} 
				}
				setState(353);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitDelete_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(354);
				database_name();
				setState(355);
				match(T__11);
				}
				break;
			}
			setState(359);
			table_name();
			setState(360);
			match(K_INSERT);
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(361);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitInsert_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_insert_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(364);
				database_name();
				setState(365);
				match(T__11);
				}
				break;
			}
			setState(369);
			table_name();
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(370);
				match(T__3);
				setState(371);
				column_name();
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(372);
					match(T__4);
					setState(373);
					column_name();
					}
					}
					setState(378);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(379);
				match(T__5);
				}
			}

			setState(383);
			match(K_INSERT);
			setState(399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(384);
					match(T__3);
					}
				}

				setState(387);
				select_stmt();
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(388);
					match(T__5);
					}
				}

				}
				break;
			case 2:
				{
				{
				{
				setState(391);
				insert_value_set();
				setState(396);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(392);
						match(T__4);
						setState(393);
						insert_value_set();
						}
						} 
					}
					setState(398);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitInsert_value_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_value_setContext insert_value_set() throws RecognitionException {
		Insert_value_setContext _localctx = new Insert_value_setContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_insert_value_set);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(T__3);
			setState(402);
			expr(0);
			setState(407);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(403);
					match(T__4);
					setState(404);
					expr(0);
					}
					} 
				}
				setState(409);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			setState(410);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_select_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			table_name();
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(413);
				table_alias();
				}
				break;
			}
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_SELECT) {
				{
				setState(416);
				match(K_SELECT);
				setState(425);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(417);
					result_column();
					setState(422);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(418);
							match(T__4);
							setState(419);
							result_column();
							}
							} 
						}
						setState(424);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
					}
					}
					break;
				}
				setState(430);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(427);
						join_stmt();
						}
						} 
					}
					setState(432);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				}
				}
			}

			setState(436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(435);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitJoin_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_stmtContext join_stmt() throws RecognitionException {
		Join_stmtContext _localctx = new Join_stmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_join_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_JOIN:
				{
				setState(438);
				match(K_JOIN);
				}
				break;
			case K_LEFT_JOIN:
				{
				setState(439);
				((Join_stmtContext)_localctx).left = match(K_LEFT_JOIN);
				}
				break;
			case K_RIGHT_JOIN:
				{
				setState(440);
				((Join_stmtContext)_localctx).right = match(K_RIGHT_JOIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				setState(443);
				match(T__3);
				setState(444);
				select_stmt();
				setState(445);
				match(T__5);
				setState(446);
				table_alias();
				}
				break;
			case IDENTIFIER:
				{
				setState(448);
				table_name();
				setState(450);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(449);
					table_alias();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(454);
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

	public static class Utility_stmtContext extends ParserRuleContext {
		public Print_stmtContext print_stmt() {
			return getRuleContext(Print_stmtContext.class,0);
		}
		public Utility_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_utility_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitUtility_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Utility_stmtContext utility_stmt() throws RecognitionException {
		Utility_stmtContext _localctx = new Utility_stmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_utility_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			print_stmt();
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

	public static class Parameter_typeContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Parameter_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitParameter_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_typeContext parameter_type() throws RecognitionException {
		Parameter_typeContext _localctx = new Parameter_typeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_parameter_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			data_type();
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

	public static class Data_typeContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitData_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_data_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(461);
			any_name();
			setState(472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(462);
				match(T__3);
				setState(463);
				signed_number();
				setState(464);
				match(T__5);
				}
				break;
			case 2:
				{
				setState(466);
				match(T__3);
				setState(467);
				signed_number();
				setState(468);
				match(T__4);
				setState(469);
				signed_number();
				setState(470);
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

	public static class Variable_typeContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Variable_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitVariable_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_typeContext variable_type() throws RecognitionException {
		Variable_typeContext _localctx = new Variable_typeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_variable_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
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

	public static class Default_valueContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(MapleParser.STRING_LITERAL, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(MapleParser.NUMERIC_LITERAL, 0); }
		public Default_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitDefault_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_valueContext default_value() throws RecognitionException {
		Default_valueContext _localctx = new Default_valueContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_default_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitJoin_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_constraintContext join_constraint() throws RecognitionException {
		Join_constraintContext _localctx = new Join_constraintContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_join_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(K_ON);
			setState(479);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(K_WHERE);
			setState(482);
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

	public static class Print_stmtContext extends ParserRuleContext {
		public TerminalNode K_PRINT() { return getToken(MapleParser.K_PRINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Print_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitPrint_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_stmtContext print_stmt() throws RecognitionException {
		Print_stmtContext _localctx = new Print_stmtContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_print_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(K_PRINT);
			setState(485);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			function_name();
			setState(488);
			match(T__3);
			setState(498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(489);
				expr(0);
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(490);
					match(T__4);
					setState(491);
					expr(0);
					}
					}
					setState(496);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(497);
				match(T__12);
				}
				break;
			}
			setState(500);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitResult_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_result_column);
		try {
			setState(507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				expr(0);
				setState(505);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(504);
					column_alias();
					}
					break;
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext left;
		public Token operator;
		public ExprContext right;
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Prepared_literal_valueContext prepared_literal_value() {
			return getRuleContext(Prepared_literal_valueContext.class,0);
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
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(510);
				literal_value();
				}
				break;
			case 2:
				{
				setState(511);
				prepared_literal_value();
				}
				break;
			case 3:
				{
				setState(520);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(515);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
					case 1:
						{
						setState(512);
						database_name();
						setState(513);
						match(T__11);
						}
						break;
					}
					setState(517);
					table_name();
					setState(518);
					match(T__11);
					}
					break;
				}
				setState(522);
				column_name();
				}
				break;
			case 4:
				{
				setState(523);
				function();
				}
				break;
			case 5:
				{
				setState(524);
				match(T__3);
				setState(525);
				select_stmt();
				setState(526);
				match(T__5);
				}
				break;
			case 6:
				{
				setState(528);
				match(T__3);
				setState(529);
				expr(0);
				setState(530);
				match(T__5);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(553);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(551);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(534);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(535);
						((ExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
							((ExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(536);
						((ExprContext)_localctx).right = expr(10);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(537);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(538);
						((ExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__15 || _la==T__16) ) {
							((ExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(539);
						((ExprContext)_localctx).right = expr(9);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(540);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(541);
						((ExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << K_NOTBETWEEN) | (1L << K_BETWEEN) | (1L << K_IN) | (1L << K_IS) | (1L << K_ISNOT) | (1L << K_NOTIN) | (1L << K_NOTLIKE) | (1L << K_LIKE))) != 0)) ) {
							((ExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(542);
						((ExprContext)_localctx).right = expr(8);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(543);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(544);
						((ExprContext)_localctx).operator = match(K_AND);
						setState(545);
						((ExprContext)_localctx).right = expr(6);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(546);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(547);
						((ExprContext)_localctx).operator = match(K_OR);
						setState(548);
						((ExprContext)_localctx).right = expr(5);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(549);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(550);
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
				setState(555);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitColumn_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_modifierContext column_modifier() throws RecognitionException {
		Column_modifierContext _localctx = new Column_modifierContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_column_modifier);
		try {
			setState(558);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_WHERE:
				enterOuterAlt(_localctx, 1);
				{
				setState(556);
				((Column_modifierContext)_localctx).nullable_column = match(K_WHERE);
				}
				break;
			case K_PK:
				enterOuterAlt(_localctx, 2);
				{
				setState(557);
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

	public static class Block_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Block_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitBlock_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_nameContext block_name() throws RecognitionException {
		Block_nameContext _localctx = new Block_nameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_block_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
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

	public static class Block_action_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Block_action_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_action_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitBlock_action_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_action_nameContext block_action_name() throws RecognitionException {
		Block_action_nameContext _localctx = new Block_action_nameContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_block_action_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_column_name);
		try {
			setState(566);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(564);
				any_name();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(565);
				match(T__12);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitDatabase_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitTable_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitColumn_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_column_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitSigned_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15 || _la==T__16) {
				{
				setState(578);
				_la = _input.LA(1);
				if ( !(_la==T__15 || _la==T__16) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(581);
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

	public static class Prepared_literal_valueContext extends ParserRuleContext {
		public Prepared_literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prepared_literal_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitPrepared_literal_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prepared_literal_valueContext prepared_literal_value() throws RecognitionException {
		Prepared_literal_valueContext _localctx = new Prepared_literal_valueContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_prepared_literal_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			match(T__23);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitAny_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_any_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitEmbedded_sql(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Embedded_sqlContext embedded_sql() throws RecognitionException {
		Embedded_sqlContext _localctx = new Embedded_sqlContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_embedded_sql);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(T__24);
			setState(590);
			any_stmt();
			setState(591);
			match(T__25);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapleVisitor ) return ((MapleVisitor<? extends T>)visitor).visitAny_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_stmtContext any_stmt() throws RecognitionException {
		Any_stmtContext _localctx = new Any_stmtContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_any_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(593);
					matchWildcard();
					}
					} 
				}
				setState(598);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
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
		case 41:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3F\u025a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\5\2w\n\2\3"+
		"\2\3\2\3\3\3\3\3\4\7\4~\n\4\f\4\16\4\u0081\13\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5\u008b\n\5\3\5\5\5\u008e\n\5\5\5\u0090\n\5\3\6\3\6\3\7\3"+
		"\7\5\7\u0096\n\7\3\7\5\7\u0099\n\7\3\7\3\7\7\7\u009d\n\7\f\7\16\7\u00a0"+
		"\13\7\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u00a8\n\b\f\b\16\b\u00ab\13\b\3\b\3"+
		"\b\7\b\u00af\n\b\f\b\16\b\u00b2\13\b\3\b\5\b\u00b5\n\b\3\t\3\t\3\t\3\t"+
		"\7\t\u00bb\n\t\f\t\16\t\u00be\13\t\3\t\3\t\3\n\3\n\3\n\7\n\u00c5\n\n\f"+
		"\n\16\n\u00c8\13\n\3\n\3\n\3\13\3\13\5\13\u00ce\n\13\3\f\3\f\3\f\3\f\7"+
		"\f\u00d4\n\f\f\f\16\f\u00d7\13\f\3\f\3\f\3\f\3\f\5\f\u00dd\n\f\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\7\16\u00e6\n\16\f\16\16\16\u00e9\13\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00f6\n\17\3\17"+
		"\5\17\u00f9\n\17\3\20\3\20\3\20\3\20\5\20\u00ff\n\20\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\5\22\u0113\n\22\3\23\3\23\3\23\5\23\u0118\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\7\24\u011f\n\24\f\24\16\24\u0122\13\24\7\24\u0124\n\24\f\24\16\24"+
		"\u0127\13\24\3\24\3\24\3\25\3\25\5\25\u012d\n\25\3\26\3\26\5\26\u0131"+
		"\n\26\3\26\5\26\u0134\n\26\3\27\3\27\3\27\3\27\3\30\5\30\u013b\n\30\3"+
		"\30\3\30\3\30\5\30\u0140\n\30\3\31\3\31\3\32\3\32\3\32\5\32\u0147\n\32"+
		"\3\32\3\32\3\32\3\32\3\32\7\32\u014e\n\32\f\32\16\32\u0151\13\32\3\32"+
		"\3\32\3\32\3\32\3\32\5\32\u0158\n\32\3\32\5\32\u015b\n\32\3\33\3\33\3"+
		"\33\7\33\u0160\n\33\f\33\16\33\u0163\13\33\3\34\3\34\3\34\5\34\u0168\n"+
		"\34\3\34\3\34\3\34\5\34\u016d\n\34\3\35\3\35\3\35\5\35\u0172\n\35\3\35"+
		"\3\35\3\35\3\35\3\35\7\35\u0179\n\35\f\35\16\35\u017c\13\35\3\35\3\35"+
		"\5\35\u0180\n\35\3\35\3\35\5\35\u0184\n\35\3\35\3\35\5\35\u0188\n\35\3"+
		"\35\3\35\3\35\7\35\u018d\n\35\f\35\16\35\u0190\13\35\5\35\u0192\n\35\3"+
		"\36\3\36\3\36\3\36\7\36\u0198\n\36\f\36\16\36\u019b\13\36\3\36\3\36\3"+
		"\37\3\37\5\37\u01a1\n\37\3\37\3\37\3\37\3\37\7\37\u01a7\n\37\f\37\16\37"+
		"\u01aa\13\37\5\37\u01ac\n\37\3\37\7\37\u01af\n\37\f\37\16\37\u01b2\13"+
		"\37\5\37\u01b4\n\37\3\37\5\37\u01b7\n\37\3 \3 \3 \5 \u01bc\n \3 \3 \3"+
		" \3 \3 \3 \3 \5 \u01c5\n \5 \u01c7\n \3 \5 \u01ca\n \3!\3!\3\"\3\"\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01db\n#\3$\3$\3%\3%\3&\3&\3&\3\'\3"+
		"\'\3\'\3(\3(\3(\3)\3)\3)\3)\3)\7)\u01ef\n)\f)\16)\u01f2\13)\3)\5)\u01f5"+
		"\n)\3)\3)\3*\3*\3*\5*\u01fc\n*\5*\u01fe\n*\3+\3+\3+\3+\3+\3+\5+\u0206"+
		"\n+\3+\3+\3+\5+\u020b\n+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0217\n+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\7+\u022a\n+\f+\16+\u022d"+
		"\13+\3,\3,\5,\u0231\n,\3-\3-\3.\3.\3/\3/\5/\u0239\n/\3\60\3\60\3\61\3"+
		"\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\5\65\u0246\n\65\3\65\3\65\3\66"+
		"\3\66\3\67\3\67\38\38\39\39\39\39\3:\7:\u0255\n:\f:\16:\u0258\13:\3:\r"+
		"\u00b0\u00d5\u00e7\u0120\u0125\u0161\u018e\u0199\u01a8\u01b0\u0256\3T"+
		";\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnpr\2\7\3\2AB\3\2\17\21\3\2\22\23\b\2\t\t\24\31&\'"+
		"++..\61\64\3\2/\60\2\u027e\2v\3\2\2\2\4z\3\2\2\2\6\177\3\2\2\2\b\u008f"+
		"\3\2\2\2\n\u0091\3\2\2\2\f\u0093\3\2\2\2\16\u00a3\3\2\2\2\20\u00b6\3\2"+
		"\2\2\22\u00c1\3\2\2\2\24\u00cd\3\2\2\2\26\u00dc\3\2\2\2\30\u00de\3\2\2"+
		"\2\32\u00e1\3\2\2\2\34\u00f5\3\2\2\2\36\u00fa\3\2\2\2 \u0100\3\2\2\2\""+
		"\u0112\3\2\2\2$\u0117\3\2\2\2&\u0119\3\2\2\2(\u012c\3\2\2\2*\u012e\3\2"+
		"\2\2,\u0135\3\2\2\2.\u013a\3\2\2\2\60\u0141\3\2\2\2\62\u0146\3\2\2\2\64"+
		"\u015c\3\2\2\2\66\u0167\3\2\2\28\u0171\3\2\2\2:\u0193\3\2\2\2<\u019e\3"+
		"\2\2\2>\u01bb\3\2\2\2@\u01cb\3\2\2\2B\u01cd\3\2\2\2D\u01cf\3\2\2\2F\u01dc"+
		"\3\2\2\2H\u01de\3\2\2\2J\u01e0\3\2\2\2L\u01e3\3\2\2\2N\u01e6\3\2\2\2P"+
		"\u01e9\3\2\2\2R\u01fd\3\2\2\2T\u0216\3\2\2\2V\u0230\3\2\2\2X\u0232\3\2"+
		"\2\2Z\u0234\3\2\2\2\\\u0238\3\2\2\2^\u023a\3\2\2\2`\u023c\3\2\2\2b\u023e"+
		"\3\2\2\2d\u0240\3\2\2\2f\u0242\3\2\2\2h\u0245\3\2\2\2j\u0249\3\2\2\2l"+
		"\u024b\3\2\2\2n\u024d\3\2\2\2p\u024f\3\2\2\2r\u0256\3\2\2\2tw\5\6\4\2"+
		"uw\5\4\3\2vt\3\2\2\2vu\3\2\2\2wx\3\2\2\2xy\7\2\2\3y\3\3\2\2\2z{\7F\2\2"+
		"{\5\3\2\2\2|~\5\b\5\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\7\3\2\2\2\u0081\177\3\2\2\2\u0082\u0090\5\f\7\2\u0083\u0090"+
		"\5\n\6\2\u0084\u008b\5&\24\2\u0085\u008b\58\35\2\u0086\u008b\5\66\34\2"+
		"\u0087\u008b\5\62\32\2\u0088\u008b\5p9\2\u0089\u008b\5<\37\2\u008a\u0084"+
		"\3\2\2\2\u008a\u0085\3\2\2\2\u008a\u0086\3\2\2\2\u008a\u0087\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008e\7\3"+
		"\2\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f"+
		"\u0082\3\2\2\2\u008f\u0083\3\2\2\2\u008f\u008a\3\2\2\2\u0090\t\3\2\2\2"+
		"\u0091\u0092\5\16\b\2\u0092\13\3\2\2\2\u0093\u0095\5Z.\2\u0094\u0096\5"+
		"X-\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097"+
		"\u0099\5\24\13\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3"+
		"\2\2\2\u009a\u009e\7\4\2\2\u009b\u009d\5\34\17\2\u009c\u009b\3\2\2\2\u009d"+
		"\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2"+
		"\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7\5\2\2\u00a2\r\3\2\2\2\u00a3\u00a4"+
		"\7(\2\2\u00a4\u00a5\5\32\16\2\u00a5\u00a9\7\4\2\2\u00a6\u00a8\5\34\17"+
		"\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa"+
		"\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00b0\7\5\2\2\u00ad"+
		"\u00af\5\20\t\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00b1\3"+
		"\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3"+
		"\u00b5\5\22\n\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\17\3\2\2"+
		"\2\u00b6\u00b7\7)\2\2\u00b7\u00b8\5\32\16\2\u00b8\u00bc\7\4\2\2\u00b9"+
		"\u00bb\5\34\17\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3"+
		"\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf"+
		"\u00c0\7\5\2\2\u00c0\21\3\2\2\2\u00c1\u00c2\7*\2\2\u00c2\u00c6\7\4\2\2"+
		"\u00c3\u00c5\5\34\17\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4"+
		"\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9"+
		"\u00ca\7\5\2\2\u00ca\23\3\2\2\2\u00cb\u00ce\5\26\f\2\u00cc\u00ce\5\32"+
		"\16\2\u00cd\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\25\3\2\2\2\u00cf\u00d0"+
		"\7\6\2\2\u00d0\u00d5\5\30\r\2\u00d1\u00d2\7\7\2\2\u00d2\u00d4\5\30\r\2"+
		"\u00d3\u00d1\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d5\u00d3"+
		"\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\7\b\2\2\u00d9"+
		"\u00dd\3\2\2\2\u00da\u00db\7\6\2\2\u00db\u00dd\7\b\2\2\u00dc\u00cf\3\2"+
		"\2\2\u00dc\u00da\3\2\2\2\u00dd\27\3\2\2\2\u00de\u00df\5B\"\2\u00df\u00e0"+
		"\5n8\2\u00e0\31\3\2\2\2\u00e1\u00e2\7\6\2\2\u00e2\u00e7\5T+\2\u00e3\u00e4"+
		"\7\7\2\2\u00e4\u00e6\5T+\2\u00e5\u00e3\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2"+
		"\2\2\u00ea\u00eb\7\b\2\2\u00eb\33\3\2\2\2\u00ec\u00f6\58\35\2\u00ed\u00f6"+
		"\5\66\34\2\u00ee\u00f6\5\62\32\2\u00ef\u00f6\5p9\2\u00f0\u00f6\5\f\7\2"+
		"\u00f1\u00f6\5\n\6\2\u00f2\u00f6\5$\23\2\u00f3\u00f6\5@!\2\u00f4\u00f6"+
		"\5<\37\2\u00f5\u00ec\3\2\2\2\u00f5\u00ed\3\2\2\2\u00f5\u00ee\3\2\2\2\u00f5"+
		"\u00ef\3\2\2\2\u00f5\u00f0\3\2\2\2\u00f5\u00f1\3\2\2\2\u00f5\u00f2\3\2"+
		"\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7"+
		"\u00f9\7\3\2\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\35\3\2\2"+
		"\2\u00fa\u00fb\5F$\2\u00fb\u00fe\5n8\2\u00fc\u00fd\7\t\2\2\u00fd\u00ff"+
		"\5T+\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\37\3\2\2\2\u0100"+
		"\u0101\5n8\2\u0101\u0102\7\t\2\2\u0102\u0103\5T+\2\u0103!\3\2\2\2\u0104"+
		"\u0105\5n8\2\u0105\u0106\7\n\2\2\u0106\u0113\3\2\2\2\u0107\u0108\5n8\2"+
		"\u0108\u0109\7\13\2\2\u0109\u0113\3\2\2\2\u010a\u010b\5n8\2\u010b\u010c"+
		"\7\f\2\2\u010c\u010d\5l\67\2\u010d\u0113\3\2\2\2\u010e\u010f\5n8\2\u010f"+
		"\u0110\7\r\2\2\u0110\u0111\5l\67\2\u0111\u0113\3\2\2\2\u0112\u0104\3\2"+
		"\2\2\u0112\u0107\3\2\2\2\u0112\u010a\3\2\2\2\u0112\u010e\3\2\2\2\u0113"+
		"#\3\2\2\2\u0114\u0118\5 \21\2\u0115\u0118\5\36\20\2\u0116\u0118\5\"\22"+
		"\2\u0117\u0114\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118%"+
		"\3\2\2\2\u0119\u011a\5^\60\2\u011a\u0125\7\6\2\2\u011b\u0120\5(\25\2\u011c"+
		"\u011d\7\7\2\2\u011d\u011f\5(\25\2\u011e\u011c\3\2\2\2\u011f\u0122\3\2"+
		"\2\2\u0120\u0121\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0124\3\2\2\2\u0122"+
		"\u0120\3\2\2\2\u0123\u011b\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0126\3\2"+
		"\2\2\u0125\u0123\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0125\3\2\2\2\u0128"+
		"\u0129\7\b\2\2\u0129\'\3\2\2\2\u012a\u012d\5.\30\2\u012b\u012d\5*\26\2"+
		"\u012c\u012a\3\2\2\2\u012c\u012b\3\2\2\2\u012d)\3\2\2\2\u012e\u0130\5"+
		"\\/\2\u012f\u0131\5,\27\2\u0130\u012f\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\u0133\3\2\2\2\u0132\u0134\5H%\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2"+
		"\2\u0134+\3\2\2\2\u0135\u0136\7\6\2\2\u0136\u0137\5r:\2\u0137\u0138\7"+
		"\b\2\2\u0138-\3\2\2\2\u0139\u013b\5V,\2\u013a\u0139\3\2\2\2\u013a\u013b"+
		"\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\5\\/\2\u013d\u013f\5\60\31\2"+
		"\u013e\u0140\5H%\2\u013f\u013e\3\2\2\2\u013f\u0140\3\2\2\2\u0140/\3\2"+
		"\2\2\u0141\u0142\5D#\2\u0142\61\3\2\2\2\u0143\u0144\5`\61\2\u0144\u0145"+
		"\7\16\2\2\u0145\u0147\3\2\2\2\u0146\u0143\3\2\2\2\u0146\u0147\3\2\2\2"+
		"\u0147\u0148\3\2\2\2\u0148\u0149\5^\60\2\u0149\u014a\7\6\2\2\u014a\u014f"+
		"\5\\/\2\u014b\u014c\7\7\2\2\u014c\u014e\5\\/\2\u014d\u014b\3\2\2\2\u014e"+
		"\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0152\3\2"+
		"\2\2\u0151\u014f\3\2\2\2\u0152\u0153\7\b\2\2\u0153\u0157\3\2\2\2\u0154"+
		"\u0155\7\37\2\2\u0155\u0158\5\64\33\2\u0156\u0158\5<\37\2\u0157\u0154"+
		"\3\2\2\2\u0157\u0156\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u015b\5L\'\2\u015a"+
		"\u0159\3\2\2\2\u015a\u015b\3\2\2\2\u015b\63\3\2\2\2\u015c\u0161\5T+\2"+
		"\u015d\u015e\7\7\2\2\u015e\u0160\5T+\2\u015f\u015d\3\2\2\2\u0160\u0163"+
		"\3\2\2\2\u0161\u0162\3\2\2\2\u0161\u015f\3\2\2\2\u0162\65\3\2\2\2\u0163"+
		"\u0161\3\2\2\2\u0164\u0165\5`\61\2\u0165\u0166\7\16\2\2\u0166\u0168\3"+
		"\2\2\2\u0167\u0164\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"\u016a\5^\60\2\u016a\u016c\7\36\2\2\u016b\u016d\5L\'\2\u016c\u016b\3\2"+
		"\2\2\u016c\u016d\3\2\2\2\u016d\67\3\2\2\2\u016e\u016f\5`\61\2\u016f\u0170"+
		"\7\16\2\2\u0170\u0172\3\2\2\2\u0171\u016e\3\2\2\2\u0171\u0172\3\2\2\2"+
		"\u0172\u0173\3\2\2\2\u0173\u017f\5^\60\2\u0174\u0175\7\6\2\2\u0175\u017a"+
		"\5\\/\2\u0176\u0177\7\7\2\2\u0177\u0179\5\\/\2\u0178\u0176\3\2\2\2\u0179"+
		"\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\3\2"+
		"\2\2\u017c\u017a\3\2\2\2\u017d\u017e\7\b\2\2\u017e\u0180\3\2\2\2\u017f"+
		"\u0174\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0191\7\36"+
		"\2\2\u0182\u0184\7\6\2\2\u0183\u0182\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\u0187\5<\37\2\u0186\u0188\7\b\2\2\u0187\u0186\3\2"+
		"\2\2\u0187\u0188\3\2\2\2\u0188\u0192\3\2\2\2\u0189\u018e\5:\36\2\u018a"+
		"\u018b\7\7\2\2\u018b\u018d\5:\36\2\u018c\u018a\3\2\2\2\u018d\u0190\3\2"+
		"\2\2\u018e\u018f\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0192\3\2\2\2\u0190"+
		"\u018e\3\2\2\2\u0191\u0183\3\2\2\2\u0191\u0189\3\2\2\2\u01929\3\2\2\2"+
		"\u0193\u0194\7\6\2\2\u0194\u0199\5T+\2\u0195\u0196\7\7\2\2\u0196\u0198"+
		"\5T+\2\u0197\u0195\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u019a\3\2\2\2\u0199"+
		"\u0197\3\2\2\2\u019a\u019c\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u019d\7\b"+
		"\2\2\u019d;\3\2\2\2\u019e\u01a0\5^\60\2\u019f\u01a1\5d\63\2\u01a0\u019f"+
		"\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01b3\3\2\2\2\u01a2\u01ab\7\35\2\2"+
		"\u01a3\u01a8\5R*\2\u01a4\u01a5\7\7\2\2\u01a5\u01a7\5R*\2\u01a6\u01a4\3"+
		"\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9"+
		"\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01a3\3\2\2\2\u01ab\u01ac\3\2"+
		"\2\2\u01ac\u01b0\3\2\2\2\u01ad\u01af\5> \2\u01ae\u01ad\3\2\2\2\u01af\u01b2"+
		"\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2"+
		"\u01b0\3\2\2\2\u01b3\u01a2\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b6\3\2"+
		"\2\2\u01b5\u01b7\5L\'\2\u01b6\u01b5\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7"+
		"=\3\2\2\2\u01b8\u01bc\7\"\2\2\u01b9\u01bc\7 \2\2\u01ba\u01bc\7!\2\2\u01bb"+
		"\u01b8\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01ba\3\2\2\2\u01bc\u01c6\3\2"+
		"\2\2\u01bd\u01be\7\6\2\2\u01be\u01bf\5<\37\2\u01bf\u01c0\7\b\2\2\u01c0"+
		"\u01c1\5d\63\2\u01c1\u01c7\3\2\2\2\u01c2\u01c4\5^\60\2\u01c3\u01c5\5d"+
		"\63\2\u01c4\u01c3\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c7\3\2\2\2\u01c6"+
		"\u01bd\3\2\2\2\u01c6\u01c2\3\2\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01ca\5J"+
		"&\2\u01c9\u01c8\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca?\3\2\2\2\u01cb\u01cc"+
		"\5N(\2\u01ccA\3\2\2\2\u01cd\u01ce\5D#\2\u01ceC\3\2\2\2\u01cf\u01da\5n"+
		"8\2\u01d0\u01d1\7\6\2\2\u01d1\u01d2\5h\65\2\u01d2\u01d3\7\b\2\2\u01d3"+
		"\u01db\3\2\2\2\u01d4\u01d5\7\6\2\2\u01d5\u01d6\5h\65\2\u01d6\u01d7\7\7"+
		"\2\2\u01d7\u01d8\5h\65\2\u01d8\u01d9\7\b\2\2\u01d9\u01db\3\2\2\2\u01da"+
		"\u01d0\3\2\2\2\u01da\u01d4\3\2\2\2\u01da\u01db\3\2\2\2\u01dbE\3\2\2\2"+
		"\u01dc\u01dd\5n8\2\u01ddG\3\2\2\2\u01de\u01df\t\2\2\2\u01dfI\3\2\2\2\u01e0"+
		"\u01e1\7:\2\2\u01e1\u01e2\5T+\2\u01e2K\3\2\2\2\u01e3\u01e4\7#\2\2\u01e4"+
		"\u01e5\5T+\2\u01e5M\3\2\2\2\u01e6\u01e7\7<\2\2\u01e7\u01e8\5T+\2\u01e8"+
		"O\3\2\2\2\u01e9\u01ea\5b\62\2\u01ea\u01f4\7\6\2\2\u01eb\u01f0\5T+\2\u01ec"+
		"\u01ed\7\7\2\2\u01ed\u01ef\5T+\2\u01ee\u01ec\3\2\2\2\u01ef\u01f2\3\2\2"+
		"\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f5\3\2\2\2\u01f2\u01f0"+
		"\3\2\2\2\u01f3\u01f5\7\17\2\2\u01f4\u01eb\3\2\2\2\u01f4\u01f3\3\2\2\2"+
		"\u01f4\u01f5\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7\7\b\2\2\u01f7Q\3"+
		"\2\2\2\u01f8\u01fe\5T+\2\u01f9\u01fb\5T+\2\u01fa\u01fc\5f\64\2\u01fb\u01fa"+
		"\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01f8\3\2\2\2\u01fd"+
		"\u01f9\3\2\2\2\u01feS\3\2\2\2\u01ff\u0200\b+\1\2\u0200\u0217\5l\67\2\u0201"+
		"\u0217\5j\66\2\u0202\u0203\5`\61\2\u0203\u0204\7\16\2\2\u0204\u0206\3"+
		"\2\2\2\u0205\u0202\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0207\3\2\2\2\u0207"+
		"\u0208\5^\60\2\u0208\u0209\7\16\2\2\u0209\u020b\3\2\2\2\u020a\u0205\3"+
		"\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u0217\5\\/\2\u020d"+
		"\u0217\5P)\2\u020e\u020f\7\6\2\2\u020f\u0210\5<\37\2\u0210\u0211\7\b\2"+
		"\2\u0211\u0217\3\2\2\2\u0212\u0213\7\6\2\2\u0213\u0214\5T+\2\u0214\u0215"+
		"\7\b\2\2\u0215\u0217\3\2\2\2\u0216\u01ff\3\2\2\2\u0216\u0201\3\2\2\2\u0216"+
		"\u020a\3\2\2\2\u0216\u020d\3\2\2\2\u0216\u020e\3\2\2\2\u0216\u0212\3\2"+
		"\2\2\u0217\u022b\3\2\2\2\u0218\u0219\f\13\2\2\u0219\u021a\t\3\2\2\u021a"+
		"\u022a\5T+\f\u021b\u021c\f\n\2\2\u021c\u021d\t\4\2\2\u021d\u022a\5T+\13"+
		"\u021e\u021f\f\t\2\2\u021f\u0220\t\5\2\2\u0220\u022a\5T+\n\u0221\u0222"+
		"\f\7\2\2\u0222\u0223\7%\2\2\u0223\u022a\5T+\b\u0224\u0225\f\6\2\2\u0225"+
		"\u0226\7;\2\2\u0226\u022a\5T+\7\u0227\u0228\f\b\2\2\u0228\u022a\t\6\2"+
		"\2\u0229\u0218\3\2\2\2\u0229\u021b\3\2\2\2\u0229\u021e\3\2\2\2\u0229\u0221"+
		"\3\2\2\2\u0229\u0224\3\2\2\2\u0229\u0227\3\2\2\2\u022a\u022d\3\2\2\2\u022b"+
		"\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022cU\3\2\2\2\u022d\u022b\3\2\2\2"+
		"\u022e\u0231\7#\2\2\u022f\u0231\7$\2\2\u0230\u022e\3\2\2\2\u0230\u022f"+
		"\3\2\2\2\u0231W\3\2\2\2\u0232\u0233\5n8\2\u0233Y\3\2\2\2\u0234\u0235\5"+
		"n8\2\u0235[\3\2\2\2\u0236\u0239\5n8\2\u0237\u0239\7\17\2\2\u0238\u0236"+
		"\3\2\2\2\u0238\u0237\3\2\2\2\u0239]\3\2\2\2\u023a\u023b\5n8\2\u023b_\3"+
		"\2\2\2\u023c\u023d\5n8\2\u023da\3\2\2\2\u023e\u023f\5n8\2\u023fc\3\2\2"+
		"\2\u0240\u0241\5n8\2\u0241e\3\2\2\2\u0242\u0243\5n8\2\u0243g\3\2\2\2\u0244"+
		"\u0246\t\4\2\2\u0245\u0244\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0247\3\2"+
		"\2\2\u0247\u0248\7A\2\2\u0248i\3\2\2\2\u0249\u024a\7\32\2\2\u024ak\3\2"+
		"\2\2\u024b\u024c\t\2\2\2\u024cm\3\2\2\2\u024d\u024e\7@\2\2\u024eo\3\2"+
		"\2\2\u024f\u0250\7\33\2\2\u0250\u0251\5r:\2\u0251\u0252\7\34\2\2\u0252"+
		"q\3\2\2\2\u0253\u0255\13\2\2\2\u0254\u0253\3\2\2\2\u0255\u0258\3\2\2\2"+
		"\u0256\u0257\3\2\2\2\u0256\u0254\3\2\2\2\u0257s\3\2\2\2\u0258\u0256\3"+
		"\2\2\2Fv\177\u008a\u008d\u008f\u0095\u0098\u009e\u00a9\u00b0\u00b4\u00bc"+
		"\u00c6\u00cd\u00d5\u00dc\u00e7\u00f5\u00f8\u00fe\u0112\u0117\u0120\u0125"+
		"\u012c\u0130\u0133\u013a\u013f\u0146\u014f\u0157\u015a\u0161\u0167\u016c"+
		"\u0171\u017a\u017f\u0183\u0187\u018e\u0191\u0199\u01a0\u01a8\u01ab\u01b0"+
		"\u01b3\u01b6\u01bb\u01c4\u01c6\u01c9\u01da\u01f0\u01f4\u01fb\u01fd\u0205"+
		"\u020a\u0216\u0229\u022b\u0230\u0238\u0245\u0256";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}