package Ternario;

import java.util.Scanner;

public class ejercicio1Main {
    public static void main(String[] args) {
        double promedio;
        String estado;
        ejercicio1Main condicion = new ejercicio1Main();
        Scanner x = new Scanner(System.in);
        System.out.println("Ingresa tu promedio general");
        promedio = x.nextDouble();

        estado = promedio>=3 ? "Aprobado" : "Reprobado";
        System.out.println("Tu estado académico es: " + estado);
    }
}
