package com.docencia.listas.ejercicio10;

import com.docencia.listas.ejercicio10.Ejercicio10;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio10Test {

    @Test
    void rotarLista() {
        List<Integer> datos = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Ejercicio10.rotar(datos, 2);
        assertEquals(Arrays.asList(4, 5, 1, 2, 3), datos);

        Ejercicio10.rotar(datos, 5); // Rotar tamaño de la lista → igual
        assertEquals(Arrays.asList(4, 5, 1, 2, 3), datos);

        Ejercicio10.rotar(datos, 7); // 7 mod 5 = 2
        assertEquals(Arrays.asList(2, 3, 4, 5, 1), datos);
    }
}
