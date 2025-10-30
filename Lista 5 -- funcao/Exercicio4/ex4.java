package Exercicio4;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numeral = 0;

        System.out.print("Informe um numero: ");
        numeral = scan.nextInt();

        int resultado = fatorar(numeral);

        printar(resultado);

    }

    public static int fatorar(int num){
        int resultado = 1;
        if(num == 0){
            return 1;
        }
        return num*fatorar(num-1);
    }

    public static void printar(int resultado){
        System.out.println(resultado);
    }
}
