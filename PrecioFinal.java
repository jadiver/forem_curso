import java.util.Scanner;

public class PrecioFinal {
    
    public static double calcularPrecioFinal(double precio, double descuento){
        double resultado = precio - descuento;

        return resultado;
    };

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el precio");
        double precioProducto = scanner.nextDouble();

        System.out.println("Introduce el descuento");
        double descuentoProducto = scanner.nextDouble();
        
        double resultadoProducto = calcularPrecioFinal(precioProducto, descuentoProducto);
        double IVA = resultadoProducto * 21 / 100;
        double precioFinalFinal = resultadoProducto + IVA;

        System.out.println("El precio es: " + precioFinalFinal);

        scanner.close();

    }
    
}
