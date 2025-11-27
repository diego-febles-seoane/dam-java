package com.docencia.listas.ejercicio05;

import com.docencia.listas.ejercicio05.Ejercicio05;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio05Test {

    @Test
    void invertirLista() {
        List<String> lista = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        Ejercicio05.invertir(lista);
        assertEquals(Arrays.asList("d", "c", "b", "a"), lista);
    }
}
