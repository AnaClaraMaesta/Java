package Exercicio12;

import java.util.ArrayList;
import java.util.Scanner;

public class ex12 {
    public static ArrayList<Double> adicionarNotas(ArrayList<Double> notas) throws Exception {
        Scanner scan = new Scanner(System.in);
        Double a = 0.0;

        do{
            System.out.print("(-1 = fim) \nnota: ");
            a = scan.nextDouble();
            notas.add(a);
            if(a==-1){
                break;
            }
            if(a<0 || a>10.0){
                throw new Exception("Nota inválida! Deve ser entre 0 e 10.");
            }

        }while(a!=-1);
        notas.remove(notas.getLast());
        medias(notas);
        return notas;
    }
    public static double medias(ArrayList<Double> notas){
        double media = 0;
        for (int i = 0; i < notas.size(); i++) {
            media += notas.get(i);
        }
        return media/notas.size();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        try{
            System.out.println("notas: "+adicionarNotas(notas));
            System.out.print(String.format("Medias: %.2f",medias(notas)));
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
