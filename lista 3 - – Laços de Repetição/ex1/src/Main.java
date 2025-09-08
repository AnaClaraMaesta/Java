import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int limite, cont=0;

        System.out.println("Infome: ");
        limite = sc.nextInt();

        while(cont <= limite)
        {
            if(cont%2 == 0)
            {

                System.out.println("\n" + cont);
                cont++;
            }
            else
            {
                cont++;
            }
        }
    }
}