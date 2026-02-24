package POO_Java.Polimorfismo.Exercicio2;
import java.util.Scanner;

public class Circulo extends Forma{
    @Override
    public void calcularArea() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a medida do raio do círculo: ");
        double raio = scan.nextDouble();

        if(raio==0){
            System.out.println("Area: 0");
        } else {
            System.out.printf("A área do círculo é: %.2f", Math.PI *Math.pow(raio, 2));
        }

        scan.close();
    }
}
