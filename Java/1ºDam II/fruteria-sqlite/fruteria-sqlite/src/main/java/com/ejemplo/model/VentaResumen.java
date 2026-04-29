package com.ejemplo.model;

public class VentaResumen {
    private Integer id;
    private String ticket;
    private String fecha;
    private String cliente;
    private String metodoPago;
    private Double total;
    private String estado;

    public VentaResumen() {}

    public VentaResumen(Integer id, String ticket, String fecha, String cliente, String metodoPago, Double total, String estado) {
        this.id = id;
        this.ticket = ticket;
        this.fecha = fecha;
        this.cliente = cliente;
        this.metodoPago = metodoPago;
        this.total = total;
        this.estado = estado;
    }

    public Integer getId() { return id; }
    public String getTicket() { return ticket; }
    public String getFecha() { return fecha; }
    public String getCliente() { return cliente; }
    public String getMetodoPago() { return metodoPago; }
    public Double getTotal() { return total; }
    public String getEstado() { return estado; }
    public void setId(Integer id) { this.id = id; }
    public void setTicket(String ticket) { this.ticket = ticket; }
    public void setFecha(String fecha) { this.fecha = fecha; }
    public void setCliente(String cliente) { this.cliente = cliente; }
    public void setMetodoPago(String metodoPago) { this.metodoPago = metodoPago; }
    public void setTotal(Double total) { this.total = total; }
    public void setEstado(String estado) { this.estado = estado; }
}
