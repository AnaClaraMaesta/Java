import Exercicio2_1.Moto;
import Exercicio2_2.Notebook;
import Exercicio2_2.Tablet;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Moto moto = new Moto();

        moto.placa = "SET0911";
        moto.cilindradas = 150;

        System.out.printf("placa: %s\ncilindros: %d\n\n", moto.placa, moto.cilindradas);

        System.out.println("1: Notebook\n2: Tablet");
        int dispositivo = scan.nextInt();

        switch (dispositivo) {
            case 1:
                Notebook.ligar();
                Notebook.Processador("AMD Ryzer 5 5600 6-Core");
                break;
            
            case 2:
                Tablet.ligar(); 
                break;

            default:
                break;
        }
        scan.close();
    }

}
