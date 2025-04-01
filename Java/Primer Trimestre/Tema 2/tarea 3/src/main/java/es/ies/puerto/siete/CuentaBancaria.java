package es.ies.puerto.siete;
/**
 * Define una clase CuentaBancaria con los atributos saldo, titular, y numero. Implementa métodos depositar() y retirar(). Utiliza equals() para comparar dos cuentas por el número de cuenta y toString() para mostrar el estado actual de la cuenta.
 * @author deigo-febles-seoane
 * @version 1.0.0
 */
public class CuentaBancaria {
    private double saldo;
    private String titular;
    private String numero;

    /**
     * Constructor por defecto
     */
    public CuentaBancaria() {
    }

    /**
     * Constructor con parámetros
     * @param saldo el saldo inicial
     * @param titular el nombre del titular
     * @param numero el número de cuenta
     */

    public CuentaBancaria(double saldo, String titular, String numero) {
        this.saldo = saldo;
        this.titular = titular;
        this.numero = numero;
    }

    /**
     * Creamos los getters y setters
     */


    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Método para depositar dinero en la cuenta
     * @param importe el importe a depositar
     */

     public void depositar(double importe) {
        if (importe > 0) {
            this.saldo += importe;
        } else {
            System.out.println("Importe inválido");
        }
    }

    public void retirar(int importe) {
        if (importe > 0){
            this.saldo -= importe;
        } else {
            System.out.println("Importe inválido");
        }
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "saldo=" + saldo +
                ", titular='" + titular + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }
}
