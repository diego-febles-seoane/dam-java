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

    public EstadoJsonRepositoryImpl(Path jsonPath) {
        this(jsonPath, new JsonManager());
    }

    public EstadoJsonRepositoryImpl(Path jsonPath, JsonManager jsonManager) {
        this.jsonPath = jsonPath;
        this.jsonManager = jsonManager;
    }

    @Override
    public void saveEvaluacion(Evaluacion evaluacion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveEvaluacion'");
    }

    @Override
    public List<Evaluacion> findAllEvaluaciones() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAllEvaluaciones'");
    }

    @Override
    public List<Evaluacion> findEvaluacionesByModuloId(String moduloId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findEvaluacionesByModuloId'");
    }

    @Override
    public void saveIncidencia(Incidencia incidencia) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveIncidencia'");
    }

    @Override
    public List<Incidencia> findAllIncidencias() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAllIncidencias'");
    }

    @Override
    public List<Incidencia> findIncidenciasByProfesorId(String profesorId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findIncidenciasByProfesorId'");
    }

    
}
