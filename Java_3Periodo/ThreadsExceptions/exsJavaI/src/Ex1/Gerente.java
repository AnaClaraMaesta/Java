package Ex1;

public class Gerente extends Funcionario {
    private String senha;

    public Gerente (String id, String nome, String senha){
        super(id, nome);

        if(senha.isEmpty()){
            System.out.println("senha nao pode ser vazia");
        }

        this.senha = senha;
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    public String getSenha() {
        return senha;
    }
}
