package com.docencia.interfaces.ejercicio4;

import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;

import org.junit.jupiter.api.Test;

/** Tests de la clase Cancion. */
public class CancionTest {

    @Test
    void constructorAsignaCampos() {
        UUID id = UUID.randomUUID();
        Cancion obj = new Cancion(id, "titulo", "artista");
        assertEquals(id, obj.getId());
        assertEquals("titulo", obj.getTitulo());
        assertEquals("artista", obj.getArtista());
    }

    @Test
    void idSeAutogeneraSiEsNull() {
        Cancion obj = new Cancion(null, "titulo", "artista");
        assertNotNull(obj.getId());
    }

    @Test
    void idsDiferentesParaInstanciasDistintas() {
        Cancion a = new Cancion(null, "titulo", "artista");
        Cancion b = new Cancion(null, "titulo", "artista");
        assertNotEquals(a.getId(), b.getId());
    }

    @Test
    void equalsMismoIdEsTrue() {
        UUID id = UUID.randomUUID();
        Cancion a = new Cancion(id, "titulo", "artista");
        Cancion b = new Cancion(id, "titulo", "artista");
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equalsIdDistintoEsFalse() {
        Cancion a = new Cancion(UUID.randomUUID(), "titulo", "artista");
        Cancion b = new Cancion(UUID.randomUUID(), "titulo", "artista");
        assertNotEquals(a, b);
    }

    @Test
    void toStringContieneClaseEId() {
        UUID id = UUID.randomUUID();
        Cancion obj = new Cancion(id, "titulo", "artista");
        String s = obj.toString();
        assertTrue(s.contains("Cancion"));
        assertTrue(s.contains(id.toString()));
    }

    @Test
    void implementaInterfazYEjecutaMetodo() {
        Reproducible obj = new Cancion(null, "titulo", "artista");
        assertNotNull(obj.reproducir());
    }

    @Test
    void documentacionPresenteEnClase() throws Exception {
        Path p = Path.of("src/main/java/com/docencia/interfaces/ejercicio4/Cancion.java");
        String src = Files.readString(p);
        assertTrue(src.contains("/**"), "La clase debe tener Javadoc");
    }
}
