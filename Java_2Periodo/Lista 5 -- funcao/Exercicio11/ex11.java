package Exercicio11;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scan.nextLine();

        System.out.println(lowerCase(frase));

    }

    public static int lowerCase(String frase) {
        if(frase == null){
            throw new NullPointerException("String nao pode ser nula...");
        }

        if(frase.isEmpty()){
            return 0;
        }
        char primeiro = frase.charAt(0);
        String resto = frase.substring(1); // do 1 pra frente

        int contagem = Character.isLowerCase(primeiro)? 1:0; //condicao se sim retorna 1 se nao retorna 0

        return contagem + lowerCase(resto);
    }
}
