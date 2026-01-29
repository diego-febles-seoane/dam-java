package com.docencia.herencia.ejercicio8;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class PagoEfectivoTest {

    @Test
    void constructor_asigna_campos() {
        var id = UUID.randomUUID();
        var obj = new PagoEfectivo(id, 100.0, true);

        assertEquals(id, obj.getId());
        assertEquals(100.0, obj.getImporte());
        assertTrue(obj.getEntregado());
    }

    @Test
    void constructor_genera_id_si_null() {
        var obj = new PagoEfectivo(null, 100.0, true);
        assertNotNull(obj.getId());
    }

    @Test
    void ids_son_unicos_en_instancias_distintas() {
        var a = new PagoEfectivo(null, 100.0, true);
        var b = new PagoEfectivo(null, 100.0, true);
        assertNotEquals(a.getId(), b.getId());
    }

    @Test
    void equals_mismo_id_misma_clase_es_true() {
        var id = UUID.randomUUID();
        var a = new PagoEfectivo(id, 100.0, true);
        var b = new PagoEfectivo(id, 200.0, false); // da igual: equals por id (y clase)

        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equals_otro_tipo_es_false() {
        var a = new PagoEfectivo(null, 100.0, true);
        Object b = new Object();
        assertNotEquals(a, b);
    }

    @Test
    void equals_distinto_id_es_false() {
        var a = new PagoEfectivo(UUID.randomUUID(), 100.0, true);
        var b = new PagoEfectivo(UUID.randomUUID(), 100.0, true);
        assertNotEquals(a, b);
    }

    @Test
    void toString_contiene_nombre_clase_y_campos() {
        var obj = new PagoEfectivo(null, 100.0, true);
        var s = obj.toString();

        assertTrue(s.contains("PagoEfectivo"));
        assertTrue(s.contains("id="));
        assertTrue(s.contains("importe="));
        assertTrue(s.contains("entregado="));
    }

    @Test
    void metodo_abstracto_implementado_devuelve_esperado() {
        var obj = new PagoEfectivo(null, 100.0, true);
        assertFalse(obj.requiereValidacion());
    }

    @Test
    void es_instancia_de_la_clase_base() {
        Pago b = new PagoEfectivo(null, 100.0, true);
        assertNotNull(b);
        assertTrue(b instanceof Pago);
    }
}
