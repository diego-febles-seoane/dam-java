package com.docencia.herencia.ejercicio8;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class PagoTarjetaTest {

    @Test
    void constructor_asigna_campos() {
        var obj = new PagoTarjeta(UUID.randomUUID(), 100.0, "valor");
        assertNotNull(obj.getId());
        assertEquals(100.0, obj.getImporte());
        assertEquals("valor", obj.getUltimos4());
    }

    @Test
    void constructor_genera_id_si_null() {
        var obj = new PagoTarjeta(null, 100.0, "valor");
        assertNotNull(obj.getId());
    }

    @Test
    void ids_son_unicos_en_instancias_distintas() {
        var a = new PagoTarjeta(null, 100.0, "valor");
        var b = new PagoTarjeta(null, 100.0, "valor");
        assertNotEquals(a.getId(), b.getId());
    }

    @Test
    void equals_mismo_id_misma_clase_es_true() {
        var id = UUID.randomUUID();
        var a = new PagoTarjeta(id, 100.0, "valor");
        var b = new PagoTarjeta(id, 200.0, "otro");
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equals_otro_tipo_es_false() {
        var a = new PagoTarjeta(null, 100.0, "valor");
        Object b = new Object();
        assertNotEquals(a, b);
    }

    @Test
    void equals_distinto_id_es_false() {
        var a = new PagoTarjeta(UUID.randomUUID(), 100.0, "valor");
        var b = new PagoTarjeta(UUID.randomUUID(), 100.0, "valor");
        assertNotEquals(a, b);
    }

    @Test
    void toString_contiene_nombre_clase_y_campos() {
        var obj = new PagoTarjeta(null, 100.0, "valor");
        var s = obj.toString();
        assertTrue(s.contains("PagoTarjeta"));
        assertTrue(s.contains("id="));
    }

    @Test
    void metodo_abstracto_implementado_devuelve_esperado() {
        var obj = new PagoTarjeta(null, 100.0, "valor");
        assertEquals(true, obj.requiereValidacion());
    }

    @Test
    void es_instancia_de_la_clase_base() {
        Pago b = new PagoTarjeta(null, 100.0, "valor");
        assertNotNull(b);
    }
}
