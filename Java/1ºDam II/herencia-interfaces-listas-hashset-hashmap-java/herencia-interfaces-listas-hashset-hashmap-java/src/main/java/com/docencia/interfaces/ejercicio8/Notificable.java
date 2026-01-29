package com.docencia.interfaces.ejercicio8;

/**
 * Define una capacidad de notificar un mensaje.
 * <p>
 * Incluye un metodo abstracto y un metodo <i>default</i> para poder probar la interfaz.
 */
public interface Notificable {

    /** Metodo principal de la interfaz. */
    boolean notificar(String mensaje);

    /**
     * Metodo default: las interfaces pueden contener implementacion.
     */
    default String info() {
        return "Interfaz Notificable";
    }
}
