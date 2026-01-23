package com.docencia.herencia.ejercicio6;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class CuentaAhorroTest {

    @Test
    void constructor_asigna_campos() {
        var obj = new CuentaAhorro(UUID.randomUUID(), "valor", 100.0, 100.0);
        assertNotNull(obj.getId());
        assertEquals("valor", obj.getTitular());
        assertEquals(100.0, obj.getSaldo());
        assertEquals(100.0, obj.getInteresAnual());
    }

    @Test
    void constructor_genera_id_si_null() {
        var obj = new CuentaAhorro(null, "valor", 100.0, 100.0);
        assertNotNull(obj.getId());
    }

    @Test
    void ids_son_unicos_en_instancias_distintas() {
        var a = new CuentaAhorro(null, "valor", 100.0, 100.0);
        var b = new CuentaAhorro(null, "valor", 100.0, 100.0);
        assertNotEquals(a.getId(), b.getId());
    }

    @Test
    void equals_mismo_id_misma_clase_es_true() {
        var id = UUID.randomUUID();
        var a = new CuentaAhorro(id, "valor", 100.0, 100.0);
        var b = new CuentaAhorro(id, "otro", 200.0, 200.0);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equals_otro_tipo_es_false() {
        var a = new CuentaAhorro(null, "valor", 100.0, 100.0);
        Object b = new Object();
        assertNotEquals(a, b);
    }

    @Test
    void equals_distinto_id_es_false() {
        var a = new CuentaAhorro(UUID.randomUUID(), "valor", 100.0, 100.0);
        var b = new CuentaAhorro(UUID.randomUUID(), "valor", 100.0, 100.0);
        assertNotEquals(a, b);
    }

    @Test
    void toString_contiene_nombre_clase_y_campos() {
        var obj = new CuentaAhorro(null, "valor", 100.0, 100.0);
        var s = obj.toString();
        assertTrue(s.contains("CuentaAhorro"));
        assertTrue(s.contains("id="));
    }

    @Test
    void metodo_abstracto_implementado_devuelve_esperado() {
        var obj = new CuentaAhorro(null, "valor", 100.0, 100.0);
        assertEquals(0.0, obj.comisionMensual());
    }

    @Test
    void es_instancia_de_la_clase_base() {
        CuentaBancaria b = new CuentaAhorro(null, "valor", 100.0, 100.0);
        assertNotNull(b);
    }
}
