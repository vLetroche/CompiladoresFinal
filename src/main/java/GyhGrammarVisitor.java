// Generated from GyhGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GyhGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GyhGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GyhGrammarParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(GyhGrammarParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GyhGrammarParser#listaDeclaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaDeclaracoes(GyhGrammarParser.ListaDeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GyhGrammarParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao(GyhGrammarParser.DeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GyhGrammarParser#tipoVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoVar(GyhGrammarParser.TipoVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link GyhGrammarParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoAritmetica(GyhGrammarParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GyhGrammarParser#expressaoAritmeticaL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoAritmeticaL(GyhGrammarParser.ExpressaoAritmeticaLContext ctx);
	/**
	 * Visit a parse tree produced by {@link GyhGrammarParser#termoAritmetico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermoAritmetico(GyhGrammarParser.TermoAritmeticoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GyhGrammarParser#termoAritmeticoL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermoAritmeticoL(GyhGrammarParser.TermoAritmeticoLContext ctx);
	/**
	 * Visit a parse tree produced by {@link GyhGrammarParser#fatorAritmetico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFatorAritmetico(GyhGrammarParser.FatorAritmeticoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GyhGrammarParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoRelacional(GyhGrammarParser.ExpressaoRelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GyhGrammarParser#expressaoRelacionalL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoRelacionalL(GyhGrammarParser.ExpressaoRelacionalLContext ctx);
	/**
	 * Visit a parse tree produced by {@link GyhGrammarParser#termoRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermoRelacional(GyhGrammarParser.TermoRelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GyhGrammarParser#opRel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpRel(GyhGrammarParser.OpRelContext ctx);
	/**
	 * Visit a parse tree produced by {@link GyhGrammarParser#operadorBooleano}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorBooleano(GyhGrammarParser.OperadorBooleanoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GyhGrammarParser#listaComandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaComandos(GyhGrammarParser.ListaComandosContext ctx);
	/**
	 * Visit a parse tree produced by {@link GyhGrammarParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(GyhGrammarParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GyhGrammarParser#comandoAtribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoAtribuicao(GyhGrammarParser.ComandoAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GyhGrammarParser#comandoEntrada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoEntrada(GyhGrammarParser.ComandoEntradaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GyhGrammarParser#comandoSaida}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoSaida(GyhGrammarParser.ComandoSaidaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GyhGrammarParser#comandoCondicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoCondicao(GyhGrammarParser.ComandoCondicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GyhGrammarParser#comandoRepeticao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoRepeticao(GyhGrammarParser.ComandoRepeticaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GyhGrammarParser#subAlgoritmo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubAlgoritmo(GyhGrammarParser.SubAlgoritmoContext ctx);
}