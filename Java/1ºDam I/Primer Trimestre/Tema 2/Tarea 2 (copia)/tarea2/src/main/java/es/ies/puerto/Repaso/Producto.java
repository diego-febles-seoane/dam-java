package es.ies.puerto.Repaso;

import java.util.Objects;

public class Producto {
    int cantidad;
    float precio;
    String nombre;

    public Producto (){}

    public Producto (int cantidad, float precio, String nombre){
        this.cantidad = cantidad;
        this.precio = precio;
        this.nombre = nombre;
    }


    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        return "{" +
            " cantidad='" + getCantidad() + "'" +
            ", precio='" + getPrecio() + "'" +
            ", nombre='" + getNombre() + "'" +
            "}";
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Producto)) {
            return false;
        }
        Producto producto = (Producto) o;
        return cantidad == producto.cantidad && precio == producto.precio && Objects.equals(nombre, producto.nombre);
    }
}
