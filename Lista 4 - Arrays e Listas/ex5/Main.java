package ex5;

public class Main {
    public static void main(String[] args) {
        int[][] array1 = {{15,14},{1,5}}, array2 = {{19,21},{3,8}};
        int multi = 0;

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                multi += array1[i][j] *  array2[i][j];
            }
        }

        System.out.println("Resultado: "+multi);
    }
}
