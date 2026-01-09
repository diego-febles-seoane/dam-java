package com.docencia.listas.ejercicio15;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio15Test {

    @Test
    void buscarPrimeraQueContieneTest() {
        var lista = Arrays.asList(" Hola mundo ", "Adiós", null, " mUndo pequeño ");
        String r1 = Ejercicio15.buscarPrimeraQueContiene(lista, "MUNDO");
        assertEquals("Hola mundo", r1);
    }
    
    @Test
    void buscarPrimeraQueContiene_coincidenciaExacta() {
        var lista = Arrays.asList("Java", "Python", "JavaScript", "C++");
        String resultado = Ejercicio15.buscarPrimeraQueContiene(lista, "Java");
        assertEquals("Java", resultado);
    }
    
    @Test
    void buscarPrimeraQueContiene_primeraCoincidencia() {
        var lista = Arrays.asList("perro grande", "gato pequeño", "perro mediano", "gato grande");
        String resultado = Ejercicio15.buscarPrimeraQueContiene(lista, "perro");
        assertEquals("perro grande", resultado);
    }
    
    @Test
    void buscarPrimeraQueContiene_ignoraMayusculasMinusculas() {
        var lista = Arrays.asList("HOLA MUNDO", "hola mundo", "Hola Mundo", "hOlA mUnDo");
        String resultado = Ejercicio15.buscarPrimeraQueContiene(lista, "hola");
        assertEquals("HOLA MUNDO", resultado);
    }
    
    @Test
    void buscarPrimeraQueContiene_conEspaciosAlrededor() {
        var lista = Arrays.asList("  texto con espacios  ", "otro texto", "  más texto  ");
        String resultado = Ejercicio15.buscarPrimeraQueContiene(lista, "texto");
        assertEquals("texto con espacios", resultado);
    }
    
    @Test
    void buscarPrimeraQueContiene_fragmentoConEspacios() {
        var lista = Arrays.asList("Hola mundo cruel", "Hola mundo feliz", "Adiós mundo");
        String resultado = Ejercicio15.buscarPrimeraQueContiene(lista, "mundo cruel");
        assertEquals("Hola mundo cruel", resultado);
    }
    
    @Test
    void buscarPrimeraQueContiene_fragmentoConEspaciosAlrededor() {
        var lista = Arrays.asList("Hola mundo", "Adiós mundo");
        String resultado = Ejercicio15.buscarPrimeraQueContiene(lista, "  mundo  ");
        assertEquals("Hola mundo", resultado);
    }
    
    @Test
    void buscarPrimeraQueContiene_conNullsEnLista() {
        var lista = Arrays.asList(null, "texto uno", null, "texto dos", null);
        String resultado = Ejercicio15.buscarPrimeraQueContiene(lista, "dos");
        assertEquals("texto dos", resultado);
    }
    
    @Test
    void buscarPrimeraQueContiene_textoVacioEnLista() {
        var lista = Arrays.asList("", "   ", "texto válido", "otro");
        String resultado = Ejercicio15.buscarPrimeraQueContiene(lista, "válido");
        assertEquals("texto válido", resultado);
    }
    
    @Test
    void buscarPrimeraQueContiene_fragmentoVacio() {
        var lista = Arrays.asList("Hola", "Mundo");
        String resultado = Ejercicio15.buscarPrimeraQueContiene(lista, "");
        assertNull(resultado);
    }
    
    @Test
    void buscarPrimeraQueContiene_fragmentoSoloEspacios() {
        var lista = Arrays.asList("Hola mundo", "Adiós");
        String resultado = Ejercicio15.buscarPrimeraQueContiene(lista, "     ");
        assertNull(resultado);
    }
    
    @Test
    void buscarPrimeraQueContiene_coincidenciaParcial() {
        var lista = Arrays.asList("programación", "programa", "pro", "gramática");
        String resultado = Ejercicio15.buscarPrimeraQueContiene(lista, "prog");
        assertEquals("programación", resultado);
    }
    
    @Test
    void buscarPrimeraQueContiene_noCoincidenciaPorMayusculas() {
        var lista = Arrays.asList("TEXTO", "texto", "Texto");
        String resultado = Ejercicio15.buscarPrimeraQueContiene(lista, "TEXTO");
        assertEquals("TEXTO", resultado);
    }
    
    @Test
    void buscarPrimeraQueContiene_caracteresEspeciales() {
        var lista = Arrays.asList("año 2024", "mes 12", "día 31");
        String resultado = Ejercicio15.buscarPrimeraQueContiene(lista, "año");
        assertEquals("año 2024", resultado);
    }
    
    @Test
    void buscarPrimeraQueContiene_acentos() {
        var lista = Arrays.asList("canción", "acción", "lectión");
        String resultado = Ejercicio15.buscarPrimeraQueContiene(lista, "ción");
        assertEquals("canción", resultado);
    }
    
    @Test
    void buscarPrimeraQueContiene_numeros() {
        var lista = Arrays.asList("a123b", "c456d", "e789f");
        String resultado = Ejercicio15.buscarPrimeraQueContiene(lista, "123");
        assertEquals("a123b", resultado);
    }
    
    @Test
    void buscarPrimeraQueContiene_listaUnaSolaEntrada() {
        var lista = Collections.singletonList("único elemento");
        String resultado = Ejercicio15.buscarPrimeraQueContiene(lista, "elemento");
        assertEquals("único elemento", resultado);
    }
    
    
    @Test
    void buscarPrimeraQueContiene_textoLargo() {
        var lista = Arrays.asList(
            "Este es un texto muy largo que contiene muchas palabras diferentes",
            "Otro texto corto",
            "Más texto para probar"
        );
        String resultado = Ejercicio15.buscarPrimeraQueContiene(lista, "contiene muchas");
        assertEquals("Este es un texto muy largo que contiene muchas palabras diferentes", resultado);
    }
    
    // Tests parametrizados para casos límite
    static Stream<Arguments> proveedorCasosInvalidos() {
        return Stream.of(
            Arguments.of(null, "fragmento"),
            Arguments.of(Arrays.asList("a", "b"), null),
            Arguments.of(Collections.emptyList(), "fragmento"),
            Arguments.of(Arrays.asList("a", "b"), ""),
            Arguments.of(Arrays.asList("a", "b"), "   "),
            Arguments.of(Arrays.asList("a", "b"), "\t\n")
        );
    }
    
}