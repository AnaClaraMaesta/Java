package Desafio2;

import Desafio2.Exames.ExameSangue;
import Desafio2.Exames.RaioX;

public class Main {
    static void main() {
        ExameSangue exameSangue = new ExameSangue();
        RaioX raioX = new RaioX();

        raioX.setValorExame(500.00);
        raioX.setDescricao("Vamo ver se quebro todos os ossos e pode enterrar.");
        exameSangue.setValorExame(100.00);
        exameSangue.setDescricao("Sera que ta morrendo");

        System.out.println("Valor Exame de sangue:" +exameSangue.getValorExame() + " || Exame de sangue: " + exameSangue.getDescricao());
        System.out.println("Valor Raio X:" +raioX.getValorExame() + " || Exame de raio X: " + exameSangue.getDescricao());

        exameSangue.validarProtocolo(exameSangue.getDescricao(), exameSangue.getValorExame());
        raioX.validarProtocolo(raioX.getDescricao(), raioX.getValorExame());
    }
}
