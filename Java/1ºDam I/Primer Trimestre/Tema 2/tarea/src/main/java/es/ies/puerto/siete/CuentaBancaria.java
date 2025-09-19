package es.ies.puerto.siete;
import java.util.Objects;
/**
 * Define una clase CuentaBancaria con los atributos saldo, titular, y numero. Implementa métodos depositar() y retirar(). 
 * Utiliza equals() para comparar dos cuentas por el número de cuenta y toString() para mostrar el estado actual de la cuenta.
 * @author emsantamaria
 * @version 1.0.0
 */
public class CuentaBancaria {
    private String titular;
    private int numero;
    private float saldo;

    /**
     * Constructor vacío por defecto
     */

     public CuentaBancaria() {
    }

    /**
     * Constructor con parámetros
     * @param titular
     * @param numero
     * @param saldo;
     */
    public CuentaBancaria(String titular, int numero, float saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }


    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    /**
     * Metodo que sustrae saldo del saldo de una cuenta
     * @param retirarSaldo
     */
    public void retirarSaldo(float retiro){
            saldo -= retiro;
    }

    /**
     * Metodo que deposita saldo dentro del saldo de una cuenta
     * @param depositarSaldo
     */
    public void depositarSaldo(float deposito){
            saldo+=deposito;
    }

    @Override
    public String toString() {
    return "CuentaBancaria{" +
                "Titular:'" + titular + "'" +
                ", Numero:" + numero +
                ", Saldo:" + saldo +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CuentaBancaria)) {
            return false;
        }
        CuentaBancaria cuentaBancaria = (CuentaBancaria) o;
        return numero == cuentaBancaria.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(titular, numero, saldo);
    }
    
}
