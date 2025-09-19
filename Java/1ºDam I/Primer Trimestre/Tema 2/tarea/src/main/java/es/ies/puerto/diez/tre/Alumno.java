package es.ies.puerto.diez.tre;
import java.util.Objects;
/**
 * Crea una clase Alumno con los atributos nombre, notaMatematicas, notaCiencias y notaProgramacion. 
 * Implementa un método promedio() y usa equals() para comparar alumnos por sus notas.
 * @author emsantamaria
 * @version 1.0.0
 */
public class Alumno {
    private String nombre;
    private float notaCiencias;
    private float notaMatematicas;
    private float notaProgramacion;

    /**
     * Constructor por defecto
     */
    public Alumno() {

    }

    /**
     * Constructor con parámetros
     * @param notaProgramacion
     * @param notaCiencias
     * @param notaMatematicas
     * @param nombre
     */
    public Alumno(String nombre, float notaCiencias, float notaMatematicas, float notaProgramacion) {
        this.nombre = nombre;
        this.notaCiencias = notaCiencias;
        this.notaMatematicas = notaMatematicas;
        this.notaProgramacion = notaProgramacion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNotaCiencias() {
        return this.notaCiencias;
    }

    public void setNotaCiencias(float notaCiencias) {
        this.notaCiencias = notaCiencias;
    }

    public float getNotaMatematicas() {
        return this.notaMatematicas;
    }

    public void setNotaMatematicas(float notaMatematicas) {
        this.notaMatematicas = notaMatematicas;
    }

    public float getNotaProgramacion() {
        return this.notaProgramacion;
    }

    public void setNotaProgramacion(float notaProgramacion) {
        this.notaProgramacion = notaProgramacion;
    }

    public Alumno nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Alumno notaCiencias(float notaCiencias) {
        setNotaCiencias(notaCiencias);
        return this;
    }

    public Alumno notaMatematicas(float notaMatematicas) {
        setNotaMatematicas(notaMatematicas);
        return this;
    }

    public Alumno notaProgramacion(float notaProgramacion) {
        setNotaProgramacion(notaProgramacion);
        return this;
    }
    /**
     * Metdodo para calcular el promedio de las notas
     * @param promedio
     */
    public float promedio() {
        return(notaCiencias +notaMatematicas + notaProgramacion)/3 ;
    }
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Alumno)) {
            return false;
        }
        Alumno alumno = (Alumno) o;
        return notaCiencias == alumno.notaCiencias && notaMatematicas == alumno.notaMatematicas && notaProgramacion == alumno.notaProgramacion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, notaCiencias, notaMatematicas, notaProgramacion);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", notaCiencias='" + getNotaCiencias() + "'" +
            ", notaMatematicas='" + getNotaMatematicas() + "'" +
            ", notaProgramacion='" + getNotaProgramacion() + "'" +
            "}";
    }
    
}
