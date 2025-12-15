package com.docencia.herencia.ejercicio16;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio16Test {

    @Test
    void ofertas_precioFinalYSuma() {
        Oferta o1 =
                new OfertaPorcentaje(100.0, 10.0); // 90
        Oferta o2 =
                new OfertaCantidadFija(50.0, 20.0); // 30
        Oferta o3 =
                new OfertaCantidadFija(10.0, 50.0); // no puede ser negativa -> 0

        assertEquals(90.0, o1.precioFinal(), 0.0001);
        assertEquals(30.0, o2.precioFinal(), 0.0001);
        assertEquals(0.0, o3.precioFinal(), 0.0001);

        double suma = OfertaCantidadFija.sumaPreciosFinales(Arrays.asList(o1, o2, o3, null));
        assertEquals(120.0, suma, 0.0001);
    }

    @Test
    void ofertas_listaNullOVacia() {
        assertEquals(0.0, OfertaCantidadFija.sumaPreciosFinales(null), 0.0001);
        assertEquals(0.0, OfertaCantidadFija.sumaPreciosFinales(Collections.emptyList()), 0.0001);
    }
}
