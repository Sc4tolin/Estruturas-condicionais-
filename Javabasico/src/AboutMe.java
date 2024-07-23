import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


public class AboutMe {

    //Try define um bloco de codigo para ser testado caso ocorra o erro no bloco Try 
    // finally define um bloco de codigo a ser executado independente se ocorrer um erro


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        try{ 

        System.out.println("Digite seu Nome");
        String nome = sc.nextLine();

        System.out.println("Digite seu sobrenome");
        String sobreNome = sc.nextLine();

        System.out.println("Digite sua Idade");
        int idade = sc.nextInt();

        System.out.println("Digite sua Altura ");

        double altura = sc.nextDouble();}
        catch  (InputMismatchException e) {
            System.out.println( "Os campos Idade e altura precisam ser numericos.");
            

        }



    }
    
    
}
