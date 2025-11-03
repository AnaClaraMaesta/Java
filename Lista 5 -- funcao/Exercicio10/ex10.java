package Exercicio10;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva uma operção");
        pularLinha();
        System.out.println("operacao: ");
        String entrada = scan.nextLine();
        pularLinha();
        separarTokens(entrada);

    }

    public static double calcular(double num1, double num2, String operador){
        double resultado=0;

       try{
           switch(operador){
               case "+":
                   resultado = num1 + num2;
                   break;
               case "-":
                   resultado = num1 - num2;
                   break;
               case  "*":
                   resultado = num1 * num2;
                   break;
               case  "/":
                   if(num2 == 0){
                       throw new ArithmeticException("Não é possível dividir por zero!");
                   }
                   break;
               default:
                   throw new IllegalArgumentException("Operador inválido (" + operador + "). Use +, -, * ou /.");

           }
       }catch(ArithmeticException e){
           System.out.println(e.getMessage());
       }catch(IllegalArgumentException e){
           System.out.println(e.getMessage());
       }finally{
           finalizar();
       }
        return resultado;

    }

    public static void pularLinha() {
        System.out.println("---------------------------------------------------");
    }

    public static void separarTokens(String entrada){
        String[] tokens = entrada.split("\\s+");

        double num1 = Double.parseDouble(tokens[0]);
        String operador = tokens[1];
        double num2 = Double.parseDouble(tokens[2]);

        System.out.println("= "+ calcular(num1, num2, operador));
    }

    public static void finalizar() {
        System.out.println("Operacao finalizada com sucesso");
    }
}
