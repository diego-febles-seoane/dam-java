package es.ies.puerto.treinta.ocho;
import java.util.Objects;

public class Jugador {
    private String nombre;

    public Jugador() {
    }

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Jugador nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Jugador)) {
            return false;
        }
        Jugador jugador = (Jugador) o;
        return Objects.equals(nombre, jugador.nombre);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            "}";
    }
    
}
