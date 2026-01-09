package com.docencia.composicion.ejercicio11;


import java.util.ArrayList;
import java.util.List;


public class Lectura {
    private final Socio socio;
    private final String tituloLibro;

    public Lectura(Socio socio, String tituloLibro) {
        this.socio = socio;
        this.tituloLibro = tituloLibro;
    }

    public Socio getSocio() {
        return socio;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }
}
