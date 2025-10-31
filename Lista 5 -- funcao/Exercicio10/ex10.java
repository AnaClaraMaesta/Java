package Exercicio10;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String parada = "";
        String operadores = "+-/*";


            System.out.print("numero 1: ");
            int num1 = scan.nextInt();
            System.out.println("operador: ");
        try{
            String operador = scan.nextLine();
            scan.nextLine();
            if (operador.contains(operador)){
                int Z = 1/0;
            };


        }catch (Exception e){
            throw  new IllegalArgumentException("teste");
        }finally {

            System.out.print("Informe um numero: ");
            int num2 = scan.nextInt();

        }
    }
}

