package Switch;

import javax.swing.*;
import java.lang.runtime.ObjectMethods;

public class ejemplo3Main {
    public static void main(String[] args) {
        ejemplo3 x = new ejemplo3();
        x.nombre = JOptionPane.showInputDialog(null, "Por favor, ingrese su nombre");
        switch (x.nombre){
            case("Brandon"):
                JOptionPane.showMessageDialog(null, "Bienvenido, Brandon. Ingresa tus datos a continuación");
                x.edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad"));
                if (x.edad>=18){
                    JOptionPane.showMessageDialog(null, "Tu edad ha sido verificada, puedes acceder");
                }else{
                    JOptionPane.showMessageDialog(null, "Edad no válida");
                }
            break;
            case ("Jorge"):
                JOptionPane.showMessageDialog(null, "Bienvenido, Jorge. Ingresa tus datos a continuación");
                x.edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad"));
                if (x.edad>=18){
                    JOptionPane.showMessageDialog(null, "Tu edad ha sido verificada, puedes acceder");
                }else{
                    JOptionPane.showMessageDialog(null, "Edad no válida");
                }
            break;
            default:
                throw new IllegalArgumentException("Datos no identificados");
        }
}
};
