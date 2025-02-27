class Coche{
    String marca;
    String modelo;
    String color;
    static int totalCoches = 0;

    //Funcion estática
    static void mostrarTotalCoches(){
        System.out.println("Total de coces creados: " + totalCoches);
    }

    //Constructor
    public Coche(String marca, String modelo, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        totalCoches++;
    }

    void mostrarInfo(){
        System.out.println("Marca:" + marca +  " Modelo: " + modelo + " Color:" + color);
    }
}

public class Main3 {
    public static void main(String[] args) {
        Coche car1 = new Coche("Ferrari", "Caraculo", "Negro");
        car1.mostrarInfo();
        Coche.mostrarTotalCoches();
    }
}
