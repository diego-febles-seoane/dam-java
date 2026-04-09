package com.ejemplo.centro.repository;

import com.ejemplo.centro.model.Modulo;
import com.ejemplo.centro.model.Profesor;
import java.util.List;
import java.util.Optional;

public interface CentroXmlRepository {
    List<Profesor> findAllProfesores();
    List<Modulo> findAllModulos();
    Profesor findProfesorById(String id);
    Modulo findModuloById(String id);
}
