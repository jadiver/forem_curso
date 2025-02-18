package Ejercicios;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número: ");
        int numero = scanner.nextInt();
        String resultado = (numero > 0) ? "Es positivo" : "No es positivo";
        System.out.print(resultado);
        scanner.close();
    }
}
