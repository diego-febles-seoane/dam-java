package com.docencia.herencia.ejercicio4;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class GatoTest {

    @Test
    void constructor_asigna_campos() {
        var obj = new Gato(UUID.randomUUID(), "valor", true);
        assertNotNull(obj.getId());
        assertEquals("valor", obj.getNombre());
        assertEquals(true, obj.getCazador());
    }

    @Test
    void constructor_genera_id_si_null() {
        var obj = new Gato(null, "valor", true);
        assertNotNull(obj.getId());
    }

    @Test
    void ids_son_unicos_en_instancias_distintas() {
        var a = new Gato(null, "valor", true);
        var b = new Gato(null, "valor", true);
        assertNotEquals(a.getId(), b.getId());
    }

    @Test
    void equals_mismo_id_misma_clase_es_true() {
        var id = UUID.randomUUID();
        var a = new Gato(id, "valor", true);
        var b = new Gato(id, "otro", false);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equals_otro_tipo_es_false() {
        var a = new Gato(null, "valor", true);
        Object b = new Object();
        assertNotEquals(a, b);
    }

    @Test
    void equals_distinto_id_es_false() {
        var a = new Gato(UUID.randomUUID(), "valor", true);
        var b = new Gato(UUID.randomUUID(), "valor", true);
        assertNotEquals(a, b);
    }

    @Test
    void toString_contiene_nombre_clase_y_campos() {
        var obj = new Gato(null, "valor", true);
        var s = obj.toString();
        assertTrue(s.contains("Gato"));
        assertTrue(s.contains("id="));
    }

    @Test
    void metodo_abstracto_implementado_devuelve_esperado() {
        var obj = new Gato(null, "valor", true);
        assertEquals("Miau", obj.sonido());
    }

    @Test
    void es_instancia_de_la_clase_base() {
        Animal b = new Gato(null, "valor", true);
        assertNotNull(b);
    }
}
