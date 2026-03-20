package Ex1;

public class Funcionario {
    private String nome;
    private String id;

    public Funcionario(String id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
