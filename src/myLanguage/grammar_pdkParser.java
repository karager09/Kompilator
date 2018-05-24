// Generated from D:/Studia/Sem. 6/Kompilatory/Kompilator/src/Grammar\grammar_pdk.g4 by ANTLR 4.7
package myLanguage;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grammar_pdkParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, VARIABLE=28, FLOAT=29, INTEGER=30, STRING=31, 
		COMMENT=32, WHITE_SPACE=33;
	public static final int
		RULE_forms = 0, RULE_form = 1, RULE_variable = 2, RULE_tokFloat = 3, RULE_tokInteger = 4, 
		RULE_tokString = 5, RULE_tokTable = 6, RULE_varExpr = 7, RULE_attribution = 8, 
		RULE_functionCall = 9, RULE_functionDefiniction = 10, RULE_clauses = 11, 
		RULE_clause = 12, RULE_expr = 13, RULE_ifExpr = 14, RULE_ifClause = 15, 
		RULE_blockInstruction = 16, RULE_prefixOp = 17, RULE_multOp = 18, RULE_addOp = 19, 
		RULE_compOp = 20;
	public static final String[] ruleNames = {
		"forms", "form", "variable", "tokFloat", "tokInteger", "tokString", "tokTable", 
		"varExpr", "attribution", "functionCall", "functionDefiniction", "clauses", 
		"clause", "expr", "ifExpr", "ifClause", "blockInstruction", "prefixOp", 
		"multOp", "addOp", "compOp"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'['", "','", "']'", "'null'", "'='", "'->'", "'('", "')'", 
		"'|'", "';'", "'{'", "'}'", "'+'", "'-'", "'!'", "'/'", "'*'", "'%'", 
		"'&&'", "'||'", "'=='", "'!='", "'=<'", "'<'", "'>='", "'>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "VARIABLE", "FLOAT", "INTEGER", "STRING", "COMMENT", 
		"WHITE_SPACE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "grammar_pdk.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public grammar_pdkParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FormsContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(grammar_pdkParser.EOF, 0); }
		public List<FormContext> form() {
			return getRuleContexts(FormContext.class);
		}
		public FormContext form(int i) {
			return getRuleContext(FormContext.class,i);
		}
		public FormsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).enterForms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).exitForms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pdkVisitor ) return ((grammar_pdkVisitor<? extends T>)visitor).visitForms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormsContext forms() throws RecognitionException {
		FormsContext _localctx = new FormsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_forms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VARIABLE) {
				{
				{
				setState(42);
				form();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormContext extends ParserRuleContext {
		public FormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form; }
	 
		public FormContext() { }
		public void copyFrom(FormContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Form_functionDefinictionContext extends FormContext {
		public FunctionDefinictionContext functionDefiniction() {
			return getRuleContext(FunctionDefinictionContext.class,0);
		}
		public Form_functionDefinictionContext(FormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).enterForm_functionDefiniction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).exitForm_functionDefiniction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pdkVisitor ) return ((grammar_pdkVisitor<? extends T>)visitor).visitForm_functionDefiniction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Form_attributionContext extends FormContext {
		public AttributionContext attribution() {
			return getRuleContext(AttributionContext.class,0);
		}
		public Form_attributionContext(FormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).enterForm_attribution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).exitForm_attribution(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pdkVisitor ) return ((grammar_pdkVisitor<? extends T>)visitor).visitForm_attribution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormContext form() throws RecognitionException {
		FormContext _localctx = new FormContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_form);
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new Form_functionDefinictionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				functionDefiniction();
				setState(51);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new Form_attributionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				attribution();
				setState(54);
				match(T__0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(grammar_pdkParser.VARIABLE, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pdkVisitor ) return ((grammar_pdkVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(VARIABLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TokFloatContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(grammar_pdkParser.FLOAT, 0); }
		public TokFloatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokFloat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).enterTokFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).exitTokFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pdkVisitor ) return ((grammar_pdkVisitor<? extends T>)visitor).visitTokFloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokFloatContext tokFloat() throws RecognitionException {
		TokFloatContext _localctx = new TokFloatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tokFloat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(FLOAT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TokIntegerContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(grammar_pdkParser.INTEGER, 0); }
		public TokIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokInteger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).enterTokInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).exitTokInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pdkVisitor ) return ((grammar_pdkVisitor<? extends T>)visitor).visitTokInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokIntegerContext tokInteger() throws RecognitionException {
		TokIntegerContext _localctx = new TokIntegerContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tokInteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TokStringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(grammar_pdkParser.STRING, 0); }
		public TokStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).enterTokString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).exitTokString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pdkVisitor ) return ((grammar_pdkVisitor<? extends T>)visitor).visitTokString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokStringContext tokString() throws RecognitionException {
		TokStringContext _localctx = new TokStringContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tokString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TokTableContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TokTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).enterTokTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).exitTokTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pdkVisitor ) return ((grammar_pdkVisitor<? extends T>)visitor).visitTokTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokTableContext tokTable() throws RecognitionException {
		TokTableContext _localctx = new TokTableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tokTable);
		int _la;
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(66);
				match(T__1);
				setState(67);
				expr(0);
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(68);
					match(T__2);
					setState(69);
					expr(0);
					}
					}
					setState(74);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(75);
				match(T__3);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(T__1);
				setState(78);
				match(T__3);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarExprContext extends ParserRuleContext {
		public VarExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varExpr; }
	 
		public VarExprContext() { }
		public void copyFrom(VarExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Var_Expr_tokTableContext extends VarExprContext {
		public TokTableContext tokTable() {
			return getRuleContext(TokTableContext.class,0);
		}
		public Var_Expr_tokTableContext(VarExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).enterVar_Expr_tokTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).exitVar_Expr_tokTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pdkVisitor ) return ((grammar_pdkVisitor<? extends T>)visitor).visitVar_Expr_tokTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarExpr_nullContext extends VarExprContext {
		public VarExpr_nullContext(VarExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).enterVarExpr_null(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).exitVarExpr_null(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pdkVisitor ) return ((grammar_pdkVisitor<? extends T>)visitor).visitVarExpr_null(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarExpr_tokIntegerContext extends VarExprContext {
		public TokIntegerContext tokInteger() {
			return getRuleContext(TokIntegerContext.class,0);
		}
		public VarExpr_tokIntegerContext(VarExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).enterVarExpr_tokInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).exitVarExpr_tokInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pdkVisitor ) return ((grammar_pdkVisitor<? extends T>)visitor).visitVarExpr_tokInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarExpr_variableContext extends VarExprContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VarExpr_variableContext(VarExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).enterVarExpr_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).exitVarExpr_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pdkVisitor ) return ((grammar_pdkVisitor<? extends T>)visitor).visitVarExpr_variable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarExpr_tokStringContext extends VarExprContext {
		public TokStringContext tokString() {
			return getRuleContext(TokStringContext.class,0);
		}
		public VarExpr_tokStringContext(VarExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).enterVarExpr_tokString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).exitVarExpr_tokString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pdkVisitor ) return ((grammar_pdkVisitor<? extends T>)visitor).visitVarExpr_tokString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarExpr_tokFloatContext extends VarExprContext {
		public TokFloatContext tokFloat() {
			return getRuleContext(TokFloatContext.class,0);
		}
		public VarExpr_tokFloatContext(VarExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).enterVarExpr_tokFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).exitVarExpr_tokFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pdkVisitor ) return ((grammar_pdkVisitor<? extends T>)visitor).visitVarExpr_tokFloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarExprContext varExpr() throws RecognitionException {
		VarExprContext _localctx = new VarExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varExpr);
		try {
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				_localctx = new VarExpr_variableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				variable();
				}
				break;
			case FLOAT:
				_localctx = new VarExpr_tokFloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				tokFloat();
				}
				break;
			case INTEGER:
				_localctx = new VarExpr_tokIntegerContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				tokInteger();
				}
				break;
			case STRING:
				_localctx = new VarExpr_tokStringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				tokString();
				}
				break;
			case T__1:
				_localctx = new Var_Expr_tokTableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				tokTable();
				}
				break;
			case T__4:
				_localctx = new VarExpr_nullContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(86);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributionContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AttributionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).enterAttribution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).exitAttribution(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pdkVisitor ) return ((grammar_pdkVisitor<? extends T>)visitor).visitAttribution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributionContext attribution() throws RecognitionException {
		AttributionContext _localctx = new AttributionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_attribution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			variable();
			setState(90);
			match(T__5);
			setState(91);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pdkVisitor ) return ((grammar_pdkVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			variable();
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(94);
					expr(0);
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinictionContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public ClausesContext clauses() {
			return getRuleContext(ClausesContext.class,0);
		}
		public FunctionDefinictionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefiniction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).enterFunctionDefiniction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).exitFunctionDefiniction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pdkVisitor ) return ((grammar_pdkVisitor<? extends T>)visitor).visitFunctionDefiniction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinictionContext functionDefiniction() throws RecognitionException {
		FunctionDefinictionContext _localctx = new FunctionDefinictionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionDefiniction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			variable();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VARIABLE) {
				{
				{
				setState(101);
				variable();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			match(T__6);
			setState(108);
			clauses();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClausesContext extends ParserRuleContext {
		public List<ClauseContext> clause() {
			return getRuleContexts(ClauseContext.class);
		}
		public ClauseContext clause(int i) {
			return getRuleContext(ClauseContext.class,i);
		}
		public ClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).enterClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).exitClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pdkVisitor ) return ((grammar_pdkVisitor<? extends T>)visitor).visitClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClausesContext clauses() throws RecognitionException {
		ClausesContext _localctx = new ClausesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_clauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			clause();
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(111);
				match(T__2);
				setState(112);
				clause();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClauseContext extends ParserRuleContext {
		public ClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clause; }
	 
		public ClauseContext() { }
		public void copyFrom(ClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Clause_exprContext extends ClauseContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Clause_exprContext(ClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).enterClause_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).exitClause_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pdkVisitor ) return ((grammar_pdkVisitor<? extends T>)visitor).visitClause_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Clause_attributionContext extends ClauseContext {
		public AttributionContext attribution() {
			return getRuleContext(AttributionContext.class,0);
		}
		public Clause_attributionContext(ClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).enterClause_attribution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).exitClause_attribution(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pdkVisitor ) return ((grammar_pdkVisitor<? extends T>)visitor).visitClause_attribution(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Clause_ifClauseContext extends ClauseContext {
		public IfClauseContext ifClause() {
			return getRuleContext(IfClauseContext.class,0);
		}
		public Clause_ifClauseContext(ClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).enterClause_ifClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).exitClause_ifClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pdkVisitor ) return ((grammar_pdkVisitor<? extends T>)visitor).visitClause_ifClause(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Clause_functionCallContext extends ClauseContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public Clause_functionCallContext(ClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).enterClause_functionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).exitClause_functionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pdkVisitor ) return ((grammar_pdkVisitor<? extends T>)visitor).visitClause_functionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClauseContext clause() throws RecognitionException {
		ClauseContext _localctx = new ClauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_clause);
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new Clause_ifClauseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				ifClause();
				}
				break;
			case 2:
				_localctx = new Clause_attributionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				attribution();
				}
				break;
			case 3:
				_localctx = new Clause_functionCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				functionCall();
				}
				break;
			case 4:
				_localctx = new Clause_exprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Expr_compContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CompOpContext compOp() {
			return getRuleContext(CompOpContext.class,0);
		}
		public Expr_compContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).enterExpr_comp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).exitExpr_comp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pdkVisitor ) return ((grammar_pdkVisitor<? extends T>)visitor).visitExpr_comp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr_varExprContext extends ExprContext {
		public VarExprContext varExpr() {
			return getRuleContext(VarExprContext.class,0);
		}
		public Expr_varExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).enterExpr_varExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).exitExpr_varExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pdkVisitor ) return ((grammar_pdkVisitor<? extends T>)visitor).visitExpr_varExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr_addContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddOpContext addOp() {
			return getRuleContext(AddOpContext.class,0);
		}
		public Expr_addContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).enterExpr_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).exitExpr_add(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pdkVisitor ) return ((grammar_pdkVisitor<? extends T>)visitor).visitExpr_add(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr_functionCallContext extends ExprContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public Expr_functionCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).enterExpr_functionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).exitExpr_functionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pdkVisitor ) return ((grammar_pdkVisitor<? extends T>)visitor).visitExpr_functionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr_multContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MultOpContext multOp() {
			return getRuleContext(MultOpContext.class,0);
		}
		public Expr_multContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).enterExpr_mult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).exitExpr_mult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pdkVisitor ) return ((grammar_pdkVisitor<? extends T>)visitor).visitExpr_mult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr_bracketContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_bracketContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).enterExpr_bracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).exitExpr_bracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pdkVisitor ) return ((grammar_pdkVisitor<? extends T>)visitor).visitExpr_bracket(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr_prefixContext extends ExprContext {
		public PrefixOpContext prefixOp() {
			return getRuleContext(PrefixOpContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_prefixContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).enterExpr_prefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).exitExpr_prefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pdkVisitor ) return ((grammar_pdkVisitor<? extends T>)visitor).visitExpr_prefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new Expr_bracketContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(125);
				match(T__7);
				setState(126);
				expr(0);
				setState(127);
				match(T__8);
				}
				break;
			case 2:
				{
				_localctx = new Expr_prefixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				prefixOp();
				setState(130);
				expr(3);
				}
				break;
			case 3:
				{
				_localctx = new Expr_varExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132);
				varExpr();
				}
				break;
			case 4:
				{
				_localctx = new Expr_functionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
				functionCall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(148);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_multContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(136);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(137);
						multOp();
						setState(138);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new Expr_addContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(140);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(141);
						addOp();
						setState(142);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new Expr_compContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(144);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(145);
						compOp();
						setState(146);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IfExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockInstructionContext blockInstruction() {
			return getRuleContext(BlockInstructionContext.class,0);
		}
		public IfExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).enterIfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).exitIfExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pdkVisitor ) return ((grammar_pdkVisitor<? extends T>)visitor).visitIfExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExprContext ifExpr() throws RecognitionException {
		IfExprContext _localctx = new IfExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__9);
			setState(154);
			expr(0);
			setState(155);
			match(T__6);
			setState(156);
			blockInstruction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfClauseContext extends ParserRuleContext {
		public List<IfExprContext> ifExpr() {
			return getRuleContexts(IfExprContext.class);
		}
		public IfExprContext ifExpr(int i) {
			return getRuleContext(IfExprContext.class,i);
		}
		public IfClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).enterIfClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).exitIfClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pdkVisitor ) return ((grammar_pdkVisitor<? extends T>)visitor).visitIfClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfClauseContext ifClause() throws RecognitionException {
		IfClauseContext _localctx = new IfClauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ifClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			ifExpr();
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(159);
					match(T__10);
					setState(160);
					ifExpr();
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockInstructionContext extends ParserRuleContext {
		public ClausesContext clauses() {
			return getRuleContext(ClausesContext.class,0);
		}
		public ClauseContext clause() {
			return getRuleContext(ClauseContext.class,0);
		}
		public BlockInstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockInstruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).enterBlockInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).exitBlockInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pdkVisitor ) return ((grammar_pdkVisitor<? extends T>)visitor).visitBlockInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockInstructionContext blockInstruction() throws RecognitionException {
		BlockInstructionContext _localctx = new BlockInstructionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_blockInstruction);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(T__11);
				setState(167);
				clauses();
				setState(168);
				match(T__12);
				}
				break;
			case T__1:
			case T__4:
			case T__7:
			case T__9:
			case T__13:
			case T__14:
			case T__15:
			case VARIABLE:
			case FLOAT:
			case INTEGER:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrefixOpContext extends ParserRuleContext {
		public PrefixOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).enterPrefixOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).exitPrefixOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pdkVisitor ) return ((grammar_pdkVisitor<? extends T>)visitor).visitPrefixOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixOpContext prefixOp() throws RecognitionException {
		PrefixOpContext _localctx = new PrefixOpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_prefixOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultOpContext extends ParserRuleContext {
		public MultOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).enterMultOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).exitMultOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pdkVisitor ) return ((grammar_pdkVisitor<? extends T>)visitor).visitMultOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultOpContext multOp() throws RecognitionException {
		MultOpContext _localctx = new MultOpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_multOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddOpContext extends ParserRuleContext {
		public AddOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).enterAddOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).exitAddOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pdkVisitor ) return ((grammar_pdkVisitor<? extends T>)visitor).visitAddOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddOpContext addOp() throws RecognitionException {
		AddOpContext _localctx = new AddOpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_addOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__20))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompOpContext extends ParserRuleContext {
		public CompOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).enterCompOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).exitCompOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pdkVisitor ) return ((grammar_pdkVisitor<? extends T>)visitor).visitCompOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompOpContext compOp() throws RecognitionException {
		CompOpContext _localctx = new CompOpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_compOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00b8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\7\2.\n\2\f\2\16\2\61\13\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3;\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\7\bI\n\b\f\b\16\bL\13\b\3\b\3\b\3\b\3\b\5\bR\n\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\tZ\n\t\3\n\3\n\3\n\3\n\3\13\3\13\7\13b\n\13"+
		"\f\13\16\13e\13\13\3\f\3\f\7\fi\n\f\f\f\16\fl\13\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\7\rt\n\r\f\r\16\rw\13\r\3\16\3\16\3\16\3\16\5\16}\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0089\n\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0097\n\17\f\17\16"+
		"\17\u009a\13\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u00a4\n\21"+
		"\f\21\16\21\u00a7\13\21\3\22\3\22\3\22\3\22\3\22\5\22\u00ae\n\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\2\3\34\27\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*\2\6\3\2\20\22\3\2\23\26\4\2\20\21\27\27\3\2"+
		"\30\35\2\u00b9\2/\3\2\2\2\4:\3\2\2\2\6<\3\2\2\2\b>\3\2\2\2\n@\3\2\2\2"+
		"\fB\3\2\2\2\16Q\3\2\2\2\20Y\3\2\2\2\22[\3\2\2\2\24_\3\2\2\2\26f\3\2\2"+
		"\2\30p\3\2\2\2\32|\3\2\2\2\34\u0088\3\2\2\2\36\u009b\3\2\2\2 \u00a0\3"+
		"\2\2\2\"\u00ad\3\2\2\2$\u00af\3\2\2\2&\u00b1\3\2\2\2(\u00b3\3\2\2\2*\u00b5"+
		"\3\2\2\2,.\5\4\3\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\62\3"+
		"\2\2\2\61/\3\2\2\2\62\63\7\2\2\3\63\3\3\2\2\2\64\65\5\26\f\2\65\66\7\3"+
		"\2\2\66;\3\2\2\2\678\5\22\n\289\7\3\2\29;\3\2\2\2:\64\3\2\2\2:\67\3\2"+
		"\2\2;\5\3\2\2\2<=\7\36\2\2=\7\3\2\2\2>?\7\37\2\2?\t\3\2\2\2@A\7 \2\2A"+
		"\13\3\2\2\2BC\7!\2\2C\r\3\2\2\2DE\7\4\2\2EJ\5\34\17\2FG\7\5\2\2GI\5\34"+
		"\17\2HF\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MN\7"+
		"\6\2\2NR\3\2\2\2OP\7\4\2\2PR\7\6\2\2QD\3\2\2\2QO\3\2\2\2R\17\3\2\2\2S"+
		"Z\5\6\4\2TZ\5\b\5\2UZ\5\n\6\2VZ\5\f\7\2WZ\5\16\b\2XZ\7\7\2\2YS\3\2\2\2"+
		"YT\3\2\2\2YU\3\2\2\2YV\3\2\2\2YW\3\2\2\2YX\3\2\2\2Z\21\3\2\2\2[\\\5\6"+
		"\4\2\\]\7\b\2\2]^\5\34\17\2^\23\3\2\2\2_c\5\6\4\2`b\5\34\17\2a`\3\2\2"+
		"\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\25\3\2\2\2ec\3\2\2\2fj\5\6\4\2gi\5\6"+
		"\4\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\7\t"+
		"\2\2no\5\30\r\2o\27\3\2\2\2pu\5\32\16\2qr\7\5\2\2rt\5\32\16\2sq\3\2\2"+
		"\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\31\3\2\2\2wu\3\2\2\2x}\5 \21\2y}\5\22"+
		"\n\2z}\5\24\13\2{}\5\34\17\2|x\3\2\2\2|y\3\2\2\2|z\3\2\2\2|{\3\2\2\2}"+
		"\33\3\2\2\2~\177\b\17\1\2\177\u0080\7\n\2\2\u0080\u0081\5\34\17\2\u0081"+
		"\u0082\7\13\2\2\u0082\u0089\3\2\2\2\u0083\u0084\5$\23\2\u0084\u0085\5"+
		"\34\17\5\u0085\u0089\3\2\2\2\u0086\u0089\5\20\t\2\u0087\u0089\5\24\13"+
		"\2\u0088~\3\2\2\2\u0088\u0083\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0087"+
		"\3\2\2\2\u0089\u0098\3\2\2\2\u008a\u008b\f\b\2\2\u008b\u008c\5&\24\2\u008c"+
		"\u008d\5\34\17\t\u008d\u0097\3\2\2\2\u008e\u008f\f\7\2\2\u008f\u0090\5"+
		"(\25\2\u0090\u0091\5\34\17\b\u0091\u0097\3\2\2\2\u0092\u0093\f\6\2\2\u0093"+
		"\u0094\5*\26\2\u0094\u0095\5\34\17\7\u0095\u0097\3\2\2\2\u0096\u008a\3"+
		"\2\2\2\u0096\u008e\3\2\2\2\u0096\u0092\3\2\2\2\u0097\u009a\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\35\3\2\2\2\u009a\u0098\3\2\2"+
		"\2\u009b\u009c\7\f\2\2\u009c\u009d\5\34\17\2\u009d\u009e\7\t\2\2\u009e"+
		"\u009f\5\"\22\2\u009f\37\3\2\2\2\u00a0\u00a5\5\36\20\2\u00a1\u00a2\7\r"+
		"\2\2\u00a2\u00a4\5\36\20\2\u00a3\u00a1\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6!\3\2\2\2\u00a7\u00a5\3\2\2\2"+
		"\u00a8\u00a9\7\16\2\2\u00a9\u00aa\5\30\r\2\u00aa\u00ab\7\17\2\2\u00ab"+
		"\u00ae\3\2\2\2\u00ac\u00ae\5\32\16\2\u00ad\u00a8\3\2\2\2\u00ad\u00ac\3"+
		"\2\2\2\u00ae#\3\2\2\2\u00af\u00b0\t\2\2\2\u00b0%\3\2\2\2\u00b1\u00b2\t"+
		"\3\2\2\u00b2\'\3\2\2\2\u00b3\u00b4\t\4\2\2\u00b4)\3\2\2\2\u00b5\u00b6"+
		"\t\5\2\2\u00b6+\3\2\2\2\20/:JQYcju|\u0088\u0096\u0098\u00a5\u00ad";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}