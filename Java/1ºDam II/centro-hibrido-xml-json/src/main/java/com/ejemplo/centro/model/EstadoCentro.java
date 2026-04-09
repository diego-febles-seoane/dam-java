package com.ejemplo.centro.model;

import java.util.ArrayList;
import java.util.List;

public class EstadoCentro {
    private List<Evaluacion> evaluaciones = new ArrayList<>();
    private List<Incidencia> incidencias = new ArrayList<>();

    public EstadoCentro() {
    }

    public EstadoCentro(List<Evaluacion> evaluaciones, List<Incidencia> incidencias) {
        this.evaluaciones = evaluaciones;
        this.incidencias = incidencias;
    }

    public List<Evaluacion> getEvaluaciones() {
        return evaluaciones;
    }

    public void setEvaluaciones(List<Evaluacion> evaluaciones) {
        this.evaluaciones = evaluaciones;
    }

    public List<Incidencia> getIncidencias() {
        return incidencias;
    }

    public void setIncidencias(List<Incidencia> incidencias) {
        this.incidencias = incidencias;
    }
}
