package com.docencia.examen.clases;

//TODO: Completar clase Usuario con las funciones necesarias, y documenta la clase.
public class Usuario {

    private String identificador;
    private String nombre;
    private String apellidos;

    public Usuario() {
    }

    public Usuario(String identificador) {
        this.identificador = identificador;
    }

    @Override
    public int hashCode() {
        return identificador != null ? identificador.hashCode() : 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Usuario usuario = (Usuario) obj;
        return java.util.Objects.equals(identificador, usuario.identificador);
    }

    public Usuario(String identificador, String nombre, String apellidos) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

}
