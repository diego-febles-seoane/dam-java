package com.docencia.sets.ejercicio3;

import com.docencia.herencia.ejercicio3.Empleado;
import com.docencia.herencia.ejercicio3.Desarrollador;
import com.docencia.herencia.ejercicio3.Gerente;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.NoSuchElementException;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class ConjuntoEmpleadosTest {

    private Empleado nuevoA(UUID id) {
        return new Desarrollador(id, "Marta", 1000.0, "Java");
    }

    private Empleado nuevoB(UUID id) {
        return new Gerente(id, "Pablo", 2000.0, 5);
    }

    private Empleado invalido(UUID id) {
        return new Desarrollador(id, "", 1000.0, "Java");
    }

    @Test
    void anadirOkTest() {
        var c = new ConjuntoEmpleados();
        var id = UUID.randomUUID();
        c.anadir(nuevoA(id));
        assertEquals(1, c.tamanio());
        assertNotNull(c.buscarPorId(id));
    }

    @Test
    void anadirNullTest() {
        var c = new ConjuntoEmpleados();
        assertThrows(IllegalArgumentException.class, () -> c.anadir(null));
    }

    @Test
    void anadirInvalidTest() {
        var c = new ConjuntoEmpleados();
        var id = UUID.randomUUID();
        assertThrows(IllegalArgumentException.class, () -> c.anadir(invalido(id)));
    }

    @Test
    void anadirDuplicadoIdTest() {
        var c = new ConjuntoEmpleados();
        var id = UUID.randomUUID();
        c.anadir(nuevoA(id));
        assertThrows(IllegalArgumentException.class, () -> c.anadir(nuevoB(id)));
    }

    @Test
    void buscarPorIdOkTest() {
        var c = new ConjuntoEmpleados();
        var id = UUID.randomUUID();
        c.anadir(nuevoA(id));
        assertNotNull(c.buscarPorId(id));
    }

    @Test
    void buscarPorIdNullTest() {
        var c = new ConjuntoEmpleados();
        assertThrows(IllegalArgumentException.class, () -> c.buscarPorId(null));
    }

    @Test
    void eliminarPorIdOkTest() {
        var c = new ConjuntoEmpleados();
        var id = UUID.randomUUID();
        c.anadir(nuevoA(id));
        assertTrue(c.eliminarPorId(id));
        assertEquals(0, c.tamanio());
    }

    @Test
    void modificarOkTest() {
        var c = new ConjuntoEmpleados();
        var id = UUID.randomUUID();
        c.anadir(nuevoA(id));
        c.modificar(id, nuevoB(id));
        assertNotNull(c.buscarPorId(id));
        assertEquals(1, c.tamanio());
    }

    @Test
    void modificarNoExisteTest() {
        var c = new ConjuntoEmpleados();
        var id = UUID.randomUUID();
        assertThrows(NoSuchElementException.class, () -> c.modificar(id, nuevoA(id)));
    }

    @Test
    void claseDocumentadaTest() throws Exception {
        // Verifica que existe al menos un bloque de Javadoc en la clase.
        String rel = "src/main/java/" + "com.docencia.sets.ejercicio3".replace('.', '/') + "/ConjuntoEmpleados.java";
        String content = Files.readString(Path.of(rel));
        assertTrue(content.contains("/**"));
    }
}
