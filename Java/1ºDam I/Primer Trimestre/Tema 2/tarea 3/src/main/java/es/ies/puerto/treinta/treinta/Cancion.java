package es.ies.puerto.treinta.treinta;
import java.util.Objects;

public class Cancion {
    private String nombre;
    private String artista;
    private double duracion;

    public Cancion() {
    }

    public Cancion(String nombre, String artista, double duracion) {
        this.nombre = nombre;
        this.artista = artista;
        this.duracion = duracion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return this.artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public double getDuracion() {
        return this.duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public Cancion nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Cancion artista(String artista) {
        setArtista(artista);
        return this;
    }

    public Cancion duracion(double duracion) {
        setDuracion(duracion);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Cancion)) {
            return false;
        }
        Cancion cancion = (Cancion) o;
        return Objects.equals(nombre, cancion.nombre) && Objects.equals(artista, cancion.artista) && duracion == cancion.duracion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, artista, duracion);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + nombre + "'" +
            ", artista='" + artista + "'" +
            ", duracion='" + duracion + "'" +
            "}";
    }
    
}
