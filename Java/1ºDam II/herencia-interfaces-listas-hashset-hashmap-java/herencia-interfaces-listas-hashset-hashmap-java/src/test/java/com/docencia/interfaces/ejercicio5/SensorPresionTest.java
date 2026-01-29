package com.docencia.interfaces.ejercicio5;

import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;

import org.junit.jupiter.api.Test;

/** Tests de la clase SensorPresion. */
public class SensorPresionTest {

    @Test
    void constructorAsignaCampos() {
        UUID id = UUID.randomUUID();
        SensorPresion obj = new SensorPresion(id, "ubicacion", 10.0);
        assertEquals(id, obj.getId());
        assertEquals("ubicacion", obj.getUbicacion());
        assertEquals(10.0, obj.getKpa());
    }

    @Test
    void idSeAutogeneraSiEsNull() {
        SensorPresion obj = new SensorPresion(null, "ubicacion", 10.0);
        assertNotNull(obj.getId());
    }

    @Test
    void idsDiferentesParaInstanciasDistintas() {
        SensorPresion a = new SensorPresion(null, "ubicacion", 10.0);
        SensorPresion b = new SensorPresion(null, "ubicacion", 10.0);
        assertNotEquals(a.getId(), b.getId());
    }

    @Test
    void equalsMismoIdEsTrue() {
        UUID id = UUID.randomUUID();
        SensorPresion a = new SensorPresion(id, "ubicacion", 10.0);
        SensorPresion b = new SensorPresion(id, "ubicacion", 10.0);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equalsIdDistintoEsFalse() {
        SensorPresion a = new SensorPresion(UUID.randomUUID(), "ubicacion", 10.0);
        SensorPresion b = new SensorPresion(UUID.randomUUID(), "ubicacion", 10.0);
        assertNotEquals(a, b);
    }

    @Test
    void toStringContieneClaseEId() {
        UUID id = UUID.randomUUID();
        SensorPresion obj = new SensorPresion(id, "ubicacion", 10.0);
        String s = obj.toString();
        assertTrue(s.contains("SensorPresion"));
        assertTrue(s.contains(id.toString()));
    }

    @Test
    void implementaInterfazYEjecutaMetodo() {
        Medible obj = new SensorPresion(null, "ubicacion", 10.0);
        assertDoesNotThrow(() -> obj.medir());
    }

    @Test
    void documentacionPresenteEnClase() throws Exception {
        Path p = Path.of("src/main/java/com/docencia/interfaces/ejercicio5/SensorPresion.java");
        String src = Files.readString(p);
        assertTrue(src.contains("/**"), "La clase debe tener Javadoc");
    }
}
