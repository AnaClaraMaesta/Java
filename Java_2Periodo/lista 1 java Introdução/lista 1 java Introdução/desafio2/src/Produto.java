public class Produto
{
    private float preco;

    public Produto(float preco)
    {
        this.preco = preco;
    }

    public float aplicarDesconto()
    {
        if(preco > 50.00)
        {
            return preco -= preco* 0.15;
        }
        else
        {
            System.out.println("Não é possível aplicar desconto...");
            return preco;
        }
    }
}
