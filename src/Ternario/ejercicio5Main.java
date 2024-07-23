package Ternario;

import java.util.Objects;
import java.util.Scanner;

public class ejercicio5Main {
    public static void main(String[] args) {
        String color1;
        String ciudad;
        int champions;
        String condicion;
        ejercicio5 x = new ejercicio5();


        Scanner y = new Scanner(System.in);
        System.out.println("Bienvenido. Por favor ingrese el color de su equipo");
        color1 = y.nextLine();

        System.out.println("Ingrese la ciudad de su equipo");
        ciudad = y.nextLine();

        System.out.println("Ingrese la cantidad de champions de su equipo");
        champions = y.nextInt();

        condicion = (Objects.equals(color1, "Blanco") && (Objects.equals(ciudad, "Madrid") && champions==15)) ? "Real Madrid" : "Equipo no identificado";
        System.out.println("El equipo que usted ha indicado es: " + condicion);
    }
}
