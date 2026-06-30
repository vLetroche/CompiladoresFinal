public class GyhProgram {
    private symbolTable varTable;

    public void generateTarget(){
        StringBuilder str = new StringBuilder();

        str.append("#include<stdio.h>\n");
        str.append("#include<stdlib.h>\n");
        str.append("void main(){\n");
        for(Symbol symbol : varTable.getAllSymbols()){
            str.append(symbol.generateCode());

            
            if(symbol.getType() == Symbol.REAL){
                str.append("float ");
            } else if(symbol.getType() == Symbol.INT){
                str.append("int ");
            }
            str.append(symbol.getName());
            str.append(" = ");
            str.append(symbol.getValue());
            str.append(";\n");
        }
    }
}
