package ex4;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float[][] notas = new float[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.printf("Informe as notas do "+(i+1)+"° aluno: ");
                notas[i][j] = sc.nextInt();
            }
        }

        float[] media = new float[3];

        int a=0;
        float c = 0;

        for(int i=0;i<3;i++){
            c = 0;
            for(int j=0;j<3;j++){
                c += notas[i][j];
                if(j==2){
                    c = c/3;
                    media[a] = c;
                    a++;
                 }
            }
        }

        for(int b=0;b<3;b++){
            System.out.println("Medias: "+media[b]);
        }
    }
}
