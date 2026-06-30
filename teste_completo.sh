#!/bin/bash

# Script de teste completo para o compilador GYH
# Testa todos os programas e salva os resultados em um relatório

RESULTS_FILE="/workspaces/CompiladoresFinal/RESULTADOS_TESTES.txt"
JAR_CMD="mvn exec:java -Dexec.mainClass=main -Dexec.args"

> "$RESULTS_FILE"

echo "================================================================" >> "$RESULTS_FILE"
echo "RELATÓRIO DE TESTES DO COMPILADOR GYH" >> "$RESULTS_FILE"
echo "Data: $(date)" >> "$RESULTS_FILE"
echo "================================================================" >> "$RESULTS_FILE"
echo "" >> "$RESULTS_FILE"

# Função para testar um programa
testar_programa() {
    local arquivo="$1"
    local tipo="$2"
    
    if [ ! -f "$arquivo" ]; then
        return
    fi
    
    echo "--- Testando: $arquivo" >> "$RESULTS_FILE"
    
    cd /workspaces/CompiladoresFinal
    
    # Capturar a saída
    output=$(mvn exec:java -Dexec.mainClass=main "-Dexec.args=$arquivo" 2>&1)
    
    # Análise da saída
    if echo "$output" | grep -q "COMPILAÇÃO CONCLUÍDA COM SUCESSO"; then
        echo "✓ SUCESSO" >> "$RESULTS_FILE"
        echo "$output" | grep -E "Variáveis|Executável" >> "$RESULTS_FILE"
    elif echo "$output" | grep -q "ERROS ENCONTRADOS"; then
        echo "✗ ERRO SEMÂNTICO" >> "$RESULTS_FILE"
        echo "$output" | grep "Erro" >> "$RESULTS_FILE"
    elif echo "$output" | grep -q "Erro Sintático"; then
        echo "✗ ERRO SINTÁTICO" >> "$RESULTS_FILE"
        echo "$output" | grep "Erro" >> "$RESULTS_FILE"
    elif echo "$output" | grep -q "Erro Léxico"; then
        echo "✗ ERRO LÉXICO" >> "$RESULTS_FILE"
        echo "$output" | grep "Erro" >> "$RESULTS_FILE"
    else
        echo "? DESCONHECIDO" >> "$RESULTS_FILE"
    fi
    
    echo "" >> "$RESULTS_FILE"
}

# Teste 1: Léxico
echo "TESTE 1: ANÁLISE LÉXICA" >> "$RESULTS_FILE"
echo "========================" >> "$RESULTS_FILE"
for i in {0..12}; do
    testar_programa "/workspaces/CompiladoresFinal/src/testes/testeLexico/programa${i}.gyh" "lexico"
done

# Teste 2: Sintático
echo "TESTE 2: ANÁLISE SINTÁTICA" >> "$RESULTS_FILE"
echo "===========================" >> "$RESULTS_FILE"
for i in {1..19}; do
    testar_programa "/workspaces/CompiladoresFinal/src/testes/testeSintatico/programa${i}.gyh" "sintatico"
done

# Teste 3: Semântico
echo "TESTE 3: ANÁLISE SEMÂNTICA" >> "$RESULTS_FILE"
echo "===========================" >> "$RESULTS_FILE"
for i in {1..10}; do
    testar_programa "/workspaces/CompiladoresFinal/src/testes/testeSemantico/programa${i}.gyh" "semantico"
done

echo "" >> "$RESULTS_FILE"
echo "================================================================" >> "$RESULTS_FILE"
echo "Fim do Relatório" >> "$RESULTS_FILE"
echo "================================================================" >> "$RESULTS_FILE"

# Mostrar um resumo na tela
echo ""
echo "Testes completados! Verifique os resultados em:"
echo "$RESULTS_FILE"
echo ""
echo "Resumo rápido:"
grep "^✓\|^✗\|^?" "$RESULTS_FILE" | sort | uniq -c
