package Exercicio1;

import java.util.Scanner;
import java.util.Arrays;
public class ex1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] num = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.printf((i+1)+"° valor: ");
            num[i] = scan.nextInt();
        }
        int maior = 0;
        maior = maiorValor(num);
        System.out.printf("%d", maior);
    }

    public static int maiorValor(int[] num){
        int maior = num[0];

        for (int i = 0; i < num.length; i++) {
            if (maior < num[i]){
                maior = num[i];
            }
        }
        return maior;
    }
}
