package es.ies.puerto.treinta.cuatro;
import java.util.Objects;

public class Plato {
    private String nombre;

    public Plato() {
    }

    public Plato(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Plato nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Plato)) {
            return false;
        }
        Plato plato = (Plato) o;
        return Objects.equals(nombre, plato.nombre);
    }

   
    @Override
    public String toString() {
        return "{" +
            " nombre='" + nombre+ "'" +
            "}";
    }
    
}
