import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Informe sua idade: ");
        int idade = sc.nextInt();

        if(idade<12){
            System.out.println("Criança");
        }
        else if(idade>=12 & idade<=17){
            System.out.println("Adolescente");
        }
        else if(idade>=18 & idade<=59){
            System.out.println("Adulto");
        }
        else {
            System.out.println("Idoso");
        }

        System.out.println("Menor de 16 anos – Não pode votar.\n" + "Entre 16 e 18 anos – Voto opcional.\n" + "Entre 18 e 70 anos – Voto obrigatório.\n" + "Maior que 70 – Voto opcional");
    }
}