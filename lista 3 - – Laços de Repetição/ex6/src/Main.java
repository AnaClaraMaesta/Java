import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("numero: ");
        int num = sc.nextInt();
        int a = num, b = num, c=0;
        System.out.print(num + "! = ");

        for(int i = 0; i<=num; i++){
            if(b>0){
                System.out.print(b);
                System.out.print(" x ");
            }
            b--;
            c += a*(a-1);
        }
        System.out.print(" = "+ c);
    }
}