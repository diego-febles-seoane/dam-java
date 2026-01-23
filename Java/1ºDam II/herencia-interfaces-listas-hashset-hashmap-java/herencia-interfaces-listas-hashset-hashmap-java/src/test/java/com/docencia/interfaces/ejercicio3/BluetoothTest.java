package com.docencia.interfaces.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;

import org.junit.jupiter.api.Test;

/** Tests de la clase Bluetooth. */
public class BluetoothTest {

    @Test
    void constructorAsignaCampos() {
        UUID id = UUID.randomUUID();
        Bluetooth obj = new Bluetooth(id, "AA:BB:CC", 1);
        assertEquals(id, obj.getId());
        assertEquals("AA:BB:CC", obj.getMac());
        assertEquals(1, obj.getCanal());
    }

    @Test
    void idSeAutogeneraSiEsNull() {
        Bluetooth obj = new Bluetooth(null, "AA:BB:CC", 1);
        assertNotNull(obj.getId());
    }

    @Test
    void idsDiferentesParaInstanciasDistintas() {
        Bluetooth a = new Bluetooth(null, "AA:BB:CC", 1);
        Bluetooth b = new Bluetooth(null, "AA:BB:CC", 1);
        assertNotEquals(a.getId(), b.getId());
    }

    @Test
    void equalsMismoIdEsTrue() {
        UUID id = UUID.randomUUID();
        Bluetooth a = new Bluetooth(id, "AA:BB:CC", 1);
        Bluetooth b = new Bluetooth(id, "AA:BB:CC", 1);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equalsIdDistintoEsFalse() {
        Bluetooth a = new Bluetooth(UUID.randomUUID(), "AA:BB:CC", 1);
        Bluetooth b = new Bluetooth(UUID.randomUUID(), "AA:BB:CC", 1);
        assertNotEquals(a, b);
    }

    @Test
    void toStringContieneClaseEId() {
        UUID id = UUID.randomUUID();
        Bluetooth obj = new Bluetooth(id, "AA:BB:CC", 1);
        String s = obj.toString();
        assertTrue(s.contains("Bluetooth"));
        assertTrue(s.contains(id.toString()));
    }

    @Test
    void implementaInterfazYEjecutaMetodo() {
        Conectable obj = new Bluetooth(null, "AA:BB:CC", 1);
        assertDoesNotThrow(() -> obj.conectar("destino"));
    }

    @Test
    void documentacionPresenteEnClase() throws Exception {
        Path p = Path.of("src/main/java/com/docencia/interfaces/ejercicio3/Bluetooth.java");
        String src = Files.readString(p);
        assertTrue(src.contains("/**"), "La clase debe tener Javadoc");
    }
}
