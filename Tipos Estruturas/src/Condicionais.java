

public class Condicionais {
    public static void main(String[] args) {

        // Variaveis 
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        // Fluxo de Controle Simples
        if(valorSolicitado < saldo)      // Precisa ser verdadeiro para instrução abaixo ser executado.
        saldo = saldo - valorSolicitado;

        System.out.println(saldo);
    }


}
   
    
