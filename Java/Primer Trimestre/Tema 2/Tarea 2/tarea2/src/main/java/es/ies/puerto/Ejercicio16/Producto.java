package es.ies.puerto.Ejercicio16;

public class Producto {
    private String nombre;
    private float precio;
    private int stock;

    public Producto() {

    }

    public Producto(String nombre, float precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
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
        if (precio < 0) {
            this.precio = 0;
        } else {
            this.precio = precio;
        }
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            this.stock = 0;
        } else {
            this.stock = stock;
        }
    }

    @Override
    public String toString() {
        return "{" +
                " nombre='" + getNombre() + "'" +
                ", precio='" + getPrecio() + "'" +
                ", stock='" + getStock() + "'" +
                "}";
    }

    // Ejercicio 16
    public double vender(int unidades) {
        stock -= unidades;
        return unidades * precio;
    }
}
