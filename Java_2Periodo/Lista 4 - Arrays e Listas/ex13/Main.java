package ex13;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> inscritos = new ArrayList<>(Arrays.asList("Lily","Felipe","Andre","Felicia","Felipe","Lily","Xamuel","ChoGuaranaEdino da Silva","Felipe","Andre","Lucas","Rebecca"));

        System.out.println(inscritos+"\nTotal de inscrições: "+inscritos.size());

        HashSet<String> semRepeticao = new HashSet<>(inscritos);

        pularLinha();
        System.out.println("Inscritos unicos: "+ semRepeticao + "\nTotal de inscricoes unicas: "+semRepeticao.size());
        pularLinha();
        System.out.print("Digite um nome: ");
        String nome = sc.nextLine();

        System.out.printf("Inscrito presente: "+semRepeticao.stream().anyMatch(n -> n.equalsIgnoreCase(nome))+"\n");
        pularLinha();

        Map<String, Integer> contador = new HashMap<>();

        for(String inscrito : inscritos){
            contador.put(inscrito, contador.getOrDefault(inscrito,0)+1);
        }
        System.out.println(contador +"\n");
    }

    public static void pularLinha(){
        System.out.println("\n===================================================\n");
    }
}
