import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int constante = 14;

        System.out.println("Chute um valor: ");
        int chute = sc.nextInt();

        if (chute == constante) {
            System.out.println("Você acertou o valor da constante");
        }
        else
        {
            int diferenca =  constante - chute;
            System.out.println("o chute teve " + diferenca + " numeros de diferença");
        }
    }
}