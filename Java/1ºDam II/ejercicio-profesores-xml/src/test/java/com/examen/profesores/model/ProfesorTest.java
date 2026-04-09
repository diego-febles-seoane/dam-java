package com.examen.profesores.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfesorTest {

    @Test
    void creaProfesorActivoPorDefectoTest() {
        Profesor profesor = new Profesor("P001", "Ana Perez", "Informatica");

        assertEquals("P001", profesor.getId());
        assertEquals("Ana Perez", profesor.getNombre());
        assertEquals("Informatica", profesor.getDepartamento());
        assertTrue(profesor.isActivo());
    }

    @Test
    void modificaEstadoActivoTest() {
        Profesor profesor = new Profesor("P001", "Ana Perez", "Informatica");
        profesor.setActivo(false);
        assertFalse(profesor.isActivo());
    }

    @Test
    void devuelveTrueSiTienenMismoIdTest() {
        Profesor profesor1 = new Profesor("P001", "Ana Perez", "Informatica");
        Profesor profesor2 = new Profesor("P001", "Luis Martin", "FOL");
        assertEquals(profesor1, profesor2);
    }

    @Test
    void devuelveFalseSiTienenDistintoIdTest() {
        Profesor profesor1 = new Profesor("P001", "Ana Perez", "Informatica");
        Profesor profesor2 = new Profesor("P002", "Luis Martin", "FOL");
        assertNotEquals(profesor1, profesor2);
    }

    @Test
    void generaMismoHashCodeSiTienenMismoIdTest() {
        Profesor profesor1 = new Profesor("P001", "Ana Perez", "Informatica");
        Profesor profesor2 = new Profesor("P001", "Luis Martin", "FOL");
        assertEquals(profesor1.hashCode(), profesor2.hashCode());
    }

    @Test
    void contieneDatosPrincipalesEnToStringTest() {
        Profesor profesor = new Profesor("P001", "Ana Perez", "Informatica");
        String texto = profesor.toString();
        assertTrue(texto.contains("P001"));
        assertTrue(texto.contains("Ana Perez"));
        assertTrue(texto.contains("Informatica"));
    }
}
