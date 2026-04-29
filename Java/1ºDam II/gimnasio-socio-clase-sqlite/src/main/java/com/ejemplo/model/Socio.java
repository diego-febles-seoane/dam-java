package com.ejemplo.model;

public class Socio {
    private final Integer id;
    private final String dni;
    private final String nombre;
    private final String email;
    private final String telefono;
    private final String plan;
    private final Integer activo;

    public Socio(Integer id, String dni, String nombre, String email, String telefono, String plan, Integer activo) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.plan = plan;
        this.activo = activo;
    }

    public Integer getId() {
        return id;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getPlan() {
        return plan;
    }

    public Integer getActivo() {
        return activo;
    }
}
