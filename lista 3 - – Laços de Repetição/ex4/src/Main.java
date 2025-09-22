import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();
        String nome;
        int i=1;

        while(true){
            System.out.print("Informe "+i+"° nome: ");
            nome = sc.nextLine();

            if(nome.equals("fim")){
                System.out.println("Calculando nomes....");
                break;
            }
            else{
                nomes.add(nome);
                i++;
            }
        }
        System.out.println("Nomes: "+nomes);
    }
}