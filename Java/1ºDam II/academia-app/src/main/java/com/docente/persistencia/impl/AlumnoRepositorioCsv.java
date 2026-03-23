package com.docente.persistencia.impl;

import com.docente.ficheros.FicheroAbstract;
import com.docente.persistencia.IAlumnoRepositorio;

public class AlumnoRepositorioCsv extends FicheroAbstract implements IAlumnoRepositorio{
    private final static String path = "src/main/resources/alumnos.csv";

    public AlumnoRepositorioCsv(){
        super(path);
    }

}
