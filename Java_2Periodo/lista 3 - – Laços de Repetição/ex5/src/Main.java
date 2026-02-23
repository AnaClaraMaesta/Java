import java.util.Scanner;

public class Main {
    public static String inverterNum(int num){
        return new StringBuilder(String.valueOf(num)).reverse().toString();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite un numero: ");
        int num = sc.nextInt();

        String numInvertido = inverterNum(num);
        System.out.println(numInvertido);

        System.out.print("Informe uma palavra: ");
        String palavra = sc.next();

        if(!palavra.isEmpty()){
            String strInvertido = inverterString(palavra);
            System.out.println(strInvertido);
        }

    }
    public static String inverterString (String str){

        return new StringBuilder(str).reverse().toString();
    }
}