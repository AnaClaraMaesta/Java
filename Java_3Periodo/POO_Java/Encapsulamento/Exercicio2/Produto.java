package POO_Java.Encapsulamento.Exercicio2;

public class Produto {
    private static int quantidade;

    public static void adicionarProduto(int valor) {
        if(valor<=0){
            System.out.println("Valor inválido. Não é possível adicionar um produto com quantidade menor ou igual a zero.");
        }else{
            Produto.quantidade += valor;
            System.out.println("Produto adicionado.");
        }    
    }
}
