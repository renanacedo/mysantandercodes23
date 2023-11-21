#Aula de Introdução ao Java - 9 Aulas

## 1 - Introdução ao curso
    Explicação sobre backend e frontend no desenvolvimento Web
    Tipos de Desenvolvimento que é utilizado java
        Dev Web
        Dev embarcado
        Dev app cientifica
    Linguagem antiga porem top 3 mais popular
    Intro
        Variavel e tipo primitivo
        Controle do fluxo da app
        Laços de repetição
        Instruções condicionais
        Manipulação de strings e datas
        Manipulação de array e coleção

## 2 - Setup e Instalação + Entrada e saída de dados
    Linguagem complita que precisa de ambiente próprio
    JRE - Ambiente de Execução
    Kit de Dev - JDK
        Java - site da oracle
        IDE - Integrated Developmen Envoirment
            InteliiJ

## 3 - Variáveis
    Java tutoriais da oracle - docs.oracle
    Dados primitivos
        Numéricos - a diferença é o quanto eles comportam
            byte
            short
            int - o mais comum utilizado para numeros inteiros
            long
            float - o mais comum para decimais
            double
        Palavras
            string
            char
        Booleano
            boolean
    Cast 
        transformar um tipo para outro tipo na representação

## 4 - Operadores Booleanos e tabela verdade
    Operadores lógicos
        AND = &&
            só é true quando ambos operandos são true
        OR = || 
            só é true quando pelomenos 1 operando é true
        Operador ternário
            ?
                se for true realiza algo
            :
                se não é true realiza esse

## 5 - Estruturas condicionais
    Operadores condicionais
        if 
            >= maior ou igual
            > maior
            < menor
            <= menor ou igual
        else if / else
        Verificação de casos
            switch (variavel){
                case x:
                case y:
                    print
                    break;
                case z:
                    print
                    break;
                default:
                    print
            }

## 6 - Manipulação de strings e datas
    Manipulando a string
        Deixando no printl tudo maiusculo, minusculo, quantas letras tem, verificar igualdade com outra string.
    ISO 8601 - Define como informar uma data, é padrão do java no @LocalDate
        import java.time.LocalDate;
        classe = LocalDate <variavel> = LocalDate.now();

## 7 - Laços Numericos 
    laço numerico com o FOR para contar de 1 até 10
    laços aninhados 
        for dentro de for para fazer uma tabuada

## 8 - Vetores
    