package com.docencia.composicion.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class AgendaContactos {
    private final List<Contacto> contactos = new ArrayList<>();

    /**
     * TODO: Implementar según enunciado/tests.
     */
    public void anadirContacto(String nombre, String telefono) {
        if (nombre != null && !nombre.trim().isEmpty() && telefono != null && !telefono.trim().isEmpty()) {
            contactos.add(new Contacto(nombre.trim(), telefono.trim()));
        }
    }

    /**
     * TODO: Implementar según enunciado/tests.
     */
    public String buscarTelefono(String nombre) {
        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre.trim())) {
                return c.getTelefono();
            }
        }
        return null;
    }

    public List<Contacto> getContactos() {
        return new ArrayList<>(contactos);
    }
}
