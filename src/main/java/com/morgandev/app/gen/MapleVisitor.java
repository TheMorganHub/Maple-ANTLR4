// Generated from C:/Users/Morgan/IdeaProjects/MapleAntlr/src/main/antlr/com/morgandev/maple/Maple\Maple.g4 by ANTLR 4.7.2
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
	 * Visit a parse tree produced by {@link MapleParser#complex_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplex_block(MapleParser.Complex_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#maple_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaple_block(MapleParser.Maple_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#if_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_block(MapleParser.If_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#elseif_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif_block(MapleParser.Elseif_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#else_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_block(MapleParser.Else_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#block_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_params(MapleParser.Block_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#block_params_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_params_declaration(MapleParser.Block_params_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#block_datatype_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_datatype_param(MapleParser.Block_datatype_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#block_params_expr_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_params_expr_declaration(MapleParser.Block_params_expr_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#block_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_statement(MapleParser.Block_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#variable_declaration_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration_stmt(MapleParser.Variable_declaration_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#variable_assignment_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_assignment_stmt(MapleParser.Variable_assignment_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#variable_inc_dec_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_inc_dec_stmt(MapleParser.Variable_inc_dec_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#variable_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_stmt(MapleParser.Variable_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_stmt(MapleParser.Create_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def(MapleParser.Column_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#fk_column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFk_column_def(MapleParser.Fk_column_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#fk_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFk_constraint(MapleParser.Fk_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#standard_column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandard_column_def(MapleParser.Standard_column_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#column_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_type(MapleParser.Column_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#update_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt(MapleParser.Update_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#update_value_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_value_set(MapleParser.Update_value_setContext ctx);
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
	 * Visit a parse tree produced by {@link MapleParser#utility_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUtility_stmt(MapleParser.Utility_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#parameter_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_type(MapleParser.Parameter_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(MapleParser.Data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#variable_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_type(MapleParser.Variable_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#default_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_value(MapleParser.Default_valueContext ctx);
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
	 * Visit a parse tree produced by {@link MapleParser#print_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_stmt(MapleParser.Print_stmtContext ctx);
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
	 * Visit a parse tree produced by {@link MapleParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MapleParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#column_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_modifier(MapleParser.Column_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#block_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_name(MapleParser.Block_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#block_action_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_action_name(MapleParser.Block_action_nameContext ctx);
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
	 * Visit a parse tree produced by {@link MapleParser#signed_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_number(MapleParser.Signed_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapleParser#prepared_literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrepared_literal_value(MapleParser.Prepared_literal_valueContext ctx);
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