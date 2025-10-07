package ex12;

import java.sql.SQLOutput;
import java.util.*;

import static java.util.Arrays.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Double> mapa = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        mapa.put("Gabriela", 10.0);
        mapa.put("Lily", 9.4);
        mapa.put("Charla", 7.4);
        mapa.put("João", 5.7);
        mapa.put("Pedro", 6.4);

        System.out.print("Aluno: ");
        String nome = sc.nextLine();

        System.out.println(mapa.get(nome));

        System.out.println("Todos: "+mapa);

        Double maior = mapa.get(0);

        for(int i = 0; i < mapa.size(); i++) {
            if(maior < mapa.get(i)) {
                maior = mapa.get(i);
            }
        }
        System.out.println("Maior: "+maior);
    }
}
