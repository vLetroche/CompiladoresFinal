// Generated from GyhGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GyhGrammarParser}.
 */
public interface GyhGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GyhGrammarParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(GyhGrammarParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GyhGrammarParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(GyhGrammarParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GyhGrammarParser#listaDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void enterListaDeclaracoes(GyhGrammarParser.ListaDeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GyhGrammarParser#listaDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void exitListaDeclaracoes(GyhGrammarParser.ListaDeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GyhGrammarParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(GyhGrammarParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GyhGrammarParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(GyhGrammarParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GyhGrammarParser#tipoVar}.
	 * @param ctx the parse tree
	 */
	void enterTipoVar(GyhGrammarParser.TipoVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GyhGrammarParser#tipoVar}.
	 * @param ctx the parse tree
	 */
	void exitTipoVar(GyhGrammarParser.TipoVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GyhGrammarParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAritmetica(GyhGrammarParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GyhGrammarParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAritmetica(GyhGrammarParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GyhGrammarParser#expressaoAritmeticaL}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAritmeticaL(GyhGrammarParser.ExpressaoAritmeticaLContext ctx);
	/**
	 * Exit a parse tree produced by {@link GyhGrammarParser#expressaoAritmeticaL}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAritmeticaL(GyhGrammarParser.ExpressaoAritmeticaLContext ctx);
	/**
	 * Enter a parse tree produced by {@link GyhGrammarParser#termoAritmetico}.
	 * @param ctx the parse tree
	 */
	void enterTermoAritmetico(GyhGrammarParser.TermoAritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GyhGrammarParser#termoAritmetico}.
	 * @param ctx the parse tree
	 */
	void exitTermoAritmetico(GyhGrammarParser.TermoAritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GyhGrammarParser#termoAritmeticoL}.
	 * @param ctx the parse tree
	 */
	void enterTermoAritmeticoL(GyhGrammarParser.TermoAritmeticoLContext ctx);
	/**
	 * Exit a parse tree produced by {@link GyhGrammarParser#termoAritmeticoL}.
	 * @param ctx the parse tree
	 */
	void exitTermoAritmeticoL(GyhGrammarParser.TermoAritmeticoLContext ctx);
	/**
	 * Enter a parse tree produced by {@link GyhGrammarParser#fatorAritmetico}.
	 * @param ctx the parse tree
	 */
	void enterFatorAritmetico(GyhGrammarParser.FatorAritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GyhGrammarParser#fatorAritmetico}.
	 * @param ctx the parse tree
	 */
	void exitFatorAritmetico(GyhGrammarParser.FatorAritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GyhGrammarParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoRelacional(GyhGrammarParser.ExpressaoRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GyhGrammarParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoRelacional(GyhGrammarParser.ExpressaoRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GyhGrammarParser#expressaoRelacionalL}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoRelacionalL(GyhGrammarParser.ExpressaoRelacionalLContext ctx);
	/**
	 * Exit a parse tree produced by {@link GyhGrammarParser#expressaoRelacionalL}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoRelacionalL(GyhGrammarParser.ExpressaoRelacionalLContext ctx);
	/**
	 * Enter a parse tree produced by {@link GyhGrammarParser#termoRelacional}.
	 * @param ctx the parse tree
	 */
	void enterTermoRelacional(GyhGrammarParser.TermoRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GyhGrammarParser#termoRelacional}.
	 * @param ctx the parse tree
	 */
	void exitTermoRelacional(GyhGrammarParser.TermoRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GyhGrammarParser#opRel}.
	 * @param ctx the parse tree
	 */
	void enterOpRel(GyhGrammarParser.OpRelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GyhGrammarParser#opRel}.
	 * @param ctx the parse tree
	 */
	void exitOpRel(GyhGrammarParser.OpRelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GyhGrammarParser#operadorBooleano}.
	 * @param ctx the parse tree
	 */
	void enterOperadorBooleano(GyhGrammarParser.OperadorBooleanoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GyhGrammarParser#operadorBooleano}.
	 * @param ctx the parse tree
	 */
	void exitOperadorBooleano(GyhGrammarParser.OperadorBooleanoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GyhGrammarParser#listaComandos}.
	 * @param ctx the parse tree
	 */
	void enterListaComandos(GyhGrammarParser.ListaComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GyhGrammarParser#listaComandos}.
	 * @param ctx the parse tree
	 */
	void exitListaComandos(GyhGrammarParser.ListaComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GyhGrammarParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(GyhGrammarParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GyhGrammarParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(GyhGrammarParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GyhGrammarParser#comandoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterComandoAtribuicao(GyhGrammarParser.ComandoAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GyhGrammarParser#comandoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitComandoAtribuicao(GyhGrammarParser.ComandoAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GyhGrammarParser#comandoEntrada}.
	 * @param ctx the parse tree
	 */
	void enterComandoEntrada(GyhGrammarParser.ComandoEntradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GyhGrammarParser#comandoEntrada}.
	 * @param ctx the parse tree
	 */
	void exitComandoEntrada(GyhGrammarParser.ComandoEntradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GyhGrammarParser#comandoSaida}.
	 * @param ctx the parse tree
	 */
	void enterComandoSaida(GyhGrammarParser.ComandoSaidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GyhGrammarParser#comandoSaida}.
	 * @param ctx the parse tree
	 */
	void exitComandoSaida(GyhGrammarParser.ComandoSaidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GyhGrammarParser#comandoCondicao}.
	 * @param ctx the parse tree
	 */
	void enterComandoCondicao(GyhGrammarParser.ComandoCondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GyhGrammarParser#comandoCondicao}.
	 * @param ctx the parse tree
	 */
	void exitComandoCondicao(GyhGrammarParser.ComandoCondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GyhGrammarParser#comandoRepeticao}.
	 * @param ctx the parse tree
	 */
	void enterComandoRepeticao(GyhGrammarParser.ComandoRepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GyhGrammarParser#comandoRepeticao}.
	 * @param ctx the parse tree
	 */
	void exitComandoRepeticao(GyhGrammarParser.ComandoRepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GyhGrammarParser#subAlgoritmo}.
	 * @param ctx the parse tree
	 */
	void enterSubAlgoritmo(GyhGrammarParser.SubAlgoritmoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GyhGrammarParser#subAlgoritmo}.
	 * @param ctx the parse tree
	 */
	void exitSubAlgoritmo(GyhGrammarParser.SubAlgoritmoContext ctx);
}