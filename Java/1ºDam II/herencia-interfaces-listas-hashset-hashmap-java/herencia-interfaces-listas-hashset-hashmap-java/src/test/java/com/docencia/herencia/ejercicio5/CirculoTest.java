package com.docencia.herencia.ejercicio5;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class CirculoTest {

    @Test
    void constructor_asigna_campos() {
        var obj = new Circulo(UUID.randomUUID(), "valor", 100.0);
        assertNotNull(obj.getId());
        assertEquals("valor", obj.getColor());
        assertEquals(100.0, obj.getRadio());
    }

    @Test
    void constructor_genera_id_si_null() {
        var obj = new Circulo(null, "valor", 100.0);
        assertNotNull(obj.getId());
    }

    @Test
    void ids_son_unicos_en_instancias_distintas() {
        var a = new Circulo(null, "valor", 100.0);
        var b = new Circulo(null, "valor", 100.0);
        assertNotEquals(a.getId(), b.getId());
    }

    @Test
    void equals_mismo_id_misma_clase_es_true() {
        var id = UUID.randomUUID();
        var a = new Circulo(id, "valor", 100.0);
        var b = new Circulo(id, "otro", 200.0);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equals_otro_tipo_es_false() {
        var a = new Circulo(null, "valor", 100.0);
        Object b = new Object();
        assertNotEquals(a, b);
    }

    @Test
    void equals_distinto_id_es_false() {
        var a = new Circulo(UUID.randomUUID(), "valor", 100.0);
        var b = new Circulo(UUID.randomUUID(), "valor", 100.0);
        assertNotEquals(a, b);
    }

    @Test
    void toString_contiene_nombre_clase_y_campos() {
        var obj = new Circulo(null, "valor", 100.0);
        var s = obj.toString();
        assertTrue(s.contains("Circulo"));
        assertTrue(s.contains("id="));
    }

    @Test
    void metodo_abstracto_implementado_devuelve_esperado() {
        var obj = new Circulo(null, "valor", 100.0);
        assertEquals(Math.PI * obj.getRadio() * obj.getRadio(), obj.area());
    }

    @Test
    void es_instancia_de_la_clase_base() {
        Figura b = new Circulo(null, "valor", 100.0);
        assertNotNull(b);
    }
}
