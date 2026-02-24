package POO_Java.Encapsulamento.Exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Quantos produtos quer adicionar?: ");
        Produto.adicionarProduto(scan.nextInt());

        scan.close();
    }
}
