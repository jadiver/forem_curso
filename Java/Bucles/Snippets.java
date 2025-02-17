package Bucles;
public class Snippets {
    public static void main(String[] args) {
        int contador = 1;

        do{
            System.out.println("Iteración número: " + contador);
            contador++;
            break;
        }while (contador <=5);
        System.out.println("Fin del bucle");
    }
}
