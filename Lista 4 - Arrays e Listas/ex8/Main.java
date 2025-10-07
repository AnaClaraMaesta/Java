package ex8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> cidades = new ArrayList<>(Arrays.asList(
        "Almas (TO)", "Almeirim (PA)", "Almenara (MG)", "Almino Afonso (RN)", "Alpinópolis (MG)", "Alta Floresta (MT)",
        "Alta Floresta d'Oeste (RO)", "Altair (SP)", "Barcelona (RN)", "Barra (BA)", "Barra de Santo Antônio (AL)",
        "Barra Bonita (SP)", "Barracão (PR)", "Barracão (RS)", "Barra da Estiva (BA)",
        "Capitão Enéas (MG)", "Capitão Gervásio Oliveira (PI)", "Capitão Leônidas Marques (PR)",
        "Capitão Poço (PA)", "Capitólio (MG)", "Capivari (SP)", "Capivari de Baixo (SC)",
        "Capivari do Sul (RS)", "Capixaba (AC)", "Capoeiras (PE)", "Caputira (MG)",
        "Caraá (RS)", "Caracaraí (RR)", "Caracol (MS)", "Caracol (PI)", "Caraguatatuba (SP)",
        "Caraí (MG)", "Caraíbas (BA)", "Carambeí (PR)", "Caranaíba (MG)",
        "Divinolândia (SP)", "Divinolândia de Minas (MG)", "Divinópolis (MG)",
        "Divinópolis de Goiás (GO)", "Divinópolis do Tocantins (TO)", "Divisa Alegre (MG)",
        "Divisa Nova (MG)", "Divisópolis (MG)", "Dobrada (SP)", "Dois Córregos (SP)",
        "Desterro (PB)", "Desterro de Entre Rios (MG)", "Desterro do Melo (MG)",
        "Dezesseis de Novembro (RS)", "Diadema (SP)", "Diamante (PB)", "Diamante d'Oeste (PR)",
        "Diamante do Norte (PR)", "Diamante do Sul (PR)",
        "Ermo (SC)", "Ernestina (RS)", "Erval Grande (RS)", "Ervália (MG)",
        "Erval Seco (RS)", "Erval Velho (SC)", "Escada (PE)", "Esmeralda (RS)",
        "Esmeraldas (MG)", "Espera Feliz (MG)", "Esperança (PB)", "Esperança do Sul (RS)",
        "Ferraz de Vasconcelos (SP)", "Ferreira Gomes (AP)", "Ferreiros (PE)", "Ferros (MG)",
        "Fervedouro (MG)", "Figueira (PR)", "Figueirão (MS)", "Figueirópolis (TO)", "Filadélfia (BA)", "Filadélfia (TO)",
        "Firminópolis (GO)", "Flexeiras (AL)", "Floraí (PR)", "Feliz (RS)", "Feliz Deserto (AL)",
        "Guaraçaí (SP)", "Guaraci (PR)", "Guaraci (SP)", "Guaraciaba (MG)", "Guaraciaba (SC)",
        "Guaraciaba do Norte (CE)", "Guaraciama (MG)", "Guaraí (TO)", "Guaraíta (GO)",
        "Guaramiranga (CE)", "Guaramirim (SC)", "Guaranésia (MG)", "Guarani (MG)",
        "Granjeiro (CE)", "Grão Mogol (MG)", "Grão-Pará (SC)", "Gravataí (RS)", "Gravatal (SC)", "Groaíras (CE)", "Grossos (RN)",
        "Harmonia (RS)", "Heitoraí (GO)", "Heliodora (MG)", "Heliópolis (BA)", "Herculândia (SP)",
        "Herval (RS)", "Herval d'Oeste (SC)", "Herveiras (RS)", "Hidrolândia (CE)", "Hidrolândia (GO)",
        "Hidrolina (GO)", "Holambra (SP)", "Honório Serpa (PR)", "Horizonte (CE)", "Horizontina (RS)",
        "Hortolândia (SP)", "Hugo Napoleão (PI)", "Hulha Negra (RS)", "Humaitá (AM)", "Humaitá (RS)",
        "Ibaiti (PR)", "Ibiam (SC)", "Ibiapina (CE)", "Ibiara (PB)", "Ibicaré (SC)", "Ibicaraí (BA)",
        "Ibicuitinga (CE)", "Ibipeba (BA)", "Ibiraci (MG)", "Ibirama (SC)", "Ibirapitanga (BA)", "Ibirapuã (BA)",
        "Jaboatão dos Guararapes (PE)", "Jacarezinho (PR)", "Jacinto (MG)", "Jaciara (MT)",
        "Jacinto Machado (SC)", "Jacupiranga (SP)", "Jacutinga (MG)", "Jaguapitã (PR)", "Jaguari (RS)",
        "Jaguariaíva (PR)", "Jaguaretama (CE)"));

        System.out.print("informe a primeira letra do nome da cidade (A-J): ");
        char letra = sc.next().charAt(0);

        for(int i = 0; i < cidades.size(); i++){
            if(cidades.get(i).startsWith(String.valueOf(letra).toUpperCase())){
                System.out.println(cidades.get(i));
            }
        }

        int vogais = 0, consoantes=0;

        for(int i = 0; i < cidades.size(); i++){
            char primeiraLetra = cidades.get(i).charAt(0);

            if(primeiraLetra == 'A' || primeiraLetra == 'E' || primeiraLetra == 'I' || primeiraLetra == 'O' || primeiraLetra == 'U' ){
                vogais++;
            }
            else{
                consoantes++;
            }
        }
        System.out.println("Vogas: " + vogais + " Consoantes: " + consoantes);
    }
}
