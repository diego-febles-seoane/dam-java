package com.docencia.listas.ejercicio07;

import com.docencia.listas.ejercicio07.Ejercicio07;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio07Test {

    @Test
    void ordenarConSort() {
        List<Integer> datos = new ArrayList<>(Arrays.asList(5, 1, 4, 2, 3));
        Ejercicio07.ordenarConSort(datos);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), datos);
    }

    @Test
    void ordenarSinSort() {
        List<Integer> datos = new ArrayList<>(Arrays.asList(5, 1, 4, 2, 3));
        Ejercicio07.ordenarSinSort(datos);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), datos);
    }
}
