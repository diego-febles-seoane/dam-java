package com.docencia.listas.ejercicio6;

import com.docencia.herencia.ejercicio6.CuentaAhorro;
import com.docencia.herencia.ejercicio6.CuentaBancaria;
import com.docencia.herencia.ejercicio6.CuentaCorriente;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.NoSuchElementException;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class ListaCuentasBancariasTest {

    private CuentaBancaria nuevoA(UUID id) {
        return new CuentaAhorro(id, "Pepe", 100.0, 1.5);
    }

    private CuentaBancaria nuevoB(UUID id) {
        return new CuentaCorriente(id, "Pepe", 200.0, 500.0);
    }

    private CuentaBancaria invalido(UUID id) {
        return new CuentaAhorro(id, " ", 100.0, 1.5);
    }

    @Test
    void anadirOkTest() {
        var l = new ListaCuentasBancarias();
        var id = UUID.randomUUID();
        l.anadir(nuevoA(id));
        assertEquals(1, l.tamanio());
        assertNotNull(l.buscarPorId(id));
    }

    @Test
    void anadirNullTest() {
        var l = new ListaCuentasBancarias();
        assertThrows(IllegalArgumentException.class, () -> l.anadir(null));
    }

    @Test
    void anadirInvalidTest() {
        var l = new ListaCuentasBancarias();
        assertThrows(IllegalArgumentException.class, () -> l.anadir(invalido(UUID.randomUUID())));
    }

    @Test
    void anadirDuplicadoIdTest() {
        var l = new ListaCuentasBancarias();
        var id = UUID.randomUUID();
        l.anadir(nuevoA(id));
        assertThrows(IllegalArgumentException.class, () -> l.anadir(nuevoB(id)));
    }

    @Test
    void buscarPorIdOkTest() {
        var l = new ListaCuentasBancarias();
        var id = UUID.randomUUID();
        l.anadir(nuevoA(id));
        assertNotNull(l.buscarPorId(id));
    }

    @Test
    void buscarPorIdNullTest() {
        var l = new ListaCuentasBancarias();
        assertThrows(IllegalArgumentException.class, () -> l.buscarPorId(null));
    }

    @Test
    void buscarPorIdNoExisteTest() {
        var l = new ListaCuentasBancarias();
        assertNull(l.buscarPorId(UUID.randomUUID()));
    }

    @Test
    void eliminarPorIdOkTest() {
        var l = new ListaCuentasBancarias();
        var id = UUID.randomUUID();
        l.anadir(nuevoA(id));
        assertTrue(l.eliminarPorId(id));
        assertEquals(0, l.tamanio());
    }

    @Test
    void eliminarPorIdNullTest() {
        var l = new ListaCuentasBancarias();
        assertThrows(IllegalArgumentException.class, () -> l.eliminarPorId(null));
    }

    @Test
    void eliminarPorIdNoExisteTest() {
        var l = new ListaCuentasBancarias();
        assertFalse(l.eliminarPorId(UUID.randomUUID()));
    }

    @Test
    void modificarOkTest() {
        var l = new ListaCuentasBancarias();
        var id = UUID.randomUUID();
        l.anadir(nuevoA(id));
        l.modificar(id, nuevoB(id));
        assertEquals(1, l.tamanio());
        assertNotNull(l.buscarPorId(id));
    }

    @Test
    void modificarNullIdTest() {
        var l = new ListaCuentasBancarias();
        var id = UUID.randomUUID();
        l.anadir(nuevoA(id));
        assertThrows(IllegalArgumentException.class, () -> l.modificar(null, nuevoB(id)));
    }

    @Test
    void modificarNullElementoTest() {
        var l = new ListaCuentasBancarias();
        var id = UUID.randomUUID();
        l.anadir(nuevoA(id));
        assertThrows(IllegalArgumentException.class, () -> l.modificar(id, null));
    }

    @Test
    void modificarInvalidTest() {
        var l = new ListaCuentasBancarias();
        var id = UUID.randomUUID();
        l.anadir(nuevoA(id));
        assertThrows(IllegalArgumentException.class, () -> l.modificar(id, invalido(id)));
    }

    @Test
    void modificarIdDistintoTest() {
        var l = new ListaCuentasBancarias();
        var id = UUID.randomUUID();
        l.anadir(nuevoA(id));
        assertThrows(IllegalArgumentException.class, () -> l.modificar(id, nuevoB(UUID.randomUUID())));
    }

    @Test
    void modificarNoExisteTest() {
        var l = new ListaCuentasBancarias();
        var id = UUID.randomUUID();
        assertThrows(NoSuchElementException.class, () -> l.modificar(id, nuevoA(id)));
    }

    @Test
    void listarInmutableTest() {
        var l = new ListaCuentasBancarias();
        l.anadir(nuevoA(UUID.randomUUID()));
        var vista = l.listar();
        assertThrows(UnsupportedOperationException.class, () -> vista.add(nuevoA(UUID.randomUUID())));
    }

    @Test
    void claseDocumentadaTest() throws Exception {
        String rel = "src/main/java/com/docencia/listas/ejercicio6/ListaCuentasBancarias.java";
        String content = Files.readString(Path.of(rel));
        assertTrue(content.contains("/**"));
    }
}
