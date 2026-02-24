package POO_Java.Polimorfismo.Exercicio2;

import java.util.Scanner;

public class Quadrado extends Forma{
    public void calcularArea() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a medida do lado do quadrado: ");
        double lado = scan.nextDouble();

        if(lado==0){
            System.out.println("Area: 0");
        } else {
            System.out.println("A área do quadrado é: " + lado * lado);
        }
        scan.close();
    }

}
