package com.ejemplo.model;

public class Cliente {
    private String dni;
    private String nombre;
    private String telefono;
    private String email;
    private String ciudad;
    private Integer activo;

    public Cliente() {}

    public Cliente(String dni, String nombre, String telefono, String email, String ciudad, Integer activo) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.ciudad = ciudad;
        this.activo = activo;
    }

    public String getDni() { return dni; }
    public String getNombre() { return nombre; }
    public String getTelefono() { return telefono; }
    public String getEmail() { return email; }
    public String getCiudad() { return ciudad; }
    public Integer getActivo() { return activo; }
    public void setDni(String dni) { this.dni = dni; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public void setEmail(String email) { this.email = email; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }
    public void setActivo(Integer activo) { this.activo = activo; }
}
