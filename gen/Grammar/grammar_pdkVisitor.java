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
	 * Visit a parse tree produced by {@link grammar_pdkParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(grammar_pdkParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_pdkParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(grammar_pdkParser.ExprContext ctx);
}