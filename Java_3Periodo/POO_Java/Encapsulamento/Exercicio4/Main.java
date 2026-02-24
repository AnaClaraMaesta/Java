package POO_Java.Encapsulamento.Exercicio4;

public class Main {
    public static void main(String[] args) {
        contaCorrente corrente = new contaCorrente();
        
        System.out.printf("Saldo da conta corrente: %.2f R$", corrente.saldo);
    }    
}
