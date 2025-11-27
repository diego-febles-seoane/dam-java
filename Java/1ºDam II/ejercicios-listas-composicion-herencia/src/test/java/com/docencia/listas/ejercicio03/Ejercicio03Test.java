package com.docencia.listas.ejercicio03;

import com.docencia.listas.ejercicio03.Ejercicio03;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio03Test {

    @Test
    void sinDuplicadosMantieneOrden() {
        List<Integer> datos = Arrays.asList(1, 2, 2, 3, 1, 4, 3);
        List<Integer> resultado = Ejercicio03.sinDuplicados(datos);
        assertEquals(Arrays.asList(1, 2, 3, 4), resultado);
    }
}
