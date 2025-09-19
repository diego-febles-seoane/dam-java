package es.ies.puerto.Ejercicio14;

import es.ies.puerto.Ejercicio13.Alumno;

/**
 * Crea un objeto de la clase Alumno con nombre "Jorge" y nota 11. Asegúrate de
 * que la nota no pueda ser mayor que 10 ni menor que 0.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("Jorge", 11);

        alumno.mostrarInformacion();
        alumno.verificacion(11);
    }
}
