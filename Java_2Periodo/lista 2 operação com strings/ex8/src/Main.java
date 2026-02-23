import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[] provaNota = new float[2];
        float[] trabalhoNota = new float[2];
        float somaProva=0, somaTrabalho=0;

        System.out.println("Nome do aluno: ");
        String nome = sc.nextLine();

        for(int i=0; i<2; i++){
            System.out.println("Nota da "+(i+1)+"° prova: ");
            provaNota[i] = sc.nextFloat();

            somaProva += provaNota[i];

        }

        for(int j=0; j<2; j++){
            System.out.println("Nota do "+(j+1)+"° trabalho: ");
            trabalhoNota[j] = sc.nextFloat();

            somaTrabalho += trabalhoNota[j];

        }

        float media = (somaProva*7 + somaTrabalho*3)/10;

        if(media>=6){
            System.out.println("Estudante: "+nome+" APROVADO");
        }
        else if(media<6 && media>=5){
            System.out.println("Estudante: "+nome+" RECUPERAÇÃO");
        }
        else{
            System.out.println("Estudante: "+nome+" REPROVADO");
        }
        System.out.println("Media final: "+media);
    }
}