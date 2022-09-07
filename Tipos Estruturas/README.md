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
    

