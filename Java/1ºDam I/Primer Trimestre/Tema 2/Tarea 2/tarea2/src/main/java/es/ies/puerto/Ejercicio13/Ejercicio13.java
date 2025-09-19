package es.ies.puerto.Ejercicio13;

/**
 * Crea un objeto de la clase Alumno con nombre "Lucía" y nota 7. Determina si
 * el alumno ha aprobado.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("Lucía", 7);

        alumno.mostrarInformacion();
        alumno.calificacion(7);
    }
}
