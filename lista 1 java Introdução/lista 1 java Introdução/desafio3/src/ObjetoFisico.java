public class ObjetoFisico
{
    private double massa;
    private double velocidade;
    private double energiaCinetica;
    private double altura;

    public ObjetoFisico(double massa, double velocidade, double energiaCinetica, double altura)
    {
        this.massa = massa;
        this.velocidade = velocidade;
        this.energiaCinetica = energiaCinetica;
        this.altura = altura;
    }

    public double calcularEnergiaCinetica()
    {
        energiaCinetica = massa * Math.pow(velocidade, 2)/2;
        return energiaCinetica;
    }

    public double alturaEquivalente()
    {
        altura = energiaCinetica/ massa*9.8;
        return altura;
    }
}
