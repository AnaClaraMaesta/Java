package Service;

public class CalcularJuros {
    Emprestimo emprestimo;
    private float juros = 0.30F;
    private float valorCobrar = 0.0F;

    public float calcularCobranca(float valorCobrar, float juros){
        long dias = emprestimo.calcularDias();
        valorCobrar = juros*dias;
        return valorCobrar;
    }

    @Override
    public String toString() {
        return "Valor cobrado de: R$"+valorCobrar;
    }
}
