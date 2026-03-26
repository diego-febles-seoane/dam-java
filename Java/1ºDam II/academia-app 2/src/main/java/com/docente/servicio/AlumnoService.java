package com.docente.servicio;

import java.util.ArrayList;
import java.util.List;

import com.docente.modelo.Alumno;
import com.docente.persistencia.IAlumnoRepositorio;
import com.docente.persistencia.impl.AlumnoRepositorioCSV;
import com.docente.validacion.Validaciones;

public class AlumnoService implements IAlumnoService{

    final IAlumnoRepositorio alumnoRepositorio;
    List<Alumno> alumnos;
    
    public AlumnoService() {
        this.alumnoRepositorio = new AlumnoRepositorioCSV();
        alumnos = alumnoRepositorio.obtenerAlumnos();
    }

    /**
     * Funcion que retorna la lista de alumnos en formato String
     * @return
     */
    public List<String> read() {
        List<String> alumnosStr = new ArrayList<>();
        for (Alumno alumno : alumnos) {
            alumnosStr.add(alumno.toString());
        }
        return alumnosStr;
    }

    public boolean updateLista() {
        alumnoRepositorio.guardarAlumnos(alumnos);
        return true;
    }

    public boolean crearAlumno(String identificador, String nombre, int edad, String curso) {
        // validaInformacion
        Validaciones.esIdentificadorValido(identificador);
        Validaciones.esNombreValido(nombre);
        Validaciones.esEdadValida(edad);
        Validaciones.esCursoValido(curso);
        
        //crea el elemento Alumno
        Alumno alumnoNuevo = new Alumno(identificador, nombre, edad, curso);
        if (alumnos.contains(alumnoNuevo)) {
            return false;
        }
        // añade el alumno a la lista
        alumnos.add(alumnoNuevo);
        // guarda la lista en el fichero
        return updateLista();
    }

    public boolean actualizarAlumno(String identificador, String nombre, int edad, String curso) {
        // validaInformacion
        Validaciones.esIdentificadorValido(identificador);
        Validaciones.esNombreValido(nombre);
        Validaciones.esEdadValida(edad);
        Validaciones.esCursoValido(curso);
        
        //crea el elemento Alumno
        Alumno alumnoNuevo = new Alumno(identificador, nombre, edad, curso);
        if (!alumnos.contains(alumnoNuevo)) {
            return false;
        }
        int posicion = alumnos.indexOf(alumnoNuevo);
        // actualizar el alumno a la lista
        alumnos.set(posicion, alumnoNuevo);
        // guarda la lista en el fichero
        return updateLista();
    }

    public boolean deleteAlumno(String indentificador) {
        // validaInformacion
        Validaciones.esIdentificadorValido(indentificador);
        
        //crea el elemento Alumno
        Alumno alumnoNuevo = new Alumno(indentificador);
        if (!alumnos.contains(alumnoNuevo)) {
            return false;
        }
        int posicion = alumnos.indexOf(alumnoNuevo);
        // actualizar el alumno a la lista
        alumnos.remove(posicion);
        // guarda la lista en el fichero
        return updateLista();
    }

    @Override
    public Alumno buscarAlumno(String identificador) {
        Validaciones.esIdentificadorValido(identificador);
        Alumno alumnoBuscar = new Alumno (identificador);
        int indice = alumnos.indexOf(alumnoBuscar);
        if (indice < 0){
            return null;
        }
        return alumnos.get(indice);
    }

}
