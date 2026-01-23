package com.docencia.herencia.ejercicio1;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class PersonaTest {

    private Persona crear(UUID id, String nombre, int edad) {
        return new Persona(id, nombre, edad) {
            @Override
            public String rol() {
                return "X";
            }
        };
    }

    @Test
    void constructor_asigna_campos() {
        var obj = crear(UUID.randomUUID(), "valor", 18);
        assertNotNull(obj.getId());
        assertEquals("valor", obj.getNombre());
        assertEquals(18, obj.getEdad());
    }

    @Test
    void constructor_genera_id_si_null() {
        var obj = crear(null, "valor", 18);
        assertNotNull(obj.getId());
    }

    @Test
    void ids_son_unicos_en_instancias_distintas() {
        var a = crear(null, "valor", 18);
        var b = crear(null, "valor", 18);
        assertNotEquals(a.getId(), b.getId());
    }

    @Test
    void equals_mismo_id_misma_clase_es_true() {
        var id = UUID.randomUUID();
        var a = crear(id, "valor", 18);
        var b = crear(id, "otro", 19);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equals_distinto_id_es_false() {
        var a = crear(UUID.randomUUID(), "valor", 18);
        var b = crear(UUID.randomUUID(), "valor", 18);
        assertNotEquals(a, b);
    }

    @Test
    void toString_contiene_nombre_clase_y_id() {
        var obj = crear(null, "valor", 18);
        var s = obj.toString();
        assertTrue(s.contains("Persona"));
        assertTrue(s.contains("id="));
    }

    @Test
    void metodo_abstracto_funciona() {
        var obj = crear(null, "valor", 18);
        assertEquals("X", obj.rol());
    }
}
