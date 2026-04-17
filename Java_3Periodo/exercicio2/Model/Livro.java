package Model;

import java.util.Date;

public class Livro {
    private String autor;
    private String titulo;
    private int qttdDisponivel;

    public Livro(String autor, String titulo, int qttdDisponivel){
        this.autor = autor;
        this.titulo = titulo;
        this.qttdDisponivel = qttdDisponivel;
    }


    @Override
    public String toString() {
        return "Livro -> Titulo: "+titulo+" Autor: "+autor+" Quantidade disponível: " + qttdDisponivel;

    }
}
