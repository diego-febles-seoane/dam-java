package com.docencia.arrays.ejercicio9;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio9Test {
    @Test
    void concatenaCorrectamenteTest() {
        assertEquals("a-b-c", Ejercicio9.concatenarConGuion(new String[]{"a","b","c"}));
    }

    @Test
    void arraysVaciosTest() {
        assertEquals("", Ejercicio9.concatenarConGuion(new String[]{}));
    }

    @Test
    void nullDebeDevolverVacioTest() {
        assertEquals("", Ejercicio9.concatenarConGuion(null));
    }
    
    @Test
    void arrayConUnElementoTest() {
        assertEquals("solo", Ejercicio9.concatenarConGuion(new String[]{"solo"}));
        assertEquals("Hola", Ejercicio9.concatenarConGuion(new String[]{"Hola"}));
    }
    
    @Test
    void arrayConVariosElementosTest() {
        assertEquals("Java-es-genial", Ejercicio9.concatenarConGuion(new String[]{"Java","es","genial"}));
        assertEquals("uno-dos-tres-cuatro", Ejercicio9.concatenarConGuion(new String[]{"uno","dos","tres","cuatro"}));
    }
    
    @Test
    void arrayConElementosVaciosONullTest() {
        assertEquals("-b-c", Ejercicio9.concatenarConGuion(new String[]{"","b","c"}));
        assertEquals("a--c", Ejercicio9.concatenarConGuion(new String[]{"a","","c"}));
        assertEquals("a-b-", Ejercicio9.concatenarConGuion(new String[]{"a","b",""}));
    }
    
    @Test
    void arrayConNumerosTest() {
        assertEquals("1-2-3-4-5", Ejercicio9.concatenarConGuion(new String[]{"1","2","3","4","5"}));
    }

}
