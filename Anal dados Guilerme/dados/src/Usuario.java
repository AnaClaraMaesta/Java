public class Usuario {

    private int id;
    private String nome;
    private String login;
    private String senha;
    private boolean ativo;

    public Usuario (int id,
                    String nome,
                    String login,
                    String senha,
                    boolean ativo){

        this.id = id;
        this.ativo = ativo;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public int getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public String getLogin(){
        return login;
    }

    public String getSenha(){
        return senha;
    }

    public boolean getAtivo(){
        return ativo;
    }


}
