package com.docencia.clases.ejercicio7;
import java.util.Objects;

public class Pelicula {
    private String codigo;
    private String titulo;
    private int duracionMin;

    /**
     * Constructor vacio
     */
    public Pelicula() {
        //this.duracionMin = 90;
    }
    
    /**
     * Constructor por defecto
     * @param codigo de pelicula
     * @param titulo de la pelicula
     * @param duracionMin de la pelicula
     */
    public Pelicula(String codigo, String titulo, int duracionMin) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.duracionMin = duracionMin;
    }  

    /**
     * Constructor con el atributo codigo
     * @param codigo de pelicula
     */
    public Pelicula(String codigo) {
        setCodigo(codigo);
    }    


    /**
     * Getters y Setters
     * @return codigo, titulo, duracionMin
     */
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.isBlank()){
            throw new IllegalArgumentException("Soy el error");
        }
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracionMin() {
        return duracionMin;
    }

    public void setDuracionMin(int duracionMin) {
        this.duracionMin = duracionMin;
    }

    /**
     * Metodo Equals
     */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pelicula)) {
            return false;
        }
        Pelicula pelicula = (Pelicula) o;
        return Objects.equals(codigo, pelicula.codigo);
    }

    /**
     * Metodo Hashcode
     */
    @Override
    public int hashCode() {
        return Objects.hash(codigo, titulo, duracionMin);
    }

    /**
     * Metodo toString
     */
    @Override
    public String toString() {
        return "{" +
            " codigo='" + getCodigo() + "'" +
            ", titulo='" + getTitulo() + "'" +
            ", duracionMin='" + getDuracionMin() + "'" +
            "}";
    }
    
}
