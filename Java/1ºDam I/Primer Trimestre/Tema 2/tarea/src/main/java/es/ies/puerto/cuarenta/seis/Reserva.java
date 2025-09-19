package es.ies.puerto.cuarenta.seis;
import java.util.Objects;

public class Reserva {
    private String nombre;
    private String hora;

    public Reserva() {
    }

    public Reserva(String nombre, String hora) {
        this.nombre = nombre;
        this.hora = hora;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHora() {
        return this.hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Reserva nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Reserva hora(String hora) {
        setHora(hora);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Reserva)) {
            return false;
        }
        Reserva reserva = (Reserva) o;
        return Objects.equals(nombre, reserva.nombre) && Objects.equals(hora, reserva.hora);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, hora);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", hora='" + getHora() + "'" +
            "}";
    }
    
}
