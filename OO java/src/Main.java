import Exercicio1.Celular;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Celular cell = new Celular();

        cell.marca = "Samsung";
        cell.modelo = "blackbarry";
        cell.bateria = 78;

        System.out.printf("Celular:\nMarca: %s\nModelo: %s\nBateria: %d ", cell.marca, cell.modelo, cell.bateria);
        System.out.println("Escolha:\n1| Fazer Ligação\n2|Carregar");
        int escolha = scan.nextInt();

        switch (escolha){
            case 1:
                cell.fazerLigacao();
                break;

            case 2:
                cell.carregar(cell.bateria);
                break;

            default:
                System.out.println("Algo deu errado...");
                break;
        }

    }
}
