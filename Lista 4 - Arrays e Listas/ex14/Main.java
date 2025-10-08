package ex14;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> votos = new ArrayList<>(Arrays.asList("PESSOA1", "PESSOA2", "PESSOA3", "PESSOA2", "PESSOA2", "PESSOA3", "PESSOA3", "PESSOA2", "PESSOA1", "PESSOA2"));
        pulaLinha();
        System.out.println("Votos: "+votos+ "\nQuantidade de votos: "+votos.size());
        pulaLinha();

        HashSet<String> votosSet = new HashSet<>(votos);

        System.out.println("Votos unicos: "+votosSet);
        pulaLinha();

        Map<String, Integer> votosMap = new HashMap<>();

        for(String voto : votos){
            votosMap.put(voto, votosMap.getOrDefault(voto,0) +1);
        }

        System.out.println("Quantidade de votos de cada candidato: "+votosMap);

        int maiorVotos = Integer.MIN_VALUE;
        String nomeMaior = null;

        for(Map.Entry<String, Integer> entry : votosMap.entrySet()){
            if(entry.getValue() > maiorVotos){
                maiorVotos = entry.getValue();
                nomeMaior = entry.getKey();
            }
        }
        pulaLinha();
        System.out.println("Vencedor da eleicao: "+nomeMaior+"\nQuantidade de votos: "+ maiorVotos);

        System.out.print("Informe o nome do candidato: ");
        String nomeCandidato = sc.nextLine();
        boolean temVoto = votosMap.containsKey(nomeCandidato.toUpperCase());

        if(temVoto == true){
            System.out.println("Candidato encontrado.");
        }
        else{
            System.out.println("Candidato não encontrado ou com zero votos.");
        }
    }

    public static void pulaLinha(){
        System.out.println("===============================================");
    }
}
