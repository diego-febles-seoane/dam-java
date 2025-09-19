package es.ies.puerto.Ejercicio7;

/**
 * Documentar
 * 
 * @author
 * @version
 */
public class Banco {
    private float saldo;

    /**
     * Constructor vacío
     */
    public Banco() {

    }

    public Banco(int saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void depositar(float cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depositado: " + cantidad);
        } else {
            System.out.println("La cantidad a depositar tiene que ser mayor a 0.");
        }
    }

    public void retirar(float cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retirados: " + cantidad);
        } else if (cantidad > saldo) {
            System.out.println("No hay suficiente saldo.");
        } else {
            System.out.println("La cantidad a retirar tiene que ser mayor a 0.");
        }
    }
}
