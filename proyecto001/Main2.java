public class Main2 {
    public static void main(String[] args) {
        int maxValue = Integer.MAX_VALUE;
        // int = Variable de tipo entera, se reservan 4 espacios de memoria
        System.out.println("Valor máximo de un int: " + maxValue) ;
        //( Si hay parentesis es una funcion)
        //Sumamos 1 al valor máximo, lo que causa un overflow
        int overflowedValue = maxValue + 1;

        System.out.println("Valor despues del overflow: " + overflowedValue);
    }
}
