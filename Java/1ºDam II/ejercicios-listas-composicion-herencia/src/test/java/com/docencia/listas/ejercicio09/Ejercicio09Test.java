package com.docencia.listas.ejercicio09;

import com.docencia.listas.ejercicio09.Ejercicio09;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio09Test {

    @Test
    void paginacionBasica() {
        List<String> elementos = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            elementos.add("elem" + i);
        }

        List<String> pagina1 = Ejercicio09.pagina(elementos, 1, 3);
        assertEquals(Arrays.asList("elem0", "elem1", "elem2"), pagina1);

        List<String> pagina2 = Ejercicio09.pagina(elementos, 2, 3);
        assertEquals(Arrays.asList("elem3", "elem4", "elem5"), pagina2);

        List<String> pagina4 = Ejercicio09.pagina(elementos, 4, 3);
        assertEquals(Arrays.asList("elem9"), pagina4);

        List<String> paginaFueraDeRango = Ejercicio09.pagina(elementos, 5, 3);
        assertTrue(paginaFueraDeRango.isEmpty());
    }
}
