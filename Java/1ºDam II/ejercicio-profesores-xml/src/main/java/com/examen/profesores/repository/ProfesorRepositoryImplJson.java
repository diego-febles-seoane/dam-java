package com.examen.profesores.repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import com.examen.profesores.model.Profesor;
import com.examen.profesores.model.Profesores;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class ProfesorRepositoryImplJson implements ProfesorRepository {
    private final ObjectMapper objectMapper;
    Path path;
    List<Profesor> profesores;

    public ProfesorRepositoryImplJson(){
        this.objectMapper = new ObjectMapper();
        this.objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        this.path = Path.of("data", "profesores.json");
        profesores = read().getProfesores();
    }

    @Override
    public boolean save(Profesor profesor) {
        profesores.add(profesor);
        return true;
    }

    @Override
    public Profesor findById(String id) {
        Profesor profesorBuscar = new Profesor(id);
        int posicion = profesores.indexOf(profesorBuscar);
        if(posicion < 0){
            return null;
        }
        return profesores.get(posicion);
    }

    @Override
    public List<Profesor> findAll() {
        return profesores;
    }

    @Override
    public boolean existsById(String id) {
        Profesor profesorBuscar = new Profesor(id);
        return profesores.contains(profesorBuscar);
    }

    @Override
    public boolean deleteById(String id) {
        Profesor profesorBuscar = new Profesor(id);
        int posicion = profesores.indexOf(profesorBuscar);
        if(posicion < 0){
            return false;
        }
        profesores.remove(profesorBuscar);
        return write();
    }

    @Override
    public boolean updateDepartamento(String id, String nuevoDepartamento) {
        Profesor profesorComparar = new Profesor(id);
        for (Profesor profesor : profesores) {
            if (profesor.equals(profesorComparar)) {
                profesor.setDepartamento(nuevoDepartamento);
                return write();
            }
        }
        return false;
    }

    /**
     * Funcion que de todos los elementos del fichero Json
     * @return lista de profesores
     */
    private Profesores read() {
        try {
            if (Files.notExists(path) || Files.size(path) == 0) {
                return new Profesores();
            }
            return objectMapper.readValue(path.toFile(), Profesores.class);
        } catch (IOException e) {
            throw new IllegalStateException("No se pudo leer el Json", e);
        }
    }

    /**
     * Funcion que almacena los elementos en ficheros Json
     */
    private boolean write() {
        try {
            if (path.getParent() != null) {
                Files.createDirectories(path.getParent());
            }
            objectMapper.writeValue(path.toFile(), profesores);
            return true;
        } catch (IOException e) {
            throw new IllegalStateException("No se pudo escribir el Json", e);
        }
    }

    

}
