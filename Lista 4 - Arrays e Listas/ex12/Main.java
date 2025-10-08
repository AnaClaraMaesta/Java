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

        System.out.print("Estudante: ");
        String nome = sc.nextLine();

        System.out.println(nome +": "+ mapa.get(nome));

        System.out.println("Todos: " + mapa);

        String nomeMaior = null;
        Double maiorNota = Double.MIN_VALUE;

        for(Map.Entry<String, Double> entry : mapa.entrySet()) { //“Para cada par de (nome, nota) dentro do mapa, guarde esse par na variável entry e execute o bloco do for.”
            if(entry.getValue() > maiorNota){
                maiorNota = entry.getValue();
                nomeMaior = entry.getKey();
            }
        }

        System.out.println("Estudante com maior nota: "+nomeMaior+" [Nota: "+maiorNota+ "]");

    }
}
