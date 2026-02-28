package Desafio2.Exames;

import Desafio2.Diagnostico;
import Desafio2.Interface.Auditavel;

public class ExameSangue extends Diagnostico implements Auditavel {

    @Override
    public boolean validarProtocolo(String getDescricao, Double getValorExame){
        if(!getDescricao.isBlank() && getValorExame != null){
            return true;
        }else{
            System.out.println("Nem a descrição nem o valor do exame podem estar vazios");
            return false;
        }
    }

    @Override
    public void gerarRelatorio(boolean validarProtocolo) {
        System.out.println("Relatório gerado do Exame de Sangue");
    }

    @Override
    public void setDescricao(String descricao) {
        super.setDescricao(descricao);
    }

    public void setValorExame(Double valorExame) {
        super.setValorExame(valorExame);
    }
}
