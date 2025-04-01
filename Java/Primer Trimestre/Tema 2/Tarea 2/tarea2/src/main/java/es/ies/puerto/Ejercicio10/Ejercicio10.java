package es.ies.puerto.Ejercicio10;

/**
 * Crea dos objetos de la clase CuentaBancaria con titulares "Pedro" y "Laura", y con saldo inicial de 1500 y 1000 respectivamente. Transfiere 500 de la cuenta de Pedro a la cuenta de Laura y muestra los saldos de ambas cuentas.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        CuentaBancaria cuentaPedro = new CuentaBancaria("Pedro", 1500);
        CuentaBancaria cuentaLaura = new CuentaBancaria("Laura", 1000);

        cuentaPedro.transferir(cuentaLaura, 500);
        System.out.println("Saldo de " + cuentaPedro.getTitular() + ": " + cuentaPedro.getSaldo());
        System.out.println("Saldo de " + cuentaLaura.getTitular() + ": " + cuentaLaura.getSaldo());
    }
}
