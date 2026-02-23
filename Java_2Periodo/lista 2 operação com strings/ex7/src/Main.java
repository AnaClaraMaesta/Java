import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Primeira palavra: ");
        String palavra1 = sc.nextLine();
        System.out.println("Segunda palavra: ");
        String palavra2 = sc.nextLine();
        System.out.println("Palavra digitada: ");
        String palavra3 = sc.nextLine();

        if (palavra1.length() > palavra2.length() && palavra1.length() > palavra3.length()) {
            System.out.println("A maior palavra é: " + palavra1);
        }
        else if(palavra2.length() > palavra1.length() && palavra2.length() > palavra3.length()) {
            System.out.println("A maior palavra é: " + palavra2);
        }
        else if(palavra3.length() > palavra1.length() && palavra3.length() > palavra2.length()) {
            System.out.println("A maior palavra é: " + palavra3);
        }
        else {
            System.out.println("Duas ou mais palavras com o mesmo tamanho");
        }
    }
}