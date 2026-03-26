package com.docente.persistencia;

import java.util.List;

import com.docente.modelo.Alumno;

public interface IAlumnoRepositorio {

    /**
     * Funcion que obtiene todos los alumnos del repositorio
     * @return Lista de alumnos
     * */
    List<Alumno> obtenerAlumnos();

    boolean guardarAlumnos(List<Alumno> alumnos);

}
