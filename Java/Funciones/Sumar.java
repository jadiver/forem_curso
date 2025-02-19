package Funciones;
public class Sumar {
    public static int suma(int a, int b) {
        return a + b;
    }

    public static double suma(double a, double b) {
        return a + b;
    }

    public static void main(String[] parametros) {
        int suma_enteros = suma(2,4);
        double suma_reales = suma(2.0, 4.0);

        System.out.println("La suma de los enteros da " + suma_enteros);
        
        System.out.println("La suma de los reales da " + suma_reales);
    }
}
