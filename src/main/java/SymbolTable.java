import java.util.ArrayList;
import java.util.HashMap;

public class SymbolTable {
    private HashMap<String, Symbol> table;

    public ArrayList<Symbol> getAllSymbols() {
        return new ArrayList<>(table.values());
    }

    public SymbolTable() {
        this.table = new HashMap<>();
    }

    public void add(Symbol symbol) {
        table.put(symbol.getName(), symbol);
    }

    public boolean exists(String name) {
        return table.containsKey(name);
    }

    public Symbol get(String name) {
        return table.get(name);
    }
}
