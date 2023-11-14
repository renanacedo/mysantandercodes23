#Aula de Algoritmos - 10 Aulas

## 1 - Apresentando algoritmos
    Algoritmos é como uma receita de bolo, existe uma receita e modo de preparo que deve ser seguida 
    uma sequencia de passos que segue para uma finalidade
    Para um computador essa sequencia de passos é algo detalhado, literalmente cada passo. Explicito e Bem Definido

## 2 - Fluxos Simples, Sequencial
    Construindo um Algoritmo
    Fluxo do algoritmo : Inicio - Entrada - Processamento - Saída - Final
    Entrada = Todos os dados que você (ou o usuário) precisa fornecer para o algoritimo
        Digito, click, seleção, plug in qualquer tipo de entrada fornecida pelo usuário
        Também pode ser algum tipo de dado já fornecido pelo desenvolvedor embutido no algoritmo ou buscado pelo algoritmo em alguma API
    Processamento = Toda a sintax do algoritmo que realizada o pedido de entrada, processa e gera a saída
        Pedido de entrada - Armazenamento da entrada - Junta os dados - Fornecer a saída
    Saída = O resultado esperado (ounão) do processamento
        Resultado pode ser final ou parcial no fluxo do algoritmo
    Exemplo de um algoritmo (ele fez com pseudocódigo eu utilizei como se tivesse uma linguagem (esta tipo phyton né?))
        Inicio
        name = print input ("Digite seu nome");
        saudacao = "Bom dia" + nome;
        print (saudacao);
        Fim
    
## 3 - Tipos de dados
    Numérico
        Basicamente são os numeros, seja pra qual função for: Operações (-, +, /, *), equações, afins.
        Inteiros - Pontos Flutuantes (com virgula)
    Texto
        Sequencia de caracteres: Palavra, frase, texto, afins
    Booleano
        Um tipo de dado que só tem 2 estados: Verdadeiro - Falso 
        Serve para verificar outros dados se são validos ou não
    Variavel
        É um espaço na memória que pode ser designado um valor a ela, independe do tipo do dado
        Ou seja, esse espaço armazena um dado que pode ser utilizado depois.

## 4 - Decisão
    Estruturas de decisão: algoritmo que analisa os dados com certos comandos e continua executando de formas diferentes dependendo do resultado da analise.    
        O comando SE (IF/ELSE) é um comando para estrutura de decisão.

## 5 - Repetição
    Estrutura de repetição: Comando executado numa certa quantidade determinada por sua estrutura com a utilização de uma regra (laço). 
        Existe um comando e dentro dele um laço, comando de repetição (loop) com uma regra definida que deve ser satisfeita para dar prosseguimento encerrando assim o loop

## 6 - Listas/Arrays
    Uma lista/array serve para armazenar dados, e assim otimizar a quantidade de variaveis necessarias para grandes quantidades de dados correlacionados
    Arrays podem ser de strings, numeros ou mistas
    Arrays é uma variavel porem estabelecida com sinais diferentes e contem 1 ou mais dados em si
    A posição na array é enumerada contando apartir do 0 EX: listaDeCompras ["pao","presunto","queijo"]
        Cada item esta numa posição, no caso o item "pão" esta na posição 0, "presunto" na posição 1 e "queijo" na posição 2
    
## 7 - Funções
    São "pequenos programas", algoritmos isolados para exercer alguma função especifica
    Existe parametros de entrada e uma saida, são chamadas em algum momento para exercer sua função
        Expreções de uma função "call", "return" são comuns, porque elas são "chamadas" para processar algum dado/função e "retornar" um resultado para o programa
    
## 8 - Exercícios Completo - Caixa Eletronico
    Esse exercício no curso é feito com pseudocódigo, como ainda não sei uma linguagem o sulficiente para fazer nela vou realizar com pseudocódigo tambem
        Quem sabe num futuro eu atualize esse doc utilizando alguma linguagem. 
        att: Escrevi tipo uma pseudolinguagem kkkk'

    Inicio principal
        var opcaoSelecionada string = defaut
        var valor int = 0
        var saldo int = 0
        var encerrarPrograma boolean = false

        for encerrarPrograma == false {
            call mostrarMenu = opcaoSelecionada
        if opcaoSelecionada == "a" {
            printf("Seu saldo é: ", saldo);
        }
        if else opcaoSelecionada == "b" {
            valor = input ("Digite o valor a depositar: ");
            saldo = valor + saldo;
            prinf ("Deposito efetuado");
        }
        if else opcaoSelecionada == "c" {
            valor = input ("Digite o valor a sacar: ");
            if valor > saldo {
                prinf ("Saque não permitido, saldo insuficiente");
                retunr
            }
            else {
                saldo = saldo - valor
            }
            prinf ("Saque efetuado");
        }
        if else opcaoSelecionada == "d" {
            encerrarPrograma = true
        }
        else {
            prinf ("Opção invalida, tente novamente");
        }
        }

    Inicio mostrarMenu
        var opcaoSelecionada string = "none"
        prinf ("Menu de operação");
        prinf ("[a] Mostrar saldo");
        prinf ("[b] Efetuar deposito");
        prinf ("[c] Efetuar saque");
        prinf ("[d] Finalizar");
        opcaoSelecionada = input ();
        retunr opcaoSelecionada
    
    Fim do programinha de caixa eletronico 



         

