// Generated from D:/Studia/Sem. 6/Kompilatory/Kompilator/src/Grammar\grammar_pdk.g4 by ANTLR 4.7
package myLanguage;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link grammar_pdkParser}.
 */
public interface grammar_pdkListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link grammar_pdkParser#forms}.
	 * @param ctx the parse tree
	 */
	void enterForms(grammar_pdkParser.FormsContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_pdkParser#forms}.
	 * @param ctx the parse tree
	 */
	void exitForms(grammar_pdkParser.FormsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code form_functionDefiniction}
	 * labeled alternative in {@link grammar_pdkParser#form}.
	 * @param ctx the parse tree
	 */
	void enterForm_functionDefiniction(grammar_pdkParser.Form_functionDefinictionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code form_functionDefiniction}
	 * labeled alternative in {@link grammar_pdkParser#form}.
	 * @param ctx the parse tree
	 */
	void exitForm_functionDefiniction(grammar_pdkParser.Form_functionDefinictionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code form_attribution}
	 * labeled alternative in {@link grammar_pdkParser#form}.
	 * @param ctx the parse tree
	 */
	void enterForm_attribution(grammar_pdkParser.Form_attributionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code form_attribution}
	 * labeled alternative in {@link grammar_pdkParser#form}.
	 * @param ctx the parse tree
	 */
	void exitForm_attribution(grammar_pdkParser.Form_attributionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_pdkParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(grammar_pdkParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_pdkParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(grammar_pdkParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_pdkParser#tokFloat}.
	 * @param ctx the parse tree
	 */
	void enterTokFloat(grammar_pdkParser.TokFloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_pdkParser#tokFloat}.
	 * @param ctx the parse tree
	 */
	void exitTokFloat(grammar_pdkParser.TokFloatContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_pdkParser#tokInteger}.
	 * @param ctx the parse tree
	 */
	void enterTokInteger(grammar_pdkParser.TokIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_pdkParser#tokInteger}.
	 * @param ctx the parse tree
	 */
	void exitTokInteger(grammar_pdkParser.TokIntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_pdkParser#tokString}.
	 * @param ctx the parse tree
	 */
	void enterTokString(grammar_pdkParser.TokStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_pdkParser#tokString}.
	 * @param ctx the parse tree
	 */
	void exitTokString(grammar_pdkParser.TokStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_pdkParser#tokTable}.
	 * @param ctx the parse tree
	 */
	void enterTokTable(grammar_pdkParser.TokTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_pdkParser#tokTable}.
	 * @param ctx the parse tree
	 */
	void exitTokTable(grammar_pdkParser.TokTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varExpr_variable}
	 * labeled alternative in {@link grammar_pdkParser#varExpr}.
	 * @param ctx the parse tree
	 */
	void enterVarExpr_variable(grammar_pdkParser.VarExpr_variableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varExpr_variable}
	 * labeled alternative in {@link grammar_pdkParser#varExpr}.
	 * @param ctx the parse tree
	 */
	void exitVarExpr_variable(grammar_pdkParser.VarExpr_variableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varExpr_tokFloat}
	 * labeled alternative in {@link grammar_pdkParser#varExpr}.
	 * @param ctx the parse tree
	 */
	void enterVarExpr_tokFloat(grammar_pdkParser.VarExpr_tokFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varExpr_tokFloat}
	 * labeled alternative in {@link grammar_pdkParser#varExpr}.
	 * @param ctx the parse tree
	 */
	void exitVarExpr_tokFloat(grammar_pdkParser.VarExpr_tokFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varExpr_tokInteger}
	 * labeled alternative in {@link grammar_pdkParser#varExpr}.
	 * @param ctx the parse tree
	 */
	void enterVarExpr_tokInteger(grammar_pdkParser.VarExpr_tokIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varExpr_tokInteger}
	 * labeled alternative in {@link grammar_pdkParser#varExpr}.
	 * @param ctx the parse tree
	 */
	void exitVarExpr_tokInteger(grammar_pdkParser.VarExpr_tokIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varExpr_tokString}
	 * labeled alternative in {@link grammar_pdkParser#varExpr}.
	 * @param ctx the parse tree
	 */
	void enterVarExpr_tokString(grammar_pdkParser.VarExpr_tokStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varExpr_tokString}
	 * labeled alternative in {@link grammar_pdkParser#varExpr}.
	 * @param ctx the parse tree
	 */
	void exitVarExpr_tokString(grammar_pdkParser.VarExpr_tokStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code var_Expr_tokTable}
	 * labeled alternative in {@link grammar_pdkParser#varExpr}.
	 * @param ctx the parse tree
	 */
	void enterVar_Expr_tokTable(grammar_pdkParser.Var_Expr_tokTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var_Expr_tokTable}
	 * labeled alternative in {@link grammar_pdkParser#varExpr}.
	 * @param ctx the parse tree
	 */
	void exitVar_Expr_tokTable(grammar_pdkParser.Var_Expr_tokTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varExpr_null}
	 * labeled alternative in {@link grammar_pdkParser#varExpr}.
	 * @param ctx the parse tree
	 */
	void enterVarExpr_null(grammar_pdkParser.VarExpr_nullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varExpr_null}
	 * labeled alternative in {@link grammar_pdkParser#varExpr}.
	 * @param ctx the parse tree
	 */
	void exitVarExpr_null(grammar_pdkParser.VarExpr_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_pdkParser#attribution}.
	 * @param ctx the parse tree
	 */
	void enterAttribution(grammar_pdkParser.AttributionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_pdkParser#attribution}.
	 * @param ctx the parse tree
	 */
	void exitAttribution(grammar_pdkParser.AttributionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_pdkParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(grammar_pdkParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_pdkParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(grammar_pdkParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_pdkParser#functionDefiniction}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefiniction(grammar_pdkParser.FunctionDefinictionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_pdkParser#functionDefiniction}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefiniction(grammar_pdkParser.FunctionDefinictionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_pdkParser#clauses}.
	 * @param ctx the parse tree
	 */
	void enterClauses(grammar_pdkParser.ClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_pdkParser#clauses}.
	 * @param ctx the parse tree
	 */
	void exitClauses(grammar_pdkParser.ClausesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code clause_ifClause}
	 * labeled alternative in {@link grammar_pdkParser#clause}.
	 * @param ctx the parse tree
	 */
	void enterClause_ifClause(grammar_pdkParser.Clause_ifClauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code clause_ifClause}
	 * labeled alternative in {@link grammar_pdkParser#clause}.
	 * @param ctx the parse tree
	 */
	void exitClause_ifClause(grammar_pdkParser.Clause_ifClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code clause_attribution}
	 * labeled alternative in {@link grammar_pdkParser#clause}.
	 * @param ctx the parse tree
	 */
	void enterClause_attribution(grammar_pdkParser.Clause_attributionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code clause_attribution}
	 * labeled alternative in {@link grammar_pdkParser#clause}.
	 * @param ctx the parse tree
	 */
	void exitClause_attribution(grammar_pdkParser.Clause_attributionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code clause_functionCall}
	 * labeled alternative in {@link grammar_pdkParser#clause}.
	 * @param ctx the parse tree
	 */
	void enterClause_functionCall(grammar_pdkParser.Clause_functionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code clause_functionCall}
	 * labeled alternative in {@link grammar_pdkParser#clause}.
	 * @param ctx the parse tree
	 */
	void exitClause_functionCall(grammar_pdkParser.Clause_functionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code clause_expr}
	 * labeled alternative in {@link grammar_pdkParser#clause}.
	 * @param ctx the parse tree
	 */
	void enterClause_expr(grammar_pdkParser.Clause_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code clause_expr}
	 * labeled alternative in {@link grammar_pdkParser#clause}.
	 * @param ctx the parse tree
	 */
	void exitClause_expr(grammar_pdkParser.Clause_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_comp}
	 * labeled alternative in {@link grammar_pdkParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_comp(grammar_pdkParser.Expr_compContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_comp}
	 * labeled alternative in {@link grammar_pdkParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_comp(grammar_pdkParser.Expr_compContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_varExpr}
	 * labeled alternative in {@link grammar_pdkParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_varExpr(grammar_pdkParser.Expr_varExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_varExpr}
	 * labeled alternative in {@link grammar_pdkParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_varExpr(grammar_pdkParser.Expr_varExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_add}
	 * labeled alternative in {@link grammar_pdkParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_add(grammar_pdkParser.Expr_addContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_add}
	 * labeled alternative in {@link grammar_pdkParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_add(grammar_pdkParser.Expr_addContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_functionCall}
	 * labeled alternative in {@link grammar_pdkParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_functionCall(grammar_pdkParser.Expr_functionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_functionCall}
	 * labeled alternative in {@link grammar_pdkParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_functionCall(grammar_pdkParser.Expr_functionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_mult}
	 * labeled alternative in {@link grammar_pdkParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_mult(grammar_pdkParser.Expr_multContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_mult}
	 * labeled alternative in {@link grammar_pdkParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_mult(grammar_pdkParser.Expr_multContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_bracket}
	 * labeled alternative in {@link grammar_pdkParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_bracket(grammar_pdkParser.Expr_bracketContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_bracket}
	 * labeled alternative in {@link grammar_pdkParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_bracket(grammar_pdkParser.Expr_bracketContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_prefix}
	 * labeled alternative in {@link grammar_pdkParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_prefix(grammar_pdkParser.Expr_prefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_prefix}
	 * labeled alternative in {@link grammar_pdkParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_prefix(grammar_pdkParser.Expr_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_pdkParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void enterIfExpr(grammar_pdkParser.IfExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_pdkParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void exitIfExpr(grammar_pdkParser.IfExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_pdkParser#ifClause}.
	 * @param ctx the parse tree
	 */
	void enterIfClause(grammar_pdkParser.IfClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_pdkParser#ifClause}.
	 * @param ctx the parse tree
	 */
	void exitIfClause(grammar_pdkParser.IfClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_pdkParser#blockInstruction}.
	 * @param ctx the parse tree
	 */
	void enterBlockInstruction(grammar_pdkParser.BlockInstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_pdkParser#blockInstruction}.
	 * @param ctx the parse tree
	 */
	void exitBlockInstruction(grammar_pdkParser.BlockInstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_pdkParser#prefixOp}.
	 * @param ctx the parse tree
	 */
	void enterPrefixOp(grammar_pdkParser.PrefixOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_pdkParser#prefixOp}.
	 * @param ctx the parse tree
	 */
	void exitPrefixOp(grammar_pdkParser.PrefixOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_pdkParser#multOp}.
	 * @param ctx the parse tree
	 */
	void enterMultOp(grammar_pdkParser.MultOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_pdkParser#multOp}.
	 * @param ctx the parse tree
	 */
	void exitMultOp(grammar_pdkParser.MultOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_pdkParser#addOp}.
	 * @param ctx the parse tree
	 */
	void enterAddOp(grammar_pdkParser.AddOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_pdkParser#addOp}.
	 * @param ctx the parse tree
	 */
	void exitAddOp(grammar_pdkParser.AddOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_pdkParser#compOp}.
	 * @param ctx the parse tree
	 */
	void enterCompOp(grammar_pdkParser.CompOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_pdkParser#compOp}.
	 * @param ctx the parse tree
	 */
	void exitCompOp(grammar_pdkParser.CompOpContext ctx);
}