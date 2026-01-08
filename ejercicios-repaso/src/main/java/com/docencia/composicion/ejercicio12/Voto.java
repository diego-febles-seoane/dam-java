package com.docencia.composicion.ejercicio12;


import java.util.ArrayList;
import java.util.List;


public class Voto {
    private final Candidato candidato;

    public Voto(Candidato candidato) {
        this.candidato = candidato;
    }

    public Candidato getCandidato() {
        return candidato;
    }
}
