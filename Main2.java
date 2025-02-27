class Persona {
    // Atributos
    String nombre;
    int edad;
    
    // Constructor
    public Persona(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
    System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
    
    // Método para mostrar información
    public void mostrarInfo() {
    System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
    }
    
    // Clase principal
    public class Main2 {
    public static void main(String[] args) {
    // Crear un objeto usando el constructor
    Persona persona1 = new Persona("Carlos", 25);

    Persona persona2 = new Persona("Hola", 78);
    // persona1.mostrarInfo(); // Salida: Nombre: Carlos, Edad: 25
    }
    }
