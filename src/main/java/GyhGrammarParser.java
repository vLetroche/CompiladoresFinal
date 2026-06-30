// Generated from GyhGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GyhGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PCDec=1, PCProg=2, PCInt=3, PCReal=4, PCLer=5, PCImprimir=6, PCSe=7, PCSenao=8, 
		PCEntao=9, PCEnqto=10, PCIni=11, PCFim=12, OpAritMult=13, OpAritDiv=14, 
		OpAritSoma=15, OpAritSub=16, OpRelMenor=17, OpRelMenorIgual=18, OpRelMaior=19, 
		OpRelMaiorIgual=20, OpRelIgual=21, OpRelDif=22, OpBoolE=23, OpBoolOu=24, 
		Delim=25, Atrib=26, AbrePar=27, FechaPar=28, Var=29, NumInt=30, NumReal=31, 
		STRING=32, COMMENT=33, WS=34;
	public static final int
		RULE_programa = 0, RULE_listaDeclaracoes = 1, RULE_declaracao = 2, RULE_tipoVar = 3, 
		RULE_expressaoAritmetica = 4, RULE_expressaoAritmeticaL = 5, RULE_termoAritmetico = 6, 
		RULE_termoAritmeticoL = 7, RULE_fatorAritmetico = 8, RULE_expressaoRelacional = 9, 
		RULE_expressaoRelacionalL = 10, RULE_termoRelacional = 11, RULE_opRel = 12, 
		RULE_operadorBooleano = 13, RULE_listaComandos = 14, RULE_comando = 15, 
		RULE_comandoAtribuicao = 16, RULE_comandoEntrada = 17, RULE_comandoSaida = 18, 
		RULE_comandoCondicao = 19, RULE_comandoRepeticao = 20, RULE_subAlgoritmo = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "listaDeclaracoes", "declaracao", "tipoVar", "expressaoAritmetica", 
			"expressaoAritmeticaL", "termoAritmetico", "termoAritmeticoL", "fatorAritmetico", 
			"expressaoRelacional", "expressaoRelacionalL", "termoRelacional", "opRel", 
			"operadorBooleano", "listaComandos", "comando", "comandoAtribuicao", 
			"comandoEntrada", "comandoSaida", "comandoCondicao", "comandoRepeticao", 
			"subAlgoritmo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'DEC'", "'PROG'", "'INT'", "'REAL'", "'LER'", "'IMPRIMIR'", "'SE'", 
			"'SENAO'", "'ENTAO'", "'ENQTO'", "'INI'", "'FIM'", "'*'", "'/'", "'+'", 
			"'-'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'E'", "'OU'", "':'", 
			"':='", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PCDec", "PCProg", "PCInt", "PCReal", "PCLer", "PCImprimir", "PCSe", 
			"PCSenao", "PCEntao", "PCEnqto", "PCIni", "PCFim", "OpAritMult", "OpAritDiv", 
			"OpAritSoma", "OpAritSub", "OpRelMenor", "OpRelMenorIgual", "OpRelMaior", 
			"OpRelMaiorIgual", "OpRelIgual", "OpRelDif", "OpBoolE", "OpBoolOu", "Delim", 
			"Atrib", "AbrePar", "FechaPar", "Var", "NumInt", "NumReal", "STRING", 
			"COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "GyhGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GyhGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public List<TerminalNode> Delim() { return getTokens(GyhGrammarParser.Delim); }
		public TerminalNode Delim(int i) {
			return getToken(GyhGrammarParser.Delim, i);
		}
		public TerminalNode PCDec() { return getToken(GyhGrammarParser.PCDec, 0); }
		public ListaDeclaracoesContext listaDeclaracoes() {
			return getRuleContext(ListaDeclaracoesContext.class,0);
		}
		public TerminalNode PCProg() { return getToken(GyhGrammarParser.PCProg, 0); }
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhGrammarListener ) ((GyhGrammarListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhGrammarListener ) ((GyhGrammarListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GyhGrammarVisitor ) return ((GyhGrammarVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(Delim);
			setState(45);
			match(PCDec);
			setState(46);
			listaDeclaracoes();
			setState(47);
			match(Delim);
			setState(48);
			match(PCProg);
			setState(49);
			listaComandos();
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

	public static class ListaDeclaracoesContext extends ParserRuleContext {
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public ListaDeclaracoesContext listaDeclaracoes() {
			return getRuleContext(ListaDeclaracoesContext.class,0);
		}
		public ListaDeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaDeclaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhGrammarListener ) ((GyhGrammarListener)listener).enterListaDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhGrammarListener ) ((GyhGrammarListener)listener).exitListaDeclaracoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GyhGrammarVisitor ) return ((GyhGrammarVisitor<? extends T>)visitor).visitListaDeclaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaDeclaracoesContext listaDeclaracoes() throws RecognitionException {
		ListaDeclaracoesContext _localctx = new ListaDeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_listaDeclaracoes);
		try {
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				declaracao();
				setState(52);
				listaDeclaracoes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				declaracao();
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

	public static class DeclaracaoContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(GyhGrammarParser.Var, 0); }
		public TerminalNode Delim() { return getToken(GyhGrammarParser.Delim, 0); }
		public TipoVarContext tipoVar() {
			return getRuleContext(TipoVarContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhGrammarListener ) ((GyhGrammarListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhGrammarListener ) ((GyhGrammarListener)listener).exitDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GyhGrammarVisitor ) return ((GyhGrammarVisitor<? extends T>)visitor).visitDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(Var);
			setState(58);
			match(Delim);
			setState(59);
			tipoVar();
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

	public static class TipoVarContext extends ParserRuleContext {
		public TerminalNode PCInt() { return getToken(GyhGrammarParser.PCInt, 0); }
		public TerminalNode PCReal() { return getToken(GyhGrammarParser.PCReal, 0); }
		public TipoVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhGrammarListener ) ((GyhGrammarListener)listener).enterTipoVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhGrammarListener ) ((GyhGrammarListener)listener).exitTipoVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GyhGrammarVisitor ) return ((GyhGrammarVisitor<? extends T>)visitor).visitTipoVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoVarContext tipoVar() throws RecognitionException {
		TipoVarContext _localctx = new TipoVarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipoVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_la = _input.LA(1);
			if ( !(_la==PCInt || _la==PCReal) ) {
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

	public static class ExpressaoAritmeticaContext extends ParserRuleContext {
		public TermoAritmeticoContext termoAritmetico() {
			return getRuleContext(TermoAritmeticoContext.class,0);
		}
		public ExpressaoAritmeticaLContext expressaoAritmeticaL() {
			return getRuleContext(ExpressaoAritmeticaLContext.class,0);
		}
		public ExpressaoAritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoAritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhGrammarListener ) ((GyhGrammarListener)listener).enterExpressaoAritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhGrammarListener ) ((GyhGrammarListener)listener).exitExpressaoAritmetica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GyhGrammarVisitor ) return ((GyhGrammarVisitor<? extends T>)visitor).visitExpressaoAritmetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoAritmeticaContext expressaoAritmetica() throws RecognitionException {
		ExpressaoAritmeticaContext _localctx = new ExpressaoAritmeticaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expressaoAritmetica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			termoAritmetico();
			setState(64);
			expressaoAritmeticaL();
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

	public static class ExpressaoAritmeticaLContext extends ParserRuleContext {
		public TerminalNode OpAritSoma() { return getToken(GyhGrammarParser.OpAritSoma, 0); }
		public TermoAritmeticoContext termoAritmetico() {
			return getRuleContext(TermoAritmeticoContext.class,0);
		}
		public ExpressaoAritmeticaLContext expressaoAritmeticaL() {
			return getRuleContext(ExpressaoAritmeticaLContext.class,0);
		}
		public TerminalNode OpAritSub() { return getToken(GyhGrammarParser.OpAritSub, 0); }
		public ExpressaoAritmeticaLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoAritmeticaL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhGrammarListener ) ((GyhGrammarListener)listener).enterExpressaoAritmeticaL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhGrammarListener ) ((GyhGrammarListener)listener).exitExpressaoAritmeticaL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GyhGrammarVisitor ) return ((GyhGrammarVisitor<? extends T>)visitor).visitExpressaoAritmeticaL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoAritmeticaLContext expressaoAritmeticaL() throws RecognitionException {
		ExpressaoAritmeticaLContext _localctx = new ExpressaoAritmeticaLContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expressaoAritmeticaL);
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpAritSoma:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(OpAritSoma);
				setState(67);
				termoAritmetico();
				setState(68);
				expressaoAritmeticaL();
				}
				break;
			case OpAritSub:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(OpAritSub);
				setState(71);
				termoAritmetico();
				setState(72);
				expressaoAritmeticaL();
				}
				break;
			case EOF:
			case PCLer:
			case PCImprimir:
			case PCSe:
			case PCSenao:
			case PCEntao:
			case PCEnqto:
			case PCIni:
			case PCFim:
			case OpRelMenor:
			case OpRelMenorIgual:
			case OpRelMaior:
			case OpRelMaiorIgual:
			case OpRelIgual:
			case OpRelDif:
			case OpBoolE:
			case OpBoolOu:
			case FechaPar:
			case Var:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class TermoAritmeticoContext extends ParserRuleContext {
		public FatorAritmeticoContext fatorAritmetico() {
			return getRuleContext(FatorAritmeticoContext.class,0);
		}
		public TermoAritmeticoLContext termoAritmeticoL() {
			return getRuleContext(TermoAritmeticoLContext.class,0);
		}
		public TermoAritmeticoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termoAritmetico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhGrammarListener ) ((GyhGrammarListener)listener).enterTermoAritmetico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhGrammarListener ) ((GyhGrammarListener)listener).exitTermoAritmetico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GyhGrammarVisitor ) return ((GyhGrammarVisitor<? extends T>)visitor).visitTermoAritmetico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoAritmeticoContext termoAritmetico() throws RecognitionException {
		TermoAritmeticoContext _localctx = new TermoAritmeticoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_termoAritmetico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			fatorAritmetico();
			setState(78);
			termoAritmeticoL();
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

	public static class TermoAritmeticoLContext extends ParserRuleContext {
		public TerminalNode OpAritMult() { return getToken(GyhGrammarParser.OpAritMult, 0); }
		public FatorAritmeticoContext fatorAritmetico() {
			return getRuleContext(FatorAritmeticoContext.class,0);
		}
		public TermoAritmeticoLContext termoAritmeticoL() {
			return getRuleContext(TermoAritmeticoLContext.class,0);
		}
		public TerminalNode OpAritDiv() { return getToken(GyhGrammarParser.OpAritDiv, 0); }
		public TermoAritmeticoLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termoAritmeticoL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhGrammarListener ) ((GyhGrammarListener)listener).enterTermoAritmeticoL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhGrammarListener ) ((GyhGrammarListener)listener).exitTermoAritmeticoL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GyhGrammarVisitor ) return ((GyhGrammarVisitor<? extends T>)visitor).visitTermoAritmeticoL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoAritmeticoLContext termoAritmeticoL() throws RecognitionException {
		TermoAritmeticoLContext _localctx = new TermoAritmeticoLContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_termoAritmeticoL);
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpAritMult:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(OpAritMult);
				setState(81);
				fatorAritmetico();
				setState(82);
				termoAritmeticoL();
				}
				break;
			case OpAritDiv:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(OpAritDiv);
				setState(85);
				fatorAritmetico();
				setState(86);
				termoAritmeticoL();
				}
				break;
			case EOF:
			case PCLer:
			case PCImprimir:
			case PCSe:
			case PCSenao:
			case PCEntao:
			case PCEnqto:
			case PCIni:
			case PCFim:
			case OpAritSoma:
			case OpAritSub:
			case OpRelMenor:
			case OpRelMenorIgual:
			case OpRelMaior:
			case OpRelMaiorIgual:
			case OpRelIgual:
			case OpRelDif:
			case OpBoolE:
			case OpBoolOu:
			case FechaPar:
			case Var:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class FatorAritmeticoContext extends ParserRuleContext {
		public TerminalNode NumInt() { return getToken(GyhGrammarParser.NumInt, 0); }
		public TerminalNode NumReal() { return getToken(GyhGrammarParser.NumReal, 0); }
		public TerminalNode Var() { return getToken(GyhGrammarParser.Var, 0); }
		public TerminalNode AbrePar() { return getToken(GyhGrammarParser.AbrePar, 0); }
		public ExpressaoAritmeticaContext expressaoAritmetica() {
			return getRuleContext(ExpressaoAritmeticaContext.class,0);
		}
		public TerminalNode FechaPar() { return getToken(GyhGrammarParser.FechaPar, 0); }
		public FatorAritmeticoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fatorAritmetico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhGrammarListener ) ((GyhGrammarListener)listener).enterFatorAritmetico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhGrammarListener ) ((GyhGrammarListener)listener).exitFatorAritmetico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GyhGrammarVisitor ) return ((GyhGrammarVisitor<? extends T>)visitor).visitFatorAritmetico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorAritmeticoContext fatorAritmetico() throws RecognitionException {
		FatorAritmeticoContext _localctx = new FatorAritmeticoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fatorAritmetico);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NumInt:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(NumInt);
				}
				break;
			case NumReal:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(NumReal);
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				match(Var);
				}
				break;
			case AbrePar:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				match(AbrePar);
				setState(95);
				expressaoAritmetica();
				setState(96);
				match(FechaPar);
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

	public static class ExpressaoRelacionalContext extends ParserRuleContext {
		public TermoRelacionalContext termoRelacional() {
			return getRuleContext(TermoRelacionalContext.class,0);
		}
		public ExpressaoRelacionalLContext expressaoRelacionalL() {
			return getRuleContext(ExpressaoRelacionalLContext.class,0);
		}
		public ExpressaoRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhGrammarListener ) ((GyhGrammarListener)listener).enterExpressaoRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhGrammarListener ) ((GyhGrammarListener)listener).exitExpressaoRelacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GyhGrammarVisitor ) return ((GyhGrammarVisitor<? extends T>)visitor).visitExpressaoRelacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoRelacionalContext expressaoRelacional() throws RecognitionException {
		ExpressaoRelacionalContext _localctx = new ExpressaoRelacionalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expressaoRelacional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			termoRelacional();
			setState(101);
			expressaoRelacionalL();
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

	public static class ExpressaoRelacionalLContext extends ParserRuleContext {
		public OperadorBooleanoContext operadorBooleano() {
			return getRuleContext(OperadorBooleanoContext.class,0);
		}
		public TermoRelacionalContext termoRelacional() {
			return getRuleContext(TermoRelacionalContext.class,0);
		}
		public ExpressaoRelacionalLContext expressaoRelacionalL() {
			return getRuleContext(ExpressaoRelacionalLContext.class,0);
		}
		public ExpressaoRelacionalLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoRelacionalL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhGrammarListener ) ((GyhGrammarListener)listener).enterExpressaoRelacionalL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhGrammarListener ) ((GyhGrammarListener)listener).exitExpressaoRelacionalL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GyhGrammarVisitor ) return ((GyhGrammarVisitor<? extends T>)visitor).visitExpressaoRelacionalL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoRelacionalLContext expressaoRelacionalL() throws RecognitionException {
		ExpressaoRelacionalLContext _localctx = new ExpressaoRelacionalLContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expressaoRelacionalL);
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpBoolE:
			case OpBoolOu:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				operadorBooleano();
				setState(104);
				termoRelacional();
				setState(105);
				expressaoRelacionalL();
				}
				break;
			case PCLer:
			case PCImprimir:
			case PCSe:
			case PCEntao:
			case PCEnqto:
			case PCIni:
			case FechaPar:
			case Var:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class TermoRelacionalContext extends ParserRuleContext {
		public List<ExpressaoAritmeticaContext> expressaoAritmetica() {
			return getRuleContexts(ExpressaoAritmeticaContext.class);
		}
		public ExpressaoAritmeticaContext expressaoAritmetica(int i) {
			return getRuleContext(ExpressaoAritmeticaContext.class,i);
		}
		public OpRelContext opRel() {
			return getRuleContext(OpRelContext.class,0);
		}
		public TerminalNode AbrePar() { return getToken(GyhGrammarParser.AbrePar, 0); }
		public ExpressaoRelacionalContext expressaoRelacional() {
			return getRuleContext(ExpressaoRelacionalContext.class,0);
		}
		public TerminalNode FechaPar() { return getToken(GyhGrammarParser.FechaPar, 0); }
		public TermoRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termoRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhGrammarListener ) ((GyhGrammarListener)listener).enterTermoRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhGrammarListener ) ((GyhGrammarListener)listener).exitTermoRelacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GyhGrammarVisitor ) return ((GyhGrammarVisitor<? extends T>)visitor).visitTermoRelacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoRelacionalContext termoRelacional() throws RecognitionException {
		TermoRelacionalContext _localctx = new TermoRelacionalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_termoRelacional);
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				expressaoAritmetica();
				setState(111);
				opRel();
				setState(112);
				expressaoAritmetica();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(AbrePar);
				setState(115);
				expressaoRelacional();
				setState(116);
				match(FechaPar);
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

	public static class OpRelContext extends ParserRuleContext {
		public TerminalNode OpRelMenor() { return getToken(GyhGrammarParser.OpRelMenor, 0); }
		public TerminalNode OpRelMenorIgual() { return getToken(GyhGrammarParser.OpRelMenorIgual, 0); }
		public TerminalNode OpRelMaior() { return getToken(GyhGrammarParser.OpRelMaior, 0); }
		public TerminalNode OpRelMaiorIgual() { return getToken(GyhGrammarParser.OpRelMaiorIgual, 0); }
		public TerminalNode OpRelIgual() { return getToken(GyhGrammarParser.OpRelIgual, 0); }
		public TerminalNode OpRelDif() { return getToken(GyhGrammarParser.OpRelDif, 0); }
		public OpRelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opRel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhGrammarListener ) ((GyhGrammarListener)listener).enterOpRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhGrammarListener ) ((GyhGrammarListener)listener).exitOpRel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GyhGrammarVisitor ) return ((GyhGrammarVisitor<? extends T>)visitor).visitOpRel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpRelContext opRel() throws RecognitionException {
		OpRelContext _localctx = new OpRelContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_opRel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpRelMenor) | (1L << OpRelMenorIgual) | (1L << OpRelMaior) | (1L << OpRelMaiorIgual) | (1L << OpRelIgual) | (1L << OpRelDif))) != 0)) ) {
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

	public static class OperadorBooleanoContext extends ParserRuleContext {
		public TerminalNode OpBoolE() { return getToken(GyhGrammarParser.OpBoolE, 0); }
		public TerminalNode OpBoolOu() { return getToken(GyhGrammarParser.OpBoolOu, 0); }
		public OperadorBooleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorBooleano; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhGrammarListener ) ((GyhGrammarListener)listener).enterOperadorBooleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhGrammarListener ) ((GyhGrammarListener)listener).exitOperadorBooleano(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GyhGrammarVisitor ) return ((GyhGrammarVisitor<? extends T>)visitor).visitOperadorBooleano(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorBooleanoContext operadorBooleano() throws RecognitionException {
		OperadorBooleanoContext _localctx = new OperadorBooleanoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_operadorBooleano);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_la = _input.LA(1);
			if ( !(_la==OpBoolE || _la==OpBoolOu) ) {
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

	public static class ListaComandosContext extends ParserRuleContext {
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public ListaComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaComandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhGrammarListener ) ((GyhGrammarListener)listener).enterListaComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhGrammarListener ) ((GyhGrammarListener)listener).exitListaComandos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GyhGrammarVisitor ) return ((GyhGrammarVisitor<? extends T>)visitor).visitListaComandos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaComandosContext listaComandos() throws RecognitionException {
		ListaComandosContext _localctx = new ListaComandosContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_listaComandos);
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				comando();
				setState(125);
				listaComandos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				comando();
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

	public static class ComandoContext extends ParserRuleContext {
		public ComandoAtribuicaoContext comandoAtribuicao() {
			return getRuleContext(ComandoAtribuicaoContext.class,0);
		}
		public ComandoEntradaContext comandoEntrada() {
			return getRuleContext(ComandoEntradaContext.class,0);
		}
		public ComandoSaidaContext comandoSaida() {
			return getRuleContext(ComandoSaidaContext.class,0);
		}
		public ComandoCondicaoContext comandoCondicao() {
			return getRuleContext(ComandoCondicaoContext.class,0);
		}
		public ComandoRepeticaoContext comandoRepeticao() {
			return getRuleContext(ComandoRepeticaoContext.class,0);
		}
		public SubAlgoritmoContext subAlgoritmo() {
			return getRuleContext(SubAlgoritmoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhGrammarListener ) ((GyhGrammarListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhGrammarListener ) ((GyhGrammarListener)listener).exitComando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GyhGrammarVisitor ) return ((GyhGrammarVisitor<? extends T>)visitor).visitComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_comando);
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				comandoAtribuicao();
				}
				break;
			case PCLer:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				comandoEntrada();
				}
				break;
			case PCImprimir:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				comandoSaida();
				}
				break;
			case PCSe:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				comandoCondicao();
				}
				break;
			case PCEnqto:
				enterOuterAlt(_localctx, 5);
				{
				setState(134);
				comandoRepeticao();
				}
				break;
			case PCIni:
				enterOuterAlt(_localctx, 6);
				{
				setState(135);
				subAlgoritmo();
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

	public static class ComandoAtribuicaoContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(GyhGrammarParser.Var, 0); }
		public TerminalNode Atrib() { return getToken(GyhGrammarParser.Atrib, 0); }
		public ExpressaoAritmeticaContext expressaoAritmetica() {
			return getRuleContext(ExpressaoAritmeticaContext.class,0);
		}
		public ComandoAtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoAtribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhGrammarListener ) ((GyhGrammarListener)listener).enterComandoAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhGrammarListener ) ((GyhGrammarListener)listener).exitComandoAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GyhGrammarVisitor ) return ((GyhGrammarVisitor<? extends T>)visitor).visitComandoAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoAtribuicaoContext comandoAtribuicao() throws RecognitionException {
		ComandoAtribuicaoContext _localctx = new ComandoAtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_comandoAtribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(Var);
			setState(139);
			match(Atrib);
			setState(140);
			expressaoAritmetica();
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

	public static class ComandoEntradaContext extends ParserRuleContext {
		public TerminalNode PCLer() { return getToken(GyhGrammarParser.PCLer, 0); }
		public TerminalNode Var() { return getToken(GyhGrammarParser.Var, 0); }
		public ComandoEntradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoEntrada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhGrammarListener ) ((GyhGrammarListener)listener).enterComandoEntrada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhGrammarListener ) ((GyhGrammarListener)listener).exitComandoEntrada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GyhGrammarVisitor ) return ((GyhGrammarVisitor<? extends T>)visitor).visitComandoEntrada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoEntradaContext comandoEntrada() throws RecognitionException {
		ComandoEntradaContext _localctx = new ComandoEntradaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comandoEntrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(PCLer);
			setState(143);
			match(Var);
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

	public static class ComandoSaidaContext extends ParserRuleContext {
		public TerminalNode PCImprimir() { return getToken(GyhGrammarParser.PCImprimir, 0); }
		public TerminalNode Var() { return getToken(GyhGrammarParser.Var, 0); }
		public TerminalNode STRING() { return getToken(GyhGrammarParser.STRING, 0); }
		public ComandoSaidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoSaida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhGrammarListener ) ((GyhGrammarListener)listener).enterComandoSaida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhGrammarListener ) ((GyhGrammarListener)listener).exitComandoSaida(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GyhGrammarVisitor ) return ((GyhGrammarVisitor<? extends T>)visitor).visitComandoSaida(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoSaidaContext comandoSaida() throws RecognitionException {
		ComandoSaidaContext _localctx = new ComandoSaidaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_comandoSaida);
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(PCImprimir);
				setState(146);
				match(Var);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(PCImprimir);
				setState(148);
				match(STRING);
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

	public static class ComandoCondicaoContext extends ParserRuleContext {
		public TerminalNode PCSe() { return getToken(GyhGrammarParser.PCSe, 0); }
		public ExpressaoRelacionalContext expressaoRelacional() {
			return getRuleContext(ExpressaoRelacionalContext.class,0);
		}
		public TerminalNode PCEntao() { return getToken(GyhGrammarParser.PCEntao, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public TerminalNode PCSenao() { return getToken(GyhGrammarParser.PCSenao, 0); }
		public ComandoCondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoCondicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhGrammarListener ) ((GyhGrammarListener)listener).enterComandoCondicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhGrammarListener ) ((GyhGrammarListener)listener).exitComandoCondicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GyhGrammarVisitor ) return ((GyhGrammarVisitor<? extends T>)visitor).visitComandoCondicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoCondicaoContext comandoCondicao() throws RecognitionException {
		ComandoCondicaoContext _localctx = new ComandoCondicaoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_comandoCondicao);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(PCSe);
				setState(152);
				expressaoRelacional();
				setState(153);
				match(PCEntao);
				setState(154);
				comando();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(PCSe);
				setState(157);
				expressaoRelacional();
				setState(158);
				match(PCEntao);
				setState(159);
				comando();
				setState(160);
				match(PCSenao);
				setState(161);
				comando();
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

	public static class ComandoRepeticaoContext extends ParserRuleContext {
		public TerminalNode PCEnqto() { return getToken(GyhGrammarParser.PCEnqto, 0); }
		public ExpressaoRelacionalContext expressaoRelacional() {
			return getRuleContext(ExpressaoRelacionalContext.class,0);
		}
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ComandoRepeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoRepeticao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhGrammarListener ) ((GyhGrammarListener)listener).enterComandoRepeticao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhGrammarListener ) ((GyhGrammarListener)listener).exitComandoRepeticao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GyhGrammarVisitor ) return ((GyhGrammarVisitor<? extends T>)visitor).visitComandoRepeticao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoRepeticaoContext comandoRepeticao() throws RecognitionException {
		ComandoRepeticaoContext _localctx = new ComandoRepeticaoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_comandoRepeticao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(PCEnqto);
			setState(166);
			expressaoRelacional();
			setState(167);
			comando();
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

	public static class SubAlgoritmoContext extends ParserRuleContext {
		public TerminalNode PCIni() { return getToken(GyhGrammarParser.PCIni, 0); }
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public TerminalNode PCFim() { return getToken(GyhGrammarParser.PCFim, 0); }
		public SubAlgoritmoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subAlgoritmo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhGrammarListener ) ((GyhGrammarListener)listener).enterSubAlgoritmo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhGrammarListener ) ((GyhGrammarListener)listener).exitSubAlgoritmo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GyhGrammarVisitor ) return ((GyhGrammarVisitor<? extends T>)visitor).visitSubAlgoritmo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubAlgoritmoContext subAlgoritmo() throws RecognitionException {
		SubAlgoritmoContext _localctx = new SubAlgoritmoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_subAlgoritmo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(PCIni);
			setState(170);
			listaComandos();
			setState(171);
			match(PCFim);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00b0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\5\3:\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7N\n\7\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\\\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\ne\n"+
		"\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\fo\n\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\5\ry\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u0083\n"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u008b\n\21\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u0098\n\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00a6\n\25\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\2\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,\2\5\3\2\5\6\3\2\23\30\3\2\31\32\2\u00ab\2.\3\2\2\2\49\3"+
		"\2\2\2\6;\3\2\2\2\b?\3\2\2\2\nA\3\2\2\2\fM\3\2\2\2\16O\3\2\2\2\20[\3\2"+
		"\2\2\22d\3\2\2\2\24f\3\2\2\2\26n\3\2\2\2\30x\3\2\2\2\32z\3\2\2\2\34|\3"+
		"\2\2\2\36\u0082\3\2\2\2 \u008a\3\2\2\2\"\u008c\3\2\2\2$\u0090\3\2\2\2"+
		"&\u0097\3\2\2\2(\u00a5\3\2\2\2*\u00a7\3\2\2\2,\u00ab\3\2\2\2./\7\33\2"+
		"\2/\60\7\3\2\2\60\61\5\4\3\2\61\62\7\33\2\2\62\63\7\4\2\2\63\64\5\36\20"+
		"\2\64\3\3\2\2\2\65\66\5\6\4\2\66\67\5\4\3\2\67:\3\2\2\28:\5\6\4\29\65"+
		"\3\2\2\298\3\2\2\2:\5\3\2\2\2;<\7\37\2\2<=\7\33\2\2=>\5\b\5\2>\7\3\2\2"+
		"\2?@\t\2\2\2@\t\3\2\2\2AB\5\16\b\2BC\5\f\7\2C\13\3\2\2\2DE\7\21\2\2EF"+
		"\5\16\b\2FG\5\f\7\2GN\3\2\2\2HI\7\22\2\2IJ\5\16\b\2JK\5\f\7\2KN\3\2\2"+
		"\2LN\3\2\2\2MD\3\2\2\2MH\3\2\2\2ML\3\2\2\2N\r\3\2\2\2OP\5\22\n\2PQ\5\20"+
		"\t\2Q\17\3\2\2\2RS\7\17\2\2ST\5\22\n\2TU\5\20\t\2U\\\3\2\2\2VW\7\20\2"+
		"\2WX\5\22\n\2XY\5\20\t\2Y\\\3\2\2\2Z\\\3\2\2\2[R\3\2\2\2[V\3\2\2\2[Z\3"+
		"\2\2\2\\\21\3\2\2\2]e\7 \2\2^e\7!\2\2_e\7\37\2\2`a\7\35\2\2ab\5\n\6\2"+
		"bc\7\36\2\2ce\3\2\2\2d]\3\2\2\2d^\3\2\2\2d_\3\2\2\2d`\3\2\2\2e\23\3\2"+
		"\2\2fg\5\30\r\2gh\5\26\f\2h\25\3\2\2\2ij\5\34\17\2jk\5\30\r\2kl\5\26\f"+
		"\2lo\3\2\2\2mo\3\2\2\2ni\3\2\2\2nm\3\2\2\2o\27\3\2\2\2pq\5\n\6\2qr\5\32"+
		"\16\2rs\5\n\6\2sy\3\2\2\2tu\7\35\2\2uv\5\24\13\2vw\7\36\2\2wy\3\2\2\2"+
		"xp\3\2\2\2xt\3\2\2\2y\31\3\2\2\2z{\t\3\2\2{\33\3\2\2\2|}\t\4\2\2}\35\3"+
		"\2\2\2~\177\5 \21\2\177\u0080\5\36\20\2\u0080\u0083\3\2\2\2\u0081\u0083"+
		"\5 \21\2\u0082~\3\2\2\2\u0082\u0081\3\2\2\2\u0083\37\3\2\2\2\u0084\u008b"+
		"\5\"\22\2\u0085\u008b\5$\23\2\u0086\u008b\5&\24\2\u0087\u008b\5(\25\2"+
		"\u0088\u008b\5*\26\2\u0089\u008b\5,\27\2\u008a\u0084\3\2\2\2\u008a\u0085"+
		"\3\2\2\2\u008a\u0086\3\2\2\2\u008a\u0087\3\2\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u0089\3\2\2\2\u008b!\3\2\2\2\u008c\u008d\7\37\2\2\u008d\u008e\7\34\2"+
		"\2\u008e\u008f\5\n\6\2\u008f#\3\2\2\2\u0090\u0091\7\7\2\2\u0091\u0092"+
		"\7\37\2\2\u0092%\3\2\2\2\u0093\u0094\7\b\2\2\u0094\u0098\7\37\2\2\u0095"+
		"\u0096\7\b\2\2\u0096\u0098\7\"\2\2\u0097\u0093\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0098\'\3\2\2\2\u0099\u009a\7\t\2\2\u009a\u009b\5\24\13\2\u009b\u009c"+
		"\7\13\2\2\u009c\u009d\5 \21\2\u009d\u00a6\3\2\2\2\u009e\u009f\7\t\2\2"+
		"\u009f\u00a0\5\24\13\2\u00a0\u00a1\7\13\2\2\u00a1\u00a2\5 \21\2\u00a2"+
		"\u00a3\7\n\2\2\u00a3\u00a4\5 \21\2\u00a4\u00a6\3\2\2\2\u00a5\u0099\3\2"+
		"\2\2\u00a5\u009e\3\2\2\2\u00a6)\3\2\2\2\u00a7\u00a8\7\f\2\2\u00a8\u00a9"+
		"\5\24\13\2\u00a9\u00aa\5 \21\2\u00aa+\3\2\2\2\u00ab\u00ac\7\r\2\2\u00ac"+
		"\u00ad\5\36\20\2\u00ad\u00ae\7\16\2\2\u00ae-\3\2\2\2\f9M[dnx\u0082\u008a"+
		"\u0097\u00a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}