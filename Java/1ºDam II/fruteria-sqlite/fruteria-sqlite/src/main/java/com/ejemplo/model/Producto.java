package com.ejemplo.model;

public class Producto {
    private Integer id;
    private String codigo;
    private String nombre;
    private String unidadMedida;
    private Double precioCompra;
    private Double precioVenta;
    private Double stockActual;
    private Double stockMinimo;
    private Integer perecedero;
    private Integer activo;
    private Integer idCategoria;
    private String cifProveedorPrincipal;

    public Producto() {}

    public Producto(Integer id, String codigo, String nombre, String unidadMedida, Double precioCompra, Double precioVenta, Double stockActual, Double stockMinimo, Integer perecedero, Integer activo, Integer idCategoria, String cifProveedorPrincipal) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.unidadMedida = unidadMedida;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stockActual = stockActual;
        this.stockMinimo = stockMinimo;
        this.perecedero = perecedero;
        this.activo = activo;
        this.idCategoria = idCategoria;
        this.cifProveedorPrincipal = cifProveedorPrincipal;
    }

    public Integer getId() { return id; }
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public String getUnidadMedida() { return unidadMedida; }
    public Double getPrecioCompra() { return precioCompra; }
    public Double getPrecioVenta() { return precioVenta; }
    public Double getStockActual() { return stockActual; }
    public Double getStockMinimo() { return stockMinimo; }
    public Integer getPerecedero() { return perecedero; }
    public Integer getActivo() { return activo; }
    public Integer getIdCategoria() { return idCategoria; }
    public String getCifProveedorPrincipal() { return cifProveedorPrincipal; }
    public void setId(Integer id) { this.id = id; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setUnidadMedida(String unidadMedida) { this.unidadMedida = unidadMedida; }
    public void setPrecioCompra(Double precioCompra) { this.precioCompra = precioCompra; }
    public void setPrecioVenta(Double precioVenta) { this.precioVenta = precioVenta; }
    public void setStockActual(Double stockActual) { this.stockActual = stockActual; }
    public void setStockMinimo(Double stockMinimo) { this.stockMinimo = stockMinimo; }
    public void setPerecedero(Integer perecedero) { this.perecedero = perecedero; }
    public void setActivo(Integer activo) { this.activo = activo; }
    public void setIdCategoria(Integer idCategoria) { this.idCategoria = idCategoria; }
    public void setCifProveedorPrincipal(String cifProveedorPrincipal) { this.cifProveedorPrincipal = cifProveedorPrincipal; }
}
