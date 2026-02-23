package ex7;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] meses = new int[12][];
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for(int i=0; i<meses.length; i++){
            meses[i] = new int[diasPorMes[i]];
            for(int j=0; j<meses[i].length; j++){
                meses[i][j] = j+1;
            }
        }

        List<String> nomeMeses = Arrays.asList("Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro");

        int indice = 0;

        for(int[] mes : meses){
            System.out.println("\n  ==="+nomeMeses.get(indice)+"===");

            for(int dias: mes){
                System.out.printf("%02d ", dias);
                if(dias%7==0){
                    System.out.println();
                }
            }
            indice++;
            System.out.println();
        }
    }
}
