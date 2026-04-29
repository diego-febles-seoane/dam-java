package com.ejemplo.model;

public class Venta {
    private Integer id;
    private String fecha;
    private String ticket;
    private String dniCliente;
    private String metodoPago;
    private Double subtotal;
    private Double descuentoTotal;
    private Double iva;
    private Double total;
    private String estado;

    public Venta() {}

    public Venta(Integer id, String fecha, String ticket, String dniCliente, String metodoPago, Double subtotal, Double descuentoTotal, Double iva, Double total, String estado) {
        this.id = id;
        this.fecha = fecha;
        this.ticket = ticket;
        this.dniCliente = dniCliente;
        this.metodoPago = metodoPago;
        this.subtotal = subtotal;
        this.descuentoTotal = descuentoTotal;
        this.iva = iva;
        this.total = total;
        this.estado = estado;
    }

    public Integer getId() { return id; }
    public String getFecha() { return fecha; }
    public String getTicket() { return ticket; }
    public String getDniCliente() { return dniCliente; }
    public String getMetodoPago() { return metodoPago; }
    public Double getSubtotal() { return subtotal; }
    public Double getDescuentoTotal() { return descuentoTotal; }
    public Double getIva() { return iva; }
    public Double getTotal() { return total; }
    public String getEstado() { return estado; }
    public void setId(Integer id) { this.id = id; }
    public void setFecha(String fecha) { this.fecha = fecha; }
    public void setTicket(String ticket) { this.ticket = ticket; }
    public void setDniCliente(String dniCliente) { this.dniCliente = dniCliente; }
    public void setMetodoPago(String metodoPago) { this.metodoPago = metodoPago; }
    public void setSubtotal(Double subtotal) { this.subtotal = subtotal; }
    public void setDescuentoTotal(Double descuentoTotal) { this.descuentoTotal = descuentoTotal; }
    public void setIva(Double iva) { this.iva = iva; }
    public void setTotal(Double total) { this.total = total; }
    public void setEstado(String estado) { this.estado = estado; }
}
