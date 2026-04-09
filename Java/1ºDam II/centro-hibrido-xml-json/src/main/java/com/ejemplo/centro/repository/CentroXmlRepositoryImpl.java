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

    public CentroXmlRepositoryImpl(Path xmlPath) {
        this(xmlPath, new XmlManager());
    }

    public CentroXmlRepositoryImpl(Path xmlPath, XmlManager xmlManager) {
        this.xmlPath = xmlPath;
        this.xmlManager = xmlManager;
    }

    @Override
    public List<Profesor> findAllProfesores() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAllProfesores'");
    }

    @Override
    public List<Modulo> findAllModulos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAllModulos'");
    }

    @Override
    public Profesor findProfesorById(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findProfesorById'");
    }

    @Override
    public Modulo findModuloById(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findModuloById'");
    }

    
}
