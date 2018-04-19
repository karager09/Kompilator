// Generated from D:/Studia/Sem. 6/Kompilatory/Kompilator/src/Grammar\grammar_pdk.g4 by ANTLR 4.7
package Grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link grammar_pdkParser}.
 */
public interface grammar_pdkListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link grammar_pdkParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(grammar_pdkParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_pdkParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(grammar_pdkParser.ProgContext ctx);
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
}