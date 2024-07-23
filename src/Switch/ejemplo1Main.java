package Switch;

import javax.swing.*;

public class ejemplo1Main {
    public static void main(String[] args) {
        ejemplo1 x = new ejemplo1();

        JOptionPane.showMessageDialog(null, "Bienvenido al sistema de detección de colores");
        x.color1 = JOptionPane.showInputDialog(null, "Por favor, ingresa un color");
        switch (x.color1){
            case("Verde"):
                JOptionPane.showMessageDialog(null, "Has ingresado el color verde");
                break;
            case("Amarillo"):
                JOptionPane.showMessageDialog(null, "Has ingresado el color amarillo");
                break;
            case("Azul"):
                JOptionPane.showMessageDialog(null, "Has ingresado el color azul");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Color no identificado");
                throw new IllegalArgumentException("Color no identificado");
        }
    }
}
