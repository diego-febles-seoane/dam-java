package com.docencia.composicion.ejercicio5;


import java.util.ArrayList;
import java.util.List;


public class AgendaContactos {
    private final List<Contacto> contactos = new ArrayList<>();

    /**
     * TODO: Implementar según enunciado/tests.
     */
    public void anadirContacto(String nombre, String telefono) {
        // provisional: añade siempre
        contactos.add(new Contacto(nombre, telefono));
    }

    /**
     * TODO: Implementar según enunciado/tests.
     */
    public String buscarTelefono(String nombre) {
        // provisional: siempre null
        return null;
    }

    public List<Contacto> getContactos() {
        return new ArrayList<>(contactos);
    }
}
