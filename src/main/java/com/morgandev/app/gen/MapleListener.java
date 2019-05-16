// Generated from C:/Users/Morgan/IdeaProjects/MapleAntlr/src/main/antlr/com/morgandev/maple/Maple\Maple.g4 by ANTLR 4.7.2
package com.morgandev.app.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MapleParser}.
 */
public interface MapleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MapleParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(MapleParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(MapleParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(MapleParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(MapleParser.ErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#maple_stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterMaple_stmt_list(MapleParser.Maple_stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#maple_stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitMaple_stmt_list(MapleParser.Maple_stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#maple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterMaple_stmt(MapleParser.Maple_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#maple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitMaple_stmt(MapleParser.Maple_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#maple_block}.
	 * @param ctx the parse tree
	 */
	void enterMaple_block(MapleParser.Maple_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#maple_block}.
	 * @param ctx the parse tree
	 */
	void exitMaple_block(MapleParser.Maple_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#block_params}.
	 * @param ctx the parse tree
	 */
	void enterBlock_params(MapleParser.Block_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#block_params}.
	 * @param ctx the parse tree
	 */
	void exitBlock_params(MapleParser.Block_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#block_params_declaration}.
	 * @param ctx the parse tree
	 */
	void enterBlock_params_declaration(MapleParser.Block_params_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#block_params_declaration}.
	 * @param ctx the parse tree
	 */
	void exitBlock_params_declaration(MapleParser.Block_params_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#block_datatype_param}.
	 * @param ctx the parse tree
	 */
	void enterBlock_datatype_param(MapleParser.Block_datatype_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#block_datatype_param}.
	 * @param ctx the parse tree
	 */
	void exitBlock_datatype_param(MapleParser.Block_datatype_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#block_params_expr_declaration}.
	 * @param ctx the parse tree
	 */
	void enterBlock_params_expr_declaration(MapleParser.Block_params_expr_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#block_params_expr_declaration}.
	 * @param ctx the parse tree
	 */
	void exitBlock_params_expr_declaration(MapleParser.Block_params_expr_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock_statement(MapleParser.Block_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock_statement(MapleParser.Block_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#variable_declaration_stmt}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration_stmt(MapleParser.Variable_declaration_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#variable_declaration_stmt}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration_stmt(MapleParser.Variable_declaration_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#variable_assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void enterVariable_assignment_stmt(MapleParser.Variable_assignment_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#variable_assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void exitVariable_assignment_stmt(MapleParser.Variable_assignment_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#variable_inc_dec_stmt}.
	 * @param ctx the parse tree
	 */
	void enterVariable_inc_dec_stmt(MapleParser.Variable_inc_dec_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#variable_inc_dec_stmt}.
	 * @param ctx the parse tree
	 */
	void exitVariable_inc_dec_stmt(MapleParser.Variable_inc_dec_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#utility_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUtility_stmt(MapleParser.Utility_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#utility_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUtility_stmt(MapleParser.Utility_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#variable_stmt}.
	 * @param ctx the parse tree
	 */
	void enterVariable_stmt(MapleParser.Variable_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#variable_stmt}.
	 * @param ctx the parse tree
	 */
	void exitVariable_stmt(MapleParser.Variable_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_stmt(MapleParser.Create_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_stmt(MapleParser.Create_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt(MapleParser.Update_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt(MapleParser.Update_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt(MapleParser.Delete_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt(MapleParser.Delete_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt(MapleParser.Insert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt(MapleParser.Insert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(MapleParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(MapleParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#join_stmt}.
	 * @param ctx the parse tree
	 */
	void enterJoin_stmt(MapleParser.Join_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#join_stmt}.
	 * @param ctx the parse tree
	 */
	void exitJoin_stmt(MapleParser.Join_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#insert_value_set}.
	 * @param ctx the parse tree
	 */
	void enterInsert_value_set(MapleParser.Insert_value_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#insert_value_set}.
	 * @param ctx the parse tree
	 */
	void exitInsert_value_set(MapleParser.Insert_value_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#update_value_set}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_value_set(MapleParser.Update_value_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#update_value_set}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_value_set(MapleParser.Update_value_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#column_def}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def(MapleParser.Column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#column_def}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def(MapleParser.Column_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#fk_column_def}.
	 * @param ctx the parse tree
	 */
	void enterFk_column_def(MapleParser.Fk_column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#fk_column_def}.
	 * @param ctx the parse tree
	 */
	void exitFk_column_def(MapleParser.Fk_column_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#fk_constraint}.
	 * @param ctx the parse tree
	 */
	void enterFk_constraint(MapleParser.Fk_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#fk_constraint}.
	 * @param ctx the parse tree
	 */
	void exitFk_constraint(MapleParser.Fk_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#standard_column_def}.
	 * @param ctx the parse tree
	 */
	void enterStandard_column_def(MapleParser.Standard_column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#standard_column_def}.
	 * @param ctx the parse tree
	 */
	void exitStandard_column_def(MapleParser.Standard_column_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#column_type}.
	 * @param ctx the parse tree
	 */
	void enterColumn_type(MapleParser.Column_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#column_type}.
	 * @param ctx the parse tree
	 */
	void exitColumn_type(MapleParser.Column_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#parameter_type}.
	 * @param ctx the parse tree
	 */
	void enterParameter_type(MapleParser.Parameter_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#parameter_type}.
	 * @param ctx the parse tree
	 */
	void exitParameter_type(MapleParser.Parameter_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(MapleParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(MapleParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#variable_type}.
	 * @param ctx the parse tree
	 */
	void enterVariable_type(MapleParser.Variable_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#variable_type}.
	 * @param ctx the parse tree
	 */
	void exitVariable_type(MapleParser.Variable_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#default_value}.
	 * @param ctx the parse tree
	 */
	void enterDefault_value(MapleParser.Default_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#default_value}.
	 * @param ctx the parse tree
	 */
	void exitDefault_value(MapleParser.Default_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void enterJoin_constraint(MapleParser.Join_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void exitJoin_constraint(MapleParser.Join_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(MapleParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(MapleParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stmt(MapleParser.Print_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stmt(MapleParser.Print_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(MapleParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(MapleParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#result_column}.
	 * @param ctx the parse tree
	 */
	void enterResult_column(MapleParser.Result_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#result_column}.
	 * @param ctx the parse tree
	 */
	void exitResult_column(MapleParser.Result_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MapleParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MapleParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#column_modifier}.
	 * @param ctx the parse tree
	 */
	void enterColumn_modifier(MapleParser.Column_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#column_modifier}.
	 * @param ctx the parse tree
	 */
	void exitColumn_modifier(MapleParser.Column_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#block_name}.
	 * @param ctx the parse tree
	 */
	void enterBlock_name(MapleParser.Block_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#block_name}.
	 * @param ctx the parse tree
	 */
	void exitBlock_name(MapleParser.Block_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#block_action_name}.
	 * @param ctx the parse tree
	 */
	void enterBlock_action_name(MapleParser.Block_action_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#block_action_name}.
	 * @param ctx the parse tree
	 */
	void exitBlock_action_name(MapleParser.Block_action_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(MapleParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(MapleParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(MapleParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(MapleParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(MapleParser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(MapleParser.Database_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(MapleParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(MapleParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(MapleParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(MapleParser.Table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(MapleParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(MapleParser.Column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void enterSigned_number(MapleParser.Signed_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void exitSigned_number(MapleParser.Signed_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(MapleParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(MapleParser.Literal_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterAny_name(MapleParser.Any_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitAny_name(MapleParser.Any_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#embedded_sql}.
	 * @param ctx the parse tree
	 */
	void enterEmbedded_sql(MapleParser.Embedded_sqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#embedded_sql}.
	 * @param ctx the parse tree
	 */
	void exitEmbedded_sql(MapleParser.Embedded_sqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#any_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAny_stmt(MapleParser.Any_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#any_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAny_stmt(MapleParser.Any_stmtContext ctx);
}