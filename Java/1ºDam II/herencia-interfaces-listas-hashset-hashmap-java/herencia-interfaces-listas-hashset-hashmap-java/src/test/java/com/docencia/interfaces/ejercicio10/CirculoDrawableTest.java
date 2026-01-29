package com.docencia.interfaces.ejercicio10;

import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;

import org.junit.jupiter.api.Test;

/** Tests de la clase CirculoDrawable. */
public class CirculoDrawableTest {

    @Test
    void constructorAsignaCampos() {
        UUID id = UUID.randomUUID();
        CirculoDrawable obj = new CirculoDrawable(id, 10.0, "color");
        assertEquals(id, obj.getId());
        assertEquals(10.0, obj.getRadio());
        assertEquals("color", obj.getColor());
    }

    @Test
    void idSeAutogeneraSiEsNull() {
        CirculoDrawable obj = new CirculoDrawable(null, 10.0, "color");
        assertNotNull(obj.getId());
    }

    @Test
    void idsDiferentesParaInstanciasDistintas() {
        CirculoDrawable a = new CirculoDrawable(null, 10.0, "color");
        CirculoDrawable b = new CirculoDrawable(null, 10.0, "color");
        assertNotEquals(a.getId(), b.getId());
    }

    @Test
    void equalsMismoIdEsTrue() {
        UUID id = UUID.randomUUID();
        CirculoDrawable a = new CirculoDrawable(id, 10.0, "color");
        CirculoDrawable b = new CirculoDrawable(id, 10.0, "color");
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equalsIdDistintoEsFalse() {
        CirculoDrawable a = new CirculoDrawable(UUID.randomUUID(), 10.0, "color");
        CirculoDrawable b = new CirculoDrawable(UUID.randomUUID(), 10.0, "color");
        assertNotEquals(a, b);
    }

    @Test
    void toStringContieneClaseEId() {
        UUID id = UUID.randomUUID();
        CirculoDrawable obj = new CirculoDrawable(id, 10.0, "color");
        String s = obj.toString();
        assertTrue(s.contains("CirculoDrawable"));
        assertTrue(s.contains(id.toString()));
    }

    @Test
    void implementaInterfazYEjecutaMetodo() {
        Drawable obj = new CirculoDrawable(null, 10.0, "color");
        assertNotNull(obj.dibujar());
    }

    @Test
    void documentacionPresenteEnClase() throws Exception {
        Path p = Path.of("src/main/java/com/docencia/interfaces/ejercicio10/CirculoDrawable.java");
        String src = Files.readString(p);
        assertTrue(src.contains("/**"), "La clase debe tener Javadoc");
    }
}
