package com.docencia.sets.ejercicio2;

import com.docencia.herencia.ejercicio2.Vehiculo;
import com.docencia.herencia.ejercicio2.Coche;
import com.docencia.herencia.ejercicio2.Motocicleta;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.NoSuchElementException;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class ConjuntoVehiculosTest {

    private Vehiculo nuevoA(UUID id) {
        return new Coche(id, "Toyota", "Corolla", 4);
    }

    private Vehiculo nuevoB(UUID id) {
        return new Motocicleta(id, "Honda", "CBR", true);
    }

    private Vehiculo invalido(UUID id) {
        return new Coche(id, " ", "Corolla", 4);
    }

    @Test
    void anadirOkTest() {
        var c = new ConjuntoVehiculos();
        var id = UUID.randomUUID();
        c.anadir(nuevoA(id));
        assertEquals(1, c.tamanio());
        assertNotNull(c.buscarPorId(id));
    }

    @Test
    void anadirNullTest() {
        var c = new ConjuntoVehiculos();
        assertThrows(IllegalArgumentException.class, () -> c.anadir(null));
    }

    @Test
    void anadirInvalidTest() {
        var c = new ConjuntoVehiculos();
        var id = UUID.randomUUID();
        assertThrows(IllegalArgumentException.class, () -> c.anadir(invalido(id)));
    }

    @Test
    void anadirDuplicadoIdTest() {
        var c = new ConjuntoVehiculos();
        var id = UUID.randomUUID();
        c.anadir(nuevoA(id));
        assertThrows(IllegalArgumentException.class, () -> c.anadir(nuevoB(id)));
    }

    @Test
    void buscarPorIdOkTest() {
        var c = new ConjuntoVehiculos();
        var id = UUID.randomUUID();
        c.anadir(nuevoA(id));
        assertNotNull(c.buscarPorId(id));
    }

    @Test
    void buscarPorIdNullTest() {
        var c = new ConjuntoVehiculos();
        assertThrows(IllegalArgumentException.class, () -> c.buscarPorId(null));
    }

    @Test
    void eliminarPorIdOkTest() {
        var c = new ConjuntoVehiculos();
        var id = UUID.randomUUID();
        c.anadir(nuevoA(id));
        assertTrue(c.eliminarPorId(id));
        assertEquals(0, c.tamanio());
    }

    @Test
    void modificarOkTest() {
        var c = new ConjuntoVehiculos();
        var id = UUID.randomUUID();
        c.anadir(nuevoA(id));
        c.modificar(id, nuevoB(id));
        assertNotNull(c.buscarPorId(id));
        assertEquals(1, c.tamanio());
    }

    @Test
    void modificarNoExisteTest() {
        var c = new ConjuntoVehiculos();
        var id = UUID.randomUUID();
        assertThrows(NoSuchElementException.class, () -> c.modificar(id, nuevoA(id)));
    }

    @Test
    void claseDocumentadaTest() throws Exception {
        // Verifica que existe al menos un bloque de Javadoc en la clase.
        String rel = "src/main/java/" + "com.docencia.sets.ejercicio2".replace('.', '/') + "/ConjuntoVehiculos.java";
        String content = Files.readString(Path.of(rel));
        assertTrue(content.contains("/**"));
    }
}
