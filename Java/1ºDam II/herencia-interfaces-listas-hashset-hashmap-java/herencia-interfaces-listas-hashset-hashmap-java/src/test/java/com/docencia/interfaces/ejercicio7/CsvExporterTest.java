package com.docencia.interfaces.ejercicio7;

import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;

import org.junit.jupiter.api.Test;

/** Tests de la clase CsvExporter. */
public class CsvExporterTest {

    @Test
    void constructorAsignaCampos() {
        UUID id = UUID.randomUUID();
        CsvExporter obj = new CsvExporter(id, "separador", 1);
        assertEquals(id, obj.getId());
        assertEquals("separador", obj.getSeparador());
        assertEquals(1, obj.getColumnas());
    }

    @Test
    void idSeAutogeneraSiEsNull() {
        CsvExporter obj = new CsvExporter(null, "separador", 1);
        assertNotNull(obj.getId());
    }

    @Test
    void idsDiferentesParaInstanciasDistintas() {
        CsvExporter a = new CsvExporter(null, "separador", 1);
        CsvExporter b = new CsvExporter(null, "separador", 1);
        assertNotEquals(a.getId(), b.getId());
    }

    @Test
    void equalsMismoIdEsTrue() {
        UUID id = UUID.randomUUID();
        CsvExporter a = new CsvExporter(id, "separador", 1);
        CsvExporter b = new CsvExporter(id, "separador", 1);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equalsIdDistintoEsFalse() {
        CsvExporter a = new CsvExporter(UUID.randomUUID(), "separador", 1);
        CsvExporter b = new CsvExporter(UUID.randomUUID(), "separador", 1);
        assertNotEquals(a, b);
    }

    @Test
    void toStringContieneClaseEId() {
        UUID id = UUID.randomUUID();
        CsvExporter obj = new CsvExporter(id, "separador", 1);
        String s = obj.toString();
        assertTrue(s.contains("CsvExporter"));
        assertTrue(s.contains(id.toString()));
    }

    @Test
    void implementaInterfazYEjecutaMetodo() {
        Exportable obj = new CsvExporter(null, "separador", 1);
        assertNotNull(obj.exportar());
    }

    @Test
    void documentacionPresenteEnClase() throws Exception {
        Path p = Path.of("src/main/java/com/docencia/interfaces/ejercicio7/CsvExporter.java");
        String src = Files.readString(p);
        assertTrue(src.contains("/**"), "La clase debe tener Javadoc");
    }
}
