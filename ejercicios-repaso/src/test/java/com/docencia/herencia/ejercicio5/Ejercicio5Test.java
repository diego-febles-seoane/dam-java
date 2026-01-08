package com.docencia.herencia.ejercicio5;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio5Test {

    @Test
    void cuentasBancarias_basico() {
        var cc = new Ejercicio5.CuentaCorriente("ES1", 2.0);
        var ca = new Ejercicio5.CuentaAhorro("ES2");

        cc.ingresar(100.0);
        ca.ingresar(50.0);

        cc.retirar(20.0); // se aplicará comisión fija de 2.0 -> total 22 retirados
        ca.retirar(70.0); // no debería permitir dejar saldo negativo -> no cambia

        assertEquals(78.0, cc.getSaldo(), 0.0001);
        assertEquals(50.0, ca.getSaldo(), 0.0001);

        double total = Ejercicio5.saldoTotal(Arrays.asList(cc, ca, null));
        assertEquals(128.0, total, 0.0001);
    }

    @Test
    void ingresoYRetirosInvalidos() {
        var cc = new Ejercicio5.CuentaCorriente("ES1", 1.0);
        cc.ingresar(-10.0); // no debe ingresar
        assertEquals(0.0, cc.getSaldo(), 0.0001);

        cc.retirar(10.0); // no tiene saldo suficiente para retirar 10 + 1 comisión
        assertEquals(0.0, cc.getSaldo(), 0.0001);
    }

    @Test
    void saldoTotal_listaNullOVacia() {
        assertEquals(0.0, Ejercicio5.saldoTotal(null), 0.0001);
        assertEquals(0.0, Ejercicio5.saldoTotal(Collections.emptyList()), 0.0001);
    }
}
