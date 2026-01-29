package com.docencia.listas.ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

import com.docencia.herencia.ejercicio2.Vehiculo;

/**
 * @author Héctor
 * @version 1.0.0
 */
/**
 * Gestiona una lista de {@link Vehiculo} usando {@link java.util.ArrayList}.
 *
 * Reglas:
 * - No se permiten elementos nulos.
 * - No se permiten vehiculos con marca/modelo nulos o en blanco.
 * - No se permiten ids nulos ni duplicados dentro de la lista.
 */
public class ListaVehiculos {

    private final List<Vehiculo> vehiculos = new ArrayList<>();

    public void anadir(Vehiculo vehiculo) {
        validar(vehiculo);
        if (vehiculos.contains(buscarPorId(vehiculo.getId()))) {
            throw new IllegalArgumentException();
        }
        vehiculos.add(vehiculo);
    }

    /**
     * Busca un vehiculo por id
     * 
     * @param id
     * @return
     */
    public Vehiculo buscarPorId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException("Id no puede ser null");
        }

        for (int i = 0; i < vehiculos.size(); i++) {
            if (vehiculos.get(i).getId().equals(id)) {
                return vehiculos.get(i);
            }
        }
        return null;
    }

    public boolean eliminarPorId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException("Id no puede ser null");
        }
        return vehiculos.removeIf(vehiculo -> vehiculo.getId().equals(id));
    }

    public void modificar(UUID id, Vehiculo nuevoVehiculo) {
        validar(nuevoVehiculo);
        Vehiculo existe = buscarPorId(id);
        if (existe == null) {
            throw new NoSuchElementException("El vehiculo no existe");
        }
        if (!id.equals(nuevoVehiculo.getId())) {
            throw new IllegalArgumentException("El id de la persona no puede ser igual");
        }
        int indice = vehiculos.indexOf(existe);
        vehiculos.set(indice, nuevoVehiculo);
    }

    public List<Vehiculo> listar() {
        return List.copyOf(vehiculos);
    }

    public int tamanio() {
        return vehiculos.size();
    }

    private boolean existeId(UUID id) {
        return vehiculos.stream().anyMatch(v -> v.getId().equals(id));
    }

    private void validar(Vehiculo vehiculo) {
        if (vehiculo == null) {
            throw new IllegalArgumentException("El vehiculo no puede ser nulo");
        }
        if (vehiculo.getId() == null) {
            throw new IllegalArgumentException("El id no puede ser nulo");
        }
        if (vehiculo.getMarca() == null || vehiculo.getMarca().isBlank()) {
            throw new IllegalArgumentException("La marca no puede ser nula o en blanco");
        }
        if (vehiculo.getModelo() == null || vehiculo.getModelo().isBlank()) {
            throw new IllegalArgumentException("El modelo no puede ser nulo o en blanco");
        }
    }
}
