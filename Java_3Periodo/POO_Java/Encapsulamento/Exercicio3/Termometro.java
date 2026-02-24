package POO_Java.Encapsulamento.Exercicio3;

public class Termometro {
    private String temperaturaAtual;

    public String getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public void setTemperaturaAtual(String temperaturaAtual) {
        double temp = Double.parseDouble(temperaturaAtual.replace(",","."));

        if(temp < -273.15) {
            System.out.println("Temperatura inválida! A temperatura não pode ser inferior a -273.15°C (zero absoluto).");
        }else{
            this.temperaturaAtual = temperaturaAtual;
        }
    }

}
