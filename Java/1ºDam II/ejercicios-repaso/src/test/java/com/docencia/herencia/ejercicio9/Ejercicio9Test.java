package com.docencia.herencia.ejercicio9;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio9Test {

    @Test
    void pagos_basico() {
        Pago p1 =
                new PagoEfectivo(100.0);
        Pago p2 =
                new PagoTarjeta(50.0, 10.0); // 55

        assertEquals(100.0, p1.calcularImporteFinal(), 0.0001);
        assertEquals(55.0, p2.calcularImporteFinal(), 0.0001);

        double total = PagoTarjeta.totalPagos(Arrays.asList(p1, p2, null));
        assertEquals(155.0, total, 0.0001);
    }

    @Test
    void pagos_importesNegativosYListaNull() {
        Pago p1 =
                new PagoEfectivo(-10.0); // -> 0
        Pago p2 =
                new PagoTarjeta(-20.0, 50.0); // -> 0

        assertEquals(0.0, p1.calcularImporteFinal(), 0.0001);
        assertEquals(0.0, p2.calcularImporteFinal(), 0.0001);
        assertEquals(0.0, PagoTarjeta.totalPagos(null), 0.0001);
        assertEquals(0.0, PagoTarjeta.totalPagos(Collections.emptyList()), 0.0001);
    }
}
