package com.docencia.interfaces.ejercicio6;

import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;

import org.junit.jupiter.api.Test;

/** Tests de la clase Usuario. */
public class UsuarioTest {

    @Test
    void constructorAsignaCampos() {
        UUID id = UUID.randomUUID();
        Usuario obj = new Usuario(id, "nombre", "hash");
        assertEquals(id, obj.getId());
        assertEquals("nombre", obj.getNombre());
        assertEquals("hash", obj.getHash());
    }

    @Test
    void idSeAutogeneraSiEsNull() {
        Usuario obj = new Usuario(null, "nombre", "hash");
        assertNotNull(obj.getId());
    }

    @Test
    void idsDiferentesParaInstanciasDistintas() {
        Usuario a = new Usuario(null, "nombre", "hash");
        Usuario b = new Usuario(null, "nombre", "hash");
        assertNotEquals(a.getId(), b.getId());
    }

    @Test
    void equalsMismoIdEsTrue() {
        UUID id = UUID.randomUUID();
        Usuario a = new Usuario(id, "nombre", "hash");
        Usuario b = new Usuario(id, "nombre", "hash");
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equalsIdDistintoEsFalse() {
        Usuario a = new Usuario(UUID.randomUUID(), "nombre", "hash");
        Usuario b = new Usuario(UUID.randomUUID(), "nombre", "hash");
        assertNotEquals(a, b);
    }

    @Test
    void toStringContieneClaseEId() {
        UUID id = UUID.randomUUID();
        Usuario obj = new Usuario(id, "nombre", "hash");
        String s = obj.toString();
        assertTrue(s.contains("Usuario"));
        assertTrue(s.contains(id.toString()));
    }

    @Test
    void implementaInterfazYEjecutaMetodo() {
        Autenticable obj = new Usuario(null, "nombre", "hash");
        assertDoesNotThrow(() -> obj.autenticar("clave"));
    }

    @Test
    void documentacionPresenteEnClase() throws Exception {
        Path p = Path.of("src/main/java/com/docencia/interfaces/ejercicio6/Usuario.java");
        String src = Files.readString(p);
        assertTrue(src.contains("/**"), "La clase debe tener Javadoc");
    }
}
