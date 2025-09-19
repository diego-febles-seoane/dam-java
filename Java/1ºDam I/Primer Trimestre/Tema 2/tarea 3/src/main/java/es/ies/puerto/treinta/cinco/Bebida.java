package es.ies.puerto.treinta.cinco;
import java.util.Objects;
/**
 * Crea una clase Bebida con atributos nombre, precio y tamaño. 
 * Implementa métodos para comparar bebidas por su tamaño con equals() y usar toString() para mostrar detalles.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Bebida {
    private String nombre;
    private double precio;
    private String tamaño;
    /*
     * Constructor por defecto
     */
    public Bebida() {
    }
    /*
     * Constructor con parámetros
     */
    public Bebida(String nombre, double precio, String tamaño) {
        this.nombre = nombre;
        this.precio = precio;
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getTamaño() {
        return this.tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public Bebida nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Bebida tamaño(String tamaño) {
        setTamaño(tamaño);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Bebida)) {
            return false;
        }
        Bebida bebida = (Bebida) o;
        return Objects.equals(tamaño, bebida.tamaño);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, precio, tamaño);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", precio='" + getPrecio() + "'" +
            ", tamaño='" + getTamaño() + "'" +
            "}";
    }
    
}
