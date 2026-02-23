import Exercicio2.lampada;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        lampada luz = new lampada();

        luz.tipo = "LED RGB GAMER 2026 ATUALIZADO";
        luz.estaLigada = true;

        System.out.println(luz.mostrarEstado(luz.estaLigada));

        System.out.printf("Você quer apagar a luz?: \n1|sim \n2|nao\n");
        int escolha = scan.nextInt();

        switch (escolha){
            case 1:
                luz.interruptor(luz.estaLigada);
                break;

            case 2:
                System.out.println(luz.mostrarEstado(luz.estaLigada));
                break;

            default:
                System.out.println("A luz explodiu");
                break;
        }
    }
}
