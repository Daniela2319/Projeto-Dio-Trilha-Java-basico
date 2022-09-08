## Estrutura Condicionais

A estrutura condicionais possibilita a escolha de um grupo de ações e comportamentos a serem executados quando determinadas condições são ou não satisfeitas. A estrutura condicional pode ser `Simples ou Composta`.


## Condicional Simples

Quando ocorre uma validação de execução de fluxo somente quando a condição for positiva, considerando como estrutura simples.


> `if`  (valorSolicitado < saldo)      
> saldo = saldo - valorSolicitado;       
> System.out.printl(saldo);
 

## Condicional Composta

Algumas vezes o nosso programa deverá seguir mais de uma jornada de execução condicionada a uma regra de négocio, este cenário é denominado. Estrutura Condicional Composta.

>`if` (valorSolicitado < saldo){     
    saldo = saldo - valorSolicitado;    
    System.out.printl("Novo Saldo" + Saldo);   
}   `else`     
    System.out.printl("Saldo Insuficiente");


## Condicional Encadeadas

Em um controle de fluxo condicional, nem sempre nos limitamos ao se (if) e se não (else), podemos ter uma terceira, quarta ou inumeras condições.

int nota = 8;

        if (nota >= 7){
        System.out.println("Aprovado");

        }else if (nota >= 5 && nota < 7){
        System.out.println("Prova Recuperação");

        }else
        System.out.println("Reprovado");


## Condição Ternária

Como vimos em operadores, podemos abreviar nosso algoritimo condicional refatorando com o conceito de operador ternário.
Vamos refatorar os exemplos acima para ilustrar o pode deste recurso:



>int nota = 7;
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println("Resultado:  " + resultado);


Realmente deixa o código mas organizado e limpo na sua aréa de trabalho.

## Switch Case

A estrutura `Switch Case` compara o valor de cada caso o da variável sequencialmente, e sempre que encontra um valor correspondente, executa o código associado ao caso.
Para evitar que as comparações continuem a ser executadas após um caso correspondente ter sido encontrado, acresentamos o comando `break` no final de cada bloco de código. O comando `break` quando executado, encerra a execução das estrutura onde ele se encontra.

String sigla = "G";
    
    switch (sigla){
        case "P" :{
            System.out.println("Pequeno");
            break;
        }
        case "M" : {
            System.out.println("Médio");
            break;
        }
        case "G" : {
            System.out.println("Grande");
        }
        default:
        System.out.println("Indefinido");
    }    
 
 



    

