package com.examen.profesores.repository;

import com.examen.profesores.model.Profesor;

import java.util.List;

/**
 * Contrato de persistencia para el acceso a datos de profesores.
 */
public interface ProfesorRepository {

    /**
     * Guarda un profesor en el repositorio.
     *
     * @param profesor profesor a guardar
     * @return true si se guarda; false si ya existia
     */
    boolean save(Profesor profesor);

    /**
     * Busca un profesor por su identificador.
     *
     * @param id identificador del profesor
     * @return el profesor encontrado o null si no existe
     */
    Profesor findById(String id);

    /**
     * Recupera todos los profesores persistidos.
     *
     * @return listado completo de profesores
     */
    List<Profesor> findAll();

    /**
     * Comprueba si existe un profesor con el identificador indicado.
     *
     * @param id identificador a comprobar
     * @return true si existe; false en caso contrario
     */
    boolean existsById(String id);

    /**
     * Elimina un profesor por identificador.
     *
     * @param id identificador del profesor
     * @return true si se elimina; false si no existe
     */
    boolean deleteById(String id);

    /**
     * Actualiza el departamento de un profesor.
     *
     * @param id identificador del profesor
     * @param nuevoDepartamento nuevo departamento
     * @return true si se actualiza; false si no existe
     */
    boolean updateDepartamento(String id, String nuevoDepartamento);
}
