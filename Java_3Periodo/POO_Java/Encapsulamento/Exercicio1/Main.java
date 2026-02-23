package POO_Java.Encapsulamento.Exercicio1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        PerfilUsuario perfil = new PerfilUsuario();
        
        System.out.println("ID do usuário: " + perfil.getID("usuario1"));
        System.out.println("Deseja trocar de senha? (s/n)");
        String resposta = scan.nextLine();

        if(resposta.equals("s")){
            System.out.println("Digite a senha do usuário: ");
            String senha = scan.nextLine();
            System.out.println(perfil.setSenha(senha));
        }else{
            System.out.println("Senha mantida.");
        }

        scan.close();
    }
}
