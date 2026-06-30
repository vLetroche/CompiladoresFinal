#!/bin/bash
echo "========== TESTE RÁPIDO - ALGUNS PROGRAMAS =========="
echo ""

# Função para testar
test_file() {
    echo "### Teste: $1"
    mvn exec:java -Dexec.mainClass=main "-Dexec.args=$1" -q 2>&1 | grep -E "✓|✗|COMPILAÇÃO|ERROS|Variáveis|erro|Erro" | head -15
    echo ""
}

# Testes Léxicos
echo "--- TESTES LÉXICOS ---"
test_file "src/testes/testeLexico/programa0.gyh"
test_file "src/testes/testeLexico/programa2.gyh"

# Testes Sintáticos
echo "--- TESTES SINTÁTICOS ---"
test_file "src/testes/testeSintatico/programa1.gyh"
test_file "src/testes/testeSintatico/programa2.gyh"

# Testes Semânticos
echo "--- TESTES SEMÂNTICOS ---"
test_file "src/testes/testeSemantico/programa1.gyh"
test_file "src/testes/testeSemantico/programa2.gyh"
