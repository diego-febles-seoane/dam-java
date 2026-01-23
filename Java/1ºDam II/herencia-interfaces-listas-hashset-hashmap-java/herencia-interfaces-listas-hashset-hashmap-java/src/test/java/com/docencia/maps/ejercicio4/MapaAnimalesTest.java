package com.docencia.maps.ejercicio4;

import com.docencia.herencia.ejercicio4.Animal;
import com.docencia.herencia.ejercicio4.Perro;
import com.docencia.herencia.ejercicio4.Gato;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.NoSuchElementException;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class MapaAnimalesTest {

    private Animal nuevoA(UUID id) {
        return new Perro(id, "Toby", "Labrador");
    }

    private Animal nuevoB(UUID id) {
        return new Gato(id, "Misu", true);
    }

    private Animal invalido(UUID id) {
        return new Perro(id, " ", "Labrador");
    }

    @Test
    void anadirOkTest() {
        var c = new MapaAnimales();
        var id = UUID.randomUUID();
        c.anadir(nuevoA(id));
        assertEquals(1, c.tamanio());
        assertNotNull(c.buscarPorId(id));
    }

    @Test
    void anadirNullTest() {
        var c = new MapaAnimales();
        assertThrows(IllegalArgumentException.class, () -> c.anadir(null));
    }

    @Test
    void anadirInvalidTest() {
        var c = new MapaAnimales();
        var id = UUID.randomUUID();
        assertThrows(IllegalArgumentException.class, () -> c.anadir(invalido(id)));
    }

    @Test
    void anadirDuplicadoIdTest() {
        var c = new MapaAnimales();
        var id = UUID.randomUUID();
        c.anadir(nuevoA(id));
        assertThrows(IllegalArgumentException.class, () -> c.anadir(nuevoB(id)));
    }

    @Test
    void buscarPorIdOkTest() {
        var c = new MapaAnimales();
        var id = UUID.randomUUID();
        c.anadir(nuevoA(id));
        assertNotNull(c.buscarPorId(id));
    }

    @Test
    void buscarPorIdNullTest() {
        var c = new MapaAnimales();
        assertThrows(IllegalArgumentException.class, () -> c.buscarPorId(null));
    }

    @Test
    void eliminarPorIdOkTest() {
        var c = new MapaAnimales();
        var id = UUID.randomUUID();
        c.anadir(nuevoA(id));
        assertTrue(c.eliminarPorId(id));
        assertEquals(0, c.tamanio());
    }

    @Test
    void modificarOkTest() {
        var c = new MapaAnimales();
        var id = UUID.randomUUID();
        c.anadir(nuevoA(id));
        c.modificar(id, nuevoB(id));
        assertNotNull(c.buscarPorId(id));
        assertEquals(1, c.tamanio());
    }

    @Test
    void modificarNoExisteTest() {
        var c = new MapaAnimales();
        var id = UUID.randomUUID();
        assertThrows(NoSuchElementException.class, () -> c.modificar(id, nuevoA(id)));
    }

    @Test
    void claseDocumentadaTest() throws Exception {
        // Verifica que existe al menos un bloque de Javadoc en la clase.
        String rel = "src/main/java/" + "com.docencia.maps.ejercicio4".replace('.', '/') + "/MapaAnimales.java";
        String content = Files.readString(Path.of(rel));
        assertTrue(content.contains("/**"));
    }
}
