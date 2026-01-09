package com.docencia.composicion.ejercicio3;


import java.util.ArrayList;
import java.util.List;


public class Consulta {
    private final Paciente paciente;
    private final String motivo;

    public Consulta(Paciente paciente, String motivo) {
        this.paciente = paciente;
        this.motivo = motivo;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public String getMotivo() {
        return motivo;
    }
}
