package Ternario;

import java.util.Objects;
import java.util.Scanner;

public class ejercicio2Main {
    public static void main(String[] args) {
    String nombre;
    String apellido;
    int edad;
    String identi;
    ejercicio2 x = new ejercicio2();

    Scanner y = new Scanner(System.in);

        System.out.println("Ingresa tu nombre");
        nombre = y.nextLine();

        System.out.println("Ingresa tu apellido");
        apellido = y.nextLine();

        System.out.println("Ingresa tu edad");
        edad = y.nextInt();

        identi = (Objects.equals(nombre, "Brandon") && Objects.equals(apellido, "Ortiz Medina") && edad==17) ? "Bienvenido, Brandon" : "ACCESO DENEGADO";
        System.out.println("El estado de identificación es: " + identi);

    }
}
