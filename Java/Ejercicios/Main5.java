package Ejercicios;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero entero: ");
        int numero = scanner.nextInt();
        if (numero % 2 == 0){
            System.out.print("El numro es par");
        } else {
            System.out.print("El numero es impar");
        }
        scanner.close();
    }
}
