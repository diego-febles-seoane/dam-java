package com.ejemplo.centro.service;

import com.ejemplo.centro.model.Evaluacion;
import com.ejemplo.centro.model.Incidencia;
import com.ejemplo.centro.model.Modulo;
import com.ejemplo.centro.model.Profesor;
import java.util.List;

public interface CentroService {
    Profesor buscarProfesor(String profesorId);
    Modulo buscarModulo(String moduloId);
    List<Modulo> listarModulosDeProfesor(String profesorId);
    Evaluacion registrarEvaluacion(String alumno, String moduloId, double nota);
    List<Evaluacion> listarEvaluacionesDeModulo(String moduloId);
    double calcularMediaDeModulo(String moduloId);
    double calcularMediaDeProfesor(String profesorId);
    Incidencia registrarIncidencia(String profesorId, String descripcion, String fecha);
    List<Incidencia> listarIncidenciasDeProfesor(String profesorId);
}
