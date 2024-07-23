package Ciclos;

import java.util.Scanner;

public class DoWhileMain2 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int x = 1, contador;

        System.out.println("Ingrese la cantidad de términos deseados");
        contador = p.nextInt();

        do {
            System.out.println(x);
            x++;
        }while (x<=contador);

    }
}
