package com.docencia.herencia.ejercicio2;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class MotocicletaTest {

    @Test
    void constructor_asigna_campos() {
        var obj = new Motocicleta(UUID.randomUUID(), "valor", "valor", true);
        assertNotNull(obj.getId());
        assertEquals("valor", obj.getMarca());
        assertEquals("valor", obj.getModelo());
        assertEquals(true, obj.getTieneSidecar());
    }

    @Test
    void constructor_genera_id_si_null() {
        var obj = new Motocicleta(null, "valor", "valor", true);
        assertNotNull(obj.getId());
    }

    @Test
    void ids_son_unicos_en_instancias_distintas() {
        var a = new Motocicleta(null, "valor", "valor", true);
        var b = new Motocicleta(null, "valor", "valor", true);
        assertNotEquals(a.getId(), b.getId());
    }

    @Test
    void equals_mismo_id_misma_clase_es_true() {
        var id = UUID.randomUUID();
        var a = new Motocicleta(id, "valor", "valor", true);
        var b = new Motocicleta(id, "otro", "otro", false);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equals_otro_tipo_es_false() {
        var a = new Motocicleta(null, "valor", "valor", true);
        Object b = new Object();
        assertNotEquals(a, b);
    }

    @Test
    void equals_distinto_id_es_false() {
        var a = new Motocicleta(UUID.randomUUID(), "valor", "valor", true);
        var b = new Motocicleta(UUID.randomUUID(), "valor", "valor", true);
        assertNotEquals(a, b);
    }

    @Test
    void toString_contiene_nombre_clase_y_campos() {
        var obj = new Motocicleta(null, "valor", "valor", true);
        var s = obj.toString();
        assertTrue(s.contains("Motocicleta"));
        assertTrue(s.contains("id="));
    }

    @Test
    void metodo_abstracto_implementado_devuelve_esperado() {
        var obj = new Motocicleta(null, "valor", "valor", true);
        assertEquals(2, obj.ruedas());
    }

    @Test
    void es_instancia_de_la_clase_base() {
        Vehiculo b = new Motocicleta(null, "valor", "valor", true);
        assertNotNull(b);
    }
}
