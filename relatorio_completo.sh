#!/bin/bash

echo "╔════════════════════════════════════════════════════════════════╗"
echo "║       RELATÓRIO FINAL - TESTES DO COMPILADOR GYH             ║"
echo "╚════════════════════════════════════════════════════════════════╝"
echo ""

mvn clean compile -q 2>/dev/null

# Arquivo de relatório
RELATORIO="RELATORIO_TESTES.txt"
> $RELATORIO

# Cores
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
BLUE='\033[0;34m'
NC='\033[0m'

# Contadores
total=0
sucesso=0
erro_lexico=0
erro_sintatico=0
erro_semantico=0

# Função para testar um programa
testar_programa() {
    local arquivo=$1
    local nome=$(basename "$arquivo" .gyh)
    local categoria=$(basename $(dirname "$arquivo"))
    
    total=$((total + 1))
    
    # Executar compilador
    local resultado=$(mvn exec:java -Dexec.mainClass="main" -Dexec.args="$arquivo" -q 2>&1)
    
    # Inicializar resultado
    local status="DESCONHECIDO"
    local tipo_erro=""
    local descricao=""
    
    # Analisar resultado
    if echo "$resultado" | grep -q "✓ COMPILAÇÃO CONCLUÍDA COM SUCESSO"; then
        status="✅ SUCESSO"
        sucesso=$((sucesso + 1))
        descricao="Compilado com sucesso"
    elif echo "$resultado" | grep -q "ANÁLISE LÉXICA FALHADA"; then
        status="❌ ERRO LÉXICO"
        erro_lexico=$((erro_lexico + 1))
        tipo_erro="Análise Léxica"
        # Extrair primeira linha de erro
        descricao=$(echo "$resultado" | grep "Erro Léxico" | head -1)
    elif echo "$resultado" | grep -q "ANÁLISE SINTÁTICA FALHADA"; then
        status="❌ ERRO SINTÁTICO"
        erro_sintatico=$((erro_sintatico + 1))
        tipo_erro="Análise Sintática"
        descricao=$(echo "$resultado" | grep "Erro Sintático" | head -1)
    elif echo "$resultado" | grep -q "✗ ERROS ENCONTRADOS"; then
        status="❌ ERRO SEMÂNTICO"
        erro_semantico=$((erro_semantico + 1))
        tipo_erro="Análise Semântica"
        descricao=$(echo "$resultado" | grep "Erro Semântico" | head -1)
    else
        status="⚠️  DESCONHECIDO"
        descricao="Resultado não identificado"
    fi
    
    # Exibir no terminal
    printf "%-40s %s\n" "$categoria/$nome" "$status"
    
    # Adicionar ao relatório
    echo "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" >> $RELATORIO
    echo "Arquivo: $arquivo" >> $RELATORIO
    echo "Status: $status" >> $RELATORIO
    if [ ! -z "$tipo_erro" ]; then
        echo "Tipo de Erro: $tipo_erro" >> $RELATORIO
        echo "Descrição: $descricao" >> $RELATORIO
    else
        echo "Descrição: $descricao" >> $RELATORIO
    fi
    echo "" >> $RELATORIO
}

echo ""
echo "╔════════════════════════════════════════════════════════════════╗"
echo "║ TESTES LÉXICOS (testeLexico/)                                  ║"
echo "╚════════════════════════════════════════════════════════════════╝"
echo ""

for arquivo in src/testes/testeLexico/programa*.gyh; do
    if [ -f "$arquivo" ]; then
        testar_programa "$arquivo"
    fi
done

echo ""
echo "╔════════════════════════════════════════════════════════════════╗"
echo "║ TESTES SINTÁTICOS (testeSintatico/)                            ║"
echo "╚════════════════════════════════════════════════════════════════╝"
echo ""

for arquivo in src/testes/testeSintatico/programa*.gyh; do
    if [ -f "$arquivo" ]; then
        testar_programa "$arquivo"
    fi
done

echo ""
echo "╔════════════════════════════════════════════════════════════════╗"
echo "║ TESTES SEMÂNTICOS (testeSemantico/)                            ║"
echo "╚════════════════════════════════════════════════════════════════╝"
echo ""

for arquivo in src/testes/testeSemantico/programa*.gyh; do
    if [ -f "$arquivo" ]; then
        testar_programa "$arquivo"
    fi
done

echo ""
echo "╔════════════════════════════════════════════════════════════════╗"
echo "║                        RESUMO FINAL                            ║"
echo "╚════════════════════════════════════════════════════════════════╝"
echo ""
echo "Total de testes:        $total"
echo -e "${GREEN}✅ Compilações bem-sucedidas: $sucesso${NC}"
echo -e "${RED}❌ Erros Léxicos: $erro_lexico${NC}"
echo -e "${RED}❌ Erros Sintáticos: $erro_sintatico${NC}"
echo -e "${RED}❌ Erros Semânticos: $erro_semantico${NC}"
echo ""
echo "Relatório completo salvo em: $RELATORIO"
echo ""
