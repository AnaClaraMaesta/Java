import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>(6);
        int maior = 0, menor = 0;
        for(int i=0;i<6;i++){
            System.out.printf("Informe o "+(i+1)+" numero: ");
            int input = sc.nextInt();
            numeros.add(input);
        }

        maior = numeros.getFirst();
        menor = maior;

        for(int j=0;j<6;j++) {
            System.out.printf(numeros.get(j) + " ");

            if(numeros.get(j) > maior) {
                maior = numeros.get(j);
            }

            if(numeros.get(j) < menor) {
                menor = numeros.get(j);
            }
        }
        System.out.println("\nMaior: "+ maior +" Menor: " + menor);
    }
}