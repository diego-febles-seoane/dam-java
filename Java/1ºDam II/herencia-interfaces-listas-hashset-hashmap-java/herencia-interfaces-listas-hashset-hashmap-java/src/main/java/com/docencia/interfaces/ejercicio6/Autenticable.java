package com.docencia.interfaces.ejercicio6;

/**
 * Define objetos que pueden autenticarse con una clave.
 * <p>
 * Incluye un metodo abstracto y un metodo <i>default</i> para poder probar la interfaz.
 */
public interface Autenticable {

    /** Metodo principal de la interfaz. */
    boolean autenticar(String clave);

    /**
     * Metodo default: las interfaces pueden contener implementacion.
     */
    default String info() {
        return "Interfaz Autenticable";
    }
}
