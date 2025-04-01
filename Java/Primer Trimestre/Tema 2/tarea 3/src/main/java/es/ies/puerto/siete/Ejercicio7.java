package es.ies.puerto.siete;

public class Ejercicio7 {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1000.0, "Diego", "T5biesh54321");
        cuenta.depositar(5400);
        System.out.println("Dinero en la cuenta: " + cuenta.getSaldo());
        cuenta.retirar(1000);
        System.out.println("Dinero en la cuenta: " + cuenta.getSaldo());
        System.out.println("Informacion de la cuenta despues de las operaciones: " + cuenta);
    }
}
