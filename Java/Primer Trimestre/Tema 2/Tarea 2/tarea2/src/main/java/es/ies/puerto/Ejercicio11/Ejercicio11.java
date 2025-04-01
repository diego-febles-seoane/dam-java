package es.ies.puerto.Ejercicio11;

import es.ies.puerto.Ejercicio10.CuentaBancaria;

/**
 * Crea dos objetos de la clase CuentaBancaria con titulares "Luis" y "Sofía",
 * con saldos de 500 y 3000 respectivamente. Intenta transferir 1000 de la
 * cuenta de Luis y muestra un mensaje de saldo insuficiente.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        CuentaBancaria cuentaLuis = new CuentaBancaria("Luis", 500);
        CuentaBancaria cuentaSofia = new CuentaBancaria("Sofía", 3000);

        cuentaLuis.transferir(cuentaSofia, 1000);
        System.out.println("Saldo de " + cuentaLuis.getTitular() + ": " + cuentaLuis.getSaldo());
        System.out.println("Saldo de " + cuentaSofia.getTitular() + ": " + cuentaSofia.getSaldo());
    }
}
