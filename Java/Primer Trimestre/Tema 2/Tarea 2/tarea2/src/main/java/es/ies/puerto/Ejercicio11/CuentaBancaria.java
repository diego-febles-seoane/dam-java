package es.ies.puerto.Ejercicio11;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria() {

    }

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void transferir(CuentaBancaria cuentaDestino, double cantidad) {
        if (cantidad > 0 && cantidad <= this.saldo) {
            this.saldo -= cantidad;
            cuentaDestino.saldo += cantidad;
            System.out.println("Transferidos " + cantidad + " de " + this.titular + " a " + cuentaDestino.titular);
        } else {
            System.out.println("Saldo insuficinte para la transferencia, verifica la cantidad.");
        }
    }
}
