// Generated from D:/Studia/Sem. 6/Kompilatory/Kompilator/src/Grammar\grammar_pdk.g4 by ANTLR 4.7
package Grammar;
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
		public FunctionDefinictionContext functionDefiniction() {
			return getRuleContext(FunctionDefinictionContext.class,0);
		}
		public AttributionContext attribution() {
			return getRuleContext(AttributionContext.class,0);
		}
		public FormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).enterForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).exitForm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pdkVisitor ) return ((grammar_pdkVisitor<? extends T>)visitor).visitForm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormContext form() throws RecognitionException {
		FormContext _localctx = new FormContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_form);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(50);
				functionDefiniction();
				}
				break;
			case 2:
				{
				setState(51);
				attribution();
				}
				break;
			}
			setState(54);
			match(T__0);
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
			setState(56);
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
			setState(58);
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
			setState(60);
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
			setState(62);
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
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(64);
				match(T__1);
				setState(65);
				expr(0);
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(66);
					match(T__2);
					setState(67);
					expr(0);
					}
					}
					setState(72);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(73);
				match(T__3);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(T__1);
				setState(76);
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TokFloatContext tokFloat() {
			return getRuleContext(TokFloatContext.class,0);
		}
		public TokIntegerContext tokInteger() {
			return getRuleContext(TokIntegerContext.class,0);
		}
		public TokStringContext tokString() {
			return getRuleContext(TokStringContext.class,0);
		}
		public TokTableContext tokTable() {
			return getRuleContext(TokTableContext.class,0);
		}
		public VarExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).enterVarExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).exitVarExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pdkVisitor ) return ((grammar_pdkVisitor<? extends T>)visitor).visitVarExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarExprContext varExpr() throws RecognitionException {
		VarExprContext _localctx = new VarExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varExpr);
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				variable();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				tokFloat();
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				tokInteger();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				tokString();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 5);
				{
				setState(83);
				tokTable();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 6);
				{
				setState(84);
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
			setState(87);
			variable();
			setState(88);
			match(T__5);
			setState(89);
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
			setState(91);
			variable();
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(92);
					expr(0);
					}
					} 
				}
				setState(97);
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
			setState(98);
			variable();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VARIABLE) {
				{
				{
				setState(99);
				variable();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			match(T__6);
			setState(106);
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
			setState(108);
			clause();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(109);
				match(T__2);
				setState(110);
				clause();
				}
				}
				setState(115);
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
		public IfClauseContext ifClause() {
			return getRuleContext(IfClauseContext.class,0);
		}
		public AttributionContext attribution() {
			return getRuleContext(AttributionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).enterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).exitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pdkVisitor ) return ((grammar_pdkVisitor<? extends T>)visitor).visitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClauseContext clause() throws RecognitionException {
		ClauseContext _localctx = new ClauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_clause);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				ifClause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				attribution();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
				functionCall();
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PrefixOpContext prefixOp() {
			return getRuleContext(PrefixOpContext.class,0);
		}
		public VarExprContext varExpr() {
			return getRuleContext(VarExprContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public MultOpContext multOp() {
			return getRuleContext(MultOpContext.class,0);
		}
		public AddOpContext addOp() {
			return getRuleContext(AddOpContext.class,0);
		}
		public CompOpContext compOp() {
			return getRuleContext(CompOpContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pdkListener ) ((grammar_pdkListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pdkVisitor ) return ((grammar_pdkVisitor<? extends T>)visitor).visitExpr(this);
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
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(123);
				match(T__7);
				setState(124);
				expr(0);
				setState(125);
				match(T__8);
				}
				break;
			case 2:
				{
				setState(127);
				prefixOp();
				setState(128);
				expr(3);
				}
				break;
			case 3:
				{
				setState(130);
				varExpr();
				}
				break;
			case 4:
				{
				setState(131);
				functionCall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(146);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(134);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(135);
						multOp();
						setState(136);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(138);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(139);
						addOp();
						setState(140);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(142);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(143);
						compOp();
						setState(144);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(150);
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
			setState(151);
			match(T__9);
			setState(152);
			expr(0);
			setState(153);
			match(T__6);
			setState(154);
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
			setState(156);
			ifExpr();
			setState(161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(157);
					match(T__10);
					setState(158);
					ifExpr();
					}
					} 
				}
				setState(163);
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
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(T__11);
				setState(165);
				clauses();
				setState(166);
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
				setState(168);
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
			setState(171);
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
			setState(173);
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
			setState(175);
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
			setState(177);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00b6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\7\2.\n\2\f\2\16\2\61\13\2"+
		"\3\2\3\2\3\3\3\3\5\3\67\n\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\7\bG\n\b\f\b\16\bJ\13\b\3\b\3\b\3\b\3\b\5\bP\n\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\tX\n\t\3\n\3\n\3\n\3\n\3\13\3\13\7\13`\n\13\f\13"+
		"\16\13c\13\13\3\f\3\f\7\fg\n\f\f\f\16\fj\13\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\7\rr\n\r\f\r\16\ru\13\r\3\16\3\16\3\16\3\16\5\16{\n\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0087\n\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0095\n\17\f\17\16\17\u0098"+
		"\13\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u00a2\n\21\f\21\16"+
		"\21\u00a5\13\21\3\22\3\22\3\22\3\22\3\22\5\22\u00ac\n\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\26\2\3\34\27\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*\2\6\3\2\20\22\3\2\23\26\4\2\20\21\27\27\3\2\30\35\2\u00b7"+
		"\2/\3\2\2\2\4\66\3\2\2\2\6:\3\2\2\2\b<\3\2\2\2\n>\3\2\2\2\f@\3\2\2\2\16"+
		"O\3\2\2\2\20W\3\2\2\2\22Y\3\2\2\2\24]\3\2\2\2\26d\3\2\2\2\30n\3\2\2\2"+
		"\32z\3\2\2\2\34\u0086\3\2\2\2\36\u0099\3\2\2\2 \u009e\3\2\2\2\"\u00ab"+
		"\3\2\2\2$\u00ad\3\2\2\2&\u00af\3\2\2\2(\u00b1\3\2\2\2*\u00b3\3\2\2\2,"+
		".\5\4\3\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61"+
		"/\3\2\2\2\62\63\7\2\2\3\63\3\3\2\2\2\64\67\5\26\f\2\65\67\5\22\n\2\66"+
		"\64\3\2\2\2\66\65\3\2\2\2\678\3\2\2\289\7\3\2\29\5\3\2\2\2:;\7\36\2\2"+
		";\7\3\2\2\2<=\7\37\2\2=\t\3\2\2\2>?\7 \2\2?\13\3\2\2\2@A\7!\2\2A\r\3\2"+
		"\2\2BC\7\4\2\2CH\5\34\17\2DE\7\5\2\2EG\5\34\17\2FD\3\2\2\2GJ\3\2\2\2H"+
		"F\3\2\2\2HI\3\2\2\2IK\3\2\2\2JH\3\2\2\2KL\7\6\2\2LP\3\2\2\2MN\7\4\2\2"+
		"NP\7\6\2\2OB\3\2\2\2OM\3\2\2\2P\17\3\2\2\2QX\5\6\4\2RX\5\b\5\2SX\5\n\6"+
		"\2TX\5\f\7\2UX\5\16\b\2VX\7\7\2\2WQ\3\2\2\2WR\3\2\2\2WS\3\2\2\2WT\3\2"+
		"\2\2WU\3\2\2\2WV\3\2\2\2X\21\3\2\2\2YZ\5\6\4\2Z[\7\b\2\2[\\\5\34\17\2"+
		"\\\23\3\2\2\2]a\5\6\4\2^`\5\34\17\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3"+
		"\2\2\2b\25\3\2\2\2ca\3\2\2\2dh\5\6\4\2eg\5\6\4\2fe\3\2\2\2gj\3\2\2\2h"+
		"f\3\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2kl\7\t\2\2lm\5\30\r\2m\27\3\2\2"+
		"\2ns\5\32\16\2op\7\5\2\2pr\5\32\16\2qo\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3"+
		"\2\2\2t\31\3\2\2\2us\3\2\2\2v{\5 \21\2w{\5\22\n\2x{\5\34\17\2y{\5\24\13"+
		"\2zv\3\2\2\2zw\3\2\2\2zx\3\2\2\2zy\3\2\2\2{\33\3\2\2\2|}\b\17\1\2}~\7"+
		"\n\2\2~\177\5\34\17\2\177\u0080\7\13\2\2\u0080\u0087\3\2\2\2\u0081\u0082"+
		"\5$\23\2\u0082\u0083\5\34\17\5\u0083\u0087\3\2\2\2\u0084\u0087\5\20\t"+
		"\2\u0085\u0087\5\24\13\2\u0086|\3\2\2\2\u0086\u0081\3\2\2\2\u0086\u0084"+
		"\3\2\2\2\u0086\u0085\3\2\2\2\u0087\u0096\3\2\2\2\u0088\u0089\f\b\2\2\u0089"+
		"\u008a\5&\24\2\u008a\u008b\5\34\17\t\u008b\u0095\3\2\2\2\u008c\u008d\f"+
		"\7\2\2\u008d\u008e\5(\25\2\u008e\u008f\5\34\17\b\u008f\u0095\3\2\2\2\u0090"+
		"\u0091\f\6\2\2\u0091\u0092\5*\26\2\u0092\u0093\5\34\17\7\u0093\u0095\3"+
		"\2\2\2\u0094\u0088\3\2\2\2\u0094\u008c\3\2\2\2\u0094\u0090\3\2\2\2\u0095"+
		"\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\35\3\2\2"+
		"\2\u0098\u0096\3\2\2\2\u0099\u009a\7\f\2\2\u009a\u009b\5\34\17\2\u009b"+
		"\u009c\7\t\2\2\u009c\u009d\5\"\22\2\u009d\37\3\2\2\2\u009e\u00a3\5\36"+
		"\20\2\u009f\u00a0\7\r\2\2\u00a0\u00a2\5\36\20\2\u00a1\u009f\3\2\2\2\u00a2"+
		"\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4!\3\2\2\2"+
		"\u00a5\u00a3\3\2\2\2\u00a6\u00a7\7\16\2\2\u00a7\u00a8\5\30\r\2\u00a8\u00a9"+
		"\7\17\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00ac\5\32\16\2\u00ab\u00a6\3\2\2"+
		"\2\u00ab\u00aa\3\2\2\2\u00ac#\3\2\2\2\u00ad\u00ae\t\2\2\2\u00ae%\3\2\2"+
		"\2\u00af\u00b0\t\3\2\2\u00b0\'\3\2\2\2\u00b1\u00b2\t\4\2\2\u00b2)\3\2"+
		"\2\2\u00b3\u00b4\t\5\2\2\u00b4+\3\2\2\2\20/\66HOWahsz\u0086\u0094\u0096"+
		"\u00a3\u00ab";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}