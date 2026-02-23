import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Informe o valor do produto; ");
        float preco = sc.nextFloat();

        Produto Produto = new Produto(preco);

        System.out.println("O valor do produto passará a ser: " + Produto.aplicarDesconto());
    }
}