package Clases;
public class Repaso {
    public static void main(String[] args) {

        // 1. Mostrar "Hello, World!"
        System.out.println("Hello, World!");

        // 2. Declarar una variable entera con valor -10 y mostrarla
        int num = -10;
        System.out.println("Valor de num: " + num);

        // 3. Desbordamiento de enteros
        int maxInt = Integer.MAX_VALUE;
        int overflow = maxInt + 100;
        System.out.println("Desbordamiento de entero: " + overflow);

        // 4. Declarar y mostrar un char
        char letra = 'X';
        System.out.println("Valor de letra: " + letra);

        // 5. Declarar y mostrar float y double
        float numFloat = 3.14159f;
        double numDouble = 3.14159;
        System.out.println("Valor de float: " + numFloat);
        System.out.println("Valor de double: " + numDouble);

        // 6. Declarar y mostrar un booleano y su negación
        boolean flag = false;
        System.out.println("Valor de flag: " + flag);
        System.out.println("Negación de flag: " + !flag);
        
        // 7. Variable char final (constante) e intentar modificarla (provoca error de compilación)
        final char constante = 'A'; // char = un caracter solo
        System.out.println("Valor de constante: " + constante);
        // constante = 'B'; // Esto generaría un error de compilación

        // 8. Conversión implícita de int a double
        int numEntero = 42;
        double numConvertido = numEntero; // Conversión implícita
        System.out.println("Valor de numEntero: " + numEntero);
        System.out.println("Valor de numConvertido: " + numConvertido);

        // 9. Conversión explícita de double a int
        double numD = 9.99;
        int numI = (int) numD; // Conversión explícita
        System.out.println("Valor de numD: " + numD);
        System.out.println("Valor de numI: " + numI);

        // 10. Conversión de entero a String
        int numero = 123;
        String cadena = Integer.toString(numero);
        System.out.println("Número convertido a String: " + cadena);

        // 11. Conversión de String a entero y suma de 10
        String textoNumero = "50";
        int numeroConvertido = Integer.parseInt(textoNumero);
        System.out.println("Suma de 10 al número convertido: " + (numeroConvertido + 10));

        // 12. Mostrar "Mi nombre es " seguido de un nombre
        String miNombre = "Juan"; // Puedes cambiarlo por tu nombre
        System.out.println("Mi nombre es " + miNombre);

    }
    
}
