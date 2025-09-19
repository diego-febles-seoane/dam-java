package es.ies.puerto.cuarenta.uno;
import es.ies.puerto.seis.Estudiante;

/**
 * Crea una clase Colegio que almacene una lista (array) de estudiantes. Implementa métodos para agregar y eliminar estudiantes, y usa toString() para mostrar los detalles del colegio.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Colegio {
    private Estudiante[] estudiantes;
    private int tamanio;

    /**
     * Constructor vacio
     */
    public Colegio() {
    }

    /**
     * Constructor completo
     * @param tamanio
     */
    public Colegio( int tamanio) {
        this.estudiantes = new Estudiante[tamanio];
        this.tamanio = tamanio;
    }

    /*
     * Agregamos Getters y Setters
     */
    public Estudiante[] getEstudiantees() {
        return this.estudiantes;
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public int getTamanio() {
        return this.tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    /**
     * Metodo que agrega un estudiante a la lista
     * @param estudiante
     */
    public void agregarEstudiante(Estudiante estudiante)
    {
        int i = 0 ;
        boolean buscar = true;
        while (buscar)
        {
            if (estudiantes[i] == null )
            {
                estudiantes[i] = estudiante;
                buscar = false;
            }
            i++;
        }
    }

    /**
     * Metodo que elimina una estudiante de la lista
     */
    public void eliminarEstudiante(Estudiante estudiante)
    {
        int i = estudiantes.length - 1;
        boolean buscar = true;
        while (buscar)
        {
            if ( estudiantes[i].equals(estudiante) )
            {
                estudiantes[i] = null;
                buscar = false;
            }
            i--;
        }
    }

    @Override
    public String toString() {
        String mensaje = "estudiantes: ";
        for (Estudiante estudiante : estudiantes) {
            if (estudiante != null) {
                mensaje += estudiante;
            }
        }
        return mensaje;
    }
}
