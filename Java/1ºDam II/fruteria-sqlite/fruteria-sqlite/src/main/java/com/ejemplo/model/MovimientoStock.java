package com.ejemplo.model;

public class MovimientoStock {
    private Integer id;
    private String fecha;
    private Integer idProducto;
    private String tipo;
    private Double cantidad;
    private String referencia;
    private String observaciones;

    public MovimientoStock() {}

    public MovimientoStock(Integer id, String fecha, Integer idProducto, String tipo, Double cantidad, String referencia, String observaciones) {
        this.id = id;
        this.fecha = fecha;
        this.idProducto = idProducto;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.referencia = referencia;
        this.observaciones = observaciones;
    }

    public Integer getId() { return id; }
    public String getFecha() { return fecha; }
    public Integer getIdProducto() { return idProducto; }
    public String getTipo() { return tipo; }
    public Double getCantidad() { return cantidad; }
    public String getReferencia() { return referencia; }
    public String getObservaciones() { return observaciones; }
    public void setId(Integer id) { this.id = id; }
    public void setFecha(String fecha) { this.fecha = fecha; }
    public void setIdProducto(Integer idProducto) { this.idProducto = idProducto; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public void setCantidad(Double cantidad) { this.cantidad = cantidad; }
    public void setReferencia(String referencia) { this.referencia = referencia; }
    public void setObservaciones(String observaciones) { this.observaciones = observaciones; }
}
