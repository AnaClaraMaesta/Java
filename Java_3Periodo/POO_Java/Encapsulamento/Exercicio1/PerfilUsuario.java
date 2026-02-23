package POO_Java.Encapsulamento.Exercicio1;

public class PerfilUsuario {
    private String ID;
    private String senha;

    public String getID(String ID){
        return ID;
    }

    public String setSenha(String senha){
        if(senha.length() <=3){
            return "Senha fraca, digite uma senha com mais de 3 caracteres.";
        } else {
            return "Senha forte";
        }
    }
}
