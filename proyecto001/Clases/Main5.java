package Clases;
public class Main5 {
    public static void main(String[] args) {
        // 2. Conversión explícita (narrowing)
        double valorDouble = 9.78;
        int valorInt = (int) valorDouble; // De double a int (requiere casting)

        System.out.println("Conversion explícita: double (" + valorDouble + ") -> int (" + valorInt +")"); 
        //Los mases son para concatenar ->  la operación de unir dos cadenas
    }
}
