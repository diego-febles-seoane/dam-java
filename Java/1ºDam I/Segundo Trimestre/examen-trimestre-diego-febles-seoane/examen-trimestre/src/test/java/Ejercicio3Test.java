import static org.junit.jupiter.api.Assertions.assertArrayEquals;


import org.junit.jupiter.api.Test;

import es.ies.puerto.tres.Ejercicio3;

 class Ejercicio3Test {

    @Test
    void testOrdenarArrayNumerosDesordenados() {
        int[] numeros = {35, 12, 89, 47, 25};
        int[] esperado = {12, 25, 35, 47, 89};
        assertArrayEquals(esperado, Ejercicio3.ordenarArray(numeros));
    }

    @Test
    void testOrdenarArrayNumerosYaOrdenados() {
        int[] numeros = {1, 2, 3, 4, 5};
        int[] esperado = {1, 2, 3, 4, 5};
        assertArrayEquals(esperado, Ejercicio3.ordenarArray(numeros));
    }

    @Test
    void testOrdenarArrayNumerosRepetidos() {
        int[] numeros = {10, 7, 10, 3, 7};
        int[] esperado = {3, 7, 7, 10, 10};
        assertArrayEquals(esperado, Ejercicio3.ordenarArray(numeros));
    }

    @Test
    void testOrdenarArrayUnElemento() {
        int[] numeros = {42};
        int[] esperado = {42};
        assertArrayEquals(esperado, Ejercicio3.ordenarArray(numeros));
    }

    @Test
    void testOrdenarArrayNumerosNegativos() {
        int[] numeros = {-5, -10, 0, 15, -3};
        int[] esperado = {-10, -5, -3, 0, 15};
        assertArrayEquals(esperado, Ejercicio3.ordenarArray(numeros));
    }

    @Test
    void testOrdenarArrayVacio() {
        int[] numeros = {};
        int[] esperado = {};
        assertArrayEquals(esperado, Ejercicio3.ordenarArray(numeros));
    }
}
