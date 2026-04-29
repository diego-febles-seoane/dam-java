package com.ejemplo.model;

public class Compra {
    private Integer id;
    private String fecha;
    private String numeroFactura;
    private String cifProveedor;
    private Double subtotal;
    private Double iva;
    private Double total;
    private String estado;
    private String observaciones;

    public Compra() {}

    public Compra(Integer id, String fecha, String numeroFactura, String cifProveedor, Double subtotal, Double iva, Double total, String estado, String observaciones) {
        this.id = id;
        this.fecha = fecha;
        this.numeroFactura = numeroFactura;
        this.cifProveedor = cifProveedor;
        this.subtotal = subtotal;
        this.iva = iva;
        this.total = total;
        this.estado = estado;
        this.observaciones = observaciones;
    }

    public Integer getId() { return id; }
    public String getFecha() { return fecha; }
    public String getNumeroFactura() { return numeroFactura; }
    public String getCifProveedor() { return cifProveedor; }
    public Double getSubtotal() { return subtotal; }
    public Double getIva() { return iva; }
    public Double getTotal() { return total; }
    public String getEstado() { return estado; }
    public String getObservaciones() { return observaciones; }
    public void setId(Integer id) { this.id = id; }
    public void setFecha(String fecha) { this.fecha = fecha; }
    public void setNumeroFactura(String numeroFactura) { this.numeroFactura = numeroFactura; }
    public void setCifProveedor(String cifProveedor) { this.cifProveedor = cifProveedor; }
    public void setSubtotal(Double subtotal) { this.subtotal = subtotal; }
    public void setIva(Double iva) { this.iva = iva; }
    public void setTotal(Double total) { this.total = total; }
    public void setEstado(String estado) { this.estado = estado; }
    public void setObservaciones(String observaciones) { this.observaciones = observaciones; }
}
