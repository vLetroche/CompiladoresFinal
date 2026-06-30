#!/bin/bash

# Script de teste para o compilador GYH

JAVA_CMD="mvn exec:java -Dexec.mainClass=main -Dexec.args"

# Cores para output
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
NC='\033[0m' # No Color

echo "================================================================"
echo "TESTE 1: ANÁLISE LÉXICA"
echo "================================================================"

for i in {0..12}; do
    arquivo="/workspaces/CompiladoresFinal/src/testes/testeLexico/programa${i}.gyh"
    if [ -f "$arquivo" ]; then
        echo -e "\n${YELLOW}Testando $arquivo${NC}"
        cd /workspaces/CompiladoresFinal && $JAVA_CMD="$arquivo" 2>&1 | grep -E "ANÁLISE|✓|✗|Erro|error|Variável" | head -20
        echo "---"
    fi
done

echo -e "\n\n================================================================"
echo "TESTE 2: ANÁLISE SINTÁTICA"
echo "================================================================"

for i in {1..5}; do
    arquivo="/workspaces/CompiladoresFinal/src/testes/testeSintatico/programa${i}.gyh"
    if [ -f "$arquivo" ]; then
        echo -e "\n${YELLOW}Testando $arquivo${NC}"
        cd /workspaces/CompiladoresFinal && $JAVA_CMD="$arquivo" 2>&1 | grep -E "ANÁLISE|✓|✗|Erro|error|Variável" | head -20
        echo "---"
    fi
done

echo -e "\n\n================================================================"
echo "TESTE 3: ANÁLISE SEMÂNTICA"
echo "================================================================"

for i in {1..5}; do
    arquivo="/workspaces/CompiladoresFinal/src/testes/testeSemantico/programa${i}.gyh"
    if [ -f "$arquivo" ]; then
        echo -e "\n${YELLOW}Testando $arquivo${NC}"
        cd /workspaces/CompiladoresFinal && $JAVA_CMD="$arquivo" 2>&1 | grep -E "ANÁLISE|✓|✗|Erro|error|Variável" | head -20
        echo "---"
    fi
done
