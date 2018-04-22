// Generated from D:/Studia/Sem. 6/Kompilatory/Kompilator/src/Grammar\grammar_pdk.g4 by ANTLR 4.7
package Grammar;
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
	 * Visit a parse tree produced by {@link grammar_pdkParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForm(grammar_pdkParser.FormContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_pdkParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(grammar_pdkParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_pdkParser#float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(grammar_pdkParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_pdkParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(grammar_pdkParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_pdkParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(grammar_pdkParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_pdkParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(grammar_pdkParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_pdkParser#varExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarExpr(grammar_pdkParser.VarExprContext ctx);
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
	 * Visit a parse tree produced by {@link grammar_pdkParser#clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause(grammar_pdkParser.ClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_pdkParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(grammar_pdkParser.ExprContext ctx);
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