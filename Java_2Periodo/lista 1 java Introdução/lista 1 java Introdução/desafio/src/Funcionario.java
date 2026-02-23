public class Funcionario {
    private String nome;
    private String sobrenome;
    private double salario;
    private double gratificacao;
    private double desconto;

    public Funcionario(String nome, String sobrenome, double salario, double gratificacao, double desconto)
    {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
        this.gratificacao = gratificacao;
        this.desconto = desconto;

    }

    public String nomeCompleto()
    {
        return nome.concat("").concat(sobrenome);
    }

    public double salarioFinal()
    {
        return salario + gratificacao - desconto;
    }

    public double aplicarAumento()
    {
        if (salario < 1000.00) {
            return salario += salario * 0.10;
        } else if (salario >= 1000.00) {
            return salario += salario * 0.05;
        }
        return salario;
    }
}
