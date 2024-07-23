package Ifelse;

import javax.swing.*;

public class ejemplo1Main {
    public static void main(String[] args) {
        ejemplo1 x = new ejemplo1();

        x.edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa tu edad"));
        if (x.edad>=18){
            JOptionPane.showMessageDialog(null, "Usted es mayor de edad");
        }
        else {
            JOptionPane.showMessageDialog(null, "Usted es menor de edad");
        }
    }
}
