package com.docencia.programacion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ejercicio16Test {

    @Test
    @Order(1)
    void invalidDepositsDoNothing() {
        Ejercicio16 acc = new Ejercicio16();
        acc.deposit(-10.0);
        assertEquals(0.0, acc.getBalance(), 0.0001);
    }

    @Test
    @Order(2)
    void newAccountHasZeroBalance() {
        Ejercicio16 acc = new Ejercicio16();
        assertEquals(0.0, acc.getBalance(), 0.0001);
    }

    @Test
    @Order(3)
    void depositAndWithdrawOk() {
        Ejercicio16 acc = new Ejercicio16();
        acc.deposit(100.0);
        assertEquals(100.0, acc.getBalance(), 0.0001);

        boolean withdrew = acc.withdraw(40.0);
        assertTrue(withdrew);
        assertEquals(60.0, acc.getBalance(), 0.0001);
    }

    @Test
    @Order(4)
    void withdrawMoreThanBalanceFails() {
        Ejercicio16 acc = new Ejercicio16();
        acc.deposit(50.0);
        boolean withdrew = acc.withdraw(100.0);
        assertFalse(withdrew);
        assertEquals(50.0, acc.getBalance(), 0.0001);
    }
}
