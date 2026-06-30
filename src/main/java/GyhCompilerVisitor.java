import org.antlr.v4.runtime.tree.ParseTree;
import java.util.*;

public class GyhCompilerVisitor extends GyhGrammarBaseListener {
    private SymbolTable symbolTable;
    private StringBuilder codeBuffer;
    private List<String> errors;
    private List<String> warnings;

    public GyhCompilerVisitor() {
        this.symbolTable = new SymbolTable();
        this.codeBuffer = new StringBuilder();
        this.errors = new ArrayList<>();
        this.warnings = new ArrayList<>();
    }

    @Override
    public void enterPrograma(GyhGrammarParser.ProgramaContext ctx) {
        System.out.println("Iniciando análise do programa...");
    }

    @Override
    public void exitPrograma(GyhGrammarParser.ProgramaContext ctx) {
        System.out.println("Análise do programa concluída!");
    }

    @Override
    public void exitDeclaracao(GyhGrammarParser.DeclaracaoContext ctx) {
        String varName = ctx.Var().getText();
        int type = ctx.tipoVar().PCInt() != null ? Symbol.INT : Symbol.REAL;
        
        // Verificar redeclaração
        if (symbolTable.exists(varName)) {
            errors.add("Erro Semântico: Variável '" + varName + "' já foi declarada!");
        } else {
            Symbol symbol = new Symbol(varName, type, "0");
            symbolTable.add(symbol);
            System.out.println("[ANÁLISE] Variável declarada: " + varName + " (tipo: " + (type == Symbol.INT ? "INT" : "REAL") + ")");
        }
    }

    @Override
    public void exitComandoAtribuicao(GyhGrammarParser.ComandoAtribuicaoContext ctx) {
        String varName = ctx.Var().getText();
        
        if (!symbolTable.exists(varName)) {
            errors.add("Erro Semântico: Variável '" + varName + "' não foi declarada!");
        } else {
            String expression = validarEConverterExpressaoAritmetica(ctx.expressaoAritmetica());
            codeBuffer.append("    ").append(varName).append(" = ").append(expression).append(";\n");
        }
    }

    /**
     * Valida e converte expressão aritmética, verificando variáveis
     */
    private String validarEConverterExpressaoAritmetica(GyhGrammarParser.ExpressaoAritmeticaContext ctx) {
        if (ctx == null) return "0";
        
        String texto = ctx.getText();
        
        // Extrair todas as variáveis do texto
        String[] tokens = texto.split("[+\\-/*()\\s]+");
        for (String token : tokens) {
            if (token.isEmpty()) continue;
            
            // Verificar se é um número
            if (token.matches("\\d+(\\.\\d+)?")) continue;
            
            // Verificar se é uma variável
            if (token.matches("[a-z][a-zA-Z0-9]*")) {
                if (!symbolTable.exists(token)) {
                    errors.add("Erro Semântico: Variável '" + token + "' não foi declarada!");
                }
            }
        }
        
        return texto;
    }

    @Override
    public void exitComandoEntrada(GyhGrammarParser.ComandoEntradaContext ctx) {
        String varName = ctx.Var().getText();
        
        if (!symbolTable.exists(varName)) {
            errors.add("Erro Semântico: Variável '" + varName + "' não foi declarada!");
        } else {
            Symbol symbol = symbolTable.get(varName);
            if (symbol.getType() == Symbol.INT) {
                codeBuffer.append("    scanf(\"%d\", &").append(varName).append(");\n");
            } else {
                codeBuffer.append("    scanf(\"%f\", &").append(varName).append(");\n");
            }
        }
    }

    @Override
    public void exitComandoSaida(GyhGrammarParser.ComandoSaidaContext ctx) {
        if (ctx.Var() != null) {
            String varName = ctx.Var().getText();
            if (!symbolTable.exists(varName)) {
                errors.add("Erro Semântico: Variável '" + varName + "' não foi declarada!");
            } else {
                Symbol symbol = symbolTable.get(varName);
                if (symbol.getType() == Symbol.INT) {
                    codeBuffer.append("    printf(\"%d\\n\", ").append(varName).append(");\n");
                } else {
                    codeBuffer.append("    printf(\"%f\\n\", ").append(varName).append(");\n");
                }
            }
        } else if (ctx.STRING() != null) {
            String string = ctx.STRING().getText();
            codeBuffer.append("    printf(").append(string).append(");\n");
        }
    }

    @Override
    public void exitComandoCondicao(GyhGrammarParser.ComandoCondicaoContext ctx) {
        String expression = validarEConverterExpressaoRelacional(ctx.expressaoRelacional());
        codeBuffer.append("    if (").append(expression).append(") {\n");
        codeBuffer.append("    }\n");
        
        if (ctx.comando().size() > 1) {
            codeBuffer.append("    else {\n");
            codeBuffer.append("    }\n");
        }
    }

    @Override
    public void exitComandoRepeticao(GyhGrammarParser.ComandoRepeticaoContext ctx) {
        String expression = validarEConverterExpressaoRelacional(ctx.expressaoRelacional());
        codeBuffer.append("    while (").append(expression).append(") {\n");
        codeBuffer.append("    }\n");
    }

    /**
     * Valida e converte expressão relacional, verificando variáveis e convertendo operadores
     */
    private String validarEConverterExpressaoRelacional(GyhGrammarParser.ExpressaoRelacionalContext ctx) {
        if (ctx == null) return "1";
        
        String texto = ctx.getText();
        
        // Primeiro, adiciona espaços ao redor dos operadores para facilitar parsing
        String processado = texto;
        processado = processado.replaceAll("([a-zA-Z0-9])E([a-zA-Z0-9])", "$1 E $2");  // adiciona espaço: "num3Enum2" -> "num3 E num2"
        processado = processado.replaceAll("([a-zA-Z0-9])OU([a-zA-Z0-9])", "$1 OU $2"); // adiciona espaço: "num1OUnum2" -> "num1 OU num2"
        
        // Valida todas as variáveis presentes
        String[] tokens = processado.split("[<>=!()+-/*\\s]+");
        for (String token : tokens) {
            if (token.isEmpty() || token.equals("E") || token.equals("OU")) continue;
            
            // Verificar se é um número
            if (token.matches("\\d+(\\.\\d+)?")) continue;
            
            // Verificar se é uma variável
            if (token.matches("[a-z][a-zA-Z0-9]*")) {
                if (!symbolTable.exists(token)) {
                    errors.add("Erro Semântico: Variável '" + token + "' não foi declarada!");
                }
            }
        }
        
        // Converter operadores booleanos com espaçamento correto
        String resultado = texto;
        resultado = resultado.replaceAll("([a-zA-Z0-9])E([a-zA-Z0-9])", "$1 && $2");  // "num3Enum2" -> "num3 && num2"
        resultado = resultado.replaceAll("([a-zA-Z0-9])OU([a-zA-Z0-9])", "$1 || $2"); // "num1OUnum2" -> "num1 || num2"
        
        return resultado;
    }

    /**
     * Método auxiliar para extrair texto de um contexto
     */
    private String extrairTextoDe(ParseTree ctx) {
        if (ctx == null) return "0";
        return ctx.getText();
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public StringBuilder getCodeBuffer() {
        return codeBuffer;
    }

    public List<String> getErrors() {
        return errors;
    }

    public List<String> getWarnings() {
        return warnings;
    }

    public boolean hasErrors() {
        return !errors.isEmpty();
    }
}
