package Ternario;

import java.util.Objects;
import java.util.Scanner;

public class ejercicio3Main {
    public static void main(String[] args) {
        String color1;
        String estado;
        ejercicio3 x = new ejercicio3();

        Scanner y = new Scanner(System.in);

        System.out.println("Por favor, ingrese el color del semáforo");
        color1 = y.nextLine();

        estado = (Objects.equals(color1, "Verde")) ? "Puedes avanzar" : "Aun no puedes avanzar";
        System.out.println(estado);
    }
}
