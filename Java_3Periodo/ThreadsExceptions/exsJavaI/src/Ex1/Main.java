package Ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scan = new Scanner(System.in);

        ArrayList<Funcionario> bateramPonto = new ArrayList<Funcionario>();

        System.out.println("Adicionar quem bateu o ponto:\n1| Funcoinario\n2| Gerente");
        int choice = scan.nextInt();

        try{
            switch (choice){
                case 1:

                    System.out.println("Nome funcionario: ");
                    String nome = scan.nextLine();
                    System.out.println("Id funcionario: ");
                    String id = scan.nextLine();

                    bateramPonto.add(new Funcionario(nome, id));
                    System.out.println();

                    break;
                case 2:

                    System.out.println("Senha gerente: ");
                    String senha = scan.nextLine();


                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }
        } catch (Exception ) {

        }finally {
            System.out.println("");
        }

    }
}
