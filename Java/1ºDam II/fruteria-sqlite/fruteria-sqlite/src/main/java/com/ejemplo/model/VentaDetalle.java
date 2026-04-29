package com.ejemplo.model;

public class VentaDetalle {
    private Integer id;
    private Integer idVenta;
    private Integer idProducto;
    private Double cantidad;
    private Double precioUnitario;
    private Double descuento;
    private Double totalLinea;

    public VentaDetalle() {}

    public VentaDetalle(Integer id, Integer idVenta, Integer idProducto, Double cantidad, Double precioUnitario, Double descuento, Double totalLinea) {
        this.id = id;
        this.idVenta = idVenta;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.descuento = descuento;
        this.totalLinea = totalLinea;
    }

    public Integer getId() { return id; }
    public Integer getIdVenta() { return idVenta; }
    public Integer getIdProducto() { return idProducto; }
    public Double getCantidad() { return cantidad; }
    public Double getPrecioUnitario() { return precioUnitario; }
    public Double getDescuento() { return descuento; }
    public Double getTotalLinea() { return totalLinea; }
    public void setId(Integer id) { this.id = id; }
    public void setIdVenta(Integer idVenta) { this.idVenta = idVenta; }
    public void setIdProducto(Integer idProducto) { this.idProducto = idProducto; }
    public void setCantidad(Double cantidad) { this.cantidad = cantidad; }
    public void setPrecioUnitario(Double precioUnitario) { this.precioUnitario = precioUnitario; }
    public void setDescuento(Double descuento) { this.descuento = descuento; }
    public void setTotalLinea(Double totalLinea) { this.totalLinea = totalLinea; }
}
