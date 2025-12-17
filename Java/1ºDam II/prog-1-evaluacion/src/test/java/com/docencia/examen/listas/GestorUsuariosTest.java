package com.docencia.examen.listas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.docencia.examen.clases.Usuario;
import com.docencia.examen.herencia.Empleado;

public class GestorUsuariosTest {

    @Test
    @DisplayName("Al crear un GestorUsuarios la lista está vacía")
    void nuevaInstancialistaVacia() {
        GestorUsuarios gestor = new GestorUsuarios();

        assertAll(
            () -> assertTrue(gestor.estaVacia(), "La lista debe estar vacía"),
            () -> assertEquals(0, gestor.numeroUsuarios(), "El número de usuarios debe ser 0")
        );
    }

    @Test
    @DisplayName("Agregar usuarios incrementa el tamaño y la lista deja de estar vacía")
    void agregarUsuariosIncrementaTamano() {
        GestorUsuarios gestor = new GestorUsuarios();

        Usuario u1 = new Usuario("1", "Ana", "López");
        Usuario u2 = new Usuario("2", "Juan", "Pérez");

        gestor.agregarUsuario(u1);
        gestor.agregarUsuario(u2);

        assertAll(
            () -> assertFalse(gestor.estaVacia()),
            () -> assertEquals(2, gestor.numeroUsuarios())
        );
    }

    @Test
    @DisplayName("contains utiliza equals: detecta usuarios con el mismo identificador")
    void contieneUsuarioEquals() {
        GestorUsuarios gestor = new GestorUsuarios();

        Usuario u1 = new Usuario("1", "Ana", "López");
        Usuario u2 = new Usuario("2", "Juan", "Pérez");

        gestor.agregarUsuario(u1);
        gestor.agregarUsuario(u2);

        Usuario u1Clon = new Usuario("1", "Otra", "Persona");

        assertAll(
            () -> assertTrue(gestor.contieneUsuario(u1), "Debe contener a u1"),
            () -> assertTrue(gestor.contieneUsuario(u1Clon),
                    "Debe considerar contenido a otro Usuario con mismo identificador (equals)")
        );
    }

    @Test
    @DisplayName("obtenerPorPosicion devuelve el usuario correcto según el orden de inserción")
    void obtenerPorPosicionDevuelveUsuarioCorrecto() {
        GestorUsuarios gestor = new GestorUsuarios();

        Usuario u1 = new Usuario("1", "Ana", "López");
        Usuario u2 = new Usuario("2", "Juan", "Pérez");
        Usuario u3 = new Usuario("3", "Bea", "García");

        gestor.agregarUsuario(u1);
        gestor.agregarUsuario(u2);
        gestor.agregarUsuario(u3);

        assertAll(
            () -> assertEquals(u1, gestor.obtenerPorPosicion(0)),
            () -> assertEquals(u2, gestor.obtenerPorPosicion(1)),
            () -> assertEquals(u3, gestor.obtenerPorPosicion(2))
        );
    }

    @Test
    @DisplayName("obtenerPorPosicion lanza IndexOutOfBounds si el índice no existe")
    void obtenerPorPosicionIndiceInvalido_lanzaExcepcion() {
        GestorUsuarios gestor = new GestorUsuarios();
        gestor.agregarUsuario(new Usuario("1", "Ana", "López"));

        assertAll(
            () -> assertThrows(IndexOutOfBoundsException.class,
                    () -> gestor.obtenerPorPosicion(-1)),
            () -> assertThrows(IndexOutOfBoundsException.class,
                    () -> gestor.obtenerPorPosicion(1)) // solo hay 1 elemento en índice 0
        );
    }

    @Test
    @DisplayName("buscarPorIdentificador devuelve el usuario correcto o null si no existe")
    void buscarPorIdentificadorDevuelveUsuarioONull() {
        GestorUsuarios gestor = new GestorUsuarios();

        Usuario u1 = new Usuario("1", "Ana", "López");
        Usuario u2 = new Usuario("2", "Juan", "Pérez");

        gestor.agregarUsuario(u1);
        gestor.agregarUsuario(u2);

        Usuario encontrado = gestor.buscarPorIdentificador("2");
        Usuario noEncontrado = gestor.buscarPorIdentificador("999");

        assertAll(
            () -> assertNotNull(encontrado),
            () -> assertEquals(u2, encontrado),
            () -> assertNull(noEncontrado, "Debe devolver null si no existe el identificador")
        );
    }

    @Test
    @DisplayName("eliminarPorIdentificador borra todos los usuarios con ese identificador")
    void eliminarPorIdentificadorBorraCoincidencias() {
        GestorUsuarios gestor = new GestorUsuarios();

        gestor.agregarUsuario(new Usuario("1", "Ana", "López"));
        gestor.agregarUsuario(new Usuario("2", "Juan", "Pérez"));
        gestor.agregarUsuario(new Usuario("1", "Otra", "Persona")); 

        assertEquals(3, gestor.numeroUsuarios());

        boolean eliminado = gestor.eliminarPorIdentificador("1");

        assertAll(
            () -> assertTrue(eliminado, "Debe devolver true si se ha eliminado al menos un usuario"),
            () -> assertEquals(1, gestor.numeroUsuarios(), "Solo debe quedar el de id=2"),
            () -> assertNull(gestor.buscarPorIdentificador("1"), "Ya no debe existir ningún usuario con id=1")
        );

        boolean eliminadoDeNuevo = gestor.eliminarPorIdentificador("1");
        assertFalse(eliminadoDeNuevo, "No debe eliminar nada si ya no hay usuarios con ese id");
    }


    @Test
    @DisplayName("limpiar vacía la lista de usuarios")
    void limpiar_vaciaLista() {
        GestorUsuarios gestor = new GestorUsuarios();

        gestor.agregarUsuario(new Usuario("1", "Ana", "López"));
        gestor.agregarUsuario(new Usuario("2", "Juan", "Pérez"));

        gestor.limpiar();

        assertAll(
            () -> assertTrue(gestor.estaVacia()),
            () -> assertEquals(0, gestor.numeroUsuarios())
        );
    }

    
    @Test
    @DisplayName("GestorUsuarios puede manejar instancias de subclases de Usuario (como Empleado)")
    void gestorManejaSubclasesDeUsuario() {
        GestorUsuarios gestor = new GestorUsuarios();

        Empleado empleado = new Empleado("E001", "Carlos", "García", "IT", 2000.0);
        gestor.agregarUsuario(empleado);

        assertAll(
            () -> assertEquals(1, gestor.numeroUsuarios()),
            () -> assertTrue(gestor.contieneUsuario(empleado)),
            () -> assertEquals("E001", gestor.obtenerPorPosicion(0).getIdentificador())
        );
    }
}
