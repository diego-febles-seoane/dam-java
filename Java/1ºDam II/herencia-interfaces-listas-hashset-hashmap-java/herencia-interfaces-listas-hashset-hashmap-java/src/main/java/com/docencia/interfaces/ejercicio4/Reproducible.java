package com.docencia.interfaces.ejercicio4;

/**
 * Define elementos que pueden reproducirse (audio/video/etc.).
 * <p>
 * Incluye un metodo abstracto y un metodo <i>default</i> para poder probar la interfaz.
 */
public interface Reproducible {

    /** Metodo principal de la interfaz. */
    String reproducir();

    /**
     * Metodo default: las interfaces pueden contener implementacion.
     */
    default String info() {
        return "Interfaz Reproducible";
    }
}
