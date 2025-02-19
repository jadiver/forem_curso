package Funciones;
public class EjemploVariableGlobal {
    // Variable global
    static int numero = 10; //Va porque hay que poner static

    public static void mostrarNumero() {
        System.out.println("El valor de la variable global 'numero' es: " + numero);
    }

    public static void incrementarNumero() {
        numero += 5; // Modificamos el valor de la variable global
        System.out.println("El nuevo valor de 'numero' después de incrementarlo es: " +
        numero);
    }

    public static void main(String[] args) {
        // Accedemos a la variable global mediante los métodos
        mostrarNumero();
        incrementarNumero();
        }
}
