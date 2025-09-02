import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int num = sc.nextInt();

        num += 3;
        num *= 3;
        num = num -3;

        System.out.println(" " + num);
    }
}