package ex6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] meses = new int[12][];
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for(int i=0; i<meses.length; i++){
            meses[i] = new int[diasPorMes[i]];
            for(int j=0; j<meses[i].length; j++){
                meses[i][j] = j+1;
            }
        }

        String[] nomeMeses = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};

        System.out.print("Escolha um mês (1-12): ");
        int mesEscolha = sc.nextInt();

        if(mesEscolha < 1 || mesEscolha > 12){
            System.out.print("Escolha invalida...");
            return;
        }

        System.out.print("  ==="+nomeMeses[mesEscolha-1]+"===\n");

        for(int i : meses[mesEscolha-1]){ //eh a mesma coisa de falar que um valor vai receber o outro
            System.out.printf("%02d ", i);
            if(i%7==0){
                System.out.println();
            }
        }
    }
}
