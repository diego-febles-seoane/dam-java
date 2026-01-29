package com.docencia.interfaces.ejercicio8;

import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;

import org.junit.jupiter.api.Test;

/** Tests de la clase EmailNotifier. */
public class EmailNotifierTest {

    @Test
    void constructorAsignaCampos() {
        UUID id = UUID.randomUUID();
        EmailNotifier obj = new EmailNotifier(id, "origen@correo.com", "destino@correo.com");
        assertEquals(id, obj.getId());
        assertEquals("origen@correo.com", obj.getFrom());
        assertEquals("destino@correo.com", obj.getTo());
    }

    @Test
    void idSeAutogeneraSiEsNull() {
        EmailNotifier obj = new EmailNotifier(null, "origen@correo.com", "destino@correo.com");
        assertNotNull(obj.getId());
    }

    @Test
    void idsDiferentesParaInstanciasDistintas() {
        EmailNotifier a = new EmailNotifier(null, "origen@correo.com", "destino@correo.com");
        EmailNotifier b = new EmailNotifier(null, "origen@correo.com", "destino@correo.com");
        assertNotEquals(a.getId(), b.getId());
    }

    @Test
    void equalsMismoIdEsTrue() {
        UUID id = UUID.randomUUID();
        EmailNotifier a = new EmailNotifier(id, "origen@correo.com", "destino@correo.com");
        EmailNotifier b = new EmailNotifier(id, "origen@correo.com", "destino@correo.com");
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equalsIdDistintoEsFalse() {
        EmailNotifier a = new EmailNotifier(UUID.randomUUID(), "origen@correo.com", "destino@correo.com");
        EmailNotifier b = new EmailNotifier(UUID.randomUUID(), "origen@correo.com", "destino@correo.com");
        assertNotEquals(a, b);
    }

    @Test
    void toStringContieneClaseEId() {
        UUID id = UUID.randomUUID();
        EmailNotifier obj = new EmailNotifier(id, "origen@correo.com", "destino@correo.com");
        String s = obj.toString();
        assertTrue(s.contains("EmailNotifier"));
        assertTrue(s.contains(id.toString()));
    }

    @Test
    void implementaInterfazYEjecutaMetodo() {
        Notificable obj = new EmailNotifier(null, "origen@correo.com", "destino@correo.com");
        assertDoesNotThrow(() -> obj.notificar("mensaje"));
    }

    @Test
    void documentacionPresenteEnClase() throws Exception {
        Path p = Path.of("src/main/java/com/docencia/interfaces/ejercicio8/EmailNotifier.java");
        String src = Files.readString(p);
        assertTrue(src.contains("/**"), "La clase debe tener Javadoc");
    }
}
