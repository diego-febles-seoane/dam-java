
package com.docencia.listas.ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

import com.docencia.herencia.ejercicio3.Empleado;

/**
 * @author Héctor
 * @version 1.0.0
 */
/**
 * Gestiona una lista de {@link Empleado} usando {@link java.util.ArrayList}.
 *
 * Reglas:
 * - No se permiten elementos nulos.
 * - No se permiten empleados con nombre nulo o en blanco.
 * - No se permiten salarios base negativos.
 * - No se permiten ids nulos ni duplicados dentro de la lista.
 */
public class ListaEmpleados {

    private final List<Empleado> empleados = new ArrayList<>();

    public void anadir(Empleado empleado) {
        validar(empleado);
        if (empleados.contains(buscarPorId(empleado.getId()))) {
            throw new IllegalArgumentException();
        }
        empleados.add(empleado);
    }

    public Empleado buscarPorId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException("Id no puede ser null");
        }
        for (Empleado empleado : empleados) {
            if (empleado.getId().equals(id)) {
                return empleado;
            }
        }
        return null;
    }

    public boolean eliminarPorId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException("El id no puede ser null");
        }
        return empleados.removeIf(empleado -> empleado.getId().equals(id));
    }

    public void modificar(UUID id, Empleado nuevoEmpleado) {

        validar(nuevoEmpleado);
        Empleado existente = buscarPorId(id);

        if (existente == null) {
            throw new NoSuchElementException();
        }
        if (!id.equals(nuevoEmpleado.getId())) {
            throw new IllegalArgumentException();
        }

        int indice = empleados.indexOf(existente);
        empleados.set(indice, nuevoEmpleado);
    }

    public List<Empleado> listar() {
        return List.copyOf(empleados);
    }

    public int tamanio() {
        return empleados.size();
    }

    private boolean existeId(UUID id) {
        return empleados.stream().anyMatch(e -> e.getId().equals(id));
    }

    private void validar(Empleado empleado) {
        if (empleado == null) {
            throw new IllegalArgumentException("El empleado no puede ser nulo");
        }
        if (empleado.getId() == null) {
            throw new IllegalArgumentException("El id no puede ser nulo");
        }
        if (empleado.getNombre() == null || empleado.getNombre().isBlank()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o en blanco");
        }
        if (empleado.getSalarioBase() < 0) {
            throw new IllegalArgumentException("El salario base no puede ser negativo");
        }
    }
}
