package ContinueBreak;

public class ejemplo2Main {
    public static void main(String[] args) {
        for(int i=0; i<=10; i++){
            System.out.println("Aún estás en el ciclo");
            if (i==4){
                continue;
            }
            System.out.println("El valor de i es: "+i);
        }
        System.out.println("Has dejado el ciclo for");
    }
}
