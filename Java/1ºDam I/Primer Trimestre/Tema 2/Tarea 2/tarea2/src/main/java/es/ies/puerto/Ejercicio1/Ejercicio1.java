package es.ies.puerto.Ejercicio1;

/**
 * Crea un objeto de la clase Persona con nombre __"Juan" y edad 30. Muestra la
 * información de la persona. 
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        // Crear un objeto de la clase Persona
        Persona persona = new Persona("Juan", 30);

        // Mostrar la información de la persona
        persona.mostrarInformacion();
    }
}