#!/bin/bash

echo "=========================================="
echo "RELATÓRIO DE TESTES DO COMPILADOR"
echo "=========================================="
echo ""

# Teste Léxico
echo "▶ TESTES LÉXICOS"
echo "==========================================="
for i in 0 1 2 3; do
    file="src/testes/testeLexico/programa$i.gyh"
    if [ -f "$file" ]; then
        echo ""
        echo "programa$i.gyh:"
        result=$(mvn exec:java -Dexec.mainClass="main" -Dexec.args="$file" -q 2>&1)
        if echo "$result" | grep -q "COMPILAÇÃO CONCLUÍDA"; then
            echo "  ✓ Compilação com sucesso"
        elif echo "$result" | grep -q "ANÁLISE LÉXICA FALHADA"; then
            echo "  ✗ Erro Léxico (detectado)"
            echo "$result" | grep "Erro Léxico" | head -2 | sed 's/^/    /'
        elif echo "$result" | grep -q "✗ ERRO"; then
            echo "  ✗ Erro detectado"
        fi
    fi
done

# Teste Sintático
echo ""
echo ""
echo "▶ TESTES SINTÁTICOS"
echo "==========================================="
for i in 1 2 3; do
    file="src/testes/testeSintatico/programa$i.gyh"
    if [ -f "$file" ]; then
        echo ""
        echo "programa$i.gyh:"
        result=$(mvn exec:java -Dexec.mainClass="main" -Dexec.args="$file" -q 2>&1)
        if echo "$result" | grep -q "COMPILAÇÃO CONCLUÍDA"; then
            echo "  ✓ Compilação com sucesso"
        elif echo "$result" | grep -q "ANÁLISE LÉXICA FALHADA"; then
            echo "  ✗ Erro Léxico"
        elif echo "$result" | grep -q "ANÁLISE SINTÁTICA FALHADA"; then
            echo "  ✗ Erro Sintático (detectado)"
            echo "$result" | grep "Erro Sintático" | head -1 | sed 's/^/    /'
        elif echo "$result" | grep -q "✗ ERROS ENCONTRADOS"; then
            echo "  ✗ Erro Semântico (detectado)"
            echo "$result" | grep "Erro Semântico" | head -1 | sed 's/^/    /'
        fi
    fi
done

# Teste Semântico
echo ""
echo ""
echo "▶ TESTES SEMÂNTICOS"
echo "==========================================="
for i in 1 2 3; do
    file="src/testes/testeSemantico/programa$i.gyh"
    if [ -f "$file" ]; then
        echo ""
        echo "programa$i.gyh:"
        result=$(mvn exec:java -Dexec.mainClass="main" -Dexec.args="$file" -q 2>&1)
        if echo "$result" | grep -q "COMPILAÇÃO CONCLUÍDA"; then
            echo "  ✓ Compilação com sucesso"
        elif echo "$result" | grep -q "✗ ERROS ENCONTRADOS"; then
            echo "  ✗ Erro Semântico (detectado)"
            echo "$result" | grep "Erro Semântico" | head -1 | sed 's/^/    /'
        else
            echo "  ℹ Resultado: $(echo "$result" | grep -E "✓|✗" | head -1)"
        fi
    fi
done

echo ""
echo "=========================================="
