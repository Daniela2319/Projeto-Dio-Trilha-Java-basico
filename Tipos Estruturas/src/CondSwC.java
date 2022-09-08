public class CondSwC {
public static void main(String[] args) {

    //Sistema de medida usando if e else
   /*  String sigla = "M";

    if(sigla == "P")
    System.out.println("Pequeno");
    else if(sigla == "M")
    System.out.println("Médio");
    else if(sigla == "G")
    System.out.println("Grande");
    else
    System.out.println("indefinido");*/


    
    // Sistema de medida usando Switch Case
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
}

}

