// Generated from C:/Users/Christian/IdeaProjects/CompilerAlf1/src/main/java\simpleCalc.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class simpleCalcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, BOOLEANLVL1=12, BOOLEANLVL2=13, OPERATORLVL1=14, OPERATORLVL2=15, 
		NUM=16, ID=17, WHITESPACE=18, COMMENT=19;
	public static final int
		RULE_start = 0, RULE_statseq = 1, RULE_stat = 2, RULE_expr = 3;
	public static final String[] ruleNames = {
		"start", "statseq", "stat", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'='", "';'", "'if('", "')'", "'else'", "'while('", 
		"'('", "'&&'", "'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"BOOLEANLVL1", "BOOLEANLVL2", "OPERATORLVL1", "OPERATORLVL2", "NUM", "ID", 
		"WHITESPACE", "COMMENT"
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
	public String getGrammarFileName() { return "simpleCalc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public simpleCalcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public StatseqContext sq;
		public ExprContext e;
		public TerminalNode EOF() { return getToken(simpleCalcParser.EOF, 0); }
		public StatseqContext statseq() {
			return getRuleContext(StatseqContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			((StartContext)_localctx).sq = statseq();
			setState(9);
			((StartContext)_localctx).e = expr(0);
			setState(10);
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

	public static class StatseqContext extends ParserRuleContext {
		public StatContext stat;
		public List<StatContext> s = new ArrayList<StatContext>();
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public StatseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterStatseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitStatseq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitStatseq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatseqContext statseq() throws RecognitionException {
		StatseqContext _localctx = new StatseqContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statseq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(T__0);
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << ID))) != 0)) {
				{
				{
				setState(13);
				((StatseqContext)_localctx).stat = stat();
				((StatseqContext)_localctx).s.add(((StatseqContext)_localctx).stat);
				}
				}
				setState(18);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(19);
			match(T__1);
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

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LoopContext extends StatContext {
		public ExprContext e;
		public StatseqContext sq;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatseqContext statseq() {
			return getRuleContext(StatseqContext.class,0);
		}
		public LoopContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends StatContext {
		public ExprContext e;
		public StatseqContext sq;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatseqContext statseq() {
			return getRuleContext(StatseqContext.class,0);
		}
		public IfContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends StatContext {
		public Token x;
		public ExprContext e;
		public TerminalNode ID() { return getToken(simpleCalcParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfelseContext extends StatContext {
		public ExprContext e;
		public StatseqContext sq1;
		public StatseqContext sq2;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatseqContext> statseq() {
			return getRuleContexts(StatseqContext.class);
		}
		public StatseqContext statseq(int i) {
			return getRuleContext(StatseqContext.class,i);
		}
		public IfelseContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterIfelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitIfelse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitIfelse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		try {
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				((AssignContext)_localctx).x = match(ID);
				setState(22);
				match(T__2);
				setState(23);
				((AssignContext)_localctx).e = expr(0);
				setState(24);
				match(T__3);
				}
				break;
			case 2:
				_localctx = new IfelseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				match(T__4);
				setState(27);
				((IfelseContext)_localctx).e = expr(0);
				setState(28);
				match(T__5);
				setState(29);
				((IfelseContext)_localctx).sq1 = statseq();
				setState(30);
				match(T__6);
				setState(31);
				((IfelseContext)_localctx).sq2 = statseq();
				}
				break;
			case 3:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				match(T__4);
				setState(34);
				((IfContext)_localctx).e = expr(0);
				setState(35);
				match(T__5);
				setState(36);
				((IfContext)_localctx).sq = statseq();
				}
				break;
			case 4:
				_localctx = new LoopContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				match(T__7);
				setState(39);
				((LoopContext)_localctx).e = expr(0);
				setState(40);
				match(T__5);
				setState(41);
				((LoopContext)_localctx).sq = statseq();
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
	public static class ParenthesisContext extends ExprContext {
		public ExprContext e;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenthesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends ExprContext {
		public Token x;
		public TerminalNode ID() { return getToken(simpleCalcParser.ID, 0); }
		public VariableContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends ExprContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigSmallContext extends ExprContext {
		public ExprContext e1;
		public Token b;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode BOOLEANLVL1() { return getToken(simpleCalcParser.BOOLEANLVL1, 0); }
		public BigSmallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterBigSmall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitBigSmall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitBigSmall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OPERATORLVL1() { return getToken(simpleCalcParser.OPERATORLVL1, 0); }
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OPERATORLVL2() { return getToken(simpleCalcParser.OPERATORLVL2, 0); }
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantContext extends ExprContext {
		public Token n;
		public TerminalNode NUM() { return getToken(simpleCalcParser.NUM, 0); }
		public ConstantContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends ExprContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AndContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualNotContext extends ExprContext {
		public ExprContext e1;
		public Token b;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode BOOLEANLVL2() { return getToken(simpleCalcParser.BOOLEANLVL2, 0); }
		public EqualNotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterEqualNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitEqualNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitEqualNot(this);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				{
				_localctx = new ConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(46);
				((ConstantContext)_localctx).n = match(NUM);
				}
				break;
			case ID:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(47);
				((VariableContext)_localctx).x = match(ID);
				}
				break;
			case T__8:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(48);
				match(T__8);
				setState(49);
				((ParenthesisContext)_localctx).e = expr(0);
				setState(50);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(72);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						((MulDivContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(54);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(55);
						((MulDivContext)_localctx).op = match(OPERATORLVL1);
						setState(56);
						((MulDivContext)_localctx).e2 = expr(10);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						((AddSubContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(57);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(58);
						((AddSubContext)_localctx).op = match(OPERATORLVL2);
						setState(59);
						((AddSubContext)_localctx).e2 = expr(9);
						}
						break;
					case 3:
						{
						_localctx = new BigSmallContext(new ExprContext(_parentctx, _parentState));
						((BigSmallContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(60);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(61);
						((BigSmallContext)_localctx).b = match(BOOLEANLVL1);
						setState(62);
						((BigSmallContext)_localctx).e2 = expr(5);
						}
						break;
					case 4:
						{
						_localctx = new EqualNotContext(new ExprContext(_parentctx, _parentState));
						((EqualNotContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(63);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(64);
						((EqualNotContext)_localctx).b = match(BOOLEANLVL2);
						setState(65);
						((EqualNotContext)_localctx).e2 = expr(4);
						}
						break;
					case 5:
						{
						_localctx = new AndContext(new ExprContext(_parentctx, _parentState));
						((AndContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(66);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(67);
						match(T__9);
						setState(68);
						((AndContext)_localctx).e2 = expr(3);
						}
						break;
					case 6:
						{
						_localctx = new OrContext(new ExprContext(_parentctx, _parentState));
						((OrContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(69);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(70);
						match(T__10);
						setState(71);
						((OrContext)_localctx).e2 = expr(2);
						}
						break;
					}
					} 
				}
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25P\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\3\3\3\7\3\21\n\3\f\3\16\3\24\13\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4.\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\67"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\7\5K\n\5\f\5\16\5N\13\5\3\5\2\3\b\6\2\4\6\b\2\2\2W\2\n\3\2\2\2"+
		"\4\16\3\2\2\2\6-\3\2\2\2\b\66\3\2\2\2\n\13\5\4\3\2\13\f\5\b\5\2\f\r\7"+
		"\2\2\3\r\3\3\2\2\2\16\22\7\3\2\2\17\21\5\6\4\2\20\17\3\2\2\2\21\24\3\2"+
		"\2\2\22\20\3\2\2\2\22\23\3\2\2\2\23\25\3\2\2\2\24\22\3\2\2\2\25\26\7\4"+
		"\2\2\26\5\3\2\2\2\27\30\7\23\2\2\30\31\7\5\2\2\31\32\5\b\5\2\32\33\7\6"+
		"\2\2\33.\3\2\2\2\34\35\7\7\2\2\35\36\5\b\5\2\36\37\7\b\2\2\37 \5\4\3\2"+
		" !\7\t\2\2!\"\5\4\3\2\".\3\2\2\2#$\7\7\2\2$%\5\b\5\2%&\7\b\2\2&\'\5\4"+
		"\3\2\'.\3\2\2\2()\7\n\2\2)*\5\b\5\2*+\7\b\2\2+,\5\4\3\2,.\3\2\2\2-\27"+
		"\3\2\2\2-\34\3\2\2\2-#\3\2\2\2-(\3\2\2\2.\7\3\2\2\2/\60\b\5\1\2\60\67"+
		"\7\22\2\2\61\67\7\23\2\2\62\63\7\13\2\2\63\64\5\b\5\2\64\65\7\b\2\2\65"+
		"\67\3\2\2\2\66/\3\2\2\2\66\61\3\2\2\2\66\62\3\2\2\2\67L\3\2\2\289\f\13"+
		"\2\29:\7\20\2\2:K\5\b\5\f;<\f\n\2\2<=\7\21\2\2=K\5\b\5\13>?\f\6\2\2?@"+
		"\7\16\2\2@K\5\b\5\7AB\f\5\2\2BC\7\17\2\2CK\5\b\5\6DE\f\4\2\2EF\7\f\2\2"+
		"FK\5\b\5\5GH\f\3\2\2HI\7\r\2\2IK\5\b\5\4J8\3\2\2\2J;\3\2\2\2J>\3\2\2\2"+
		"JA\3\2\2\2JD\3\2\2\2JG\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\t\3\2\2"+
		"\2NL\3\2\2\2\7\22-\66JL";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}