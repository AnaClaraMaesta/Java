import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int n = sc.nextInt();
        int c = 1,e=0;
        System.out.println(" " + e + "\n " + c);

        for(int i=0; i<n; i++){
            int prox = e + c;
            e = c;
            c = prox;

            System.out.println(" "+prox);
        }
    }
}