package com.ejemplo.centro.repository;

import com.ejemplo.centro.model.Evaluacion;
import com.ejemplo.centro.model.Incidencia;
import java.util.List;

public interface EstadoJsonRepository {
    void saveEvaluacion(Evaluacion evaluacion);
    List<Evaluacion> findAllEvaluaciones();
    List<Evaluacion> findEvaluacionesByModuloId(String moduloId);
    void saveIncidencia(Incidencia incidencia);
    List<Incidencia> findAllIncidencias();
    List<Incidencia> findIncidenciasByProfesorId(String profesorId);
}
