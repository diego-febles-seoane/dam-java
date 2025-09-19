package es.ies.puerto.cuarenta.nueve;
import java.util.Objects;

public class Profesor {
    private String nombre;
    private String asigmnatura;

    public Profesor() {
    }

    public Profesor(String nombre, String asigmnatura) {
        this.nombre = nombre;
        this.asigmnatura = asigmnatura;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAsigmnatura() {
        return this.asigmnatura;
    }

    public void setAsigmnatura(String asigmnatura) {
        this.asigmnatura = asigmnatura;
    }

    public Profesor nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Profesor asigmnatura(String asigmnatura) {
        setAsigmnatura(asigmnatura);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Profesor)) {
            return false;
        }
        Profesor profesor = (Profesor) o;
        return Objects.equals(nombre, profesor.nombre) && Objects.equals(asigmnatura, profesor.asigmnatura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, asigmnatura);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", asigmnatura='" + getAsigmnatura() + "'" +
            "}";
    }
    
}
