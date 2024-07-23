package ContinueBreak;

public class ejemplo1Main {
    public static void main(String[] args) {
        for(int i=0; i<=10; i++){
            System.out.println("Sigues en el ciclo");
            if(i == 4){
                break; //Sale de un ciclo, a partir de una condición
            }else{
                System.out.println("El valor de i es: "+i);
            }
        }
        System.out.println("Has salido del ciclo for");
    }
}


