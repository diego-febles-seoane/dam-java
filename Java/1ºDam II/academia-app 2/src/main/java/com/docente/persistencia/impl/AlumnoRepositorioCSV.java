package com.docente.persistencia.impl;

import java.util.List;

import com.docente.ficheros.FicheroAbstract;
import com.docente.modelo.Alumno;
import com.docente.persistencia.IAlumnoRepositorio;

public class AlumnoRepositorioCSV extends FicheroAbstract implements IAlumnoRepositorio{
    private static String path = "src/main/resources/alumnos.csv";

    public AlumnoRepositorioCSV() {
        super(path);
    }

    @Override
    public List<Alumno> obtenerAlumnos() {
        return read();
    }
    
    @Override
    public boolean guardarAlumnos(List<Alumno> alumnos) {
        updateFichero(alumnos);
        return true;
    }
    
}
