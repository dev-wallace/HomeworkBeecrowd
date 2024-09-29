import java.util.Scanner;

public class ProgramaPreenchimentoVetorValoresDobros {

    public static void programaPreenchimentoVetorValoresDobros(){
        Scanner sc = new Scanner(System.in);
        int vetorN [] = new int [10];
       
        vetorN [0] = sc.nextInt();
        
      
  
    

       
        


     for(int i = 1; i<vetorN.length;i++){
        
        vetorN[i] = vetorN[i - 1] * 2;
        
     
    
        

   

     }
        sc.close();



        for (int i = 0; i < vetorN.length; i++) {
            System.out.println("N[" + i + "] = " + vetorN[i]);
        }

        

    }

}
