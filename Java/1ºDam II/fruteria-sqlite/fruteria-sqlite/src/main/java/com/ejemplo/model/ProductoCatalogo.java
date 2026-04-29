package com.ejemplo.model;

public class ProductoCatalogo {
    private Integer id;
    private String codigo;
    private String nombre;
    private String categoria;
    private String unidadMedida;
    private Double precioCompra;
    private Double precioVenta;
    private Double stockActual;
    private Double stockMinimo;
    private Integer perecedero;
    private Integer activo;
    private String proveedorPrincipal;

    public ProductoCatalogo() {}

    public ProductoCatalogo(Integer id, String codigo, String nombre, String categoria, String unidadMedida, Double precioCompra, Double precioVenta, Double stockActual, Double stockMinimo, Integer perecedero, Integer activo, String proveedorPrincipal) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.unidadMedida = unidadMedida;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stockActual = stockActual;
        this.stockMinimo = stockMinimo;
        this.perecedero = perecedero;
        this.activo = activo;
        this.proveedorPrincipal = proveedorPrincipal;
    }

    public Integer getId() { return id; }
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public String getCategoria() { return categoria; }
    public String getUnidadMedida() { return unidadMedida; }
    public Double getPrecioCompra() { return precioCompra; }
    public Double getPrecioVenta() { return precioVenta; }
    public Double getStockActual() { return stockActual; }
    public Double getStockMinimo() { return stockMinimo; }
    public Integer getPerecedero() { return perecedero; }
    public Integer getActivo() { return activo; }
    public String getProveedorPrincipal() { return proveedorPrincipal; }
    public void setId(Integer id) { this.id = id; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public void setUnidadMedida(String unidadMedida) { this.unidadMedida = unidadMedida; }
    public void setPrecioCompra(Double precioCompra) { this.precioCompra = precioCompra; }
    public void setPrecioVenta(Double precioVenta) { this.precioVenta = precioVenta; }
    public void setStockActual(Double stockActual) { this.stockActual = stockActual; }
    public void setStockMinimo(Double stockMinimo) { this.stockMinimo = stockMinimo; }
    public void setPerecedero(Integer perecedero) { this.perecedero = perecedero; }
    public void setActivo(Integer activo) { this.activo = activo; }
    public void setProveedorPrincipal(String proveedorPrincipal) { this.proveedorPrincipal = proveedorPrincipal; }
}
