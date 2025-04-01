package es.ies.puerto.seis;
import java.util.Objects;
/**
 * Crea una clase Estudiante con atributos privados nombre, matricula y calificacion. 
 * Proporciona getters y setters para acceder a estos valores y un método toString() para mostrar la información.
 * @author emsantamria
 * @version 1.0.0
 */
public class Estudiante {
    private String nombre;
    private String matricula;
    private float calificacion;

    /**
     * Constructor vacio por defecto
     */
    public Estudiante() {
    }

    /**
     * Constructor con todos los atributos
     * @param nombre
     * @param matricula
     * @param calificacion
     */
    public Estudiante(String nombre, String matricula, float calificacion) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.calificacion = calificacion;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getCalificacion() {
        return this.calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public Estudiante nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Estudiante matricula(String matricula) {
        setMatricula(matricula);
        return this;
    }

    public Estudiante calificacion(float calificacion) {
        setCalificacion(calificacion);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Estudiante)) {
            return false;
        }
        Estudiante estudiante = (Estudiante) o;
        return Objects.equals(matricula, estudiante.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, matricula, calificacion);
    }

    @Override
    public String toString() {
        return "{" +
            " Nombre='" + getNombre() + "'" +
            ", Matricula='" + getMatricula() + "'" +
            ", Calificacion='" + getCalificacion() + "'" +
            "}";
    }
    
}
