package Ternario;

import java.util.Scanner;

public class ejercicio4Main {
    public static void main(String[] args) {
        int pasaje;
        String estado;
        ejercicio4 x = new ejercicio4();

        Scanner y = new Scanner(System.in);
        System.out.println("Bienvenido al sistema de transporte público TINTO. Por favor, ingrese el monto de su pasaje (2700)");
        pasaje = y.nextInt();
        System.out.println("Se está procesando su pago");

        estado = (pasaje >=2700) ? "Gracias por su pago, tome su ticket" : "Pago rechazado, el monto es insuficiente";
        System.out.println(estado);
    }
}
