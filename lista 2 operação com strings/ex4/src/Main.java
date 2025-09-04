import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Primeira palavra: ");
        String palavra1 = sc.nextLine();

        System.out.printf("Segunda palavra: ");
        String palavra2 = sc.nextLine();

        if(palavra1.equals(palavra2)){
            System.out.println("São iguais");
        }else{
            System.out.println("São diferentes");
        }
    }
}