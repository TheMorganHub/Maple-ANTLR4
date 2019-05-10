// Generated from /home/david/IdeaProjects/Maple-ANTLR4/src/main/antlr/com/morgandev/maple/Maple/Maple.g4 by ANTLR 4.7.2
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
	 * Visit a parse tree produced by {@link MapleParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(MapleParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError(MapleParser.ErrorContext ctx);
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
	 * Visit a parse tree produced by {@link MapleParser#foreign_key_create_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_key_create_table(MapleParser.Foreign_key_create_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#update_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt(MapleParser.Update_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#delete_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt(MapleParser.Delete_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#insert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt(MapleParser.Insert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#insert_value_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_value_set(MapleParser.Insert_value_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#update_value_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_value_set(MapleParser.Update_value_setContext ctx);
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
	 * Visit a parse tree produced by {@link MapleParser#join_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_constraint(MapleParser.Join_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(MapleParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def(MapleParser.Column_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#column_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_type(MapleParser.Column_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#default_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_value(MapleParser.Default_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MapleParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(MapleParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#result_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_column(MapleParser.Result_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#column_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_modifier(MapleParser.Column_modifierContext ctx);
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
	 * Visit a parse tree produced by {@link MapleParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias(MapleParser.Column_aliasContext ctx);
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
	 * Visit a parse tree produced by {@link MapleParser#signed_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_number(MapleParser.Signed_numberContext ctx);
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