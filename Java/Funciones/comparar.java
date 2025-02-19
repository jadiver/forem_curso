package Funciones;
public class comparar{

    public static boolean comparador(int x, int y){
        if (x > y) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        
        System.out.println("El calculo es: " + comparador(89, 7));

        System.out.println("El calculo es: " + comparador2(89, 7));
    }
    /*Otra manera */
    public static boolean comparador2(int num1,int num2 ){
       return num1>num2 ? true: false;  
    }


}