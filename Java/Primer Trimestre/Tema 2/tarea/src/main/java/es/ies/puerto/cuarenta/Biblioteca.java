package es.ies.puerto.cuarenta;
import java.util.Objects;
/**
 * Crea una clase BibliotecaDigital que almacene una lista (array) de e-books (clase EBook (con las propiedades: nombre isbn, y anio)). 
 * Implementa métodos para agregar, eliminar y buscar libros, y usa toString() para mostrar los detalles de la biblioteca.
 * @author emsantamaria
 * @version 1.0.0
 */
public class Biblioteca {
    private int numLibros;
    private Libro[]libros;
    /**
     * Constructor vacio
     */
    public Biblioteca(){}
    /**
     * Constructor con numero de libros
     * @param numLibros
     */
    public Biblioteca(int numLibros){
        this.numLibros=0;
        this.libros=new Libro[numLibros];
    }
    /**
     * Metodo para añadir libros
     * @param addLibro
     */
    public boolean addLibro(Libro libro){
        if(numLibros<libros.length){
            libros[numLibros]=libro;
            numLibros++;
            return true;
        }
        return false;
    }
    /**
     * Metodo para eliminar libros
     * @param deleteLibro
     */
    public boolean deleteLibro(Libro libro){
        for (int i = 0; i < libros.length; i++) {
            if(libros[i].equals(libro)){
                libros[i]=null;
                for (int j = i; j < libros.length-1; j++) {
                    libros[j]=libros[j+1];
                    libros[libros.length-1]=null;
                }
                numLibros--;
                return true;
            }
            
        }
        return false;
    }
    /**
     * Metodo para buscar libros
     * @param buscarLibro
     */
    public void buscarLibro(String isbn) {
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null && libros[i].getIsbn().equals(isbn)) {
                Libro libroEncontrado = libros[i];
                Libro libro=libroEncontrado;
            }
        }
    }

    public Biblioteca(int numLibros, Libro[] libros) {
        this.numLibros = numLibros;
        this.libros = libros;
    }

    public int getNumLibros() {
        return this.numLibros;
    }

    public void setNumLibros(int numLibros) {
        this.numLibros = numLibros;
    }

    public Libro[] getLibros() {
        return this.libros;
    }

    public void setLibros(Libro[] libros) {
        this.libros = libros;
    }

    public Biblioteca numLibros(int numLibros) {
        setNumLibros(numLibros);
        return this;
    }

    public Biblioteca libros(Libro[] libros) {
        setLibros(libros);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Biblioteca)) {
            return false;
        }
        Biblioteca biblioteca = (Biblioteca) o;
        return numLibros == biblioteca.numLibros && Objects.equals(libros, biblioteca.libros);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numLibros, libros);
    }

    @Override
    public String toString() {
        String mensaje="";
        for (int i = 0; i < libros.length; i++) {
            if(libros[i]!=null){
                mensaje+=libros[i];
            }
        }
        return "{" +
            " numLibros='" + getNumLibros() + "'" +
            "}"+mensaje;
    }
    
}
