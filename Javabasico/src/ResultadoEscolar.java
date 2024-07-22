public class ResultadoEscolar {
/** 
    public static void main(String[] args) {

        //exemplo de condicional composta
        // exemplo de condicional encadeada (Mais de um if else // else if )

        int nota = 6;

        if (nota >= 7 ) 

            System.out.println("Aprovado !!!");

        
            
           
            
        else if ( nota >= 5 && nota < 7)
        System.out.println("Prova Recuperação ");

        
        
        
        else 
            System.out.println("Reprovado");
        

        

       


        
    }
    */


/** 
public static void main(String[] args) {
    int nota = 7;
    String resultado = nota >= 7 ? "Aprovado " : "Reprovado";
    System.out.println(resultado);
}


   */ 

   public static void main(String[] args) {
    // exemplo de condicional encadeada (Mais de um if else // else if ) Refatorado com condição ternaria.

    int nota = 7;
    String resultado = nota >= 7 ? "Aprovado " : nota >= 5 && nota <7 ?  "Recuperação"  : "Reprovado" ;
    System.out.println(resultado);
}


}
