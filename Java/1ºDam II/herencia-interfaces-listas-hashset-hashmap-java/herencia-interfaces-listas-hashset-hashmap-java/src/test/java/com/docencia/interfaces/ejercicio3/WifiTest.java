package com.docencia.interfaces.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;

import org.junit.jupiter.api.Test;

/** Tests de la clase Wifi. */
public class WifiTest {

    @Test
    void constructorAsignaCampos() {
        UUID id = UUID.randomUUID();
        Wifi obj = new Wifi(id, "ssid", "password");
        assertEquals(id, obj.getId());
        assertEquals("ssid", obj.getSsid());
        assertEquals("password", obj.getPassword());
    }

    @Test
    void idSeAutogeneraSiEsNull() {
        Wifi obj = new Wifi(null, "ssid", "password");
        assertNotNull(obj.getId());
    }

    @Test
    void idsDiferentesParaInstanciasDistintas() {
        Wifi a = new Wifi(null, "ssid", "password");
        Wifi b = new Wifi(null, "ssid", "password");
        assertNotEquals(a.getId(), b.getId());
    }

    @Test
    void equalsMismoIdEsTrue() {
        UUID id = UUID.randomUUID();
        Wifi a = new Wifi(id, "ssid", "password");
        Wifi b = new Wifi(id, "ssid", "password");
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equalsIdDistintoEsFalse() {
        Wifi a = new Wifi(UUID.randomUUID(), "ssid", "password");
        Wifi b = new Wifi(UUID.randomUUID(), "ssid", "password");
        assertNotEquals(a, b);
    }

    @Test
    void toStringContieneClaseEId() {
        UUID id = UUID.randomUUID();
        Wifi obj = new Wifi(id, "ssid", "password");
        String s = obj.toString();
        assertTrue(s.contains("Wifi"));
        assertTrue(s.contains(id.toString()));
    }

    @Test
    void implementaInterfazYEjecutaMetodo() {
        Conectable obj = new Wifi(null, "ssid", "password");
        assertDoesNotThrow(() -> obj.conectar("destino"));
    }

    @Test
    void documentacionPresenteEnClase() throws Exception {
        Path p = Path.of("src/main/java/com/docencia/interfaces/ejercicio3/Wifi.java");
        String src = Files.readString(p);
        assertTrue(src.contains("/**"), "La clase debe tener Javadoc");
    }
}
