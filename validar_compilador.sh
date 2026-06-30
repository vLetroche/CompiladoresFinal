#!/bin/bash

# Compilar
mvn clean compile -q 2>/dev/null

total=0
ok_count=0
erro_count=0

echo "VALIDACAO DO COMPILADOR"
echo "========================================"
echo ""

# Testar testes léxicos
echo "TESTES LEXICOS"
echo "----------------------------------------"
for file in src/testes/testeLexico/programa*.gyh; do
    if [ -f "$file" ]; then
        filename=$(basename "$file")
        total=$((total + 1))
        
        # Extrair mensagem esperada
        expected=$(head -1 "$file" | sed 's/^#//')
        
        # Compilar
        output=$(mvn exec:java -Dexec.mainClass="main" -Dexec.args="$file" -q 2>&1)
        
        # Verificar se é esperado erro
        if echo "$expected" | grep -q "nao tem erro\|não possui erro\|Não possui"; then
            # Esperado sem erro
            if echo "$output" | grep -q "COMPILAÇÃO CONCLUÍDA"; then
                echo "OK: $filename"
                ok_count=$((ok_count + 1))
            else
                echo "FALHA: $filename - Esperava compilar, mas deu erro"
                erro_count=$((erro_count + 1))
            fi
        else
            # Esperado com erro
            if echo "$output" | grep -q "✗"; then
                echo "OK: $filename"
                ok_count=$((ok_count + 1))
            else
                echo "FALHA: $filename - Esperava erro, mas compilou"
                erro_count=$((erro_count + 1))
            fi
        fi
    fi
done

echo ""
echo "TESTES SINTATICOS"
echo "----------------------------------------"
for file in src/testes/testeSintatico/programa*.gyh; do
    if [ -f "$file" ]; then
        filename=$(basename "$file")
        total=$((total + 1))
        
        expected=$(head -1 "$file" | sed 's/^#//')
        output=$(mvn exec:java -Dexec.mainClass="main" -Dexec.args="$file" -q 2>&1)
        
        if echo "$expected" | grep -q "nao tem erro\|não possui erro\|NAo tem\|Programa nao"; then
            if echo "$output" | grep -q "COMPILAÇÃO CONCLUÍDA"; then
                echo "OK: $filename"
                ok_count=$((ok_count + 1))
            else
                echo "FALHA: $filename - Esperava compilar"
                erro_count=$((erro_count + 1))
            fi
        else
            if echo "$output" | grep -q "✗"; then
                echo "OK: $filename"
                ok_count=$((ok_count + 1))
            else
                echo "FALHA: $filename - Esperava erro"
                erro_count=$((erro_count + 1))
            fi
        fi
    fi
done

echo ""
echo "TESTES SEMANTICOS"
echo "----------------------------------------"
for file in src/testes/testeSemantico/programa*.gyh; do
    if [ -f "$file" ]; then
        filename=$(basename "$file")
        total=$((total + 1))
        
        expected=$(head -1 "$file" | sed 's/^#//')
        output=$(mvn exec:java -Dexec.mainClass="main" -Dexec.args="$file" -q 2>&1)
        
        if echo "$expected" | grep -q "nao tem erro\|não possui erro\|Programa nao"; then
            if echo "$output" | grep -q "COMPILAÇÃO CONCLUÍDA"; then
                echo "OK: $filename"
                ok_count=$((ok_count + 1))
            else
                echo "FALHA: $filename - Esperava compilar"
                erro_count=$((erro_count + 1))
            fi
        else
            if echo "$output" | grep -q "✗"; then
                echo "OK: $filename"
                ok_count=$((ok_count + 1))
            else
                echo "FALHA: $filename - Esperava erro"
                erro_count=$((erro_count + 1))
            fi
        fi
    fi
done

echo ""
echo "========================================"
echo "RESULTADO: $ok_count OK / $total total"
echo "Taxa de acerto: $(( ok_count * 100 / total ))%"
echo "========================================"
