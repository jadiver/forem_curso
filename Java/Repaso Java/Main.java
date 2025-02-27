class Coche {
    String marca;
    String modelo;


    void acelerar() {
    System.out.println(marca + " " + modelo + " está acelerando...");
    }
}

public class Main {

    public static void main(String[] args) {
        Coche a = new Coche();
        a.marca = "Toyota";
        a.modelo = "Ibiza";

        a.acelerar();

        Coche b = new Coche();
        b.marca = "Tesla";
        b.modelo = "Kahoot";

        b.acelerar();

    }
}