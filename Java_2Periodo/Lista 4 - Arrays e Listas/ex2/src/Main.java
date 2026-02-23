package ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,6,64,2,3));
        int cont=0;

        System.out.printf("Informe um número: ");
        int valor = sc.nextInt();

        for(int j=0;j<10;j++){
            if(valor == num.get(j)){
                cont++;
            }
        }

        System.out.print("O numero "+valor+" apareceu :"+cont+" vezes.");
    }
}