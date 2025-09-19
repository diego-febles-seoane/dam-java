package es.ies.puerto.dos;

/**
 * Crea una clase Producto con los atributos id, nombre y precio, y cantidad. 
 * Implementa el método equals() para comparar dos productos según su nombre y precio, y también toString() para mostrar su información.
 * @author emsantamaria
 * @version 1.0.0
 */
public class Producto {
    private String id;
    private String nombre;
    private float precio;
    private int cantidad;

    /**
     * Constructor por defecto
     */
    public Producto() {
    }
    /**
     * Constructor del Producto
     * @param id
     * @param nombre
     * @param precio
     * @param cantidad
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

    public float getPrecio() {
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
    public boolean equals(Object obj) {
        if (this == obj) return true;                 
        if (obj == null || getClass() != obj.getClass()) return false; 
        
        Producto otroProducto = (Producto) obj;       
        return nombre.equals(otroProducto.nombre) && precio==otroProducto.precio;
    }
    @Override
    public String toString() {
        return "{" +
            " Id='" + getId() + "'" +
            ", Nombre='" + getNombre() + "'" +
            ", Precio='" + getPrecio() + "'" +
            ", Cantidad='" + getCantidad() + "'" +
            "}";
    }

    }

