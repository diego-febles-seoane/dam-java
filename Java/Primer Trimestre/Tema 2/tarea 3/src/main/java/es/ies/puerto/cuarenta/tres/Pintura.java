package es.ies.puerto.cuarenta.tres;
import java.util.Objects;

public class Pintura {
    private int anio;
    private String autor;
    private float precio;

    public Pintura() {
    }

    public Pintura(int anio, String autor, float precio) {
        this.anio = anio;
        this.autor = autor;
        this.precio = precio;
    }

    public int getAnio() {
        return this.anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Pintura anio(int anio) {
        setAnio(anio);
        return this;
    }

    public Pintura autor(String autor) {
        setAutor(autor);
        return this;
    }

    public Pintura precio(float precio) {
        setPrecio(precio);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pintura)) {
            return false;
        }
        Pintura pintura = (Pintura) o;
        return anio == pintura.anio && Objects.equals(autor, pintura.autor) && precio == pintura.precio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(anio, autor, precio);
    }

    @Override
    public String toString() {
        return "{" +
            " anio='" + getAnio() + "'" +
            ", autor='" + getAutor() + "'" +
            ", precio='" + getPrecio() + "'" +
            "}";
    }
    
}
