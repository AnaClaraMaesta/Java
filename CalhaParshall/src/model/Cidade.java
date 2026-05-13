package model;

import java.math.*;

public class Cidade {
    private String nome;
    private BigInteger qtdHabitante;
<<<<<<< HEAD
    private BigDecimal litroHabitanteDia;

    public Cidade(String nome, BigInteger qtdHabitante, BigDecimal litroHabitanteDia){
        this.qtdHabitante = qtdHabitante;
        this.litroHabitanteDia = litroHabitanteDia;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getLitroHabitanteDia() {
        return litroHabitanteDia;
    }

    public BigInteger getQtdHabitante() {
        return qtdHabitante;
    }

    @Override
    public String toString() {
        return  "|Cidade: "+getNome()+
                " |População: "+getQtdHabitante()+
                " |Litros de água por dia por habitante: "+getLitroHabitanteDia();
    }

=======
    private BigDecimal consumoAgua;

    public Cidade(BigInteger qtdHabitante, BigDecimal consumoAgua) {
        this.qtdHabitante = qtdHabitante;
        this.consumoAgua = consumoAgua;
    }

    public void setQtdHabitante(BigInteger qtdHabitante) {
        this.qtdHabitante = qtdHabitante;
    }

    public void setConsumoAgua(BigDecimal consumoAgua) {
        this.consumoAgua = consumoAgua;
    }

    public BigDecimal getVazaoDia(){
        return this.consumoAgua.multiply(new BigDecimal(this.qtdHabitante));
    }

    public BigDecimal getVazaoSegundo(){
        return getVazaoDia().divide(BigDecimal.valueOf(86400), 2, RoundingMode.HALF_UP);
    }
>>>>>>> b49ba05d9942c02d40c735fcf6528291f25b7367
}
