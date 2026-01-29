package com.docencia.interfaces.ejercicio9;

import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;

import org.junit.jupiter.api.Test;

/** Tests de la clase ClienteVip. */
public class ClienteVipTest {

    @Test
    void constructorAsignaCampos() {
        UUID id = UUID.randomUUID();
        ClienteVip obj = new ClienteVip(id, 10.0, "nivel");
        assertEquals(id, obj.getId());
        assertEquals(10.0, obj.getPorcentaje());
        assertEquals("nivel", obj.getNivel());
    }

    @Test
    void idSeAutogeneraSiEsNull() {
        ClienteVip obj = new ClienteVip(null, 10.0, "nivel");
        assertNotNull(obj.getId());
    }

    @Test
    void idsDiferentesParaInstanciasDistintas() {
        ClienteVip a = new ClienteVip(null, 10.0, "nivel");
        ClienteVip b = new ClienteVip(null, 10.0, "nivel");
        assertNotEquals(a.getId(), b.getId());
    }

    @Test
    void equalsMismoIdEsTrue() {
        UUID id = UUID.randomUUID();
        ClienteVip a = new ClienteVip(id, 10.0, "nivel");
        ClienteVip b = new ClienteVip(id, 10.0, "nivel");
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equalsIdDistintoEsFalse() {
        ClienteVip a = new ClienteVip(UUID.randomUUID(), 10.0, "nivel");
        ClienteVip b = new ClienteVip(UUID.randomUUID(), 10.0, "nivel");
        assertNotEquals(a, b);
    }

    @Test
    void toStringContieneClaseEId() {
        UUID id = UUID.randomUUID();
        ClienteVip obj = new ClienteVip(id, 10.0, "nivel");
        String s = obj.toString();
        assertTrue(s.contains("ClienteVip"));
        assertTrue(s.contains(id.toString()));
    }

    @Test
    void implementaInterfazYEjecutaMetodo() {
        Descontable obj = new ClienteVip(null, 10.0, "nivel");
        assertDoesNotThrow(() -> obj.aplicarDescuento(10.0));
    }

    @Test
    void documentacionPresenteEnClase() throws Exception {
        Path p = Path.of("src/main/java/com/docencia/interfaces/ejercicio9/ClienteVip.java");
        String src = Files.readString(p);
        assertTrue(src.contains("/**"), "La clase debe tener Javadoc");
    }
}
