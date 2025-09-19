import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import es.ies.puerto.dos.Ejercicio2;
import es.ies.puerto.uno.Ejercicio1;

class Ejercicio2Test {

    @Test
    void testTransformarVocalVocalEnMinuscula() {
        String frase = "La programación es divertida";
        char vocal = 'a';
        String resultado = Ejercicio2.transformarVocal(frase, vocal);
        assertEquals("LA progrAmAción es divertidA", resultado);
    }

    @Test
    void testTransformarVocalVocalEnMayuscula() {
        String frase = "Aprender a programar";
        char vocal = 'A';
        String resultado = Ejercicio2.transformarVocal(frase, vocal);
        assertEquals("Aprender A progrAmAr", resultado);
    }

    @Test
    void testTransformarVocalSinOcurrencias() {
        String frase = "Hola mundo";
        char vocal = 'e';
        String resultado = Ejercicio2.transformarVocal(frase, vocal);
        assertEquals("Hola mundo", resultado);
    }

    @Test
    void testTransformarVocalFraseVacia() {
        String frase = "";
        char vocal = 'i';
        String resultado = Ejercicio2.transformarVocal(frase, vocal);
        assertEquals("", resultado);
    }

    @Test
    void testTransformarVocalVocalInvalida() {
        String frase = "Hola mundo";
        char vocal = 'x';  
        String resultado = Ejercicio2.transformarVocal(frase, vocal);
        assertEquals("Hola mundo", resultado);
    }

    @Test
    void testTransformarVocalConVariasVocales() {
        String frase = "Esta es una prueba con muchas vocales";
        char vocal = 'e';
        String resultado = Ejercicio2.transformarVocal(frase, vocal);
        assertEquals("Esta Es una pruEba con muchas vocalEs", resultado);
    }
}
