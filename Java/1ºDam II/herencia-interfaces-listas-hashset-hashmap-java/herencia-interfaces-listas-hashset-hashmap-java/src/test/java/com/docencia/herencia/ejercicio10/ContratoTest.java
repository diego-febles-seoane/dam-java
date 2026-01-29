package com.docencia.herencia.ejercicio10;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class ContratoTest {

    @Test
    void constructor_asigna_campos() {
        var obj = new Contrato(UUID.randomUUID(), "valor", "valor");
        assertNotNull(obj.getId());
        assertEquals("valor", obj.getTitulo());
        assertEquals("valor", obj.getPartes());
    }

    @Test
    void constructor_genera_id_si_null() {
        var obj = new Contrato(null, "valor", "valor");
        assertNotNull(obj.getId());
    }

    @Test
    void ids_son_unicos_en_instancias_distintas() {
        var a = new Contrato(null, "valor", "valor");
        var b = new Contrato(null, "valor", "valor");
        assertNotEquals(a.getId(), b.getId());
    }

    @Test
    void equals_mismo_id_misma_clase_es_true() {
        var id = UUID.randomUUID();
        var a = new Contrato(id, "valor", "valor");
        var b = new Contrato(id, "otro", "otro");
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equals_otro_tipo_es_false() {
        var a = new Contrato(null, "valor", "valor");
        Object b = new Object();
        assertNotEquals(a, b);
    }

    @Test
    void equals_distinto_id_es_false() {
        var a = new Contrato(UUID.randomUUID(), "valor", "valor");
        var b = new Contrato(UUID.randomUUID(), "valor", "valor");
        assertNotEquals(a, b);
    }

    @Test
    void toString_contiene_nombre_clase_y_campos() {
        var obj = new Contrato(null, "valor", "valor");
        var s = obj.toString();
        assertTrue(s.contains("Contrato"));
        assertTrue(s.contains("id="));
    }

    @Test
    void metodo_abstracto_implementado_devuelve_esperado() {
        var obj = new Contrato(null, "valor", "valor");
        assertEquals("Contrato", obj.tipo());
    }

    @Test
    void es_instancia_de_la_clase_base() {
        Documento b = new Contrato(null, "valor", "valor");
        assertNotNull(b);
    }
}
