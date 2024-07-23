package Ifelse;

import javax.swing.*;

public class ejemplo2Main {
    public static void main(String[] args) {
        ejemplo2 x = new ejemplo2();
        x.op = 0;
        x.saldo = 100000;
        x.menu ="";
        do {
            x.menu="";
            x.menu+="1.- Consultar saldo \n";
            x.menu+="2.- Depositar dinero \n";
            x.menu+="3.- Ingresar pasaje \n";
            x.menu+="4.- Salir \n";
            x.menu+="Elige una opción";
            x.op = Integer.parseInt(JOptionPane.showInputDialog(x.menu));
            switch (x.op){
                case(1):
                    x.saldo = x.deposito + x.saldo;
                    JOptionPane.showMessageDialog(null, "Tu saldo es de: "+x.saldo);
                    break;
                case(2):
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese la cantidad de dinero que quiere añadir a su cuenta");
                    x.deposito = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad"));
                    if (x.deposito<=0){
                        JOptionPane.showMessageDialog(null, "La cantidad ingresada no es suficiente");
                    }else{
                        JOptionPane.showMessageDialog(null, "Procesando su depósito");
                        JOptionPane.showMessageDialog(null, "La cantidad depositada es de: "+x.deposito);
                    }
                    break;
                case(3):
                    JOptionPane.showMessageDialog(null, "Bienvenido al sistema de transporte integrado TINTO");
                    x.pasaje = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor, ingrese su pasaje"));
                    if (x.pasaje==2700){
                        JOptionPane.showMessageDialog(null, "Gracias por su pago, tome su ticket");
                        x.saldo-=x.pasaje;
                    }else if(x.pasaje>2700){
                        JOptionPane.showMessageDialog(null, "El valor de su devuelta se dará a continuación");
                        JOptionPane.showMessageDialog(null, x.pasaje-2700);
                        x.saldo-=x.pasaje;
                    }else{
                        JOptionPane.showMessageDialog(null, "Valor incorrecto");
                    }
            }
        }while (x.op!=4);
    }
}
