import java.util.Scanner;
import java.util.Locale;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        System.out.println("nome: ");
        String nome = sc.nextLine();

        System.out.println("sobrenome: ");
        String sobrenome = sc.nextLine();

        System.out.println("Função: ");
        String funcao = sc.nextLine();

        System.out.println("Salário base: ");
        double salario = sc.nextDouble();

        System.out.println("Gratificação: ");
        double gratificacao = sc.nextDouble();

        System.out.println("Desconto: ");
        double desconto = sc.nextDouble();

        Funcionario Funcionario = new Funcionario(nome, sobrenome, salario, gratificacao, desconto);

        System.out.println("=====================================");
        System.out.println("Nome: " + Funcionario.nomeCompleto());
        System.out.println("Função: " + funcao);
        System.out.println("Salario + aumento: " + Funcionario.aplicarAumento());
        System.out.println("Gratificação: " + gratificacao);
        System.out.println("Desconto: " + desconto);
        System.out.println("Salario final: " + Funcionario.salarioFinal());

    }
}
