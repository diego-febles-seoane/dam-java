package com.docencia.examen.herencia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.docencia.examen.clases.Usuario;

public class EmpleadoTest {

    @Test
    @DisplayName("Constructor vacío de Empleado deja campos heredados y propios en null/0")
    void constructorVacio_empleado_camposPorDefecto() {
        Empleado empleado = new Empleado();

        assertAll(
            () -> assertNull(empleado.getIdentificador(), "Identificador debe ser null"),
            () -> assertNull(empleado.getNombre(), "Nombre debe ser null"),
            () -> assertNull(empleado.getApellidos(), "Apellidos deben ser null"),
            () -> assertNull(empleado.getDepartamento(), "Departamento debe ser null"),
            () -> assertEquals(0.0, empleado.getSalario(), 0.0001, "Salario debe ser 0.0")
        );
    }

    @Test
    @DisplayName("Constructor con identificador solo inicializa el identificador (Empleado)")
    void constructorSoloIdentificador_inicializaIdentificador() {
        String id = "E001";
        Empleado empleado = new Empleado(id);

        assertAll(
            () -> assertEquals(id, empleado.getIdentificador()),
            () -> assertNull(empleado.getNombre()),
            () -> assertNull(empleado.getApellidos()),
            () -> assertNull(empleado.getDepartamento()),
            () -> assertEquals(0.0, empleado.getSalario(), 0.0001)
        );
    }

    @Test
    @DisplayName("Constructor completo de Empleado inicializa todos los campos")
    void constructorCompleto_inicializaTodosLosCampos() {
        String id = "E002";
        String nombre = "Ana";
        String apellidos = "López";
        String departamento = "IT";
        double salario = 2500.50;

        Empleado empleado = new Empleado(id, nombre, apellidos, departamento, salario);

        assertAll(
            () -> assertEquals(id, empleado.getIdentificador()),
            () -> assertEquals(nombre, empleado.getNombre()),
            () -> assertEquals(apellidos, empleado.getApellidos()),
            () -> assertEquals(departamento, empleado.getDepartamento()),
            () -> assertEquals(salario, empleado.getSalario(), 0.0001)
        );
    }

    @Test
    @DisplayName("toString de Empleado contiene la información básica")
    void toString_contieneInformacion() {
        Empleado empleado = new Empleado("E003", "Juan", "Pérez", "Ventas", 1800.0);
        String texto = empleado.toString();

        assertAll(
            () -> assertTrue(texto.contains("E003"), "toString debe contener el identificador"),
            () -> assertTrue(texto.contains("Juan"), "toString debe contener el nombre"),
            () -> assertTrue(texto.contains("Pérez"), "toString debe contener los apellidos"),
            () -> assertTrue(texto.contains("Ventas"), "toString debe contener el departamento")
        );
    }

    @Test
    @DisplayName("Dos Empleados con el mismo identificador son equals (ignora nombre/departamento/salario)")
    void equals_mismoIdentificador_empleado() {
        Empleado e1 = new Empleado("E100", "Ana", "López", "IT", 2000.0);
        Empleado e2 = new Empleado("E100", "Carlos", "García", "HR", 3000.0);

        assertEquals(e1, e2, "Empleados con el mismo identificador deben ser equals");
        assertEquals(e1.hashCode(), e2.hashCode(), "hashCode debe coincidir si equals es true");
    }

    @Test
    @DisplayName("Dos Empleados con distinto identificador NO son equals")
    void equals_identificadoresDistintos_empleado() {
        Empleado e1 = new Empleado("E101", "Ana", "López", "IT", 2000.0);
        Empleado e2 = new Empleado("E102", "Ana", "López", "IT", 2000.0);

        assertNotEquals(e1, e2);
    }

    @Test
    @DisplayName("Empleado no es equals a Usuario aunque compartan identificador (por getClass en equals)")
    void equals_empleadoVsUsuario_noIguales() {
        Usuario u = new Usuario("E200", "Ana", "López");
        Empleado e = new Empleado("E200", "Ana", "López", "IT", 2000.0);

        assertNotEquals(u, e, "Usuario y Empleado con mismo id no son equals por getClass()");
        assertNotEquals(e, u, "Empleado y Usuario con mismo id tampoco son equals");
    }
}
