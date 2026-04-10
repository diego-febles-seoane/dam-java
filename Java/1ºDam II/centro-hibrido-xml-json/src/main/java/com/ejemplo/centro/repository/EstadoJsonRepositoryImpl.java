package com.ejemplo.centro.repository;

import com.ejemplo.centro.model.EstadoCentro;
import com.ejemplo.centro.model.Evaluacion;
import com.ejemplo.centro.model.Incidencia;
import com.ejemplo.centro.util.JsonManager;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EstadoJsonRepositoryImpl implements EstadoJsonRepository {
    private final Path jsonPath;
    private final JsonManager jsonManager;
    private EstadoCentro estadoCentro;

    public EstadoJsonRepositoryImpl(Path jsonPath) {
        this(jsonPath, new JsonManager());
    }

    public EstadoJsonRepositoryImpl(Path jsonPath, JsonManager jsonManager) {
        this.jsonPath = jsonPath;
        this.jsonManager = jsonManager;
        this.estadoCentro = jsonManager.read(jsonPath);
    }

    @Override
    public void saveEvaluacion(Evaluacion evaluacion) {
        estadoCentro.getEvaluaciones().removeIf(e -> e.getModuloId().equals(evaluacion.getModuloId()) &&
                e.getAlumno().equals(evaluacion.getAlumno()));
        estadoCentro.getEvaluaciones().add(evaluacion);
        jsonManager.write(jsonPath, estadoCentro);
    }

    @Override
    public List<Evaluacion> findAllEvaluaciones() {
        return new ArrayList<>(estadoCentro.getEvaluaciones());
    }

    @Override
    public List<Evaluacion> findEvaluacionesByModuloId(String moduloId) {
        return estadoCentro.getEvaluaciones().stream()
                .filter(e -> e.getModuloId().equals(moduloId))
                .collect(Collectors.toList());
    }

    @Override
    public void saveIncidencia(Incidencia incidencia) {
        estadoCentro.getIncidencias().add(incidencia);
        jsonManager.write(jsonPath, estadoCentro);
    }

    @Override
    public List<Incidencia> findAllIncidencias() {
        return new ArrayList<>(estadoCentro.getIncidencias());
    }

    @Override
    public List<Incidencia> findIncidenciasByProfesorId(String profesorId) {
        return estadoCentro.getIncidencias().stream()
                .filter(i -> i.getProfesorId().equals(profesorId))
                .collect(Collectors.toList());
    }
}
