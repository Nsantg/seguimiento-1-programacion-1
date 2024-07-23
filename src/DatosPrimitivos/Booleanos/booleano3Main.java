package DatosPrimitivos.Booleanos;

public class booleano3Main {
    public static void main(String[] args) {
        booleano3 x = new booleano3();
        x.edad = 15;
        if (x.edad>=18){
            System.out.println("Usted es un adulto: " + true);;
        }
        else {
            System.out.println("¿Usted es un adulto?: " + false);;
        }
    }
}
