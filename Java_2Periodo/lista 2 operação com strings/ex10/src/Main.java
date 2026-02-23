import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Escolhas:\n");
        System.out.println("============================");
        System.out.printf("Vermelha \nAzul \nVerde\nPreta\n");
        System.out.println("============================");
        System.out.printf("Digite a cor desejada: ");
        String escolha = input.nextLine();

        switch (escolha) {
            case "vermelha":
                System.out.println("R$ 30,00");
                break;

            case "azul":
                System.out.println("R$ 35,00");
                break;

            case "verde":
                System.out.println("R$ 40,00");
                break;

            case "preta":
                System.out.println("R$ 50,00");
                break;

            default:
                System.out.println("Produto indisponivel...");
        }
    }
}