package Bucles;
public class Snippets2 {
    public static void main(String[] args) {
        int contador = 1;

        do{
            if (contador % 2 !=0) {
                contador++;
                continue;
            }
            System.out.println("Iteración número: " + contador);
            contador++;
            
        }while (contador <=5);
        System.out.println("Fin del bucle");
    }
}
