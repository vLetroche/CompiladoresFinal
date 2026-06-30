#!/bin/bash

# Compilar primeiro
mvn clean compile -q 2>/dev/null

echo "cod/programa0.gyh cod/programa1.gyh cod/programa2.gyh cod/programa3.gyh"
echo "cod/programa4.gyh cod/programa5.gyh cod/programa6.gyh"
echo "cod/programa7.gyh cod/programa8.gyh cod/programa9.gyh"
echo "cod/programa10.gyh cod/programa11.gyh cod/programa12.gyh"
echo ""
echo "-----------------------------------------------"
echo ""

# Testar testes léxicos
for dir in src/testes/testeLexico; do
    for file in "$dir"/programa*.gyh; do
        if [ -f "$file" ]; then
            filename=$(basename "$file")
            output=$(mvn exec:java -Dexec.mainClass="main" -Dexec.args="$file" -q 2>&1)
            
            if echo "$output" | grep -q "ANÁLISE LÉXICA FALHADA"; then
                # Extrair mensagem de erro
                error=$(echo "$output" | grep "Erro Léxico" | head -1 | sed 's/Erro Léxico na linha [0-9]*, posição [0-9]*: //')
                echo "cod/$filename	ERRO Lexico: $error"
            else
                echo "cod/$filename	ok"
            fi
        fi
    done
done

# Testar testes sintáticos
for dir in src/testes/testeSintatico; do
    for file in "$dir"/programa*.gyh; do
        if [ -f "$file" ]; then
            filename=$(basename "$file")
            output=$(mvn exec:java -Dexec.mainClass="main" -Dexec.args="$file" -q 2>&1)
            
            if echo "$output" | grep -q "ANÁLISE LÉXICA FALHADA"; then
                error=$(echo "$output" | grep "Erro Léxico" | head -1 | sed 's/Erro Léxico na linha [0-9]*, posição [0-9]*: //')
                echo "cod/$filename	ERRO Lexico: $error"
            elif echo "$output" | grep -q "ANÁLISE SINTÁTICA FALHADA"; then
                error=$(echo "$output" | grep "Erro Sintático" | head -1 | sed 's/Erro Sintático na linha [0-9]*, posição [0-9]*: //')
                echo "cod/$filename	ERRO Sintatico: $error"
            elif echo "$output" | grep -q "✗ ERROS ENCONTRADOS"; then
                error=$(echo "$output" | grep "Erro Semântico" | head -1 | sed 's/  - //')
                echo "cod/$filename	ERRO Semantico: $error"
            else
                echo "cod/$filename	ok"
            fi
        fi
    done
done

# Testar testes semânticos
for dir in src/testes/testeSemantico; do
    for file in "$dir"/programa*.gyh; do
        if [ -f "$file" ]; then
            filename=$(basename "$file")
            output=$(mvn exec:java -Dexec.mainClass="main" -Dexec.args="$file" -q 2>&1)
            
            if echo "$output" | grep -q "✗ ERROS ENCONTRADOS"; then
                error=$(echo "$output" | grep "Erro Semântico" | head -1 | sed 's/  - //')
                echo "cod/$filename	ERRO Semantico: $error"
            else
                echo "cod/$filename	ok"
            fi
        fi
    done
done
