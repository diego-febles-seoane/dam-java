package com.ejemplo.centro.repository;

import com.ejemplo.centro.model.CentroData;
import com.ejemplo.centro.model.Modulo;
import com.ejemplo.centro.model.Profesor;
import com.ejemplo.centro.util.XmlManager;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CentroXmlRepositoryImpl implements CentroXmlRepository {
    private final Path xmlPath;
    private final XmlManager xmlManager;
    private CentroData centroData;

    public CentroXmlRepositoryImpl(Path xmlPath) {
        this(xmlPath, new XmlManager());
    }

    public CentroXmlRepositoryImpl(Path xmlPath, XmlManager xmlManager) {
        this.xmlPath = xmlPath;
        this.xmlManager = xmlManager;
        this.centroData = xmlManager.read(xmlPath);
    }

    @Override
    public List<Profesor> findAllProfesores() {
        return new ArrayList<>(centroData.getProfesores());
    }

    @Override
    public List<Modulo> findAllModulos() {
        return new ArrayList<>(centroData.getModulos());
    }

    @Override
    public Profesor findProfesorById(String id) {
        return centroData.getProfesores().stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Modulo findModuloById(String id) {
        return centroData.getModulos().stream()
                .filter(m -> m.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
