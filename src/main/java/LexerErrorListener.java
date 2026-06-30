import org.antlr.v4.runtime.*;
import java.util.ArrayList;
import java.util.List;

public class LexerErrorListener extends BaseErrorListener {
    private List<String> errors = new ArrayList<>();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line,
                            int charPositionInLine, String msg, RecognitionException e) {
        String error = String.format("Erro Léxico na linha %d, posição %d: %s", 
                                    line, charPositionInLine, msg);
        errors.add(error);
        System.err.println(error);
    }

    public List<String> getErrors() {
        return errors;
    }

    public boolean hasErrors() {
        return !errors.isEmpty();
    }
}
