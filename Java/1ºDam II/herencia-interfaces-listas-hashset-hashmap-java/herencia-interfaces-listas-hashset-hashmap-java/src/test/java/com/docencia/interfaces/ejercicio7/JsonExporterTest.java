package com.docencia.interfaces.ejercicio7;

import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;

import org.junit.jupiter.api.Test;

/** Tests de la clase JsonExporter. */
public class JsonExporterTest {

    @Test
    void constructorAsignaCampos() {
        UUID id = UUID.randomUUID();
        JsonExporter obj = new JsonExporter(id, true, 1);
        assertEquals(id, obj.getId());
        assertEquals(true, obj.getPretty());
        assertEquals(1, obj.getIndent());
    }

    @Test
    void idSeAutogeneraSiEsNull() {
        JsonExporter obj = new JsonExporter(null, true, 1);
        assertNotNull(obj.getId());
    }

    @Test
    void idsDiferentesParaInstanciasDistintas() {
        JsonExporter a = new JsonExporter(null, true, 1);
        JsonExporter b = new JsonExporter(null, true, 1);
        assertNotEquals(a.getId(), b.getId());
    }

    @Test
    void equalsMismoIdEsTrue() {
        UUID id = UUID.randomUUID();
        JsonExporter a = new JsonExporter(id, true, 1);
        JsonExporter b = new JsonExporter(id, true, 1);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equalsIdDistintoEsFalse() {
        JsonExporter a = new JsonExporter(UUID.randomUUID(), true, 1);
        JsonExporter b = new JsonExporter(UUID.randomUUID(), true, 1);
        assertNotEquals(a, b);
    }

    @Test
    void toStringContieneClaseEId() {
        UUID id = UUID.randomUUID();
        JsonExporter obj = new JsonExporter(id, true, 1);
        String s = obj.toString();
        assertTrue(s.contains("JsonExporter"));
        assertTrue(s.contains(id.toString()));
    }

    @Test
    void implementaInterfazYEjecutaMetodo() {
        Exportable obj = new JsonExporter(null, true, 1);
        assertNotNull(obj.exportar());
    }

    @Test
    void documentacionPresenteEnClase() throws Exception {
        Path p = Path.of("src/main/java/com/docencia/interfaces/ejercicio7/JsonExporter.java");
        String src = Files.readString(p);
        assertTrue(src.contains("/**"), "La clase debe tener Javadoc");
    }
}
