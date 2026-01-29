package com.docencia.herencia.ejercicio8;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class PagoTest {

    private Pago crear(UUID id, double importe) {
        return new Pago(id, importe) {
            @Override
            public boolean requiereValidacion() {
                return true;
            }
        };
    }

    @Test
    void constructor_asigna_campos() {
        var obj = crear(UUID.randomUUID(), 100.0);
        assertNotNull(obj.getId());
        assertEquals(100.0, obj.getImporte());
    }

    @Test
    void constructor_genera_id_si_null() {
        var obj = crear(null, 100.0);
        assertNotNull(obj.getId());
    }

    @Test
    void ids_son_unicos_en_instancias_distintas() {
        var a = crear(null, 100.0);
        var b = crear(null, 100.0);
        assertNotEquals(a.getId(), b.getId());
    }

    @Test
    void equals_mismo_id_misma_clase_es_true() {
        var id = UUID.randomUUID();
        var a = crear(id, 100.0);
        var b = crear(id, 200.0);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equals_distinto_id_es_false() {
        var a = crear(UUID.randomUUID(), 100.0);
        var b = crear(UUID.randomUUID(), 100.0);
        assertNotEquals(a, b);
    }

    @Test
    void toString_contiene_nombre_clase_y_id() {
        var obj = crear(null, 100.0);
        var s = obj.toString();
        assertTrue(s.contains("Pago"));
        assertTrue(s.contains("id="));
    }

    @Test
    void metodo_abstracto_funciona() {
        var obj = crear(null, 100.0);
        assertEquals(true, obj.requiereValidacion());
    }
}
