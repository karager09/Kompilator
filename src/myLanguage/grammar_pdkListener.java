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
	 * Enter a parse tree produced by {@link grammar_pdkParser#form}.
	 * @param ctx the parse tree
	 */
	void enterForm(grammar_pdkParser.FormContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_pdkParser#form}.
	 * @param ctx the parse tree
	 */
	void exitForm(grammar_pdkParser.FormContext ctx);
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
	 * Enter a parse tree produced by {@link grammar_pdkParser#varExpr}.
	 * @param ctx the parse tree
	 */
	void enterVarExpr(grammar_pdkParser.VarExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_pdkParser#varExpr}.
	 * @param ctx the parse tree
	 */
	void exitVarExpr(grammar_pdkParser.VarExprContext ctx);
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
	 * Enter a parse tree produced by {@link grammar_pdkParser#clause}.
	 * @param ctx the parse tree
	 */
	void enterClause(grammar_pdkParser.ClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_pdkParser#clause}.
	 * @param ctx the parse tree
	 */
	void exitClause(grammar_pdkParser.ClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_pdkParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(grammar_pdkParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_pdkParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(grammar_pdkParser.ExprContext ctx);
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