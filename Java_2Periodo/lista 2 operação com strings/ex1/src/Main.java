import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.printf("Informe uma palavra: ");
        String palavra = sc.nextLine();

        int tamanho = contarCaracters(palavra);

        if(tamanho<20){
            System.out.println("Palavra muito pequena");
        }
        else if(tamanho>20){
            System.out.println("Palavra muito grande");
        }
        else{
            System.out.println("Palavra do tamanho ideal");
        }

        sc.close();
    }

    public static int contarCaracters(String texto){
        return texto.length();
    }
}

