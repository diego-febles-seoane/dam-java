package com.docencia.interfaces.ejercicio6;

import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;

import org.junit.jupiter.api.Test;

/** Tests de la clase Admin. */
public class AdminTest {

    @Test
    void constructorAsignaCampos() {
        UUID id = UUID.randomUUID();
        Admin obj = new Admin(id, "nombre", "hash");
        assertEquals(id, obj.getId());
        assertEquals("nombre", obj.getNombre());
        assertEquals("hash", obj.getHash());
    }

    @Test
    void idSeAutogeneraSiEsNull() {
        Admin obj = new Admin(null, "nombre", "hash");
        assertNotNull(obj.getId());
    }

    @Test
    void idsDiferentesParaInstanciasDistintas() {
        Admin a = new Admin(null, "nombre", "hash");
        Admin b = new Admin(null, "nombre", "hash");
        assertNotEquals(a.getId(), b.getId());
    }

    @Test
    void equalsMismoIdEsTrue() {
        UUID id = UUID.randomUUID();
        Admin a = new Admin(id, "nombre", "hash");
        Admin b = new Admin(id, "nombre", "hash");
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equalsIdDistintoEsFalse() {
        Admin a = new Admin(UUID.randomUUID(), "nombre", "hash");
        Admin b = new Admin(UUID.randomUUID(), "nombre", "hash");
        assertNotEquals(a, b);
    }

    @Test
    void toStringContieneClaseEId() {
        UUID id = UUID.randomUUID();
        Admin obj = new Admin(id, "nombre", "hash");
        String s = obj.toString();
        assertTrue(s.contains("Admin"));
        assertTrue(s.contains(id.toString()));
    }

    @Test
    void implementaInterfazYEjecutaMetodo() {
        Autenticable obj = new Admin(null, "nombre", "hash");
        assertDoesNotThrow(() -> obj.autenticar("clave"));
    }

    @Test
    void documentacionPresenteEnClase() throws Exception {
        Path p = Path.of("src/main/java/com/docencia/interfaces/ejercicio6/Admin.java");
        String src = Files.readString(p);
        assertTrue(src.contains("/**"), "La clase debe tener Javadoc");
    }
}
