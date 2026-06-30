#!/bin/bash

echo "=========================================="
echo "TESTE DE ALGUNS PROGRAMAS"
echo "=========================================="
echo ""

# Testar programa2 - deve dar erro (var num4 não declarada)
echo "Teste 1: programa2 (deve dar erro semântico)"
echo "-----------------------------------------"
mvn exec:java -Dexec.mainClass="main" -Dexec.args="src/testes/testeSintatico/programa2.gyh" -q 2>&1 | grep -E "✓|✗|Erro"
echo ""

# Testar programa1 - se estiver correto
echo "Teste 2: programa1 (se estiver correto)"
echo "-----------------------------------------"
mvn exec:java -Dexec.mainClass="main" -Dexec.args="src/testes/testeSintatico/programa1.gyh" -q 2>&1 | grep -E "✓|✗|Compilação|Erro"
echo ""

echo "Teste 3: programa0 léxico"
echo "-----------------------------------------"
mvn exec:java -Dexec.mainClass="main" -Dexec.args="src/testes/testeLexico/programa0.gyh" -q 2>&1 | grep -E "✓|✗|Compilação|Erro"
echo ""
