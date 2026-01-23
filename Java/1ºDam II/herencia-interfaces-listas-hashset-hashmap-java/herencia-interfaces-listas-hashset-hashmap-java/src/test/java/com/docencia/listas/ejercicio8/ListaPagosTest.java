package com.docencia.listas.ejercicio8;

import com.docencia.herencia.ejercicio8.Pago;
import com.docencia.herencia.ejercicio8.PagoEfectivo;
import com.docencia.herencia.ejercicio8.PagoTarjeta;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.NoSuchElementException;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class ListaPagosTest {

    private Pago nuevoA(UUID id) {
        return new PagoTarjeta(id, 50.0, "1234");
    }

    private Pago nuevoB(UUID id) {
        return new PagoEfectivo(id, 20.0, true);
    }

    private Pago invalido(UUID id) {
        return new PagoTarjeta(id, 0.0, "1234");
    }

    @Test
    void anadirOkTest() {
        var l = new ListaPagos();
        var id = UUID.randomUUID();
        l.anadir(nuevoA(id));
        assertEquals(1, l.tamanio());
        assertNotNull(l.buscarPorId(id));
    }

    @Test
    void anadirNullTest() {
        var l = new ListaPagos();
        assertThrows(IllegalArgumentException.class, () -> l.anadir(null));
    }

    @Test
    void anadirInvalidTest() {
        var l = new ListaPagos();
        assertThrows(IllegalArgumentException.class, () -> l.anadir(invalido(UUID.randomUUID())));
    }

    @Test
    void anadirDuplicadoIdTest() {
        var l = new ListaPagos();
        var id = UUID.randomUUID();
        l.anadir(nuevoA(id));
        assertThrows(IllegalArgumentException.class, () -> l.anadir(nuevoB(id)));
    }

    @Test
    void buscarPorIdOkTest() {
        var l = new ListaPagos();
        var id = UUID.randomUUID();
        l.anadir(nuevoA(id));
        assertNotNull(l.buscarPorId(id));
    }

    @Test
    void buscarPorIdNullTest() {
        var l = new ListaPagos();
        assertThrows(IllegalArgumentException.class, () -> l.buscarPorId(null));
    }

    @Test
    void buscarPorIdNoExisteTest() {
        var l = new ListaPagos();
        assertNull(l.buscarPorId(UUID.randomUUID()));
    }

    @Test
    void eliminarPorIdOkTest() {
        var l = new ListaPagos();
        var id = UUID.randomUUID();
        l.anadir(nuevoA(id));
        assertTrue(l.eliminarPorId(id));
        assertEquals(0, l.tamanio());
    }

    @Test
    void eliminarPorIdNullTest() {
        var l = new ListaPagos();
        assertThrows(IllegalArgumentException.class, () -> l.eliminarPorId(null));
    }

    @Test
    void eliminarPorIdNoExisteTest() {
        var l = new ListaPagos();
        assertFalse(l.eliminarPorId(UUID.randomUUID()));
    }

    @Test
    void modificarOkTest() {
        var l = new ListaPagos();
        var id = UUID.randomUUID();
        l.anadir(nuevoA(id));
        l.modificar(id, nuevoB(id));
        assertEquals(1, l.tamanio());
        assertNotNull(l.buscarPorId(id));
    }

    @Test
    void modificarNullIdTest() {
        var l = new ListaPagos();
        var id = UUID.randomUUID();
        l.anadir(nuevoA(id));
        assertThrows(IllegalArgumentException.class, () -> l.modificar(null, nuevoB(id)));
    }

    @Test
    void modificarNullElementoTest() {
        var l = new ListaPagos();
        var id = UUID.randomUUID();
        l.anadir(nuevoA(id));
        assertThrows(IllegalArgumentException.class, () -> l.modificar(id, null));
    }

    @Test
    void modificarInvalidTest() {
        var l = new ListaPagos();
        var id = UUID.randomUUID();
        l.anadir(nuevoA(id));
        assertThrows(IllegalArgumentException.class, () -> l.modificar(id, invalido(id)));
    }

    @Test
    void modificarIdDistintoTest() {
        var l = new ListaPagos();
        var id = UUID.randomUUID();
        l.anadir(nuevoA(id));
        assertThrows(IllegalArgumentException.class, () -> l.modificar(id, nuevoB(UUID.randomUUID())));
    }

    @Test
    void modificarNoExisteTest() {
        var l = new ListaPagos();
        var id = UUID.randomUUID();
        assertThrows(NoSuchElementException.class, () -> l.modificar(id, nuevoA(id)));
    }

    @Test
    void listarInmutableTest() {
        var l = new ListaPagos();
        l.anadir(nuevoA(UUID.randomUUID()));
        var vista = l.listar();
        assertThrows(UnsupportedOperationException.class, () -> vista.add(nuevoA(UUID.randomUUID())));
    }

    @Test
    void claseDocumentadaTest() throws Exception {
        String rel = "src/main/java/com/docencia/listas/ejercicio8/ListaPagos.java";
        String content = Files.readString(Path.of(rel));
        assertTrue(content.contains("/**"));
    }
}
