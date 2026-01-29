package com.docencia.herencia.ejercicio1;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class AlumnoTest {

    @Test
    void constructor_asigna_campos() {
        var obj = new Alumno(UUID.randomUUID(), "valor", 18, "valor");
        assertNotNull(obj.getId());
        assertEquals("valor", obj.getNombre());
        assertEquals(18, obj.getEdad());
        assertEquals("valor", obj.getMatricula());
    }

    @Test
    void constructor_genera_id_si_null() {
        var obj = new Alumno(null, "valor", 18, "valor");
        assertNotNull(obj.getId());
    }

    @Test
    void ids_son_unicos_en_instancias_distintas() {
        var a = new Alumno(null, "valor", 18, "valor");
        var b = new Alumno(null, "valor", 18, "valor");
        assertNotEquals(a.getId(), b.getId());
    }

    @Test
    void equals_mismo_id_misma_clase_es_true() {
        var id = UUID.randomUUID();
        var a = new Alumno(id, "valor", 18, "valor");
        var b = new Alumno(id, "otro", 19, "otro");
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equals_otro_tipo_es_false() {
        var a = new Alumno(null, "valor", 18, "valor");
        Object b = new Object();
        assertNotEquals(a, b);
    }

    @Test
    void equals_distinto_id_es_false() {
        var a = new Alumno(UUID.randomUUID(), "valor", 18, "valor");
        var b = new Alumno(UUID.randomUUID(), "valor", 18, "valor");
        assertNotEquals(a, b);
    }

    @Test
    void toString_contiene_nombre_clase_y_campos() {
        var obj = new Alumno(null, "valor", 18, "valor");
        var s = obj.toString();
        assertTrue(s.contains("Alumno"));
        assertTrue(s.contains("id="));
    }

    @Test
    void metodo_abstracto_implementado_devuelve_esperado() {
        var obj = new Alumno(null, "valor", 18, "valor");
        assertEquals("Alumno", obj.rol());
    }

    @Test
    void es_instancia_de_la_clase_base() {
        Persona b = new Alumno(null, "valor", 18, "valor");
        assertNotNull(b);
    }
}
