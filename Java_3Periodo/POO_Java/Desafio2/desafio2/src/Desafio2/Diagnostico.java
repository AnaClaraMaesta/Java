package Desafio2;

public abstract class Diagnostico {
    private String descricao;
    private Double valorExame;

    public abstract void gerarRelatorio(boolean validarProtocolo);

    public String getDescricao() {
        return descricao;
    }

    public Double getValorExame() {
        return valorExame;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValorExame(Double valorExame) {
        this.valorExame = valorExame;
    }

}
