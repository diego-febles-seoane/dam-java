package es.ies.puerto.veinte.dos;
import java.util.Objects;
/**
 * Crea una clase Articulo con atributos nombre, precio, y stock. Implementa métodos aumentarStock() y disminuirStock(). 
 * Usa equals() para comparar artículos por su nombre y toString() para mostrar su información.
 * @author emsantamaria
 * @version 1.0.0
 */
public class Articulo {
    private String nombre;
    private float precio;
    private int stock;

    /**
     * Constructor vacio por defecto
     */
    public Articulo() {}

    /**
     * Constructor con nombre, precio y stock
     * @param nombre
     * @param precio
     * @param stock
     */
    public Articulo(String nombre, float precio, int stock) {
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
        this.precio = precio;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Articulo nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Articulo precio(float precio) {
        setPrecio(precio);
        return this;
    }

    public Articulo stock(int stock) {
        setStock(stock);
        return this;
    }
    /**
     * Metodo para aumentar el stock
     * @param aumentarStock
     */
    public void aumentarStock(int aumentarStock) {
        this.stock += aumentarStock;
    }
    /**
     * Metodo para disminuir el stock
     * @param disminuirStock
     */
    public void disminuirStock(int disminuirStock){
        this.stock-=disminuirStock;
    }
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Articulo)) {
            return false;
        }
        Articulo articulo = (Articulo) o;
        return Objects.equals(nombre, articulo.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, precio, stock);
    }

    @Override
    public String toString() {
        return "Articulo{" +
            " Nombre='" + getNombre() + "'" +
            ", Precio='" + getPrecio() + "'" +
            ", Stock='" + getStock() + "'" +
            "}";
    }
    
}
