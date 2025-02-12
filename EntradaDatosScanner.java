import java.util.Scanner; //Importamos la clase Scanner

public class EntradaDatosScanner {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        
        System.out.print("introduce tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();

        System.out.print("Introduce tu altura en metros: ");
        double altura = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Introduce tu ciudad: ");
        String ciudad = scanner.nextLine();

        System.err.println("\nResume de datos ingresados: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Ciudad: " + ciudad);

        scanner.close();
    }
    
}