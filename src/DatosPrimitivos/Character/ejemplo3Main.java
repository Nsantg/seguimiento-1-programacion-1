package DatosPrimitivos.Character;

public class ejemplo3Main {
    public static void main(String[] args) {
        ejemplo3 y = new ejemplo3();
        y.x1 = 'P';
        y.x2 = 'L';
        System.out.println(y.x1);
        if(y.x1=='P' && y.x2=='L'){
            System.out.println("Los valores son de tipo character");
        }
        else {
            System.out.println("Los valores ingresados son incorrectos");
        }
    }
}
