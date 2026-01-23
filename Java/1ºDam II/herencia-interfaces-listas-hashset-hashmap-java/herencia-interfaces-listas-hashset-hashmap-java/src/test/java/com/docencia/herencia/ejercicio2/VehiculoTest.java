package com.docencia.herencia.ejercicio2;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class VehiculoTest {

    private Vehiculo crear(UUID id, String marca, String modelo) {
        return new Vehiculo(id, marca, modelo) {
            @Override
            public int ruedas() {
                return 1;
            }
        };
    }

    @Test
    void constructor_asigna_campos() {
        var obj = crear(UUID.randomUUID(), "valor", "valor");
        assertNotNull(obj.getId());
        assertEquals("valor", obj.getMarca());
        assertEquals("valor", obj.getModelo());
    }

    @Test
    void constructor_genera_id_si_null() {
        var obj = crear(null, "valor", "valor");
        assertNotNull(obj.getId());
    }

    @Test
    void ids_son_unicos_en_instancias_distintas() {
        var a = crear(null, "valor", "valor");
        var b = crear(null, "valor", "valor");
        assertNotEquals(a.getId(), b.getId());
    }

    @Test
    void equals_mismo_id_misma_clase_es_true() {
        var id = UUID.randomUUID();
        var a = crear(id, "valor", "valor");
        var b = crear(id, "otro", "otro");
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equals_distinto_id_es_false() {
        var a = crear(UUID.randomUUID(), "valor", "valor");
        var b = crear(UUID.randomUUID(), "valor", "valor");
        assertNotEquals(a, b);
    }

    @Test
    void toString_contiene_nombre_clase_y_id() {
        var obj = crear(null, "valor", "valor");
        var s = obj.toString();
        assertTrue(s.contains("Vehiculo"));
        assertTrue(s.contains("id="));
    }

    @Test
    void metodo_abstracto_funciona() {
        var obj = crear(null, "valor", "valor");
        assertEquals(1, obj.ruedas());
    }
}
