package Exercicio9;
import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Escreva um numero: ");
        int num = scan.nextInt();

        try{
            if(num>0){
                System.out.println(dobro(num));
            }else{
                throw new IllegalArgumentException("Não use numeros negativos...");
            }
        }catch(IllegalArgumentException e){
            System.err.println(e.getMessage());
        }

    }
    public static int dobro(int num){
        return num*2;
    }
}

