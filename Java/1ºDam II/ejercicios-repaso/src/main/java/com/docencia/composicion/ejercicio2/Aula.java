package com.docencia.composicion.ejercicio2;


import java.util.ArrayList;
import java.util.List;


public class Aula {
    private final List<RegistroNota> registros = new ArrayList<>();

    public void registrarNota(String nombreAlumno, String asignatura, double nota) {
        // TODO: validar campos y rango de nota según enunciado.
        if (nombreAlumno != null && asignatura != null) {
            registros.add(new RegistroNota(new Alumno(nombreAlumno), asignatura, nota));
        }
    }

    public double mediaAlumno(String nombreAlumno) {
        // TODO: calcular media ignorando mayúsculas/minúsculas; 0.0 si no hay notas válidas.
        return 0.0;
    }

    public List<RegistroNota> getRegistros() {
        return new ArrayList<>(registros);
    }
}
