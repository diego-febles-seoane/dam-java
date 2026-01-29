package com.docencia.interfaces.ejercicio8;

import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;

import org.junit.jupiter.api.Test;

/** Tests de la clase SmsNotifier. */
public class SmsNotifierTest {

    @Test
    void constructorAsignaCampos() {
        UUID id = UUID.randomUUID();
        SmsNotifier obj = new SmsNotifier(id, "numero", "proveedor");
        assertEquals(id, obj.getId());
        assertEquals("numero", obj.getNumero());
        assertEquals("proveedor", obj.getProveedor());
    }

    @Test
    void idSeAutogeneraSiEsNull() {
        SmsNotifier obj = new SmsNotifier(null, "numero", "proveedor");
        assertNotNull(obj.getId());
    }

    @Test
    void idsDiferentesParaInstanciasDistintas() {
        SmsNotifier a = new SmsNotifier(null, "numero", "proveedor");
        SmsNotifier b = new SmsNotifier(null, "numero", "proveedor");
        assertNotEquals(a.getId(), b.getId());
    }

    @Test
    void equalsMismoIdEsTrue() {
        UUID id = UUID.randomUUID();
        SmsNotifier a = new SmsNotifier(id, "numero", "proveedor");
        SmsNotifier b = new SmsNotifier(id, "numero", "proveedor");
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equalsIdDistintoEsFalse() {
        SmsNotifier a = new SmsNotifier(UUID.randomUUID(), "numero", "proveedor");
        SmsNotifier b = new SmsNotifier(UUID.randomUUID(), "numero", "proveedor");
        assertNotEquals(a, b);
    }

    @Test
    void toStringContieneClaseEId() {
        UUID id = UUID.randomUUID();
        SmsNotifier obj = new SmsNotifier(id, "numero", "proveedor");
        String s = obj.toString();
        assertTrue(s.contains("SmsNotifier"));
        assertTrue(s.contains(id.toString()));
    }

    @Test
    void implementaInterfazYEjecutaMetodo() {
        Notificable obj = new SmsNotifier(null, "numero", "proveedor");
        assertDoesNotThrow(() -> obj.notificar("mensaje"));
    }

    @Test
    void documentacionPresenteEnClase() throws Exception {
        Path p = Path.of("src/main/java/com/docencia/interfaces/ejercicio8/SmsNotifier.java");
        String src = Files.readString(p);
        assertTrue(src.contains("/**"), "La clase debe tener Javadoc");
    }
}
