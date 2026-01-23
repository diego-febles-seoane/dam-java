package com.docencia.listas.ejercicio3;

import com.docencia.herencia.ejercicio3.Desarrollador;
import com.docencia.herencia.ejercicio3.Empleado;
import com.docencia.herencia.ejercicio3.Gerente;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.NoSuchElementException;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class ListaEmpleadosTest {

    private Empleado nuevoA(UUID id) {
        return new Desarrollador(id, "Maria", 2000.0, "Java");
    }

    private Empleado nuevoB(UUID id) {
        return new Gerente(id, "Pedro", 3000.0, 5);
    }

    private Empleado invalido(UUID id) {
        return new Desarrollador(id, " ", 2000.0, "Java");
    }

    @Test
    void anadirOkTest() {
        var l = new ListaEmpleados();
        var id = UUID.randomUUID();
        l.anadir(nuevoA(id));
        assertEquals(1, l.tamanio());
        assertNotNull(l.buscarPorId(id));
    }

    @Test
    void anadirNullTest() {
        var l = new ListaEmpleados();
        assertThrows(IllegalArgumentException.class, () -> l.anadir(null));
    }

    @Test
    void anadirInvalidTest() {
        var l = new ListaEmpleados();
        assertThrows(IllegalArgumentException.class, () -> l.anadir(invalido(UUID.randomUUID())));
    }

    @Test
    void anadirDuplicadoIdTest() {
        var l = new ListaEmpleados();
        var id = UUID.randomUUID();
        l.anadir(nuevoA(id));
        assertThrows(IllegalArgumentException.class, () -> l.anadir(nuevoB(id)));
    }

    @Test
    void buscarPorIdOkTest() {
        var l = new ListaEmpleados();
        var id = UUID.randomUUID();
        l.anadir(nuevoA(id));
        assertNotNull(l.buscarPorId(id));
    }

    @Test
    void buscarPorIdNullTest() {
        var l = new ListaEmpleados();
        assertThrows(IllegalArgumentException.class, () -> l.buscarPorId(null));
    }

    @Test
    void buscarPorIdNoExisteTest() {
        var l = new ListaEmpleados();
        assertNull(l.buscarPorId(UUID.randomUUID()));
    }

    @Test
    void eliminarPorIdOkTest() {
        var l = new ListaEmpleados();
        var id = UUID.randomUUID();
        l.anadir(nuevoA(id));
        assertTrue(l.eliminarPorId(id));
        assertEquals(0, l.tamanio());
    }

    @Test
    void eliminarPorIdNullTest() {
        var l = new ListaEmpleados();
        assertThrows(IllegalArgumentException.class, () -> l.eliminarPorId(null));
    }

    @Test
    void eliminarPorIdNoExisteTest() {
        var l = new ListaEmpleados();
        assertFalse(l.eliminarPorId(UUID.randomUUID()));
    }

    @Test
    void modificarOkTest() {
        var l = new ListaEmpleados();
        var id = UUID.randomUUID();
        l.anadir(nuevoA(id));
        l.modificar(id, nuevoB(id));
        assertEquals(1, l.tamanio());
        assertNotNull(l.buscarPorId(id));
    }

    @Test
    void modificarNullIdTest() {
        var l = new ListaEmpleados();
        var id = UUID.randomUUID();
        l.anadir(nuevoA(id));
        assertThrows(IllegalArgumentException.class, () -> l.modificar(null, nuevoB(id)));
    }

    @Test
    void modificarNullElementoTest() {
        var l = new ListaEmpleados();
        var id = UUID.randomUUID();
        l.anadir(nuevoA(id));
        assertThrows(IllegalArgumentException.class, () -> l.modificar(id, null));
    }

    @Test
    void modificarInvalidTest() {
        var l = new ListaEmpleados();
        var id = UUID.randomUUID();
        l.anadir(nuevoA(id));
        assertThrows(IllegalArgumentException.class, () -> l.modificar(id, invalido(id)));
    }

    @Test
    void modificarIdDistintoTest() {
        var l = new ListaEmpleados();
        var id = UUID.randomUUID();
        l.anadir(nuevoA(id));
        assertThrows(IllegalArgumentException.class, () -> l.modificar(id, nuevoB(UUID.randomUUID())));
    }

    @Test
    void modificarNoExisteTest() {
        var l = new ListaEmpleados();
        var id = UUID.randomUUID();
        assertThrows(NoSuchElementException.class, () -> l.modificar(id, nuevoA(id)));
    }

    @Test
    void listarInmutableTest() {
        var l = new ListaEmpleados();
        l.anadir(nuevoA(UUID.randomUUID()));
        var vista = l.listar();
        assertThrows(UnsupportedOperationException.class, () -> vista.add(nuevoA(UUID.randomUUID())));
    }

    @Test
    void claseDocumentadaTest() throws Exception {
        String rel = "src/main/java/com/docencia/listas/ejercicio3/ListaEmpleados.java";
        String content = Files.readString(Path.of(rel));
        assertTrue(content.contains("/**"));
    }
}
