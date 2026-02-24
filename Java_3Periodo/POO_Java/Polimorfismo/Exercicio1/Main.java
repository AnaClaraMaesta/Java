package POO_Java.Polimorfismo.Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha a forma de pagamento:");
        System.out.println("1 - Cartão\n2 - Boleto");
        int escolha = scan.nextInt();

        switch (escolha) {
            case 1:
                FormaPagamento pagamento1 = new Cartao();
                pagamento1.processarPagamento(220.0);
                break;
        
            case 2:
                FormaPagamento pagamento2 = new boleto();
                pagamento2.processarPagamento(120.0);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        scan.close();

    }
}
