package com.docencia.herencia.ejercicio2;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class CocheTest {

    @Test
    void constructor_asigna_campos() {
        var obj = new Coche(UUID.randomUUID(), "valor", "valor", 18);
        assertNotNull(obj.getId());
        assertEquals("valor", obj.getMarca());
        assertEquals("valor", obj.getModelo());
        assertEquals(18, obj.getPuertas());
    }

    @Test
    void constructor_genera_id_si_null() {
        var obj = new Coche(null, "valor", "valor", 18);
        assertNotNull(obj.getId());
    }

    @Test
    void ids_son_unicos_en_instancias_distintas() {
        var a = new Coche(null, "valor", "valor", 18);
        var b = new Coche(null, "valor", "valor", 18);
        assertNotEquals(a.getId(), b.getId());
    }

    @Test
    void equals_mismo_id_misma_clase_es_true() {
        var id = UUID.randomUUID();
        var a = new Coche(id, "valor", "valor", 18);
        var b = new Coche(id, "otro", "otro", 19);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equals_otro_tipo_es_false() {
        var a = new Coche(null, "valor", "valor", 18);
        Object b = new Object();
        assertNotEquals(a, b);
    }

    @Test
    void equals_distinto_id_es_false() {
        var a = new Coche(UUID.randomUUID(), "valor", "valor", 18);
        var b = new Coche(UUID.randomUUID(), "valor", "valor", 18);
        assertNotEquals(a, b);
    }

    @Test
    void toString_contiene_nombre_clase_y_campos() {
        var obj = new Coche(null, "valor", "valor", 18);
        var s = obj.toString();
        assertTrue(s.contains("Coche"));
        assertTrue(s.contains("id="));
    }

    @Test
    void metodo_abstracto_implementado_devuelve_esperado() {
        var obj = new Coche(null, "valor", "valor", 18);
        assertEquals(4, obj.ruedas());
    }

    @Test
    void es_instancia_de_la_clase_base() {
        Vehiculo b = new Coche(null, "valor", "valor", 18);
        assertNotNull(b);
    }
}
