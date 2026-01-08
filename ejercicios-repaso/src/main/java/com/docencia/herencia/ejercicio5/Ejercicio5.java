package com.docencia.herencia.ejercicio5;


import java.util.List;


/**
 * Ejercicio 5
 *
 * Clase lanzadora (opcional) y contenedor de métodos del enunciado.
 */

public class Ejercicio5 {

    private Ejercicio5() {
    }

    public static void main(String[] args) {
        // Puedes ejecutar aquí pruebas manuales rápidas si lo deseas.
    }


public static class CuentaCorriente extends CuentaBancaria {
        private final double comisionFija;

        public CuentaCorriente(String numeroCuenta, double comisionFija) {
            super(numeroCuenta);
            this.comisionFija = comisionFija;
        }

        @Override
        public void retirar(double cantidad) {
            // TODO: aplicar comisión al retirar, controlando saldos negativos según tests.
            // provisional: sin efecto
        }
    }

    public static class CuentaAhorro extends CuentaBancaria {

        public CuentaAhorro(String numeroCuenta) {
            super(numeroCuenta);
        }

        @Override
        public void retirar(double cantidad) {
            // TODO: no permitir que el saldo quede negativo.
            // provisional: sin efecto
        }
    }

    public static double saldoTotal(List<CuentaBancaria> cuentas) {
        // TODO: sumar saldos de cuentas no nulas.
        return 0.0;
    }

}
