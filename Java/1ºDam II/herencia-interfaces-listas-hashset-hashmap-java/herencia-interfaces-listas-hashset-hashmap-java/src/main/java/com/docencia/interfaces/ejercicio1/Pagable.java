package com.docencia.interfaces.ejercicio1;

/**
 * Representa algo que puede calcular un total monetario.
 * <p>
 * Incluye un metodo abstracto y un metodo <i>default</i> para poder probar la interfaz.
 */
public interface Pagable {

    /** Metodo principal de la interfaz. */
    double total();

    /**
     * Metodo default: las interfaces pueden contener implementacion.
     */
    default String info() {
        return "Interfaz Pagable";
    }
}
