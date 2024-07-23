package Ifelse;

import javax.swing.*;
import java.util.Objects;

public class ejemplo3Main {
    public static void main(String[] args) {
        ejemplo3 x = new ejemplo3();

        JOptionPane.showMessageDialog(null, "Bienvenido a la CUE Alexander Von Humboldt");
        x.nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre");

        x.apellido = JOptionPane.showInputDialog(null, "Ingrese su apellido");
        x.edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad"));

        if (Objects.equals(x.nombre, "Brandon") && Objects.equals(x.apellido, "Ortiz Medina") && x.edad==17){
            JOptionPane.showMessageDialog(null, "Sus datos están siendo procesados");
            JOptionPane.showMessageDialog(null, "Bienvenido, Brandon Ortiz Medina");
        }else {
            JOptionPane.showMessageDialog(null, "Sus datos están siendo procesados");
            JOptionPane.showMessageDialog(null, "ERROR! DATOS NO VÁLIDOS");
        }
    }
}
