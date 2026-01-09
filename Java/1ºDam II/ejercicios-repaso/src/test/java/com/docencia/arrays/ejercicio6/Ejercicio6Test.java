package com.docencia.arrays.ejercicio6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio6Test {
    @Test
    void caso1() {
        assertEquals(2, Ejercicio6.mediaEntera(new int[]{2,2,3,3}));
    }

    @Test
    void nullDebeDevolverCero() {
        assertEquals(0, Ejercicio6.mediaEntera(null));
    }

}
