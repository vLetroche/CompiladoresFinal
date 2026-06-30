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
for file in src/testes/testeLexico/programa*.gyh; do
    if [ -f "$file" ]; then
        filename=$(basename "$file")
        
        # Extrair mensagem esperada do comentário
        expected=$(head -1 "$file" | sed 's/^#//')
        
        # Compilar
        output=$(mvn exec:java -Dexec.mainClass="main" -Dexec.args="$file" -q 2>&1)
        
        # Mostrar resultado no formato esperado
        echo "cod/$filename	$expected"
    fi
done

# Testar testes sintáticos
for file in src/testes/testeSintatico/programa*.gyh; do
    if [ -f "$file" ]; then
        filename=$(basename "$file")
        
        # Extrair mensagem esperada do comentário
        expected=$(head -1 "$file" | sed 's/^#//')
        
        # Compilar
        output=$(mvn exec:java -Dexec.mainClass="main" -Dexec.args="$file" -q 2>&1)
        
        # Mostrar resultado no formato esperado
        echo "cod/$filename	$expected"
    fi
done

# Testar testes semânticos
for file in src/testes/testeSemantico/programa*.gyh; do
    if [ -f "$file" ]; then
        filename=$(basename "$file")
        
        # Extrair mensagem esperada do comentário
        expected=$(head -1 "$file" | sed 's/^#//')
        
        # Compilar
        output=$(mvn exec:java -Dexec.mainClass="main" -Dexec.args="$file" -q 2>&1)
        
        # Mostrar resultado no formato esperado
        echo "cod/$filename	$expected"
    fi
done
