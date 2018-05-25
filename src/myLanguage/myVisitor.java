package myLanguage;

import javafx.beans.binding.ListExpression;
import myLanguage.grammar_pdkBaseVisitor;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.FileWriter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static java.lang.System.exit;
import static myLanguage.grammar_pdkParser.RULE_forms;
import static myLanguage.grammar_pdkParser.RULE_functionDefiniction;
import static myLanguage.grammar_pdkParser.RULE_ifClause;

public class myVisitor extends grammar_pdkBaseVisitor<String>{

    int tabs = 0;

    HashMap<String,LinkedList<String>> VARIABLES= new HashMap<String, LinkedList<String>>();

    private FileWriter out;
    private void startPrinting(){
        try {

            //output definition
            out = new FileWriter("D:\\Studia\\Sem. 6\\Kompilatory\\Kompilator\\out.cpp");

            out.write("#include \"Variable.cpp\"\n\n");

        } catch (Exception e) {
            System.out.println("Problem with file to write to.");
            exit(1);
            e.printStackTrace();
        }
    }


    private void print(String s){

        try {
            out.write(s);
        } catch (Exception e) {
            System.out.println("Problem with printing to file.");
            e.printStackTrace();
        }
    }

    private void stopPrinting(){
        try {
            out.close();
        } catch (Exception e) {
            System.out.println("Problem with closing file.");
            e.printStackTrace();
        }
    }



    @Override
    public String visitForms(grammar_pdkParser.FormsContext ctx) {
        startPrinting();
        //initialize scopes with global
        VARIABLES.put("GLOBAL", new LinkedList<>());
        super.visitForms(ctx);
        stopPrinting();
        return "OK";
    }

    @Override
    public String visitForm_functionDefiniction(grammar_pdkParser.Form_functionDefinictionContext ctx) {
        visitChildren(ctx);
        print("\n");
        return "OK";
    }

    @Override
    public String visitForm_attribution(grammar_pdkParser.Form_attributionContext ctx) {
        visitChildren(ctx);
        print(";\n");
        return "OK";
    }

    @Override
    public String visitVariable(grammar_pdkParser.VariableContext ctx) {
        //change "true" or "false" for 1 and 0
        if(ctx.VARIABLE().getText().equals("true")) print("1");
        else if(ctx.VARIABLE().getText().equals("false")) print("0");
        else print("_" + ctx.VARIABLE().getText());
        return super.visitVariable(ctx);
    }

    @Override
    public String visitTokFloat(grammar_pdkParser.TokFloatContext ctx) {
        print("Variable(");
        print(ctx.FLOAT().getSymbol().getText());
        print(")");
        return super.visitTokFloat(ctx);
    }

    @Override
    public String visitTokInteger(grammar_pdkParser.TokIntegerContext ctx) {
        print("Variable(");
        print(ctx.INTEGER().getSymbol().getText());
        print(")");
        return super.visitTokInteger(ctx);
    }

    @Override
    public String visitTokString(grammar_pdkParser.TokStringContext ctx) {
        print("Variable(");
        print(ctx.STRING().getSymbol().getText());
        print(")");
        return super.visitTokString(ctx);
    }

    @Override
    public String visitTokTable(grammar_pdkParser.TokTableContext ctx) {
        return super.visitTokTable(ctx);
    }

    @Override
    public String visitVarExpr_variable(grammar_pdkParser.VarExpr_variableContext ctx) {
        return super.visitVarExpr_variable(ctx);
    }

    @Override
    public String visitVarExpr_tokFloat(grammar_pdkParser.VarExpr_tokFloatContext ctx) {
        return super.visitVarExpr_tokFloat(ctx);
    }

    @Override
    public String visitVarExpr_tokInteger(grammar_pdkParser.VarExpr_tokIntegerContext ctx) {
        return super.visitVarExpr_tokInteger(ctx);
    }

    @Override
    public String visitVarExpr_tokString(grammar_pdkParser.VarExpr_tokStringContext ctx) {
        return super.visitVarExpr_tokString(ctx);
    }

    @Override
    public String visitVar_Expr_tokTable(grammar_pdkParser.Var_Expr_tokTableContext ctx) {
        return super.visitVar_Expr_tokTable(ctx);
    }

    @Override
    public String visitVarExpr_null(grammar_pdkParser.VarExpr_nullContext ctx) {
        print("NULL");
        return super.visitVarExpr_null(ctx);
    }

    /**
     * Find in witch function we are, if in none than it is "GLOBAL"
     * We use it, when we want to find out, if we have to add "Variable" before new variable
     * @param ctx function context
     * @return  name of function
     */
    String getFunctionName(ParserRuleContext ctx){
        while(ctx.getRuleIndex() != RULE_functionDefiniction && ctx.getRuleIndex() != RULE_forms) ctx = ctx.getParent();
            if(ctx.getRuleIndex() == RULE_functionDefiniction) return ctx.children.get(0).getText();
        return "GLOBAL";
    }

