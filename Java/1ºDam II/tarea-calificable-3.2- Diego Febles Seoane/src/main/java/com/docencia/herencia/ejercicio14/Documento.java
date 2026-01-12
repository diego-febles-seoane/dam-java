package com.docencia.herencia.ejercicio14;


import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio 14
 *
 * Clase lanzadora (opcional) y contenedor de métodos del enunciado.
 * @author diegofeblesseoane
 * @version 1.0.0
 */
public abstract class Documento {
    private final String titulo;

    /**
     * Constuctor por defecto
     * @param titulo de documento
     */
    protected Documento(String titulo) {
        if (titulo == null || titulo.isEmpty() || titulo.isBlank()){
            throw new IllegalArgumentException();
        }
        this.titulo = titulo;
    }

    /**
     * Getters
     * @return titulo
     */
    public String getTitulo() {
        return this.titulo.trim();
    }
    

    public abstract String descripcion();
}
