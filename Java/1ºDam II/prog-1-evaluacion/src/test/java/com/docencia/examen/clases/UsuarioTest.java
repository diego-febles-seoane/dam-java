package com.docencia.examen.clases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UsuarioTest {

    @Test
    @DisplayName("Constructor vacío deja los campos en null")
    void constructorVacioDejaCamposANull() {
        Usuario usuario = new Usuario();

        assertAll(
            () -> assertNull(usuario.getIdentificador(), "Identificador debe ser null"),
            () -> assertNull(usuario.getNombre(), "Nombre debe ser null"),
            () -> assertNull(usuario.getApellidos(), "Apellidos deben ser null")
        );
    }

    @Test
    @DisplayName("Constructor con identificador solo inicializa identificador y deja resto en null")
    void constructorSoloIdentificadorInicializaIdentificador() {
        String id = "123";
        Usuario usuario = new Usuario(id);

        assertAll(
            () -> assertEquals(id, usuario.getIdentificador(), "Identificador incorrecto"),
            () -> assertNull(usuario.getNombre(), "Nombre debe ser null"),
            () -> assertNull(usuario.getApellidos(), "Apellidos deben ser null")
        );
    }

    @Test
    @DisplayName("Constructor con identificador, nombre y apellidos inicializa todos los campos")
    void constructorCompletoInicializaTodosLosCampos() {
        String id = "123";
        String nombre = "Juan";
        String apellidos = "Pérez";

        Usuario usuario = new Usuario(id, nombre, apellidos);

        assertAll(
            () -> assertEquals(id, usuario.getIdentificador()),
            () -> assertEquals(nombre, usuario.getNombre()),
            () -> assertEquals(apellidos, usuario.getApellidos())
        );
    }

    @Test
    @DisplayName("equals es reflexivo: un usuario es igual a sí mismo")
    void equalsEsReflexivo() {
        Usuario usuario = new Usuario("123", "Juan", "Pérez");

        assertEquals(usuario, usuario);
    }

    @Test
    @DisplayName("equals devuelve false al comparar con null")
    void equalsConNullDevuelveFalse() {
        Usuario usuario = new Usuario("123", "Juan", "Pérez");

        assertNotEquals(usuario, null);
    }

    @Test
    @DisplayName("equals devuelve false al comparar con otro tipo de objeto")
    void equalsConOtraClaseDevuelveFalse() {
        Usuario usuario = new Usuario("123", "Juan", "Pérez");
        String otraCosa = "no soy un usuario";

        assertNotEquals(usuario, otraCosa);
    }

    @Test
    @DisplayName("Dos usuarios con el mismo identificador son iguales aunque cambien nombre/apellidos")
    void equalsMismoIdentificadorIgnoraNombreYApellidos() {
        Usuario u1 = new Usuario("123", "Juan", "Pérez");
        Usuario u2 = new Usuario("123", "Ana", "López");

        assertEquals(u1, u2, "Usuarios con mismo identificador deben ser iguales");
    }

    @Test
    @DisplayName("Dos usuarios con distinto identificador NO son iguales")
    void equalsDistintoIdentificadorDevuelveFalse() {
        Usuario u1 = new Usuario("123", "Juan", "Pérez");
        Usuario u2 = new Usuario("456", "Juan", "Pérez");

        assertNotEquals(u1, u2);
    }

    @Test
    @DisplayName("Dos usuarios con identificador null en ambos se consideran iguales")
    void equalsIdentificadoresNullEnAmbosSonIgualesSegunImplementacion() {
        Usuario u1 = new Usuario();
        Usuario u2 = new Usuario();

        assertEquals(u1, u2);
    }

    @Test
    @DisplayName("Usuario con identificador null y usuario con identificador no null NO son iguales")
    void equals_identificadorNullVSNoNull_devuelveFalse() {
        Usuario u1 = new Usuario();               // identificador null
        Usuario u2 = new Usuario("123");          // identificador no null

        assertNotEquals(u1, u2);
        assertNotEquals(u2, u1);
    }

    @Test
    @DisplayName("hashCode es consistente con equals para identificadores iguales")
    void hashCodeMismoIdentificadorMsmoHash() {
        Usuario u1 = new Usuario("123", "Juan", "Pérez");
        Usuario u2 = new Usuario("123", "Ana", "López");

        assertEquals(u1, u2, "Deben ser equals");
        assertEquals(u1.hashCode(), u2.hashCode(), "hashCode debe coincidir si equals es true");
    }

    @Test
    @DisplayName("hashCode es consistente con equals cuando identificador es null en ambos")
    void hashCodeIdentificadorNullEnAmbosIguales() {
        Usuario u1 = new Usuario();
        Usuario u2 = new Usuario();

        assertEquals(u1, u2, "Deben ser equals (ambos identificador null)");
        assertEquals(u1.hashCode(), u2.hashCode(), "hashCode debe coincidir si ambos tienen identificador null");
    }

    @Test
    @DisplayName("Getters devuelven los valores almacenados")
    void gettersDevuelvenValoresCorrectos() {
        Usuario usuario = new Usuario("999", "Pepe", "García");

        assertAll(
            () -> assertEquals("999", usuario.getIdentificador()),
            () -> assertEquals("Pepe", usuario.getNombre()),
            () -> assertEquals("García", usuario.getApellidos())
        );
    }
}
