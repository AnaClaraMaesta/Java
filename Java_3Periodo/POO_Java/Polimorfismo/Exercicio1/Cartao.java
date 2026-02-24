package POO_Java.Polimorfismo.Exercicio1;

public class Cartao extends FormaPagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento com cartão no valor de: " + valor);
        System.out.println("Validando limite do cartão...");
    }
}
