package com.docencia.composicion.ejercicio12;


import java.util.ArrayList;
import java.util.List;


public class MesaElectoral {
    private final List<Voto> votos = new ArrayList<>();

    public void registrarVoto(String nombreCandidato) {
        // TODO: validar datos según enunciado.
        if (nombreCandidato != null) {
            votos.add(new Voto(new Candidato(nombreCandidato)));
        }
    }

    public int votosDe(String nombreCandidato) {
        // TODO: implementar según enunciado/tests.
        return 0;
    }

    public String ganador() {
        // TODO: implementar ganador según enunciado/tests.
        return null;
    }

    public List<Voto> getVotos() {
        return new ArrayList<>(votos);
    }
}
