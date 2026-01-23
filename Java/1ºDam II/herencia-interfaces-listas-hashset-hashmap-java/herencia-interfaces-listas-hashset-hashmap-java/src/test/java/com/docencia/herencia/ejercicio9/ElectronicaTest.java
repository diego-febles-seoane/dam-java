package com.docencia.herencia.ejercicio9;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class ElectronicaTest {

    @Test
    void constructor_asigna_campos() {
        var obj = new Electronica(UUID.randomUUID(), "valor", 100.0, 18);
        assertNotNull(obj.getId());
        assertEquals("valor", obj.getNombre());
        assertEquals(100.0, obj.getPrecio());
        assertEquals(18, obj.getGarantiaMeses());
    }

    @Test
    void constructor_genera_id_si_null() {
        var obj = new Electronica(null, "valor", 100.0, 18);
        assertNotNull(obj.getId());
    }

    @Test
    void ids_son_unicos_en_instancias_distintas() {
        var a = new Electronica(null, "valor", 100.0, 18);
        var b = new Electronica(null, "valor", 100.0, 18);
        assertNotEquals(a.getId(), b.getId());
    }

    @Test
    void equals_mismo_id_misma_clase_es_true() {
        var id = UUID.randomUUID();
        var a = new Electronica(id, "valor", 100.0, 18);
        var b = new Electronica(id, "otro", 200.0, 19);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equals_otro_tipo_es_false() {
        var a = new Electronica(null, "valor", 100.0, 18);
        Object b = new Object();
        assertNotEquals(a, b);
    }

    @Test
    void equals_distinto_id_es_false() {
        var a = new Electronica(UUID.randomUUID(), "valor", 100.0, 18);
        var b = new Electronica(UUID.randomUUID(), "valor", 100.0, 18);
        assertNotEquals(a, b);
    }

    @Test
    void toString_contiene_nombre_clase_y_campos() {
        var obj = new Electronica(null, "valor", 100.0, 18);
        var s = obj.toString();
        assertTrue(s.contains("Electronica"));
        assertTrue(s.contains("id="));
    }

    @Test
    void metodo_abstracto_implementado_devuelve_esperado() {
        var obj = new Electronica(null, "valor", 100.0, 18);
        assertEquals("Electronica", obj.categoria());
    }

    @Test
    void es_instancia_de_la_clase_base() {
        Producto b = new Electronica(null, "valor", 100.0, 18);
        assertNotNull(b);
    }
}
