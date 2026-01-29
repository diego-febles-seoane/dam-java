package com.docencia.interfaces.ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;

import org.junit.jupiter.api.Test;

/** Tests de la clase Dron. */
public class DronTest {

    @Test
    void constructorAsignaCampos() {
        UUID id = UUID.randomUUID();
        Dron obj = new Dron(id, "marca", 1);
        assertEquals(id, obj.getId());
        assertEquals("marca", obj.getMarca());
        assertEquals(1, obj.getBateriaMinutos());
    }

    @Test
    void idSeAutogeneraSiEsNull() {
        Dron obj = new Dron(null, "marca", 1);
        assertNotNull(obj.getId());
    }

    @Test
    void idsDiferentesParaInstanciasDistintas() {
        Dron a = new Dron(null, "marca", 1);
        Dron b = new Dron(null, "marca", 1);
        assertNotEquals(a.getId(), b.getId());
    }

    @Test
    void equalsMismoIdEsTrue() {
        UUID id = UUID.randomUUID();
        Dron a = new Dron(id, "marca", 1);
        Dron b = new Dron(id, "marca", 1);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equalsIdDistintoEsFalse() {
        Dron a = new Dron(UUID.randomUUID(), "marca", 1);
        Dron b = new Dron(UUID.randomUUID(), "marca", 1);
        assertNotEquals(a, b);
    }

    @Test
    void toStringContieneClaseEId() {
        UUID id = UUID.randomUUID();
        Dron obj = new Dron(id, "marca", 1);
        String s = obj.toString();
        assertTrue(s.contains("Dron"));
        assertTrue(s.contains(id.toString()));
    }

    @Test
    void implementaInterfazYEjecutaMetodo() {
        Volador obj = new Dron(null, "marca", 1);
        assertDoesNotThrow(() -> obj.altitudMaxima());
    }

    @Test
    void documentacionPresenteEnClase() throws Exception {
        Path p = Path.of("src/main/java/com/docencia/interfaces/ejercicio2/Dron.java");
        String src = Files.readString(p);
        assertTrue(src.contains("/**"), "La clase debe tener Javadoc");
    }
}