    /**
     * If we haven't used this variable before than we have to initialize it. (add "Variable")
     * And add to VARIABLES (for further use)
     * @param ctx
     * @return
     */
    @Override
    public String visitAttribution(grammar_pdkParser.AttributionContext ctx) {
        if(!VARIABLES.get("GLOBAL").contains(ctx.variable().VARIABLE().getSymbol().getText())){
            if(!VARIABLES.containsKey(getFunctionName(ctx))){
                LinkedList<String> ll = new LinkedList<String>();
                ll.add(ctx.variable().VARIABLE().getSymbol().getText());
                VARIABLES.put(getFunctionName(ctx), ll);
                print("Variable ");
            } else if(!VARIABLES.get(getFunctionName(ctx)).contains(ctx.variable().VARIABLE().getSymbol().getText())){
                VARIABLES.get(getFunctionName(ctx)).add(ctx.variable().VARIABLE().getSymbol().getText());
                print("Variable ");
            }
        }

        visit(ctx.variable());
        print(" = ");
        visit(ctx.expr());
        //print(";");
        return "OK";
        //return super.visitAttribution(ctx);
    }

    /**
     * There is place for user's functions calls
     * or we want to specify another behaviour
     * For example printing function, or loading variables etc.
     * @param ctx
     * @return
     */
    @Override
    public String visitFunctionCall(grammar_pdkParser.FunctionCallContext ctx) {
        //if we want to print something
        if(ctx.variable().VARIABLE().getSymbol().getText().equals("print")){
            print("cout << ");
            List<grammar_pdkParser.ExprContext> expr = ctx.expr();
            for (int i = 0; i < expr.size(); i++) {
                visit(expr.get(i));
                if (i < expr.size() - 1) print("<< ");
            }

            //if we want to load some variable from user
        }else if(ctx.variable().VARIABLE().getSymbol().getText().equals("get")){
            //we need to initialize it first
            if(!VARIABLES.containsKey(getFunctionName(ctx)) ||(VARIABLES.containsKey(getFunctionName(ctx)) && !VARIABLES.get(getFunctionName(ctx)).contains(ctx.expr(0).getText()))){
                if(!VARIABLES.containsKey(getFunctionName(ctx))){
                    LinkedList<String> ll = new LinkedList<String>();
                    VARIABLES.put(getFunctionName(ctx), ll);
                }

                VARIABLES.get(getFunctionName(ctx)).add(ctx.expr(0).getText());

                print("Variable ");
                visit(ctx.expr(0));
                print(" = Variable(\"\");\n");
                for (int t = 0; t < tabs; t++) print("\t");

            }

            print("cin >> ");
            visit(ctx.expr(0));
        //in other cases it just normal function
        }else {


            visit(ctx.variable());
            print("( ");

            List<grammar_pdkParser.ExprContext> expr = ctx.expr();
            for (int i = 0; i < expr.size(); i++) {
                visit(expr.get(i));
                if (i < expr.size() - 1) print(", ");
            }

            print(" )");
        }
        return "OK";
    }

    /**
     * Function definition - proper printing
     * Adding parameters of function to VARIABLES
     * @param ctx
     * @return
     */
    @Override
    public String visitFunctionDefiniction(grammar_pdkParser.FunctionDefinictionContext ctx) {
        for (int t = 0; t < tabs; t++) print("\t");
        if(!VARIABLES.containsKey(ctx.variable(0).getText())) VARIABLES.put(ctx.variable(0).getText(), new LinkedList<>());
        if(ctx.variable(0).VARIABLE().getText().equals("main")){
            print("int main(){\n");

            ++ tabs;
            visit(ctx.clauses());
            --tabs;
            for (int t = 0; t < tabs; t++) print("\t");
            print("return 0;\n}\n");
        }
        else {
            for (int t = 0; t < tabs; t++) print("\t");
            print("Variable ");

            visit(ctx.variable(0));
            print("(");

            List<grammar_pdkParser.VariableContext> var = ctx.variable();
            for (int i = 1; i < var.size(); i++) {
                print("Variable ");
                VARIABLES.get(ctx.variable(0).getText()).add(var.get(i).VARIABLE().getSymbol().getText());
                visit(var.get(i));
                if (i < var.size() - 1) print(", ");
            }

            print("){\n");
            ++tabs;
            List<grammar_pdkParser.ClauseContext> clause = ctx.clauses().clause();
            for (int i = 0; i < clause.size(); i++) {
                //ostatnie wyrazenie, musimy zwrocic jakas wartosc
                if (i == clause.size() - 1) {
                    for (int t = 0; t < tabs; t++) print("\t");
                    print("return ");
                    //if we want to return variable (not a function call)
                    if(VARIABLES.get(ctx.variable(0).getText()) != null && VARIABLES.get(ctx.variable(0).getText()).contains(clause.get(i).getChild(0).getChild(0).getText()))
                        print("_"+clause.get(i).getChild(0).getChild(0).getText() +";\n");
                    else visit(clause.get(i));
                }
                else visit(clause.get(i));
            }
            --tabs;
            for (int t = 0; t < tabs; t++) print("\t");
            print("}\n");
        }
        return "OK";
    }

