package es.ies.puerto.treinta.seis;
import java.util.Objects;

public class Moneda {
    private String nombre;

    public Moneda() {
    }

    public Moneda(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Moneda nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Moneda)) {
            return false;
        }
        Moneda moneda = (Moneda) o;
        return Objects.equals(nombre, moneda.nombre);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            "}";
    }
    
}
