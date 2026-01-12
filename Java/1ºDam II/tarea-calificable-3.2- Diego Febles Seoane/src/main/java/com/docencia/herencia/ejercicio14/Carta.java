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
public class Carta extends Documento {

    /**
     * Constrictor por defecto
     * @param titulo de carta
     */
    public Carta(String titulo) {
        super(titulo);
    }

    private String destinatario;

    /**
     * Getters y setters
     * @param destinatario de carta
     */
    public void setDestinatario(String destinatario) {
        if (destinatario == null || destinatario.isEmpty() || destinatario.isBlank()){
            throw new IllegalArgumentException();
        }
        this.destinatario = destinatario.trim();
    }
    public String getDestinatario() {
        return destinatario;
    }

    /**
     * Metodo toString
     */
    @Override
    public String descripcion() {
        return "Carta: " + getTitulo() + " | Para: " + getDestinatario();
    }
}
