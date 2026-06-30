#!/bin/bash

JAR="target/GyhLangANTLR-1.0-SNAPSHOT.jar"
TEST_DIR="src/testes"

echo "=========================================="
echo "TESTADOR DO COMPILADOR GYH"
echo "=========================================="
echo ""

# Função para testar um arquivo
test_file() {
    local file=$1
    local name=$(basename "$file" .gyh)
    
    echo "Testando: $name"
    java -cp "$JAR" main "$file" 2>&1 | grep -E "✓|✗|Erro|COMPILAÇÃO|não encontrado"
    echo "---"
}

# Testar alguns arquivos
echo "[TESTES LÉXICOS]"
for file in "$TEST_DIR/testeLexico/programa"{0..3}".gyh"; do
    if [ -f "$file" ]; then
        test_file "$file"
    fi
done

echo ""
echo "[TESTES SINTÁTICOS]"
for file in "$TEST_DIR/testeSintatico/programa"{1..3}".gyh"; do
    if [ -f "$file" ]; then
        test_file "$file"
    fi
done

echo ""
echo "[TESTES SEMÂNTICOS]"
for file in "$TEST_DIR/testeSemantico/programa"{1..3}".gyh"; do
    if [ -f "$file" ]; then
        test_file "$file"
    fi
done
