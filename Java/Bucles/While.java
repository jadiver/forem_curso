package Bucles;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); 
        boolean continuar = true;// Guarda booleana para controlar el bucle
        
        while (continuar) { 
            System.out.print("Escribe algo (o 'salir' para terminar): ");
            String entrada = scanner.nextLine(); 
            
            if (entrada.equalsIgnoreCase("salir")) {
                continuar = false; 
                // Cambia la guarda booleana para salir del bucle 
            } else { System.out.println("Has escrito: " + entrada); 
        } 
    } 
    System.out.println("Programa terminado."); scanner.close();
    }
}