    @Override
    public String visitClauses(grammar_pdkParser.ClausesContext ctx) {
        return super.visitClauses(ctx);
    }

    @Override
    public String visitClause_ifClause(grammar_pdkParser.Clause_ifClauseContext ctx) {
        visitChildren(ctx);
        return "OK";
    }

    @Override
    public String visitClause_attribution(grammar_pdkParser.Clause_attributionContext ctx) {
        for (int t = 0; t < tabs; t++) print("\t");
        visitChildren(ctx);
        print(";\n");
        return "OK";
    }

    @Override
    public String visitClause_functionCall(grammar_pdkParser.Clause_functionCallContext ctx) {
        for (int t = 0; t < tabs; t++) print("\t");
        visitChildren(ctx);
        print(";\n");
        return "OK";
    }

    @Override
    public String visitClause_expr(grammar_pdkParser.Clause_exprContext ctx) {
        for (int t = 0; t < tabs; t++) print("\t");
        visitChildren(ctx);
        print(";\n");
        return "OK";
    }

    @Override
    public String visitExpr_comp(grammar_pdkParser.Expr_compContext ctx) {
        return super.visitExpr_comp(ctx);
    }

    @Override
    public String visitExpr_varExpr(grammar_pdkParser.Expr_varExprContext ctx) {
        return super.visitExpr_varExpr(ctx);
    }

    @Override
    public String visitExpr_add(grammar_pdkParser.Expr_addContext ctx) {
        return super.visitExpr_add(ctx);
    }

    @Override
    public String visitExpr_functionCall(grammar_pdkParser.Expr_functionCallContext ctx) {
        return super.visitExpr_functionCall(ctx);
    }

    @Override
    public String visitExpr_mult(grammar_pdkParser.Expr_multContext ctx) {
        return super.visitExpr_mult(ctx);
    }

    @Override
    public String visitExpr_bracket(grammar_pdkParser.Expr_bracketContext ctx) {
        print("(");
        visitChildren(ctx);
        print(")");
        return "OK";
    }

    @Override
    public String visitExpr_prefix(grammar_pdkParser.Expr_prefixContext ctx) {
        return super.visitExpr_prefix(ctx);
    }

    @Override
    public String visitIfExpr(grammar_pdkParser.IfExprContext ctx) {
        if(ctx.getParent().children.get(0) == ctx)for (int t = 0; t < tabs; t++) print("\t");
        print("if( ");
        visit(ctx.expr());
        print(")");
        visitBlockInstruction(ctx.blockInstruction());

        return "OK";
    }

    @Override
    public String visitIfClause(grammar_pdkParser.IfClauseContext ctx) {
        ++tabs;
        List<grammar_pdkParser.IfExprContext> ifExpr = ctx.ifExpr();
        for (int i = 0; i < ifExpr.size(); i++) {
            visit(ifExpr.get(i));
            if(i < ifExpr.size() - 1) {
                for (int t = 0; t < tabs; t++) print("\t");
                print("else ");
            }

        }
        --tabs;
        return "OK";
    }

    @Override
    public String visitBlockInstruction(grammar_pdkParser.BlockInstructionContext ctx) {
        print("{\n");
        ++tabs;
        visitChildren(ctx);
        --tabs;
        for (int t = 0; t < tabs; t++) print("\t");
        print("}\n");
        return "OK";
    }

    @Override
    public String visitPrefixOp(grammar_pdkParser.PrefixOpContext ctx) {
        print(ctx.getText());
        return super.visitPrefixOp(ctx);
    }

    @Override
    public String visitMultOp(grammar_pdkParser.MultOpContext ctx) {
        print(ctx.getText());
        return super.visitMultOp(ctx);
    }

    @Override
    public String visitAddOp(grammar_pdkParser.AddOpContext ctx) {
        print(ctx.getText());
        return super.visitAddOp(ctx);
    }

    @Override
    public String visitCompOp(grammar_pdkParser.CompOpContext ctx) {
        print(ctx.getText());
        return super.visitCompOp(ctx);
    }

    @Override
    public String visit(ParseTree tree) {
        return super.visit(tree);
    }

    @Override
    public String visitChildren(RuleNode node) {
        return super.visitChildren(node);
    }

    @Override
    public String visitTerminal(TerminalNode node) {
        return super.visitTerminal(node);
    }

    @Override
    public String visitErrorNode(ErrorNode node) {
        return super.visitErrorNode(node);
    }
}