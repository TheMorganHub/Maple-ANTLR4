// Generated from C:/Users/Morgan/IdeaProjects/AntlrProj/src/main/antlr/com/morgandev/maple/Maple\Maple.g4 by ANTLR 4.7.2
package com.morgandev.app.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MapleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MapleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MapleParser#maple_stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaple_stmt_list(MapleParser.Maple_stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#maple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaple_stmt(MapleParser.Maple_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_stmt(MapleParser.Create_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#update_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt(MapleParser.Update_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#insert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt(MapleParser.Insert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(MapleParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#join_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_stmt(MapleParser.Join_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(MapleParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MapleParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#result_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_column(MapleParser.Result_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#any_column_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_column_definition(MapleParser.Any_column_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#null_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_column_name(MapleParser.Null_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(MapleParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(MapleParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias(MapleParser.Table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#database_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_name(MapleParser.Database_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(MapleParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_value(MapleParser.Literal_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name(MapleParser.Any_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#embedded_sql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmbedded_sql(MapleParser.Embedded_sqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#any_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_stmt(MapleParser.Any_stmtContext ctx);
}