package Model;

public class Aluno {
    private String nome;
    private boolean podeEmprestar;

    public Aluno(String nome, boolean podeEmprestar){
        this.nome = nome;
        this.podeEmprestar = podeEmprestar;
    }

    @Override
    public String toString() {
        return "Estudante -> Nome: "+nome+" Pode pegar emprestado: "+podeEmprestar;
    }
}
