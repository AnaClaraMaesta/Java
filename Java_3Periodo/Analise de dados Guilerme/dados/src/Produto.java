import java.math.BigDecimal;

public class Produto {

    private int id;
    private String nome;
    private String descricao;
    private BigDecimal preco;

    public Produto(int id,
                   String nome,
                   String descricao,
                   BigDecimal preco){

        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getNome() {
        return nome;
    }

}
