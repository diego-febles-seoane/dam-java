package com.ejemplo.centro.service;

import com.ejemplo.centro.model.Evaluacion;
import com.ejemplo.centro.model.Incidencia;
import com.ejemplo.centro.model.Modulo;
import com.ejemplo.centro.model.Profesor;
import com.ejemplo.centro.repository.CentroXmlRepository;
import com.ejemplo.centro.repository.EstadoJsonRepository;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CentroServiceImpl implements CentroService {

    private final CentroXmlRepository xmlRepository;
    private final EstadoJsonRepository jsonRepository;

    public CentroServiceImpl(CentroXmlRepository xmlRepository, EstadoJsonRepository jsonRepository) {
        this.xmlRepository = Objects.requireNonNull(xmlRepository);
        this.jsonRepository = Objects.requireNonNull(jsonRepository);
    }

    @Override
    public Profesor buscarProfesor(String profesorId) {
        if (profesorId == null) {
            return null;
        }
        String id = profesorId.trim();
        if (id.isBlank()) {
            return null;
        }
        return xmlRepository.findProfesorById(id);
    }

    @Override
    public Modulo buscarModulo(String moduloId) {
        if (moduloId == null) {
            return null;
        }
        String id = moduloId.trim();
        if (id.isBlank()) {
            return null;
        }
        return xmlRepository.findModuloById(id);
    }

    @Override
    public List<Modulo> listarModulosDeProfesor(String profesorId) {
        if (profesorId == null) {
            return List.of();
        }
        String id = profesorId.trim();
        if (id.isBlank()) {
            return List.of();
        }
        return xmlRepository.findAllModulos().stream()
                .filter(m -> m.getProfesorId().equals(id))
                .collect(Collectors.toList());
    }

    @Override
    public Evaluacion registrarEvaluacion(String alumno, String moduloId, double nota) {
        if (alumno == null || moduloId == null) {
            return null;
        }
        String alumnoTrimmed = alumno.trim();
        String moduloIdTrimmed = moduloId.trim();
        if (alumnoTrimmed.isBlank() || moduloIdTrimmed.isBlank()) {
            return null;
        }
        if (nota < 0.0 || nota > 10.0) {
            return null;
        }
        Modulo modulo = buscarModulo(moduloIdTrimmed);
        if (modulo == null) {
            return null;
        }
        Evaluacion evaluacion = new Evaluacion(alumnoTrimmed, moduloIdTrimmed, nota);
        jsonRepository.saveEvaluacion(evaluacion);
        return evaluacion;
    }

    @Override
    public List<Evaluacion> listarEvaluacionesDeModulo(String moduloId) {
        return jsonRepository.findEvaluacionesByModuloId(moduloId);
    }

    @Override
    public double calcularMediaDeModulo(String moduloId) {
        List<Evaluacion> evaluaciones = jsonRepository.findEvaluacionesByModuloId(moduloId);
        if (evaluaciones.isEmpty()) {
            return 0.0;
        }
        return evaluaciones.stream()
                .mapToDouble(Evaluacion::getNota)
                .average()
                .orElse(0.0);
    }

    @Override
    public double calcularMediaDeProfesor(String profesorId) {
        List<Modulo> modulos = listarModulosDeProfesor(profesorId);
        List<String> moduloIds = modulos.stream()
                .map(Modulo::getId)
                .collect(Collectors.toList());
        List<Evaluacion> evaluaciones = jsonRepository.findAllEvaluaciones().stream()
                .filter(e -> moduloIds.contains(e.getModuloId()))
                .collect(Collectors.toList());
        if (evaluaciones.isEmpty()) {
            return 0.0;
        }
        return evaluaciones.stream()
                .mapToDouble(Evaluacion::getNota)
                .average()
                .orElse(0.0);
    }

    @Override
    public Incidencia registrarIncidencia(String profesorId, String descripcion, String fecha) {
        if (profesorId == null) {
            return null;
        }
        String id = profesorId.trim();
        if (id.isBlank() || buscarProfesor(id) == null) {
            return null;
        }
        Incidencia incidencia = new Incidencia(id, descripcion, fecha);
        jsonRepository.saveIncidencia(incidencia);
        return incidencia;
    }

    @Override
    public List<Incidencia> listarIncidenciasDeProfesor(String profesorId) {
        if (profesorId == null) {
            return List.of();
        }
        String id = profesorId.trim();
        if (id.isBlank()) {
            return List.of();
        }
        return jsonRepository.findIncidenciasByProfesorId(id);
    }
}
