package com.docencia.interfaces.ejercicio4;

import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;

import org.junit.jupiter.api.Test;

/** Tests de la clase Podcast. */
public class PodcastTest {

    @Test
    void constructorAsignaCampos() {
        UUID id = UUID.randomUUID();
        Podcast obj = new Podcast(id, "nombre", 1);
        assertEquals(id, obj.getId());
        assertEquals("nombre", obj.getNombre());
        assertEquals(1, obj.getEpisodio());
    }

    @Test
    void idSeAutogeneraSiEsNull() {
        Podcast obj = new Podcast(null, "nombre", 1);
        assertNotNull(obj.getId());
    }

    @Test
    void idsDiferentesParaInstanciasDistintas() {
        Podcast a = new Podcast(null, "nombre", 1);
        Podcast b = new Podcast(null, "nombre", 1);
        assertNotEquals(a.getId(), b.getId());
    }

    @Test
    void equalsMismoIdEsTrue() {
        UUID id = UUID.randomUUID();
        Podcast a = new Podcast(id, "nombre", 1);
        Podcast b = new Podcast(id, "nombre", 1);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equalsIdDistintoEsFalse() {
        Podcast a = new Podcast(UUID.randomUUID(), "nombre", 1);
        Podcast b = new Podcast(UUID.randomUUID(), "nombre", 1);
        assertNotEquals(a, b);
    }

    @Test
    void toStringContieneClaseEId() {
        UUID id = UUID.randomUUID();
        Podcast obj = new Podcast(id, "nombre", 1);
        String s = obj.toString();
        assertTrue(s.contains("Podcast"));
        assertTrue(s.contains(id.toString()));
    }

    @Test
    void implementaInterfazYEjecutaMetodo() {
        Reproducible obj = new Podcast(null, "nombre", 1);
        assertNotNull(obj.reproducir());
    }

    @Test
    void documentacionPresenteEnClase() throws Exception {
        Path p = Path.of("src/main/java/com/docencia/interfaces/ejercicio4/Podcast.java");
        String src = Files.readString(p);
        assertTrue(src.contains("/**"), "La clase debe tener Javadoc");
    }
}
