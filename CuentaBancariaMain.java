class CuentaBancaria {
    // Atributos privados
    private String titular;
    private double saldo;
    private String numeroCuenta;

    // Constructor
    public CuentaBancaria(String titular, String numeroCuenta) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0; // Saldo inicial es cero
    }

    // Métodos getter y setter

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular != null && !titular.isEmpty()) {
            this.titular = titular;
        } else {
            System.out.println("Error: El nombre del titular no puede estar vacío.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    // No permitimos que el saldo se establezca directamente (solo se modifica  con depósitos o retiros)
    // Por lo tanto, no hay setter para saldo

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        if (numeroCuenta != null && !numeroCuenta.isEmpty()) {
            this.numeroCuenta = numeroCuenta;
        } else {
            System.out.println("Error: El número de cuenta no puede estar vacío.");
        }
    }

    // Método para depositar dinero
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Error: La cantidad a depositar debe ser mayor que cero.");
        }
    }

    // Método para retirar dinero
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("No puede retirar la cantidad. Saldo insuficiente o cantidad inválida.");
        }
    }

    // Método para mostrar información de la cuenta
    public void mostrarInformacion() {
        System.out.println("----- Información de la Cuenta -----");
        System.out.println("Titular: " + titular);
        System.out.println("Número de Cuenta: " + numeroCuenta);
        System.out.println("Saldo Actual: $" + saldo);
    }
}

public class CuentaBancariaMain {
    public static void main(String[] args) {
        CuentaBancaria cb = new CuentaBancaria("Pablo Prieto", "123456789");
    
        System.out.println("El saldo es: " + cb.getSaldo());
        cb.depositar(1000);
        cb.retirar(500);
        cb.retirar(600);
        cb.mostrarInformacion();
    }
    
}



