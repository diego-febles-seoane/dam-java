package com.docencia.interfaces.ejercicio3;

/**
 * Define una capacidad de conexion a un destino.
 * <p>
 * Incluye un metodo abstracto y un metodo <i>default</i> para poder probar la interfaz.
 */
public interface Conectable {

    /** Metodo principal de la interfaz. */
    boolean conectar(String destino);

    /**
     * Metodo default: las interfaces pueden contener implementacion.
     */
    default String info() {
        return "Interfaz Conectable";
    }
}
