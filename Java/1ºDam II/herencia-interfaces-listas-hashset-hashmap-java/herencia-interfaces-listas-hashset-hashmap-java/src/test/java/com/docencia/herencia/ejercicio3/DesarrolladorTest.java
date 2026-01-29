package com.docencia.herencia.ejercicio3;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class DesarrolladorTest {

    @Test
    void constructor_asigna_campos() {
        var obj = new Desarrollador(UUID.randomUUID(), "valor", 100.0, "valor");
        assertNotNull(obj.getId());
        assertEquals("valor", obj.getNombre());
        assertEquals(100.0, obj.getSalarioBase());
        assertEquals("valor", obj.getLenguajePrincipal());
    }

    @Test
    void constructor_genera_id_si_null() {
        var obj = new Desarrollador(null, "valor", 100.0, "valor");
        assertNotNull(obj.getId());
    }

    @Test
    void ids_son_unicos_en_instancias_distintas() {
        var a = new Desarrollador(null, "valor", 100.0, "valor");
        var b = new Desarrollador(null, "valor", 100.0, "valor");
        assertNotEquals(a.getId(), b.getId());
    }

    @Test
    void equals_mismo_id_misma_clase_es_true() {
        var id = UUID.randomUUID();
        var a = new Desarrollador(id, "valor", 100.0, "valor");
        var b = new Desarrollador(id, "otro", 200.0, "otro");
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equals_otro_tipo_es_false() {
        var a = new Desarrollador(null, "valor", 100.0, "valor");
        Object b = new Object();
        assertNotEquals(a, b);
    }

    @Test
    void equals_distinto_id_es_false() {
        var a = new Desarrollador(UUID.randomUUID(), "valor", 100.0, "valor");
        var b = new Desarrollador(UUID.randomUUID(), "valor", 100.0, "valor");
        assertNotEquals(a, b);
    }

    @Test
    void toString_contiene_nombre_clase_y_campos() {
        var obj = new Desarrollador(null, "valor", 100.0, "valor");
        var s = obj.toString();
        assertTrue(s.contains("Desarrollador"));
        assertTrue(s.contains("id="));
    }

    @Test
    void metodo_abstracto_implementado_devuelve_esperado() {
        var obj = new Desarrollador(null, "valor", 100.0, "valor");
        assertEquals(obj.getSalarioBase() * 0.10, obj.calcularBonus());
    }

    @Test
    void es_instancia_de_la_clase_base() {
        Empleado b = new Desarrollador(null, "valor", 100.0, "valor");
        assertNotNull(b);
    }
}
