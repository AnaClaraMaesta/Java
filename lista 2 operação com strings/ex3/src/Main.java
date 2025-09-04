import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Usuário: ");
        String user = sc.nextLine();

        System.out.printf("Senha: ");
        int senha = sc.nextInt();

        if(user.equals("admin") && senha==1234) {
            System.out.println("Acesso permitido");
        }
        else if (!user.equals("admin")) {
            System.out.println("Usuário inválido");
        }
        else {
            System.out.println("Senha incorreta");
        }
    }
}