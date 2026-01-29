package com.docencia.herencia.ejercicio3;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class EmpleadoTest {

    private Empleado crear(UUID id, String nombre, double salarioBase) {
        return new Empleado(id, nombre, salarioBase) {
            @Override
            public double calcularBonus() {
                return 1.0;
            }
        };
    }

    @Test
    void constructor_asigna_campos() {
        var obj = crear(UUID.randomUUID(), "valor", 100.0);
        assertNotNull(obj.getId());
        assertEquals("valor", obj.getNombre());
        assertEquals(100.0, obj.getSalarioBase());
    }

    @Test
    void constructor_genera_id_si_null() {
        var obj = crear(null, "valor", 100.0);
        assertNotNull(obj.getId());
    }

    @Test
    void ids_son_unicos_en_instancias_distintas() {
        var a = crear(null, "valor", 100.0);
        var b = crear(null, "valor", 100.0);
        assertNotEquals(a.getId(), b.getId());
    }

    @Test
    void equals_mismo_id_misma_clase_es_true() {
        var id = UUID.randomUUID();
        var a = crear(id, "valor", 100.0);
        var b = crear(id, "otro", 200.0);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equals_distinto_id_es_false() {
        var a = crear(UUID.randomUUID(), "valor", 100.0);
        var b = crear(UUID.randomUUID(), "valor", 100.0);
        assertNotEquals(a, b);
    }

    @Test
    void toString_contiene_nombre_clase_y_id() {
        var obj = crear(null, "valor", 100.0);
        var s = obj.toString();
        assertTrue(s.contains("Empleado"));
        assertTrue(s.contains("id="));
    }

    @Test
    void metodo_abstracto_funciona() {
        var obj = crear(null, "valor", 100.0);
        assertEquals(1.0, obj.calcularBonus());
    }
}
