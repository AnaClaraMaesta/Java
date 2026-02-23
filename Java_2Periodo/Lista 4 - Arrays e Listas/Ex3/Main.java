package Ex3;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>(Arrays.asList("Ana","Gustavo","Herick","Pedro","Samuel","William"));

        int cont=0;
        System.out.printf("Digite um nome: ");
        String chute = sc.nextLine();

        for(int a=0;a<6;a++){
            if (chute.equalsIgnoreCase(nomes.get(a))){
                cont++;
            }
        }
        System.out.println(cont + " vezes");

    }
}
