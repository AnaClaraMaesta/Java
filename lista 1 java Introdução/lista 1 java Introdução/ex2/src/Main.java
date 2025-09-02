import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        System.out.println("Informe três números: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int soma = num + num2 + num3;

        System.out.println("A soma " + soma);
    }
}