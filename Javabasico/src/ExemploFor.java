public class ExemploFor {

  public static void main(String[] args) {
    

    /**for (int i = 0; i <= 20; i++) {
        System.out.println("Contando I  " +  i);
        

        
    }
  */

  String alunos [] = {"FELIPE", "JONAS" , "JULIA", "MARCOS"};
  

 /**for (int x=0; x<alunos.length; x++){
    System.out.println("o aluno no indice " + x + " é " + alunos[x]);
  }*/


  for(String aluno : alunos) {
    System.out.println("Nome do aluno é " + aluno);
  }
  
    }


    
}
