public class PlanoOperadora {
    public static void main(String[] args) {
        
        // Exemplo de plano de operadora com Switch case
        String plano = "B";
        
        switch (plano){
            case "T":{
                System.out.println("5 Gb Youtube");
            }
            case "M":{
                System.out.println("Whalts e Instagram grátis");
            }
            case "B":{
                System.out.println("100 minutos de ligação");
            }
        }
    }
}
