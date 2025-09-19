package es.ies.puerto.cuarenta.cuatro;
import java.util.Objects;

public class Destinos {
    private String pais;
    private String ciudad;
    private String fecha;

    public Destinos() {
    }

    public Destinos(String pais, String ciudad, String fecha) {
        this.pais = pais;
        this.ciudad = ciudad;
        this.fecha = fecha;
    }

    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
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

    public Destinos pais(String pais) {
        setPais(pais);
        return this;
    }

    public Destinos ciudad(String ciudad) {
        setCiudad(ciudad);
        return this;
    }

    public Destinos fecha(String fecha) {
        setFecha(fecha);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Destinos)) {
            return false;
        }
        Destinos destinos = (Destinos) o;
        return Objects.equals(pais, destinos.pais) && Objects.equals(ciudad, destinos.ciudad) && Objects.equals(fecha, destinos.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pais, ciudad, fecha);
    }

    @Override
    public String toString() {
        return "{" +
            " pais='" + getPais() + "'" +
            ", ciudad='" + getCiudad() + "'" +
            ", fecha='" + getFecha() + "'" +
            "}";
    }
    
}
