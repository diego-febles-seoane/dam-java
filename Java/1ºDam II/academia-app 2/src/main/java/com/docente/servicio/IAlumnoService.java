package com.docente.servicio;

import java.util.List;

import com.docente.modelo.Alumno;

public interface IAlumnoService {

    public List<String> read();

    public boolean crearAlumno(String identificador, String nombre, int edad, String curso);

    public boolean actualizarAlumno(String identificador, String nombre, int edad, String curso);

    public boolean deleteAlumno(String identificador);

    public Alumno buscarAlumno(String identificador);

}
