package com.docencia.composicion.ejercicio8;


import java.util.ArrayList;
import java.util.List;


public class RegistroClase {
    private final List<RegistroAsistencia> registros = new ArrayList<>();

    public void registrarAsistencia(String nombreAlumno, String dia, boolean presente) {
        // TODO: validar nombreAlumno y dia antes de registrar.
        if (nombreAlumno != null && dia != null) {
            registros.add(new RegistroAsistencia(new Alumno(nombreAlumno), dia, presente));
        }
    }

    public double porcentajeAsistencia(String nombreAlumno) {
        // TODO: calcular porcentaje para el alumno indicado.
        return 0.0;
    }

    public List<RegistroAsistencia> getRegistros() {
        return new ArrayList<>(registros);
    }
}
