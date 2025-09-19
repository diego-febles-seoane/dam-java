package es.ies.puerto.diecinueve;

import java.util.ArrayList;
import java.util.List;

/**
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Ejercicio19 {
    
    static List<Persona> personas = new ArrayList<>();
public static void main(String[] args) {
    
    personas.add(new Persona("Juan", 25, "12345678A"));
    personas.add(new Persona("Maria", 30, "87654321B"));
    personas.add(new Persona("Federico", 28, "8400893L"));
    personas.add(new Persona("Maria Alberta", 78, "78947290P"));
    personas.add(new Persona("Juan Luis", 25, "2685678M"));

        for (Persona persona : personas) {
            System.out.println(persona);
        }
        String dni = "8400893L";
        Persona personaBuscar = new Persona(dni);
        int posicion = personas.indexOf(personaBuscar);
        if (posicion>0){
            System.out.println("La Persona esta en la lista: \n" + personas.get(posicion));
        }
    }
    public static Persona buscar(String dni){
        if(personas == null || personas.isEmpty()){
            return null;
        }
        return null;

    }

}