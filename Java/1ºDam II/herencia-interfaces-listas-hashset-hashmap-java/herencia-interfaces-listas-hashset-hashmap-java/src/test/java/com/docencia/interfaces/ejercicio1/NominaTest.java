package com.docencia.interfaces.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;

import org.junit.jupiter.api.Test;

/** Tests de la clase Nomina. */
public class NominaTest {

    @Test
    void constructorAsignaCampos() {
        UUID id = UUID.randomUUID();
        Nomina obj = new Nomina(id, 10.0, 10.0);
        assertEquals(id, obj.getId());
        assertEquals(10.0, obj.getBruto());
        assertEquals(10.0, obj.getRetencion());
    }

    @Test
    void idSeAutogeneraSiEsNull() {
        Nomina obj = new Nomina(null, 10.0, 10.0);
        assertNotNull(obj.getId());
    }

    @Test
    void idsDiferentesParaInstanciasDistintas() {
        Nomina a = new Nomina(null, 10.0, 10.0);
        Nomina b = new Nomina(null, 10.0, 10.0);
        assertNotEquals(a.getId(), b.getId());
    }

    @Test
    void equalsMismoIdEsTrue() {
        UUID id = UUID.randomUUID();
        Nomina a = new Nomina(id, 10.0, 10.0);
        Nomina b = new Nomina(id, 10.0, 10.0);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equalsIdDistintoEsFalse() {
        Nomina a = new Nomina(UUID.randomUUID(), 10.0, 10.0);
        Nomina b = new Nomina(UUID.randomUUID(), 10.0, 10.0);
        assertNotEquals(a, b);
    }

    @Test
    void toStringContieneClaseEId() {
        UUID id = UUID.randomUUID();
        Nomina obj = new Nomina(id, 10.0, 10.0);
        String s = obj.toString();
        assertTrue(s.contains("Nomina"));
        assertTrue(s.contains(id.toString()));
    }

    @Test
    void implementaInterfazYEjecutaMetodo() {
        Pagable obj = new Nomina(null, 10.0, 10.0);
        assertDoesNotThrow(() -> obj.total());
    }

    @Test
    void documentacionPresenteEnClase() throws Exception {
        Path p = Path.of("src/main/java/com/docencia/interfaces/ejercicio1/Nomina.java");
        String src = Files.readString(p);
        assertTrue(src.contains("/**"), "La clase debe tener Javadoc");
    }
}
