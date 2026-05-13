package model;

import service.CalculadoraService;

import java.math.*;

public class CalhaParshall {
    private BigDecimal altura;
    private BigDecimal largura;
    private BigDecimal alturaAgua;
    private BigDecimal pctgemAlturaAgua;
<<<<<<< HEAD:src/model/Calha.java

    public Calha (BigDecimal altura, BigDecimal largura, BigDecimal alturaAgua, BigDecimal pctgemAlturaAgua){
        this.altura = altura;
        this.largura = largura;
        this.alturaAgua = alturaAgua;
        this.pctgemAlturaAgua = pctgemAlturaAgua;
    }

    public BigDecimal getAltura() {
        return altura;
    }

    public BigDecimal getAlturaAgua() {
        return alturaAgua;
    }

    public BigDecimal getLargura() {
        return largura;
    }

    public BigDecimal getPctgemAlturaAgua() {
        return pctgemAlturaAgua;
    }

    @Override
    public String toString() {
        return  "| Altura: " + getAltura()+
                "| Largura: "+ getLargura() +
                "| Altura da Água" + getAlturaAgua() +
                "| Porcentagem da altura da água: "+ getPctgemAlturaAgua();
    }
=======
>>>>>>> b49ba05d9942c02d40c735fcf6528291f25b7367:src/model/CalhaParshall.java
}
