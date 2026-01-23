package com.docencia.interfaces.ejercicio5;

/**
 * Define objetos capaces de devolver una medida numerica.
 * <p>
 * Incluye un metodo abstracto y un metodo <i>default</i> para poder probar la interfaz.
 */
public interface Medible {

    /** Metodo principal de la interfaz. */
    double medir();

    /**
     * Metodo default: las interfaces pueden contener implementacion.
     */
    default String info() {
        return "Interfaz Medible";
    }
}
