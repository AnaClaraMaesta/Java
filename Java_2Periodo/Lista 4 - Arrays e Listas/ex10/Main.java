package ex10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> fila = new LinkedList(Arrays.asList("Felicia","Diana","Lucas","Gabriela","Pedro"));

        System.out.println("Original: "+ fila);

        for(int i = 0; i < 2; i++) {
            fila.removeFirst();
        }

        fila.add("Matheus");
        fila.add("Mayu");

        System.out.println("Final: "+fila);
    }
}
