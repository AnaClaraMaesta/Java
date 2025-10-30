package Exercicio2;
import java.util.*;

public class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] a = new double[5];
        double[] b = new double[5];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Valores primeiro Array: ");
            a[i] = scan.nextDouble();
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println("Valores segundo Array: ");
            b[i] = scan.nextDouble();
        }

        double produto = escalar(a,b);
        System.out.println(produto);
    }

    public static double escalar(double[] a, double[] b) {
        double produto=0;
        for(int j=0; j<a.length; j++){
            produto += (a[j]*b[j]);
        }
        return produto;
    }
}
