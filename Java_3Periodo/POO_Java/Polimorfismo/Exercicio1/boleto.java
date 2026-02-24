package POO_Java.Polimorfismo.Exercicio1;

public class boleto extends FormaPagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento com boleto no valor de: " + valor);
        System.out.println("Gerando código de barras...");
    }
}
