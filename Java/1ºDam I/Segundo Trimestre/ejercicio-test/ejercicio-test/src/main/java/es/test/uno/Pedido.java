package es.test.uno;

public class Pedido {
    private int id;
    private double precio;
    private String cliente;

    public Pedido(int id, double precio, String cliente) {
        if (id < 0 || precio <= 0 || cliente == null || cliente.isEmpty()) {
            throw new IllegalArgumentException("Detalles del pedido inválidos");
        }
        this.id = id;
        this.precio = precio;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCliente() {
        return cliente;
    }
}

