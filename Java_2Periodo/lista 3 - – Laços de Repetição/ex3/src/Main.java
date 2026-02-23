import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int limite=0, senha=0;

        System.out.print("username: ");
        String user = input.nextLine();

        System.out.print("password (apenas numeros): ");
        try{
            senha = input.nextInt();
            input.nextLine();
        }catch(InputMismatchException e){
            System.out.println("A senha so pode ser numeros");
            input.nextLine();
        }

        while(!user.equals("admin") || senha!=1234){
            limite++;

            System.out.print("username: ");
            user = input.nextLine();

            System.out.print("password: ");
            try{
                senha = input.nextInt();
                input.nextLine(); //tira o enter
            }catch(InputMismatchException e){ //codigo caso o erro ocorra
                System.out.println("A senha so pode ser numeros");
                input.nextLine();
                continue;
            }

            if(user.equals("admin") && senha==1234){
                System.out.println("Parabéns! Usuário logado");
                break;
            }

            if(user.equals("admin") && senha!=1234){
                System.out.println("senha incorreta");
            }else{
                System.out.println("Credenciais incorretas");
                continue;
            }

            if(limite==3){
                System.out.println("Tentativas esgotadas, tente novamente mais tarde");
                break;
            }
        }
    }
}