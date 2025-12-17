package com.docencia.examen.composicion;

import java.util.ArrayList;
import java.util.List;

import com.docencia.examen.herencia.Directivo;
import com.docencia.examen.herencia.Empleado;

//TODO: Completar clase Empresa con las funciones necesarias, y documenta la clase.
public class Empresa {

    private String cif;
    private String nombre;
    private Directivo directorGeneral;
    private List<Empleado> empleados;

    public Empresa(String cif, String nombre, Directivo directorGeneral) {
        this.cif = cif;
        this.nombre = nombre;
        this.directorGeneral = directorGeneral;
        this.empleados = new ArrayList<>();
    }

    public String getCif() {
        return cif;
    }

    public String getNombre() {
        return nombre;
    }

    public Directivo getDirectorGeneral() {
        return directorGeneral;
    }

    // TODO: agrega un empleado a la lista
    public void agregarEmpleado(Empleado e) {
        if (e != null) {
            empleados.add(e);
        }
    }

    // TODO: devuelve el numero de empleados en la lista
    public int getNumeroEmpleados() {
        return empleados.size();
    }

    // TODO: busca un empleado por su identificador y lo devuelve (o null si no lo
    // encuentra)
    public Empleado buscarPorIdentificador(String id) {
        if (id == null)
            return null;
        for (Empleado emp : empleados) {
            if (id.equals(emp.getIdentificador())) {
                return emp;
            }
        }
        return null;
    }

    // TODO: elimina un empleado por su identificador, devuelve true si lo ha
    // eliminado,
    public boolean eliminarPorIdentificador(String id) {
        if (id == null)
            return false;
        return empleados.removeIf(emp -> id.equals(emp.getIdentificador()));
    }

    // TODO: devuelve la lista de empleados
    public List<Empleado> getEmpleados() {
        return new ArrayList<>(empleados);
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "cif='" + cif + '\'' +
                ", nombre='" + nombre + '\'' +
                ", directorGeneral=" + (directorGeneral != null ? directorGeneral.getNombre() : "N/A") +
                ", numeroEmpleados=" + getNumeroEmpleados() +
                '}';
    }

}
