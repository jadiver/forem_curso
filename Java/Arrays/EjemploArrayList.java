package Arrays;
import java.util.ArrayList;

public class EjemploArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        System.out.println("Elementos del ArrayList: " + numeros);

        numeros.remove(1);

        System.out.println("Despues de eliminar índice 1: " + numeros);

        numeros.add(1,15);
        System.out.println("Despues de insertar en índice 1: " + numeros);

        System.out.println("Tamaño de la lista: " + numeros.size());

        System.out.println("Recorriendo con for-each: ");
        for (int num : numeros) {
            System.out.println(num);
        }
    }
}