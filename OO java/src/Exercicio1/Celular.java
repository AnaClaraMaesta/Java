package Exercicio1;

public class Celular {

    public String marca;
    public String modelo;
    public int bateria;
    int x = bateria;
    public void fazerLigacao(){
        System.out.printf("Realizando ligação.");
        for(int i=0;i<5;i++){
            System.out.printf(".");
        }
        System.out.println("\nalo, é da pizzaria? eu quero meia calabresa e meia marguerita, pra agora pfvr");
    }
    public void carregar(int bateria){
        for(int i=100;i>x;i--){
            bateria++;
            System.out.printf("Bateria está em: %d %%\n",bateria);
            if(bateria == 100){
                System.out.println("Bateria carregada");
                break;
            }
        }
    }
}


