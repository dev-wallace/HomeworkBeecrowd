import java.util.Scanner;

public class AreaDireita {
    public static void areaDireita(){
               Scanner sc = new Scanner(System.in);

        double matrizM[][] = new double[12][12];

        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM.length; j++) {
                matrizM[i][j] = sc.nextDouble();
            }
        }

        double soma = 0;

        for (int i = 0; i < matrizM.length; i++) {
            for (int j = i+1; j < matrizM.length; j++) {
                soma += matrizM[i][j];
            }
        }
        sc.close();    
    }

}
