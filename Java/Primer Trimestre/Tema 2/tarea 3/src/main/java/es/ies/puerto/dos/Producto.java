package es.ies.puerto.dos;

import java.util.Objects;

public class Producto {
    private String id;
    private String nombre;
    private float precio;
    private int cantidad;

    /**
     * Constructor por defecto
     * 
     */
    public Producto() {
    }

    /**
     * Constructor general
     * 
     * @param id       de el producto
     * @param nombre   de el producto
     * @param precio   de el producto
     * @param cantidad de el producto
     */

    public Producto(String id, String nombre, float precio, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Producto)) {
            return false;
        }
        Producto producto = (Producto) o;
        return this.id.equals(producto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, precio, cantidad);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", nombre='" + getNombre() + "'" +
                ", precio='" + getPrecio() + "'" +
                ", cantidad='" + getCantidad() + "'" +
                "}";
    }

}
