package com.docencia.composicion.ejercicio11;


import java.util.ArrayList;
import java.util.List;


public class ClubLectura {
    private final List<Lectura> lecturas = new ArrayList<>();

    public void registrarLectura(String nombreSocio, String tituloLibro) {
        // TODO: validar datos según enunciado.
        if (nombreSocio != null && tituloLibro != null) {
            lecturas.add(new Lectura(new Socio(nombreSocio), tituloLibro));
        }
    }

    public int vecesLeido(String tituloLibro) {
        // TODO: implementar según enunciado/tests.
        return 0;
    }

    public String libroMasLeido() {
        // TODO: implementar libro más leído.
        return null;
    }

    public List<Lectura> getLecturas() {
        return new ArrayList<>(lecturas);
    }
}
