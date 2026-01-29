package com.docencia.herencia.ejercicio4;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class PerroTest {

    @Test
    void constructor_asigna_campos() {
        var obj = new Perro(UUID.randomUUID(), "valor", "valor");
        assertNotNull(obj.getId());
        assertEquals("valor", obj.getNombre());
        assertEquals("valor", obj.getRaza());
    }

    @Test
    void constructor_genera_id_si_null() {
        var obj = new Perro(null, "valor", "valor");
        assertNotNull(obj.getId());
    }

    @Test
    void ids_son_unicos_en_instancias_distintas() {
        var a = new Perro(null, "valor", "valor");
        var b = new Perro(null, "valor", "valor");
        assertNotEquals(a.getId(), b.getId());
    }

    @Test
    void equals_mismo_id_misma_clase_es_true() {
        var id = UUID.randomUUID();
        var a = new Perro(id, "valor", "valor");
        var b = new Perro(id, "otro", "otro");
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equals_otro_tipo_es_false() {
        var a = new Perro(null, "valor", "valor");
        Object b = new Object();
        assertNotEquals(a, b);
    }

    @Test
    void equals_distinto_id_es_false() {
        var a = new Perro(UUID.randomUUID(), "valor", "valor");
        var b = new Perro(UUID.randomUUID(), "valor", "valor");
        assertNotEquals(a, b);
    }

    @Test
    void toString_contiene_nombre_clase_y_campos() {
        var obj = new Perro(null, "valor", "valor");
        var s = obj.toString();
        assertTrue(s.contains("Perro"));
        assertTrue(s.contains("id="));
    }

    @Test
    void metodo_abstracto_implementado_devuelve_esperado() {
        var obj = new Perro(null, "valor", "valor");
        assertEquals("Guau", obj.sonido());
    }

    @Test
    void es_instancia_de_la_clase_base() {
        Animal b = new Perro(null, "valor", "valor");
        assertNotNull(b);
    }
}
