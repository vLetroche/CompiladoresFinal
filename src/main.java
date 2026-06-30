public class main {
    public static void main(String[] args)
     {
        try{
            CharStream cs = CharStreams.fromFileName("programa1.gyh");
            GyhGrammarLexer lexer = new GyhGrammarLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            GyhGrammarParser parser = new GyhGrammarParser(tokens);

            System.out.println("Compilacao ok");
            parser.programa()

        } 
        catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
