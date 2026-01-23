package com.docencia.listas.ejercicio10;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

import com.docencia.herencia.ejercicio10.Documento;

/**
 * @author Héctor
 * @version 1.0.0
 */

/**
 * Gestiona una lista de {@link Documento} usando {@link java.util.ArrayList}.
 *
 * Reglas:
 * - No se permiten elementos nulos.
 * - No se permiten documentos con titulo nulo o en blanco.
 * - No se permiten ids nulos ni duplicados dentro de la lista.
 */
public class ListaDocumentos {

    private final List<Documento> documentos = new ArrayList<>();

    public void anadir(Documento documento) {
        validar(documento);
        if (documentos.contains(buscarPorId(documento.getId()))) {
            throw new IllegalArgumentException();
        }
        documentos.add(documento);
    }

    public Documento buscarPorId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException();
        }
        for (Documento documento : documentos) {
            if (documento.getId().equals(id)) {
                return documento;
            }
        }
        return null;
    }

    public boolean eliminarPorId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException();
        }
        return documentos.removeIf(doc -> doc.getId().equals(id));
    }

    public void modificar(UUID id, Documento nuevoDocumento) {
        validar(nuevoDocumento);
        Documento existente = buscarPorId(id);
        if (existente == null) {
            throw new NoSuchElementException();
        }
        if (!id.equals(nuevoDocumento.getId())) {
            throw new IllegalArgumentException();
        }
        int indice = documentos.indexOf(existente);
        documentos.set(indice, nuevoDocumento);
    }

    public List<Documento> listar() {
        return List.copyOf(documentos);
    }

    public int tamanio() {
        return documentos.size();
    }

    private boolean existeId(UUID id) {
        return documentos.stream().anyMatch(d -> d.getId().equals(id));
    }

    private void validar(Documento documento) {
        if (documento == null) {
            throw new IllegalArgumentException("El documento no puede ser nulo");
        }
        if (documento.getId() == null) {
            throw new IllegalArgumentException("El id no puede ser nulo");
        }
        if (documento.getTitulo() == null || documento.getTitulo().isBlank()) {
            throw new IllegalArgumentException("El titulo no puede ser nulo o en blanco");
        }
    }
}
