// Generated from RTMaudeResult.g4 by ANTLR 4.3
package org.rebecalang.timedrebeca2rtmaude.counterexampleinterpreter.compiler;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RTMaudeResultParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, IN=2, TIME=3, COMMA=4, OPENBRACE=5, CLOSEBRACE=6, WITH=7, DMSG=8, 
		EMPTYVAL=9, FROM=10, TO=11, DEADLINE=12, STATEVARS=13, IDGEN=14, REBECQUEUE=15, 
		TOEXEC=16, GT=17, LT=18, DBCOLON=19, COLON=20, NIL=21, ARROW=22, INT=23, 
		BOOL=24, DASHID=25, QID=26, TQID=27, ID=28;
	public static final String[] tokenNames = {
		"<INVALID>", "WS", "'in'", "'time'", "','", "'{'", "'}'", "'with'", "'delayedMsg'", 
		"'emptyValuation'", "'from'", "'to'", "'deadline'", "'stateVars'", "IDGEN", 
		"REBECQUEUE", "TOEXEC", "'>'", "'<'", "'::'", "':'", "'nil'", "'|->'", 
		"INT", "BOOL", "DASHID", "QID", "TQID", "ID"
	};
	public static final int
		RULE_reactiveClassDeclaration = 0, RULE_configuration = 1, RULE_state = 2, 
		RULE_rebec = 3, RULE_delayedMsg = 4, RULE_msg = 5, RULE_inQueue = 6, RULE_stateVariables = 7, 
		RULE_params = 8;
	public static final String[] ruleNames = {
		"reactiveClassDeclaration", "configuration", "state", "rebec", "delayedMsg", 
		"msg", "inQueue", "stateVariables", "params"
	};

	@Override
	public String getGrammarFileName() { return "RTMaudeResult.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RTMaudeResultParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ReactiveClassDeclarationContext extends ParserRuleContext {
		public String res;
		public int id;
		public ConfigurationContext resConf;
		public ConfigurationContext configuration(int i) {
			return getRuleContext(ConfigurationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RTMaudeResultParser.COMMA); }
		public List<ConfigurationContext> configuration() {
			return getRuleContexts(ConfigurationContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(RTMaudeResultParser.COMMA, i);
		}
		public ReactiveClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reactiveClassDeclaration; }
	}

	public final ReactiveClassDeclarationContext reactiveClassDeclaration() throws RecognitionException {
		ReactiveClassDeclarationContext _localctx = new ReactiveClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_reactiveClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ReactiveClassDeclarationContext)_localctx).res =  "<counter-example-trace>"; ((ReactiveClassDeclarationContext)_localctx).id = 0;
			{
			setState(19); ((ReactiveClassDeclarationContext)_localctx).resConf = configuration();
			_localctx.id+=1; ((ReactiveClassDeclarationContext)_localctx).res =  _localctx.res+"\n<state id="+_localctx.id+">"+((ReactiveClassDeclarationContext)_localctx).resConf.retConf+"\n</state>";
			}
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==OPENBRACE) {
				{
				{
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(22); match(COMMA);
					}
					}
					setState(27);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(28); ((ReactiveClassDeclarationContext)_localctx).resConf = configuration();
				_localctx.id+=1; ((ReactiveClassDeclarationContext)_localctx).res = _localctx.res+"\n<state id="+_localctx.id+">"+((ReactiveClassDeclarationContext)_localctx).resConf.retConf+"\n</state>";
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 ((ReactiveClassDeclarationContext)_localctx).res =  _localctx.res+"\n</counter-example-trace>\n";
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

	public static class ConfigurationContext extends ParserRuleContext {
		public String retConf;
		public StateContext resSt;
		public TerminalNode TQID(int i) {
			return getToken(RTMaudeResultParser.TQID, i);
		}
		public List<TerminalNode> TIME() { return getTokens(RTMaudeResultParser.TIME); }
		public List<TerminalNode> INT() { return getTokens(RTMaudeResultParser.INT); }
		public List<TerminalNode> ID() { return getTokens(RTMaudeResultParser.ID); }
		public TerminalNode TIME(int i) {
			return getToken(RTMaudeResultParser.TIME, i);
		}
		public StateContext state() {
			return getRuleContext(StateContext.class,0);
		}
		public TerminalNode INT(int i) {
			return getToken(RTMaudeResultParser.INT, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(RTMaudeResultParser.COMMA, i);
		}
		public List<TerminalNode> DASHID() { return getTokens(RTMaudeResultParser.DASHID); }
		public List<TerminalNode> IN() { return getTokens(RTMaudeResultParser.IN); }
		public List<TerminalNode> TQID() { return getTokens(RTMaudeResultParser.TQID); }
		public TerminalNode IN(int i) {
			return getToken(RTMaudeResultParser.IN, i);
		}
		public TerminalNode CLOSEBRACE() { return getToken(RTMaudeResultParser.CLOSEBRACE, 0); }
		public TerminalNode DASHID(int i) {
			return getToken(RTMaudeResultParser.DASHID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RTMaudeResultParser.COMMA); }
		public TerminalNode OPENBRACE() { return getToken(RTMaudeResultParser.OPENBRACE, 0); }
		public TerminalNode ID(int i) {
			return getToken(RTMaudeResultParser.ID, i);
		}
		public ConfigurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configuration; }
	}

	public final ConfigurationContext configuration() throws RecognitionException {
		ConfigurationContext _localctx = new ConfigurationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_configuration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ConfigurationContext)_localctx).retConf =  "";
			setState(39); match(OPENBRACE);
			{
			setState(40); ((ConfigurationContext)_localctx).resSt = state();
			((ConfigurationContext)_localctx).retConf =  _localctx.retConf+((ConfigurationContext)_localctx).resSt.retSt;
			}
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IN) {
				{
				{
				setState(43); match(IN);
				setState(44); match(TIME);
				setState(45); match(INT);
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(51); match(COMMA);
				setState(52);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DASHID) | (1L << TQID) | (1L << ID))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58); match(CLOSEBRACE);
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

	public static class StateContext extends ParserRuleContext {
		public String retSt;
		public DelayedMsgContext resdMsg;
		public RebecContext resRebec;
		public MsgContext resMsg;
		public List<RebecContext> rebec() {
			return getRuleContexts(RebecContext.class);
		}
		public List<MsgContext> msg() {
			return getRuleContexts(MsgContext.class);
		}
		public DelayedMsgContext delayedMsg(int i) {
			return getRuleContext(DelayedMsgContext.class,i);
		}
		public TerminalNode CLOSEBRACE() { return getToken(RTMaudeResultParser.CLOSEBRACE, 0); }
		public RebecContext rebec(int i) {
			return getRuleContext(RebecContext.class,i);
		}
		public List<DelayedMsgContext> delayedMsg() {
			return getRuleContexts(DelayedMsgContext.class);
		}
		public MsgContext msg(int i) {
			return getRuleContext(MsgContext.class,i);
		}
		public TerminalNode OPENBRACE() { return getToken(RTMaudeResultParser.OPENBRACE, 0); }
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((StateContext)_localctx).retSt =  "\n<floatBag>";
			setState(61); match(OPENBRACE);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DMSG) {
				{
				{
				setState(62); ((StateContext)_localctx).resdMsg = delayedMsg();
				((StateContext)_localctx).retSt = _localctx.retSt+"\n<delayedMSG after="+((StateContext)_localctx).resdMsg.dAfter+" deadline="+((StateContext)_localctx).resdMsg.dDeadline+" sender="+((StateContext)_localctx).resdMsg.dSender+" receiver="+((StateContext)_localctx).resdMsg.dReceiver+">"+((StateContext)_localctx).resdMsg.retdMsg+((StateContext)_localctx).resdMsg.dArguments+"</delayedMSG>";
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((StateContext)_localctx).retSt = _localctx.retSt+"\n</floatBag>";
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LT) {
				{
				{
				setState(71); ((StateContext)_localctx).resRebec = rebec();
				((StateContext)_localctx).retSt = _localctx.retSt+((StateContext)_localctx).resRebec.retRebec;
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			_localctx.retSt+="\n<undeliveredMSG>";
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DASHID) {
				{
				{
				setState(80); ((StateContext)_localctx).resMsg = msg();
				((StateContext)_localctx).retSt = _localctx.retSt+"\n<message deadline="+((StateContext)_localctx).resMsg.Deadline+" sender="+((StateContext)_localctx).resMsg.Sender+" receiver="+((StateContext)_localctx).resMsg.Receiver+">"+((StateContext)_localctx).resMsg.retMsg+((StateContext)_localctx).resMsg.Arguments+"</message>";
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88); match(CLOSEBRACE);
			_localctx.retSt+="\n</undeliveredMSG>";
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

	public static class RebecContext extends ParserRuleContext {
		public String retRebec;
		public Token RebecName;
		public InQueueContext inMsg;
		public StateVariablesContext resStVar;
		public TerminalNode NIL(int i) {
			return getToken(RTMaudeResultParser.NIL, i);
		}
		public TerminalNode INT() { return getToken(RTMaudeResultParser.INT, 0); }
		public TerminalNode TOEXEC() { return getToken(RTMaudeResultParser.TOEXEC, 0); }
		public TerminalNode ID() { return getToken(RTMaudeResultParser.ID, 0); }
		public List<TerminalNode> NIL() { return getTokens(RTMaudeResultParser.NIL); }
		public TerminalNode DBCOLON(int i) {
			return getToken(RTMaudeResultParser.DBCOLON, i);
		}
		public TerminalNode QID() { return getToken(RTMaudeResultParser.QID, 0); }
		public TerminalNode IDGEN() { return getToken(RTMaudeResultParser.IDGEN, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(RTMaudeResultParser.COMMA, i);
		}
		public List<InQueueContext> inQueue() {
			return getRuleContexts(InQueueContext.class);
		}
		public TerminalNode REBECQUEUE() { return getToken(RTMaudeResultParser.REBECQUEUE, 0); }
		public InQueueContext inQueue(int i) {
			return getRuleContext(InQueueContext.class,i);
		}
		public List<TerminalNode> DBCOLON() { return getTokens(RTMaudeResultParser.DBCOLON); }
		public TerminalNode LT() { return getToken(RTMaudeResultParser.LT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(RTMaudeResultParser.COMMA); }
		public StateVariablesContext stateVariables() {
			return getRuleContext(StateVariablesContext.class,0);
		}
		public TerminalNode COLON(int i) {
			return getToken(RTMaudeResultParser.COLON, i);
		}
		public TerminalNode GT() { return getToken(RTMaudeResultParser.GT, 0); }
		public List<TerminalNode> COLON() { return getTokens(RTMaudeResultParser.COLON); }
		public RebecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rebec; }
	}

	public final RebecContext rebec() throws RecognitionException {
		RebecContext _localctx = new RebecContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_rebec);
		int _la;
		try {
			setState(132);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				((RebecContext)_localctx).retRebec =  "\n<rebec name=";
				setState(92); match(LT);
				{
				setState(93); ((RebecContext)_localctx).RebecName = match(QID);
				((RebecContext)_localctx).retRebec = _localctx.retRebec+(((RebecContext)_localctx).RebecName!=null?((RebecContext)_localctx).RebecName.getText():null)+">";
				}
				setState(96); match(COLON);
				setState(97); match(REBECQUEUE);
				setState(98); match(COLON);
				((RebecContext)_localctx).retRebec = _localctx.retRebec+"\n<queue>";
				setState(110); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(110);
					switch (_input.LA(1)) {
					case NIL:
						{
						setState(100); match(NIL);
						}
						break;
					case DASHID:
						{
						{
						setState(101); ((RebecContext)_localctx).inMsg = inQueue();
						((RebecContext)_localctx).retRebec = _localctx.retRebec+"\n<qMSG deadline="+((RebecContext)_localctx).inMsg.iDeadline+" sender="+((RebecContext)_localctx).inMsg.iSender+">"+((RebecContext)_localctx).inMsg.retMsgName+((RebecContext)_localctx).inMsg.iArguments+"</qMSG>";
						}
						setState(107);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==DBCOLON) {
							{
							{
							setState(104); match(DBCOLON);
							}
							}
							setState(109);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(112); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NIL || _la==DASHID );
				((RebecContext)_localctx).retRebec = _localctx.retRebec+"\n</queue>";
				setState(115); match(COMMA);
				{
				setState(116); ((RebecContext)_localctx).resStVar = stateVariables();
				((RebecContext)_localctx).retRebec = _localctx.retRebec+" "+((RebecContext)_localctx).resStVar.retStVar;
				}
				setState(119); match(COMMA);
				setState(120); match(TOEXEC);
				setState(121); match(COLON);
				setState(122); match(ID);
				setState(123); match(GT);
				_localctx.retRebec +="\n</rebec>";
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((RebecContext)_localctx).retRebec =  " ";
				setState(127); match(LT);
				setState(128); match(IDGEN);
				setState(129); match(COLON);
				setState(130); match(INT);
				setState(131); match(GT);
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

	public static class DelayedMsgContext extends ParserRuleContext {
		public String retdMsg;
		public String dArguments;
		public String dDeadline;
		public String dSender;
		public String dReceiver;
		public String dAfter;
		public Token resDMDash;
		public ParamsContext par;
		public Token sendr;
		public Token rcvr;
		public Token ddline;
		public Token after;
		public List<TerminalNode> INT() { return getTokens(RTMaudeResultParser.INT); }
		public TerminalNode QID(int i) {
			return getToken(RTMaudeResultParser.QID, i);
		}
		public TerminalNode WITH() { return getToken(RTMaudeResultParser.WITH, 0); }
		public TerminalNode DEADLINE() { return getToken(RTMaudeResultParser.DEADLINE, 0); }
		public List<TerminalNode> QID() { return getTokens(RTMaudeResultParser.QID); }
		public TerminalNode INT(int i) {
			return getToken(RTMaudeResultParser.INT, i);
		}
		public TerminalNode DASHID() { return getToken(RTMaudeResultParser.DASHID, 0); }
		public List<ParamsContext> params() {
			return getRuleContexts(ParamsContext.class);
		}
		public TerminalNode COMMA() { return getToken(RTMaudeResultParser.COMMA, 0); }
		public TerminalNode TO() { return getToken(RTMaudeResultParser.TO, 0); }
		public TerminalNode DMSG() { return getToken(RTMaudeResultParser.DMSG, 0); }
		public ParamsContext params(int i) {
			return getRuleContext(ParamsContext.class,i);
		}
		public TerminalNode FROM() { return getToken(RTMaudeResultParser.FROM, 0); }
		public DelayedMsgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delayedMsg; }
	}

	public final DelayedMsgContext delayedMsg() throws RecognitionException {
		DelayedMsgContext _localctx = new DelayedMsgContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_delayedMsg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((DelayedMsgContext)_localctx).retdMsg = "";((DelayedMsgContext)_localctx).dArguments = "(";
			setState(135); match(DMSG);
			{
			setState(136); ((DelayedMsgContext)_localctx).resDMDash = match(DASHID);
			_localctx.retdMsg+=(((DelayedMsgContext)_localctx).resDMDash!=null?((DelayedMsgContext)_localctx).resDMDash.getText():null);
			}
			setState(139); match(WITH);
			setState(143); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(140); ((DelayedMsgContext)_localctx).par = params();
				((DelayedMsgContext)_localctx).dArguments = _localctx.dArguments+((DelayedMsgContext)_localctx).par.retVal+",";
				}
				}
				setState(145); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==EMPTYVAL || _la==DASHID );
			setState(147); match(FROM);
			{
			setState(148); ((DelayedMsgContext)_localctx).sendr = match(QID);
			((DelayedMsgContext)_localctx).dSender = (((DelayedMsgContext)_localctx).sendr!=null?((DelayedMsgContext)_localctx).sendr.getText():null);
			}
			setState(151); match(TO);
			{
			setState(152); ((DelayedMsgContext)_localctx).rcvr = match(QID);
			((DelayedMsgContext)_localctx).dReceiver = (((DelayedMsgContext)_localctx).rcvr!=null?((DelayedMsgContext)_localctx).rcvr.getText():null);
			}
			setState(155); match(DEADLINE);
			{
			setState(156); ((DelayedMsgContext)_localctx).ddline = match(INT);
			((DelayedMsgContext)_localctx).dDeadline = (((DelayedMsgContext)_localctx).ddline!=null?((DelayedMsgContext)_localctx).ddline.getText():null);
			}
			setState(159); match(COMMA);
			{
			setState(160); ((DelayedMsgContext)_localctx).after = match(INT);
			((DelayedMsgContext)_localctx).dAfter = (((DelayedMsgContext)_localctx).after!=null?((DelayedMsgContext)_localctx).after.getText():null);
			}
			_localctx.dArguments+=")";
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

	public static class MsgContext extends ParserRuleContext {
		public String retMsg;
		public String Arguments;
		public String Deadline;
		public String Sender;
		public String Receiver;
		public Token resMDash;
		public ParamsContext par;
		public Token sendr;
		public Token rcvr;
		public Token ddline;
		public TerminalNode DASHID() { return getToken(RTMaudeResultParser.DASHID, 0); }
		public List<ParamsContext> params() {
			return getRuleContexts(ParamsContext.class);
		}
		public TerminalNode INT() { return getToken(RTMaudeResultParser.INT, 0); }
		public TerminalNode QID(int i) {
			return getToken(RTMaudeResultParser.QID, i);
		}
		public TerminalNode WITH() { return getToken(RTMaudeResultParser.WITH, 0); }
		public List<TerminalNode> QID() { return getTokens(RTMaudeResultParser.QID); }
		public TerminalNode DEADLINE() { return getToken(RTMaudeResultParser.DEADLINE, 0); }
		public TerminalNode TO() { return getToken(RTMaudeResultParser.TO, 0); }
		public ParamsContext params(int i) {
			return getRuleContext(ParamsContext.class,i);
		}
		public TerminalNode FROM() { return getToken(RTMaudeResultParser.FROM, 0); }
		public MsgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_msg; }
	}

	public final MsgContext msg() throws RecognitionException {
		MsgContext _localctx = new MsgContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_msg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((MsgContext)_localctx).retMsg = "";((MsgContext)_localctx).Arguments = "(";
			{
			setState(166); ((MsgContext)_localctx).resMDash = match(DASHID);
			_localctx.retMsg+=(((MsgContext)_localctx).resMDash!=null?((MsgContext)_localctx).resMDash.getText():null);
			}
			setState(169); match(WITH);
			setState(173); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(170); ((MsgContext)_localctx).par = params();
				((MsgContext)_localctx).Arguments = _localctx.Arguments+((MsgContext)_localctx).par.retVal+",";
				}
				}
				setState(175); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==EMPTYVAL || _la==DASHID );
			setState(177); match(FROM);
			{
			setState(178); ((MsgContext)_localctx).sendr = match(QID);
			((MsgContext)_localctx).Sender = (((MsgContext)_localctx).sendr!=null?((MsgContext)_localctx).sendr.getText():null);
			}
			setState(181); match(TO);
			{
			setState(182); ((MsgContext)_localctx).rcvr = match(QID);
			((MsgContext)_localctx).Receiver = (((MsgContext)_localctx).rcvr!=null?((MsgContext)_localctx).rcvr.getText():null);
			}
			setState(185); match(DEADLINE);
			{
			setState(186); ((MsgContext)_localctx).ddline = match(INT);
			((MsgContext)_localctx).Deadline = (((MsgContext)_localctx).ddline!=null?((MsgContext)_localctx).ddline.getText():null);
			}
			_localctx.Arguments+=")";
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

	public static class InQueueContext extends ParserRuleContext {
		public String retMsgName;
		public String iArguments;
		public String iDeadline;
		public String iSender;
		public Token retDash;
		public ParamsContext par;
		public Token sendr;
		public Token ddline;
		public TerminalNode DASHID() { return getToken(RTMaudeResultParser.DASHID, 0); }
		public List<ParamsContext> params() {
			return getRuleContexts(ParamsContext.class);
		}
		public TerminalNode INT() { return getToken(RTMaudeResultParser.INT, 0); }
		public TerminalNode WITH() { return getToken(RTMaudeResultParser.WITH, 0); }
		public TerminalNode QID() { return getToken(RTMaudeResultParser.QID, 0); }
		public TerminalNode DEADLINE() { return getToken(RTMaudeResultParser.DEADLINE, 0); }
		public ParamsContext params(int i) {
			return getRuleContext(ParamsContext.class,i);
		}
		public TerminalNode FROM() { return getToken(RTMaudeResultParser.FROM, 0); }
		public InQueueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inQueue; }
	}

	public final InQueueContext inQueue() throws RecognitionException {
		InQueueContext _localctx = new InQueueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_inQueue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((InQueueContext)_localctx).retMsgName = "";((InQueueContext)_localctx).iArguments = "(";
			{
			setState(192); ((InQueueContext)_localctx).retDash = match(DASHID);
			((InQueueContext)_localctx).retMsgName =  (((InQueueContext)_localctx).retDash!=null?((InQueueContext)_localctx).retDash.getText():null);
			}
			setState(195); match(WITH);
			setState(199); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(196); ((InQueueContext)_localctx).par = params();
				((InQueueContext)_localctx).iArguments = _localctx.iArguments+((InQueueContext)_localctx).par.retVal+",";
				}
				}
				setState(201); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==EMPTYVAL || _la==DASHID );
			setState(203); match(FROM);
			{
			setState(204); ((InQueueContext)_localctx).sendr = match(QID);
			((InQueueContext)_localctx).iSender = (((InQueueContext)_localctx).sendr!=null?((InQueueContext)_localctx).sendr.getText():null);
			}
			setState(207); match(DEADLINE);
			{
			setState(208); ((InQueueContext)_localctx).ddline = match(INT);
			((InQueueContext)_localctx).iDeadline = (((InQueueContext)_localctx).ddline!=null?((InQueueContext)_localctx).ddline.getText():null);
			}
			_localctx.iArguments+=")";
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

	public static class StateVariablesContext extends ParserRuleContext {
		public String retStVar;
		public ParamsContext StVar;
		public List<ParamsContext> params() {
			return getRuleContexts(ParamsContext.class);
		}
		public TerminalNode STATEVARS() { return getToken(RTMaudeResultParser.STATEVARS, 0); }
		public TerminalNode COLON() { return getToken(RTMaudeResultParser.COLON, 0); }
		public ParamsContext params(int i) {
			return getRuleContext(ParamsContext.class,i);
		}
		public StateVariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateVariables; }
	}

	public final StateVariablesContext stateVariables() throws RecognitionException {
		StateVariablesContext _localctx = new StateVariablesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stateVariables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((StateVariablesContext)_localctx).retStVar = "\n<statevariables>";
			setState(214); match(STATEVARS);
			setState(215); match(COLON);
			setState(219); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(216); ((StateVariablesContext)_localctx).StVar = params();
				((StateVariablesContext)_localctx).retStVar =  _localctx.retStVar+"\n<variable name="+((StateVariablesContext)_localctx).StVar.retParam+">"+((StateVariablesContext)_localctx).StVar.retVal+"</variable>";
				}
				}
				setState(221); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==EMPTYVAL || _la==DASHID );
			_localctx.retStVar+="\n</statevariables>";
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

	public static class ParamsContext extends ParserRuleContext {
		public String retParam;
		public String retVal;
		public Token StName;
		public Token val;
		public TerminalNode DASHID() { return getToken(RTMaudeResultParser.DASHID, 0); }
		public TerminalNode BOOL() { return getToken(RTMaudeResultParser.BOOL, 0); }
		public TerminalNode EMPTYVAL() { return getToken(RTMaudeResultParser.EMPTYVAL, 0); }
		public TerminalNode INT() { return getToken(RTMaudeResultParser.INT, 0); }
		public TerminalNode ARROW() { return getToken(RTMaudeResultParser.ARROW, 0); }
		public TerminalNode QID() { return getToken(RTMaudeResultParser.QID, 0); }
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_params);
		int _la;
		try {
			setState(234);
			switch (_input.LA(1)) {
			case EMPTYVAL:
				enterOuterAlt(_localctx, 1);
				{
				((ParamsContext)_localctx).retParam = ""; 
				setState(226); match(EMPTYVAL);
				}
				break;
			case DASHID:
				enterOuterAlt(_localctx, 2);
				{
				((ParamsContext)_localctx).retParam = "";
				{
				setState(228); ((ParamsContext)_localctx).StName = match(DASHID);
				((ParamsContext)_localctx).retParam =  _localctx.retParam+(((ParamsContext)_localctx).StName!=null?((ParamsContext)_localctx).StName.getText():null);
				}
				setState(231); match(ARROW);
				{
				setState(232);
				((ParamsContext)_localctx).val = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << QID))) != 0)) ) {
					((ParamsContext)_localctx).val = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				((ParamsContext)_localctx).retVal =  (((ParamsContext)_localctx).val!=null?((ParamsContext)_localctx).val.getText():null);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\36\u00ef\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3"+
		"\2\3\2\3\2\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\3\2\3\2\7\2\"\n\2\f\2\16"+
		"\2%\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\61\n\3\f\3\16\3\64"+
		"\13\3\3\3\3\3\7\38\n\3\f\3\16\3;\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\7\4"+
		"D\n\4\f\4\16\4G\13\4\3\4\3\4\3\4\3\4\7\4M\n\4\f\4\16\4P\13\4\3\4\3\4\3"+
		"\4\3\4\7\4V\n\4\f\4\16\4Y\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5l\n\5\f\5\16\5o\13\5\6\5q\n\5\r\5\16\5"+
		"r\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5\u0087\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u0092\n\6\r"+
		"\6\16\6\u0093\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7\u00b0\n\7\r\7\16"+
		"\7\u00b1\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\6\b\u00ca\n\b\r\b\16\b\u00cb\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\6\t\u00de\n\t\r\t\16"+
		"\t\u00df\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ed\n\n\3\n"+
		"\2\2\13\2\4\6\b\n\f\16\20\22\2\4\4\2\33\33\35\36\4\2\31\32\34\34\u00f5"+
		"\2\24\3\2\2\2\4(\3\2\2\2\6>\3\2\2\2\b\u0086\3\2\2\2\n\u0088\3\2\2\2\f"+
		"\u00a7\3\2\2\2\16\u00c1\3\2\2\2\20\u00d7\3\2\2\2\22\u00ec\3\2\2\2\24\25"+
		"\b\2\1\2\25\26\5\4\3\2\26\27\b\2\1\2\27#\3\2\2\2\30\32\7\6\2\2\31\30\3"+
		"\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\36\3\2\2\2\35\33\3"+
		"\2\2\2\36\37\5\4\3\2\37 \b\2\1\2 \"\3\2\2\2!\33\3\2\2\2\"%\3\2\2\2#!\3"+
		"\2\2\2#$\3\2\2\2$&\3\2\2\2%#\3\2\2\2&\'\b\2\1\2\'\3\3\2\2\2()\b\3\1\2"+
		")*\7\7\2\2*+\5\6\4\2+,\b\3\1\2,\62\3\2\2\2-.\7\4\2\2./\7\5\2\2/\61\7\31"+
		"\2\2\60-\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\639\3\2\2\2"+
		"\64\62\3\2\2\2\65\66\7\6\2\2\668\t\2\2\2\67\65\3\2\2\28;\3\2\2\29\67\3"+
		"\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<=\7\b\2\2=\5\3\2\2\2>?\b\4\1\2?E"+
		"\7\7\2\2@A\5\n\6\2AB\b\4\1\2BD\3\2\2\2C@\3\2\2\2DG\3\2\2\2EC\3\2\2\2E"+
		"F\3\2\2\2FH\3\2\2\2GE\3\2\2\2HN\b\4\1\2IJ\5\b\5\2JK\b\4\1\2KM\3\2\2\2"+
		"LI\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QW\b\4\1\2"+
		"RS\5\f\7\2ST\b\4\1\2TV\3\2\2\2UR\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2"+
		"XZ\3\2\2\2YW\3\2\2\2Z[\7\b\2\2[\\\b\4\1\2\\\7\3\2\2\2]^\b\5\1\2^_\7\24"+
		"\2\2_`\7\34\2\2`a\b\5\1\2ab\3\2\2\2bc\7\26\2\2cd\7\21\2\2de\7\26\2\2e"+
		"p\b\5\1\2fq\7\27\2\2gh\5\16\b\2hi\b\5\1\2im\3\2\2\2jl\7\25\2\2kj\3\2\2"+
		"\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2nq\3\2\2\2om\3\2\2\2pf\3\2\2\2pg\3\2\2"+
		"\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\b\5\1\2uv\7\6\2\2vw\5\20"+
		"\t\2wx\b\5\1\2xy\3\2\2\2yz\7\6\2\2z{\7\22\2\2{|\7\26\2\2|}\7\36\2\2}~"+
		"\7\23\2\2~\177\b\5\1\2\177\u0087\3\2\2\2\u0080\u0081\b\5\1\2\u0081\u0082"+
		"\7\24\2\2\u0082\u0083\7\20\2\2\u0083\u0084\7\26\2\2\u0084\u0085\7\31\2"+
		"\2\u0085\u0087\7\23\2\2\u0086]\3\2\2\2\u0086\u0080\3\2\2\2\u0087\t\3\2"+
		"\2\2\u0088\u0089\b\6\1\2\u0089\u008a\7\n\2\2\u008a\u008b\7\33\2\2\u008b"+
		"\u008c\b\6\1\2\u008c\u008d\3\2\2\2\u008d\u0091\7\t\2\2\u008e\u008f\5\22"+
		"\n\2\u008f\u0090\b\6\1\2\u0090\u0092\3\2\2\2\u0091\u008e\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\u0096\7\f\2\2\u0096\u0097\7\34\2\2\u0097\u0098\b\6\1\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009a\7\r\2\2\u009a\u009b\7\34\2\2\u009b\u009c\b"+
		"\6\1\2\u009c\u009d\3\2\2\2\u009d\u009e\7\16\2\2\u009e\u009f\7\31\2\2\u009f"+
		"\u00a0\b\6\1\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\7\6\2\2\u00a2\u00a3\7\31"+
		"\2\2\u00a3\u00a4\b\6\1\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\b\6\1\2\u00a6"+
		"\13\3\2\2\2\u00a7\u00a8\b\7\1\2\u00a8\u00a9\7\33\2\2\u00a9\u00aa\b\7\1"+
		"\2\u00aa\u00ab\3\2\2\2\u00ab\u00af\7\t\2\2\u00ac\u00ad\5\22\n\2\u00ad"+
		"\u00ae\b\7\1\2\u00ae\u00b0\3\2\2\2\u00af\u00ac\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b4\7\f\2\2\u00b4\u00b5\7\34\2\2\u00b5\u00b6\b\7\1\2\u00b6\u00b7\3"+
		"\2\2\2\u00b7\u00b8\7\r\2\2\u00b8\u00b9\7\34\2\2\u00b9\u00ba\b\7\1\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00bc\7\16\2\2\u00bc\u00bd\7\31\2\2\u00bd\u00be\b"+
		"\7\1\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\b\7\1\2\u00c0\r\3\2\2\2\u00c1\u00c2"+
		"\b\b\1\2\u00c2\u00c3\7\33\2\2\u00c3\u00c4\b\b\1\2\u00c4\u00c5\3\2\2\2"+
		"\u00c5\u00c9\7\t\2\2\u00c6\u00c7\5\22\n\2\u00c7\u00c8\b\b\1\2\u00c8\u00ca"+
		"\3\2\2\2\u00c9\u00c6\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\7\f\2\2\u00ce\u00cf\7\34"+
		"\2\2\u00cf\u00d0\b\b\1\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\7\16\2\2\u00d2"+
		"\u00d3\7\31\2\2\u00d3\u00d4\b\b\1\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\b"+
		"\b\1\2\u00d6\17\3\2\2\2\u00d7\u00d8\b\t\1\2\u00d8\u00d9\7\17\2\2\u00d9"+
		"\u00dd\7\26\2\2\u00da\u00db\5\22\n\2\u00db\u00dc\b\t\1\2\u00dc\u00de\3"+
		"\2\2\2\u00dd\u00da\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00dd\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\b\t\1\2\u00e2\21\3\2\2"+
		"\2\u00e3\u00e4\b\n\1\2\u00e4\u00ed\7\13\2\2\u00e5\u00e6\b\n\1\2\u00e6"+
		"\u00e7\7\33\2\2\u00e7\u00e8\b\n\1\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\7"+
		"\30\2\2\u00ea\u00eb\t\3\2\2\u00eb\u00ed\b\n\1\2\u00ec\u00e3\3\2\2\2\u00ec"+
		"\u00e5\3\2\2\2\u00ed\23\3\2\2\2\22\33#\629ENWmpr\u0086\u0093\u00b1\u00cb"+
		"\u00df\u00ec";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}