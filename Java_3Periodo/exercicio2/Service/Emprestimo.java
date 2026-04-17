package Service;
import Model.Aluno;
import Model.Livro;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Emprestimo {
    Aluno nome;
    Livro livro;
    LocalDate dataDevolucao;
    private LocalDate dataHoje = LocalDate.now();
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    public Emprestimo(LocalDate data, LocalDate hoje){
        this.dataDevolucao = data;
        this.dataHoje = LocalDate.now();
    }

    public long calcularDias(){
        long dias = ChronoUnit.DAYS.between(dataDevolucao,dataHoje);
        return dias;
    }

    public String verificarAtraso(){
        if(dataDevolucao.isBefore(dataHoje)){
            return "Livro: "+livro+" Emprestado: "+ nome+ " foi entregue em "+ dataHoje;
        }else{
            return "Livro: "+livro+" Emprestado: "+ nome+" entregue com "+calcularDias()+" dias de atraso!";
        }
    }
}
