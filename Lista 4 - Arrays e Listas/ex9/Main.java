package ex9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(14,15,19,21,5,1,9,10,13,11));

        int impares = 0, pares = 0, soma = 0, maior = nums.get(0), menor = nums.get(0);

        System.out.print("======Escolha====== \n\n1| Ver todos os numeros\n2| Exibir apenas os pares\n3| Exibir apenas os impares\n4| Soma total\n5| Maior e menor numero\nOpcao: ");
        int opcao = input.nextInt();

        switch (opcao){
            case 1:
                for(int i = 0; i < nums.size(); i++){
                    System.out.print(" | " + nums.get(i)+" | ");
                }
                break;

            case 2:
                for(int i = 0; i < nums.size(); i++){
                    if(nums.get(i)%2 == 0){
                        System.out.print(" | "+nums.get(i)+ " | ");
                    }
                }
                break;

            case 3:
                for(int i = 0; i < nums.size(); i++){
                    if(nums.get(i)%2 != 0){
                        System.out.print(" | "+nums.get(i)+ " | ");
                    }
                }
                break;

            case 4:
                System.out.println("Soma: "+soma(nums, soma));
                break;

            case 5:
                System.out.println("Maior: "+ maiorNum(nums, maior));
                System.out.println("Menor: "+ menorNum(nums, menor));
                break;

            default:
                System.out.println("Algo deu errado, tente novamente....");
                return;
        }
    }

    public static int maiorNum(ArrayList<Integer> nums, int maior){

        for (int i = 0; i < nums.size(); i++) {
            if (maior < nums.get(i)) {
                maior =  nums.get(i);
            }
        }
        return maior;
    }

    public static int menorNum(ArrayList<Integer> nums, int menor){
        for (int i = 0; i < nums.size(); i++) {
            if (menor > nums.get(i)) {
                menor =  nums.get(i);
            }
        }

        return menor;
    }

    public static int soma(ArrayList<Integer> nums, int soma){
        for (int i = 0; i < nums.size(); i++) {
            soma += nums.get(i);
        }
        return soma;
    }
}
