package POO_Java.Encapsulamento.Exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Termometro termometro = new Termometro();

        System.out.print("Digite a temperatura em Celsius: ");
        termometro.setTemperaturaAtual(scan.nextLine());

        System.out.println("Temperatura em Celsius: " + termometro.getTemperaturaAtual());

        scan.close();
    }
}
