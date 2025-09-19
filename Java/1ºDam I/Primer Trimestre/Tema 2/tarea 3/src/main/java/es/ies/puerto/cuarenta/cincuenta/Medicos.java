package es.ies.puerto.cuarenta.cincuenta;
import java.util.Objects;

public class Medicos {
    private String nombre;

    public Medicos() {
    }

    public Medicos(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Medicos nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Medicos)) {
            return false;
        }
        Medicos medicos = (Medicos) o;
        return Objects.equals(nombre, medicos.nombre);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            "}";
    }
    
}
