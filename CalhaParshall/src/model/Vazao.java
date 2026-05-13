package model;

import java.math.BigDecimal;

public class Vazao {
    private BigDecimal qDia;
    private BigDecimal qSegundo;

    public Vazao(BigDecimal qDia, BigDecimal qSegundo){
        this.qDia = qDia;
        this.qSegundo = qSegundo;
    }

    public BigDecimal getqDia() {
        return qDia;
    }

    public BigDecimal getqSegundo() {
        return qSegundo;
    }

    @Override
    public String toString() {
        return  "|Qdia: "+getqDia()+
                "|Qsegundo: "+getqSegundo();
    }
}
