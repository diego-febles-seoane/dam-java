package com.docencia.maps.ejercicio6;

import com.docencia.herencia.ejercicio6.CuentaBancaria;
import com.docencia.herencia.ejercicio6.CuentaAhorro;
import com.docencia.herencia.ejercicio6.CuentaCorriente;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.NoSuchElementException;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class MapaCuentasBancariasTest {

    private CuentaBancaria nuevoA(UUID id) {
        return new CuentaAhorro(id, "Ana", 100.0, 0.02);
    }

    private CuentaBancaria nuevoB(UUID id) {
        return new CuentaCorriente(id, "Luis", 200.0, 1.0);
    }

    private CuentaBancaria invalido(UUID id) {
        return new CuentaAhorro(id, " ", 100.0, 0.02);
    }

    @Test
    void anadirOkTest() {
        var c = new MapaCuentasBancarias();
        var id = UUID.randomUUID();
        c.anadir(nuevoA(id));
        assertEquals(1, c.tamanio());
        assertNotNull(c.buscarPorId(id));
    }

    @Test
    void anadirNullTest() {
        var c = new MapaCuentasBancarias();
        assertThrows(IllegalArgumentException.class, () -> c.anadir(null));
    }

    @Test
    void anadirInvalidTest() {
        var c = new MapaCuentasBancarias();
        var id = UUID.randomUUID();
        assertThrows(IllegalArgumentException.class, () -> c.anadir(invalido(id)));
    }

    @Test
    void anadirDuplicadoIdTest() {
        var c = new MapaCuentasBancarias();
        var id = UUID.randomUUID();
        c.anadir(nuevoA(id));
        assertThrows(IllegalArgumentException.class, () -> c.anadir(nuevoB(id)));
    }

    @Test
    void buscarPorIdOkTest() {
        var c = new MapaCuentasBancarias();
        var id = UUID.randomUUID();
        c.anadir(nuevoA(id));
        assertNotNull(c.buscarPorId(id));
    }

    @Test
    void buscarPorIdNullTest() {
        var c = new MapaCuentasBancarias();
        assertThrows(IllegalArgumentException.class, () -> c.buscarPorId(null));
    }

    @Test
    void eliminarPorIdOkTest() {
        var c = new MapaCuentasBancarias();
        var id = UUID.randomUUID();
        c.anadir(nuevoA(id));
        assertTrue(c.eliminarPorId(id));
        assertEquals(0, c.tamanio());
    }

    @Test
    void modificarOkTest() {
        var c = new MapaCuentasBancarias();
        var id = UUID.randomUUID();
        c.anadir(nuevoA(id));
        c.modificar(id, nuevoB(id));
        assertNotNull(c.buscarPorId(id));
        assertEquals(1, c.tamanio());
    }

    @Test
    void modificarNoExisteTest() {
        var c = new MapaCuentasBancarias();
        var id = UUID.randomUUID();
        assertThrows(NoSuchElementException.class, () -> c.modificar(id, nuevoA(id)));
    }

    @Test
    void claseDocumentadaTest() throws Exception {
        // Verifica que existe al menos un bloque de Javadoc en la clase.
        String rel = "src/main/java/" + "com.docencia.maps.ejercicio6".replace('.', '/') + "/MapaCuentasBancarias.java";
        String content = Files.readString(Path.of(rel));
        assertTrue(content.contains("/**"));
    }
}
