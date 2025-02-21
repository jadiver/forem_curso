import java.util.Scanner;

public class CalculadoraDeAreas {

    public static double calcularArea(double lado){
        double resCuadrado = lado * lado;
        return resCuadrado;
    }

    public static double calcularArea(double base, double altura){
        double resRectangulo = base * altura;
        return resRectangulo;
    }

    public static double calcularArea(int radio){
        double PI = 3.14159;
        double ResCirculo = radio * PI;
        return ResCirculo;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Áreas");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectángulo");
        System.out.println("3. Círculo");
        System.out.print("Elige una opción: ");
        int opcion = scanner.nextInt();

        double resultado = 0;

        switch (opcion) {
            case 1:
                System.out.print("Ingresa el lado del cuadrado: ");
                double ladoCuadrado = scanner.nextDouble();
                resultado = calcularArea(ladoCuadrado);
                break;
            case 2:
                System.out.print("Ingresa la base del rectángulo: ");
                double baseRectangulo = scanner.nextDouble();
                System.out.print("Ingresa la altura del rectángulo:");
                double alturaRectangulo = scanner.nextDouble();
                resultado = calcularArea(baseRectangulo,alturaRectangulo);
                break;
            case 3:
                System.out.print("Ingresa el radio del círculo: ");
                int radioCirculo = scanner.nextInt();
                resultado = calcularArea(radioCirculo);
                break;
            default:
                System.out.println("Opción no válida.");
                break;
            }

            if (resultado != 0) {
                System.out.println("El área es: " + resultado);
                }
                scanner.close();

    }
    
}
