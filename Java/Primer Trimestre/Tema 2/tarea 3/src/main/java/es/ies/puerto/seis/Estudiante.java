package es.ies.puerto.seis;
/**
 * Crea una clase Estudiante con atributos privados nombre, matricula y calificacion. Proporciona getters y setters para acceder a estos valores y un método toString() para mostrar la información.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Estudiante {
    private String nombre;
    private String matricula;
    private float calificacion;

    /**
     * Constructor por defecto
     */
    public Estudiante(){
    }

    public Estudiante(String nombre, String matricula, float calificacion) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.calificacion = calificacion;
    }

    /**
     * Creamos los getters y setters
     */


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

    @Override
    public String toString() {
        return "Estudiante {" +
                "nombre='" + nombre + '\'' +
                ", matricula='" + matricula + '\'' +
                ", calificacion=" + calificacion +
                '}';
    }
}
