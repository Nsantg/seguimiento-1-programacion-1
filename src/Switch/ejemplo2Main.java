package Switch;

import javax.swing.*;

public class ejemplo2Main {
    public static void main(String[] args) {
    ejemplo2 x = new ejemplo2();
    x.num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un número par"));
    x.num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un segundo número par"));
    x.suma = x.num1+x.num2;
    switch (x.suma){
        case(0):
            JOptionPane.showMessageDialog(null, "La suma de ambos números es 0");
        break;
        case(2):
            JOptionPane.showMessageDialog(null, "La suma de ambos números es 2");
            break;
        case(4):
            JOptionPane.showMessageDialog(null, "La suma de ambos números es 4");
            break;
        case(6):
            JOptionPane.showMessageDialog(null, "La suma de ambos números es 6");
            break;
        case(8):
            JOptionPane.showMessageDialog(null, "La suma de ambos números es 8");
            break;
        default:
            throw new IllegalArgumentException("Datos no encontrados");
    }
    }
}
