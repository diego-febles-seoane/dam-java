package es.ies.puerto.cuarenta.cincuenta;
import java.util.Objects;

public class Pacientes {
    private String nombre;

    public Pacientes() {
    }

    public Pacientes(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pacientes nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pacientes)) {
            return false;
        }
        Pacientes pacientes = (Pacientes) o;
        return Objects.equals(nombre, pacientes.nombre);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            "}";
    }
    
}
