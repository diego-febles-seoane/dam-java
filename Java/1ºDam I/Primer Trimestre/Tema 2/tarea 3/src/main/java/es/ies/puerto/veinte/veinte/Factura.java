package es.ies.puerto.veinte.veinte;
/**
 * Crea una clase Factura con atributos producto, cantidad y precio. Implementa métodos para calcular el total de la factura y usa toString() para mostrar la información de la factura.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Factura {
    private String producto;
    private int cantidad;
    private double precio;

    public Factura(){}

    public Factura(String producto, int cantidad, double precio) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }


    public String getProducto() {
        return this.producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double total() {
        return this.cantidad * this.precio;
    }


    @Override
    public String toString() {
        return "{" +
            " producto='" + getProducto() + "'" +
            ", cantidad='" + getCantidad() + "'" +
            ", precio='" + getPrecio() + "'" +
            "}";
    }

}
