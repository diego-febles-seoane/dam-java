package com.docencia.interfaces.ejercicio9;

import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;

import org.junit.jupiter.api.Test;

/** Tests de la clase Cupon. */
public class CuponTest {

    @Test
    void constructorAsignaCampos() {
        UUID id = UUID.randomUUID();
        Cupon obj = new Cupon(id, 10.0, "codigo");
        assertEquals(id, obj.getId());
        assertEquals(10.0, obj.getImporte());
        assertEquals("codigo", obj.getCodigo());
    }

    @Test
    void idSeAutogeneraSiEsNull() {
        Cupon obj = new Cupon(null, 10.0, "codigo");
        assertNotNull(obj.getId());
    }

    @Test
    void idsDiferentesParaInstanciasDistintas() {
        Cupon a = new Cupon(null, 10.0, "codigo");
        Cupon b = new Cupon(null, 10.0, "codigo");
        assertNotEquals(a.getId(), b.getId());
    }

    @Test
    void equalsMismoIdEsTrue() {
        UUID id = UUID.randomUUID();
        Cupon a = new Cupon(id, 10.0, "codigo");
        Cupon b = new Cupon(id, 10.0, "codigo");
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equalsIdDistintoEsFalse() {
        Cupon a = new Cupon(UUID.randomUUID(), 10.0, "codigo");
        Cupon b = new Cupon(UUID.randomUUID(), 10.0, "codigo");
        assertNotEquals(a, b);
    }

    @Test
    void toStringContieneClaseEId() {
        UUID id = UUID.randomUUID();
        Cupon obj = new Cupon(id, 10.0, "codigo");
        String s = obj.toString();
        assertTrue(s.contains("Cupon"));
        assertTrue(s.contains(id.toString()));
    }

    @Test
    void implementaInterfazYEjecutaMetodo() {
        Descontable obj = new Cupon(null, 10.0, "codigo");
        assertDoesNotThrow(() -> obj.aplicarDescuento(10.0));
    }

    @Test
    void documentacionPresenteEnClase() throws Exception {
        Path p = Path.of("src/main/java/com/docencia/interfaces/ejercicio9/Cupon.java");
        String src = Files.readString(p);
        assertTrue(src.contains("/**"), "La clase debe tener Javadoc");
    }
}
