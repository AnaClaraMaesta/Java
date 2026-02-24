package POO_Java.Polimorfismo.Exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o tipo de forma: ");
        System.out.println("1 - Quadrado\n2 - Círculo");
        int tipoForma = scan.nextInt();

        switch (tipoForma) {
            case 1:
                Forma forma = new Quadrado();
                forma.calcularArea();
                break;
            case 2:
                Forma forma2 = new Circulo();
                forma2.calcularArea();
                break;
            default:
                System.out.println("Tipo de forma inválido.");
        }
        scan.close();
    }
}
