package com.docencia.examen.herencia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DirectivoTest {

    @Test
    @DisplayName("Constructor vacío de Directivo deja campos heredados y propios en null/0")
    void constructorVacio_directivo_camposPorDefecto() {
        Directivo d = new Directivo();

        assertAll(
            () -> assertNull(d.getIdentificador(), "Identificador debe ser null"),
            () -> assertNull(d.getNombre(), "Nombre debe ser null"),
            () -> assertNull(d.getApellidos(), "Apellidos deben ser null"),
            () -> assertNull(d.getDepartamento(), "Departamento debe ser null"),
            () -> assertEquals(0.0, d.getSalario(), 0.0001, "Salario base debe ser 0.0"),
            () -> assertNull(d.getCategoria(), "Categoría debe ser null"),
            () -> assertEquals(0.0, d.getComplemento(), 0.0001, "Complemento debe ser 0.0")
        );
    }

    @Test
    @DisplayName("Constructor con identificador solo inicializa identificador (Directivo)")
    void constructorSoloIdentificador_directivo() {
        Directivo d = new Directivo("D001");

        assertAll(
            () -> assertEquals("D001", d.getIdentificador()),
            () -> assertNull(d.getNombre()),
            () -> assertNull(d.getApellidos()),
            () -> assertNull(d.getDepartamento()),
            () -> assertEquals(0.0, d.getSalario(), 0.0001),
            () -> assertNull(d.getCategoria()),
            () -> assertEquals(0.0, d.getComplemento(), 0.0001)
        );
    }

    @Test
    @DisplayName("Constructor completo de Directivo inicializa todos los campos")
    void constructorCompleto_directivo() {
        Directivo d = new Directivo(
                "D010",
                "Laura",
                "Martín",
                "Dirección",
                3000.0,
                "Directora",
                500.0
        );

        assertAll(
            () -> assertEquals("D010", d.getIdentificador()),
            () -> assertEquals("Laura", d.getNombre()),
            () -> assertEquals("Martín", d.getApellidos()),
            () -> assertEquals("Dirección", d.getDepartamento()),
            () -> assertEquals(3000.0, d.getSalario(), 0.0001),
            () -> assertEquals("Directora", d.getCategoria()),
            () -> assertEquals(500.0, d.getComplemento(), 0.0001)
        );
    }

    @Test
    @DisplayName("getSalarioTotal suma salario base y complemento")
    void getSalarioTotal_correcto() {
        Directivo d = new Directivo(
                "D020",
                "Pedro",
                "Sánchez",
                "Finanzas",
                2500.0,
                "Jefe de área",
                300.0
        );

        double esperado = 2500.0 + 300.0;
        assertEquals(esperado, d.getSalarioTotal(), 0.0001);
    }

    @Test
    @DisplayName("toString de Directivo contiene información básica y categoría")
    void toString_directivo() {
        Directivo d = new Directivo(
                "D030",
                "Marta",
                "Gómez",
                "Marketing",
                2800.0,
                "Directora",
                400.0
        );

        String texto = d.toString();

        assertAll(
            () -> assertTrue(texto.contains("D030"), "Debe contener el identificador"),
            () -> assertTrue(texto.contains("Marta"), "Debe contener el nombre"),
            () -> assertTrue(texto.contains("Gómez"), "Debe contener los apellidos"),
            () -> assertTrue(texto.contains("Marketing"), "Debe contener el departamento"),
            () -> assertTrue(texto.contains("Directora"), "Debe contener la categoría")
        );
    }

    @Test
    @DisplayName("Dos Directivos con el mismo identificador son equals (ignora resto de campos)")
    void equals_mismoIdentificador_directivo() {
        Directivo d1 = new Directivo(
                "D100",
                "Ana",
                "López",
                "Dirección",
                4000.0,
                "Directora",
                1000.0
        );

        Directivo d2 = new Directivo(
                "D100",
                "Otra",
                "Persona",
                "OtroDept",
                1000.0,
                "OtraCategoria",
                0.0
        );

        assertEquals(d1, d2, "Directivos con el mismo identificador deben ser equals");
        assertEquals(d1.hashCode(), d2.hashCode(), "hashCode debe coincidir si equals es true");
    }

    @Test
    @DisplayName("Dos Directivos con distinto identificador NO son equals")
    void equals_identificadoresDistintos_directivo() {
        Directivo d1 = new Directivo("D101", "Ana", "López", "Dirección", 4000.0, "Directora", 1000.0);
        Directivo d2 = new Directivo("D102", "Ana", "López", "Dirección", 4000.0, "Directora", 1000.0);

        assertNotEquals(d1, d2);
    }

    @Test
    @DisplayName("Directivo y Empleado con el mismo identificador NO son equals por getClass()")
    void equals_directivoVsEmpleado_noIguales() {
        Empleado e = new Empleado("D200", "Juan", "Pérez", "Ventas", 2000.0);
        Directivo d = new Directivo("D200", "Juan", "Pérez", "Ventas", 2000.0, "Jefe", 500.0);

        assertNotEquals(e, d, "Empleado y Directivo con mismo id no son equals");
        assertNotEquals(d, e, "Directivo y Empleado con mismo id tampoco son equals");
    }
}
