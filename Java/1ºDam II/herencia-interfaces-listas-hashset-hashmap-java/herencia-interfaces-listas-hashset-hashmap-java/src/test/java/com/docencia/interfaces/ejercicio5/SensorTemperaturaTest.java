package com.docencia.interfaces.ejercicio5;

import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;

import org.junit.jupiter.api.Test;

/** Tests de la clase SensorTemperatura. */
public class SensorTemperaturaTest {

    @Test
    void constructorAsignaCampos() {
        UUID id = UUID.randomUUID();
        SensorTemperatura obj = new SensorTemperatura(id, "ubicacion", 10.0);
        assertEquals(id, obj.getId());
        assertEquals("ubicacion", obj.getUbicacion());
        assertEquals(10.0, obj.getCelsius());
    }

    @Test
    void idSeAutogeneraSiEsNull() {
        SensorTemperatura obj = new SensorTemperatura(null, "ubicacion", 10.0);
        assertNotNull(obj.getId());
    }

    @Test
    void idsDiferentesParaInstanciasDistintas() {
        SensorTemperatura a = new SensorTemperatura(null, "ubicacion", 10.0);
        SensorTemperatura b = new SensorTemperatura(null, "ubicacion", 10.0);
        assertNotEquals(a.getId(), b.getId());
    }

    @Test
    void equalsMismoIdEsTrue() {
        UUID id = UUID.randomUUID();
        SensorTemperatura a = new SensorTemperatura(id, "ubicacion", 10.0);
        SensorTemperatura b = new SensorTemperatura(id, "ubicacion", 10.0);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equalsIdDistintoEsFalse() {
        SensorTemperatura a = new SensorTemperatura(UUID.randomUUID(), "ubicacion", 10.0);
        SensorTemperatura b = new SensorTemperatura(UUID.randomUUID(), "ubicacion", 10.0);
        assertNotEquals(a, b);
    }

    @Test
    void toStringContieneClaseEId() {
        UUID id = UUID.randomUUID();
        SensorTemperatura obj = new SensorTemperatura(id, "ubicacion", 10.0);
        String s = obj.toString();
        assertTrue(s.contains("SensorTemperatura"));
        assertTrue(s.contains(id.toString()));
    }

    @Test
    void implementaInterfazYEjecutaMetodo() {
        Medible obj = new SensorTemperatura(null, "ubicacion", 10.0);
        assertDoesNotThrow(() -> obj.medir());
    }

    @Test
    void documentacionPresenteEnClase() throws Exception {
        Path p = Path.of("src/main/java/com/docencia/interfaces/ejercicio5/SensorTemperatura.java");
        String src = Files.readString(p);
        assertTrue(src.contains("/**"), "La clase debe tener Javadoc");
    }
}
