package es.ies.puerto.cuatro;

public class Producto {

    private int id;
    private String nombre;
    private float precio;
    private int stock;

    /**
     * Constructor vacio
     */
    public Producto(){}

    /**
     * Este es mi constructor
     * @param id product
     * @param nombre product
     * @param precio product
     * @param stock product
     */
    public Producto(int id, String nombre, float precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }


    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public float getPrecio() {
        return this.precio;
    }
    


    public void actualizarStock(int cantidad) {
        stock += cantidad;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Producto)) {
            return false;
        }
        Producto producto = (Producto) o;
        return id == producto.id;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", precio='" + getPrecio() + "'" +
            ", stock='" + getStock() + "'" +
            "}";
    }


}

