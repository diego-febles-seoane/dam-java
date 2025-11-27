package com.docencia.listas.ejercicio01;

import com.docencia.listas.ejercicio01.Ejercicio01;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio01Test {

    @Test
    void maximoYMinimo() {
        List<Integer> datos = Arrays.asList(5, 1, 9, -3, 7);
        assertEquals(9, Ejercicio01.maximo(datos));
        assertEquals(-3, Ejercicio01.minimo(datos));
    }

    @Test
    void eliminarNegativos() {
        List<Integer> datos = new ArrayList<>(Arrays.asList(5, -1, 0, -3, 7));
        Ejercicio01.eliminarNegativos(datos);
        assertEquals(Arrays.asList(5, 0, 7), datos);
    }
}
