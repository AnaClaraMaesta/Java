package Exercicio3;

import java.util.*;

public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        String n;
        do {
            System.out.print("Digita um nome (finalizar = fim): ");
             n = scan.nextLine();
            nomes.add(n);

        }while(!n.equalsIgnoreCase("fim"));
        nomes.remove("fim");
        ArrayList<String> selecao = nomesSelecao(nomes);

        System.out.println(selecao);

    }

    public static ArrayList<String> nomesSelecao(ArrayList<String> nomes){
        ArrayList<String> selecao = new ArrayList<>();

        for (int i = 0; i < nomes.size(); i++) {
            if (nomes.get(i).length() > 5) {
                selecao.add(nomes.get(i));
            }
        }
        return selecao;
    }
}
