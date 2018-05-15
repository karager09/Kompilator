// Generated from D:/Studia/Sem. 6/Kompilatory/Kompilator/src/Grammar\grammar_pdk.g4 by ANTLR 4.7
package myLanguage;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static myLanguage.grammar_pdkParser.RULE_clause;

/**
 * This class provides an empty implementation of {@link grammar_pdkListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class grammar_pdkBaseListener implements grammar_pdkListener {

	private FileWriter out;
	private void startPrinting(){
		try {

			//miejsce utworzenia pliku po translacji
			out = new FileWriter("D:\\Studia\\Sem. 6\\Kompilatory\\Kompilator\\out.cpp");

			//dodajemy klase ze zdefiniowanymi Variables
			//byte[] encoded = Files.readAllBytes(Paths.get("Variable.cpp"));
			//out.write(new String(encoded));

			out.write("#include \"Variable.cpp\"\n\n");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	private void print(String s){

		try {
			out.write(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void stopPrinting(){
		try {
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterForms(grammar_pdkParser.FormsContext ctx) { startPrinting();}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitForms(grammar_pdkParser.FormsContext ctx) {stopPrinting();}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterForm(grammar_pdkParser.FormContext ctx) {

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitForm(grammar_pdkParser.FormContext ctx) {

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVariable(grammar_pdkParser.VariableContext ctx) {

		if(!ctx.getText().equals("print")) print(ctx.VARIABLE().getSymbol().getText());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVariable(grammar_pdkParser.VariableContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTokFloat(grammar_pdkParser.TokFloatContext ctx) {print(ctx.FLOAT().getSymbol().getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTokFloat(grammar_pdkParser.TokFloatContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTokInteger(grammar_pdkParser.TokIntegerContext ctx) {print(ctx.INTEGER().getSymbol().getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTokInteger(grammar_pdkParser.TokIntegerContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTokString(grammar_pdkParser.TokStringContext ctx) {print(ctx.STRING().getSymbol().getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTokString(grammar_pdkParser.TokStringContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTokTable(grammar_pdkParser.TokTableContext ctx) { print(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTokTable(grammar_pdkParser.TokTableContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVarExpr(grammar_pdkParser.VarExprContext ctx) {
		//ctx.getChild(0).getText();

		//if(ctx.getText().equals("null")) print("NULL");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVarExpr(grammar_pdkParser.VarExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAttribution(grammar_pdkParser.AttributionContext ctx) {

		//System.out.println(ctx.getChild(0) +":"+ctx.getRuleIndex() +":" + ctx.getText());


		if ( ctx.getChildCount() == 4) print("\nVariable ");

		ctx.variable().enterRule(grammar_pdkBaseListener.this);

		print(" = ");

		ctx.expr().enterRule(grammar_pdkBaseListener.this);

		print("#");
		exitAttribution(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAttribution(grammar_pdkParser.AttributionContext ctx) {

		print(";\n");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFunctionCall(grammar_pdkParser.FunctionCallContext ctx) {

		if((ctx.getChild(0).getText()).equals("print")) {
			print("\ncout ");
			for (int i = 0; i < ctx.expr().size(); i++) {
				print("<< ");
				ctx.expr(i).enterRule(grammar_pdkBaseListener.this);
			}

		} else{

			print(ctx.getChild(0).getText() + "(");

			ctx.expr().forEach(exprContext -> exprContext.enterRule(grammar_pdkBaseListener.this));

			print(")");
		}

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFunctionCall(grammar_pdkParser.FunctionCallContext ctx) {

		//jesli nie jestesmy w expression (np przypisaniu) to dodajemy srednik
		if (ctx.getParent().getRuleIndex() == RULE_clause)
		print(";\n");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFunctionDefiniction(grammar_pdkParser.FunctionDefinictionContext ctx) {
		if((ctx.getChild(0).getText()).equals("main")) {
			print("\nint main(){");
		}

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFunctionDefiniction(grammar_pdkParser.FunctionDefinictionContext ctx) {

		if((ctx.getChild(0).getText()).equals("main")) {
			print("\nreturn 0;\n}");

		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterClauses(grammar_pdkParser.ClausesContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitClauses(grammar_pdkParser.ClausesContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterClause(grammar_pdkParser.ClauseContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitClause(grammar_pdkParser.ClauseContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExpr(grammar_pdkParser.ExprContext ctx) {
		if( ctx.getText().startsWith("(")) print("( ");

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExpr(grammar_pdkParser.ExprContext ctx) {
		if( ctx.getText().startsWith("(")) print(") ");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIfExpr(grammar_pdkParser.IfExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIfExpr(grammar_pdkParser.IfExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIfClause(grammar_pdkParser.IfClauseContext ctx) {


	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIfClause(grammar_pdkParser.IfClauseContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBlockInstruction(grammar_pdkParser.BlockInstructionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBlockInstruction(grammar_pdkParser.BlockInstructionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPrefixOp(grammar_pdkParser.PrefixOpContext ctx) { print(" " + ctx.getText() + " "); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPrefixOp(grammar_pdkParser.PrefixOpContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMultOp(grammar_pdkParser.MultOpContext ctx) { print(" " + ctx.getText() + " "); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMultOp(grammar_pdkParser.MultOpContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAddOp(grammar_pdkParser.AddOpContext ctx) {  print(" " + ctx.getText() + " ");}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAddOp(grammar_pdkParser.AddOpContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCompOp(grammar_pdkParser.CompOpContext ctx) { print(" " + ctx.getText() + " "); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCompOp(grammar_pdkParser.CompOpContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }
}