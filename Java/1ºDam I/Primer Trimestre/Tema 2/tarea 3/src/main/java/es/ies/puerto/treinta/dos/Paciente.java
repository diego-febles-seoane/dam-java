package es.ies.puerto.treinta.dos;
import java.util.Objects;

public class Paciente {
    private String nombre;
    private String dni;
    private int edad;

    public Paciente() {
    }

    public Paciente(String nombre, String dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Paciente nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Paciente dni(String dni) {
        setDni(dni);
        return this;
    }

    public Paciente edad(int edad) {
        setEdad(edad);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Paciente)) {
            return false;
        }
        Paciente paciente = (Paciente) o;
        return Objects.equals(nombre, paciente.nombre) && Objects.equals(dni, paciente.dni) && edad == paciente.edad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, dni, edad);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", dni='" + getDni() + "'" +
            ", edad='" + getEdad() + "'" +
            "}";
    }
    
}
