// Generated from D:/Studia/Sem. 6/Kompilatory/Kompilator/src/Grammar\grammar_pdk.g4 by ANTLR 4.7
package myLanguage;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link grammar_pdkParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface grammar_pdkVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link grammar_pdkParser#forms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForms(grammar_pdkParser.FormsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code form_functionDefiniction}
	 * labeled alternative in {@link grammar_pdkParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForm_functionDefiniction(grammar_pdkParser.Form_functionDefinictionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code form_attribution}
	 * labeled alternative in {@link grammar_pdkParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForm_attribution(grammar_pdkParser.Form_attributionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_pdkParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(grammar_pdkParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_pdkParser#tokFloat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokFloat(grammar_pdkParser.TokFloatContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_pdkParser#tokInteger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokInteger(grammar_pdkParser.TokIntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_pdkParser#tokString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokString(grammar_pdkParser.TokStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_pdkParser#tokTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokTable(grammar_pdkParser.TokTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varExpr_variable}
	 * labeled alternative in {@link grammar_pdkParser#varExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarExpr_variable(grammar_pdkParser.VarExpr_variableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varExpr_tokFloat}
	 * labeled alternative in {@link grammar_pdkParser#varExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarExpr_tokFloat(grammar_pdkParser.VarExpr_tokFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varExpr_tokInteger}
	 * labeled alternative in {@link grammar_pdkParser#varExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarExpr_tokInteger(grammar_pdkParser.VarExpr_tokIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varExpr_tokString}
	 * labeled alternative in {@link grammar_pdkParser#varExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarExpr_tokString(grammar_pdkParser.VarExpr_tokStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code var_Expr_tokTable}
	 * labeled alternative in {@link grammar_pdkParser#varExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_Expr_tokTable(grammar_pdkParser.Var_Expr_tokTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varExpr_null}
	 * labeled alternative in {@link grammar_pdkParser#varExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarExpr_null(grammar_pdkParser.VarExpr_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_pdkParser#attribution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribution(grammar_pdkParser.AttributionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_pdkParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(grammar_pdkParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_pdkParser#functionDefiniction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefiniction(grammar_pdkParser.FunctionDefinictionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_pdkParser#clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClauses(grammar_pdkParser.ClausesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code clause_ifClause}
	 * labeled alternative in {@link grammar_pdkParser#clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause_ifClause(grammar_pdkParser.Clause_ifClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code clause_attribution}
	 * labeled alternative in {@link grammar_pdkParser#clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause_attribution(grammar_pdkParser.Clause_attributionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code clause_expr}
	 * labeled alternative in {@link grammar_pdkParser#clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause_expr(grammar_pdkParser.Clause_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code clause_functionCall}
	 * labeled alternative in {@link grammar_pdkParser#clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause_functionCall(grammar_pdkParser.Clause_functionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_comp}
	 * labeled alternative in {@link grammar_pdkParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_comp(grammar_pdkParser.Expr_compContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_varExpr}
	 * labeled alternative in {@link grammar_pdkParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_varExpr(grammar_pdkParser.Expr_varExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_add}
	 * labeled alternative in {@link grammar_pdkParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_add(grammar_pdkParser.Expr_addContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_functionCall}
	 * labeled alternative in {@link grammar_pdkParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_functionCall(grammar_pdkParser.Expr_functionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_mult}
	 * labeled alternative in {@link grammar_pdkParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_mult(grammar_pdkParser.Expr_multContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_bracket}
	 * labeled alternative in {@link grammar_pdkParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_bracket(grammar_pdkParser.Expr_bracketContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_prefix}
	 * labeled alternative in {@link grammar_pdkParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_prefix(grammar_pdkParser.Expr_prefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_pdkParser#ifExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpr(grammar_pdkParser.IfExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_pdkParser#ifClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfClause(grammar_pdkParser.IfClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_pdkParser#blockInstruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockInstruction(grammar_pdkParser.BlockInstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_pdkParser#prefixOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixOp(grammar_pdkParser.PrefixOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_pdkParser#multOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultOp(grammar_pdkParser.MultOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_pdkParser#addOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOp(grammar_pdkParser.AddOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_pdkParser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOp(grammar_pdkParser.CompOpContext ctx);
}