import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor da base");
        int base = sc.nextInt();

        System.out.println("Informe o valor da altura");
        int altura = sc.nextInt();

        int area = base*altura;
        int perimetro = 2*(base+altura);

        System.out.println("Área " + area);
        System.out.println("Perímetro " + perimetro);
    }
}