import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("E-mail: ");
        String email = sc.nextLine();

        if (email.contains("@") & email.endsWith(".com")) {
            System.out.println("E-mail válido");
        }
        else{
            System.out.println("E-mail inválido");
        }

    }
}