package com.docencia.interfaces.ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;

import org.junit.jupiter.api.Test;

/** Tests de la clase Avion. */
public class AvionTest {

    @Test
    void constructorAsignaCampos() {
        UUID id = UUID.randomUUID();
        Avion obj = new Avion(id, "modelo", 1);
        assertEquals(id, obj.getId());
        assertEquals("modelo", obj.getModelo());
        assertEquals(1, obj.getMotores());
    }

    @Test
    void idSeAutogeneraSiEsNull() {
        Avion obj = new Avion(null, "modelo", 1);
        assertNotNull(obj.getId());
    }

    @Test
    void idsDiferentesParaInstanciasDistintas() {
        Avion a = new Avion(null, "modelo", 1);
        Avion b = new Avion(null, "modelo", 1);
        assertNotEquals(a.getId(), b.getId());
    }

    @Test
    void equalsMismoIdEsTrue() {
        UUID id = UUID.randomUUID();
        Avion a = new Avion(id, "modelo", 1);
        Avion b = new Avion(id, "modelo", 1);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equalsIdDistintoEsFalse() {
        Avion a = new Avion(UUID.randomUUID(), "modelo", 1);
        Avion b = new Avion(UUID.randomUUID(), "modelo", 1);
        assertNotEquals(a, b);
    }

    @Test
    void toStringContieneClaseEId() {
        UUID id = UUID.randomUUID();
        Avion obj = new Avion(id, "modelo", 1);
        String s = obj.toString();
        assertTrue(s.contains("Avion"));
        assertTrue(s.contains(id.toString()));
    }

    @Test
    void implementaInterfazYEjecutaMetodo() {
        Volador obj = new Avion(null, "modelo", 1);
        assertDoesNotThrow(() -> obj.altitudMaxima());
    }

    @Test
    void documentacionPresenteEnClase() throws Exception {
        Path p = Path.of("src/main/java/com/docencia/interfaces/ejercicio2/Avion.java");
        String src = Files.readString(p);
        assertTrue(src.contains("/**"), "La clase debe tener Javadoc");
    }
}
