package com.docencia.listas.ejercicio04;

import com.docencia.listas.ejercicio04.Ejercicio04;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio04Test {

    @Test
    void reemplazarNombres() {
        List<String> nombres = new ArrayList<>(Arrays.asList("Ana", "Luis", "Ana", "Marta"));
        Ejercicio04.reemplazar(nombres, "Ana", "Eva");
        assertEquals(Arrays.asList("Eva", "Luis", "Eva", "Marta"), nombres);
    }
}
