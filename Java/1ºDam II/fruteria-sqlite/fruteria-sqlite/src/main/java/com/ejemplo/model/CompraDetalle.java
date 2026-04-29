package com.ejemplo.model;

public class CompraDetalle {
    private Integer id;
    private Integer idCompra;
    private Integer idProducto;
    private Double cantidad;
    private Double precioUnitario;
    private Double descuento;
    private Double totalLinea;

    public CompraDetalle() {}

    public CompraDetalle(Integer id, Integer idCompra, Integer idProducto, Double cantidad, Double precioUnitario, Double descuento, Double totalLinea) {
        this.id = id;
        this.idCompra = idCompra;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.descuento = descuento;
        this.totalLinea = totalLinea;
    }

    public Integer getId() { return id; }
    public Integer getIdCompra() { return idCompra; }
    public Integer getIdProducto() { return idProducto; }
    public Double getCantidad() { return cantidad; }
    public Double getPrecioUnitario() { return precioUnitario; }
    public Double getDescuento() { return descuento; }
    public Double getTotalLinea() { return totalLinea; }
    public void setId(Integer id) { this.id = id; }
    public void setIdCompra(Integer idCompra) { this.idCompra = idCompra; }
    public void setIdProducto(Integer idProducto) { this.idProducto = idProducto; }
    public void setCantidad(Double cantidad) { this.cantidad = cantidad; }
    public void setPrecioUnitario(Double precioUnitario) { this.precioUnitario = precioUnitario; }
    public void setDescuento(Double descuento) { this.descuento = descuento; }
    public void setTotalLinea(Double totalLinea) { this.totalLinea = totalLinea; }
}
