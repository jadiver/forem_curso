import java.util.Scanner;

public class Calculadora {
    public static double suma(double a, double b){
        double sumaDouble = a + b;
        return sumaDouble;
    }

    public static int suma(int a, int b){
        int sumaInt = a + b;
        return sumaInt;
    }

    public static double resta(double a, double b){
        double restaDouble = a - b;
        return restaDouble;
    }

    public static int resta(int a, int b){
        int restaInt = a - b;
        return restaInt;
    }

    public static double multi(double a, double b){
        double multiDouble = a * b;
        return multiDouble;
    }

    public static int multi(int a, int b){
        int multiInt = a * b;
        return multiInt;
    }

    public static double divi(double a, double b){
        double diviDouble = a / b;
        return diviDouble;
    }

    public static int divi(int a, int b){
        int diviInt = a / b;
        return diviInt;
    }
    public static void main(String[] args) {

        String adios = "La has cagao ";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int primerNumero = scanner.nextInt();

        System.out.println("Ingrese el segundo número:");
        int segundoNumero = scanner.nextInt();

        System.out.println("Ingrese la operación (+, -, *, /):");
        char operacion = scanner.next().charAt(0);


        if (operacion == '+') {
            System.out.println("El resultado es " + suma(primerNumero, segundoNumero));           
        }else if(operacion == '-'){
            System.out.println("El resultado es " + resta(primerNumero, segundoNumero));
        }else if(operacion == '*'){
            System.out.println("El resultado es " + multi(primerNumero, segundoNumero));
        }else if(operacion == '/'){
            System.out.println("El resultado es " + divi(primerNumero, segundoNumero));
        }else{
            System.out.println(adios);
        }

        scanner.close();
    }
        
}
