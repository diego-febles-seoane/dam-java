package com.docencia.interfaces.ejercicio10;

import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;

import org.junit.jupiter.api.Test;

/** Tests de la clase CuadradoDrawable. */
public class CuadradoDrawableTest {

    @Test
    void constructorAsignaCampos() {
        UUID id = UUID.randomUUID();
        CuadradoDrawable obj = new CuadradoDrawable(id, 10.0, "color");
        assertEquals(id, obj.getId());
        assertEquals(10.0, obj.getLado());
        assertEquals("color", obj.getColor());
    }

    @Test
    void idSeAutogeneraSiEsNull() {
        CuadradoDrawable obj = new CuadradoDrawable(null, 10.0, "color");
        assertNotNull(obj.getId());
    }

    @Test
    void idsDiferentesParaInstanciasDistintas() {
        CuadradoDrawable a = new CuadradoDrawable(null, 10.0, "color");
        CuadradoDrawable b = new CuadradoDrawable(null, 10.0, "color");
        assertNotEquals(a.getId(), b.getId());
    }

    @Test
    void equalsMismoIdEsTrue() {
        UUID id = UUID.randomUUID();
        CuadradoDrawable a = new CuadradoDrawable(id, 10.0, "color");
        CuadradoDrawable b = new CuadradoDrawable(id, 10.0, "color");
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equalsIdDistintoEsFalse() {
        CuadradoDrawable a = new CuadradoDrawable(UUID.randomUUID(), 10.0, "color");
        CuadradoDrawable b = new CuadradoDrawable(UUID.randomUUID(), 10.0, "color");
        assertNotEquals(a, b);
    }

    @Test
    void toStringContieneClaseEId() {
        UUID id = UUID.randomUUID();
        CuadradoDrawable obj = new CuadradoDrawable(id, 10.0, "color");
        String s = obj.toString();
        assertTrue(s.contains("CuadradoDrawable"));
        assertTrue(s.contains(id.toString()));
    }

    @Test
    void implementaInterfazYEjecutaMetodo() {
        Drawable obj = new CuadradoDrawable(null, 10.0, "color");
        assertNotNull(obj.dibujar());
    }

    @Test
    void documentacionPresenteEnClase() throws Exception {
        Path p = Path.of("src/main/java/com/docencia/interfaces/ejercicio10/CuadradoDrawable.java");
        String src = Files.readString(p);
        assertTrue(src.contains("/**"), "La clase debe tener Javadoc");
    }
}
