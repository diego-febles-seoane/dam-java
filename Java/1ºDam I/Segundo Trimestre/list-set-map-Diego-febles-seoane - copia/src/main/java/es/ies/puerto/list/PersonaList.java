package es.ies.puerto.list;

import java.util.ArrayList;
import java.util.List;

import javax.lang.model.util.ElementScanner14;

import es.ies.puerto.Persona;

public class PersonaList {

    private List<Persona> personas;

    public PersonaList() {
        this.personas = new ArrayList<>();
    }

    public boolean agregar(Persona persona) {
        if (!personas.contains(persona)){
            return personas.add(persona);
        } else {
            return false;
        }
    }

    public List<Persona> listar() {
        return new ArrayList<>(personas);
    }

    public Persona buscar(String dni) {
        Persona personaBuscada = new Persona(dni);
        int posicion = personas.indexOf(personaBuscada);
        if (posicion < 0){
            return null;
        } else {
            return personas.get(posicion);
        }
    }

    public boolean actualizar(String dni, Persona nuevaPersona) {
        Persona personaBuscar = new Persona(dni);
        int posicion = personas.indexOf(personaBuscar);
        if (posicion < 0){
            return false;
        } else {
            personas.set(posicion, nuevaPersona);
            return true;
        }
    }

    public boolean eliminar(String dni) {
        Persona personaEliminada = new Persona(dni);
        return personas.remove(personaEliminada);
    }
    
}
