package com.docencia.interfaces.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;

import org.junit.jupiter.api.Test;

/** Tests de la clase Factura. */
public class FacturaTest {

    @Test
    void constructorAsignaCampos() {
        UUID id = UUID.randomUUID();
        Factura obj = new Factura(id, 10.0, 10.0);
        assertEquals(id, obj.getId());
        assertEquals(10.0, obj.getBase());
        assertEquals(10.0, obj.getIva());
    }

    @Test
    void idSeAutogeneraSiEsNull() {
        Factura obj = new Factura(null, 10.0, 10.0);
        assertNotNull(obj.getId());
    }

    @Test
    void idsDiferentesParaInstanciasDistintas() {
        Factura a = new Factura(null, 10.0, 10.0);
        Factura b = new Factura(null, 10.0, 10.0);
        assertNotEquals(a.getId(), b.getId());
    }

    @Test
    void equalsMismoIdEsTrue() {
        UUID id = UUID.randomUUID();
        Factura a = new Factura(id, 10.0, 10.0);
        Factura b = new Factura(id, 10.0, 10.0);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equalsIdDistintoEsFalse() {
        Factura a = new Factura(UUID.randomUUID(), 10.0, 10.0);
        Factura b = new Factura(UUID.randomUUID(), 10.0, 10.0);
        assertNotEquals(a, b);
    }

    @Test
    void toStringContieneClaseEId() {
        UUID id = UUID.randomUUID();
        Factura obj = new Factura(id, 10.0, 10.0);
        String s = obj.toString();
        assertTrue(s.contains("Factura"));
        assertTrue(s.contains(id.toString()));
    }

    @Test
    void implementaInterfazYEjecutaMetodo() {
        Pagable obj = new Factura(null, 10.0, 10.0);
        assertDoesNotThrow(() -> obj.total());
    }

    @Test
    void documentacionPresenteEnClase() throws Exception {
        Path p = Path.of("src/main/java/com/docencia/interfaces/ejercicio1/Factura.java");
        String src = Files.readString(p);
        assertTrue(src.contains("/**"), "La clase debe tener Javadoc");
    }
}
