package com.docencia.interfaces.ejercicio2;

/**
 * Define el comportamiento de objetos capaces de volar.
 * <p>
 * Incluye un metodo abstracto y un metodo <i>default</i> para poder probar la
 * interfaz.
 */
public interface Volador {

    /** Metodo principal de la interfaz. */
    int altitudMaxima();

    /**
     * Metodo default: las interfaces pueden contener implementacion.
     */
    default String info() {
        return "Interfaz Volador";
    }
}
