package com.examen.profesores.repository;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import com.examen.profesores.model.Profesor;
import com.examen.profesores.model.Profesores;
import com.examen.profesores.util.XmlManager;

public class ProfesorRepositoryImpl implements ProfesorRepository {

    private final Path xmlPath;
    private final XmlManager xmlManager;
    private final Profesores wrapper;

    public ProfesorRepositoryImpl() {
        this(Path.of("data", "profesores.xml"), new XmlManager());
    }

    public ProfesorRepositoryImpl(Path xmlPath) {
        this(xmlPath, new XmlManager());
    }

    public ProfesorRepositoryImpl(Path xmlPath, XmlManager xmlManager) {
        this.xmlPath = xmlPath;
        this.xmlManager = xmlManager;
        this.wrapper = readAllWrapper();
    }

    @Override
    public boolean save(Profesor profesor) {
        Profesores wrapper = readAllWrapper();
        if (wrapper.getProfesores().stream().anyMatch(p -> p.getId().equals(profesor.getId()))) {
            return false;
        }
        wrapper.getProfesores().add(profesor);
        writeAllWrapper(wrapper);
        return true;
    }

    @Override
    public Profesor findById(String id) {
        if(id == null|| id.isEmpty()){
            return null;
        }
        Profesor profesorBuscar = new Profesor(id);

        int indice = readAllWrapper().getProfesores().indexOf(profesorBuscar);
        if(indice < 0){
            return null;
        }

        return readAllWrapper().getProfesores().get(indice);
        /** 
        return readAllWrapper().getProfesores().stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
                */
    }

    @Override
    public List<Profesor> findAll() {
        return new ArrayList<>(readAllWrapper().getProfesores());
    }

    @Override
    public boolean existsById(String id) {
        return findById(id) != null;
    }

    @Override
    public boolean deleteById(String id) {
        Profesores wrapper = readAllWrapper();
        boolean removed = wrapper.getProfesores().removeIf(p -> p.getId().equals(id));
        if (removed) {
            writeAllWrapper(wrapper);
        }
        return removed;
    }

    @Override
    public boolean updateDepartamento(String id, String nuevoDepartamento) {
        Profesores wrapper = readAllWrapper();
        for (Profesor profesor : wrapper.getProfesores()) {
            if (profesor.getId().equals(id)) {
                profesor.setDepartamento(nuevoDepartamento);
                writeAllWrapper(wrapper);
                return true;
            }
        }
        return false;
    }

    private Profesores readAllWrapper() {
        Profesores profesores = xmlManager.read(xmlPath);
        if (profesores.getProfesores() == null) {
            profesores.setProfesores(new ArrayList<>());
        }
        return profesores;
    }

    private void writeAllWrapper(Profesores profesores) {
        xmlManager.write(xmlPath, profesores);
    }
}
