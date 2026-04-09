package com.examen.profesores.service;

import com.examen.profesores.model.Profesor;

import java.util.List;

/**
 * Contrato de logica de negocio para la gestion de profesores.
 */
public interface ProfesorService {

    /**
     * Registra un nuevo profesor.
     *
     * @param id identificador del profesor
     * @param nombre nombre del profesor
     * @param departamento departamento del profesor
     * @return el profesor registrado o null si no cumple las reglas de negocio
     */
    Profesor registrarProfesor(String id, String nombre, String departamento);

    /**
     * Busca un profesor.
     *
     * @param id identificador del profesor
     * @return el profesor encontrado o null si no existe
     */
    Profesor buscarProfesor(String id);

    /**
     * Actualiza el departamento de un profesor.
     *
     * @param id identificador del profesor
     * @param nuevoDepartamento nuevo departamento
     * @return true si se actualiza; false en caso contrario
     */
    boolean actualizarDepartamento(String id, String nuevoDepartamento);

    /**
     * Elimina un profesor.
     *
     * @param id identificador del profesor
     * @return true si se elimina; false en caso contrario
     */
    boolean eliminarProfesor(String id);

    /**
     * Indica si un profesor existe.
     *
     * @param id identificador del profesor
     * @return true si existe; false en caso contrario
     */
    boolean existeProfesor(String id);

    /**
     * Lista todos los profesores.
     *
     * @return listado de profesores
     */
    List<Profesor> listarProfesores();
}
