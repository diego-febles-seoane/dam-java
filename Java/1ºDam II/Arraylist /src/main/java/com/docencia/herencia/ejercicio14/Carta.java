package com.docencia.herencia.ejercicio14;

import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio 14
 *
 * Ejercicio de herencias
 * 
 * @author santiago
 * @version 1.0.0
 */
public class Carta extends Documento {
    public Carta(String titulo) {
        super(titulo);
        // TODO Auto-generated constructor stub
    }

    private String destinatario;

    public void setDestinatario(String destinatario) {
        if (destinatario == null || destinatario.isBlank()) {
            throw new IllegalArgumentException();
        }
        this.destinatario = destinatario;
    }

    public String getDestinatario() {
        return destinatario;
    }

    @Override
    public String toString() {
        return "{" +
                " Carta='" + getTitulo() + " | Para" + destinatario;
    }

   

}
