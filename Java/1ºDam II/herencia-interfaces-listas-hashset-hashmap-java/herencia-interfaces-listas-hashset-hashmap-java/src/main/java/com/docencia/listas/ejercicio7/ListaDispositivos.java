package com.docencia.listas.ejercicio7;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

import com.docencia.herencia.ejercicio7.Dispositivo;

/**
 * @author Héctor
 * @version 1.0.0
 */
/**
 * Gestiona una lista de {@link Dispositivo} usando {@link java.util.ArrayList}.
 *
 * Reglas:
 * - No se permiten elementos nulos.
 * - No se permiten dispositivos con fabricante nulo o en blanco.
 * - No se permiten ids nulos ni duplicados dentro de la lista.
 */
public class ListaDispositivos {

    private final List<Dispositivo> dispositivos = new ArrayList<>();

    public void anadir(Dispositivo dispositivo) {
        validar(dispositivo);
        if (existeId(dispositivo.getId())) {
            throw new IllegalArgumentException("EL dispositivo ya existe");
        }
        dispositivos.add(dispositivo);
    }

    public Dispositivo buscarPorId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException("El id no puede ser null");
        }
        for (Dispositivo dispositivo : dispositivos) {
            if (dispositivo.getId().equals(id)) {
                return dispositivo;
            }
        }
        return null;
    }

    public boolean eliminarPorId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException("El id no puede ser nulo");
        }
        return dispositivos.removeIf(dispositivo -> dispositivo.getId().equals(id));
    }

    public void modificar(UUID id, Dispositivo nuevoDispositivo) {

        validar(nuevoDispositivo);
        Dispositivo existente = buscarPorId(id);
        if (existente == null) {
            throw new NoSuchElementException("No existe el elemento");
        }
        if (!id.equals(nuevoDispositivo.getId())) {
            throw new IllegalArgumentException("El id debe ser el mismo");
        }
        int indice = dispositivos.indexOf(existente);
        dispositivos.set(indice, nuevoDispositivo);
    }

    public List<Dispositivo> listar() {
        return List.copyOf(dispositivos);
    }

    public int tamanio() {
        return dispositivos.size();
    }

    private boolean existeId(UUID id) {
        return dispositivos.stream().anyMatch(d -> d.getId().equals(id));
    }

    private void validar(Dispositivo dispositivo) {
        if (dispositivo == null) {
            throw new IllegalArgumentException("El dispositivo no puede ser nulo");
        }
        if (dispositivo.getId() == null) {
            throw new IllegalArgumentException("El id no puede ser nulo");
        }
        if (dispositivo.getFabricante() == null || dispositivo.getFabricante().isBlank()) {
            throw new IllegalArgumentException("El fabricante no puede ser nulo o en blanco");
        }
    }
}
