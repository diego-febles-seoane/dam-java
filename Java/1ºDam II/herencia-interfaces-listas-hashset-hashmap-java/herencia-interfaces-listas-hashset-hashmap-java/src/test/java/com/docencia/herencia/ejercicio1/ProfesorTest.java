package com.docencia.herencia.ejercicio1;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class ProfesorTest {

    @Test
    void constructor_asigna_campos() {
        var obj = new Profesor(UUID.randomUUID(), "valor", 18, "valor");
        assertNotNull(obj.getId());
        assertEquals("valor", obj.getNombre());
        assertEquals(18, obj.getEdad());
        assertEquals("valor", obj.getDepartamento());
    }

    @Test
    void constructor_genera_id_si_null() {
        var obj = new Profesor(null, "valor", 18, "valor");
        assertNotNull(obj.getId());
    }

    @Test
    void ids_son_unicos_en_instancias_distintas() {
        var a = new Profesor(null, "valor", 18, "valor");
        var b = new Profesor(null, "valor", 18, "valor");
        assertNotEquals(a.getId(), b.getId());
    }

    @Test
    void equals_mismo_id_misma_clase_es_true() {
        var id = UUID.randomUUID();
        var a = new Profesor(id, "valor", 18, "valor");
        var b = new Profesor(id, "otro", 19, "otro");
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equals_otro_tipo_es_false() {
        var a = new Profesor(null, "valor", 18, "valor");
        Object b = new Object();
        assertNotEquals(a, b);
    }

    @Test
    void equals_distinto_id_es_false() {
        var a = new Profesor(UUID.randomUUID(), "valor", 18, "valor");
        var b = new Profesor(UUID.randomUUID(), "valor", 18, "valor");
        assertNotEquals(a, b);
    }

    @Test
    void toString_contiene_nombre_clase_y_campos() {
        var obj = new Profesor(null, "valor", 18, "valor");
        var s = obj.toString();
        assertTrue(s.contains("Profesor"));
        assertTrue(s.contains("id="));
    }

    @Test
    void metodo_abstracto_implementado_devuelve_esperado() {
        var obj = new Profesor(null, "valor", 18, "valor");
        assertEquals("Profesor", obj.rol());
    }

    @Test
    void es_instancia_de_la_clase_base() {
        Persona b = new Profesor(null, "valor", 18, "valor");
        assertNotNull(b);
    }
}
