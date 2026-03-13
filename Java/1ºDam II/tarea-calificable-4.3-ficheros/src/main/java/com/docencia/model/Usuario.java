package com.docencia.model;

import java.time.LocalDate;
import java.util.Objects;

public class Usuario extends Persona {
    private final String email;
    private String password;
    private int intentosFallidos;
    private boolean bloqueado;
    private final LocalDate fechaRegistro;

    public Usuario(int id) {
        super(id);
        email = null;
        fechaRegistro = null;
    }

    public Usuario(String email) {
        super(0);
        this.email = email;
        this.fechaRegistro = null;
    }



    /**
     * Constructor de la clase
     * @param id identificador del Usuario
     * @param email email unico del Usuario
     * @param nombre nombre del Usuario
     * @param password password del Usuario
     */
    public Usuario(int id, String email, String nombre,  
            String password) {
        super(id,nombre);
        this.email = email;
        this.password = password;
        this.intentosFallidos = 0;
        this.bloqueado = false;
        this.fechaRegistro = LocalDate.now();
    }

    public String getEmail() {
        return this.email;
    }


    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIntentosFallidos() {
        return this.intentosFallidos;
    }

    public void setIntentosFallidos(int intentosFallidos) {
        this.intentosFallidos = intentosFallidos;
    }

    public boolean isBloqueado() {
        return this.bloqueado;
    }

    public boolean getBloqueado() {
        return this.bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    public LocalDate getFechaRegistro() {
        return this.fechaRegistro;
    }



    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (!(o instanceof Usuario)) {
            return false;
        }
        Usuario usuario = (Usuario) o;
        if (email == null || usuario.getEmail()== null) {
            return false;
        }
        return Objects.equals(email, usuario.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    @Override
    public String toString() {
        return " { id = " + getId() + ", nombre= '"+getNombre()+"'"+
            " email='" + getEmail() + "'" +
            ", password='" + getPassword() + "'" +
            ", intentosFallidos='" + getIntentosFallidos() + "'" +
            ", bloqueado='" + isBloqueado() + "'" +
            ", fechaRegistro='" + getFechaRegistro() + "'" +
            "}";
    }

    
    public String toCsv() {
        return this.getId() +";"+ this.getEmail() +";"+ this.getNombre() +";"+ this.getPassword();
    }
    

}
