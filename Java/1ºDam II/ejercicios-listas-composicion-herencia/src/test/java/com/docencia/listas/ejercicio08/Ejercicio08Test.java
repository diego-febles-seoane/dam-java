package com.docencia.listas.ejercicio08;

import com.docencia.listas.ejercicio08.Ejercicio08;
import com.docencia.listas.ejercicio08.Ejercicio08.ResultadoParticion;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio08Test {

    @Test
    void partirParesEImpares() {
        List<Integer> datos = Arrays.asList(1, 2, 3, 4, 5, 6);
        ResultadoParticion res = Ejercicio08.partir(datos);
        assertEquals(Arrays.asList(2, 4, 6), res.getPares());
        assertEquals(Arrays.asList(1, 3, 5), res.getImpares());
    }
}
