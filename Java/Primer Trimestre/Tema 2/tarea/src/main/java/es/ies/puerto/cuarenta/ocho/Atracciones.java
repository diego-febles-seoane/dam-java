package es.ies.puerto.cuarenta.ocho;
import java.util.Objects;

public class Atracciones {
    private String nombre;
    private float precio;

    public Atracciones() {
    }

    public Atracciones(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Atracciones nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Atracciones precio(float precio) {
        setPrecio(precio);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Atracciones)) {
            return false;
        }
        Atracciones atracciones = (Atracciones) o;
        return Objects.equals(nombre, atracciones.nombre) && precio == atracciones.precio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, precio);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", precio='" + getPrecio() + "'" +
            "}";
    }
    
}
