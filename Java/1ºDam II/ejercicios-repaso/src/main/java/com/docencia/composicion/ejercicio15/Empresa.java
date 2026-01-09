package com.docencia.composicion.ejercicio15;


import java.util.ArrayList;
import java.util.List;


public class Empresa {
    private final List<Departamento> departamentos = new ArrayList<>();

    public Departamento crearDepartamento(String nombre) {
        // TODO: validar nombre y crear departamento.
        if (nombre == null) {
            return null;
        }
        Departamento d = new Departamento(nombre);
        departamentos.add(d);
        return d;
    }

    public boolean anadirTrabajador(String nombreDepartamento, String nombreTrabajador, double salario) {
        // TODO: implementar según enunciado/tests.
        return false;
    }

    public double salarioMedioDepartamento(String nombreDepartamento) {
        // TODO: calcular salario medio; 0.0 si no existe o sin trabajadores.
        return 0.0;
    }

    public double salarioTotalEmpresa() {
        // TODO: sumar todos los salarios.
        return 0.0;
    }

    public List<Departamento> getDepartamentos() {
        return new ArrayList<>(departamentos);
    }
}
