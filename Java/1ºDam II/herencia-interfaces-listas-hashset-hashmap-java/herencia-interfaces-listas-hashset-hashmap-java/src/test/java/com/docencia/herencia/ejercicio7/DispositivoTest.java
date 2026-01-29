package com.docencia.herencia.ejercicio7;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class DispositivoTest {

    private Dispositivo crear(UUID id, String fabricante) {
        return new Dispositivo(id, fabricante) {
            @Override
            public String tipo() {
                return "X";
            }
        };
    }

    @Test
    void constructor_asigna_campos() {
        var obj = crear(UUID.randomUUID(), "valor");
        assertNotNull(obj.getId());
        assertEquals("valor", obj.getFabricante());
    }

    @Test
    void constructor_genera_id_si_null() {
        var obj = crear(null, "valor");
        assertNotNull(obj.getId());
    }

    @Test
    void ids_son_unicos_en_instancias_distintas() {
        var a = crear(null, "valor");
        var b = crear(null, "valor");
        assertNotEquals(a.getId(), b.getId());
    }

    @Test
    void equals_mismo_id_misma_clase_es_true() {
        var id = UUID.randomUUID();
        var a = crear(id, "valor");
        var b = crear(id, "otro");
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equals_distinto_id_es_false() {
        var a = crear(UUID.randomUUID(), "valor");
        var b = crear(UUID.randomUUID(), "valor");
        assertNotEquals(a, b);
    }

    @Test
    void toString_contiene_nombre_clase_y_id() {
        var obj = crear(null, "valor");
        var s = obj.toString();
        assertTrue(s.contains("Dispositivo"));
        assertTrue(s.contains("id="));
    }

    @Test
    void metodo_abstracto_funciona() {
        var obj = crear(null, "valor");
        assertEquals("X", obj.tipo());
    }
}
