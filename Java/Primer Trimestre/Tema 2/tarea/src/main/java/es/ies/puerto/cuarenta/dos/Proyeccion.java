package es.ies.puerto.cuarenta.dos;
import java.util.Objects;

public class Proyeccion {
    private String ciudad;
    private String fecha;
    private String hora;

    public Proyeccion() {
    }

    public Proyeccion(String ciudad, String fecha, String hora) {
        this.ciudad = ciudad;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return this.hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Proyeccion ciudad(String ciudad) {
        setCiudad(ciudad);
        return this;
    }

    public Proyeccion fecha(String fecha) {
        setFecha(fecha);
        return this;
    }

    public Proyeccion hora(String hora) {
        setHora(hora);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Proyeccion)) {
            return false;
        }
        Proyeccion proyeccion = (Proyeccion) o;
        return Objects.equals(ciudad, proyeccion.ciudad) && Objects.equals(fecha, proyeccion.fecha) && Objects.equals(hora, proyeccion.hora);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ciudad, fecha, hora);
    }

    @Override
    public String toString() {
        return "{" +
            " ciudad='" + getCiudad() + "'" +
            ", fecha='" + getFecha() + "'" +
            ", hora='" + getHora() + "'" +
            "}";
    }
    
}
