package es.ies.puerto.treinta.uno;
import java.util.Objects;
/**
 * Crea una clase Pelicula con atributos titulo, director, y duracion. 
 * Implementa métodos para comparar películas por duración con equals() y usar toString() para mostrar detalles.
 * @author emsantamaria
 * @version 1.0.0
 */
public class Pelicula {
    private String titulo;
    private String director;
    private float duracion;
    /**
     * Constructor por defecto
     */
    public Pelicula() {
    }
    /**
     * Constructor con parámetros
     * @param titulo título de la película
     * @param director director de la película
     * @param duracion duracion de la película
     */
    public Pelicula(String titulo, String director, float duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public float getDuracion() {
        return this.duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public Pelicula titulo(String titulo) {
        setTitulo(titulo);
        return this;
    }

    public Pelicula director(String director) {
        setDirector(director);
        return this;
    }

    public Pelicula duracion(float duracion) {
        setDuracion(duracion);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pelicula)) {
            return false;
        }
        Pelicula pelicula = (Pelicula) o;
        return duracion == pelicula.duracion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, director, duracion);
    }

    @Override
    public String toString() {
        return "{" +
            " Titulo:'" + getTitulo() + "'" +
            ", Director:'" + getDirector() + "'" +
            ", Duracion:'" + getDuracion() + "'" +
            "}";
    }
    
}
