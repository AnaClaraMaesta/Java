import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double energiaCinetica = 0;
        double altura = 0;

        System.out.printf("Massa (kg): ");
        double massa = sc.nextDouble();
        System.out.printf("Velocidade (m/s): ");
        double velocidade = sc.nextDouble();

        ObjetoFisico ObjetoFisico = new ObjetoFisico(massa, velocidade, energiaCinetica, altura);

        System.out.printf("Energia cinética : " + ObjetoFisico.calcularEnergiaCinetica() + " Joules\n");
        System.out.printf("Altura equivalente: " + ObjetoFisico.alturaEquivalente() + " Metros");
    }
}