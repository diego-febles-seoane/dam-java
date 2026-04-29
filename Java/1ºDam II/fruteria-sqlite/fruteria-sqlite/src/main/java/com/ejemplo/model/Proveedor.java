package com.ejemplo.model;

public class Proveedor {
    private String cif;
    private String nombre;
    private String telefono;
    private String email;
    private String ciudad;
    private Integer activo;

    public Proveedor() {}

    public Proveedor(String cif, String nombre, String telefono, String email, String ciudad, Integer activo) {
        this.cif = cif;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.ciudad = ciudad;
        this.activo = activo;
    }

    public String getCif() { return cif; }
    public String getNombre() { return nombre; }
    public String getTelefono() { return telefono; }
    public String getEmail() { return email; }
    public String getCiudad() { return ciudad; }
    public Integer getActivo() { return activo; }
    public void setCif(String cif) { this.cif = cif; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public void setEmail(String email) { this.email = email; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }
    public void setActivo(Integer activo) { this.activo = activo; }
}
