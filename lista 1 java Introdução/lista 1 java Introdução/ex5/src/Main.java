import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o A");
        float a = sc.nextFloat();

        System.out.println("Informe o B");
        float b = sc.nextFloat();

        System.out.println("Informe o C");
        float c = sc.nextFloat();

        float formula = 4*a + 5*b - 3*c + a*b + a*c - b*c/2;

        System.out.println("X = " + formula);
    }
}