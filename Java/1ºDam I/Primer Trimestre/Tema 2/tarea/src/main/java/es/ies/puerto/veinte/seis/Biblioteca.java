package es.ies.puerto.veinte.seis;
import java.util.Objects;
/**
 * Crea una clase Biblioteca que almacene una lista (array) (array) de libros (clase Libro). Implementa métodos para agregar libros, eliminar libros y listar todos los libros. 
 * Usa toString() para describir la biblioteca.
 * @author emsantamaria
 * @version 1.0.0
 */
public class Biblioteca {
    private Libro[] libros;
    private int numLibros;
    public Biblioteca(){

    }
    public Biblioteca(int numLibros){
        this.libros = new Libro[numLibros];
        this.numLibros = 0;
    }
    /**
     * Método para agregar un libro de la biblioteca
     * @param agregarLibro
     */
    public boolean agregarLibro(Libro libro){
        if(numLibros<libros.length){
            libros[numLibros]=libro;
            numLibros++;
            return true;
        }
        return false;
    }
    /**
     * Metodo para eliminar un libro de la biblioteca
     * @param eliminarLibro
     */
    public boolean eliminarLibro(Libro libro){
        for (int i = 0; i < libros.length; i++) {
            if(libros[i].equals(libro)){
                libros[i]=null;
                numLibros--;
            }
            if(libros[i]==null){
                libros[i]=libros[i+numLibros];
            }
        }
        return true;
    }
    public Libro[] getLibros() {
        return this.libros;
    }

    public void setLibros(Libro[] libros) {
        this.libros = libros;
    }

    public int getNumLibros() {
        return this.numLibros;
    }

    public void setNumLibros(int numLibros) {
        this.numLibros = numLibros;
    }

    public Biblioteca libros(Libro[] libros) {
        setLibros(libros);
        return this;
    }

    public Biblioteca numLibros(int numLibros) {
        setNumLibros(numLibros);
        return this;
    }
    /**
     * Equals para comprobar si dos bibliotecas son iguales según su lista de libros y número de libros.
     * 
     */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Biblioteca)) {
            return false;
        }
        Biblioteca biblioteca = (Biblioteca) o;
        return Objects.equals(libros, biblioteca.libros) && numLibros == biblioteca.numLibros;
    }

    @Override
    public int hashCode() {
        return Objects.hash(libros, numLibros);
    }

    @Override
    public String toString() {
        String mensaje="";
        for (int i = 0; i < libros.length; i++) {
            if(libros[i]!=null){
                 mensaje +=libros[i];
            }
           
        }
        return "{" +
            " NumLibros:'" + getNumLibros() + "'" +
            "}/"+mensaje;
    }
    
}
