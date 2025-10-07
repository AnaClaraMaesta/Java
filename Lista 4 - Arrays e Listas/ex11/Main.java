package ex11;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> nums = new HashSet<>();
        int add, remov ,verificado;
        boolean continuar = true;

        do{
            System.out.print("Adicione um numero, para finalizar digite 0\n: ");
            add = sc.nextInt();

            if(add != 0){
                nums.add(add);
            }else{
                System.out.println(nums);
                continuar = false;
            }
        }while(continuar);

        System.out.print("Numero que deseja verificar presença: ");
        verificado = sc.nextInt();

        System.out.println(nums.contains(verificado));
    }
}
