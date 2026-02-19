package Exercicio2;

public class lampada {
    public String tipo;
    public boolean estaLigada;

    public String mostrarEstado(boolean estaLigada){
        String s = "";
        if(estaLigada == true){
            s = "A luz está ligada";
            return s;
        }else{
            s = "A luz está desligada";
            return s;
        }

    }
    public void interruptor(boolean estaLigada){
        System.out.println("Luz foi desligada");
    }
}
