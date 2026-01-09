package com.docencia.clases.ejercicio9;

import java.util.Objects;

public class Curso {
    private String codigo;
    private String nombre;
    private int creditos;

    public Curso() {
        // TODO: constructor vacío (dejar valores por defecto o inicializar si lo necesitas)
    }

    public Curso(String codigo) {
        // TODO: constructor con identificador único
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    @Override
    public boolean equals(Object o) {
        // TODO: implementar equals comparando SOLO el identificador único (codigo)
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        // TODO: implementar hashCode consistente con equals (usar SOLO el identificador único)
        return super.hashCode();
    }

    @Override
    public String toString() {
        // TODO: implementar toString legible incluyendo al menos el identificador único
        return super.toString();
    }
}
