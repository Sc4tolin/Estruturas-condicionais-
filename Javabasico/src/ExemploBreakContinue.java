public class ExemploBreakContinue {

    public static void main(String[] args) {
        
        for (int numero = 1; numero <= 5; numero ++) {

            if (numero == 3 ){
                continue; // ele pula um numero de acordo com a condiçao
                //break para de acordo com a condição
                
            }
            System.out.println(numero);
        }
    }
    
}
