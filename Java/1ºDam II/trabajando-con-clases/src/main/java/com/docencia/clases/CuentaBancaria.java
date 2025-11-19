package com.docencia.clases;

import java.util.Objects;

public class CuentaBancaria {
    private final String iban;
    private double saldo;

    public CuentaBancaria() {
        this("", 0);
    }

    /**
     * Constructor de la clase Cuenta Bancaria
     * 
     * @param iban de la cuenta. Por defecto el saldo incial es 0.0
     */
    public CuentaBancaria(String iban) {
        this(iban, 0);
    }

    /**
     * Constructor de la clase Cuenta Bancaria
     * 
     * @param iban  Iban identificativo de la cuenta
     * @param saldo Saldo positivo de la cuenta. En caso de <= 0 genera
     *              IllegalArgumentException.
     */
    public CuentaBancaria(String iban, double saldo) {
        if(!esIban(iban)) {
            throw new IllegalArgumentException("iban");
        }
        this.iban = iban;

        if (saldo < 0) {
            throw new IllegalArgumentException("saldo");
        }
        this.saldo = saldo;
    }

    /* Getters && Setters */

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("saldo");
        }
        this.saldo = saldo;
    }

    /**
     * Funcion que permite ingresar una cantidad en la cuenta
     * 
     * @param cantidad Cantidad que sumamos en la cuenta
     */
    public void ingresar(double cantidad) {
        if (cantidad < -1) {
            throw new IllegalArgumentException("cantidad");
        }
        this.saldo = this.saldo + cantidad;
        // saldo += cantidad;
    }

    /**
     * Funcion que retira una cantidad de la cuenta
     * 
     * @param cantidad Cantidad que se retira de la cuenta. Nunca la cantidad a
     *                 retirar sera
     *                 mayor que el saldo disponible
     */
    public void retirar(double cantidad) {
        if (cantidad < -1 || cantidad > saldo) {
            throw new IllegalArgumentException("cantidad");
        }
        this.saldo = this.saldo - cantidad;
        // saldo -= cantidad;
    }

    /**
     * Funcion que crea un objeto tipo Cuenta Bancaria a partir del iban y el saldo
     * 
     * @param iban  Iban de la cuenta bancaria
     * @param saldo Saldo de la cuenta bancaria
     * @return Un objeto creado de tipo CuentaBancaria
     */
    public static CuentaBancaria of(String iban, double saldo) {
        return new CuentaBancaria(iban, saldo);
    }

    /**
     * Funcion que indica si el parametro iban es correcto
     * @param iban Iban de la cuenta bancaria
     * @return true/false 
     */
    public static boolean esIban(String iban) {
        if (iban == null || iban.isEmpty() || !iban.startsWith("E")) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cuenta(" + iban + ", saldo=" + saldo + ")";
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CuentaBancaria)) {
            return false;
        }
        CuentaBancaria cuentaBancaria = (CuentaBancaria) o;

        if (!esIban(iban) || !esIban(cuentaBancaria.iban)) {
            return false;
        }
        
        return Objects.equals(iban, cuentaBancaria.iban);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iban);
    }


    public static void main(String[] args) {
        CuentaBancaria cuentaBancaria1 = new CuentaBancaria("iban1");
        System.out.println(cuentaBancaria1);
        CuentaBancaria cuentaBancaria2 = new CuentaBancaria("iban2", 0);
        System.out.println(cuentaBancaria2);
        cuentaBancaria2.ingresar(50);
        cuentaBancaria2.retirar(20);
        System.out.println(cuentaBancaria2);

        CuentaBancaria cuentaBancaria3 = CuentaBancaria.of("iban3", 10);
        String iban4 = "iban4";
        
        if (CuentaBancaria.esIban(iban4)) {
            System.out.println("El iban "+iban4+", es valido");
        }else {
            System.out.println("El iban es incorrecto");
        }
        System.out.println(cuentaBancaria3);

    }

}
