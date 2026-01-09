package com.docencia.composicion.ejercicio3;


import java.util.ArrayList;
import java.util.List;


public class CentroSalud {
    private final List<Consulta> consultas = new ArrayList<>();

    public void registrarConsulta(Paciente paciente, String motivo) {
        // TODO: validar según enunciado (paciente y motivo válidos).
        if (paciente != null && motivo != null) {
            consultas.add(new Consulta(paciente, motivo));
        }
    }

    public int contarConsultasDe(String nombrePaciente) {
        // TODO: contar consultas por nombre ignorando mayúsculas/minúsculas y espacios.
        return 0;
    }

    public List<Consulta> getConsultas() {
        return new ArrayList<>(consultas);
    }
}
