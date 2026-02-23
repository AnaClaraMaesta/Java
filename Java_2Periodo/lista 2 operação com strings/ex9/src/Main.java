import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean exit = false;


        System.out.print("Menu: \n1| Pizza Calabresa\n2| Pizza Mussarela\n3| Pizza Frango\n4| Refrigerante\n5| Suco\nOpcao: ");
        int escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("R$ 40,00");
                break;

            case 2:
                System.out.println("R$ 38,00");
                break;

            case 3:
                System.out.println("R$ 42,00");
                break;

            case 4:
                System.out.println("R$ 8,00");
                break;

            case 5:
                System.out.println("R$ 10,00");
                break;

            default:
                 System.out.println("Invalido...");
            }
    }
}