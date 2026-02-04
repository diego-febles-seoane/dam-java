package com.docencia.clases.ejercicio1;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;


public class RegistroUsuario {

    private final String email;
    private final String password;
    private final String telefono;
    private final LocalDate fechaNacimiento;
    private final LocalDateTime fechaRegistro;

    public RegistroUsuario(String email, String password, String telefono, LocalDate fechaNacimiento) {
        this(email, password, telefono, fechaNacimiento, Clock.systemDefaultZone());
    }

    public RegistroUsuario(String email, String password, String telefono, LocalDate fechaNacimiento, Clock clock) {
        this.email = email;
        this.password = password;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaRegistro = LocalDateTime.now(clock);
    }

    public void validate(int edadMinima) {
        throw new UnsupportedOperationException("TODO");
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getTelefono() {
        return telefono;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

   
}
